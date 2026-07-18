package net.cinchtail.cinchsmissingblocks.datagen;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private RecipeExporter exporter;

    @Override
    public void generate(RecipeExporter exporter) {
        this.exporter = exporter;

        //Cracked Block Smelting
        offerCrackingRecipe(exporter, ModBlocks.CRACKED_MUD_BRICKS, Blocks.MUD_BRICKS);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_BRICKS, Blocks.BRICKS);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_END_STONE_BRICKS, Blocks.END_STONE_BRICKS);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_TUFF_BRICKS, Blocks.TUFF_BRICKS);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICKS);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_DIORITE_BRICKS, ModBlocks.DIORITE_BRICKS);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_SANDSTONE_BRICKS, Blocks.CUT_SANDSTONE);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS, Blocks.CUT_RED_SANDSTONE);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_BLUE_NETHER_BRICKS, ModBlocks.BLUE_NETHER_BRICKS);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_STONE_TILES, ModBlocks.STONE_TILES);

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_BLACKSTONE_TILES, ModBlocks.BLACKSTONE_TILES);


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

        offerGenericMossyBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICKS, Blocks.END_STONE_BRICKS, Items.CHORUS_FLOWER);


        //Chiseled Blocks
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS, Blocks.END_STONE_BRICK_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS, Blocks.END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS, Blocks.END_STONE_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_MUD_BRICKS, Blocks.MUD_BRICK_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_MUD_BRICKS, Blocks.MUD_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICK_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICK_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS, Blocks.ANDESITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, ModBlocks.GRANITE_BRICK_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, Blocks.GRANITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS, ModBlocks.DIORITE_BRICK_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS, Blocks.DIORITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS, ModBlocks.DIORITE_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICK_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS, Blocks.DRIPSTONE_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS, ModBlocks.POLISHED_DRIPSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS, ModBlocks.DRIPSTONE_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS, ModBlocks.CALCITE_BRICK_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS, Blocks.CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_TUFF, Blocks.POLISHED_TUFF);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_TUFF, Blocks.TUFF_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_DEEPSLATE, Blocks.DEEPSLATE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PURPUR, Blocks.PURPUR_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PURPUR, Blocks.PURPUR_BLOCK);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BRICKS, Blocks.BRICK_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BRICKS, Blocks.BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BLUE_NETHER_BRICKS, ModBlocks.BLUE_NETHER_BRICK_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BLUE_NETHER_BRICKS, ModBlocks.BLUE_NETHER_BRICKS);


        //Pillar Blocks
        offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_BRICK_PILLAR, Blocks.END_STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_BRICK_PILLAR, Blocks.END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_BRICK_PILLAR, ModBlocks.POLISHED_END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_BRICK_PILLAR, Blocks.END_STONE_BRICKS);

        offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_BRICK_PILLAR, Blocks.MUD_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_BRICK_PILLAR, Blocks.MUD_BRICKS);

        offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_PILLAR, Blocks.STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_PILLAR, Blocks.STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_PILLAR, Blocks.STONE_BRICKS);

        offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_PILLAR, Blocks.DEEPSLATE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_PILLAR, Blocks.COBBLED_DEEPSLATE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_PILLAR, Blocks.POLISHED_DEEPSLATE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_PILLAR, Blocks.DEEPSLATE_BRICKS);

        offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_BRICK_PILLAR, Blocks.POLISHED_BLACKSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_BRICK_PILLAR, Blocks.BLACKSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_BRICK_PILLAR, Blocks.POLISHED_BLACKSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_BRICK_PILLAR, Blocks.POLISHED_BLACKSTONE_BRICKS);

        offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_PILLAR, Blocks.PRISMARINE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_PILLAR, Blocks.PRISMARINE_BRICKS);

        offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_PILLAR, ModBlocks.CALCITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_PILLAR, Blocks.CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_PILLAR, ModBlocks.POLISHED_CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_PILLAR, ModBlocks.CALCITE_BRICKS);

        offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_PILLAR, ModBlocks.DRIPSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_PILLAR, Blocks.DRIPSTONE_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_PILLAR, ModBlocks.POLISHED_DRIPSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_PILLAR, ModBlocks.DRIPSTONE_BRICKS);

        offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_PILLAR, ModBlocks.ANDESITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_PILLAR, Blocks.ANDESITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_PILLAR, Blocks.POLISHED_ANDESITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_PILLAR, ModBlocks.ANDESITE_BRICKS);

        offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_PILLAR, ModBlocks.GRANITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_PILLAR, Blocks.GRANITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_PILLAR, Blocks.POLISHED_GRANITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_PILLAR, ModBlocks.GRANITE_BRICKS);

        offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_PILLAR, ModBlocks.DIORITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_PILLAR, Blocks.DIORITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_PILLAR, Blocks.POLISHED_DIORITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_PILLAR, ModBlocks.DIORITE_BRICKS);

        offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_PILLAR, ModBlocks.SANDSTONE_BRICK_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_PILLAR, Blocks.SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_PILLAR, Blocks.CUT_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_PILLAR, ModBlocks.SANDSTONE_BRICKS);

        offerPillarBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_PILLAR, ModBlocks.RED_SANDSTONE_BRICK_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_PILLAR, Blocks.RED_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_PILLAR, Blocks.CUT_RED_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_PILLAR, ModBlocks.RED_SANDSTONE_BRICKS);


        //Miscellaneous Calcite Blocks
        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, Blocks.CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, Blocks.CALCITE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, Blocks.CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, Blocks.CALCITE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_CALCITE_WALL, Blocks.CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE);

        offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, Blocks.CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, Blocks.CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.POLISHED_CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, Blocks.CALCITE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.POLISHED_CALCITE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CALCITE_BRICK_WALL, Blocks.CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.POLISHED_CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_STAIRS, ModBlocks.CRACKED_CALCITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_STAIRS, ModBlocks.CRACKED_CALCITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_SLAB, ModBlocks.CRACKED_CALCITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_SLAB, ModBlocks.CRACKED_CALCITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_CALCITE_BRICK_WALL, ModBlocks.CRACKED_CALCITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_CALCITE_BRICK_WALL, ModBlocks.CRACKED_CALCITE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_STAIRS, ModBlocks.MOSSY_CALCITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_STAIRS, ModBlocks.MOSSY_CALCITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_SLAB, ModBlocks.MOSSY_CALCITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_SLAB, ModBlocks.MOSSY_CALCITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_CALCITE_BRICK_WALL, ModBlocks.MOSSY_CALCITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_CALCITE_BRICK_WALL, ModBlocks.MOSSY_CALCITE_BRICKS);


        //Miscellaneous Dripstone Blocks
        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS, ModBlocks.POLISHED_DRIPSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS, ModBlocks.POLISHED_DRIPSTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB, ModBlocks.POLISHED_DRIPSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB, ModBlocks.POLISHED_DRIPSTONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DRIPSTONE_WALL, ModBlocks.POLISHED_DRIPSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DRIPSTONE_WALL, ModBlocks.POLISHED_DRIPSTONE);

        offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS, ModBlocks.POLISHED_DRIPSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS, Blocks.DRIPSTONE_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS, ModBlocks.POLISHED_DRIPSTONE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS, ModBlocks.DRIPSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS, Blocks.DRIPSTONE_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS, ModBlocks.POLISHED_DRIPSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS, ModBlocks.DRIPSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, ModBlocks.DRIPSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, Blocks.DRIPSTONE_BLOCK,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, ModBlocks.POLISHED_DRIPSTONE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, ModBlocks.DRIPSTONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.DRIPSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_BRICK_WALL, Blocks.DRIPSTONE_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.POLISHED_DRIPSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.DRIPSTONE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_STAIRS, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_STAIRS, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB, ModBlocks.CRACKED_DRIPSTONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DRIPSTONE_BRICK_WALL, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DRIPSTONE_BRICK_WALL, ModBlocks.CRACKED_DRIPSTONE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB, ModBlocks.MOSSY_DRIPSTONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DRIPSTONE_BRICK_WALL, ModBlocks.MOSSY_DRIPSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DRIPSTONE_BRICK_WALL, ModBlocks.MOSSY_DRIPSTONE_BRICKS);


        //Miscellaneous Tuff Blocks
        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_STAIRS, ModBlocks.CRACKED_TUFF_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_STAIRS, ModBlocks.CRACKED_TUFF_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_SLAB, ModBlocks.CRACKED_TUFF_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_SLAB, ModBlocks.CRACKED_TUFF_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_TUFF_BRICK_WALL, ModBlocks.CRACKED_TUFF_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_TUFF_BRICK_WALL, ModBlocks.CRACKED_TUFF_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_STAIRS, ModBlocks.MOSSY_TUFF_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_STAIRS, ModBlocks.MOSSY_TUFF_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_SLAB, ModBlocks.MOSSY_TUFF_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_SLAB, ModBlocks.MOSSY_TUFF_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_TUFF_BRICK_WALL, ModBlocks.MOSSY_TUFF_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_TUFF_BRICK_WALL, ModBlocks.MOSSY_TUFF_BRICKS);


        //Miscellaneous Andesite Blocks
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.ANDESITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);

        offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.ANDESITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.POLISHED_ANDESITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.ANDESITE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.ANDESITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.POLISHED_ANDESITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS, ModBlocks.CRACKED_ANDESITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS, ModBlocks.CRACKED_ANDESITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_SLAB, ModBlocks.CRACKED_ANDESITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_SLAB, ModBlocks.CRACKED_ANDESITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_ANDESITE_BRICK_WALL, ModBlocks.CRACKED_ANDESITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_ANDESITE_BRICK_WALL, ModBlocks.CRACKED_ANDESITE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS, ModBlocks.MOSSY_ANDESITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS, ModBlocks.MOSSY_ANDESITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_SLAB, ModBlocks.MOSSY_ANDESITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_SLAB, ModBlocks.MOSSY_ANDESITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_ANDESITE_BRICK_WALL, ModBlocks.MOSSY_ANDESITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_ANDESITE_BRICK_WALL, ModBlocks.MOSSY_ANDESITE_BRICKS);


        //Miscellaneous Granite Blocks
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.GRANITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);

        offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.GRANITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, ModBlocks.GRANITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, Blocks.GRANITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, Blocks.POLISHED_GRANITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, ModBlocks.GRANITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Blocks.GRANITE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GRANITE_BRICK_WALL, Blocks.GRANITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GRANITE_BRICK_WALL, Blocks.POLISHED_GRANITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_STAIRS, ModBlocks.CRACKED_GRANITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_STAIRS, ModBlocks.CRACKED_GRANITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB, ModBlocks.CRACKED_GRANITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB, ModBlocks.CRACKED_GRANITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_GRANITE_BRICK_WALL, ModBlocks.CRACKED_GRANITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_GRANITE_BRICK_WALL, ModBlocks.CRACKED_GRANITE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_STAIRS, ModBlocks.MOSSY_GRANITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_STAIRS, ModBlocks.MOSSY_GRANITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_SLAB, ModBlocks.MOSSY_GRANITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_SLAB, ModBlocks.MOSSY_GRANITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_GRANITE_BRICK_WALL, ModBlocks.MOSSY_GRANITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_GRANITE_BRICK_WALL, ModBlocks.MOSSY_GRANITE_BRICKS);


        //Miscellaneous Diorite Blocks
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.DIORITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);

        offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.DIORITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, ModBlocks.DIORITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, Blocks.DIORITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, Blocks.POLISHED_DIORITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, ModBlocks.DIORITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Blocks.DIORITE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DIORITE_BRICK_WALL, Blocks.DIORITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DIORITE_BRICK_WALL, Blocks.POLISHED_DIORITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_STAIRS, ModBlocks.CRACKED_DIORITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_STAIRS, ModBlocks.CRACKED_DIORITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_SLAB, ModBlocks.CRACKED_DIORITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_SLAB, ModBlocks.CRACKED_DIORITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DIORITE_BRICK_WALL, ModBlocks.CRACKED_DIORITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DIORITE_BRICK_WALL, ModBlocks.CRACKED_DIORITE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_STAIRS, ModBlocks.MOSSY_DIORITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_STAIRS, ModBlocks.MOSSY_DIORITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_SLAB, ModBlocks.MOSSY_DIORITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_SLAB, ModBlocks.MOSSY_DIORITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DIORITE_BRICK_WALL, ModBlocks.MOSSY_DIORITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DIORITE_BRICK_WALL, ModBlocks.MOSSY_DIORITE_BRICKS);


        //Miscellaneous Quartz Blocks
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BLOCK,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_STAIRS, ModBlocks.CRACKED_QUARTZ_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_STAIRS, ModBlocks.CRACKED_QUARTZ_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_SLAB, ModBlocks.CRACKED_QUARTZ_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_SLAB, ModBlocks.CRACKED_QUARTZ_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_QUARTZ_BRICK_WALL, ModBlocks.CRACKED_QUARTZ_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_QUARTZ_BRICK_WALL, ModBlocks.CRACKED_QUARTZ_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS, ModBlocks.MOSSY_QUARTZ_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS, ModBlocks.MOSSY_QUARTZ_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_SLAB, ModBlocks.MOSSY_QUARTZ_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_SLAB, ModBlocks.MOSSY_QUARTZ_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_QUARTZ_BRICK_WALL, ModBlocks.MOSSY_QUARTZ_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_QUARTZ_BRICK_WALL, ModBlocks.MOSSY_QUARTZ_BRICKS);


        //Miscellaneous Brick Blocks
        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_STAIRS, ModBlocks.CRACKED_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_STAIRS, ModBlocks.CRACKED_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_SLAB, ModBlocks.CRACKED_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_SLAB, ModBlocks.CRACKED_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_BRICK_WALL, ModBlocks.CRACKED_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_BRICK_WALL, ModBlocks.CRACKED_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_STAIRS, ModBlocks.MOSSY_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_STAIRS, ModBlocks.MOSSY_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_SLAB, ModBlocks.MOSSY_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_SLAB, ModBlocks.MOSSY_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_BRICK_WALL, ModBlocks.MOSSY_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_BRICK_WALL, ModBlocks.MOSSY_BRICKS);


        //Miscellaneous Mud Blocks
        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_STAIRS, Blocks.PACKED_MUD);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_STAIRS, Blocks.PACKED_MUD);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_STAIRS, ModBlocks.CRACKED_MUD_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_STAIRS, ModBlocks.CRACKED_MUD_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_SLAB, ModBlocks.CRACKED_MUD_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_SLAB, ModBlocks.CRACKED_MUD_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_MUD_BRICK_WALL, ModBlocks.CRACKED_MUD_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_MUD_BRICK_WALL, ModBlocks.CRACKED_MUD_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_STAIRS, ModBlocks.MOSSY_MUD_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_STAIRS, ModBlocks.MOSSY_MUD_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_SLAB, ModBlocks.MOSSY_MUD_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_SLAB, ModBlocks.MOSSY_MUD_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_MUD_BRICK_WALL, ModBlocks.MOSSY_MUD_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_MUD_BRICK_WALL, ModBlocks.MOSSY_MUD_BRICKS);


        //Miscellaneous End Stone Blocks
        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS, Blocks.END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS, Blocks.END_STONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Blocks.END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Blocks.END_STONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.END_STONE_WALL, Blocks.END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.END_STONE_WALL, Blocks.END_STONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE, Blocks.END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE, Blocks.END_STONE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS, ModBlocks.POLISHED_END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS, Blocks.END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS, ModBlocks.POLISHED_END_STONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, Blocks.END_STONE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_END_STONE_WALL, Blocks.END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_STAIRS, ModBlocks.POLISHED_END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_SLAB, ModBlocks.POLISHED_END_STONE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, Blocks.END_STONE_BRICK_WALL, ModBlocks.POLISHED_END_STONE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_STAIRS, ModBlocks.CRACKED_END_STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_STAIRS, ModBlocks.CRACKED_END_STONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_SLAB, ModBlocks.CRACKED_END_STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_SLAB, ModBlocks.CRACKED_END_STONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_END_STONE_BRICK_WALL, ModBlocks.CRACKED_END_STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_END_STONE_BRICK_WALL, ModBlocks.CRACKED_END_STONE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICK_STAIRS, ModBlocks.MOSSY_END_STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICK_STAIRS, ModBlocks.MOSSY_END_STONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICK_SLAB, ModBlocks.MOSSY_END_STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_END_STONE_BRICK_SLAB, ModBlocks.MOSSY_END_STONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_END_STONE_BRICK_WALL, ModBlocks.MOSSY_END_STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_END_STONE_BRICK_WALL, ModBlocks.MOSSY_END_STONE_BRICKS);


        //Miscellaneous Stone Blocks
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STONE_WALL, Blocks.STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STONE_WALL, Blocks.STONE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS, Blocks.CRACKED_STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS, Blocks.CRACKED_STONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB, Blocks.CRACKED_STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB, Blocks.CRACKED_STONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICK_WALL, Blocks.CRACKED_STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICK_WALL, Blocks.CRACKED_STONE_BRICKS);

        offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILES, Blocks.STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILES, Blocks.STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILES, Blocks.STONE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, ModBlocks.STONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, Blocks.STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, Blocks.STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, ModBlocks.STONE_TILES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, ModBlocks.STONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, Blocks.STONE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, Blocks.STONE_BRICKS,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, ModBlocks.STONE_TILES,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STONE_TILE_WALL, ModBlocks.STONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STONE_TILE_WALL, Blocks.STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STONE_TILE_WALL, Blocks.STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STONE_TILE_WALL, ModBlocks.STONE_TILES);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_TILE_STAIRS, ModBlocks.CRACKED_STONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_TILE_STAIRS, ModBlocks.CRACKED_STONE_TILES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_TILE_SLAB, ModBlocks.CRACKED_STONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_TILE_SLAB, ModBlocks.CRACKED_STONE_TILES,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_TILE_WALL, ModBlocks.CRACKED_STONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_TILE_WALL, ModBlocks.CRACKED_STONE_TILES);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILE_STAIRS, ModBlocks.MOSSY_STONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILE_STAIRS, ModBlocks.MOSSY_STONE_TILES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILE_SLAB, ModBlocks.MOSSY_STONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_TILE_SLAB, ModBlocks.MOSSY_STONE_TILES,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_STONE_TILE_WALL, ModBlocks.MOSSY_STONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_STONE_TILE_WALL, ModBlocks.MOSSY_STONE_TILES);


        //Miscellaneous Deepslate Blocks
        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_STAIRS, Blocks.DEEPSLATE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_STAIRS, Blocks.DEEPSLATE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB, Blocks.DEEPSLATE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB, Blocks.DEEPSLATE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_WALL, Blocks.DEEPSLATE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_WALL, Blocks.DEEPSLATE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, ModBlocks.MOSSY_COBBLED_DEEPSLATE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Blocks.CRACKED_DEEPSLATE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Blocks.CRACKED_DEEPSLATE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL, Blocks.CRACKED_DEEPSLATE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL, Blocks.CRACKED_DEEPSLATE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, ModBlocks.MOSSY_DEEPSLATE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Blocks.CRACKED_DEEPSLATE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Blocks.CRACKED_DEEPSLATE_TILES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Blocks.CRACKED_DEEPSLATE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Blocks.CRACKED_DEEPSLATE_TILES,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL, Blocks.CRACKED_DEEPSLATE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL, Blocks.CRACKED_DEEPSLATE_TILES);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS, ModBlocks.MOSSY_DEEPSLATE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS, ModBlocks.MOSSY_DEEPSLATE_TILES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB, ModBlocks.MOSSY_DEEPSLATE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB, ModBlocks.MOSSY_DEEPSLATE_TILES,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DEEPSLATE_TILE_WALL, ModBlocks.MOSSY_DEEPSLATE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DEEPSLATE_TILE_WALL, ModBlocks.MOSSY_DEEPSLATE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_INLAID_DEEPSLATE)
                .pattern("A")
                .pattern("B")
                .pattern("A")
                .input('A', Blocks.DEEPSLATE_BRICK_SLAB)
                .input('B', Blocks.SCULK)
                .criterion(hasItem(Blocks.SCULK), conditionsFromItem(Blocks.SCULK))
                .offerTo(exporter);

        offerPressurePlateRecipe(exporter, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Blocks.POLISHED_DEEPSLATE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.POLISHED_DEEPSLATE_BUTTON)
                .input(Blocks.POLISHED_DEEPSLATE)
                .criterion(hasItem(Blocks.POLISHED_DEEPSLATE), conditionsFromItem(Blocks.POLISHED_DEEPSLATE))
                .offerTo(exporter);


        //Miscellaneous Blackstone Blocks
        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

        offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILES, Blocks.BLACKSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_STAIRS, ModBlocks.BLACKSTONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_STAIRS, Blocks.BLACKSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_STAIRS, Blocks.POLISHED_BLACKSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_STAIRS, Blocks.POLISHED_BLACKSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_STAIRS, ModBlocks.BLACKSTONE_TILES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_SLAB, ModBlocks.BLACKSTONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_SLAB, Blocks.BLACKSTONE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_SLAB, Blocks.POLISHED_BLACKSTONE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_TILE_SLAB, ModBlocks.BLACKSTONE_TILES,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_TILE_WALL, ModBlocks.BLACKSTONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_TILE_WALL, Blocks.BLACKSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_TILE_WALL, Blocks.POLISHED_BLACKSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_TILE_WALL, Blocks.POLISHED_BLACKSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_TILE_WALL, ModBlocks.BLACKSTONE_TILES);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLACKSTONE_TILE_STAIRS, ModBlocks.CRACKED_BLACKSTONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLACKSTONE_TILE_STAIRS, ModBlocks.CRACKED_BLACKSTONE_TILES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLACKSTONE_TILE_SLAB, ModBlocks.CRACKED_BLACKSTONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLACKSTONE_TILE_SLAB, ModBlocks.CRACKED_BLACKSTONE_TILES,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_BLACKSTONE_TILE_WALL, ModBlocks.CRACKED_BLACKSTONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_BLACKSTONE_TILE_WALL, ModBlocks.CRACKED_BLACKSTONE_TILES);


        //Miscellaneous Netherrack Blocks
        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);


        //Nether Brick Items
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModItems.RED_NETHER_BRICK, 4)
                .pattern("AT")
                .pattern("TA")
                .input('A', Items.NETHER_WART)
                .input('T', Items.NETHER_BRICK)
                .criterion(hasItem(Items.NETHER_WART), conditionsFromItem(Items.NETHER_WART))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModItems.BLUE_NETHER_BRICK, 4)
                .pattern("AT")
                .pattern("TA")
                .input('A', Items.NETHER_SPROUTS)
                .input('T', Items.NETHER_BRICK)
                .criterion(hasItem(Items.NETHER_SPROUTS), conditionsFromItem(Items.NETHER_SPROUTS))
                .offerTo(exporter);


        //Miscellaneous Nether Brick Blocks
        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.CRACKED_NETHER_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.CRACKED_NETHER_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_WALL, Blocks.CRACKED_NETHER_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_WALL, Blocks.CRACKED_NETHER_BRICKS);

        offerNetherBrickFenceRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_FENCE, Blocks.CRACKED_NETHER_BRICKS, Items.NETHER_BRICK);


        //Miscellaneous Red Nether Brick Blocks
        offerNetherBrickFenceRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_NETHER_BRICK_FENCE, Blocks.RED_NETHER_BRICKS, ModItems.RED_NETHER_BRICK);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, ModBlocks.CRACKED_RED_NETHER_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, ModBlocks.CRACKED_RED_NETHER_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB, ModBlocks.CRACKED_RED_NETHER_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB, ModBlocks.CRACKED_RED_NETHER_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_RED_NETHER_BRICK_WALL, ModBlocks.CRACKED_RED_NETHER_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_RED_NETHER_BRICK_WALL, ModBlocks.CRACKED_RED_NETHER_BRICKS);

        offerNetherBrickFenceRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_RED_NETHER_BRICK_FENCE, ModBlocks.CRACKED_RED_NETHER_BRICKS, ModItems.RED_NETHER_BRICK);


        //Blue Nether Brick Blocks
        offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICKS, ModItems.BLUE_NETHER_BRICK);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICK_STAIRS, ModBlocks.BLUE_NETHER_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICK_STAIRS, ModBlocks.BLUE_NETHER_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICK_SLAB, ModBlocks.BLUE_NETHER_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_NETHER_BRICK_SLAB, ModBlocks.BLUE_NETHER_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLUE_NETHER_BRICK_WALL, ModBlocks.BLUE_NETHER_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLUE_NETHER_BRICK_WALL, ModBlocks.BLUE_NETHER_BRICKS);

        offerNetherBrickFenceRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_NETHER_BRICK_FENCE, ModBlocks.BLUE_NETHER_BRICKS, ModItems.BLUE_NETHER_BRICK);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS, ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS, ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, ModBlocks.CRACKED_BLUE_NETHER_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_WALL, ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_WALL, ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

        offerNetherBrickFenceRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE, ModBlocks.CRACKED_BLUE_NETHER_BRICKS, ModItems.BLUE_NETHER_BRICK);


        //Miscellaneous Prismarine Blocks
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_STAIRS, ModBlocks.CRACKED_PRISMARINE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_STAIRS, ModBlocks.CRACKED_PRISMARINE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_SLAB, ModBlocks.CRACKED_PRISMARINE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_SLAB, ModBlocks.CRACKED_PRISMARINE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_PRISMARINE_BRICK_WALL, ModBlocks.CRACKED_PRISMARINE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_PRISMARINE_BRICK_WALL, ModBlocks.CRACKED_PRISMARINE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_STAIRS, ModBlocks.MOSSY_PRISMARINE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_STAIRS, ModBlocks.MOSSY_PRISMARINE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_SLAB, ModBlocks.MOSSY_PRISMARINE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_SLAB, ModBlocks.MOSSY_PRISMARINE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_PRISMARINE_BRICK_WALL, ModBlocks.MOSSY_PRISMARINE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_PRISMARINE_BRICK_WALL, ModBlocks.MOSSY_PRISMARINE_BRICKS);


        //Miscellaneous Snow Blocks
        offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICKS, Blocks.SNOW_BLOCK);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_STAIRS, Blocks.SNOW_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_SLAB, Blocks.SNOW_BLOCK);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SNOW_BRICK_WALL, Blocks.SNOW_BLOCK);


        //Miscellaneous Basalt Blocks
        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);


        //Miscellaneous Sandstone Blocks
        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS, Blocks.SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_WALL, Blocks.SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);

        offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICKS, Blocks.CUT_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICKS, Blocks.SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICKS, Blocks.CUT_SANDSTONE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS, ModBlocks.SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS, Blocks.SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS, Blocks.CUT_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS, ModBlocks.SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB, ModBlocks.SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB, Blocks.SANDSTONE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB, Blocks.CUT_SANDSTONE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB, ModBlocks.SANDSTONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_BRICK_WALL, ModBlocks.SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_BRICK_WALL, Blocks.SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_BRICK_WALL, Blocks.CUT_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_BRICK_WALL, ModBlocks.SANDSTONE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SANDSTONE_BRICK_STAIRS, ModBlocks.CRACKED_SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SANDSTONE_BRICK_STAIRS, ModBlocks.CRACKED_SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB, ModBlocks.CRACKED_SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB, ModBlocks.CRACKED_SANDSTONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_SANDSTONE_BRICK_WALL, ModBlocks.CRACKED_SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_SANDSTONE_BRICK_WALL, ModBlocks.CRACKED_SANDSTONE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICK_STAIRS, ModBlocks.MOSSY_SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICK_STAIRS, ModBlocks.MOSSY_SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICK_SLAB, ModBlocks.MOSSY_SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SANDSTONE_BRICK_SLAB, ModBlocks.MOSSY_SANDSTONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_SANDSTONE_BRICK_WALL, ModBlocks.MOSSY_SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_SANDSTONE_BRICK_WALL, ModBlocks.MOSSY_SANDSTONE_BRICKS);


        //Miscellaneous Red Sandstone Blocks
        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.RED_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_WALL, Blocks.RED_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);

        offerBricksRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICKS, Blocks.CUT_RED_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICKS, Blocks.RED_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICKS, Blocks.CUT_RED_SANDSTONE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS, ModBlocks.RED_SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS, Blocks.RED_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS, Blocks.CUT_RED_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS, ModBlocks.RED_SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB, ModBlocks.RED_SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB, Blocks.RED_SANDSTONE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB, Blocks.CUT_RED_SANDSTONE,2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB, ModBlocks.RED_SANDSTONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_BRICK_WALL, ModBlocks.RED_SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_BRICK_WALL, Blocks.RED_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_BRICK_WALL, Blocks.CUT_RED_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_BRICK_WALL, ModBlocks.RED_SANDSTONE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL, ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_STAIRS, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_STAIRS, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_WALL, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_RED_SANDSTONE_BRICK_WALL, ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);


        //Miscellaneous Purpur Blocks
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);


        //Glass Blocks
        offerStainedGlassPaneRecipe(exporter, ModBlocks.TINTED_GLASS_PANE, Blocks.TINTED_GLASS);


        //Terracotta Blocks
        /*offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_STAIRS, Blocks.TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_STAIRS, Blocks.TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_WALL, Blocks.BROWN_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_WALL, Blocks.BROWN_TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_WALL, Blocks.BLUE_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_WALL, Blocks.BLUE_TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA);*/


        //Concrete Blocks
        /*offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);

        offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);*/
    }

    public void offerStairsRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        String inputPath = idPath(input);
        ShapedRecipeJsonBuilder.create(category, output, 4).input('#', input)
                .pattern("#  ").pattern("## ").pattern("###").criterion("has_"+ inputPath,
                conditionsFromItem(input)).offerTo(this.exporter);
    }
    public void offerBricksRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        createCondensingRecipe(category, output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(this.exporter);
    }
    public void offerPillarBlockRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        String inputPath = idPath(input);
        ShapedRecipeJsonBuilder.create(category, output, 2).input('#', input).pattern("#").pattern("#").criterion("has_"+ inputPath,
                conditionsFromItem(input)).offerTo(this.exporter);
    }
    public void offerNetherBrickFenceRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input, ItemConvertible brickInput) {
        String outputPath = idPath(output);
        String inputPath = idPath(input);
        ShapedRecipeJsonBuilder.create(category, output, 3).group(outputPath).input('A', input).input('T', brickInput)
                .pattern("ATA").pattern("ATA").criterion("has_"+ inputPath,
                conditionsFromItem(brickInput)).offerTo(this.exporter);
    }
    public void offerMossyFromMossBlockRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        String outputPath = idPath(output);
        ShapelessRecipeJsonBuilder.create(category, output, 1).group(outputPath).input(input).input(Blocks.MOSS_BLOCK).criterion("has_moss_block",
                conditionsFromItem(Blocks.MOSS_BLOCK)).offerTo(this.exporter, Identifier.of(MOD_ID, outputPath + "_from_moss_block"));
    }
    public void offerMossyFromVineRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        String outputPath = idPath(output);
        ShapelessRecipeJsonBuilder.create(category, output, 1).group(outputPath).input(input).input(Blocks.VINE).criterion("has_vine",
                conditionsFromItem(Blocks.VINE)).offerTo(this.exporter, Identifier.of(MOD_ID, outputPath + "_from_vine"));
    }
    public void offerMossyFromMossCarpetsRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        String outputPath = idPath(output);
        ShapedRecipeJsonBuilder.create(category, output, 1).group(outputPath).input('#', Blocks.MOSS_CARPET).input('B', input)
                .pattern("#").pattern("B").pattern("#").criterion("has_moss_carpet",
                conditionsFromItem(Blocks.MOSS_CARPET)).offerTo(this.exporter, Identifier.of(MOD_ID, outputPath + "_from_moss_carpet"));
    }
    public void offerGenericMossyBlockRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input, ItemConvertible inputMoss) {
        String outputPath = idPath(output);
        String mossPath = idPath(inputMoss);
        ShapelessRecipeJsonBuilder.create(category, output, 1).group(outputPath).input(input).input(inputMoss).criterion("has_"+ mossPath,
                conditionsFromItem(inputMoss)).offerTo(this.exporter, Identifier.of(MOD_ID, outputPath + "_from_" + mossPath));
    }
    private static String idPath(ItemConvertible item) {
        return Registries.ITEM.getId(item.asItem()).getPath();
    }
    @Override
    public String getName() {
        return "Cinch's Missing Block Recipes";
    }
}