package net.cinchtail.cinchsmissingblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.advancements.predicates.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.concurrent.CompletableFuture;

public final class ModLootTableProvider extends FabricBlockLootSubProvider {
    public ModLootTableProvider(FabricPackOutput packOutput,
                                CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        ModLootTableGenerator.generate(new ModLootTableGenerator.Context() {
            @Override
            public void dropSelf(Block block) {
                ModLootTableProvider.this.dropSelf(block);
            }

            @Override
            public void dropSlab(Block block) {
                add(block, createSlabItemTable(block));
            }

            @Override
            public void dropWhenSilkTouch(Block block) {
                ModLootTableProvider.this.dropWhenSilkTouch(block);
            }

            @Override
            public void dropSnow(Block block) {
                add(block, value ->
                        createSilkTouchDispatchTable(value, LootItem.lootTableItem(Items.SNOWBALL)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4)))
                                .apply(ApplyExplosionDecay.explosionDecay())));
            }

            @Override
            public void dropSnowSlab(Block block) {
                add(block, value ->
                        LootTable.lootTable().withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(value)
                                        .when(hasSilkTouch())
                                        .when(LootItemBlockStatePropertyCondition
                                                .hasBlockStateProperties(value)
                                                .setProperties(StatePropertiesPredicate.Builder
                                                        .properties()
                                                        .hasProperty(SlabBlock.TYPE, SlabType.DOUBLE)))
                                        .apply(SetItemCountFunction
                                                .setCount(ConstantValue.exactly(2)))
                                        .otherwise(LootItem.lootTableItem(value)
                                                .when(hasSilkTouch()))
                                        .otherwise(LootItem.lootTableItem(Items.SNOWBALL)
                                                .when(doesNotHaveSilkTouch())
                                                .when(LootItemBlockStatePropertyCondition
                                                        .hasBlockStateProperties(value)
                                                        .setProperties(StatePropertiesPredicate.Builder
                                                                .properties()
                                                                .hasProperty(SlabBlock.TYPE,
                                                                        SlabType.DOUBLE)))
                                                .apply(SetItemCountFunction
                                                        .setCount(ConstantValue.exactly(4)))
                                                .apply(ApplyExplosionDecay.explosionDecay()))
                                        .otherwise(LootItem.lootTableItem(Items.SNOWBALL)
                                                .when(doesNotHaveSilkTouch())
                                                .apply(SetItemCountFunction
                                                        .setCount(ConstantValue.exactly(2)))
                                                .apply(ApplyExplosionDecay.explosionDecay())))));
            }
        });
    }
}
