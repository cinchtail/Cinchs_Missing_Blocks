package net.cinchtail.cinchsmissingblocks.datagen;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {


                //Cracked Block Smelting
                offerCrackingRecipe(ModBlocks.CRACKED_MUD_BRICKS, Blocks.MUD_BRICKS);

                offerCrackingRecipe(ModBlocks.CRACKED_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS);

                offerCrackingRecipe(ModBlocks.CRACKED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS);

                offerCrackingRecipe(ModBlocks.CRACKED_BRICKS, Blocks.BRICKS);

                offerCrackingRecipe(ModBlocks.CRACKED_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS);

                offerCrackingRecipe(ModBlocks.CRACKED_END_STONE_BRICKS, Blocks.END_STONE_BRICKS);

                offerCrackingRecipe(ModBlocks.CRACKED_TUFF_BRICKS, Blocks.TUFF_BRICKS);

                offerCrackingRecipe(ModBlocks.CRACKED_CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS);

                offerCrackingRecipe(ModBlocks.CRACKED_DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICKS);

                offerCrackingRecipe(ModBlocks.CRACKED_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS);

                offerCrackingRecipe(ModBlocks.CRACKED_GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS);

                offerCrackingRecipe(ModBlocks.CRACKED_DIORITE_BRICKS, ModBlocks.DIORITE_BRICKS);

                offerCrackingRecipe(ModBlocks.CRACKED_RESIN_BRICKS, Blocks.RESIN_BRICKS);


                //Mossy Blocks
                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_andesite_bricks",
                        ModBlocks.MOSSY_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS, "mossy_andesite_bricks_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_andesite_bricks",
                        ModBlocks.MOSSY_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS, "mossy_andesite_bricks_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_andesite_bricks",
                        ModBlocks.MOSSY_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS, "mossy_andesite_bricks_from_moss_carpet");

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_granite_bricks",
                        ModBlocks.MOSSY_GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS, "mossy_granite_bricks_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_granite_bricks",
                        ModBlocks.MOSSY_GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS, "mossy_granite_bricks_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_granite_bricks",
                        ModBlocks.MOSSY_GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS, "mossy_granite_bricks_from_moss_carpet");

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_diorite_bricks",
                        ModBlocks.MOSSY_DIORITE_BRICKS, ModBlocks.DIORITE_BRICKS, "mossy_diorite_bricks_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_diorite_bricks",
                        ModBlocks.MOSSY_DIORITE_BRICKS, ModBlocks.DIORITE_BRICKS, "mossy_diorite_bricks_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_diorite_bricks",
                        ModBlocks.MOSSY_DIORITE_BRICKS, ModBlocks.DIORITE_BRICKS, "mossy_diorite_bricks_from_moss_carpet");

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_tuff_bricks",
                        ModBlocks.MOSSY_TUFF_BRICKS, Blocks.TUFF_BRICKS, "mossy_tuff_bricks_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_tuff_bricks",
                        ModBlocks.MOSSY_TUFF_BRICKS, Blocks.TUFF_BRICKS, "mossy_tuff_bricks_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_tuff_bricks",
                        ModBlocks.MOSSY_TUFF_BRICKS, Blocks.TUFF_BRICKS, "mossy_tuff_bricks_from_moss_carpet");

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_calcite_bricks",
                        ModBlocks.MOSSY_CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS, "mossy_calcite_bricks_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_calcite_bricks",
                        ModBlocks.MOSSY_CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS, "mossy_calcite_bricks_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_calcite_bricks",
                        ModBlocks.MOSSY_CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS, "mossy_calcite_bricks_from_moss_carpet");

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_dripstone_bricks",
                        ModBlocks.MOSSY_DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICKS, "mossy_dripstone_bricks_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_dripstone_bricks",
                        ModBlocks.MOSSY_DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICKS, "mossy_dripstone_bricks_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_dripstone_bricks",
                        ModBlocks.MOSSY_DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICKS, "mossy_dripstone_bricks_from_moss_carpet");

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_mud_bricks",
                        ModBlocks.MOSSY_MUD_BRICKS, Blocks.MUD_BRICKS, "mossy_mud_bricks_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_mud_bricks",
                        ModBlocks.MOSSY_MUD_BRICKS, Blocks.MUD_BRICKS, "mossy_mud_bricks_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_mud_bricks",
                        ModBlocks.MOSSY_MUD_BRICKS, Blocks.MUD_BRICKS, "mossy_mud_bricks_from_moss_carpet");

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_prismarine_bricks",
                        ModBlocks.MOSSY_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS, "mossy_prismarine_bricks_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_prismarine_bricks",
                        ModBlocks.MOSSY_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS, "mossy_prismarine_bricks_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_prismarine_bricks",
                        ModBlocks.MOSSY_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS, "mossy_prismarine_bricks_from_moss_carpet");

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_bricks",
                        ModBlocks.MOSSY_BRICKS, Blocks.BRICKS, "mossy_bricks_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_bricks",
                        ModBlocks.MOSSY_BRICKS, Blocks.BRICKS, "mossy_bricks_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_bricks",
                        ModBlocks.MOSSY_BRICKS, Blocks.BRICKS, "mossy_bricks_from_moss_carpet");

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_quartz_bricks",
                        ModBlocks.MOSSY_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS, "mossy_quartz_bricks_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_quartz_bricks",
                        ModBlocks.MOSSY_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS, "mossy_quartz_bricks_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_quartz_bricks",
                        ModBlocks.MOSSY_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS, "mossy_quartz_bricks_from_moss_carpet");

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_cobbled_deepslate",
                        ModBlocks.MOSSY_COBBLED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE, "mossy_cobbled_deepslate_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_cobbled_deepslate",
                        ModBlocks.MOSSY_COBBLED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE, "mossy_cobbled_deepslate_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_cobbled_deepslate",
                        ModBlocks.MOSSY_COBBLED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE, "mossy_cobbled_deepslate_from_moss_carpet");

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_deepslate_bricks",
                        ModBlocks.MOSSY_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS, "mossy_deepslate_bricks_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_deepslate_bricks",
                        ModBlocks.MOSSY_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS, "mossy_deepslate_bricks_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_deepslate_bricks",
                        ModBlocks.MOSSY_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS, "mossy_deepslate_bricks_from_moss_carpet");

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_deepslate_tiles",
                        ModBlocks.MOSSY_DEEPSLATE_TILES, Blocks.DEEPSLATE_TILES, "mossy_deepslate_tiles_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_deepslate_tiles",
                        ModBlocks.MOSSY_DEEPSLATE_TILES, Blocks.DEEPSLATE_TILES, "mossy_deepslate_tiles_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_deepslate_tiles",
                        ModBlocks.MOSSY_DEEPSLATE_TILES, Blocks.DEEPSLATE_TILES, "mossy_deepslate_tiles_from_moss_carpet");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_cobblestone",
                        Blocks.MOSSY_COBBLESTONE, Blocks.COBBLESTONE, "mossy_cobblestone_from_moss_carpet");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_stone_bricks",
                        Blocks.MOSSY_STONE_BRICKS, Blocks.STONE_BRICKS, "mossy_stone_bricks_from_moss_carpet");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICKS)
                        .group("mossy_resin_bricks")
                        .input(Blocks.RESIN_BRICKS)
                        .input(Blocks.PALE_MOSS_BLOCK)
                        .criterion(hasItem(Blocks.PALE_MOSS_BLOCK), conditionsFromItem(Blocks.PALE_MOSS_BLOCK))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "mossy_resin_brick_from_pale_moss_block")));

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICKS)
                        .group("mossy_resin_bricks")
                        .input(Blocks.RESIN_BRICKS)
                        .input(Blocks.PALE_HANGING_MOSS)
                        .criterion(hasItem(Blocks.PALE_HANGING_MOSS), conditionsFromItem(Blocks.PALE_HANGING_MOSS))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "mossy_resin_brick_from_pale_hanging_moss")));

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICKS)
                        .group("mossy_resin_bricks")
                        .pattern("B")
                        .pattern("A")
                        .pattern("B")
                        .input('A', Blocks.RESIN_BRICKS)
                        .input('B', Blocks.PALE_MOSS_CARPET)
                        .criterion(hasItem(Blocks.PALE_MOSS_CARPET), conditionsFromItem(Blocks.PALE_MOSS_CARPET))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "mossy_resin_brick_from_pale_moss_carpet")));


                //Chiseled Blocks
                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS, Blocks.END_STONE_BRICK_SLAB);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS, Blocks.END_STONE_BRICKS);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_MUD_BRICKS, Blocks.MUD_BRICK_SLAB);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_MUD_BRICKS, Blocks.MUD_BRICKS);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICK_SLAB);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICK_SLAB);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS, Blocks.ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, ModBlocks.GRANITE_BRICK_SLAB);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, Blocks.GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS, ModBlocks.DIORITE_BRICK_SLAB);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS, Blocks.DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS, ModBlocks.DIORITE_BRICKS);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICK_SLAB);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS, ModBlocks.POLISHED_DRIPSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICKS);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS, ModBlocks.CALCITE_BRICK_SLAB);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_TUFF, Blocks.POLISHED_TUFF);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_TUFF, Blocks.TUFF_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_DEEPSLATE, Blocks.DEEPSLATE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PURPUR, Blocks.PURPUR_SLAB);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PURPUR, Blocks.PURPUR_BLOCK);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BRICKS, Blocks.BRICK_SLAB);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BRICKS, Blocks.BRICKS);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_SLAB);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS);


                //Pillar Blocks
                offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR, Blocks.END_STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR, Blocks.END_STONE_BRICKS);

                offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_PILLAR, Blocks.MUD_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_PILLAR, Blocks.MUD_BRICKS);


                //Miscellaneous Calcite Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

                offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, Blocks.CALCITE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_WALL, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE);

                offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.POLISHED_CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.POLISHED_CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.POLISHED_CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_STAIRS, ModBlocks.CRACKED_CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_STAIRS, ModBlocks.CRACKED_CALCITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_SLAB, ModBlocks.CRACKED_CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_SLAB, ModBlocks.CRACKED_CALCITE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_WALL, ModBlocks.CRACKED_CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_WALL, ModBlocks.CRACKED_CALCITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_STAIRS, ModBlocks.MOSSY_CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_STAIRS, ModBlocks.MOSSY_CALCITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_SLAB, ModBlocks.MOSSY_CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_SLAB, ModBlocks.MOSSY_CALCITE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_WALL, ModBlocks.MOSSY_CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_WALL, ModBlocks.MOSSY_CALCITE_BRICKS);


                //Miscellaneous Dripstone Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

                offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS, ModBlocks.POLISHED_DRIPSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS, ModBlocks.POLISHED_DRIPSTONE);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB, ModBlocks.POLISHED_DRIPSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB, ModBlocks.POLISHED_DRIPSTONE);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_WALL, ModBlocks.POLISHED_DRIPSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_WALL, ModBlocks.POLISHED_DRIPSTONE);

                offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS, ModBlocks.POLISHED_DRIPSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS, ModBlocks.POLISHED_DRIPSTONE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS, ModBlocks.DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS, ModBlocks.POLISHED_DRIPSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS, ModBlocks.DRIPSTONE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, ModBlocks.DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, ModBlocks.POLISHED_DRIPSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, ModBlocks.DRIPSTONE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.POLISHED_DRIPSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.DRIPSTONE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_STAIRS, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_STAIRS, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_WALL, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_WALL, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_WALL, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_WALL, ModBlocks.MOSSY_DRIPSTONE_BRICKS);


                //Miscellaneous Tuff Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_STAIRS, ModBlocks.CRACKED_TUFF_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_STAIRS, ModBlocks.CRACKED_TUFF_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_SLAB, ModBlocks.CRACKED_TUFF_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_SLAB, ModBlocks.CRACKED_TUFF_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_WALL, ModBlocks.CRACKED_TUFF_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_WALL, ModBlocks.CRACKED_TUFF_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_STAIRS, ModBlocks.MOSSY_TUFF_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_STAIRS, ModBlocks.MOSSY_TUFF_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_SLAB, ModBlocks.MOSSY_TUFF_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_SLAB, ModBlocks.MOSSY_TUFF_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_WALL, ModBlocks.MOSSY_TUFF_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_WALL, ModBlocks.MOSSY_TUFF_BRICKS);


                //Miscellaneous Andesite Blocks
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);

                offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.POLISHED_ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.POLISHED_ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS, ModBlocks.CRACKED_ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS, ModBlocks.CRACKED_ANDESITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_SLAB, ModBlocks.CRACKED_ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_SLAB, ModBlocks.CRACKED_ANDESITE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_WALL, ModBlocks.CRACKED_ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_WALL, ModBlocks.CRACKED_ANDESITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS, ModBlocks.MOSSY_ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS, ModBlocks.MOSSY_ANDESITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_SLAB, ModBlocks.MOSSY_ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_SLAB, ModBlocks.MOSSY_ANDESITE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_WALL, ModBlocks.MOSSY_ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_WALL, ModBlocks.MOSSY_ANDESITE_BRICKS);


                //Miscellaneous Granite Blocks
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);

                offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, ModBlocks.GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, Blocks.GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, Blocks.POLISHED_GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, ModBlocks.GRANITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Blocks.GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, Blocks.GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, Blocks.POLISHED_GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_STAIRS, ModBlocks.CRACKED_GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_STAIRS, ModBlocks.CRACKED_GRANITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB, ModBlocks.CRACKED_GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB, ModBlocks.CRACKED_GRANITE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_WALL, ModBlocks.CRACKED_GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_WALL, ModBlocks.CRACKED_GRANITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_STAIRS, ModBlocks.MOSSY_GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_STAIRS, ModBlocks.MOSSY_GRANITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_SLAB, ModBlocks.MOSSY_GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_SLAB, ModBlocks.MOSSY_GRANITE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_WALL, ModBlocks.MOSSY_GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_WALL, ModBlocks.MOSSY_GRANITE_BRICKS);


                //Miscellaneous Diorite Blocks
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);

                offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, ModBlocks.DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, Blocks.DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, Blocks.POLISHED_DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, ModBlocks.DIORITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Blocks.DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, Blocks.DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, Blocks.POLISHED_DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_STAIRS, ModBlocks.CRACKED_DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_STAIRS, ModBlocks.CRACKED_DIORITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_SLAB, ModBlocks.CRACKED_DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_SLAB, ModBlocks.CRACKED_DIORITE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_WALL, ModBlocks.CRACKED_DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_WALL, ModBlocks.CRACKED_DIORITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_STAIRS, ModBlocks.MOSSY_DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_STAIRS, ModBlocks.MOSSY_DIORITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_SLAB, ModBlocks.MOSSY_DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_SLAB, ModBlocks.MOSSY_DIORITE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_WALL, ModBlocks.MOSSY_DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_WALL, ModBlocks.MOSSY_DIORITE_BRICKS);


                //Miscellaneous Quartz Blocks
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_STAIRS, ModBlocks.CRACKED_QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_STAIRS, ModBlocks.CRACKED_QUARTZ_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_SLAB, ModBlocks.CRACKED_QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_SLAB, ModBlocks.CRACKED_QUARTZ_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_WALL, ModBlocks.CRACKED_QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_WALL, ModBlocks.CRACKED_QUARTZ_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS, ModBlocks.MOSSY_QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS, ModBlocks.MOSSY_QUARTZ_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_SLAB, ModBlocks.MOSSY_QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_SLAB, ModBlocks.MOSSY_QUARTZ_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_WALL, ModBlocks.MOSSY_QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_WALL, ModBlocks.MOSSY_QUARTZ_BRICKS);


                //Miscellaneous Brick Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_STAIRS, ModBlocks.CRACKED_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_STAIRS, ModBlocks.CRACKED_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_SLAB, ModBlocks.CRACKED_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_SLAB, ModBlocks.CRACKED_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_WALL, ModBlocks.CRACKED_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_WALL, ModBlocks.CRACKED_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_STAIRS, ModBlocks.MOSSY_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_STAIRS, ModBlocks.MOSSY_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_SLAB, ModBlocks.MOSSY_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_SLAB, ModBlocks.MOSSY_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_WALL, ModBlocks.MOSSY_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_WALL, ModBlocks.MOSSY_BRICKS);


                //Miscellaneous Mud Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_STAIRS, Blocks.PACKED_MUD);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_STAIRS, Blocks.PACKED_MUD);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_STAIRS, ModBlocks.CRACKED_MUD_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_STAIRS, ModBlocks.CRACKED_MUD_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_SLAB, ModBlocks.CRACKED_MUD_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_SLAB, ModBlocks.CRACKED_MUD_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_WALL, ModBlocks.CRACKED_MUD_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_WALL, ModBlocks.CRACKED_MUD_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_STAIRS, ModBlocks.MOSSY_MUD_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_STAIRS, ModBlocks.MOSSY_MUD_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_SLAB, ModBlocks.MOSSY_MUD_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_SLAB, ModBlocks.MOSSY_MUD_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_WALL, ModBlocks.MOSSY_MUD_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_WALL, ModBlocks.MOSSY_MUD_BRICKS);


                //Miscellaneous Resin Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_STAIRS, ModBlocks.CRACKED_RESIN_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_STAIRS, ModBlocks.CRACKED_RESIN_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_SLAB, ModBlocks.CRACKED_RESIN_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_SLAB, ModBlocks.CRACKED_RESIN_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_WALL, ModBlocks.CRACKED_RESIN_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_WALL, ModBlocks.CRACKED_RESIN_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_STAIRS, ModBlocks.MOSSY_RESIN_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_STAIRS, ModBlocks.MOSSY_RESIN_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_SLAB, ModBlocks.MOSSY_RESIN_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_SLAB, ModBlocks.MOSSY_RESIN_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_WALL, ModBlocks.MOSSY_RESIN_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_WALL, ModBlocks.MOSSY_RESIN_BRICKS);


                //Miscellaneous End Stone Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS, Blocks.END_STONE);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Blocks.END_STONE);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL, Blocks.END_STONE);

                offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE, Blocks.END_STONE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS, ModBlocks.POLISHED_END_STONE);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_STAIRS, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_SLAB, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_WALL, ModBlocks.POLISHED_END_STONE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_STAIRS, ModBlocks.CRACKED_END_STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_STAIRS, ModBlocks.CRACKED_END_STONE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_SLAB, ModBlocks.CRACKED_END_STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_SLAB, ModBlocks.CRACKED_END_STONE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_WALL, ModBlocks.CRACKED_END_STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_WALL, ModBlocks.CRACKED_END_STONE_BRICKS);


                //Miscellaneous Stone Blocks
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, Blocks.STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, Blocks.STONE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS, Blocks.CRACKED_STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS, Blocks.CRACKED_STONE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB, Blocks.CRACKED_STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB, Blocks.CRACKED_STONE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_WALL, Blocks.CRACKED_STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_WALL, Blocks.CRACKED_STONE_BRICKS);


                //Miscellaneous Deepslate Blocks

                //Miscellaneous Blackstone Blocks

                //Miscellaneous Netherrack Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);


                //Miscellaneous Nether Brick Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.CRACKED_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.CRACKED_NETHER_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_WALL, Blocks.CRACKED_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_WALL, Blocks.CRACKED_NETHER_BRICKS);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_FENCE)
                        .pattern("ATA")
                        .pattern("ATA")
                        .input('A', Blocks.CRACKED_NETHER_BRICKS)
                        .input('T', Items.NETHER_BRICK)
                        .criterion(hasItem(Blocks.CRACKED_NETHER_BRICKS), conditionsFromItem(Blocks.CRACKED_NETHER_BRICKS))
                        .offerTo(exporter);


                //Miscellaneous Red Nether Brick Blocks
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_NETHER_BRICK_FENCE)
                        .pattern("ATA")
                        .pattern("ATA")
                        .input('A', Blocks.RED_NETHER_BRICKS)
                        .input('T', Items.NETHER_BRICK)
                        .criterion(hasItem(Blocks.RED_NETHER_BRICKS), conditionsFromItem(Blocks.RED_NETHER_BRICKS))
                        .offerTo(exporter);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_WALL, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_WALL, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_FENCE)
                        .pattern("ATA")
                        .pattern("ATA")
                        .input('A', ModBlocks.CRACKED_RED_NETHER_BRICKS)
                        .input('T', Items.NETHER_BRICK)
                        .criterion(hasItem(ModBlocks.CRACKED_RED_NETHER_BRICKS), conditionsFromItem(ModBlocks.CRACKED_RED_NETHER_BRICKS))
                        .offerTo(exporter);


                //Miscellaneous Prismarine Blocks

                //Miscellaneous Snow Blocks
                offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICKS, Blocks.SNOW_BLOCK);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_STAIRS, Blocks.SNOW_BLOCK);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_SLAB, Blocks.SNOW_BLOCK);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_WALL, Blocks.SNOW_BLOCK);


                //Miscellaneous Basalt Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);


                //Miscellaneous Sandstone Blocks

                //Miscellaneous Red Sandstone Blocks

                //Miscellaneous Purpur Blocks
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);











                /*shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', Items.CRACKED_DEEPSLATE_BRICKS)
                        .unlockedBy("has_cracked_deepslate_bricks", has(Items.CRACKED_DEEPSLATE_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_DEEPSLATE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get())
                        .unlockedBy("has_cracked_deepslate_bricks", has(Blocks.CRACKED_DEEPSLATE_BRICKS))
                        .save(output, "cracked_deepslate_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', Items.CRACKED_DEEPSLATE_BRICKS)
                        .unlockedBy("has_cracked_deepslate_bricks", has(Items.CRACKED_DEEPSLATE_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_DEEPSLATE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_cracked_deepslate_bricks", has(Blocks.CRACKED_DEEPSLATE_BRICKS))
                        .save(output, "cracked_deepslate_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Items.CRACKED_DEEPSLATE_BRICKS)
                        .unlockedBy("has_cracked_deepslate_bricks", has(Items.CRACKED_DEEPSLATE_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_DEEPSLATE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get())
                        .unlockedBy("has_cracked_deepslate_bricks", has(Blocks.CRACKED_DEEPSLATE_BRICKS))
                        .save(output, "cracked_deepslate_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', Items.CRACKED_DEEPSLATE_TILES)
                        .unlockedBy("has_cracked_deepslate_tiles", has(Items.CRACKED_DEEPSLATE_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_DEEPSLATE_TILES), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get())
                        .unlockedBy("has_cracked_deepslate_tiles", has(Blocks.CRACKED_DEEPSLATE_TILES))
                        .save(output, "cracked_deepslate_tile_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', Items.CRACKED_DEEPSLATE_TILES)
                        .unlockedBy("has_cracked_deepslate_tiles", has(Items.CRACKED_DEEPSLATE_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_DEEPSLATE_TILES), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(),2)
                        .unlockedBy("has_cracked_deepslate_tiles", has(Blocks.CRACKED_DEEPSLATE_TILES))
                        .save(output, "cracked_deepslate_tile_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Items.CRACKED_DEEPSLATE_TILES)
                        .unlockedBy("has_cracked_deepslate_tiles", has(Items.CRACKED_DEEPSLATE_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_DEEPSLATE_TILES), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get())
                        .unlockedBy("has_cracked_deepslate_tiles", has(Blocks.CRACKED_DEEPSLATE_TILES))
                        .save(output, "cracked_deepslate_tile_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', Items.CRACKED_POLISHED_BLACKSTONE_BRICKS)
                        .unlockedBy("has_cracked_polished_blackstone_bricks", has(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get())
                        .unlockedBy("has_cracked_polished_blackstone_bricks", has(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                        .save(output, "cracked_polished_blackstone_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', Items.CRACKED_POLISHED_BLACKSTONE_BRICKS)
                        .unlockedBy("has_cracked_polished_blackstone_bricks", has(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_cracked_polished_blackstone_bricks", has(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                        .save(output, "cracked_polished_blackstone_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Items.CRACKED_POLISHED_BLACKSTONE_BRICKS)
                        .unlockedBy("has_cracked_polished_blackstone_bricks", has(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get())
                        .unlockedBy("has_cracked_polished_blackstone_bricks", has(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                        .save(output, "cracked_polished_blackstone_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', Items.CUT_RED_SANDSTONE)
                        .unlockedBy("has_cut_red_sandstone", has(Items.CUT_RED_SANDSTONE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS.get())
                        .unlockedBy("has_cut_red_sandstone", has(Blocks.CUT_RED_SANDSTONE))
                        .save(output, "cut_red_sandstone_stairs_from_stonecutting_from_cut_red_sandstone");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS.get())
                        .unlockedBy("has_red_sandstone", has(Blocks.RED_SANDSTONE))
                        .save(output, "cut_red_sandstone_stairs_from_stonecutting_from_red_sandstone");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Items.CUT_RED_SANDSTONE)
                        .unlockedBy("has_cut_red_sandstone", has(Items.CUT_RED_SANDSTONE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL.get())
                        .unlockedBy("has_cut_red_sandstone", has(Blocks.CUT_RED_SANDSTONE))
                        .save(output, "cut_red_sandstone_wall_from_stonecutting_from_cut_red_sandstone");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL.get())
                        .unlockedBy("has_red_sandstone", has(Blocks.RED_SANDSTONE))
                        .save(output, "cut_red_sandstone_wall_from_stonecutting_from_red_sandstone");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', Items.CUT_SANDSTONE)
                        .unlockedBy("has_cut_sandstone", has(Items.CUT_SANDSTONE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS.get())
                        .unlockedBy("has_cut_sandstone", has(Blocks.CUT_SANDSTONE))
                        .save(output, "cut_sandstone_stairs_from_stonecutting_from_cut_sandstone");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS.get())
                        .unlockedBy("has_sandstone", has(Blocks.SANDSTONE))
                        .save(output, "cut_sandstone_stairs_from_stonecutting_from_sandstone");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Items.CUT_SANDSTONE)
                        .unlockedBy("has_cut_sandstone", has(Items.CUT_SANDSTONE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL.get())
                        .unlockedBy("has_cut_sandstone", has(Blocks.CUT_SANDSTONE))
                        .save(output, "cut_sandstone_wall_from_stonecutting_from_cut_sandstone");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL.get())
                        .unlockedBy("has_sandstone", has(Blocks.SANDSTONE))
                        .save(output, "cut_sandstone_wall_from_stonecutting_frpm_sandstone");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Items.DARK_PRISMARINE)
                        .unlockedBy("has_dark_prismarine", has(Items.DARK_PRISMARINE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DARK_PRISMARINE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL.get())
                        .unlockedBy("has_dark_prismarine", has(Blocks.DARK_PRISMARINE))
                        .save(output, "dark_prismarine_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.PRISMARINE_BRICKS)
                        .unlockedBy("has_prismarine_bricks", has(Blocks.PRISMARINE_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PRISMARINE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL.get())
                        .unlockedBy("has_prismarine_bricks", has(Blocks.PRISMARINE_BRICKS))
                        .save(output, "prismarine_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.SMOOTH_RED_SANDSTONE)
                        .unlockedBy("has_smooth_red_sandstone", has(Blocks.SMOOTH_RED_SANDSTONE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get())
                        .unlockedBy("has_smooth_red_sandstone", has(Blocks.SMOOTH_RED_SANDSTONE))
                        .save(output, "smooth_red_sandstone_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.SMOOTH_SANDSTONE)
                        .unlockedBy("has_smooth_sandstone", has(Blocks.SMOOTH_SANDSTONE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL.get())
                        .unlockedBy("has_smooth_sandstone", has(Blocks.SMOOTH_SANDSTONE))
                        .save(output, "smooth_sandstone_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', Blocks.SMOOTH_STONE)
                        .unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS.get())
                        .unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE))
                        .save(output, "smooth_stone_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_PRISMARINE_BRICKS.get())
                        .unlockedBy("has_cracked_prismarine_bricks", has(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_STAIRS.get())
                        .unlockedBy("has_cracked_prismarine_bricks", has(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()))
                        .save(output, "cracked_prismarine_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_PRISMARINE_BRICKS.get())
                        .unlockedBy("has_cracked_prismarine_bricks", has(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_cracked_prismarine_bricks", has(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()))
                        .save(output, "cracked_prismarine_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_PRISMARINE_BRICKS.get())
                        .unlockedBy("has_cracked_prismarine_bricks", has(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_WALL.get())
                        .unlockedBy("has_cracked_prismarine_bricks", has(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()))
                        .save(output, "cracked_prismarine_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_PRISMARINE_BRICKS.get())
                        .unlockedBy("has_mossy_prismarine_bricks", has(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_STAIRS.get())
                        .unlockedBy("has_mossy_prismarine_bricks", has(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()))
                        .save(output, "mossy_prismarine_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_PRISMARINE_BRICKS.get())
                        .unlockedBy("has_mossy_prismarine_bricks", has(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_mossy_prismarine_bricks", has(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()))
                        .save(output, "mossy_prismarine_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_PRISMARINE_BRICKS.get())
                        .unlockedBy("has_mossy_prismarine_bricks", has(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_WALL.get())
                        .unlockedBy("has_mossy_prismarine_bricks", has(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()))
                        .save(output, "mossy_prismarine_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_COBBLED_DEEPSLATE.get())
                        .unlockedBy("has_mossy_cobbled_deepslate", has(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS.get())
                        .unlockedBy("has_mossy_cobbled_deepslate", has(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()))
                        .save(output, "mossy_cobbled_deepslate_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_COBBLED_DEEPSLATE.get())
                        .unlockedBy("has_mossy_cobbled_deepslate", has(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB.get(),2)
                        .unlockedBy("has_mossy_cobbled_deepslate", has(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()))
                        .save(output, "mossy_cobbled_deepslate_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_COBBLED_DEEPSLATE.get())
                        .unlockedBy("has_mossy_cobbled_deepslate", has(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL.get())
                        .unlockedBy("has_mossy_cobbled_deepslate", has(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()))
                        .save(output, "mossy_cobbled_deepslate_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_DEEPSLATE_BRICKS.get())
                        .unlockedBy("has_mossy_deepslate_bricks", has(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS.get())
                        .unlockedBy("has_mossy_deepslate_bricks", has(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()))
                        .save(output, "mossy_deepslate_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_DEEPSLATE_BRICKS.get())
                        .unlockedBy("has_mossy_deepslate_bricks", has(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_mossy_deepslate_bricks", has(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()))
                        .save(output, "mossy_deepslate_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_DEEPSLATE_BRICKS.get())
                        .unlockedBy("has_mossy_deepslate_bricks", has(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL.get())
                        .unlockedBy("has_mossy_deepslate_bricks", has(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()))
                        .save(output, "mossy_deepslate_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_DEEPSLATE_TILES.get())
                        .unlockedBy("has_mossy_deepslate_tile_bricks", has(ModBlocks.MOSSY_DEEPSLATE_TILES.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DEEPSLATE_TILES.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS.get())
                        .unlockedBy("has_mossy_deepslate_tile_bricks", has(ModBlocks.MOSSY_DEEPSLATE_TILES.get()))
                        .save(output, "mossy_deepslate_tile_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_DEEPSLATE_TILES.get())
                        .unlockedBy("has_mossy_deepslate_tile_bricks", has(ModBlocks.MOSSY_DEEPSLATE_TILES.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DEEPSLATE_TILES.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB.get(),2)
                        .unlockedBy("has_mossy_deepslate_tile_bricks", has(ModBlocks.MOSSY_DEEPSLATE_TILES.get()))
                        .save(output, "mossy_deepslate_tile_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_DEEPSLATE_TILES.get())
                        .unlockedBy("has_mossy_deepslate_tile_bricks", has(ModBlocks.MOSSY_DEEPSLATE_TILES.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DEEPSLATE_TILES.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_WALL.get())
                        .unlockedBy("has_mossy_deepslate_tile_bricks", has(ModBlocks.MOSSY_DEEPSLATE_TILES.get()))
                        .save(output, "mossy_deepslate_tile_wall_from_stonecutting");

                shaped(RecipeCategory.REDSTONE, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.get())
                        .pattern("AA")
                        .define('A', Blocks.POLISHED_DEEPSLATE)
                        .unlockedBy("has_polished_deepslate", has(Blocks.POLISHED_DEEPSLATE))
                        .save(output);

                shapeless(RecipeCategory.REDSTONE, ModBlocks.POLISHED_DEEPSLATE_BUTTON.get())
                        .requires(Blocks.POLISHED_DEEPSLATE)
                        .unlockedBy("has_polished_deepslate", has(Blocks.POLISHED_DEEPSLATE))
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', Blocks.DEEPSLATE)
                        .unlockedBy("has_deepslate", has(Blocks.DEEPSLATE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_STAIRS.get())
                        .unlockedBy("has_deepslate", has(Blocks.DEEPSLATE))
                        .save(output, "deepslate_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', Blocks.DEEPSLATE)
                        .unlockedBy("has_deepslate", has(Blocks.DEEPSLATE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB.get(),2)
                        .unlockedBy("has_deepslate", has(Blocks.DEEPSLATE))
                        .save(output, "deepslate_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.DEEPSLATE)
                        .unlockedBy("has_deepslate", has(Blocks.DEEPSLATE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_WALL.get())
                        .unlockedBy("has_deepslate", has(Blocks.DEEPSLATE))
                        .save(output, "deepslate_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_INLAID_DEEPSLATE.get())
                        .pattern("A")
                        .pattern("B")
                        .pattern("A")
                        .define('A', Blocks.DEEPSLATE_BRICK_SLAB)
                        .define('B', Blocks.SCULK)
                        .unlockedBy("has_sculk", has(Blocks.SCULK))
                        .save(output);*/

            }
            public CraftingRecipeJsonBuilder modCreateStairsRecipe(RecipeCategory category, ItemConvertible output, Ingredient input) {
                return this.createShaped(category, output, 4).input('#', input).pattern("#  ").pattern("## ").pattern("###");
            }
            public void offerStairsRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
                this.modCreateStairsRecipe(category, output, Ingredient.ofItem(input)).criterion(hasItem(input), this.conditionsFromItem(input)).offerTo(this.exporter);
            }
            public void offerBricksRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
                this.createCondensingRecipe(category, output, Ingredient.ofItem(input)).criterion(hasItem(input), this.conditionsFromItem(input)).offerTo(this.exporter);
            }
            public void offerPillarBlockRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
                this.createpillarBlockRecipe(category, output, Ingredient.ofItem(input)).criterion(hasItem(input), this.conditionsFromItem(input)).offerTo(this.exporter);
            }
            public ShapedRecipeJsonBuilder createpillarBlockRecipe(RecipeCategory category, ItemConvertible output, Ingredient input) {
                return this.createShaped(category, output).input('#', input).pattern("#").pattern("#");
            }
            public void offerMossyFromMossBlockRecipe(RecipeCategory category, @Nullable String compactingGroup, ItemConvertible output, ItemConvertible input, String fileName) {
                this.createShapeless(category, output, 1).group(compactingGroup).input(input).input(Blocks.MOSS_BLOCK).criterion("has_moss_block",
                        this.conditionsFromItem(Blocks.MOSS_BLOCK)).offerTo(this.exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, fileName)));
            }
            public void offerMossyFromVineRecipe(RecipeCategory category, @Nullable String compactingGroup, ItemConvertible output, ItemConvertible input, String fileName) {
                this.createShapeless(category, output, 1).group(compactingGroup).input(input).input(Blocks.VINE).criterion("has_vine",
                        this.conditionsFromItem(Blocks.VINE)).offerTo(this.exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, fileName)));
            }
            public void offerMossyFromMossCarpetRecipe(RecipeCategory category, @Nullable String compactingGroup, ItemConvertible output, ItemConvertible input, String fileName) {
                this.createShaped(category, output, 1).group(compactingGroup).input('#', Blocks.MOSS_CARPET).input('B', input).pattern("#").pattern("B").pattern("#").criterion("has_moss_carpet",
                        this.conditionsFromItem(Blocks.MOSS_CARPET)).offerTo(this.exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, fileName)));
            }
        };
    }
    @Override
    public String getName() {
        return "Cinch's Missing Block Recipes";
    }
}