package net.cinchtail.cinchsmissingblocks.datagen;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {


                //Cracked Block Smelting
                smeltingResultFromBase(ModBlocks.CRACKED_MUD_BRICKS, Blocks.MUD_BRICKS);

                smeltingResultFromBase(ModBlocks.CRACKED_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS);

                smeltingResultFromBase(ModBlocks.CRACKED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS);

                smeltingResultFromBase(ModBlocks.CRACKED_BRICKS, Blocks.BRICKS);

                smeltingResultFromBase(ModBlocks.CRACKED_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS);

                smeltingResultFromBase(ModBlocks.CRACKED_END_STONE_BRICKS, Blocks.END_STONE_BRICKS);

                smeltingResultFromBase(ModBlocks.CRACKED_TUFF_BRICKS, Blocks.TUFF_BRICKS);

                smeltingResultFromBase(ModBlocks.CRACKED_CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS);

                smeltingResultFromBase(ModBlocks.CRACKED_DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICKS);

                smeltingResultFromBase(ModBlocks.CRACKED_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS);

                smeltingResultFromBase(ModBlocks.CRACKED_GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS);

                smeltingResultFromBase(ModBlocks.CRACKED_DIORITE_BRICKS, ModBlocks.DIORITE_BRICKS);

                smeltingResultFromBase(ModBlocks.CRACKED_RESIN_BRICKS, Blocks.RESIN_BRICKS);

                smeltingResultFromBase(ModBlocks.CRACKED_SANDSTONE_BRICKS, Blocks.CUT_SANDSTONE);

                smeltingResultFromBase(ModBlocks.CRACKED_RED_SANDSTONE_BRICKS, Blocks.CUT_RED_SANDSTONE);

                smeltingResultFromBase(ModBlocks.CRACKED_BLUE_NETHER_BRICKS, ModBlocks.BLUE_NETHER_BRICKS);

                smeltingResultFromBase(ModBlocks.CRACKED_STONE_TILES, ModBlocks.STONE_TILES);

                smeltingResultFromBase(ModBlocks.CRACKED_BLACKSTONE_TILES, ModBlocks.BLACKSTONE_TILES);

                smeltingResultFromBase(ModBlocks.CRACKED_CINNABAR_BRICKS, Blocks.CINNABAR_BRICKS);

                smeltingResultFromBase(ModBlocks.CRACKED_SULFUR_BRICKS, Blocks.SULFUR_BRICKS);


                //Mossy Blocks
                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICKS, ModBlocks.DIORITE_BRICKS);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICKS, ModBlocks.DIORITE_BRICKS);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICKS, ModBlocks.DIORITE_BRICKS);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICKS, Blocks.TUFF_BRICKS);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICKS, Blocks.TUFF_BRICKS);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICKS, Blocks.TUFF_BRICKS);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICKS);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICKS);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICKS);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICKS, Blocks.MUD_BRICKS);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICKS, Blocks.MUD_BRICKS);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICKS, Blocks.MUD_BRICKS);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICKS, Blocks.BRICKS);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICKS, Blocks.BRICKS);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICKS, Blocks.BRICKS);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILES, Blocks.DEEPSLATE_TILES);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILES, Blocks.DEEPSLATE_TILES);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILES, Blocks.DEEPSLATE_TILES);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_COBBLESTONE, Blocks.COBBLESTONE);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_STONE_BRICKS, Blocks.STONE_BRICKS);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICKS, ModBlocks.SANDSTONE_BRICKS);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICKS, ModBlocks.SANDSTONE_BRICKS);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICKS, ModBlocks.SANDSTONE_BRICKS);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS, ModBlocks.RED_SANDSTONE_BRICKS);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS, ModBlocks.RED_SANDSTONE_BRICKS);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS, ModBlocks.RED_SANDSTONE_BRICKS);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILES, ModBlocks.STONE_TILES);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILES, ModBlocks.STONE_TILES);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILES, ModBlocks.STONE_TILES);

                offerGenericMossyRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICKS, Blocks.RESIN_BRICKS, Items.PALE_MOSS_BLOCK);

                offerGenericMossyRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICKS, Blocks.RESIN_BRICKS, Items.PALE_HANGING_MOSS);

                offerMossyFromOtherMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICKS, Blocks.RESIN_BRICKS, Items.PALE_MOSS_CARPET);

                offerGenericMossyRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICKS, Blocks.END_STONE_BRICKS, Items.CHORUS_FLOWER);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CINNABAR_BRICKS, Blocks.CINNABAR_BRICKS);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CINNABAR_BRICKS, Blocks.CINNABAR_BRICKS);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CINNABAR_BRICKS, Blocks.CINNABAR_BRICKS);

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SULFUR_BRICKS, Blocks.SULFUR_BRICKS);

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SULFUR_BRICKS, Blocks.SULFUR_BRICKS);

                offerMossyFromMossCarpetsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SULFUR_BRICKS, Blocks.SULFUR_BRICKS);


                //Chiseled Blocks
                chiseled(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS, Blocks.END_STONE_BRICK_SLAB);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS, Blocks.END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS, Blocks.END_STONE_BRICKS);

                chiseled(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_MUD_BRICKS, Blocks.MUD_BRICK_SLAB);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_MUD_BRICKS, Blocks.MUD_BRICKS);

                chiseled(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICK_SLAB);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS);

                chiseled(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICK_SLAB);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS, Blocks.ANDESITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS);

                chiseled(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, ModBlocks.GRANITE_BRICK_SLAB);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, Blocks.GRANITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS);

                chiseled(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS, ModBlocks.DIORITE_BRICK_SLAB);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS, Blocks.DIORITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS, ModBlocks.DIORITE_BRICKS);

                chiseled(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICK_SLAB);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS, Blocks.DRIPSTONE_BLOCK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS, ModBlocks.POLISHED_DRIPSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICKS);

                chiseled(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS, ModBlocks.CALCITE_BRICK_SLAB);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS, Blocks.CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_TUFF, Blocks.POLISHED_TUFF);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_TUFF, Blocks.TUFF_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_DEEPSLATE, Blocks.DEEPSLATE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE);

                chiseled(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PURPUR, Blocks.PURPUR_SLAB);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PURPUR, Blocks.PURPUR_BLOCK);

                chiseled(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BRICKS, Blocks.BRICK_SLAB);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BRICKS, Blocks.BRICKS);

                chiseled(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_SLAB);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS);

                chiseled(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BLUE_NETHER_BRICKS, ModBlocks.BLUE_NETHER_BRICK_SLAB);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BLUE_NETHER_BRICKS, ModBlocks.BLUE_NETHER_BRICKS);


                //Pillar Blocks
                pillar(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_BRICK_PILLAR, Blocks.END_STONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_BRICK_PILLAR, Blocks.END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_BRICK_PILLAR, ModBlocks.POLISHED_END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_BRICK_PILLAR, Blocks.END_STONE_BRICKS);

                pillar(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_BRICK_PILLAR, Blocks.MUD_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_BRICK_PILLAR, Blocks.MUD_BRICKS);

                pillar(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_PILLAR, Blocks.STONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_PILLAR, Blocks.STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_PILLAR, Blocks.STONE_BRICKS);

                pillar(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_PILLAR, Blocks.DEEPSLATE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_PILLAR, Blocks.DEEPSLATE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_PILLAR, Blocks.POLISHED_DEEPSLATE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_PILLAR, Blocks.DEEPSLATE_BRICKS);

                pillar(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_BRICK_PILLAR, Blocks.POLISHED_BLACKSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_BRICK_PILLAR, Blocks.BLACKSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_BRICK_PILLAR, Blocks.POLISHED_BLACKSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_BRICK_PILLAR, Blocks.POLISHED_BLACKSTONE_BRICKS);

                pillar(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_PILLAR, Blocks.PRISMARINE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_PILLAR, Blocks.PRISMARINE_BRICKS);

                pillar(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_PILLAR, ModBlocks.CALCITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_PILLAR, Blocks.CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_PILLAR, ModBlocks.POLISHED_CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_PILLAR, ModBlocks.CALCITE_BRICKS);

                pillar(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_PILLAR, ModBlocks.DRIPSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_PILLAR, Blocks.DRIPSTONE_BLOCK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_PILLAR, ModBlocks.POLISHED_DRIPSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_PILLAR, ModBlocks.DRIPSTONE_BRICKS);

                pillar(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_PILLAR, ModBlocks.ANDESITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_PILLAR, Blocks.ANDESITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_PILLAR, Blocks.POLISHED_ANDESITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_PILLAR, ModBlocks.ANDESITE_BRICKS);

                pillar(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_PILLAR, ModBlocks.GRANITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_PILLAR, Blocks.GRANITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_PILLAR, Blocks.POLISHED_GRANITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_PILLAR, ModBlocks.GRANITE_BRICKS);

                pillar(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_PILLAR, ModBlocks.DIORITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_PILLAR, Blocks.DIORITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_PILLAR, Blocks.POLISHED_DIORITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_PILLAR, ModBlocks.DIORITE_BRICKS);

                pillar(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_PILLAR, ModBlocks.SANDSTONE_BRICK_SLAB);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_PILLAR, Blocks.SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_PILLAR, Blocks.CUT_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_PILLAR, ModBlocks.SANDSTONE_BRICKS);

                pillar(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_PILLAR, ModBlocks.RED_SANDSTONE_BRICK_SLAB);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_PILLAR, Blocks.RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_PILLAR, Blocks.CUT_RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_PILLAR, ModBlocks.RED_SANDSTONE_BRICKS);

                pillar(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CINNABAR_BRICK_PILLAR, Blocks.CINNABAR_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CINNABAR_BRICK_PILLAR, Blocks.CINNABAR);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CINNABAR_BRICK_PILLAR, Blocks.POLISHED_CINNABAR);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CINNABAR_BRICK_PILLAR, Blocks.CINNABAR_BRICKS);

                pillar(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SULFUR_BRICK_PILLAR, Blocks.SULFUR_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SULFUR_BRICK_PILLAR, Blocks.SULFUR);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SULFUR_BRICK_PILLAR, Blocks.POLISHED_SULFUR);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SULFUR_BRICK_PILLAR, Blocks.SULFUR_BRICKS);


                //Miscellaneous Calcite Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

                polished(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, Blocks.CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, Blocks.CALCITE);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, Blocks.CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, Blocks.CALCITE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_CALCITE_WALL, Blocks.CALCITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE);

                bricks(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, Blocks.CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, Blocks.CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.POLISHED_CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, Blocks.CALCITE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.POLISHED_CALCITE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CALCITE_BRICK_WALL, Blocks.CALCITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.POLISHED_CALCITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_STAIRS, ModBlocks.CRACKED_CALCITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_STAIRS, ModBlocks.CRACKED_CALCITE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_SLAB, ModBlocks.CRACKED_CALCITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_SLAB, ModBlocks.CRACKED_CALCITE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_CALCITE_BRICK_WALL, ModBlocks.CRACKED_CALCITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_CALCITE_BRICK_WALL, ModBlocks.CRACKED_CALCITE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_STAIRS, ModBlocks.MOSSY_CALCITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_STAIRS, ModBlocks.MOSSY_CALCITE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_SLAB, ModBlocks.MOSSY_CALCITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_SLAB, ModBlocks.MOSSY_CALCITE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_CALCITE_BRICK_WALL, ModBlocks.MOSSY_CALCITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_CALCITE_BRICK_WALL, ModBlocks.MOSSY_CALCITE_BRICKS);


                //Miscellaneous Dripstone Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

                polished(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS, ModBlocks.POLISHED_DRIPSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS, ModBlocks.POLISHED_DRIPSTONE);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB, ModBlocks.POLISHED_DRIPSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB, ModBlocks.POLISHED_DRIPSTONE,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DRIPSTONE_WALL, ModBlocks.POLISHED_DRIPSTONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DRIPSTONE_WALL, ModBlocks.POLISHED_DRIPSTONE);

                bricks(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS, ModBlocks.POLISHED_DRIPSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS, Blocks.DRIPSTONE_BLOCK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS, ModBlocks.POLISHED_DRIPSTONE);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS, ModBlocks.DRIPSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS, Blocks.DRIPSTONE_BLOCK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS, ModBlocks.POLISHED_DRIPSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS, ModBlocks.DRIPSTONE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, ModBlocks.DRIPSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, Blocks.DRIPSTONE_BLOCK,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, ModBlocks.POLISHED_DRIPSTONE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, ModBlocks.DRIPSTONE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.DRIPSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_BRICK_WALL, Blocks.DRIPSTONE_BLOCK);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.POLISHED_DRIPSTONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.DRIPSTONE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_STAIRS, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_STAIRS, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB, ModBlocks.CRACKED_DRIPSTONE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DRIPSTONE_BRICK_WALL, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DRIPSTONE_BRICK_WALL, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB, ModBlocks.MOSSY_DRIPSTONE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DRIPSTONE_BRICK_WALL, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DRIPSTONE_BRICK_WALL, ModBlocks.MOSSY_DRIPSTONE_BRICKS);


                //Miscellaneous Tuff Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_STAIRS, ModBlocks.CRACKED_TUFF_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_STAIRS, ModBlocks.CRACKED_TUFF_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_SLAB, ModBlocks.CRACKED_TUFF_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_SLAB, ModBlocks.CRACKED_TUFF_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_TUFF_BRICK_WALL, ModBlocks.CRACKED_TUFF_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_TUFF_BRICK_WALL, ModBlocks.CRACKED_TUFF_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_STAIRS, ModBlocks.MOSSY_TUFF_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_STAIRS, ModBlocks.MOSSY_TUFF_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_SLAB, ModBlocks.MOSSY_TUFF_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_SLAB, ModBlocks.MOSSY_TUFF_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_TUFF_BRICK_WALL, ModBlocks.MOSSY_TUFF_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_TUFF_BRICK_WALL, ModBlocks.MOSSY_TUFF_BRICKS);


                //Miscellaneous Andesite Blocks
                wall(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.ANDESITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);

                bricks(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.ANDESITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.POLISHED_ANDESITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.ANDESITE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.ANDESITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.POLISHED_ANDESITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS, ModBlocks.CRACKED_ANDESITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS, ModBlocks.CRACKED_ANDESITE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_SLAB, ModBlocks.CRACKED_ANDESITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_SLAB, ModBlocks.CRACKED_ANDESITE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_ANDESITE_BRICK_WALL, ModBlocks.CRACKED_ANDESITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_ANDESITE_BRICK_WALL, ModBlocks.CRACKED_ANDESITE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS, ModBlocks.MOSSY_ANDESITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS, ModBlocks.MOSSY_ANDESITE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_SLAB, ModBlocks.MOSSY_ANDESITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_SLAB, ModBlocks.MOSSY_ANDESITE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_ANDESITE_BRICK_WALL, ModBlocks.MOSSY_ANDESITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_ANDESITE_BRICK_WALL, ModBlocks.MOSSY_ANDESITE_BRICKS);


                //Miscellaneous Granite Blocks
                wall(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.GRANITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);

                bricks(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.GRANITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, ModBlocks.GRANITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, Blocks.GRANITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, Blocks.POLISHED_GRANITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, ModBlocks.GRANITE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Blocks.GRANITE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_BRICK_WALL, Blocks.GRANITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_BRICK_WALL, Blocks.POLISHED_GRANITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_STAIRS, ModBlocks.CRACKED_GRANITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_STAIRS, ModBlocks.CRACKED_GRANITE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB, ModBlocks.CRACKED_GRANITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB, ModBlocks.CRACKED_GRANITE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_GRANITE_BRICK_WALL, ModBlocks.CRACKED_GRANITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_GRANITE_BRICK_WALL, ModBlocks.CRACKED_GRANITE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_STAIRS, ModBlocks.MOSSY_GRANITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_STAIRS, ModBlocks.MOSSY_GRANITE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_SLAB, ModBlocks.MOSSY_GRANITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_SLAB, ModBlocks.MOSSY_GRANITE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_GRANITE_BRICK_WALL, ModBlocks.MOSSY_GRANITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_GRANITE_BRICK_WALL, ModBlocks.MOSSY_GRANITE_BRICKS);


                //Miscellaneous Diorite Blocks
                wall(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.DIORITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);

                bricks(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.DIORITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, ModBlocks.DIORITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, Blocks.DIORITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, Blocks.POLISHED_DIORITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, ModBlocks.DIORITE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Blocks.DIORITE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_BRICK_WALL, Blocks.DIORITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_BRICK_WALL, Blocks.POLISHED_DIORITE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_STAIRS, ModBlocks.CRACKED_DIORITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_STAIRS, ModBlocks.CRACKED_DIORITE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_SLAB, ModBlocks.CRACKED_DIORITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_SLAB, ModBlocks.CRACKED_DIORITE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DIORITE_BRICK_WALL, ModBlocks.CRACKED_DIORITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DIORITE_BRICK_WALL, ModBlocks.CRACKED_DIORITE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_STAIRS, ModBlocks.MOSSY_DIORITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_STAIRS, ModBlocks.MOSSY_DIORITE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_SLAB, ModBlocks.MOSSY_DIORITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_SLAB, ModBlocks.MOSSY_DIORITE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DIORITE_BRICK_WALL, ModBlocks.MOSSY_DIORITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DIORITE_BRICK_WALL, ModBlocks.MOSSY_DIORITE_BRICKS);


                //Miscellaneous Quartz Blocks
                wall(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);

                wall(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BLOCK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BLOCK,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BLOCK);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_STAIRS, ModBlocks.CRACKED_QUARTZ_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_STAIRS, ModBlocks.CRACKED_QUARTZ_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_SLAB, ModBlocks.CRACKED_QUARTZ_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_SLAB, ModBlocks.CRACKED_QUARTZ_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_QUARTZ_BRICK_WALL, ModBlocks.CRACKED_QUARTZ_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_QUARTZ_BRICK_WALL, ModBlocks.CRACKED_QUARTZ_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS, ModBlocks.MOSSY_QUARTZ_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS, ModBlocks.MOSSY_QUARTZ_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_SLAB, ModBlocks.MOSSY_QUARTZ_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_SLAB, ModBlocks.MOSSY_QUARTZ_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_QUARTZ_BRICK_WALL, ModBlocks.MOSSY_QUARTZ_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_QUARTZ_BRICK_WALL, ModBlocks.MOSSY_QUARTZ_BRICKS);


                //Miscellaneous Brick Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_STAIRS, ModBlocks.CRACKED_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_STAIRS, ModBlocks.CRACKED_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_SLAB, ModBlocks.CRACKED_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_SLAB, ModBlocks.CRACKED_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_BRICK_WALL, ModBlocks.CRACKED_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_BRICK_WALL, ModBlocks.CRACKED_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_STAIRS, ModBlocks.MOSSY_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_STAIRS, ModBlocks.MOSSY_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_SLAB, ModBlocks.MOSSY_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_SLAB, ModBlocks.MOSSY_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_BRICK_WALL, ModBlocks.MOSSY_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_BRICK_WALL, ModBlocks.MOSSY_BRICKS);


                //Miscellaneous Mud Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_STAIRS, Blocks.PACKED_MUD);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_STAIRS, Blocks.PACKED_MUD);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_STAIRS, ModBlocks.CRACKED_MUD_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_STAIRS, ModBlocks.CRACKED_MUD_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_SLAB, ModBlocks.CRACKED_MUD_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_SLAB, ModBlocks.CRACKED_MUD_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_MUD_BRICK_WALL, ModBlocks.CRACKED_MUD_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_MUD_BRICK_WALL, ModBlocks.CRACKED_MUD_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_STAIRS, ModBlocks.MOSSY_MUD_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_STAIRS, ModBlocks.MOSSY_MUD_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_SLAB, ModBlocks.MOSSY_MUD_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_SLAB, ModBlocks.MOSSY_MUD_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_MUD_BRICK_WALL, ModBlocks.MOSSY_MUD_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_MUD_BRICK_WALL, ModBlocks.MOSSY_MUD_BRICKS);


                //Miscellaneous Resin Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_STAIRS, ModBlocks.CRACKED_RESIN_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_STAIRS, ModBlocks.CRACKED_RESIN_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_SLAB, ModBlocks.CRACKED_RESIN_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_SLAB, ModBlocks.CRACKED_RESIN_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_RESIN_BRICK_WALL, ModBlocks.CRACKED_RESIN_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_RESIN_BRICK_WALL, ModBlocks.CRACKED_RESIN_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_STAIRS, ModBlocks.MOSSY_RESIN_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_STAIRS, ModBlocks.MOSSY_RESIN_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_SLAB, ModBlocks.MOSSY_RESIN_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_SLAB, ModBlocks.MOSSY_RESIN_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_RESIN_BRICK_WALL, ModBlocks.MOSSY_RESIN_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_RESIN_BRICK_WALL, ModBlocks.MOSSY_RESIN_BRICKS);


                //Miscellaneous End Stone Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS, Blocks.END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS, Blocks.END_STONE);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Blocks.END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Blocks.END_STONE,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_WALL, Blocks.END_STONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_WALL, Blocks.END_STONE);

                polished(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE, Blocks.END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE, Blocks.END_STONE);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS, ModBlocks.POLISHED_END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS, Blocks.END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS, ModBlocks.POLISHED_END_STONE);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, Blocks.END_STONE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_END_STONE_WALL, Blocks.END_STONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_STAIRS, ModBlocks.POLISHED_END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_SLAB, ModBlocks.POLISHED_END_STONE,2);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, Blocks.END_STONE_BRICK_WALL, ModBlocks.POLISHED_END_STONE);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_STAIRS, ModBlocks.CRACKED_END_STONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_STAIRS, ModBlocks.CRACKED_END_STONE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_SLAB, ModBlocks.CRACKED_END_STONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_SLAB, ModBlocks.CRACKED_END_STONE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_END_STONE_BRICK_WALL, ModBlocks.CRACKED_END_STONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_END_STONE_BRICK_WALL, ModBlocks.CRACKED_END_STONE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICK_STAIRS, ModBlocks.MOSSY_END_STONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICK_STAIRS, ModBlocks.MOSSY_END_STONE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICK_SLAB, ModBlocks.MOSSY_END_STONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICK_SLAB, ModBlocks.MOSSY_END_STONE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_END_STONE_BRICK_WALL, ModBlocks.MOSSY_END_STONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_END_STONE_BRICK_WALL, ModBlocks.MOSSY_END_STONE_BRICKS);


                //Miscellaneous Stone Blocks
                wall(RecipeCategory.DECORATIONS, ModBlocks.STONE_WALL, Blocks.STONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.STONE_WALL, Blocks.STONE);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);

                wall(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS, Blocks.CRACKED_STONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS, Blocks.CRACKED_STONE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB, Blocks.CRACKED_STONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB, Blocks.CRACKED_STONE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICK_WALL, Blocks.CRACKED_STONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICK_WALL, Blocks.CRACKED_STONE_BRICKS);

                bricks(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILES, Blocks.STONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILES, Blocks.STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILES, Blocks.STONE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, ModBlocks.STONE_TILES);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, Blocks.STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, Blocks.STONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, ModBlocks.STONE_TILES);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, ModBlocks.STONE_TILES);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, Blocks.STONE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, Blocks.STONE_BRICKS,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, ModBlocks.STONE_TILES,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.STONE_TILE_WALL, ModBlocks.STONE_TILES);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.STONE_TILE_WALL, Blocks.STONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.STONE_TILE_WALL, Blocks.STONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.STONE_TILE_WALL, ModBlocks.STONE_TILES);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_TILE_STAIRS, ModBlocks.CRACKED_STONE_TILES);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_TILE_STAIRS, ModBlocks.CRACKED_STONE_TILES);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_TILE_SLAB, ModBlocks.CRACKED_STONE_TILES);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_TILE_SLAB, ModBlocks.CRACKED_STONE_TILES,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_TILE_WALL, ModBlocks.CRACKED_STONE_TILES);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_TILE_WALL, ModBlocks.CRACKED_STONE_TILES);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILE_STAIRS, ModBlocks.MOSSY_STONE_TILES);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILE_STAIRS, ModBlocks.MOSSY_STONE_TILES);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILE_SLAB, ModBlocks.MOSSY_STONE_TILES);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILE_SLAB, ModBlocks.MOSSY_STONE_TILES,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_STONE_TILE_WALL, ModBlocks.MOSSY_STONE_TILES);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_STONE_TILE_WALL, ModBlocks.MOSSY_STONE_TILES);


                //Miscellaneous Deepslate Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_STAIRS, Blocks.DEEPSLATE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_STAIRS, Blocks.DEEPSLATE);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB, Blocks.DEEPSLATE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB, Blocks.DEEPSLATE,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_WALL, Blocks.DEEPSLATE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_WALL, Blocks.DEEPSLATE);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, ModBlocks.MOSSY_COBBLED_DEEPSLATE,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Blocks.CRACKED_DEEPSLATE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Blocks.CRACKED_DEEPSLATE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL, Blocks.CRACKED_DEEPSLATE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL, Blocks.CRACKED_DEEPSLATE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, ModBlocks.MOSSY_DEEPSLATE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Blocks.CRACKED_DEEPSLATE_TILES);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Blocks.CRACKED_DEEPSLATE_TILES);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Blocks.CRACKED_DEEPSLATE_TILES);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Blocks.CRACKED_DEEPSLATE_TILES,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL, Blocks.CRACKED_DEEPSLATE_TILES);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL, Blocks.CRACKED_DEEPSLATE_TILES);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS, ModBlocks.MOSSY_DEEPSLATE_TILES);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS, ModBlocks.MOSSY_DEEPSLATE_TILES);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB, ModBlocks.MOSSY_DEEPSLATE_TILES);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB, ModBlocks.MOSSY_DEEPSLATE_TILES,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DEEPSLATE_TILE_WALL, ModBlocks.MOSSY_DEEPSLATE_TILES);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DEEPSLATE_TILE_WALL, ModBlocks.MOSSY_DEEPSLATE_TILES);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_INLAID_DEEPSLATE)
                        .pattern("A")
                        .pattern("B")
                        .pattern("A")
                        .define('A', Blocks.DEEPSLATE_BRICK_SLAB)
                        .define('B', Blocks.SCULK)
                        .unlockedBy(getHasName(Blocks.SCULK), has(Blocks.SCULK))
                        .save(this.output);

                pressurePlate(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Blocks.POLISHED_DEEPSLATE);

                shapeless(RecipeCategory.REDSTONE, ModBlocks.POLISHED_DEEPSLATE_BUTTON)
                        .requires(Blocks.POLISHED_DEEPSLATE)
                        .unlockedBy(getHasName(Blocks.POLISHED_DEEPSLATE), has(Blocks.POLISHED_DEEPSLATE))
                        .save(this.output);
                
                
                //Miscellaneous Blackstone Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

                bricks(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILES, Blocks.BLACKSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_STAIRS, ModBlocks.BLACKSTONE_TILES);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_STAIRS, Blocks.BLACKSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_STAIRS, Blocks.POLISHED_BLACKSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_STAIRS, Blocks.POLISHED_BLACKSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_STAIRS, ModBlocks.BLACKSTONE_TILES);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_SLAB, ModBlocks.BLACKSTONE_TILES);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_SLAB, Blocks.BLACKSTONE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_SLAB, Blocks.POLISHED_BLACKSTONE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_SLAB, ModBlocks.BLACKSTONE_TILES,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_TILE_WALL, ModBlocks.BLACKSTONE_TILES);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_TILE_WALL, Blocks.BLACKSTONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_TILE_WALL, Blocks.POLISHED_BLACKSTONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_TILE_WALL, Blocks.POLISHED_BLACKSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_TILE_WALL, ModBlocks.BLACKSTONE_TILES);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLACKSTONE_TILE_STAIRS, ModBlocks.CRACKED_BLACKSTONE_TILES);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLACKSTONE_TILE_STAIRS, ModBlocks.CRACKED_BLACKSTONE_TILES);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLACKSTONE_TILE_SLAB, ModBlocks.CRACKED_BLACKSTONE_TILES);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLACKSTONE_TILE_SLAB, ModBlocks.CRACKED_BLACKSTONE_TILES,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_BLACKSTONE_TILE_WALL, ModBlocks.CRACKED_BLACKSTONE_TILES);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_BLACKSTONE_TILE_WALL, ModBlocks.CRACKED_BLACKSTONE_TILES);


                //Miscellaneous Netherrack Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);


                //Nether Brick Items
                shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.RED_NETHER_BRICK, 4)
                        .pattern("AT")
                        .pattern("TA")
                        .define('A', Items.NETHER_WART)
                        .define('T', Items.NETHER_BRICK)
                        .unlockedBy(getHasName(Items.NETHER_WART), has(Items.NETHER_WART))
                       .save(this.output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.BLUE_NETHER_BRICK, 4)
                        .pattern("AT")
                        .pattern("TA")
                        .define('A', Items.NETHER_SPROUTS)
                        .define('T', Items.NETHER_BRICK)
                        .unlockedBy(getHasName(Items.NETHER_SPROUTS), has(Items.NETHER_SPROUTS))
                       .save(this.output);


                //Miscellaneous Nether Brick Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.CRACKED_NETHER_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.CRACKED_NETHER_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_WALL, Blocks.CRACKED_NETHER_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_WALL, Blocks.CRACKED_NETHER_BRICKS);

                netherBrickFence(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_FENCE, Blocks.CRACKED_NETHER_BRICKS, Items.NETHER_BRICK);


                //Miscellaneous Red Nether Brick Blocks
                netherBrickFence(RecipeCategory.DECORATIONS, ModBlocks.RED_NETHER_BRICK_FENCE, Blocks.RED_NETHER_BRICKS, ModItems.RED_NETHER_BRICK);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB, ModBlocks.CRACKED_RED_NETHER_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_RED_NETHER_BRICK_WALL, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_RED_NETHER_BRICK_WALL, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                netherBrickFence(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_RED_NETHER_BRICK_FENCE, ModBlocks.CRACKED_RED_NETHER_BRICKS, ModItems.RED_NETHER_BRICK);


                //Blue Nether Brick Blocks
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICKS)
                        .pattern("SS")
                        .pattern("SS")
                        .define('S', ModItems.BLUE_NETHER_BRICK)
                        .unlockedBy(getHasName(ModItems.BLUE_NETHER_BRICK), has(ModItems.BLUE_NETHER_BRICK))
                        .save(this.output);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICK_STAIRS, ModBlocks.BLUE_NETHER_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICK_STAIRS, ModBlocks.BLUE_NETHER_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICK_SLAB, ModBlocks.BLUE_NETHER_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICK_SLAB, ModBlocks.BLUE_NETHER_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.BLUE_NETHER_BRICK_WALL, ModBlocks.BLUE_NETHER_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.BLUE_NETHER_BRICK_WALL, ModBlocks.BLUE_NETHER_BRICKS);

                netherBrickFence(RecipeCategory.DECORATIONS, ModBlocks.BLUE_NETHER_BRICK_FENCE, ModBlocks.BLUE_NETHER_BRICKS, ModItems.BLUE_NETHER_BRICK);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS, ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS, ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, ModBlocks.CRACKED_BLUE_NETHER_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_WALL, ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_WALL, ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

                netherBrickFence(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE, ModBlocks.CRACKED_BLUE_NETHER_BRICKS, ModItems.BLUE_NETHER_BRICK);


                //Miscellaneous Prismarine Blocks
                wall(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);

                wall(RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_STAIRS, ModBlocks.CRACKED_PRISMARINE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_STAIRS, ModBlocks.CRACKED_PRISMARINE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_SLAB, ModBlocks.CRACKED_PRISMARINE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_SLAB, ModBlocks.CRACKED_PRISMARINE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_PRISMARINE_BRICK_WALL, ModBlocks.CRACKED_PRISMARINE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_PRISMARINE_BRICK_WALL, ModBlocks.CRACKED_PRISMARINE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_STAIRS, ModBlocks.MOSSY_PRISMARINE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_STAIRS, ModBlocks.MOSSY_PRISMARINE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_SLAB, ModBlocks.MOSSY_PRISMARINE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_SLAB, ModBlocks.MOSSY_PRISMARINE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_PRISMARINE_BRICK_WALL, ModBlocks.MOSSY_PRISMARINE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_PRISMARINE_BRICK_WALL, ModBlocks.MOSSY_PRISMARINE_BRICKS);


                //Miscellaneous Snow Blocks
                bricks(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICKS, Blocks.SNOW_BLOCK);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_STAIRS, Blocks.SNOW_BLOCK);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_SLAB, Blocks.SNOW_BLOCK);

                wall(RecipeCategory.DECORATIONS, ModBlocks.SNOW_BRICK_WALL, Blocks.SNOW_BLOCK);


                //Miscellaneous Basalt Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);


                //Miscellaneous Sandstone Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS, Blocks.SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_WALL, Blocks.SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE);

                wall(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);

                bricks(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICKS, Blocks.CUT_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICKS, Blocks.SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICKS, Blocks.CUT_SANDSTONE);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS, ModBlocks.SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS, Blocks.SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS, Blocks.CUT_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS, ModBlocks.SANDSTONE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB, ModBlocks.SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB, Blocks.SANDSTONE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB, Blocks.CUT_SANDSTONE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB, ModBlocks.SANDSTONE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_BRICK_WALL, ModBlocks.SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_BRICK_WALL, Blocks.SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_BRICK_WALL, Blocks.CUT_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_BRICK_WALL, ModBlocks.SANDSTONE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SANDSTONE_BRICK_STAIRS, ModBlocks.CRACKED_SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SANDSTONE_BRICK_STAIRS, ModBlocks.CRACKED_SANDSTONE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB, ModBlocks.CRACKED_SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB, ModBlocks.CRACKED_SANDSTONE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_SANDSTONE_BRICK_WALL, ModBlocks.CRACKED_SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_SANDSTONE_BRICK_WALL, ModBlocks.CRACKED_SANDSTONE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICK_STAIRS, ModBlocks.MOSSY_SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICK_STAIRS, ModBlocks.MOSSY_SANDSTONE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICK_SLAB, ModBlocks.MOSSY_SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICK_SLAB, ModBlocks.MOSSY_SANDSTONE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_SANDSTONE_BRICK_WALL, ModBlocks.MOSSY_SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_SANDSTONE_BRICK_WALL, ModBlocks.MOSSY_SANDSTONE_BRICKS);


                //Miscellaneous Red Sandstone Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_WALL, Blocks.RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE);

                wall(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);

                bricks(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICKS, Blocks.CUT_RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICKS, Blocks.RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICKS, Blocks.CUT_RED_SANDSTONE);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS, ModBlocks.RED_SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS, Blocks.RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS, Blocks.CUT_RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS, ModBlocks.RED_SANDSTONE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB, ModBlocks.RED_SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB, Blocks.RED_SANDSTONE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB, Blocks.CUT_RED_SANDSTONE,2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB, ModBlocks.RED_SANDSTONE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_BRICK_WALL, ModBlocks.RED_SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_BRICK_WALL, Blocks.RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_BRICK_WALL, Blocks.CUT_RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_BRICK_WALL, ModBlocks.RED_SANDSTONE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_STAIRS, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_STAIRS, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_WALL, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_WALL, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);


                //Miscellaneous Cinnabar Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CINNABAR_BRICK_STAIRS, ModBlocks.CRACKED_CINNABAR_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CINNABAR_BRICK_STAIRS, ModBlocks.CRACKED_CINNABAR_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CINNABAR_BRICK_SLAB, ModBlocks.CRACKED_CINNABAR_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CINNABAR_BRICK_SLAB, ModBlocks.CRACKED_CINNABAR_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_CINNABAR_BRICK_WALL, ModBlocks.CRACKED_CINNABAR_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_CINNABAR_BRICK_WALL, ModBlocks.CRACKED_CINNABAR_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CINNABAR_BRICK_STAIRS, ModBlocks.MOSSY_CINNABAR_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CINNABAR_BRICK_STAIRS, ModBlocks.MOSSY_CINNABAR_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CINNABAR_BRICK_SLAB, ModBlocks.MOSSY_CINNABAR_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CINNABAR_BRICK_SLAB, ModBlocks.MOSSY_CINNABAR_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_CINNABAR_BRICK_WALL, ModBlocks.MOSSY_CINNABAR_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_CINNABAR_BRICK_WALL, ModBlocks.MOSSY_CINNABAR_BRICKS);


                //Miscellaneous Sulfur Blocks
                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SULFUR_BRICK_STAIRS, ModBlocks.CRACKED_SULFUR_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SULFUR_BRICK_STAIRS, ModBlocks.CRACKED_SULFUR_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SULFUR_BRICK_SLAB, ModBlocks.CRACKED_SULFUR_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SULFUR_BRICK_SLAB, ModBlocks.CRACKED_SULFUR_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_SULFUR_BRICK_WALL, ModBlocks.CRACKED_SULFUR_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_SULFUR_BRICK_WALL, ModBlocks.CRACKED_SULFUR_BRICKS);

                stairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SULFUR_BRICK_STAIRS, ModBlocks.MOSSY_SULFUR_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SULFUR_BRICK_STAIRS, ModBlocks.MOSSY_SULFUR_BRICKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SULFUR_BRICK_SLAB, ModBlocks.MOSSY_SULFUR_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SULFUR_BRICK_SLAB, ModBlocks.MOSSY_SULFUR_BRICKS,2);

                wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_SULFUR_BRICK_WALL, ModBlocks.MOSSY_SULFUR_BRICKS);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_SULFUR_BRICK_WALL, ModBlocks.MOSSY_SULFUR_BRICKS);


                //Miscellaneous Purpur Blocks
                wall(RecipeCategory.DECORATIONS, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);


                //Glass Blocks
                stainedGlassPaneFromStainedGlass(ModBlocks.TINTED_GLASS_PANE, Blocks.TINTED_GLASS);


                //Terracotta Blocks
                /*terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_STAIRS, Blocks.TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_STAIRS, Blocks.TERRACOTTA);

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA,2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA);

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.white(), Blocks.DYED_TERRACOTTA.white());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.white(), Blocks.DYED_TERRACOTTA.white());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.white(), Blocks.DYED_TERRACOTTA.white());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.white(), Blocks.DYED_TERRACOTTA.white(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.white(), Blocks.DYED_TERRACOTTA.white());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.white(), Blocks.DYED_TERRACOTTA.white());

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.lightGray(), Blocks.DYED_TERRACOTTA.lightGray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.lightGray(), Blocks.DYED_TERRACOTTA.lightGray());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.lightGray(), Blocks.DYED_TERRACOTTA.lightGray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.lightGray(), Blocks.DYED_TERRACOTTA.lightGray(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.lightGray(), Blocks.DYED_TERRACOTTA.lightGray());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.lightGray(), Blocks.DYED_TERRACOTTA.lightGray());

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.gray(), Blocks.DYED_TERRACOTTA.gray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.gray(), Blocks.DYED_TERRACOTTA.gray());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.gray(), Blocks.DYED_TERRACOTTA.gray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.gray(), Blocks.DYED_TERRACOTTA.gray(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.gray(), Blocks.DYED_TERRACOTTA.gray());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.gray(), Blocks.DYED_TERRACOTTA.gray());

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.black(), Blocks.DYED_TERRACOTTA.black());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.black(), Blocks.DYED_TERRACOTTA.black());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.black(), Blocks.DYED_TERRACOTTA.black());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.black(), Blocks.DYED_TERRACOTTA.black(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.black(), Blocks.DYED_TERRACOTTA.black());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.black(), Blocks.DYED_TERRACOTTA.black());

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.brown(), Blocks.DYED_TERRACOTTA.brown());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.brown(), Blocks.DYED_TERRACOTTA.brown());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.brown(), Blocks.DYED_TERRACOTTA.brown());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.brown(), Blocks.DYED_TERRACOTTA.brown(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.brown(), Blocks.DYED_TERRACOTTA.brown());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.brown(), Blocks.DYED_TERRACOTTA.brown());

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.red(), Blocks.DYED_TERRACOTTA.red());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.red(), Blocks.DYED_TERRACOTTA.red());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.red(), Blocks.DYED_TERRACOTTA.red());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.red(), Blocks.DYED_TERRACOTTA.red(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.red(), Blocks.DYED_TERRACOTTA.red());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.red(), Blocks.DYED_TERRACOTTA.red());

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.orange(), Blocks.DYED_TERRACOTTA.orange());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.orange(), Blocks.DYED_TERRACOTTA.orange());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.orange(), Blocks.DYED_TERRACOTTA.orange());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.orange(), Blocks.DYED_TERRACOTTA.orange(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.orange(), Blocks.DYED_TERRACOTTA.orange());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.orange(), Blocks.DYED_TERRACOTTA.orange());

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.yellow(), Blocks.DYED_TERRACOTTA.yellow());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.yellow(), Blocks.DYED_TERRACOTTA.yellow());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.yellow(), Blocks.DYED_TERRACOTTA.yellow());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.yellow(), Blocks.DYED_TERRACOTTA.yellow(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.yellow(), Blocks.DYED_TERRACOTTA.yellow());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.yellow(), Blocks.DYED_TERRACOTTA.yellow());

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.lime(), Blocks.DYED_TERRACOTTA.lime());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.lime(), Blocks.DYED_TERRACOTTA.lime());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.lime(), Blocks.DYED_TERRACOTTA.lime());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.lime(), Blocks.DYED_TERRACOTTA.lime(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.lime(), Blocks.DYED_TERRACOTTA.lime());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.lime(), Blocks.DYED_TERRACOTTA.lime());

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.green(), Blocks.DYED_TERRACOTTA.green());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.green(), Blocks.DYED_TERRACOTTA.green());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.green(), Blocks.DYED_TERRACOTTA.green());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.green(), Blocks.DYED_TERRACOTTA.green(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.green(), Blocks.DYED_TERRACOTTA.green());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.green(), Blocks.DYED_TERRACOTTA.green());

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.cyan(), Blocks.DYED_TERRACOTTA.cyan());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.cyan(), Blocks.DYED_TERRACOTTA.cyan());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.cyan(), Blocks.DYED_TERRACOTTA.cyan());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.cyan(), Blocks.DYED_TERRACOTTA.cyan(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.cyan(), Blocks.DYED_TERRACOTTA.cyan());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.cyan(), Blocks.DYED_TERRACOTTA.cyan());

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.lightBlue(), Blocks.DYED_TERRACOTTA.lightBlue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.lightBlue(), Blocks.DYED_TERRACOTTA.lightBlue());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.lightBlue(), Blocks.DYED_TERRACOTTA.lightBlue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.lightBlue(), Blocks.DYED_TERRACOTTA.lightBlue(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.lightBlue(), Blocks.DYED_TERRACOTTA.lightBlue());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.lightBlue(), Blocks.DYED_TERRACOTTA.lightBlue());

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.blue(), Blocks.DYED_TERRACOTTA.blue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.blue(), Blocks.DYED_TERRACOTTA.blue());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.blue(), Blocks.DYED_TERRACOTTA.blue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.blue(), Blocks.DYED_TERRACOTTA.blue(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.blue(), Blocks.DYED_TERRACOTTA.blue());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.blue(), Blocks.DYED_TERRACOTTA.blue());

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.purple(), Blocks.DYED_TERRACOTTA.purple());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.purple(), Blocks.DYED_TERRACOTTA.purple());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.purple(), Blocks.DYED_TERRACOTTA.purple());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.purple(), Blocks.DYED_TERRACOTTA.purple(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.purple(), Blocks.DYED_TERRACOTTA.purple());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.purple(), Blocks.DYED_TERRACOTTA.purple());

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.magenta(), Blocks.DYED_TERRACOTTA.magenta());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.magenta(), Blocks.DYED_TERRACOTTA.magenta());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.magenta(), Blocks.DYED_TERRACOTTA.magenta());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.magenta(), Blocks.DYED_TERRACOTTA.magenta(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.magenta(), Blocks.DYED_TERRACOTTA.magenta());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.magenta(), Blocks.DYED_TERRACOTTA.magenta());

                terracottaStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.pink(), Blocks.DYED_TERRACOTTA.pink());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_STAIRS.pink(), Blocks.DYED_TERRACOTTA.pink());

                terracottaSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.pink(), Blocks.DYED_TERRACOTTA.pink());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYED_TERRACOTTA_SLAB.pink(), Blocks.DYED_TERRACOTTA.pink(),2);

                terracottaWall(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.pink(), Blocks.DYED_TERRACOTTA.pink());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DYED_TERRACOTTA_WALL.pink(), Blocks.DYED_TERRACOTTA.pink());*/


                //Concrete Blocks
                /*concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.white(), Blocks.CONCRETE.white());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.white(), Blocks.CONCRETE.white());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.white(), Blocks.CONCRETE.white());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.white(), Blocks.CONCRETE.white(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.white(), Blocks.CONCRETE.white());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.white(), Blocks.CONCRETE.white());

                concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.lightGray(), Blocks.CONCRETE.lightGray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.lightGray(), Blocks.CONCRETE.lightGray());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.lightGray(), Blocks.CONCRETE.lightGray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.lightGray(), Blocks.CONCRETE.lightGray(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.lightGray(), Blocks.CONCRETE.lightGray());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.lightGray(), Blocks.CONCRETE.lightGray());

                concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.gray(), Blocks.CONCRETE.gray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.gray(), Blocks.CONCRETE.gray());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.gray(), Blocks.CONCRETE.gray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.gray(), Blocks.CONCRETE.gray(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.gray(), Blocks.CONCRETE.gray());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.gray(), Blocks.CONCRETE.gray());

                concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.black(), Blocks.CONCRETE.black());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.black(), Blocks.CONCRETE.black());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.black(), Blocks.CONCRETE.black());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.black(), Blocks.CONCRETE.black(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.black(), Blocks.CONCRETE.black());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.black(), Blocks.CONCRETE.black());

                concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.brown(), Blocks.CONCRETE.brown());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.brown(), Blocks.CONCRETE.brown());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.brown(), Blocks.CONCRETE.brown());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.brown(), Blocks.CONCRETE.brown(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.brown(), Blocks.CONCRETE.brown());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.brown(), Blocks.CONCRETE.brown());

                concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.red(), Blocks.CONCRETE.red());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.red(), Blocks.CONCRETE.red());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.red(), Blocks.CONCRETE.red());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.red(), Blocks.CONCRETE.red(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.red(), Blocks.CONCRETE.red());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.red(), Blocks.CONCRETE.red());

                concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.orange(), Blocks.CONCRETE.orange());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.orange(), Blocks.CONCRETE.orange());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.orange(), Blocks.CONCRETE.orange());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.orange(), Blocks.CONCRETE.orange(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.orange(), Blocks.CONCRETE.orange());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.orange(), Blocks.CONCRETE.orange());

                concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.yellow(), Blocks.CONCRETE.yellow());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.yellow(), Blocks.CONCRETE.yellow());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.yellow(), Blocks.CONCRETE.yellow());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.yellow(), Blocks.CONCRETE.yellow(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.yellow(), Blocks.CONCRETE.yellow());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.yellow(), Blocks.CONCRETE.yellow());

                concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.lime(), Blocks.CONCRETE.lime());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.lime(), Blocks.CONCRETE.lime());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.lime(), Blocks.CONCRETE.lime());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.lime(), Blocks.CONCRETE.lime(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.lime(), Blocks.CONCRETE.lime());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.lime(), Blocks.CONCRETE.lime());

                concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.green(), Blocks.CONCRETE.green());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.green(), Blocks.CONCRETE.green());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.green(), Blocks.CONCRETE.green());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.green(), Blocks.CONCRETE.green(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.green(), Blocks.CONCRETE.green());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.green(), Blocks.CONCRETE.green());

                concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.cyan(), Blocks.CONCRETE.cyan());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.cyan(), Blocks.CONCRETE.cyan());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.cyan(), Blocks.CONCRETE.cyan());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.cyan(), Blocks.CONCRETE.cyan(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.cyan(), Blocks.CONCRETE.cyan());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.cyan(), Blocks.CONCRETE.cyan());

                concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.lightBlue(), Blocks.CONCRETE.lightBlue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.lightBlue(), Blocks.CONCRETE.lightBlue());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.lightBlue(), Blocks.CONCRETE.lightBlue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.lightBlue(), Blocks.CONCRETE.lightBlue(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.lightBlue(), Blocks.CONCRETE.lightBlue());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.lightBlue(), Blocks.CONCRETE.lightBlue());

                concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.blue(), Blocks.CONCRETE.blue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.blue(), Blocks.CONCRETE.blue());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.blue(), Blocks.CONCRETE.blue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.blue(), Blocks.CONCRETE.blue(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.blue(), Blocks.CONCRETE.blue());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.blue(), Blocks.CONCRETE.blue());

                concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.purple(), Blocks.CONCRETE.purple());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.purple(), Blocks.CONCRETE.purple());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.purple(), Blocks.CONCRETE.purple());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.purple(), Blocks.CONCRETE.purple(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.purple(), Blocks.CONCRETE.purple());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.purple(), Blocks.CONCRETE.purple());

                concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.magenta(), Blocks.CONCRETE.magenta());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.magenta(), Blocks.CONCRETE.magenta());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.magenta(), Blocks.CONCRETE.magenta());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.magenta(), Blocks.CONCRETE.magenta(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.magenta(), Blocks.CONCRETE.magenta());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.magenta(), Blocks.CONCRETE.magenta());

                concreteStairs(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.pink(), Blocks.CONCRETE.pink());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_STAIRS.pink(), Blocks.CONCRETE.pink());

                concreteSlab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.pink(), Blocks.CONCRETE.pink());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_SLAB.pink(), Blocks.CONCRETE.pink(),2);

                concreteWall(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.pink(), Blocks.CONCRETE.pink());

                stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.CONCRETE_WALL.pink(), Blocks.CONCRETE.pink());*/

            }

            public void stairs(RecipeCategory category, ItemLike output, ItemLike input) {
                String inputPath = idPath(input);
                this.shaped(category, output, 4).define('#', input).pattern("#  ").pattern("## ").pattern("###")
                        .unlockedBy("has_" + inputPath, this.has(input)).save(this.output);
            }
            public void bricks(RecipeCategory category, ItemLike output, ItemLike input) {
                this.polishedBuilder(category, output, Ingredient.of(input)).unlockedBy(getHasName(input), this.has(input)).save(this.output);
            }
            public void pillar(RecipeCategory category, ItemLike output, ItemLike input) {
                String inputPath = idPath(input);
                this.shaped(category, output, 2).define('#', input).pattern("#").pattern("#")
                        .unlockedBy("has_" + inputPath, this.has(input)).save(this.output);
            }
            public void netherBrickFence(RecipeCategory category, ItemLike output, ItemLike input, ItemLike brickInput) {
                String outputPath = idPath(output);
                String inputPath = idPath(input);
                this.shaped(category, output, 3).group(outputPath).define('A', input).define('T', brickInput)
                        .pattern("ATA").pattern("ATA").unlockedBy("has_" + inputPath, this.has(brickInput)).save(this.output);
            }
            public void offerMossyFromMossBlockRecipe(RecipeCategory category, ItemLike output, ItemLike input) {
                String outputPath = idPath(output);
                this.shapeless(category, output, 1).group(outputPath).requires(input).requires(Blocks.MOSS_BLOCK).unlockedBy("has_moss_block", this.has(Blocks.MOSS_BLOCK))
                        .save(this.output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(MOD_ID, outputPath + "_from_moss_block")));
            }
            public void offerMossyFromVineRecipe(RecipeCategory category, ItemLike output, ItemLike input) {
                String outputPath = idPath(output);
                this.shapeless(category, output, 1).group(outputPath).requires(input).requires(Blocks.VINE).unlockedBy("has_vine", this.has(Blocks.VINE))
                        .save(this.output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(MOD_ID, outputPath + "_from_vine")));
            }
            public void offerMossyFromMossCarpetsRecipe(RecipeCategory category, ItemLike output, ItemLike input) {
                String outputPath = idPath(output);
                this.shaped(category, output, 1).group(outputPath).define('#', Blocks.MOSS_CARPET).define('B', input)
                        .pattern("#").pattern("B").pattern("#").unlockedBy("has_moss_carpet", this.has(Blocks.MOSS_CARPET))
                        .save(this.output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(MOD_ID, outputPath + "_from_moss_carpet")));
            }
            public void offerMossyFromOtherMossCarpetRecipe(RecipeCategory category, ItemLike output, ItemLike input, ItemLike input_moss) {
                String outputPath = idPath(output);
                String mossPath = idPath(input_moss);
                this.shaped(category, output, 1).group(outputPath).define('#', input_moss).define('B', input).pattern("#").pattern("B").pattern("#")
                        .unlockedBy("has_" + mossPath, this.has(input_moss)).save(this.output, ResourceKey.create(Registries.RECIPE,
                                Identifier.fromNamespaceAndPath(MOD_ID, outputPath + "_from_" + mossPath)));
            }
            public void offerGenericMossyRecipe(RecipeCategory category, ItemLike output, ItemLike input, ItemLike inputMoss) {
                String outputPath = idPath(output);
                String mossPath = idPath(inputMoss);
                this.shapeless(category, output, 1).group(outputPath).requires(input).requires(inputMoss).unlockedBy("has_" + mossPath, this.has(inputMoss))
                        .save(this.output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(MOD_ID, outputPath + "_from_" + mossPath)));
            }
            public void terracottaStairs(RecipeCategory category, ItemLike output, ItemLike input) {
                String inputPath = idPath(input);
                this.shaped(category, output, 4).group("terracotta_stairs").define('#', input).pattern("#  ").pattern("## ").pattern("###")
                        .unlockedBy("has_" + inputPath, this.has(input)).save(this.output);
            }
            public void terracottaSlab(RecipeCategory category, ItemLike output, ItemLike input) {
                String inputPath = idPath(input);
                this.shaped(category, output, 6).group("terracotta_slab").define('#', input).pattern("###")
                        .unlockedBy("has_" + inputPath, this.has(input)).save(this.output);
            }
            public void terracottaWall(RecipeCategory category, ItemLike output, ItemLike input) {
                String inputPath = idPath(input);
                this.shaped(category, output, 6).group("terracotta_wall").define('#', input).pattern("###").pattern("###")
                        .unlockedBy("has_" + inputPath, this.has(input)).save(this.output);
            }
            public void concreteStairs(RecipeCategory category, ItemLike output, ItemLike input) {
                String inputPath = idPath(input);
                this.shaped(category, output, 4).group("concrete_stairs").define('#', input).pattern("#  ").pattern("## ").pattern("###")
                        .unlockedBy("has_" + inputPath, this.has(input)).save(this.output);
            }
            public void concreteSlab(RecipeCategory category, ItemLike output, ItemLike input) {
                String inputPath = idPath(input);
                this.shaped(category, output, 6).group("concrete_slab").define('#', input).pattern("###")
                        .unlockedBy("has_" + inputPath, this.has(input)).save(this.output);
            }
            public void concreteWall(RecipeCategory category, ItemLike output, ItemLike input) {
                String inputPath = idPath(input);
                this.shaped(category, output, 6).group("concrete_wall").define('#', input).pattern("###").pattern("###")
                        .unlockedBy("has_" + inputPath, this.has(input)).save(this.output);
            }
            private static String idPath(ItemLike item) {
                return BuiltInRegistries.ITEM.getKey(item.asItem()).getPath();
            }
        };
    }
    @Override
    public @NonNull String getName() {
        return "Cinch's Missing Block Recipes";
    }
}