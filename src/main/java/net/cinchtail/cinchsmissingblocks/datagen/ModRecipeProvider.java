package net.cinchtail.cinchsmissingblocks.datagen;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    private final RegistryEntryLookup<Item> items;

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);

        this.items = registriesFuture
                .thenApply(lookup -> lookup.getOrThrow(RegistryKeys.ITEM))
                .join();

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

                offerCrackingRecipe(ModBlocks.CRACKED_SANDSTONE_BRICKS, Blocks.CUT_SANDSTONE);

                offerCrackingRecipe(ModBlocks.CRACKED_RED_SANDSTONE_BRICKS, Blocks.CUT_RED_SANDSTONE);

                offerCrackingRecipe(ModBlocks.CRACKED_BLUE_NETHER_BRICKS, ModBlocks.BLUE_NETHER_BRICKS);

                offerCrackingRecipe(ModBlocks.CRACKED_STONE_TILES, ModBlocks.STONE_TILES);


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

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_sandstone_bricks",
                        ModBlocks.MOSSY_SANDSTONE_BRICKS, ModBlocks.SANDSTONE_BRICKS, "mossy_sandstone_bricks_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_sandstone_bricks",
                        ModBlocks.MOSSY_SANDSTONE_BRICKS, ModBlocks.SANDSTONE_BRICKS, "mossy_sandstone_bricks_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_sandstone_bricks",
                        ModBlocks.MOSSY_SANDSTONE_BRICKS, ModBlocks.RED_SANDSTONE_BRICKS, "mossy_sandstone_bricks_from_moss_carpet");

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_red_sandstone_bricks",
                        ModBlocks.MOSSY_RED_SANDSTONE_BRICKS, ModBlocks.RED_SANDSTONE_BRICKS, "mossy_red_sandstone_bricks_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_red_sandstone_bricks",
                        ModBlocks.MOSSY_RED_SANDSTONE_BRICKS, ModBlocks.RED_SANDSTONE_BRICKS, "mossy_red_sandstone_bricks_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_red_sandstone_bricks",
                        ModBlocks.MOSSY_RED_SANDSTONE_BRICKS, ModBlocks.RED_SANDSTONE_BRICKS, "mossy_red_sandstone_bricks_from_moss_carpet");

                offerMossyFromMossBlockRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_stone_tiles",
                        ModBlocks.MOSSY_STONE_TILES, ModBlocks.STONE_TILES, "mossy_stone_tiles_from_moss_block");

                offerMossyFromVineRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_stone_tiles",
                        ModBlocks.MOSSY_STONE_TILES, ModBlocks.STONE_TILES, "mossy_stone_tiles_from_vine");

                offerMossyFromMossCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, "mossy_stone_tiles",
                        ModBlocks.MOSSY_STONE_TILES, ModBlocks.STONE_TILES, "mossy_stone_tiles_from_moss_carpet");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICKS)
                        .group("mossy_resin_bricks")
                        .input(Blocks.RESIN_BRICKS)
                        .input(Blocks.PALE_MOSS_BLOCK)
                        .criterion(hasItem(Blocks.PALE_MOSS_BLOCK), conditionsFromItem(Blocks.PALE_MOSS_BLOCK))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "mossy_resin_bricks_from_pale_moss_block")));

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICKS)
                        .group("mossy_resin_bricks")
                        .input(Blocks.RESIN_BRICKS)
                        .input(Blocks.PALE_HANGING_MOSS)
                        .criterion(hasItem(Blocks.PALE_HANGING_MOSS), conditionsFromItem(Blocks.PALE_HANGING_MOSS))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "mossy_resin_bricks_from_pale_hanging_moss")));

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICKS)
                        .group("mossy_resin_bricks")
                        .pattern("B")
                        .pattern("A")
                        .pattern("B")
                        .input('A', Blocks.RESIN_BRICKS)
                        .input('B', Blocks.PALE_MOSS_CARPET)
                        .criterion(hasItem(Blocks.PALE_MOSS_CARPET), conditionsFromItem(Blocks.PALE_MOSS_CARPET))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "mossy_resin_bricks_from_pale_moss_carpet")));

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICKS)
                        .group("mossy_end_stone_bricks")
                        .input(Blocks.END_STONE_BRICKS)
                        .input(Items.CHORUS_FLOWER)
                        .criterion(hasItem(Blocks.CHORUS_FLOWER), conditionsFromItem(Blocks.CHORUS_FLOWER))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "mossy_end_stone_bricks_from_chorus_flower")));


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

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BLUE_NETHER_BRICKS, ModBlocks.BLUE_NETHER_BRICK_SLAB);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BLUE_NETHER_BRICKS, ModBlocks.BLUE_NETHER_BRICKS);


                //Pillar Blocks
                offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_BRICK_PILLAR, Blocks.END_STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_BRICK_PILLAR, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_BRICK_PILLAR, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_BRICK_PILLAR, Blocks.END_STONE_BRICKS);

                offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_BRICK_PILLAR, Blocks.MUD_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_BRICK_PILLAR, Blocks.MUD_BRICKS);

                offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_PILLAR, Blocks.STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_PILLAR, Blocks.STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_PILLAR, Blocks.STONE_BRICKS);

                offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_PILLAR, Blocks.DEEPSLATE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_PILLAR, Blocks.DEEPSLATE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_PILLAR, Blocks.POLISHED_DEEPSLATE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_PILLAR, Blocks.DEEPSLATE_BRICKS);

                offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_BRICK_PILLAR, Blocks.POLISHED_BLACKSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_BRICK_PILLAR, Blocks.BLACKSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_BRICK_PILLAR, Blocks.POLISHED_BLACKSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_BRICK_PILLAR, Blocks.POLISHED_BLACKSTONE_BRICKS);

                offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_PILLAR, Blocks.PRISMARINE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_PILLAR, Blocks.PRISMARINE_BRICKS);

                offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_PILLAR, ModBlocks.CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_PILLAR, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_PILLAR, ModBlocks.POLISHED_CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_PILLAR, ModBlocks.CALCITE_BRICKS);

                offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_PILLAR, ModBlocks.DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_PILLAR, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_PILLAR, ModBlocks.POLISHED_DRIPSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_PILLAR, ModBlocks.DRIPSTONE_BRICKS);

                offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_PILLAR, ModBlocks.ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_PILLAR, Blocks.ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_PILLAR, Blocks.POLISHED_ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_PILLAR, ModBlocks.ANDESITE_BRICKS);

                offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_PILLAR, ModBlocks.GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_PILLAR, Blocks.GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_PILLAR, Blocks.POLISHED_GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_PILLAR, ModBlocks.GRANITE_BRICKS);

                offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_PILLAR, ModBlocks.DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_PILLAR, Blocks.DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_PILLAR, Blocks.POLISHED_DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_PILLAR, ModBlocks.DIORITE_BRICKS);



                //Miscellaneous Calcite Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

                offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, Blocks.CALCITE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, Blocks.CALCITE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE,2);

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

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, Blocks.CALCITE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.POLISHED_CALCITE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.POLISHED_CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_STAIRS, ModBlocks.CRACKED_CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_STAIRS, ModBlocks.CRACKED_CALCITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_SLAB, ModBlocks.CRACKED_CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_SLAB, ModBlocks.CRACKED_CALCITE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_WALL, ModBlocks.CRACKED_CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_WALL, ModBlocks.CRACKED_CALCITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_STAIRS, ModBlocks.MOSSY_CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_STAIRS, ModBlocks.MOSSY_CALCITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_SLAB, ModBlocks.MOSSY_CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_SLAB, ModBlocks.MOSSY_CALCITE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_WALL, ModBlocks.MOSSY_CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_WALL, ModBlocks.MOSSY_CALCITE_BRICKS);


                //Miscellaneous Dripstone Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

                offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS, ModBlocks.POLISHED_DRIPSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS, ModBlocks.POLISHED_DRIPSTONE);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB, ModBlocks.POLISHED_DRIPSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB, ModBlocks.POLISHED_DRIPSTONE,2);

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

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, Blocks.DRIPSTONE_BLOCK,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, ModBlocks.POLISHED_DRIPSTONE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, ModBlocks.DRIPSTONE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL, Blocks.DRIPSTONE_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.POLISHED_DRIPSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.DRIPSTONE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_STAIRS, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_STAIRS, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB, ModBlocks.CRACKED_DRIPSTONE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_WALL, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_WALL, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB, ModBlocks.MOSSY_DRIPSTONE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_WALL, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_WALL, ModBlocks.MOSSY_DRIPSTONE_BRICKS);


                //Miscellaneous Tuff Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_STAIRS, ModBlocks.CRACKED_TUFF_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_STAIRS, ModBlocks.CRACKED_TUFF_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_SLAB, ModBlocks.CRACKED_TUFF_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_SLAB, ModBlocks.CRACKED_TUFF_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_WALL, ModBlocks.CRACKED_TUFF_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_WALL, ModBlocks.CRACKED_TUFF_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_STAIRS, ModBlocks.MOSSY_TUFF_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_STAIRS, ModBlocks.MOSSY_TUFF_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_SLAB, ModBlocks.MOSSY_TUFF_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_SLAB, ModBlocks.MOSSY_TUFF_BRICKS,2);

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

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.ANDESITE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.POLISHED_ANDESITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS, ModBlocks.CRACKED_ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS, ModBlocks.CRACKED_ANDESITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_SLAB, ModBlocks.CRACKED_ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_SLAB, ModBlocks.CRACKED_ANDESITE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_WALL, ModBlocks.CRACKED_ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_WALL, ModBlocks.CRACKED_ANDESITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS, ModBlocks.MOSSY_ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS, ModBlocks.MOSSY_ANDESITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_SLAB, ModBlocks.MOSSY_ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_SLAB, ModBlocks.MOSSY_ANDESITE_BRICKS,2);

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

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Blocks.GRANITE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, Blocks.GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, Blocks.POLISHED_GRANITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_STAIRS, ModBlocks.CRACKED_GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_STAIRS, ModBlocks.CRACKED_GRANITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB, ModBlocks.CRACKED_GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB, ModBlocks.CRACKED_GRANITE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_WALL, ModBlocks.CRACKED_GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_WALL, ModBlocks.CRACKED_GRANITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_STAIRS, ModBlocks.MOSSY_GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_STAIRS, ModBlocks.MOSSY_GRANITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_SLAB, ModBlocks.MOSSY_GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_SLAB, ModBlocks.MOSSY_GRANITE_BRICKS,2);

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

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Blocks.DIORITE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, Blocks.DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, Blocks.POLISHED_DIORITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_STAIRS, ModBlocks.CRACKED_DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_STAIRS, ModBlocks.CRACKED_DIORITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_SLAB, ModBlocks.CRACKED_DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_SLAB, ModBlocks.CRACKED_DIORITE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_WALL, ModBlocks.CRACKED_DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_WALL, ModBlocks.CRACKED_DIORITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_STAIRS, ModBlocks.MOSSY_DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_STAIRS, ModBlocks.MOSSY_DIORITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_SLAB, ModBlocks.MOSSY_DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_SLAB, ModBlocks.MOSSY_DIORITE_BRICKS,2);

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

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BLOCK,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_STAIRS, ModBlocks.CRACKED_QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_STAIRS, ModBlocks.CRACKED_QUARTZ_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_SLAB, ModBlocks.CRACKED_QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_SLAB, ModBlocks.CRACKED_QUARTZ_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_WALL, ModBlocks.CRACKED_QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_WALL, ModBlocks.CRACKED_QUARTZ_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS, ModBlocks.MOSSY_QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS, ModBlocks.MOSSY_QUARTZ_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_SLAB, ModBlocks.MOSSY_QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_SLAB, ModBlocks.MOSSY_QUARTZ_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_WALL, ModBlocks.MOSSY_QUARTZ_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_WALL, ModBlocks.MOSSY_QUARTZ_BRICKS);


                //Miscellaneous Brick Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_STAIRS, ModBlocks.CRACKED_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_STAIRS, ModBlocks.CRACKED_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_SLAB, ModBlocks.CRACKED_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_SLAB, ModBlocks.CRACKED_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_WALL, ModBlocks.CRACKED_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_WALL, ModBlocks.CRACKED_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_STAIRS, ModBlocks.MOSSY_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_STAIRS, ModBlocks.MOSSY_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_SLAB, ModBlocks.MOSSY_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_SLAB, ModBlocks.MOSSY_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_WALL, ModBlocks.MOSSY_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_WALL, ModBlocks.MOSSY_BRICKS);


                //Miscellaneous Mud Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_STAIRS, Blocks.PACKED_MUD);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_STAIRS, Blocks.PACKED_MUD);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_STAIRS, ModBlocks.CRACKED_MUD_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_STAIRS, ModBlocks.CRACKED_MUD_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_SLAB, ModBlocks.CRACKED_MUD_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_SLAB, ModBlocks.CRACKED_MUD_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_WALL, ModBlocks.CRACKED_MUD_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_WALL, ModBlocks.CRACKED_MUD_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_STAIRS, ModBlocks.MOSSY_MUD_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_STAIRS, ModBlocks.MOSSY_MUD_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_SLAB, ModBlocks.MOSSY_MUD_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_SLAB, ModBlocks.MOSSY_MUD_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_WALL, ModBlocks.MOSSY_MUD_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_WALL, ModBlocks.MOSSY_MUD_BRICKS);


                //Miscellaneous Resin Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_STAIRS, ModBlocks.CRACKED_RESIN_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_STAIRS, ModBlocks.CRACKED_RESIN_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_SLAB, ModBlocks.CRACKED_RESIN_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_SLAB, ModBlocks.CRACKED_RESIN_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_WALL, ModBlocks.CRACKED_RESIN_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RESIN_BRICK_WALL, ModBlocks.CRACKED_RESIN_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_STAIRS, ModBlocks.MOSSY_RESIN_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_STAIRS, ModBlocks.MOSSY_RESIN_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_SLAB, ModBlocks.MOSSY_RESIN_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_SLAB, ModBlocks.MOSSY_RESIN_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_WALL, ModBlocks.MOSSY_RESIN_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RESIN_BRICK_WALL, ModBlocks.MOSSY_RESIN_BRICKS);


                //Miscellaneous End Stone Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS, Blocks.END_STONE);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Blocks.END_STONE,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL, Blocks.END_STONE);

                offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE, Blocks.END_STONE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS, ModBlocks.POLISHED_END_STONE);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, Blocks.END_STONE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL, Blocks.END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_STAIRS, ModBlocks.POLISHED_END_STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_SLAB, ModBlocks.POLISHED_END_STONE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_WALL, ModBlocks.POLISHED_END_STONE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_STAIRS, ModBlocks.CRACKED_END_STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_STAIRS, ModBlocks.CRACKED_END_STONE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_SLAB, ModBlocks.CRACKED_END_STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_SLAB, ModBlocks.CRACKED_END_STONE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_WALL, ModBlocks.CRACKED_END_STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_WALL, ModBlocks.CRACKED_END_STONE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICK_STAIRS, ModBlocks.MOSSY_END_STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICK_STAIRS, ModBlocks.MOSSY_END_STONE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICK_SLAB, ModBlocks.MOSSY_END_STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICK_SLAB, ModBlocks.MOSSY_END_STONE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICK_WALL, ModBlocks.MOSSY_END_STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICK_WALL, ModBlocks.MOSSY_END_STONE_BRICKS);


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

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB, Blocks.CRACKED_STONE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_WALL, Blocks.CRACKED_STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_WALL, Blocks.CRACKED_STONE_BRICKS);

                offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILES, Blocks.STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILES, Blocks.STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILES, Blocks.STONE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, ModBlocks.STONE_TILES);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, Blocks.STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, Blocks.STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, ModBlocks.STONE_TILES);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, ModBlocks.STONE_TILES);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, Blocks.STONE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, Blocks.STONE_BRICKS,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, ModBlocks.STONE_TILES,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_WALL, ModBlocks.STONE_TILES);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_WALL, Blocks.STONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_WALL, Blocks.STONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_WALL, ModBlocks.STONE_TILES);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_TILE_STAIRS, ModBlocks.CRACKED_STONE_TILES);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_TILE_STAIRS, ModBlocks.CRACKED_STONE_TILES);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_TILE_SLAB, ModBlocks.CRACKED_STONE_TILES);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_TILE_SLAB, ModBlocks.CRACKED_STONE_TILES,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_TILE_WALL, ModBlocks.CRACKED_STONE_TILES);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_TILE_WALL, ModBlocks.CRACKED_STONE_TILES);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILE_STAIRS, ModBlocks.MOSSY_STONE_TILES);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILE_STAIRS, ModBlocks.MOSSY_STONE_TILES);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILE_SLAB, ModBlocks.MOSSY_STONE_TILES);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILE_SLAB, ModBlocks.MOSSY_STONE_TILES,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILE_WALL, ModBlocks.MOSSY_STONE_TILES);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILE_WALL, ModBlocks.MOSSY_STONE_TILES);


                //Miscellaneous Deepslate Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_STAIRS, Blocks.DEEPSLATE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_STAIRS, Blocks.DEEPSLATE);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB, Blocks.DEEPSLATE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB, Blocks.DEEPSLATE,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_WALL, Blocks.DEEPSLATE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_WALL, Blocks.DEEPSLATE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, ModBlocks.MOSSY_COBBLED_DEEPSLATE,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Blocks.CRACKED_DEEPSLATE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Blocks.CRACKED_DEEPSLATE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL, Blocks.CRACKED_DEEPSLATE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL, Blocks.CRACKED_DEEPSLATE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, ModBlocks.MOSSY_DEEPSLATE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Blocks.CRACKED_DEEPSLATE_TILES);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Blocks.CRACKED_DEEPSLATE_TILES);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Blocks.CRACKED_DEEPSLATE_TILES);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Blocks.CRACKED_DEEPSLATE_TILES,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL, Blocks.CRACKED_DEEPSLATE_TILES);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL, Blocks.CRACKED_DEEPSLATE_TILES);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS, ModBlocks.MOSSY_DEEPSLATE_TILES);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS, ModBlocks.MOSSY_DEEPSLATE_TILES);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB, ModBlocks.MOSSY_DEEPSLATE_TILES);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB, ModBlocks.MOSSY_DEEPSLATE_TILES,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_WALL, ModBlocks.MOSSY_DEEPSLATE_TILES);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_WALL, ModBlocks.MOSSY_DEEPSLATE_TILES);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_INLAID_DEEPSLATE)
                        .pattern("A")
                        .pattern("B")
                        .pattern("A")
                        .input('A', Blocks.DEEPSLATE_BRICK_SLAB)
                        .input('B', Blocks.SCULK)
                        .criterion(hasItem(Blocks.SCULK), conditionsFromItem(Blocks.SCULK))
                        .offerTo(exporter);

                offerPressurePlateRecipe(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Blocks.POLISHED_DEEPSLATE);

                createShapeless(RecipeCategory.REDSTONE, ModBlocks.POLISHED_DEEPSLATE_BUTTON)
                        .input(Blocks.POLISHED_DEEPSLATE)
                        .criterion(hasItem(Blocks.POLISHED_DEEPSLATE), conditionsFromItem(Blocks.POLISHED_DEEPSLATE))
                        .offerTo(exporter);


                //Miscellaneous Blackstone Blocks
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS,4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .input('A', Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)
                        .criterion(hasItem(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), conditionsFromItem(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "cracked_blackstone_brick_stairs_from_cracked_blackstone_bricks")));

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB,6)
                        .pattern("AAA")
                        .input('A', Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)
                        .criterion(hasItem(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), conditionsFromItem(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "cracked_blackstone_brick_slab_from_cracked_blackstone_bricks")));

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,2);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL,6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .input('A', Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)
                        .criterion(hasItem(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), conditionsFromItem(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(CinchsMissingBlocks.MOD_ID, "cracked_blackstone_brick_wall_from_cracked_blackstone_bricks")));

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);


                //Miscellaneous Netherrack Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);


                //Nether Brick Items
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModItems.RED_NETHER_BRICK, 4)
                        .pattern("AT")
                        .pattern("TA")
                        .input('A', Items.NETHER_WART)
                        .input('T', Items.NETHER_BRICK)
                        .criterion(hasItem(Items.NETHER_WART), conditionsFromItem(Items.NETHER_WART))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModItems.BLUE_NETHER_BRICK, 4)
                        .pattern("AT")
                        .pattern("TA")
                        .input('A', Items.NETHER_SPROUTS)
                        .input('T', Items.NETHER_BRICK)
                        .criterion(hasItem(Items.NETHER_SPROUTS), conditionsFromItem(Items.NETHER_SPROUTS))
                        .offerTo(exporter);


                //Miscellaneous Nether Brick Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.CRACKED_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.CRACKED_NETHER_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_WALL, Blocks.CRACKED_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_WALL, Blocks.CRACKED_NETHER_BRICKS);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_FENCE, 3)
                        .pattern("ATA")
                        .pattern("ATA")
                        .input('A', Blocks.CRACKED_NETHER_BRICKS)
                        .input('T', Items.NETHER_BRICK)
                        .criterion(hasItem(Blocks.CRACKED_NETHER_BRICKS), conditionsFromItem(Blocks.CRACKED_NETHER_BRICKS))
                        .offerTo(exporter);


                //Miscellaneous Red Nether Brick Blocks
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_NETHER_BRICK_FENCE, 3)
                        .pattern("ATA")
                        .pattern("ATA")
                        .input('A', Blocks.RED_NETHER_BRICKS)
                        .input('T', ModItems.RED_NETHER_BRICK)
                        .criterion(hasItem(Blocks.RED_NETHER_BRICKS), conditionsFromItem(Blocks.RED_NETHER_BRICKS))
                        .offerTo(exporter);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB, ModBlocks.CRACKED_RED_NETHER_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_WALL, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_WALL, ModBlocks.CRACKED_RED_NETHER_BRICKS);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_FENCE, 3)
                        .pattern("ATA")
                        .pattern("ATA")
                        .input('A', ModBlocks.CRACKED_RED_NETHER_BRICKS)
                        .input('T', ModItems.RED_NETHER_BRICK)
                        .criterion(hasItem(ModBlocks.CRACKED_RED_NETHER_BRICKS), conditionsFromItem(ModBlocks.CRACKED_RED_NETHER_BRICKS))
                        .offerTo(exporter);


                //Blue Nether Brick Blocks
                offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICKS, ModItems.BLUE_NETHER_BRICK);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICK_STAIRS, ModBlocks.BLUE_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICK_STAIRS, ModBlocks.BLUE_NETHER_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICK_SLAB, ModBlocks.BLUE_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICK_SLAB, ModBlocks.BLUE_NETHER_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICK_WALL, ModBlocks.BLUE_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICK_WALL, ModBlocks.BLUE_NETHER_BRICKS);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICK_FENCE, 3)
                        .pattern("ATA")
                        .pattern("ATA")
                        .input('A', ModBlocks.BLUE_NETHER_BRICKS)
                        .input('T', ModItems.BLUE_NETHER_BRICK)
                        .criterion(hasItem(ModBlocks.BLUE_NETHER_BRICKS), conditionsFromItem(ModBlocks.BLUE_NETHER_BRICKS))
                        .offerTo(exporter);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS, ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS, ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, ModBlocks.CRACKED_BLUE_NETHER_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_WALL, ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_WALL, ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE, 3)
                        .pattern("ATA")
                        .pattern("ATA")
                        .input('A', ModBlocks.CRACKED_BLUE_NETHER_BRICKS)
                        .input('T', ModItems.BLUE_NETHER_BRICK)
                        .criterion(hasItem(ModBlocks.CRACKED_BLUE_NETHER_BRICKS), conditionsFromItem(ModBlocks.CRACKED_BLUE_NETHER_BRICKS))
                        .offerTo(exporter);


                //Miscellaneous Prismarine Blocks
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_STAIRS, ModBlocks.CRACKED_PRISMARINE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_STAIRS, ModBlocks.CRACKED_PRISMARINE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_SLAB, ModBlocks.CRACKED_PRISMARINE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_SLAB, ModBlocks.CRACKED_PRISMARINE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_WALL, ModBlocks.CRACKED_PRISMARINE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_WALL, ModBlocks.CRACKED_PRISMARINE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_STAIRS, ModBlocks.MOSSY_PRISMARINE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_STAIRS, ModBlocks.MOSSY_PRISMARINE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_SLAB, ModBlocks.MOSSY_PRISMARINE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_SLAB, ModBlocks.MOSSY_PRISMARINE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_WALL, ModBlocks.MOSSY_PRISMARINE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_WALL, ModBlocks.MOSSY_PRISMARINE_BRICKS);


                //Miscellaneous Snow Blocks
                offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICKS, Blocks.SNOW_BLOCK);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_STAIRS, Blocks.SNOW_BLOCK);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_SLAB, Blocks.SNOW_BLOCK);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_WALL, Blocks.SNOW_BLOCK);


                //Miscellaneous Basalt Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);


                //Miscellaneous Sandstone Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS, Blocks.SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL, Blocks.SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);

                offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICKS, Blocks.CUT_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICKS, Blocks.SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICKS, Blocks.CUT_SANDSTONE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS, ModBlocks.SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS, Blocks.SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS, Blocks.CUT_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS, ModBlocks.SANDSTONE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB, ModBlocks.SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB, Blocks.SANDSTONE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB, Blocks.CUT_SANDSTONE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB, ModBlocks.SANDSTONE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_WALL, ModBlocks.SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_WALL, Blocks.SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_WALL, Blocks.CUT_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_WALL, ModBlocks.SANDSTONE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SANDSTONE_BRICK_STAIRS, ModBlocks.CRACKED_SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SANDSTONE_BRICK_STAIRS, ModBlocks.CRACKED_SANDSTONE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB, ModBlocks.CRACKED_SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB, ModBlocks.CRACKED_SANDSTONE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SANDSTONE_BRICK_WALL, ModBlocks.CRACKED_SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SANDSTONE_BRICK_WALL, ModBlocks.CRACKED_SANDSTONE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICK_STAIRS, ModBlocks.MOSSY_SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICK_STAIRS, ModBlocks.MOSSY_SANDSTONE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICK_SLAB, ModBlocks.MOSSY_SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICK_SLAB, ModBlocks.MOSSY_SANDSTONE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICK_WALL, ModBlocks.MOSSY_SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICK_WALL, ModBlocks.MOSSY_SANDSTONE_BRICKS);


                //Miscellaneous Red Sandstone Blocks
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.RED_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL, Blocks.RED_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);

                offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICKS, Blocks.CUT_RED_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICKS, Blocks.RED_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICKS, Blocks.CUT_RED_SANDSTONE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS, ModBlocks.RED_SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS, Blocks.RED_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS, Blocks.CUT_RED_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS, ModBlocks.RED_SANDSTONE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB, ModBlocks.RED_SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB, Blocks.RED_SANDSTONE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB, Blocks.CUT_RED_SANDSTONE,2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB, ModBlocks.RED_SANDSTONE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_WALL, ModBlocks.RED_SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_WALL, Blocks.RED_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_WALL, Blocks.CUT_RED_SANDSTONE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_WALL, ModBlocks.RED_SANDSTONE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_STAIRS, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_STAIRS, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS,2);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_WALL, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_WALL, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);


                //Miscellaneous Purpur Blocks
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);

                //Glass Blocks
                offerStainedGlassPaneRecipe(ModBlocks.TINTED_GLASS_PANE, Blocks.TINTED_GLASS);

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
                this.createPillarBlockRecipe(category, output, Ingredient.ofItems(input), 2)
                        .criterion(hasItem(input), this.conditionsFromItem(input)).offerTo(this.exporter);
            }
            public ShapedRecipeJsonBuilder createPillarBlockRecipe(RecipeCategory category, ItemConvertible output, Ingredient input, int count) {
                return ShapedRecipeJsonBuilder.create(ModRecipeProvider.this.items, category, output, count)
                        .input('#', input).pattern("#").pattern("#");
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