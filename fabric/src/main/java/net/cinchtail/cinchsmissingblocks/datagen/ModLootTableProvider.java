package net.cinchtail.cinchsmissingblocks.datagen;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.advancements.predicates.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
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

public class ModLootTableProvider extends FabricBlockLootSubProvider {
    public ModLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocks.CALCITE_STAIRS);
        add(ModBlocks.CALCITE_SLAB, createSlabItemTable(ModBlocks.CALCITE_SLAB));
        dropSelf(ModBlocks.CALCITE_WALL);
        dropSelf(ModBlocks.POLISHED_CALCITE);
        dropSelf(ModBlocks.POLISHED_CALCITE_STAIRS);
        add(ModBlocks.POLISHED_CALCITE_SLAB, createSlabItemTable(ModBlocks.POLISHED_CALCITE_SLAB));
        dropSelf(ModBlocks.POLISHED_CALCITE_WALL);
        dropSelf(ModBlocks.CALCITE_BRICKS);
        dropSelf(ModBlocks.CALCITE_BRICK_STAIRS);
        add(ModBlocks.CALCITE_BRICK_SLAB, createSlabItemTable(ModBlocks.CALCITE_BRICK_SLAB));
        dropSelf(ModBlocks.CALCITE_BRICK_WALL);
        dropSelf(ModBlocks.CRACKED_CALCITE_BRICKS);
        dropSelf(ModBlocks.CRACKED_CALCITE_BRICK_STAIRS);
        add(ModBlocks.CRACKED_CALCITE_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_CALCITE_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_CALCITE_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_CALCITE_BRICKS);
        dropSelf(ModBlocks.MOSSY_CALCITE_BRICK_STAIRS);
        add(ModBlocks.MOSSY_CALCITE_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_CALCITE_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_CALCITE_BRICK_WALL);
        dropSelf(ModBlocks.CHISELED_CALCITE_BRICKS);
        dropSelf(ModBlocks.CALCITE_BRICK_PILLAR);

        dropSelf(ModBlocks.DRIPSTONE_STAIRS);
        add(ModBlocks.DRIPSTONE_SLAB, createSlabItemTable(ModBlocks.DRIPSTONE_SLAB));
        dropSelf(ModBlocks.DRIPSTONE_WALL);
        dropSelf(ModBlocks.POLISHED_DRIPSTONE);
        dropSelf(ModBlocks.POLISHED_DRIPSTONE_STAIRS);
        add(ModBlocks.POLISHED_DRIPSTONE_SLAB, createSlabItemTable(ModBlocks.POLISHED_DRIPSTONE_SLAB));
        dropSelf(ModBlocks.POLISHED_DRIPSTONE_WALL);
        dropSelf(ModBlocks.DRIPSTONE_BRICKS);
        dropSelf(ModBlocks.DRIPSTONE_BRICK_STAIRS);
        add(ModBlocks.DRIPSTONE_BRICK_SLAB, createSlabItemTable(ModBlocks.DRIPSTONE_BRICK_SLAB));
        dropSelf(ModBlocks.DRIPSTONE_BRICK_WALL);
        dropSelf(ModBlocks.CRACKED_DRIPSTONE_BRICKS);
        dropSelf(ModBlocks.CRACKED_DRIPSTONE_BRICK_STAIRS);
        add(ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_DRIPSTONE_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_DRIPSTONE_BRICKS);
        dropSelf(ModBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS);
        add(ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_DRIPSTONE_BRICK_WALL);
        dropSelf(ModBlocks.CHISELED_DRIPSTONE_BRICKS);
        dropSelf(ModBlocks.DRIPSTONE_BRICK_PILLAR);

        dropSelf(ModBlocks.CRACKED_TUFF_BRICKS);
        dropSelf(ModBlocks.CRACKED_TUFF_BRICK_STAIRS);
        add(ModBlocks.CRACKED_TUFF_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_TUFF_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_TUFF_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_TUFF_BRICKS);
        dropSelf(ModBlocks.MOSSY_TUFF_BRICK_STAIRS);
        add(ModBlocks.MOSSY_TUFF_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_TUFF_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_TUFF_BRICK_WALL);

        dropSelf(ModBlocks.POLISHED_ANDESITE_WALL);
        dropSelf(ModBlocks.ANDESITE_BRICKS);
        dropSelf(ModBlocks.ANDESITE_BRICK_STAIRS);
        add(ModBlocks.ANDESITE_BRICK_SLAB, createSlabItemTable(ModBlocks.ANDESITE_BRICK_SLAB));
        dropSelf(ModBlocks.ANDESITE_BRICK_WALL);
        dropSelf(ModBlocks.CRACKED_ANDESITE_BRICKS);
        dropSelf(ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS);
        add(ModBlocks.CRACKED_ANDESITE_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_ANDESITE_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_ANDESITE_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_ANDESITE_BRICKS);
        dropSelf(ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS);
        add(ModBlocks.MOSSY_ANDESITE_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_ANDESITE_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_ANDESITE_BRICK_WALL);
        dropSelf(ModBlocks.CHISELED_ANDESITE_BRICKS);
        dropSelf(ModBlocks.ANDESITE_BRICK_PILLAR);

        dropSelf(ModBlocks.POLISHED_GRANITE_WALL);
        dropSelf(ModBlocks.GRANITE_BRICKS);
        dropSelf(ModBlocks.GRANITE_BRICK_STAIRS);
        add(ModBlocks.GRANITE_BRICK_SLAB, createSlabItemTable(ModBlocks.GRANITE_BRICK_SLAB));
        dropSelf(ModBlocks.GRANITE_BRICK_WALL);
        dropSelf(ModBlocks.CRACKED_GRANITE_BRICKS);
        dropSelf(ModBlocks.CRACKED_GRANITE_BRICK_STAIRS);
        add(ModBlocks.CRACKED_GRANITE_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_GRANITE_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_GRANITE_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_GRANITE_BRICKS);
        dropSelf(ModBlocks.MOSSY_GRANITE_BRICK_STAIRS);
        add(ModBlocks.MOSSY_GRANITE_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_GRANITE_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_GRANITE_BRICK_WALL);
        dropSelf(ModBlocks.CHISELED_GRANITE_BRICKS);
        dropSelf(ModBlocks.GRANITE_BRICK_PILLAR);

        dropSelf(ModBlocks.POLISHED_DIORITE_WALL);
        dropSelf(ModBlocks.DIORITE_BRICKS);
        dropSelf(ModBlocks.DIORITE_BRICK_STAIRS);
        add(ModBlocks.DIORITE_BRICK_SLAB, createSlabItemTable(ModBlocks.DIORITE_BRICK_SLAB));
        dropSelf(ModBlocks.DIORITE_BRICK_WALL);
        dropSelf(ModBlocks.CRACKED_DIORITE_BRICKS);
        dropSelf(ModBlocks.CRACKED_DIORITE_BRICK_STAIRS);
        add(ModBlocks.CRACKED_DIORITE_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_DIORITE_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_DIORITE_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_DIORITE_BRICKS);
        dropSelf(ModBlocks.MOSSY_DIORITE_BRICK_STAIRS);
        add(ModBlocks.MOSSY_DIORITE_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_DIORITE_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_DIORITE_BRICK_WALL);
        dropSelf(ModBlocks.CHISELED_DIORITE_BRICKS);
        dropSelf(ModBlocks.DIORITE_BRICK_PILLAR);

        dropSelf(ModBlocks.QUARTZ_WALL);
        dropSelf(ModBlocks.SMOOTH_QUARTZ_WALL);
        dropSelf(ModBlocks.QUARTZ_BRICK_STAIRS);
        add(ModBlocks.QUARTZ_BRICK_SLAB, createSlabItemTable(ModBlocks.QUARTZ_BRICK_SLAB));
        dropSelf(ModBlocks.QUARTZ_BRICK_WALL);
        dropSelf(ModBlocks.CRACKED_QUARTZ_BRICKS);
        dropSelf(ModBlocks.CRACKED_QUARTZ_BRICK_STAIRS);
        add(ModBlocks.CRACKED_QUARTZ_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_QUARTZ_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_QUARTZ_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_QUARTZ_BRICKS);
        dropSelf(ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS);
        add(ModBlocks.MOSSY_QUARTZ_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_QUARTZ_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_QUARTZ_BRICK_WALL);

        dropSelf(ModBlocks.CRACKED_BRICKS);
        dropSelf(ModBlocks.CRACKED_BRICK_STAIRS);
        add(ModBlocks.CRACKED_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_BRICKS);
        dropSelf(ModBlocks.MOSSY_BRICK_STAIRS);
        add(ModBlocks.MOSSY_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_BRICK_WALL);
        dropSelf(ModBlocks.CHISELED_BRICKS);

        dropSelf(ModBlocks.PACKED_MUD_STAIRS);
        add(ModBlocks.PACKED_MUD_SLAB, createSlabItemTable(ModBlocks.PACKED_MUD_SLAB));
        dropSelf(ModBlocks.PACKED_MUD_WALL);
        dropSelf(ModBlocks.CRACKED_MUD_BRICKS);
        dropSelf(ModBlocks.CRACKED_MUD_BRICK_STAIRS);
        add(ModBlocks.CRACKED_MUD_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_MUD_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_MUD_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_MUD_BRICKS);
        dropSelf(ModBlocks.MOSSY_MUD_BRICK_STAIRS);
        add(ModBlocks.MOSSY_MUD_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_MUD_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_MUD_BRICK_WALL);
        dropSelf(ModBlocks.CHISELED_MUD_BRICKS);
        dropSelf(ModBlocks.MUD_BRICK_PILLAR);

        dropSelf(ModBlocks.CRACKED_RESIN_BRICKS);
        dropSelf(ModBlocks.CRACKED_RESIN_BRICK_STAIRS);
        add(ModBlocks.CRACKED_RESIN_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_RESIN_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_RESIN_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_RESIN_BRICKS);
        dropSelf(ModBlocks.MOSSY_RESIN_BRICK_STAIRS);
        add(ModBlocks.MOSSY_RESIN_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_RESIN_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_RESIN_BRICK_WALL);

        dropSelf(ModBlocks.SMOOTH_SANDSTONE_WALL);
        dropSelf(ModBlocks.CUT_SANDSTONE_STAIRS);
        dropSelf(ModBlocks.CUT_SANDSTONE_WALL);
        dropSelf(ModBlocks.SANDSTONE_BRICKS);
        dropSelf(ModBlocks.SANDSTONE_BRICK_STAIRS);
        add(ModBlocks.SANDSTONE_BRICK_SLAB, createSlabItemTable(ModBlocks.SANDSTONE_BRICK_SLAB));
        dropSelf(ModBlocks.SANDSTONE_BRICK_WALL);
        dropSelf(ModBlocks.CRACKED_SANDSTONE_BRICKS);
        dropSelf(ModBlocks.CRACKED_SANDSTONE_BRICK_STAIRS);
        add(ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_SANDSTONE_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_SANDSTONE_BRICKS);
        dropSelf(ModBlocks.MOSSY_SANDSTONE_BRICK_STAIRS);
        add(ModBlocks.MOSSY_SANDSTONE_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_SANDSTONE_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_SANDSTONE_BRICK_WALL);
        dropSelf(ModBlocks.SANDSTONE_BRICK_PILLAR);

        dropSelf(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
        dropSelf(ModBlocks.CUT_RED_SANDSTONE_STAIRS);
        dropSelf(ModBlocks.CUT_RED_SANDSTONE_WALL);
        dropSelf(ModBlocks.RED_SANDSTONE_BRICKS);
        dropSelf(ModBlocks.RED_SANDSTONE_BRICK_STAIRS);
        add(ModBlocks.RED_SANDSTONE_BRICK_SLAB, createSlabItemTable(ModBlocks.RED_SANDSTONE_BRICK_SLAB));
        dropSelf(ModBlocks.RED_SANDSTONE_BRICK_WALL);
        dropSelf(ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);
        dropSelf(ModBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS);
        add(ModBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);
        dropSelf(ModBlocks.MOSSY_RED_SANDSTONE_BRICK_STAIRS);
        add(ModBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_RED_SANDSTONE_BRICK_WALL);
        dropSelf(ModBlocks.RED_SANDSTONE_BRICK_PILLAR);

        dropSelf(ModBlocks.CRACKED_CINNABAR_BRICKS);
        dropSelf(ModBlocks.CRACKED_CINNABAR_BRICK_STAIRS);
        add(ModBlocks.CRACKED_CINNABAR_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_CINNABAR_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_CINNABAR_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_CINNABAR_BRICKS);
        dropSelf(ModBlocks.MOSSY_CINNABAR_BRICK_STAIRS);
        add(ModBlocks.MOSSY_CINNABAR_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_CINNABAR_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_CINNABAR_BRICK_WALL);
        dropSelf(ModBlocks.CINNABAR_BRICK_PILLAR);

        dropSelf(ModBlocks.CRACKED_SULFUR_BRICKS);
        dropSelf(ModBlocks.CRACKED_SULFUR_BRICK_STAIRS);
        add(ModBlocks.CRACKED_SULFUR_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_SULFUR_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_SULFUR_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_SULFUR_BRICKS);
        dropSelf(ModBlocks.MOSSY_SULFUR_BRICK_STAIRS);
        add(ModBlocks.MOSSY_SULFUR_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_SULFUR_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_SULFUR_BRICK_WALL);
        dropSelf(ModBlocks.SULFUR_BRICK_PILLAR);

        dropSelf(ModBlocks.END_STONE_STAIRS);
        add(ModBlocks.END_STONE_SLAB, createSlabItemTable(ModBlocks.END_STONE_SLAB));
        dropSelf(ModBlocks.END_STONE_WALL);
        dropSelf(ModBlocks.POLISHED_END_STONE);
        dropSelf(ModBlocks.POLISHED_END_STONE_STAIRS);
        add(ModBlocks.POLISHED_END_STONE_SLAB, createSlabItemTable(ModBlocks.POLISHED_END_STONE_SLAB));
        dropSelf(ModBlocks.POLISHED_END_STONE_WALL);
        dropSelf(ModBlocks.CRACKED_END_STONE_BRICKS);
        dropSelf(ModBlocks.CRACKED_END_STONE_BRICK_STAIRS);
        add(ModBlocks.CRACKED_END_STONE_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_END_STONE_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_END_STONE_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_END_STONE_BRICKS);
        dropSelf(ModBlocks.MOSSY_END_STONE_BRICK_STAIRS);
        add(ModBlocks.MOSSY_END_STONE_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_END_STONE_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_END_STONE_BRICK_WALL);
        dropSelf(ModBlocks.CHISELED_END_STONE_BRICKS);
        dropSelf(ModBlocks.END_STONE_BRICK_PILLAR);

        dropSelf(ModBlocks.STONE_WALL);
        dropSelf(ModBlocks.SMOOTH_STONE_STAIRS);
        dropSelf(ModBlocks.SMOOTH_STONE_WALL);
        dropSelf(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
        add(ModBlocks.CRACKED_STONE_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_STONE_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_STONE_BRICK_WALL);
        dropSelf(ModBlocks.STONE_TILES);
        dropSelf(ModBlocks.STONE_TILE_STAIRS);
        add(ModBlocks.STONE_TILE_SLAB, createSlabItemTable(ModBlocks.STONE_TILE_SLAB));
        dropSelf(ModBlocks.STONE_TILE_WALL);
        dropSelf(ModBlocks.CRACKED_STONE_TILES);
        dropSelf(ModBlocks.CRACKED_STONE_TILE_STAIRS);
        add(ModBlocks.CRACKED_STONE_TILE_SLAB, createSlabItemTable(ModBlocks.CRACKED_STONE_TILE_SLAB));
        dropSelf(ModBlocks.CRACKED_STONE_TILE_WALL);
        dropSelf(ModBlocks.MOSSY_STONE_TILES);
        dropSelf(ModBlocks.MOSSY_STONE_TILE_STAIRS);
        add(ModBlocks.MOSSY_STONE_TILE_SLAB, createSlabItemTable(ModBlocks.MOSSY_STONE_TILE_SLAB));
        dropSelf(ModBlocks.MOSSY_STONE_TILE_WALL);
        dropSelf(ModBlocks.STONE_BRICK_PILLAR);

        dropSelf(ModBlocks.DEEPSLATE_STAIRS);
        add(ModBlocks.DEEPSLATE_SLAB, createSlabItemTable(ModBlocks.DEEPSLATE_SLAB));
        dropSelf(ModBlocks.DEEPSLATE_WALL);
        dropSelf(ModBlocks.MOSSY_COBBLED_DEEPSLATE);
        dropSelf(ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS);
        add(ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, createSlabItemTable(ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB));
        dropSelf(ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL);
        dropSelf(ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
        add(ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_DEEPSLATE_BRICKS);
        dropSelf(ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
        add(ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL);
        dropSelf(ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
        add(ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB, createSlabItemTable(ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB));
        dropSelf(ModBlocks.CRACKED_DEEPSLATE_TILE_WALL);
        dropSelf(ModBlocks.MOSSY_DEEPSLATE_TILES);
        dropSelf(ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS);
        add(ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB, createSlabItemTable(ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB));
        dropSelf(ModBlocks.MOSSY_DEEPSLATE_TILE_WALL);
        dropSelf(ModBlocks.DEEPSLATE_BRICK_PILLAR);
        dropWhenSilkTouch(ModBlocks.SCULK_INLAID_DEEPSLATE);
        dropSelf(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
        dropSelf(ModBlocks.POLISHED_DEEPSLATE_BUTTON);

        dropSelf(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
        dropSelf(ModBlocks.BLACKSTONE_TILES);
        dropSelf(ModBlocks.BLACKSTONE_TILE_STAIRS);
        add(ModBlocks.BLACKSTONE_TILE_SLAB, createSlabItemTable(ModBlocks.BLACKSTONE_TILE_SLAB));
        dropSelf(ModBlocks.BLACKSTONE_TILE_WALL);
        dropSelf(ModBlocks.CRACKED_BLACKSTONE_TILES);
        dropSelf(ModBlocks.CRACKED_BLACKSTONE_TILE_STAIRS);
        add(ModBlocks.CRACKED_BLACKSTONE_TILE_SLAB, createSlabItemTable(ModBlocks.CRACKED_BLACKSTONE_TILE_SLAB));
        dropSelf(ModBlocks.CRACKED_BLACKSTONE_TILE_WALL);
        dropSelf(ModBlocks.BLACKSTONE_BRICK_PILLAR);

        dropSelf(ModBlocks.NETHERRACK_STAIRS);
        add(ModBlocks.NETHERRACK_SLAB, createSlabItemTable(ModBlocks.NETHERRACK_SLAB));
        dropSelf(ModBlocks.NETHERRACK_WALL);

        this.add(ModBlocks.SNOW_BRICKS, block ->
                createSilkTouchDispatchTable(block, LootItem.lootTableItem(Items.SNOWBALL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4)))
                        .apply(ApplyExplosionDecay.explosionDecay())
                )
        );
        this.add(ModBlocks.SNOW_BRICK_STAIRS, block ->
                createSilkTouchDispatchTable(block, LootItem.lootTableItem(Items.SNOWBALL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4)))
                        .apply(ApplyExplosionDecay.explosionDecay())
                )
        );
        this.add(ModBlocks.SNOW_BRICK_SLAB, block ->
                LootTable.lootTable().withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))

                        .add(LootItem.lootTableItem(block)
                                .when(this.hasSilkTouch())
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(SlabBlock.TYPE, SlabType.DOUBLE)))
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2)))

                                .otherwise(LootItem.lootTableItem(block).when(this.hasSilkTouch())
                                )

                                .otherwise(LootItem.lootTableItem(Items.SNOWBALL)
                                        .when(this.doesNotHaveSilkTouch())
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                                        .hasProperty(SlabBlock.TYPE, SlabType.DOUBLE)))
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4)))
                                        .apply(ApplyExplosionDecay.explosionDecay())
                                )

                                .otherwise(LootItem.lootTableItem(Items.SNOWBALL)
                                        .when(this.doesNotHaveSilkTouch())
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2)))
                                        .apply(ApplyExplosionDecay.explosionDecay())
                                )
                        )
                )
        );
        this.add(ModBlocks.SNOW_BRICK_WALL, block ->
                createSilkTouchDispatchTable(block, LootItem.lootTableItem(Items.SNOWBALL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4)))
                        .apply(ApplyExplosionDecay.explosionDecay())
                )
        );

        dropSelf(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
        add(ModBlocks.CRACKED_NETHER_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_NETHER_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_NETHER_BRICK_WALL);
        dropSelf(ModBlocks.CRACKED_NETHER_BRICK_FENCE);

        dropSelf(ModBlocks.RED_NETHER_BRICK_FENCE);
        dropSelf(ModBlocks.CRACKED_RED_NETHER_BRICKS);
        dropSelf(ModBlocks.CRACKED_RED_NETHER_BRICK_STAIRS);
        add(ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_RED_NETHER_BRICK_WALL);
        dropSelf(ModBlocks.CRACKED_RED_NETHER_BRICK_FENCE);
        dropSelf(ModBlocks.CHISELED_RED_NETHER_BRICKS);

        dropSelf(ModBlocks.BLUE_NETHER_BRICKS);
        dropSelf(ModBlocks.BLUE_NETHER_BRICK_STAIRS);
        add(ModBlocks.BLUE_NETHER_BRICK_SLAB, createSlabItemTable(ModBlocks.BLUE_NETHER_BRICK_SLAB));
        dropSelf(ModBlocks.BLUE_NETHER_BRICK_WALL);
        dropSelf(ModBlocks.BLUE_NETHER_BRICK_FENCE);
        dropSelf(ModBlocks.CRACKED_BLUE_NETHER_BRICKS);
        dropSelf(ModBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS);
        add(ModBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_BLUE_NETHER_BRICK_WALL);
        dropSelf(ModBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE);
        dropSelf(ModBlocks.CHISELED_BLUE_NETHER_BRICKS);

        dropSelf(ModBlocks.PRISMARINE_BRICK_WALL);
        dropSelf(ModBlocks.DARK_PRISMARINE_WALL);
        dropSelf(ModBlocks.CRACKED_PRISMARINE_BRICKS);
        dropSelf(ModBlocks.CRACKED_PRISMARINE_BRICK_STAIRS);
        add(ModBlocks.CRACKED_PRISMARINE_BRICK_SLAB, createSlabItemTable(ModBlocks.CRACKED_PRISMARINE_BRICK_SLAB));
        dropSelf(ModBlocks.CRACKED_PRISMARINE_BRICK_WALL);
        dropSelf(ModBlocks.MOSSY_PRISMARINE_BRICKS);
        dropSelf(ModBlocks.MOSSY_PRISMARINE_BRICK_STAIRS);
        add(ModBlocks.MOSSY_PRISMARINE_BRICK_SLAB, createSlabItemTable(ModBlocks.MOSSY_PRISMARINE_BRICK_SLAB));
        dropSelf(ModBlocks.MOSSY_PRISMARINE_BRICK_WALL);
        dropSelf(ModBlocks.CHISELED_PRISMARINE_BRICKS);
        dropSelf(ModBlocks.PRISMARINE_BRICK_PILLAR);

        dropSelf(ModBlocks.SMOOTH_BASALT_STAIRS);
        add(ModBlocks.SMOOTH_BASALT_SLAB, createSlabItemTable(ModBlocks.SMOOTH_BASALT_SLAB));
        dropSelf(ModBlocks.SMOOTH_BASALT_WALL);

        dropSelf(ModBlocks.PURPUR_WALL);
        dropSelf(ModBlocks.CHISELED_PURPUR);

        dropWhenSilkTouch(ModBlocks.TINTED_GLASS_PANE);

        dropSelf(ModBlocks.TERRACOTTA_STAIRS);
        add(ModBlocks.TERRACOTTA_SLAB, createSlabItemTable(ModBlocks.TERRACOTTA_SLAB));
        dropSelf(ModBlocks.TERRACOTTA_WALL);
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.white());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.white(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.white()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.white());
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.lightGray());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.lightGray(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.lightGray()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.lightGray());
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.gray());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.gray(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.gray()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.gray());
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.black());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.black(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.black()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.black());
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.brown());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.brown(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.brown()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.brown());
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.red());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.red(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.red()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.red());
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.orange());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.orange(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.orange()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.orange());
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.yellow());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.yellow(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.yellow()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.yellow());
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.lime());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.lime(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.lime()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.lime());
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.green());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.green(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.green()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.green());
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.cyan());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.cyan(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.cyan()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.cyan());
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.lightBlue());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.lightBlue(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.lightBlue()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.lightBlue());
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.blue());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.blue(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.blue()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.blue());
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.purple());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.purple(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.purple()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.purple());
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.magenta());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.magenta(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.magenta()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.magenta());
        dropSelf(ModBlocks.DYED_TERRACOTTA_STAIRS.pink());
        add(ModBlocks.DYED_TERRACOTTA_SLAB.pink(), createSlabItemTable(ModBlocks.DYED_TERRACOTTA_SLAB.pink()));
        dropSelf(ModBlocks.DYED_TERRACOTTA_WALL.pink());

        dropSelf(ModBlocks.CONCRETE_STAIRS.white());
        add(ModBlocks.CONCRETE_SLAB.white(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.white()));
        dropSelf(ModBlocks.CONCRETE_WALL.white());
        dropSelf(ModBlocks.CONCRETE_STAIRS.lightGray());
        add(ModBlocks.CONCRETE_SLAB.lightGray(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.lightGray()));
        dropSelf(ModBlocks.CONCRETE_WALL.lightGray());
        dropSelf(ModBlocks.CONCRETE_STAIRS.gray());
        add(ModBlocks.CONCRETE_SLAB.gray(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.gray()));
        dropSelf(ModBlocks.CONCRETE_WALL.gray());
        dropSelf(ModBlocks.CONCRETE_STAIRS.black());
        add(ModBlocks.CONCRETE_SLAB.black(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.black()));
        dropSelf(ModBlocks.CONCRETE_WALL.black());
        dropSelf(ModBlocks.CONCRETE_STAIRS.brown());
        add(ModBlocks.CONCRETE_SLAB.brown(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.brown()));
        dropSelf(ModBlocks.CONCRETE_WALL.brown());
        dropSelf(ModBlocks.CONCRETE_STAIRS.red());
        add(ModBlocks.CONCRETE_SLAB.red(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.red()));
        dropSelf(ModBlocks.CONCRETE_WALL.red());
        dropSelf(ModBlocks.CONCRETE_STAIRS.orange());
        add(ModBlocks.CONCRETE_SLAB.orange(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.orange()));
        dropSelf(ModBlocks.CONCRETE_WALL.orange());
        dropSelf(ModBlocks.CONCRETE_STAIRS.yellow());
        add(ModBlocks.CONCRETE_SLAB.yellow(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.yellow()));
        dropSelf(ModBlocks.CONCRETE_WALL.yellow());
        dropSelf(ModBlocks.CONCRETE_STAIRS.lime());
        add(ModBlocks.CONCRETE_SLAB.lime(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.lime()));
        dropSelf(ModBlocks.CONCRETE_WALL.lime());
        dropSelf(ModBlocks.CONCRETE_STAIRS.green());
        add(ModBlocks.CONCRETE_SLAB.green(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.green()));
        dropSelf(ModBlocks.CONCRETE_WALL.green());
        dropSelf(ModBlocks.CONCRETE_STAIRS.cyan());
        add(ModBlocks.CONCRETE_SLAB.cyan(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.cyan()));
        dropSelf(ModBlocks.CONCRETE_WALL.cyan());
        dropSelf(ModBlocks.CONCRETE_STAIRS.lightBlue());
        add(ModBlocks.CONCRETE_SLAB.lightBlue(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.lightBlue()));
        dropSelf(ModBlocks.CONCRETE_WALL.lightBlue());
        dropSelf(ModBlocks.CONCRETE_STAIRS.blue());
        add(ModBlocks.CONCRETE_SLAB.blue(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.blue()));
        dropSelf(ModBlocks.CONCRETE_WALL.blue());
        dropSelf(ModBlocks.CONCRETE_STAIRS.purple());
        add(ModBlocks.CONCRETE_SLAB.purple(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.purple()));
        dropSelf(ModBlocks.CONCRETE_WALL.purple());
        dropSelf(ModBlocks.CONCRETE_STAIRS.magenta());
        add(ModBlocks.CONCRETE_SLAB.magenta(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.magenta()));
        dropSelf(ModBlocks.CONCRETE_WALL.magenta());
        dropSelf(ModBlocks.CONCRETE_STAIRS.pink());
        add(ModBlocks.CONCRETE_SLAB.pink(), createSlabItemTable(ModBlocks.CONCRETE_SLAB.pink()));
        dropSelf(ModBlocks.CONCRETE_WALL.pink());
    }
}