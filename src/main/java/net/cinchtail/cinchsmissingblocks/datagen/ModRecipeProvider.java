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
                        ModBlocks.MOSSY_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS, "mossy_andesite_brick_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_andesite_bricks",
                        ModBlocks.MOSSY_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS, "mossy_andesite_brick_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_andesite_bricks",
                        ModBlocks.MOSSY_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS, "mossy_andesite_brick_from_moss_carpet");







                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICKS)
                        .group("mossy_calcite_bricks")
                        .input(ModBlocks.CALCITE_BRICKS)
                        .input(Blocks.MOSS_BLOCK)
                        .criterion(hasItem(Blocks.MOSS_BLOCK), conditionsFromItem(Blocks.MOSS_BLOCK))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "mossy_calcite_brick_from_moss_block")));

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICKS)
                        .group("mossy_calcite_bricks")
                        .input(ModBlocks.CALCITE_BRICKS)
                        .input(Blocks.VINE)
                        .criterion(hasItem(Blocks.VINE), conditionsFromItem(Blocks.VINE))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "mossy_calcite_brick_from_vine")));

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICKS)
                        .group("mossy_calcite_bricks")
                        .pattern("B")
                        .pattern("A")
                        .pattern("B")
                        .input('A', ModBlocks.CALCITE_BRICKS)
                        .input('B', Blocks.MOSS_CARPET)
                        .criterion(hasItem(Blocks.MOSS_CARPET), conditionsFromItem(Blocks.MOSS_CARPET))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "mossy_calcite_brick_from_moss_carpet")));

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICKS)
                        .group("mossy_mud_bricks")
                        .input(Blocks.MUD_BRICKS)
                        .input(Blocks.MOSS_BLOCK)
                        .criterion(hasItem(Blocks.MOSS_BLOCK), conditionsFromItem(Blocks.MOSS_BLOCK))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "mossy_mud_brick_from_moss_block")));

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICKS)
                        .group("mossy_mud_bricks")
                        .input(Blocks.MUD_BRICKS)
                        .input(Blocks.VINE)
                        .criterion(hasItem(Blocks.VINE), conditionsFromItem(Blocks.VINE))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "mossy_mud_brick_from_vine")));

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICKS)
                        .group("mossy_mud_bricks")
                        .pattern("A")
                        .pattern("Z")
                        .pattern("A")
                        .input('A', Blocks.MOSS_CARPET)
                        .input('Z', Blocks.MUD_BRICKS)
                        .criterion(hasItem(Blocks.MOSS_CARPET), conditionsFromItem(Blocks.MOSS_CARPET))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "mossy_mud_brick_from_moss_carpet")));


                //Chiseled Blocks
                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS, Blocks.END_STONE);

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

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, ModBlocks.ANDESITE_BRICK_SLAB);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, Blocks.GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS, ModBlocks.ANDESITE_BRICK_SLAB);

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


                //miscellaneous Blocks
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

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_MUD_BRICKS.get())
                        .unlockedBy("has_cracked_mud_bricks", has(ModBlocks.CRACKED_MUD_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_MUD_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_STAIRS.get())
                        .unlockedBy("has_cracked_mud_bricks", has(ModBlocks.CRACKED_MUD_BRICKS.get()))
                        .save(output, "cracked_mud_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_MUD_BRICKS.get())
                        .unlockedBy("has_cracked_mud_bricks", has(ModBlocks.CRACKED_MUD_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_MUD_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_SLAB.get(),2)
                        .unlockedBy("has_cracked_mud_bricks", has(ModBlocks.CRACKED_MUD_BRICKS.get()))
                        .save(output, "cracked_mud_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_MUD_BRICKS.get())
                        .unlockedBy("has_cracked_mud_bricks", has(ModBlocks.CRACKED_MUD_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_MUD_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_WALL.get())
                        .unlockedBy("has_cracked_mud_bricks", has(ModBlocks.CRACKED_MUD_BRICKS.get()))
                        .save(output, "cracked_mud_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', Items.CRACKED_NETHER_BRICKS)
                        .unlockedBy("has_cracked_nether_bricks", has(Items.CRACKED_NETHER_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS.get())
                        .unlockedBy("has_cracked_nether_bricks", has(Blocks.CRACKED_NETHER_BRICKS))
                        .save(output, "cracked_nether_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', Items.CRACKED_NETHER_BRICKS)
                        .unlockedBy("has_cracked_nether_bricks", has(Items.CRACKED_NETHER_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB.get(),2)
                        .unlockedBy("has_cracked_nether_bricks", has(Blocks.CRACKED_NETHER_BRICKS))
                        .save(output, "cracked_nether_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Items.CRACKED_NETHER_BRICKS)
                        .unlockedBy("has_cracked_nether_bricks", has(Items.CRACKED_NETHER_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_WALL.get())
                        .unlockedBy("has_cracked_nether_bricks", has(Blocks.CRACKED_NETHER_BRICKS))
                        .save(output, "cracked_nether_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_FENCE.get(),3)
                        .pattern("ATA")
                        .pattern("ATA")
                        .define('A', Blocks.CRACKED_NETHER_BRICKS)
                        .define('T', Items.NETHER_BRICK)
                        .unlockedBy("has_cracked_nether_bricks", has(Blocks.CRACKED_NETHER_BRICKS))
                        .save(output);

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

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_QUARTZ_BRICKS.get())
                        .unlockedBy("has_cracked_quartz_bricks", has(ModBlocks.CRACKED_QUARTZ_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_QUARTZ_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_STAIRS.get())
                        .unlockedBy("has_cracked_quartz_bricks", has(ModBlocks.CRACKED_QUARTZ_BRICKS.get()))
                        .save(output, "cracked_quartz_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_QUARTZ_BRICKS.get())
                        .unlockedBy("has_cracked_quartz_bricks", has(ModBlocks.CRACKED_QUARTZ_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_QUARTZ_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_SLAB.get(),2)
                        .unlockedBy("has_cracked_quartz_bricks", has(ModBlocks.CRACKED_QUARTZ_BRICKS.get()))
                        .save(output, "cracked_quartz_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_QUARTZ_BRICKS.get())
                        .unlockedBy("has_cracked_quartz_bricks", has(ModBlocks.CRACKED_QUARTZ_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_QUARTZ_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_WALL.get())
                        .unlockedBy("has_cracked_quartz_bricks", has(ModBlocks.CRACKED_QUARTZ_BRICKS.get()))
                        .save(output, "cracked_quartz_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_RED_NETHER_BRICKS.get())
                        .unlockedBy("has_cracked_red_nether_bricks", has(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_STAIRS.get())
                        .unlockedBy("has_cracked_red_nether_bricks", has(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()))
                        .save(output, "cracked_red_nether_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_RED_NETHER_BRICKS.get())
                        .unlockedBy("has_cracked_red_nether_bricks", has(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB.get(),2)
                        .unlockedBy("has_cracked_red_nether_bricks", has(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()))
                        .save(output, "cracked_red_nether_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_RED_NETHER_BRICKS.get())
                        .unlockedBy("has_cracked_red_nether_bricks", has(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_WALL.get())
                        .unlockedBy("has_cracked_red_nether_bricks", has(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()))
                        .save(output, "cracked_red_nether_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_FENCE.get(),3)
                        .pattern("ATA")
                        .pattern("ATA")
                        .define('A', ModBlocks.CRACKED_RED_NETHER_BRICKS.get())
                        .define('T', Items.NETHER_BRICK)
                        .unlockedBy("has_cracked_red_nether_bricks", has(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()))
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', Items.CRACKED_STONE_BRICKS)
                        .unlockedBy("has_cracked_stone_bricks", has(Items.CRACKED_STONE_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS.get())
                        .unlockedBy("has_cracked_stone_bricks", has(Blocks.CRACKED_STONE_BRICKS))
                        .save(output, "cracked_stone_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', Items.CRACKED_STONE_BRICKS)
                        .unlockedBy("has_cracked_stone_bricks", has(Items.CRACKED_STONE_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_cracked_stone_bricks", has(Blocks.CRACKED_STONE_BRICKS))
                        .save(output, "cracked_stone_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Items.CRACKED_STONE_BRICKS)
                        .unlockedBy("has_cracked_stone_bricks", has(Items.CRACKED_STONE_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_WALL.get())
                        .unlockedBy("has_cut_red_sandstone_bricks", has(Blocks.CRACKED_STONE_BRICKS))
                        .save(output, "cracked_cut_red_sandstone_wall_from_stonecutting");

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

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', Items.DRIPSTONE_BLOCK)
                        .unlockedBy("has_dripstone_block", has(Items.DRIPSTONE_BLOCK))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_STAIRS.get())
                        .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                        .save(output, "dripstone_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', Items.DRIPSTONE_BLOCK)
                        .unlockedBy("has_dripstone_block", has(Items.DRIPSTONE_BLOCK))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB.get(),2)
                        .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                        .save(output, "dripstone_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Items.DRIPSTONE_BLOCK)
                        .unlockedBy("has_dripstone_block", has(Items.DRIPSTONE_BLOCK))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_WALL.get())
                        .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                        .save(output, "dripstone_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', Items.END_STONE)
                        .unlockedBy("has_end_stone", has(Items.END_STONE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS.get())
                        .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                        .save(output, "end_stone_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', Items.END_STONE)
                        .unlockedBy("has_end_stone", has(Items.END_STONE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB.get(),2)
                        .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                        .save(output, "end_stone_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Items.END_STONE)
                        .unlockedBy("has_end_stone", has(Items.END_STONE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL.get())
                        .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                        .save(output, "end_stone_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', Blocks.PACKED_MUD)
                        .unlockedBy("has_packed_mud", has(Blocks.PACKED_MUD))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PACKED_MUD), RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_STAIRS.get())
                        .unlockedBy("has_packed_mud", has(Blocks.PACKED_MUD))
                        .save(output, "packed_mud_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', Blocks.PACKED_MUD)
                        .unlockedBy("has_packed_mud", has(Blocks.PACKED_MUD))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PACKED_MUD), RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB.get(),2)
                        .unlockedBy("has_packed_mud", has(Blocks.PACKED_MUD))
                        .save(output, "packed_mud_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.PACKED_MUD)
                        .unlockedBy("has_packed_mud", has(Blocks.PACKED_MUD))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PACKED_MUD), RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_WALL.get())
                        .unlockedBy("has_packed_mud", has(Blocks.PACKED_MUD))
                        .save(output, "packed_mud_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_MUD_BRICKS.get())
                        .unlockedBy("has_mossy_mud_bricks", has(ModBlocks.MOSSY_MUD_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_MUD_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_STAIRS.get())
                        .unlockedBy("has_mossy_mud_bricks", has(ModBlocks.MOSSY_MUD_BRICKS.get()))
                        .save(output, "mossy_mud_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_MUD_BRICKS.get())
                        .unlockedBy("has_mossy_mud_bricks", has(ModBlocks.MOSSY_MUD_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_MUD_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_SLAB.get(),2)
                        .unlockedBy("has_mossy_mud_bricks", has(ModBlocks.MOSSY_MUD_BRICKS.get()))
                        .save(output, "mossy_mud_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_MUD_BRICKS.get())
                        .unlockedBy("has_mossy_mud_bricks", has(ModBlocks.MOSSY_MUD_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_MUD_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_WALL.get())
                        .unlockedBy("has_mossy_mud_bricks", has(ModBlocks.MOSSY_MUD_BRICKS.get()))
                        .save(output, "mossy_mud_brick_wall_from_stonecutting");



                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.POLISHED_ANDESITE)
                        .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL.get())
                        .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                        .save(output, "polished_andesite_wall_from_stonecutting");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL.get())
                        .unlockedBy("has_andesite", has(Blocks.ANDESITE))
                        .save(output, "polished_andesite_wall_from_stonecutting_from_andesite");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS.get(),4)
                        .pattern("AA")
                        .pattern("AA")
                        .define('A', Blocks.POLISHED_ANDESITE)
                        .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS.get())
                        .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                        .save(output, "andesite_bricks_from_stonecutting_polished_andesite");


                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.ANDESITE_BRICKS.get())
                        .unlockedBy("has_andesite_bricks", has(ModBlocks.ANDESITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS.get())
                        .unlockedBy("has_andesite_bricks", has(ModBlocks.ANDESITE_BRICKS.get()))
                        .save(output, "andesite_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.ANDESITE_BRICKS.get())
                        .unlockedBy("has_andesite_bricks", has(ModBlocks.ANDESITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_andesite_bricks", has(ModBlocks.ANDESITE_BRICKS.get()))
                        .save(output, "andesite_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.ANDESITE_BRICKS.get())
                        .unlockedBy("has_andesite_bricks", has(ModBlocks.ANDESITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL.get())
                        .unlockedBy("has_andesite_bricks", has(ModBlocks.ANDESITE_BRICKS.get()))
                        .save(output, "andesite_brick_wall_from_stonecutting_from_andesite_bricks");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS.get())
                        .unlockedBy("has_andesite", has(Blocks.ANDESITE))
                        .save(output, "andesite_bricks_from_stonecutting_from_andesite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS.get())
                        .unlockedBy("has_andesite", has(Blocks.ANDESITE))
                        .save(output, "andesite_brick_stairs_from_stonecutting_from_andesite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_andesite", has(Blocks.ANDESITE))
                        .save(output, "andesite_brick_slab_from_stonecutting_from_andesite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL.get())
                        .unlockedBy("has_andesite", has(Blocks.ANDESITE))
                        .save(output, "andesite_brick_wall_from_stonecutting_from_andesite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS.get())
                        .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                        .save(output, "andesite_brick_stairs_from_stonecutting_from_polished_andesite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                        .save(output, "andesite_brick_slab_from_stonecutting_from_polished_andesite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL.get())
                        .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                        .save(output, "andesite_brick_wall_from_stonecutting_from_polished_andesite");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_ANDESITE_BRICKS.get())
                        .unlockedBy("has_cracked_andesite_bricks", has(ModBlocks.CRACKED_ANDESITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS.get())
                        .unlockedBy("has_cracked_andesite_bricks", has(ModBlocks.CRACKED_ANDESITE_BRICKS.get()))
                        .save(output, "cracked_andesite_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_ANDESITE_BRICKS.get())
                        .unlockedBy("has_cracked_andesite_bricks", has(ModBlocks.CRACKED_ANDESITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_cracked_andesite_bricks", has(ModBlocks.CRACKED_ANDESITE_BRICKS.get()))
                        .save(output, "cracked_andesite_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_ANDESITE_BRICKS.get())
                        .unlockedBy("has_cracked_andesite_bricks", has(ModBlocks.CRACKED_ANDESITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_WALL.get())
                        .unlockedBy("has_cracked_andesite_bricks", has(ModBlocks.CRACKED_ANDESITE_BRICKS.get()))
                        .save(output, "cracked_andesite_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_ANDESITE_BRICKS.get())
                        .unlockedBy("has_mossy_andesite_bricks", has(ModBlocks.MOSSY_ANDESITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS.get())
                        .unlockedBy("has_mossy_andesite_bricks", has(ModBlocks.MOSSY_ANDESITE_BRICKS.get()))
                        .save(output, "mossy_andesite_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_ANDESITE_BRICKS.get())
                        .unlockedBy("has_mossy_andesite_bricks", has(ModBlocks.MOSSY_ANDESITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_mossy_andesite_bricks", has(ModBlocks.MOSSY_ANDESITE_BRICKS.get()))
                        .save(output, "mossy_andesite_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_ANDESITE_BRICKS.get())
                        .unlockedBy("has_mossy_andesite_bricks", has(ModBlocks.MOSSY_ANDESITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_WALL.get())
                        .unlockedBy("has_mossy_andesite_bricks", has(ModBlocks.MOSSY_ANDESITE_BRICKS.get()))
                        .save(output, "mossy_andesite_brick_wall_from_stonecutting");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICKS.get())
                        .group("mossy_andesite_bricks")
                        .requires(ModBlocks.ANDESITE_BRICKS.get())
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                        .save(output, "mossy_andesite_brick_from_moss_block");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICKS.get())
                        .group("mossy_andesite_bricks")
                        .requires(ModBlocks.ANDESITE_BRICKS.get())
                        .requires(Blocks.VINE)
                        .unlockedBy("has_vine", has(Blocks.VINE))
                        .save(output, "mossy_andesite_brick_from_vine");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICKS.get())
                        .group("mossy_andesite_bricks")
                        .pattern("A")
                        .pattern("Z")
                        .pattern("A")
                        .define('A', Blocks.MOSS_CARPET)
                        .define('Z', ModBlocks.ANDESITE_BRICKS.get())
                        .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_andesite_brick_from_moss_carpet");


                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.POLISHED_DIORITE)
                        .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL.get())
                        .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                        .save(output, "polished_diorite_wall_from_stonecutting");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL.get())
                        .unlockedBy("has_diorite", has(Blocks.DIORITE))
                        .save(output, "polished_diorite_wall_from_stonecutting_from_diorite");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS.get(),4)
                        .pattern("AA")
                        .pattern("AA")
                        .define('A', Blocks.POLISHED_DIORITE)
                        .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS.get())
                        .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                        .save(output, "diorite_bricks_from_stonecutting_polished_diorite");


                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.DIORITE_BRICKS.get())
                        .unlockedBy("has_diorite_bricks", has(ModBlocks.DIORITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS.get())
                        .unlockedBy("has_diorite_bricks", has(ModBlocks.DIORITE_BRICKS.get()))
                        .save(output, "diorite_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.DIORITE_BRICKS.get())
                        .unlockedBy("has_diorite_bricks", has(ModBlocks.DIORITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_diorite_bricks", has(ModBlocks.DIORITE_BRICKS.get()))
                        .save(output, "diorite_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.DIORITE_BRICKS.get())
                        .unlockedBy("has_diorite_bricks", has(ModBlocks.DIORITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL.get())
                        .unlockedBy("has_diorite_bricks", has(ModBlocks.DIORITE_BRICKS.get()))
                        .save(output, "diorite_brick_wall_from_stonecutting_from_diorite_bricks");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS.get())
                        .unlockedBy("has_diorite", has(Blocks.DIORITE))
                        .save(output, "diorite_bricks_from_stonecutting_from_diorite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS.get())
                        .unlockedBy("has_diorite", has(Blocks.DIORITE))
                        .save(output, "diorite_brick_stairs_from_stonecutting_from_diorite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_diorite", has(Blocks.DIORITE))
                        .save(output, "diorite_brick_slab_from_stonecutting_from_diorite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL.get())
                        .unlockedBy("has_diorite", has(Blocks.DIORITE))
                        .save(output, "diorite_brick_wall_from_stonecutting_from_diorite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS.get())
                        .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                        .save(output, "diorite_brick_stairs_from_stonecutting_from_polished_diorite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                        .save(output, "diorite_brick_slab_from_stonecutting_from_polished_diorite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL.get())
                        .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                        .save(output, "diorite_brick_wall_from_stonecutting_from_polished_diorite");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_DIORITE_BRICKS.get())
                        .unlockedBy("has_cracked_diorite_bricks", has(ModBlocks.CRACKED_DIORITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_STAIRS.get())
                        .unlockedBy("has_cracked_diorite_bricks", has(ModBlocks.CRACKED_DIORITE_BRICKS.get()))
                        .save(output, "cracked_diorite_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_DIORITE_BRICKS.get())
                        .unlockedBy("has_cracked_diorite_bricks", has(ModBlocks.CRACKED_DIORITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_cracked_diorite_bricks", has(ModBlocks.CRACKED_DIORITE_BRICKS.get()))
                        .save(output, "cracked_diorite_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_DIORITE_BRICKS.get())
                        .unlockedBy("has_cracked_diorite_bricks", has(ModBlocks.CRACKED_DIORITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_WALL.get())
                        .unlockedBy("has_cracked_diorite_bricks", has(ModBlocks.CRACKED_DIORITE_BRICKS.get()))
                        .save(output, "cracked_diorite_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_DIORITE_BRICKS.get())
                        .unlockedBy("has_mossy_diorite_bricks", has(ModBlocks.MOSSY_DIORITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_STAIRS.get())
                        .unlockedBy("has_mossy_diorite_bricks", has(ModBlocks.MOSSY_DIORITE_BRICKS.get()))
                        .save(output, "mossy_diorite_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_DIORITE_BRICKS.get())
                        .unlockedBy("has_mossy_diorite_bricks", has(ModBlocks.MOSSY_DIORITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_mossy_diorite_bricks", has(ModBlocks.MOSSY_DIORITE_BRICKS.get()))
                        .save(output, "mossy_diorite_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_DIORITE_BRICKS.get())
                        .unlockedBy("has_mossy_diorite_bricks", has(ModBlocks.MOSSY_DIORITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_WALL.get())
                        .unlockedBy("has_mossy_diorite_bricks", has(ModBlocks.MOSSY_DIORITE_BRICKS.get()))
                        .save(output, "mossy_diorite_brick_wall_from_stonecutting");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICKS.get())
                        .group("mossy_diorite_bricks")
                        .requires(ModBlocks.DIORITE_BRICKS.get())
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                        .save(output, "mossy_diorite_brick_from_moss_block");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICKS.get())
                        .group("mossy_diorite_bricks")
                        .requires(ModBlocks.DIORITE_BRICKS.get())
                        .requires(Blocks.VINE)
                        .unlockedBy("has_vine", has(Blocks.VINE))
                        .save(output, "mossy_diorite_brick_from_vine");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICKS.get())
                        .group("mossy_diorite_bricks")
                        .pattern("A")
                        .pattern("Z")
                        .pattern("A")
                        .define('A', Blocks.MOSS_CARPET)
                        .define('Z', ModBlocks.DIORITE_BRICKS.get())
                        .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_diorite_brick_from_moss_carpet");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE.get(),4)
                        .pattern("AA")
                        .pattern("AA")
                        .define('A', Blocks.DRIPSTONE_BLOCK)
                        .unlockedBy("has_dripstone", has(Blocks.DRIPSTONE_BLOCK))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE.get())
                        .unlockedBy("has_dripstone", has(Blocks.DRIPSTONE_BLOCK))
                        .save(output, "polished_dripstone_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.POLISHED_DRIPSTONE.get())
                        .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DRIPSTONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS.get())
                        .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                        .save(output, "polished_dripstone_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.POLISHED_DRIPSTONE.get())
                        .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DRIPSTONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB.get(),2)
                        .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                        .save(output, "polished_dripstone_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.POLISHED_DRIPSTONE.get())
                        .unlockedBy("has_polished_dripstone_block", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DRIPSTONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_WALL.get())
                        .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                        .save(output, "polished_dripstone_wall_from_stonecutting");


                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS.get())
                        .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                        .save(output, "polished_dripstone_stairs_from_stonecutting_from_dripstone_block");


                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB.get(),2)
                        .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                        .save(output, "polished_dripstone_slab_from_stonecutting_from_dripstone_block");


                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_WALL.get())
                        .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                        .save(output, "polished_dripstone_wall_from_stonecutting_from_dripstone_block");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS.get(),4)
                        .pattern("AA")
                        .pattern("AA")
                        .define('A', ModBlocks.POLISHED_DRIPSTONE.get())
                        .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DRIPSTONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS.get())
                        .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                        .save(output, "dripstone_bricks_from_stonecutting_polished_dripstone");


                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.DRIPSTONE_BRICKS.get())
                        .unlockedBy("has_dripstone_bricks", has(ModBlocks.DRIPSTONE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS.get())
                        .unlockedBy("has_dripstone_bricks", has(ModBlocks.DRIPSTONE_BRICKS.get()))
                        .save(output, "dripstone_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.DRIPSTONE_BRICKS.get())
                        .unlockedBy("has_dripstone_bricks", has(ModBlocks.DRIPSTONE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_dripstone_bricks", has(ModBlocks.DRIPSTONE_BRICKS.get()))
                        .save(output, "dripstone_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.DRIPSTONE_BRICKS.get())
                        .unlockedBy("has_dripstone_bricks", has(ModBlocks.DRIPSTONE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL.get())
                        .unlockedBy("has_dripstone_bricks", has(ModBlocks.DRIPSTONE_BRICKS.get()))
                        .save(output, "dripstone_brick_wall_from_stonecutting");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS.get())
                        .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                        .save(output, "dripstone_bricks_from_stonecutting_from_dripstone_block");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS.get())
                        .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                        .save(output, "dripstone_brick_stairs_from_stonecutting_from_dripstone_block");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                        .save(output, "dripstone_brick_slab_from_stonecutting_from_dripstone_block");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL.get())
                        .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                        .save(output, "dripstone_brick_wall_from_stonecutting_from_dripstone_block");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DRIPSTONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS.get())
                        .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                        .save(output, "dripstone_brick_stairs_from_stonecutting_from_polished_dripstone");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DRIPSTONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                        .save(output, "dripstone_brick_slab_from_stonecutting_from_polished_dripstone");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DRIPSTONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL.get())
                        .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                        .save(output, "dripstone_brick_wall_from_stonecutting_from_polished_dripstone");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_DRIPSTONE_BRICKS.get())
                        .unlockedBy("has_dripstone_cracked_bricks", has(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_STAIRS.get())
                        .unlockedBy("has_dripstone_cracked_bricks", has(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()))
                        .save(output, "cracked_dripstone_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_DRIPSTONE_BRICKS.get())
                        .unlockedBy("has_dripstone_cracked_bricks", has(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_dripstone_cracked_bricks", has(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()))
                        .save(output, "cracked_dripstone_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_DRIPSTONE_BRICKS.get())
                        .unlockedBy("has_dripstone_cracked_bricks", has(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_WALL.get())
                        .unlockedBy("has_dripstone_cracked_bricks", has(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()))
                        .save(output, "cracked_dripstone_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_DRIPSTONE_BRICKS.get())
                        .unlockedBy("has_mossy_dripstone_bricks", has(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS.get())
                        .unlockedBy("has_mossy_dripstone_bricks", has(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()))
                        .save(output, "mossy_dripstone_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_DRIPSTONE_BRICKS.get())
                        .unlockedBy("has_mossy_dripstone_bricks", has(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_mossy_dripstone_bricks", has(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()))
                        .save(output, "mossy_dripstone_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_DRIPSTONE_BRICKS.get())
                        .unlockedBy("has_mossy_dripstone_bricks", has(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_WALL.get())
                        .unlockedBy("has_mossy_dripstone_bricks", has(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()))
                        .save(output, "mossy_dripstone_brick_wall_from_stonecutting");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICKS.get())
                        .group("mossy_dripstone_bricks")
                        .requires(ModBlocks.DRIPSTONE_BRICKS.get())
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                        .save(output, "mossy_dripstone_brick_from_moss_block");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICKS.get())
                        .group("mossy_dripstone_bricks")
                        .requires(ModBlocks.DRIPSTONE_BRICKS.get())
                        .requires(Blocks.VINE)
                        .unlockedBy("has_vine", has(Blocks.VINE))
                        .save(output, "mossy_dripstone_brick_from_vine");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICKS.get())
                        .group("mossy_dripstone_bricks")
                        .pattern("A")
                        .pattern("Z")
                        .pattern("A")
                        .define('A', Blocks.MOSS_CARPET)
                        .define('Z', ModBlocks.DRIPSTONE_BRICKS.get())
                        .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_dripstone_brick_from_moss_carpet");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.POLISHED_GRANITE)
                        .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL.get())
                        .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                        .save(output, "polished_granite_wall_from_stonecutting");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL.get())
                        .unlockedBy("has_granite", has(Blocks.GRANITE))
                        .save(output, "polished_granite_wall_from_stonecutting_from_granite");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS.get(),4)
                        .pattern("AA")
                        .pattern("AA")
                        .define('A', Blocks.POLISHED_GRANITE)
                        .unlockedBy("has_granite_bricks", has(Blocks.POLISHED_GRANITE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS.get())
                        .unlockedBy("has_granite_bricks", has(Blocks.POLISHED_GRANITE))
                        .save(output, "granite_bricks_from_stonecutting_polished_granite");


                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.GRANITE_BRICKS.get())
                        .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS.get())
                        .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                        .save(output, "granite_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.GRANITE_BRICKS.get())
                        .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                        .save(output, "granite_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.GRANITE_BRICKS.get())
                        .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL.get())
                        .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                        .save(output, "granite_brick_wall_from_stonecutting_from_granite_bricks");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS.get())
                        .unlockedBy("has_granite", has(Blocks.GRANITE))
                        .save(output, "granite_bricks_from_stonecutting_from_granite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS.get())
                        .unlockedBy("has_granite", has(Blocks.GRANITE))
                        .save(output, "granite_brick_stairs_from_stonecutting_from_granite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_granite", has(Blocks.GRANITE))
                        .save(output, "granite_brick_slab_from_stonecutting_from_granite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL.get())
                        .unlockedBy("has_granite", has(Blocks.GRANITE))
                        .save(output, "granite_brick_wall_from_stonecutting_from_granite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS.get())
                        .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                        .save(output, "granite_brick_stairs_from_stonecutting_from_polished_granite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                        .save(output, "granite_brick_slab_from_stonecutting_from_polished_granite");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL.get())
                        .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                        .save(output, "granite_brick_wall_from_stonecutting_from_polished_granite");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_GRANITE_BRICKS.get())
                        .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_STAIRS.get())
                        .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                        .save(output, "cracked_granite_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_GRANITE_BRICKS.get())
                        .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                        .save(output, "cracked_granite_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_GRANITE_BRICKS.get())
                        .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_WALL.get())
                        .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                        .save(output, "cracked_granite_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_GRANITE_BRICKS.get())
                        .unlockedBy("has_mossy_granite_bricks", has(ModBlocks.MOSSY_GRANITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_STAIRS.get())
                        .unlockedBy("has_mossy_granite_bricks", has(ModBlocks.MOSSY_GRANITE_BRICKS.get()))
                        .save(output, "mossy_granite_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_GRANITE_BRICKS.get())
                        .unlockedBy("has_mossy_granite_bricks", has(ModBlocks.MOSSY_GRANITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_mossy_granite_bricks", has(ModBlocks.MOSSY_GRANITE_BRICKS.get()))
                        .save(output, "mossy_granite_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_GRANITE_BRICKS.get())
                        .unlockedBy("has_mossy_granite_bricks", has(ModBlocks.MOSSY_GRANITE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_WALL.get())
                        .unlockedBy("has_mossy_granite_bricks", has(ModBlocks.MOSSY_GRANITE_BRICKS.get()))
                        .save(output, "mossy_granite_brick_wall_from_stonecutting");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICKS.get())
                        .group("mossy_granite_bricks")
                        .requires(ModBlocks.GRANITE_BRICKS.get())
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                        .save(output, "mossy_granite_brick_from_moss_block");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICKS.get())
                        .group("mossy_granite_bricks")
                        .requires(ModBlocks.GRANITE_BRICKS.get())
                        .requires(Blocks.VINE)
                        .unlockedBy("has_vine", has(Blocks.VINE))
                        .save(output, "mossy_granite_brick_from_vine");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICKS.get())
                        .group("mossy_granite_bricks")
                        .pattern("A")
                        .pattern("Z")
                        .pattern("A")
                        .define('A', Blocks.MOSS_CARPET)
                        .define('Z', ModBlocks.GRANITE_BRICKS.get())
                        .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_granite_brick_from_moss_carpet");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.PRISMARINE_BRICKS)
                        .unlockedBy("has_prismarine_bricks", has(Blocks.PRISMARINE_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PRISMARINE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL.get())
                        .unlockedBy("has_prismarine_bricks", has(Blocks.PRISMARINE_BRICKS))
                        .save(output, "prismarine_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.PURPUR_BLOCK)
                        .unlockedBy("has_purpur_block", has(Blocks.PURPUR_BLOCK))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPUR_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL.get())
                        .unlockedBy("has_purpur_block", has(Blocks.PURPUR_BLOCK))
                        .save(output, "purpur_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', Blocks.QUARTZ_BRICKS)
                        .unlockedBy("has_quartz_bricks", has(Blocks.QUARTZ_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS.get())
                        .unlockedBy("has_quartz_bricks", has(Blocks.QUARTZ_BRICKS))
                        .save(output, "quartz_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', Blocks.QUARTZ_BRICKS)
                        .unlockedBy("has_quartz_bricks", has(Blocks.QUARTZ_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB.get(),2)
                        .unlockedBy("has_quartz_bricks", has(Blocks.QUARTZ_BRICKS))
                        .save(output, "quartz_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.QUARTZ_BRICKS)
                        .unlockedBy("has_quartz_bricks", has(Blocks.QUARTZ_BRICKS))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL.get())
                        .unlockedBy("has_quartz_bricks", has(Blocks.QUARTZ_BRICKS))
                        .save(output, "quartz_brick_wall_from_stonecutting");


                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS.get())
                        .unlockedBy("has_block_of_quartz", has(Blocks.QUARTZ_BLOCK))
                        .save(output, "quartz_brick_stairs_from_stonecutting_from_block_of_quartz");


                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB.get(),2)
                        .unlockedBy("has_block_of_quartz", has(Blocks.QUARTZ_BLOCK))
                        .save(output, "quartz_brick_slab_from_stonecutting_from_block_of_quartz");


                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL.get())
                        .unlockedBy("has_block_of_quartz", has(Blocks.QUARTZ_BLOCK))
                        .save(output, "quartz_brick_wall_from_stonecutting_from_block_of_quartz");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.QUARTZ_BLOCK)
                        .unlockedBy("has_quartz_block", has(Blocks.QUARTZ_BLOCK))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_WALL.get())
                        .unlockedBy("has_quartz_block", has(Blocks.QUARTZ_BLOCK))
                        .save(output, "quartz_block_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_NETHER_BRICK_FENCE.get(),3)
                        .pattern("ATA")
                        .pattern("ATA")
                        .define('A', Blocks.RED_NETHER_BRICKS)
                        .define('T', Items.NETHER_BRICK)
                        .unlockedBy("has_red_nether_bricks", has(Blocks.RED_NETHER_BRICKS))
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', Blocks.SMOOTH_BASALT)
                        .unlockedBy("has_smooth_basalt", has(Blocks.SMOOTH_BASALT))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS.get())
                        .unlockedBy("has_smooth_basalt", has(Blocks.SMOOTH_BASALT))
                        .save(output, "smooth_basalt_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', Blocks.SMOOTH_BASALT)
                        .unlockedBy("has_smooth_basalt", has(Blocks.SMOOTH_BASALT))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB.get(),2)
                        .unlockedBy("has_smooth_basalt", has(Blocks.SMOOTH_BASALT))
                        .save(output, "smooth_basalt_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.SMOOTH_BASALT)
                        .unlockedBy("has_smooth_basalt", has(Blocks.SMOOTH_BASALT))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL.get())
                        .unlockedBy("has_smooth_basalt", has(Blocks.SMOOTH_BASALT))
                        .save(output, "smooth_basalt_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.SMOOTH_QUARTZ)
                        .unlockedBy("has_smooth_quartz", has(Blocks.SMOOTH_QUARTZ))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_WALL.get())
                        .unlockedBy("has_smooth_quartz", has(Blocks.SMOOTH_QUARTZ))
                        .save(output, "smooth_quartz_wall_from_stonecutting");

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

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.SMOOTH_STONE)
                        .unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL.get())
                        .unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE))
                        .save(output, "smooth_stone_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.STONE)
                        .unlockedBy("has_stone", has(Blocks.STONE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL.get())
                        .unlockedBy("has_stone", has(Blocks.STONE))
                        .save(output, "stone_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_BRICKS.get())
                        .unlockedBy("has_cracked_bricks", has(ModBlocks.CRACKED_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_STAIRS.get())
                        .unlockedBy("has_cracked_bricks", has(ModBlocks.CRACKED_BRICKS.get()))
                        .save(output, "cracked_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_BRICKS.get())
                        .unlockedBy("has_cracked_bricks", has(ModBlocks.CRACKED_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_SLAB.get(),2)
                        .unlockedBy("has_cracked_bricks", has(ModBlocks.CRACKED_BRICKS.get()))
                        .save(output, "cracked_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_BRICKS.get())
                        .unlockedBy("has_cracked_bricks", has(ModBlocks.CRACKED_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_WALL.get())
                        .unlockedBy("has_cracked_bricks", has(ModBlocks.CRACKED_BRICKS.get()))
                        .save(output, "cracked_brick_wall_from_stonecutting");

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

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICKS.get())
                        .group("mossy_prismarine_bricks")
                        .requires(Blocks.PRISMARINE_BRICKS)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                        .save(output, "mossy_prismarine_brick_from_moss_block");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICKS.get())
                        .group("mossy_prismarine_bricks")
                        .requires(Blocks.PRISMARINE_BRICKS)
                        .requires(Blocks.VINE)
                        .unlockedBy("has_vine", has(Blocks.VINE))
                        .save(output, "mossy_prismarine_brick_from_vine");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICKS.get())
                        .group("mossy_prismarine_bricks")
                        .pattern("A")
                        .pattern("Z")
                        .pattern("A")
                        .define('A', Blocks.MOSS_CARPET)
                        .define('Z', Blocks.PRISMARINE_BRICKS)
                        .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_prismarine_brick_from_moss_carpet");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_END_STONE_BRICKS.get())
                        .unlockedBy("has_cracked_end_stone_bricks", has(ModBlocks.CRACKED_END_STONE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_END_STONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_STAIRS.get())
                        .unlockedBy("has_cracked_end_stone_bricks", has(ModBlocks.CRACKED_END_STONE_BRICKS.get()))
                        .save(output, "cracked_end_stone_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_END_STONE_BRICKS.get())
                        .unlockedBy("has_cracked_end_stone_bricks", has(ModBlocks.CRACKED_END_STONE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_END_STONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_SLAB.get(),2)
                        .unlockedBy("has_cracked_end_stone_bricks", has(ModBlocks.CRACKED_END_STONE_BRICKS.get()))
                        .save(output, "cracked_end_stone_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_END_STONE_BRICKS.get())
                        .unlockedBy("has_cracked_end_stone_bricks", has(ModBlocks.CRACKED_END_STONE_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_END_STONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_WALL.get())
                        .unlockedBy("has_cracked_end_stone_bricks", has(ModBlocks.CRACKED_END_STONE_BRICKS.get()))
                        .save(output, "cracked_end_stone_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE.get(),4)
                        .pattern("AA")
                        .pattern("AA")
                        .define('A', Blocks.END_STONE)
                        .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE.get())
                        .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                        .save(output, "polished_end_stone_from_end_stone_stonecutting");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS.get())
                        .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                        .save(output, "polished_end_stone_stairs_from_end_stone_stonecutting");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB.get())
                        .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                        .save(output, "polished_end_stone_slab_from_end_stone_stonecutting");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL.get())
                        .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                        .save(output, "polished_end_stone_wall_from_end_stone_stonecutting");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_END_STONE.get()), RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS)
                        .unlockedBy("has_polished_end_stone", has(ModBlocks.POLISHED_END_STONE.get()))
                        .save(output, "end_stone_bricks_from_polished_end_stone_stonecutting");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_END_STONE.get()), RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_STAIRS)
                        .unlockedBy("has_polished_end_stone", has(ModBlocks.POLISHED_END_STONE.get()))
                        .save(output, "end_stone_brick_stairs_from_polished_end_stone_stonecutting");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_END_STONE.get()), RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_SLAB)
                        .unlockedBy("has_polished_end_stone", has(ModBlocks.POLISHED_END_STONE.get()))
                        .save(output, "end_stone_brick_slab_from_polished_end_stone_stonecutting");

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_END_STONE.get()), RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_WALL)
                        .unlockedBy("has_polished_end_stone", has(ModBlocks.POLISHED_END_STONE.get()))
                        .save(output, "end_stone_brick_wall_from_polished_end_stone_stonecutting");


                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_BRICKS.get())
                        .unlockedBy("has_mossy_bricks", has(ModBlocks.MOSSY_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_STAIRS.get())
                        .unlockedBy("has_mossy_bricks", has(ModBlocks.MOSSY_BRICKS.get()))
                        .save(output, "mossy_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_BRICKS.get())
                        .unlockedBy("has_mossy_bricks", has(ModBlocks.MOSSY_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_SLAB.get(),2)
                        .unlockedBy("has_mossy_bricks", has(ModBlocks.MOSSY_BRICKS.get()))
                        .save(output, "mossy_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_BRICKS.get())
                        .unlockedBy("has_mossy_bricks", has(ModBlocks.MOSSY_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_WALL.get())
                        .unlockedBy("has_mossy_bricks", has(ModBlocks.MOSSY_BRICKS.get()))
                        .save(output, "mossy_brick_wall_from_stonecutting");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICKS.get())
                        .group("mossy_bricks")
                        .requires(Blocks.BRICKS)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                        .save(output, "mossy_brick_from_moss_block");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICKS.get())
                        .group("mossy_bricks")
                        .requires(Blocks.BRICKS)
                        .requires(Blocks.VINE)
                        .unlockedBy("has_vine", has(Items.VINE))
                        .save(output, "mossy_brick_from_vine");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICKS.get())
                        .group("mossy_bricks")
                        .pattern("A")
                        .pattern("Z")
                        .pattern("A")
                        .define('A', Blocks.MOSS_CARPET)
                        .define('Z', Blocks.BRICKS)
                        .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_brick_from_moss_carpet");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_QUARTZ_BRICKS.get())
                        .unlockedBy("has_mossy_quartz_bricks", has(ModBlocks.MOSSY_QUARTZ_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_QUARTZ_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS.get())
                        .unlockedBy("has_mossy_quartz_bricks", has(ModBlocks.MOSSY_QUARTZ_BRICKS.get()))
                        .save(output, "mossy_quartz_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_QUARTZ_BRICKS.get())
                        .unlockedBy("has_mossy_quartz_bricks", has(ModBlocks.MOSSY_QUARTZ_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_QUARTZ_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_SLAB.get(),2)
                        .unlockedBy("has_mossy_quartz_bricks", has(ModBlocks.MOSSY_QUARTZ_BRICKS.get()))
                        .save(output, "mossy_quartz_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_QUARTZ_BRICKS.get())
                        .unlockedBy("has_mossy_quartz_bricks", has(ModBlocks.MOSSY_QUARTZ_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_QUARTZ_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_WALL.get())
                        .unlockedBy("has_mossy_quartz_bricks", has(ModBlocks.MOSSY_QUARTZ_BRICKS.get()))
                        .save(output, "mossy_quartz_brick_wall_from_stonecutting");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICKS.get())
                        .group("mossy_quartz_bricks")
                        .requires(Blocks.QUARTZ_BRICKS)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                        .save(output, "mossy_quartz_brick_from_moss_block");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICKS.get())
                        .group("mossy_quartz_bricks")
                        .requires(Blocks.QUARTZ_BRICKS)
                        .requires(Blocks.VINE)
                        .unlockedBy("has_vine", has(Items.VINE))
                        .save(output, "mossy_quartz_brick_from_vine");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICKS.get())
                        .group("mossy_quartz_bricks")
                        .pattern("A")
                        .pattern("Z")
                        .pattern("A")
                        .define('A', Blocks.MOSS_CARPET)
                        .define('Z', Blocks.QUARTZ_BRICKS)
                        .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_quartz_brick_from_moss_carpet");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_TUFF_BRICKS.get())
                        .unlockedBy("has_cracked_tuff_bricks", has(ModBlocks.CRACKED_TUFF_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_TUFF_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_STAIRS.get())
                        .unlockedBy("has_cracked_tuff_bricks", has(ModBlocks.CRACKED_TUFF_BRICKS.get()))
                        .save(output, "cracked_tuff_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_TUFF_BRICKS.get())
                        .unlockedBy("has_cracked_tuff_bricks", has(ModBlocks.CRACKED_TUFF_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_TUFF_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_SLAB.get(),2)
                        .unlockedBy("has_cracked_tuff_bricks", has(ModBlocks.CRACKED_TUFF_BRICKS.get()))
                        .save(output, "cracked_tuff_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_TUFF_BRICKS.get())
                        .unlockedBy("has_cracked_tuff_bricks", has(ModBlocks.CRACKED_TUFF_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_TUFF_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_WALL.get())
                        .unlockedBy("has_cracked_tuff_bricks", has(ModBlocks.CRACKED_TUFF_BRICKS.get()))
                        .save(output, "cracked_tuff_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_TUFF_BRICKS.get())
                        .unlockedBy("has_mossy_tuff_bricks", has(ModBlocks.MOSSY_TUFF_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_TUFF_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_STAIRS.get())
                        .unlockedBy("has_mossy_tuff_bricks", has(ModBlocks.MOSSY_TUFF_BRICKS.get()))
                        .save(output, "mossy_tuff_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_TUFF_BRICKS.get())
                        .unlockedBy("has_mossy_tuff_bricks", has(ModBlocks.MOSSY_TUFF_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_TUFF_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_SLAB.get(),2)
                        .unlockedBy("has_mossy_tuff_bricks", has(ModBlocks.MOSSY_TUFF_BRICKS.get()))
                        .save(output, "mossy_tuff_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_TUFF_BRICKS.get())
                        .unlockedBy("has_mossy_tuff_bricks", has(ModBlocks.MOSSY_TUFF_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_TUFF_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_WALL.get())
                        .unlockedBy("has_mossy_tuff_bricks", has(ModBlocks.MOSSY_TUFF_BRICKS.get()))
                        .save(output, "mossy_tuff_brick_wall_from_stonecutting");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICKS.get())
                        .group("mossy_tuff_bricks")
                        .requires(Blocks.TUFF_BRICKS)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                        .save(output, "mossy_tuff_brick_from_moss_block");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICKS.get())
                        .group("mossy_tuff_bricks")
                        .requires(Blocks.TUFF_BRICKS)
                        .requires(Blocks.VINE)
                        .unlockedBy("has_vine", has(Blocks.VINE))
                        .save(output, "mossy_tuff_brick_from_vine");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICKS.get())
                        .group("mossy_tuff_bricks")
                        .pattern("A")
                        .pattern("Z")
                        .pattern("A")
                        .define('A', Blocks.MOSS_CARPET)
                        .define('Z', Blocks.TUFF_BRICKS)
                        .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_tuff_brick_from_moss_carpet");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', Blocks.NETHERRACK)
                        .unlockedBy("has_netherrack", has(Blocks.NETHERRACK))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.NETHERRACK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS.get())
                        .unlockedBy("has_netherrack", has(Blocks.NETHERRACK))
                        .save(output, "netherrack_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', Blocks.NETHERRACK)
                        .unlockedBy("has_netherrack", has(Blocks.NETHERRACK))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.NETHERRACK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB.get(),2)
                        .unlockedBy("has_netherrack", has(Blocks.NETHERRACK))
                        .save(output, "netherrack_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.NETHERRACK)
                        .unlockedBy("has_netherrack", has(Blocks.NETHERRACK))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.NETHERRACK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL.get())
                        .unlockedBy("has_netherrack", has(Blocks.NETHERRACK))
                        .save(output, "netherrack_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICKS.get(),4)
                        .pattern("AA")
                        .pattern("AA")
                        .define('A', Blocks.SNOW_BLOCK)
                        .unlockedBy("has_snow_bricks", has(Blocks.SNOW_BLOCK))
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.SNOW_BRICKS.get())
                        .unlockedBy("has_netherrack", has(ModBlocks.SNOW_BRICKS.get()))
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.SNOW_BRICKS.get())
                        .unlockedBy("has_netherrack", has(ModBlocks.SNOW_BRICKS.get()))
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.SNOW_BRICKS.get())
                        .unlockedBy("has_netherrack", has(ModBlocks.SNOW_BRICKS.get()))
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_COBBLESTONE)
                        .group("mossy_cobblestone")
                        .pattern("A")
                        .pattern("Z")
                        .pattern("A")
                        .define('A', Blocks.MOSS_CARPET)
                        .define('Z', Blocks.COBBLESTONE)
                        .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_cobblestone_from_moss_carpet");

                shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_STONE_BRICKS)
                        .group("mossy_stone_bricks")
                        .pattern("A")
                        .pattern("Z")
                        .pattern("A")
                        .define('A', Blocks.MOSS_CARPET)
                        .define('Z', Blocks.STONE_BRICKS)
                        .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_stone_from_moss_carpet");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE.get())
                        .group("mossy_cobbled_deepslate")
                        .requires(Blocks.COBBLED_DEEPSLATE)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                        .save(output, "mossy_cobbled_deepslate_from_moss_block");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE.get())
                        .group("mossy_cobbled_deepslate")
                        .requires(Blocks.COBBLED_DEEPSLATE)
                        .requires(Blocks.VINE)
                        .unlockedBy("has_vine", has(Blocks.VINE))
                        .save(output, "mossy_cobbled_deepslate_from_vine");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE.get())
                        .group("mossy_cobbled_deepslate")
                        .pattern("A")
                        .pattern("Z")
                        .pattern("A")
                        .define('A', Blocks.MOSS_CARPET)
                        .define('Z', Blocks.COBBLED_DEEPSLATE)
                        .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_cobbled_deepslate_from_moss_carpet");

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

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICKS.get())
                        .group("mossy_deeplate_bricks")
                        .requires(Blocks.DEEPSLATE_BRICKS)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                        .save(output, "mossy_deepslate_brick_from_moss_block");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICKS.get())
                        .group("mossy_deeplate_bricks")
                        .requires(Blocks.DEEPSLATE_BRICKS)
                        .requires(Blocks.VINE)
                        .unlockedBy("has_vine", has(Blocks.VINE))
                        .save(output, "mossy_deepslate_brick_from_vine");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICKS.get())
                        .group("mossy_deeplate_bricks")
                        .pattern("A")
                        .pattern("Z")
                        .pattern("A")
                        .define('A', Blocks.MOSS_CARPET)
                        .define('Z', Blocks.DEEPSLATE_BRICKS)
                        .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_deepslate_bricks_from_moss_carpet");

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

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILES.get())
                        .group("mossy_deeplate_tiles")
                        .requires(Blocks.DEEPSLATE_TILES)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                        .save(output, "mossy_deepslate_tiles_from_moss_block");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILES.get())
                        .group("mossy_deeplate_tiles")
                        .requires(Blocks.DEEPSLATE_TILES)
                        .requires(Blocks.VINE)
                        .unlockedBy("has_vine", has(Blocks.VINE))
                        .save(output, "mossy_deepslate_tiles_from_vine");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILES.get())
                        .group("mossy_deeplate_tiles")
                        .pattern("A")
                        .pattern("Z")
                        .pattern("A")
                        .define('A', Blocks.MOSS_CARPET)
                        .define('Z', Blocks.DEEPSLATE_TILES)
                        .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_deepslate_tiles_from_moss_carpet");

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
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_RESIN_BRICKS.get())
                        .unlockedBy("has_cracked_resin_bricks", has(ModBlocks.CRACKED_RESIN_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_RESIN_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_STAIRS.get())
                        .unlockedBy("has_cracked_resin_bricks", has(ModBlocks.CRACKED_RESIN_BRICKS.get()))
                        .save(output, "cracked_resin_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_RESIN_BRICKS.get())
                        .unlockedBy("has_cracked_resin_bricks", has(ModBlocks.CRACKED_RESIN_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_RESIN_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_SLAB.get(),2)
                        .unlockedBy("has_cracked_resin_bricks", has(ModBlocks.CRACKED_RESIN_BRICKS.get()))
                        .save(output, "cracked_resin_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.CRACKED_RESIN_BRICKS.get())
                        .unlockedBy("has_cracked_resin_bricks", has(ModBlocks.CRACKED_RESIN_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_RESIN_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_WALL.get())
                        .unlockedBy("has_cracked_resin_bricks", has(ModBlocks.CRACKED_RESIN_BRICKS.get()))
                        .save(output, "cracked_resin_brick_wall_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_STAIRS.get(),4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_RESIN_BRICKS.get())
                        .unlockedBy("has_mossy_resin_bricks", has(ModBlocks.MOSSY_RESIN_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_RESIN_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_STAIRS.get())
                        .unlockedBy("has_mossy_resin_bricks", has(ModBlocks.MOSSY_RESIN_BRICKS.get()))
                        .save(output, "mossy_resin_brick_stairs_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_SLAB.get(),6)
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_RESIN_BRICKS.get())
                        .unlockedBy("has_mossy_resin_bricks", has(ModBlocks.MOSSY_RESIN_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_RESIN_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_SLAB.get(),2)
                        .unlockedBy("has_mossy_resin_bricks", has(ModBlocks.MOSSY_RESIN_BRICKS.get()))
                        .save(output, "mossy_resin_brick_slab_from_stonecutting");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_WALL.get(),6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ModBlocks.MOSSY_RESIN_BRICKS.get())
                        .unlockedBy("has_mossy_resin_bricks", has(ModBlocks.MOSSY_RESIN_BRICKS.get()))
                        .save(output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_RESIN_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_WALL.get())
                        .unlockedBy("has_mossy_resin_bricks", has(ModBlocks.MOSSY_RESIN_BRICKS.get()))
                        .save(output, "mossy_resin_brick_wall_from_stonecutting");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICKS.get())
                        .group("mossy_resin_bricks")
                        .requires(Blocks.RESIN_BRICKS)
                        .requires(Blocks.PALE_MOSS_BLOCK)
                        .unlockedBy("has_pale_moss_block", has(Blocks.MOSS_BLOCK))
                        .save(output, "mossy_resin_brick_from_pale_moss_block");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICKS.get())
                        .group("mossy_resin_bricks")
                        .pattern("A")
                        .pattern("Z")
                        .pattern("A")
                        .define('A', Blocks.PALE_MOSS_CARPET)
                        .define('Z', Blocks.RESIN_BRICKS)
                        .unlockedBy("has_pale_moss_carpet", has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_resin_brick_from_pale_moss_carpet");

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICKS.get())
                        .group("mossy_resin_bricks")
                        .requires(Blocks.RESIN_BRICKS)
                        .requires(Blocks.PALE_HANGING_MOSS)
                        .unlockedBy("has_pale_hanging_moss", has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_resin_brick_from_pale_hanging_moss");*/
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