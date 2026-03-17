package net.cinchtail.cinchsmissingblocks.datagen;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {

        //Cracked Block Smelting Recipes
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.MUD_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICKS.get(), 0.1F, 200)
                .unlockedBy("has_mud_bricks", has(Blocks.MUD_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_mud_bricks"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.QUARTZ_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICKS.get(), 0.1F, 200)
                .unlockedBy("has_quartz_bricks", has(Blocks.QUARTZ_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_quartz_bricks"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.RED_NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICKS.get(), 0.1F, 200)
                .unlockedBy("has_red_nether_bricks", has(Blocks.RED_NETHER_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_red_nether_bricks"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICKS.get(), 0.1F, 200)
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_bricks"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.PRISMARINE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICKS.get(), 0.1F, 200)
                .unlockedBy("has_prismarine_bricks", has(Blocks.PRISMARINE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_prismarine_bricks"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.END_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICKS.get(), 0.1F, 200)
                .unlockedBy("has_end_stone_bricks", has(Blocks.END_STONE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_end_stone_bricks"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.TUFF_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICKS.get(), 0.1F, 200)
                .unlockedBy("has_tuff_bricks", has(Blocks.TUFF_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_tuff_bricks"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.CALCITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICKS.get(), 0.1F, 200)
                .unlockedBy("has_calcite_bricks", has(ModBlocks.CALCITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_calcite_bricks"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICKS.get(), 0.1F, 200)
                .unlockedBy("has_dripstone_bricks", has(ModBlocks.DRIPSTONE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_dripstone_bricks"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICKS.get(), 0.1F, 200)
                .unlockedBy("has_andesite_bricks", has(ModBlocks.ANDESITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_andesite_bricks"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICKS.get(), 0.1F, 200)
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_granite_bricks"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICKS.get(), 0.1F, 200)
                .unlockedBy("has_diorite_bricks", has(ModBlocks.DIORITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_diorite_bricks"));

        //Blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS.get())
                .pattern("A")
                .pattern("A")
                .define('A', Items.END_STONE_BRICK_SLAB)
                .unlockedBy("has_end_stone_brick_slab", has(Items.END_STONE_BRICK_SLAB))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS.get())
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_end_stone_bricks_from_end_stone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS.get())
                .unlockedBy("has_end_stone_bricks", has(Blocks.END_STONE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_end_stone_bricks_from_end_stone_bricks_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR.get(),2)
                .pattern("A")
                .pattern("A")
                .define('A', Items.END_STONE_BRICKS)
                .unlockedBy("has_end_stone_bricks", has(Items.END_STONE_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR.get())
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "end_stone_pillar_bricks_from_end_stone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR.get())
                .unlockedBy("has_end_stone_bricks", has(Blocks.END_STONE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "end_stone_pillar_bricks_from_end_stone_bricks_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_MUD_BRICKS.get())
                .pattern("A")
                .pattern("A")
                .define('A', Items.MUD_BRICK_SLAB)
                .unlockedBy("has_mud_brick_slab", has(Items.MUD_BRICK_SLAB))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MUD_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_MUD_BRICKS.get())
                .unlockedBy("has_mud_bricks", has(Blocks.MUD_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_mud_bricks_from_mud_bricks_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_RED_NETHER_BRICKS.get())
                .pattern("A")
                .pattern("A")
                .define('A', Items.RED_NETHER_BRICK_SLAB)
                .unlockedBy("has_red_nether_brick_slab", has(Items.RED_NETHER_BRICK_SLAB))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_RED_NETHER_BRICKS.get())
                .unlockedBy("has_red_nether_bricks", has(Blocks.RED_NETHER_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_red_nether_bricks_from_red_nether_bricks_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE.get(),4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.CALCITE)
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CALCITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE.get())
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_calcite_from_stonecutting"));


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CALCITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS.get())
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_calcite_stairs_from_stonecutting_from_calcite"));


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CALCITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB.get(),2)
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_calcite_slab_from_stonecutting_from_calcite"));


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CALCITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_WALL.get())
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_calcite_wall_from_stonecutting_from_calcite"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.CALCITE)
                .unlockedBy("has_calcite", has(Items.CALCITE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CALCITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS.get())
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB.get(),6)
                .pattern("AAA")
                .define('A', Items.CALCITE)
                .unlockedBy("has_calcite", has(Items.CALCITE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CALCITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB.get(),2)
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.CALCITE)
                .unlockedBy("has_calcite", has(Items.CALCITE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CALCITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL.get())
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.CRACKED_DEEPSLATE_BRICKS)
                .unlockedBy("has_cracked_deepslate_bricks", has(Items.CRACKED_DEEPSLATE_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_DEEPSLATE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_deepslate_bricks", has(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_deepslate_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', Items.CRACKED_DEEPSLATE_BRICKS)
                .unlockedBy("has_cracked_deepslate_bricks", has(Items.CRACKED_DEEPSLATE_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_DEEPSLATE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_deepslate_bricks", has(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_deepslate_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.CRACKED_DEEPSLATE_BRICKS)
                .unlockedBy("has_cracked_deepslate_bricks", has(Items.CRACKED_DEEPSLATE_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_DEEPSLATE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get())
                .unlockedBy("has_cracked_deepslate_bricks", has(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_deepslate_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.CRACKED_DEEPSLATE_TILES)
                .unlockedBy("has_cracked_deepslate_tiles", has(Items.CRACKED_DEEPSLATE_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_DEEPSLATE_TILES), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get())
                .unlockedBy("has_cracked_deepslate_tiles", has(Blocks.CRACKED_DEEPSLATE_TILES))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_deepslate_tile_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(),6)
                .pattern("AAA")
                .define('A', Items.CRACKED_DEEPSLATE_TILES)
                .unlockedBy("has_cracked_deepslate_tiles", has(Items.CRACKED_DEEPSLATE_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_DEEPSLATE_TILES), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(),2)
                .unlockedBy("has_cracked_deepslate_tiles", has(Blocks.CRACKED_DEEPSLATE_TILES))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_deepslate_tile_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.CRACKED_DEEPSLATE_TILES)
                .unlockedBy("has_cracked_deepslate_tiles", has(Items.CRACKED_DEEPSLATE_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_DEEPSLATE_TILES), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get())
                .unlockedBy("has_cracked_deepslate_tiles", has(Blocks.CRACKED_DEEPSLATE_TILES))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_deepslate_tile_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_MUD_BRICKS.get())
                .unlockedBy("has_cracked_mud_bricks", has(ModBlocks.CRACKED_MUD_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_MUD_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_mud_bricks", has(ModBlocks.CRACKED_MUD_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_mud_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_MUD_BRICKS.get())
                .unlockedBy("has_cracked_mud_bricks", has(ModBlocks.CRACKED_MUD_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_MUD_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_mud_bricks", has(ModBlocks.CRACKED_MUD_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_mud_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_MUD_BRICKS.get())
                .unlockedBy("has_cracked_mud_bricks", has(ModBlocks.CRACKED_MUD_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_MUD_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MUD_BRICK_WALL.get())
                .unlockedBy("has_cracked_mud_bricks", has(ModBlocks.CRACKED_MUD_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_mud_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.CRACKED_NETHER_BRICKS)
                .unlockedBy("has_cracked_nether_bricks", has(Items.CRACKED_NETHER_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_nether_bricks", has(Blocks.CRACKED_NETHER_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_nether_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', Items.CRACKED_NETHER_BRICKS)
                .unlockedBy("has_cracked_nether_bricks", has(Items.CRACKED_NETHER_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_nether_bricks", has(Blocks.CRACKED_NETHER_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_nether_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.CRACKED_NETHER_BRICKS)
                .unlockedBy("has_cracked_nether_bricks", has(Items.CRACKED_NETHER_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_WALL.get())
                .unlockedBy("has_cracked_nether_bricks", has(Blocks.CRACKED_NETHER_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_nether_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_FENCE.get(),3)
                .pattern("ATA")
                .pattern("ATA")
                .define('A', Blocks.CRACKED_NETHER_BRICKS)
                .define('T', Items.NETHER_BRICK)
                .unlockedBy("has_cracked_nether_bricks", has(Blocks.CRACKED_NETHER_BRICKS))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.CRACKED_POLISHED_BLACKSTONE_BRICKS)
                .unlockedBy("has_cracked_polished_blackstone_bricks", has(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_polished_blackstone_bricks", has(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_polished_blackstone_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', Items.CRACKED_POLISHED_BLACKSTONE_BRICKS)
                .unlockedBy("has_cracked_polished_blackstone_bricks", has(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_polished_blackstone_bricks", has(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_polished_blackstone_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.CRACKED_POLISHED_BLACKSTONE_BRICKS)
                .unlockedBy("has_cracked_polished_blackstone_bricks", has(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get())
                .unlockedBy("has_cracked_polished_blackstone_bricks", has(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_polished_blackstone_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_QUARTZ_BRICKS.get())
                .unlockedBy("has_cracked_quartz_bricks", has(ModBlocks.CRACKED_QUARTZ_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_QUARTZ_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_quartz_bricks", has(ModBlocks.CRACKED_QUARTZ_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_quartz_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_QUARTZ_BRICKS.get())
                .unlockedBy("has_cracked_quartz_bricks", has(ModBlocks.CRACKED_QUARTZ_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_QUARTZ_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_quartz_bricks", has(ModBlocks.CRACKED_QUARTZ_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_quartz_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_QUARTZ_BRICKS.get())
                .unlockedBy("has_cracked_quartz_bricks", has(ModBlocks.CRACKED_QUARTZ_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_QUARTZ_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_QUARTZ_BRICK_WALL.get())
                .unlockedBy("has_cracked_quartz_bricks", has(ModBlocks.CRACKED_QUARTZ_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_quartz_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_RED_NETHER_BRICKS.get())
                .unlockedBy("has_cracked_red_nether_bricks", has(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_red_nether_bricks", has(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_red_nether_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_RED_NETHER_BRICKS.get())
                .unlockedBy("has_cracked_red_nether_bricks", has(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_red_nether_bricks", has(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_red_nether_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_RED_NETHER_BRICKS.get())
                .unlockedBy("has_cracked_red_nether_bricks", has(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_WALL.get())
                .unlockedBy("has_cracked_red_nether_bricks", has(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_red_nether_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_RED_NETHER_BRICK_FENCE.get(),3)
                .pattern("ATA")
                .pattern("ATA")
                .define('A', ModBlocks.CRACKED_RED_NETHER_BRICKS.get())
                .define('T', Items.NETHER_BRICK)
                .unlockedBy("has_cracked_red_nether_bricks", has(ModBlocks.CRACKED_RED_NETHER_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.CRACKED_STONE_BRICKS)
                .unlockedBy("has_cracked_stone_bricks", has(Items.CRACKED_STONE_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_stone_bricks", has(Blocks.CRACKED_STONE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_stone_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', Items.CRACKED_STONE_BRICKS)
                .unlockedBy("has_cracked_stone_bricks", has(Items.CRACKED_STONE_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_stone_bricks", has(Blocks.CRACKED_STONE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_stone_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.CRACKED_STONE_BRICKS)
                .unlockedBy("has_cracked_stone_bricks", has(Items.CRACKED_STONE_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CRACKED_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_WALL.get())
                .unlockedBy("has_cut_red_sandstone_bricks", has(Blocks.CRACKED_STONE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_cut_red_sandstone_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.CUT_RED_SANDSTONE)
                .unlockedBy("has_cut_red_sandstone", has(Items.CUT_RED_SANDSTONE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS.get())
                .unlockedBy("has_cut_red_sandstone", has(Blocks.CUT_RED_SANDSTONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cut_red_sandstone_stairs_from_stonecutting_from_cut_red_sandstone"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS.get())
                .unlockedBy("has_red_sandstone", has(Blocks.RED_SANDSTONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cut_red_sandstone_stairs_from_stonecutting_from_red_sandstone"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.CUT_RED_SANDSTONE)
                .unlockedBy("has_cut_red_sandstone", has(Items.CUT_RED_SANDSTONE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL.get())
                .unlockedBy("has_cut_red_sandstone", has(Blocks.CUT_RED_SANDSTONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cut_red_sandstone_wall_from_stonecutting_from_cut_red_sandstone"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL.get())
                .unlockedBy("has_red_sandstone", has(Blocks.RED_SANDSTONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cut_red_sandstone_wall_from_stonecutting_from_red_sandstone"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.CUT_SANDSTONE)
                .unlockedBy("has_cut_sandstone", has(Items.CUT_SANDSTONE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS.get())
                .unlockedBy("has_cut_sandstone", has(Blocks.CUT_SANDSTONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cut_sandstone_stairs_from_stonecutting_from_cut_sandstone"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS.get())
                .unlockedBy("has_sandstone", has(Blocks.SANDSTONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cut_sandstone_stairs_from_stonecutting_from_sandstone"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.CUT_SANDSTONE)
                .unlockedBy("has_cut_sandstone", has(Items.CUT_SANDSTONE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL.get())
                .unlockedBy("has_cut_sandstone", has(Blocks.CUT_SANDSTONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cut_sandstone_wall_from_stonecutting_from_cut_sandstone"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL.get())
                .unlockedBy("has_sandstone", has(Blocks.SANDSTONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cut_sandstone_wall_from_stonecutting_frpm_sandstone"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.DARK_PRISMARINE)
                .unlockedBy("has_dark_prismarine", has(Items.DARK_PRISMARINE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DARK_PRISMARINE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL.get())
                .unlockedBy("has_dark_prismarine", has(Blocks.DARK_PRISMARINE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dark_prismarine_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.DRIPSTONE_BLOCK)
                .unlockedBy("has_dripstone_block", has(Items.DRIPSTONE_BLOCK))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_STAIRS.get())
                .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB.get(),6)
                .pattern("AAA")
                .define('A', Items.DRIPSTONE_BLOCK)
                .unlockedBy("has_dripstone_block", has(Items.DRIPSTONE_BLOCK))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB.get(),2)
                .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.DRIPSTONE_BLOCK)
                .unlockedBy("has_dripstone_block", has(Items.DRIPSTONE_BLOCK))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_WALL.get())
                .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.END_STONE)
                .unlockedBy("has_end_stone", has(Items.END_STONE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS.get())
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "end_stone_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB.get(),6)
                .pattern("AAA")
                .define('A', Items.END_STONE)
                .unlockedBy("has_end_stone", has(Items.END_STONE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB.get(),2)
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "end_stone_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.END_STONE)
                .unlockedBy("has_end_stone", has(Items.END_STONE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL.get())
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "end_stone_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Blocks.PACKED_MUD)
                .unlockedBy("has_packed_mud", has(Blocks.PACKED_MUD))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PACKED_MUD), RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_STAIRS.get())
                .unlockedBy("has_packed_mud", has(Blocks.PACKED_MUD))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "packed_mud_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB.get(),6)
                .pattern("AAA")
                .define('A', Blocks.PACKED_MUD)
                .unlockedBy("has_packed_mud", has(Blocks.PACKED_MUD))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PACKED_MUD), RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB.get(),2)
                .unlockedBy("has_packed_mud", has(Blocks.PACKED_MUD))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "packed_mud_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.PACKED_MUD)
                .unlockedBy("has_packed_mud", has(Blocks.PACKED_MUD))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PACKED_MUD), RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_WALL.get())
                .unlockedBy("has_packed_mud", has(Blocks.PACKED_MUD))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "packed_mud_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_MUD_BRICKS.get())
                .unlockedBy("has_mossy_mud_bricks", has(ModBlocks.MOSSY_MUD_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_MUD_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_STAIRS.get())
                .unlockedBy("has_mossy_mud_bricks", has(ModBlocks.MOSSY_MUD_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_mud_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_MUD_BRICKS.get())
                .unlockedBy("has_mossy_mud_bricks", has(ModBlocks.MOSSY_MUD_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_MUD_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_SLAB.get(),2)
                .unlockedBy("has_mossy_mud_bricks", has(ModBlocks.MOSSY_MUD_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_mud_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_MUD_BRICKS.get())
                .unlockedBy("has_mossy_mud_bricks", has(ModBlocks.MOSSY_MUD_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_MUD_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICK_WALL.get())
                .unlockedBy("has_mossy_mud_bricks", has(ModBlocks.MOSSY_MUD_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_mud_brick_wall_from_stonecutting"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICKS.get())
                .group("mossy_mud_bricks")
                .requires(Blocks.MUD_BRICKS)
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_mud_brick_from_moss_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICKS.get())
                .group("mossy_mud_bricks")
                .requires(Blocks.MUD_BRICKS)
                .requires(Blocks.VINE)
                .unlockedBy("has_vine", has(Blocks.VINE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_mud_brick_from_vine"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_MUD_BRICKS.get())
                .group("mossy_mud_bricks")
                .pattern("A")
                .pattern("Z")
                .pattern("A")
                .define('A', Blocks.MOSS_CARPET)
                .define('Z', Blocks.MUD_BRICKS)
                .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_mud_brick_from_moss_carpet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.POLISHED_ANDESITE)
                .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL.get())
                .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_andesite_wall_from_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL.get())
                .unlockedBy("has_andesite", has(Blocks.ANDESITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_andesite_wall_from_stonecutting_from_andesite"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS.get(),4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.POLISHED_ANDESITE)
                .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS.get())
                .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "andesite_bricks_from_stonecutting_polished_andesite"));


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.ANDESITE_BRICKS.get())
                .unlockedBy("has_andesite_bricks", has(ModBlocks.ANDESITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS.get())
                .unlockedBy("has_andesite_bricks", has(ModBlocks.ANDESITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "andesite_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.ANDESITE_BRICKS.get())
                .unlockedBy("has_andesite_bricks", has(ModBlocks.ANDESITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_andesite_bricks", has(ModBlocks.ANDESITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "andesite_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.ANDESITE_BRICKS.get())
                .unlockedBy("has_andesite_bricks", has(ModBlocks.ANDESITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL.get())
                .unlockedBy("has_andesite_bricks", has(ModBlocks.ANDESITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "andesite_brick_wall_from_stonecutting_from_andesite_bricks"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS.get())
                .unlockedBy("has_andesite", has(Blocks.ANDESITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "andesite_bricks_from_stonecutting_from_andesite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS.get())
                .unlockedBy("has_andesite", has(Blocks.ANDESITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "andesite_brick_stairs_from_stonecutting_from_andesite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_andesite", has(Blocks.ANDESITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "andesite_brick_slab_from_stonecutting_from_andesite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL.get())
                .unlockedBy("has_andesite", has(Blocks.ANDESITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "andesite_brick_wall_from_stonecutting_from_andesite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS.get())
                .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "andesite_brick_stairs_from_stonecutting_from_polished_andesite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "andesite_brick_slab_from_stonecutting_from_polished_andesite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL.get())
                .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "andesite_brick_wall_from_stonecutting_from_polished_andesite"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_ANDESITE_BRICKS.get())
                .unlockedBy("has_cracked_andesite_bricks", has(ModBlocks.CRACKED_ANDESITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_andesite_bricks", has(ModBlocks.CRACKED_ANDESITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_andesite_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_ANDESITE_BRICKS.get())
                .unlockedBy("has_cracked_andesite_bricks", has(ModBlocks.CRACKED_ANDESITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_andesite_bricks", has(ModBlocks.CRACKED_ANDESITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_andesite_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_ANDESITE_BRICKS.get())
                .unlockedBy("has_cracked_andesite_bricks", has(ModBlocks.CRACKED_ANDESITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_WALL.get())
                .unlockedBy("has_cracked_andesite_bricks", has(ModBlocks.CRACKED_ANDESITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_andesite_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_ANDESITE_BRICKS.get())
                .unlockedBy("has_mossy_andesite_bricks", has(ModBlocks.MOSSY_ANDESITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS.get())
                .unlockedBy("has_mossy_andesite_bricks", has(ModBlocks.MOSSY_ANDESITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_andesite_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_ANDESITE_BRICKS.get())
                .unlockedBy("has_mossy_andesite_bricks", has(ModBlocks.MOSSY_ANDESITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_mossy_andesite_bricks", has(ModBlocks.MOSSY_ANDESITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_andesite_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_ANDESITE_BRICKS.get())
                .unlockedBy("has_mossy_andesite_bricks", has(ModBlocks.MOSSY_ANDESITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_WALL.get())
                .unlockedBy("has_mossy_andesite_bricks", has(ModBlocks.MOSSY_ANDESITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_andesite_brick_wall_from_stonecutting"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICKS.get())
                .group("mossy_andesite_bricks")
                .requires(ModBlocks.ANDESITE_BRICKS.get())
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_andesite_brick_from_moss_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICKS.get())
                .group("mossy_andesite_bricks")
                .requires(ModBlocks.ANDESITE_BRICKS.get())
                .requires(Blocks.VINE)
                .unlockedBy("has_vine", has(Blocks.VINE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_andesite_brick_from_vine"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICKS.get())
                .group("mossy_andesite_bricks")
                .pattern("A")
                .pattern("Z")
                .pattern("A")
                .define('A', Blocks.MOSS_CARPET)
                .define('Z', ModBlocks.ANDESITE_BRICKS.get())
                .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_andesite_brick_from_moss_carpet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS.get())
                .pattern("A")
                .pattern("A")
                .define('A', ModBlocks.ANDESITE_BRICK_SLAB.get())
                .unlockedBy("has_andesite_brick_slab", has(ModBlocks.ANDESITE_BRICK_SLAB.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS.get())
                .unlockedBy("has_andesite", has(Blocks.ANDESITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_andesite_bricks_from_andesite_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS.get())
                .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_andesite_bricks_from_polished_andesite_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ANDESITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS.get())
                .unlockedBy("has_andesite_bricks", has(ModBlocks.ANDESITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_andesite_bricks_from_andesite_bricks_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.POLISHED_CALCITE.get())
                .unlockedBy("has_polished_calcite", has(ModBlocks.POLISHED_CALCITE.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_CALCITE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS.get())
                .unlockedBy("has_polished_calcite", has(ModBlocks.POLISHED_CALCITE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_calcite_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.POLISHED_CALCITE.get())
                .unlockedBy("has_polished_calcite", has(ModBlocks.POLISHED_CALCITE.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_CALCITE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB.get(),2)
                .unlockedBy("has_polished_calcite", has(ModBlocks.POLISHED_CALCITE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_calcite_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.POLISHED_CALCITE.get())
                .unlockedBy("has_polished_calcite", has(ModBlocks.POLISHED_CALCITE.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_CALCITE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_WALL.get())
                .unlockedBy("has_polished_calcite", has(ModBlocks.POLISHED_CALCITE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_calcite_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.POLISHED_DIORITE)
                .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL.get())
                .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_diorite_wall_from_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL.get())
                .unlockedBy("has_diorite", has(Blocks.DIORITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_diorite_wall_from_stonecutting_from_diorite"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS.get(),4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.POLISHED_DIORITE)
                .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS.get())
                .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "diorite_bricks_from_stonecutting_polished_diorite"));


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.DIORITE_BRICKS.get())
                .unlockedBy("has_diorite_bricks", has(ModBlocks.DIORITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS.get())
                .unlockedBy("has_diorite_bricks", has(ModBlocks.DIORITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "diorite_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.DIORITE_BRICKS.get())
                .unlockedBy("has_diorite_bricks", has(ModBlocks.DIORITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_diorite_bricks", has(ModBlocks.DIORITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "diorite_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.DIORITE_BRICKS.get())
                .unlockedBy("has_diorite_bricks", has(ModBlocks.DIORITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL.get())
                .unlockedBy("has_diorite_bricks", has(ModBlocks.DIORITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "diorite_brick_wall_from_stonecutting_from_diorite_bricks"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS.get())
                .unlockedBy("has_diorite", has(Blocks.DIORITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "diorite_bricks_from_stonecutting_from_diorite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS.get())
                .unlockedBy("has_diorite", has(Blocks.DIORITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "diorite_brick_stairs_from_stonecutting_from_diorite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_diorite", has(Blocks.DIORITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "diorite_brick_slab_from_stonecutting_from_diorite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL.get())
                .unlockedBy("has_diorite", has(Blocks.DIORITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "diorite_brick_wall_from_stonecutting_from_diorite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS.get())
                .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "diorite_brick_stairs_from_stonecutting_from_polished_diorite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "diorite_brick_slab_from_stonecutting_from_polished_diorite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL.get())
                .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "diorite_brick_wall_from_stonecutting_from_polished_diorite"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_DIORITE_BRICKS.get())
                .unlockedBy("has_cracked_diorite_bricks", has(ModBlocks.CRACKED_DIORITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_diorite_bricks", has(ModBlocks.CRACKED_DIORITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_diorite_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_DIORITE_BRICKS.get())
                .unlockedBy("has_cracked_diorite_bricks", has(ModBlocks.CRACKED_DIORITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_diorite_bricks", has(ModBlocks.CRACKED_DIORITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_diorite_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_DIORITE_BRICKS.get())
                .unlockedBy("has_cracked_diorite_bricks", has(ModBlocks.CRACKED_DIORITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_WALL.get())
                .unlockedBy("has_cracked_diorite_bricks", has(ModBlocks.CRACKED_DIORITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_diorite_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_DIORITE_BRICKS.get())
                .unlockedBy("has_mossy_diorite_bricks", has(ModBlocks.MOSSY_DIORITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_STAIRS.get())
                .unlockedBy("has_mossy_diorite_bricks", has(ModBlocks.MOSSY_DIORITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_diorite_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_DIORITE_BRICKS.get())
                .unlockedBy("has_mossy_diorite_bricks", has(ModBlocks.MOSSY_DIORITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_mossy_diorite_bricks", has(ModBlocks.MOSSY_DIORITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_diorite_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_DIORITE_BRICKS.get())
                .unlockedBy("has_mossy_diorite_bricks", has(ModBlocks.MOSSY_DIORITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_WALL.get())
                .unlockedBy("has_mossy_diorite_bricks", has(ModBlocks.MOSSY_DIORITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_diorite_brick_wall_from_stonecutting"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICKS.get())
                .group("mossy_diorite_bricks")
                .requires(ModBlocks.DIORITE_BRICKS.get())
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_diorite_brick_from_moss_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICKS.get())
                .group("mossy_diorite_bricks")
                .requires(ModBlocks.DIORITE_BRICKS.get())
                .requires(Blocks.VINE)
                .unlockedBy("has_vine", has(Blocks.VINE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_diorite_brick_from_vine"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICKS.get())
                .group("mossy_diorite_bricks")
                .pattern("A")
                .pattern("Z")
                .pattern("A")
                .define('A', Blocks.MOSS_CARPET)
                .define('Z', ModBlocks.DIORITE_BRICKS.get())
                .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_diorite_brick_from_moss_carpet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS.get())
                .pattern("A")
                .pattern("A")
                .define('A', ModBlocks.DIORITE_BRICK_SLAB.get())
                .unlockedBy("has_diorite_brick_slab", has(ModBlocks.DIORITE_BRICK_SLAB.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS.get())
                .unlockedBy("has_diorite", has(Blocks.DIORITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_diorite_bricks_from_diorite_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS.get())
                .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_diorite_bricks_from_polished_diorite_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DIORITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BRICKS.get())
                .unlockedBy("has_diorite_bricks", has(ModBlocks.DIORITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_diorite_bricks_from_diorite_bricks_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE.get(),4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.DRIPSTONE_BLOCK)
                .unlockedBy("has_dripstone", has(Blocks.DRIPSTONE_BLOCK))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE.get())
                .unlockedBy("has_dripstone", has(Blocks.DRIPSTONE_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_dripstone_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.POLISHED_DRIPSTONE.get())
                .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DRIPSTONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS.get())
                .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_dripstone_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.POLISHED_DRIPSTONE.get())
                .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DRIPSTONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB.get(),2)
                .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_dripstone_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.POLISHED_DRIPSTONE.get())
                .unlockedBy("has_polished_dripstone_block", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DRIPSTONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_WALL.get())
                .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_dripstone_wall_from_stonecutting"));


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS.get())
                .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_dripstone_stairs_from_stonecutting_from_dripstone_block"));


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB.get(),2)
                .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_dripstone_slab_from_stonecutting_from_dripstone_block"));


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_WALL.get())
                .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_dripstone_wall_from_stonecutting_from_dripstone_block"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS.get(),4)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.POLISHED_DRIPSTONE.get())
                .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DRIPSTONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS.get())
                .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_bricks_from_stonecutting_polished_dripstone"));


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.DRIPSTONE_BRICKS.get())
                .unlockedBy("has_dripstone_bricks", has(ModBlocks.DRIPSTONE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS.get())
                .unlockedBy("has_dripstone_bricks", has(ModBlocks.DRIPSTONE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.DRIPSTONE_BRICKS.get())
                .unlockedBy("has_dripstone_bricks", has(ModBlocks.DRIPSTONE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB.get(),2)
                .unlockedBy("has_dripstone_bricks", has(ModBlocks.DRIPSTONE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.DRIPSTONE_BRICKS.get())
                .unlockedBy("has_dripstone_bricks", has(ModBlocks.DRIPSTONE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL.get())
                .unlockedBy("has_dripstone_bricks", has(ModBlocks.DRIPSTONE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_brick_wall_from_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS.get())
                .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_bricks_from_stonecutting_from_dripstone_block"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS.get())
                .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_brick_stairs_from_stonecutting_from_dripstone_block"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB.get(),2)
                .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_brick_slab_from_stonecutting_from_dripstone_block"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL.get())
                .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_brick_wall_from_stonecutting_from_dripstone_block"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DRIPSTONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS.get())
                .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_brick_stairs_from_stonecutting_from_polished_dripstone"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DRIPSTONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB.get(),2)
                .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_brick_slab_from_stonecutting_from_polished_dripstone"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DRIPSTONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_WALL.get())
                .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_brick_wall_from_stonecutting_from_polished_dripstone"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_DRIPSTONE_BRICKS.get())
                .unlockedBy("has_dripstone_cracked_bricks", has(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_STAIRS.get())
                .unlockedBy("has_dripstone_cracked_bricks", has(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_dripstone_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_DRIPSTONE_BRICKS.get())
                .unlockedBy("has_dripstone_cracked_bricks", has(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB.get(),2)
                .unlockedBy("has_dripstone_cracked_bricks", has(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_dripstone_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_DRIPSTONE_BRICKS.get())
                .unlockedBy("has_dripstone_cracked_bricks", has(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DRIPSTONE_BRICK_WALL.get())
                .unlockedBy("has_dripstone_cracked_bricks", has(ModBlocks.CRACKED_DRIPSTONE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_dripstone_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_DRIPSTONE_BRICKS.get())
                .unlockedBy("has_mossy_dripstone_bricks", has(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS.get())
                .unlockedBy("has_mossy_dripstone_bricks", has(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_dripstone_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_DRIPSTONE_BRICKS.get())
                .unlockedBy("has_mossy_dripstone_bricks", has(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB.get(),2)
                .unlockedBy("has_mossy_dripstone_bricks", has(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_dripstone_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_DRIPSTONE_BRICKS.get())
                .unlockedBy("has_mossy_dripstone_bricks", has(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICK_WALL.get())
                .unlockedBy("has_mossy_dripstone_bricks", has(ModBlocks.MOSSY_DRIPSTONE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_dripstone_brick_wall_from_stonecutting"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICKS.get())
                .group("mossy_dripstone_bricks")
                .requires(ModBlocks.DRIPSTONE_BRICKS.get())
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_dripstone_brick_from_moss_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICKS.get())
                .group("mossy_dripstone_bricks")
                .requires(ModBlocks.DRIPSTONE_BRICKS.get())
                .requires(Blocks.VINE)
                .unlockedBy("has_vine", has(Blocks.VINE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_dripstone_brick_from_vine"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DRIPSTONE_BRICKS.get())
                .group("mossy_dripstone_bricks")
                .pattern("A")
                .pattern("Z")
                .pattern("A")
                .define('A', Blocks.MOSS_CARPET)
                .define('Z', ModBlocks.DRIPSTONE_BRICKS.get())
                .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_dripstone_brick_from_moss_carpet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS.get())
                .pattern("A")
                .pattern("A")
                .define('A', ModBlocks.DRIPSTONE_BRICK_SLAB.get())
                .unlockedBy("has_dripstone_brick_slab", has(ModBlocks.DRIPSTONE_BRICK_SLAB.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS.get())
                .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_dripstone_bricks_from_stonecutting_dripstone_block"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DRIPSTONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS.get())
                .unlockedBy("has_polished_dripstone", has(ModBlocks.POLISHED_DRIPSTONE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_dripstone_bricks_from_stonecutting_polished_dripstone"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DRIPSTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS.get())
                .unlockedBy("has_dripstone_bricks", has(ModBlocks.DRIPSTONE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_dripstone_bricks_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.POLISHED_GRANITE)
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_granite_wall_from_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_granite_wall_from_stonecutting_from_granite"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS.get(),4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.POLISHED_GRANITE)
                .unlockedBy("has_granite_bricks", has(Blocks.POLISHED_GRANITE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS.get())
                .unlockedBy("has_granite_bricks", has(Blocks.POLISHED_GRANITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "granite_bricks_from_stonecutting_polished_granite"));


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.GRANITE_BRICKS.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "granite_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.GRANITE_BRICKS.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "granite_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.GRANITE_BRICKS.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "granite_brick_wall_from_stonecutting_from_granite_bricks"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "granite_bricks_from_stonecutting_from_granite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "granite_brick_stairs_from_stonecutting_from_granite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "granite_brick_slab_from_stonecutting_from_granite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "granite_brick_wall_from_stonecutting_from_granite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "granite_brick_stairs_from_stonecutting_from_polished_granite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "granite_brick_slab_from_stonecutting_from_polished_granite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "granite_brick_wall_from_stonecutting_from_polished_granite"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_GRANITE_BRICKS.get())
                .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_granite_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_GRANITE_BRICKS.get())
                .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_granite_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_GRANITE_BRICKS.get())
                .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_WALL.get())
                .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_granite_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_GRANITE_BRICKS.get())
                .unlockedBy("has_mossy_granite_bricks", has(ModBlocks.MOSSY_GRANITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_STAIRS.get())
                .unlockedBy("has_mossy_granite_bricks", has(ModBlocks.MOSSY_GRANITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_granite_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_GRANITE_BRICKS.get())
                .unlockedBy("has_mossy_granite_bricks", has(ModBlocks.MOSSY_GRANITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_mossy_granite_bricks", has(ModBlocks.MOSSY_GRANITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_granite_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_GRANITE_BRICKS.get())
                .unlockedBy("has_mossy_granite_bricks", has(ModBlocks.MOSSY_GRANITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_WALL.get())
                .unlockedBy("has_mossy_granite_bricks", has(ModBlocks.MOSSY_GRANITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_granite_brick_wall_from_stonecutting"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICKS.get())
                .group("mossy_granite_bricks")
                .requires(ModBlocks.GRANITE_BRICKS.get())
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_granite_brick_from_moss_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICKS.get())
                .group("mossy_granite_bricks")
                .requires(ModBlocks.GRANITE_BRICKS.get())
                .requires(Blocks.VINE)
                .unlockedBy("has_vine", has(Blocks.VINE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_granite_brick_from_vine"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICKS.get())
                .group("mossy_granite_bricks")
                .pattern("A")
                .pattern("Z")
                .pattern("A")
                .define('A', Blocks.MOSS_CARPET)
                .define('Z', ModBlocks.GRANITE_BRICKS.get())
                .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_granite_brick_from_moss_carpet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS.get())
                .pattern("A")
                .pattern("A")
                .define('A', ModBlocks.GRANITE_BRICK_SLAB.get())
                .unlockedBy("has_granite_brick_slab", has(ModBlocks.GRANITE_BRICK_SLAB.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_granite_bricks_from_granite_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_granite_bricks_from_polished_granite_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BRICKS.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_granite_bricks_from_granite_bricks_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.PRISMARINE_BRICKS)
                .unlockedBy("has_prismarine_bricks", has(Blocks.PRISMARINE_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PRISMARINE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL.get())
                .unlockedBy("has_prismarine_bricks", has(Blocks.PRISMARINE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "prismarine_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.PURPUR_BLOCK)
                .unlockedBy("has_purpur_block", has(Blocks.PURPUR_BLOCK))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPUR_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL.get())
                .unlockedBy("has_purpur_block", has(Blocks.PURPUR_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "purpur_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PURPUR.get())
                .pattern("A")
                .pattern("A")
                .define('A', Items.PURPUR_SLAB)
                .unlockedBy("has_purpur_slab", has(Items.PURPUR_SLAB))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPUR_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PURPUR.get())
                .unlockedBy("has_end_stone", has(Blocks.PURPUR_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_purpur_from_purpur"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Blocks.QUARTZ_BRICKS)
                .unlockedBy("has_quartz_bricks", has(Blocks.QUARTZ_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS.get())
                .unlockedBy("has_quartz_bricks", has(Blocks.QUARTZ_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "quartz_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', Blocks.QUARTZ_BRICKS)
                .unlockedBy("has_quartz_bricks", has(Blocks.QUARTZ_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB.get(),2)
                .unlockedBy("has_quartz_bricks", has(Blocks.QUARTZ_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "quartz_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.QUARTZ_BRICKS)
                .unlockedBy("has_quartz_bricks", has(Blocks.QUARTZ_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL.get())
                .unlockedBy("has_quartz_bricks", has(Blocks.QUARTZ_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "quartz_brick_wall_from_stonecutting"));


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS.get())
                .unlockedBy("has_block_of_quartz", has(Blocks.QUARTZ_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "quartz_brick_stairs_from_stonecutting_from_block_of_quartz"));


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB.get(),2)
                .unlockedBy("has_block_of_quartz", has(Blocks.QUARTZ_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "quartz_brick_slab_from_stonecutting_from_block_of_quartz"));


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL.get())
                .unlockedBy("has_block_of_quartz", has(Blocks.QUARTZ_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "quartz_brick_wall_from_stonecutting_from_block_of_quartz"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.QUARTZ_BLOCK)
                .unlockedBy("has_quartz_block", has(Blocks.QUARTZ_BLOCK))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_WALL.get())
                .unlockedBy("has_quartz_block", has(Blocks.QUARTZ_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "quartz_block_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_NETHER_BRICK_FENCE.get(),3)
                .pattern("ATA")
                .pattern("ATA")
                .define('A', Blocks.RED_NETHER_BRICKS)
                .define('T', Items.NETHER_BRICK)
                .unlockedBy("has_red_nether_bricks", has(Blocks.RED_NETHER_BRICKS))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Blocks.SMOOTH_BASALT)
                .unlockedBy("has_smooth_basalt", has(Blocks.SMOOTH_BASALT))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS.get())
                .unlockedBy("has_smooth_basalt", has(Blocks.SMOOTH_BASALT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_basalt_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB.get(),6)
                .pattern("AAA")
                .define('A', Blocks.SMOOTH_BASALT)
                .unlockedBy("has_smooth_basalt", has(Blocks.SMOOTH_BASALT))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB.get(),2)
                .unlockedBy("has_smooth_basalt", has(Blocks.SMOOTH_BASALT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_basalt_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.SMOOTH_BASALT)
                .unlockedBy("has_smooth_basalt", has(Blocks.SMOOTH_BASALT))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL.get())
                .unlockedBy("has_smooth_basalt", has(Blocks.SMOOTH_BASALT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_basalt_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.SMOOTH_QUARTZ)
                .unlockedBy("has_smooth_quartz", has(Blocks.SMOOTH_QUARTZ))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_WALL.get())
                .unlockedBy("has_smooth_quartz", has(Blocks.SMOOTH_QUARTZ))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_quartz_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.SMOOTH_RED_SANDSTONE)
                .unlockedBy("has_smooth_red_sandstone", has(Blocks.SMOOTH_RED_SANDSTONE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get())
                .unlockedBy("has_smooth_red_sandstone", has(Blocks.SMOOTH_RED_SANDSTONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_red_sandstone_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.SMOOTH_SANDSTONE)
                .unlockedBy("has_smooth_sandstone", has(Blocks.SMOOTH_SANDSTONE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL.get())
                .unlockedBy("has_smooth_sandstone", has(Blocks.SMOOTH_SANDSTONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_sandstone_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Blocks.SMOOTH_STONE)
                .unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS.get())
                .unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_stone_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.SMOOTH_STONE)
                .unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL.get())
                .unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_stone_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.STONE)
                .unlockedBy("has_stone", has(Blocks.STONE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL.get())
                .unlockedBy("has_stone", has(Blocks.STONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "stone_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_BRICKS.get())
                .unlockedBy("has_cracked_bricks", has(ModBlocks.CRACKED_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_bricks", has(ModBlocks.CRACKED_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_BRICKS.get())
                .unlockedBy("has_cracked_bricks", has(ModBlocks.CRACKED_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_bricks", has(ModBlocks.CRACKED_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_BRICKS.get())
                .unlockedBy("has_cracked_bricks", has(ModBlocks.CRACKED_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICK_WALL.get())
                .unlockedBy("has_cracked_bricks", has(ModBlocks.CRACKED_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BRICKS.get())
                .pattern("A")
                .pattern("A")
                .define('A', Items.BRICK_SLAB)
                .unlockedBy("has_brick_slab", has(Items.BRICK_SLAB))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BRICKS.get())
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_bricks_from_bricks_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_PRISMARINE_BRICKS.get())
                .unlockedBy("has_cracked_prismarine_bricks", has(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_prismarine_bricks", has(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_prismarine_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_PRISMARINE_BRICKS.get())
                .unlockedBy("has_cracked_prismarine_bricks", has(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_prismarine_bricks", has(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_prismarine_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_PRISMARINE_BRICKS.get())
                .unlockedBy("has_cracked_prismarine_bricks", has(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PRISMARINE_BRICK_WALL.get())
                .unlockedBy("has_cracked_prismarine_bricks", has(ModBlocks.CRACKED_PRISMARINE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_prismarine_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_PRISMARINE_BRICKS.get())
                .unlockedBy("has_mossy_prismarine_bricks", has(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_STAIRS.get())
                .unlockedBy("has_mossy_prismarine_bricks", has(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_prismarine_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_PRISMARINE_BRICKS.get())
                .unlockedBy("has_mossy_prismarine_bricks", has(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_SLAB.get(),2)
                .unlockedBy("has_mossy_prismarine_bricks", has(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_prismarine_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_PRISMARINE_BRICKS.get())
                .unlockedBy("has_mossy_prismarine_bricks", has(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICK_WALL.get())
                .unlockedBy("has_mossy_prismarine_bricks", has(ModBlocks.MOSSY_PRISMARINE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_prismarine_brick_wall_from_stonecutting"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICKS.get())
                .group("mossy_prismarine_bricks")
                .requires(Blocks.PRISMARINE_BRICKS)
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_prismarine_brick_from_moss_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICKS.get())
                .group("mossy_prismarine_bricks")
                .requires(Blocks.PRISMARINE_BRICKS)
                .requires(Blocks.VINE)
                .unlockedBy("has_vine", has(Blocks.VINE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_prismarine_brick_from_vine"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PRISMARINE_BRICKS.get())
                .group("mossy_prismarine_bricks")
                .pattern("A")
                .pattern("Z")
                .pattern("A")
                .define('A', Blocks.MOSS_CARPET)
                .define('Z', Blocks.PRISMARINE_BRICKS)
                .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_prismarine_brick_from_moss_carpet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PRISMARINE_BRICKS.get())
                .pattern("A")
                .pattern("A")
                .define('A', Items.PRISMARINE_BRICK_SLAB)
                .unlockedBy("has_prismarine_brick_slab", has(Items.PRISMARINE_BRICK_SLAB))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PRISMARINE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PRISMARINE_BRICKS.get())
                .unlockedBy("has_prismarine_bricks", has(Blocks.PRISMARINE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_prismarine_bricks_from_prismarine_bricks_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_END_STONE_BRICKS.get())
                .unlockedBy("has_cracked_end_stone_bricks", has(ModBlocks.CRACKED_END_STONE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_END_STONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_end_stone_bricks", has(ModBlocks.CRACKED_END_STONE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_end_stone_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_END_STONE_BRICKS.get())
                .unlockedBy("has_cracked_end_stone_bricks", has(ModBlocks.CRACKED_END_STONE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_END_STONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_end_stone_bricks", has(ModBlocks.CRACKED_END_STONE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_end_stone_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_END_STONE_BRICKS.get())
                .unlockedBy("has_cracked_end_stone_bricks", has(ModBlocks.CRACKED_END_STONE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_END_STONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_END_STONE_BRICK_WALL.get())
                .unlockedBy("has_cracked_end_stone_bricks", has(ModBlocks.CRACKED_END_STONE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_end_stone_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE.get(),4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.END_STONE)
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE.get())
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_end_stone_from_end_stone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS.get())
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_end_stone_stairs_from_end_stone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB.get())
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_end_stone_slab_from_end_stone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL.get())
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_end_stone_wall_from_end_stone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_END_STONE.get()), RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS)
                .unlockedBy("has_polished_end_stone", has(ModBlocks.POLISHED_END_STONE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "end_stone_bricks_from_polished_end_stone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_END_STONE.get()), RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_STAIRS)
                .unlockedBy("has_polished_end_stone", has(ModBlocks.POLISHED_END_STONE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "end_stone_brick_stairs_from_polished_end_stone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_END_STONE.get()), RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_SLAB)
                .unlockedBy("has_polished_end_stone", has(ModBlocks.POLISHED_END_STONE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "end_stone_brick_slab_from_polished_end_stone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_END_STONE.get()), RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_WALL)
                .unlockedBy("has_polished_end_stone", has(ModBlocks.POLISHED_END_STONE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "end_stone_brick_wall_from_polished_end_stone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_END_STONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BRICKS.get())
                .unlockedBy("has_polished_end_stone", has(ModBlocks.POLISHED_END_STONE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_end_stone_bricks_from_polished_end_stone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_END_STONE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR.get())
                .unlockedBy("has_polished_end_stone", has(ModBlocks.POLISHED_END_STONE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "end_stone_pillar_from_polished_end_stone_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_BRICKS.get())
                .unlockedBy("has_mossy_bricks", has(ModBlocks.MOSSY_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_STAIRS.get())
                .unlockedBy("has_mossy_bricks", has(ModBlocks.MOSSY_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_BRICKS.get())
                .unlockedBy("has_mossy_bricks", has(ModBlocks.MOSSY_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_SLAB.get(),2)
                .unlockedBy("has_mossy_bricks", has(ModBlocks.MOSSY_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_BRICKS.get())
                .unlockedBy("has_mossy_bricks", has(ModBlocks.MOSSY_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_WALL.get())
                .unlockedBy("has_mossy_bricks", has(ModBlocks.MOSSY_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_brick_wall_from_stonecutting"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICKS.get())
                .group("mossy_bricks")
                .requires(Blocks.BRICKS)
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_brick_from_moss_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICKS.get())
                .group("mossy_bricks")
                .requires(Blocks.BRICKS)
                .requires(Blocks.VINE)
                .unlockedBy("has_vine", has(Items.VINE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_brick_from_vine"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICKS.get())
                .group("mossy_bricks")
                .pattern("A")
                .pattern("Z")
                .pattern("A")
                .define('A', Blocks.MOSS_CARPET)
                .define('Z', Blocks.BRICKS)
                .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_brick_from_moss_carpet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_QUARTZ_BRICKS.get())
                .unlockedBy("has_mossy_quartz_bricks", has(ModBlocks.MOSSY_QUARTZ_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_QUARTZ_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS.get())
                .unlockedBy("has_mossy_quartz_bricks", has(ModBlocks.MOSSY_QUARTZ_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_quartz_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_QUARTZ_BRICKS.get())
                .unlockedBy("has_mossy_quartz_bricks", has(ModBlocks.MOSSY_QUARTZ_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_QUARTZ_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_SLAB.get(),2)
                .unlockedBy("has_mossy_quartz_bricks", has(ModBlocks.MOSSY_QUARTZ_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_quartz_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_QUARTZ_BRICKS.get())
                .unlockedBy("has_mossy_quartz_bricks", has(ModBlocks.MOSSY_QUARTZ_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_QUARTZ_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICK_WALL.get())
                .unlockedBy("has_mossy_quartz_bricks", has(ModBlocks.MOSSY_QUARTZ_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_quartz_brick_wall_from_stonecutting"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICKS.get())
                .group("mossy_quartz_bricks")
                .requires(Blocks.QUARTZ_BRICKS)
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_quartz_brick_from_moss_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICKS.get())
                .group("mossy_quartz_bricks")
                .requires(Blocks.QUARTZ_BRICKS)
                .requires(Blocks.VINE)
                .unlockedBy("has_vine", has(Items.VINE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_quartz_brick_from_vine"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_QUARTZ_BRICKS.get())
                .group("mossy_quartz_bricks")
                .pattern("A")
                .pattern("Z")
                .pattern("A")
                .define('A', Blocks.MOSS_CARPET)
                .define('Z', Blocks.QUARTZ_BRICKS)
                .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_quartz_brick_from_moss_carpet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_TUFF_BRICKS.get())
                .unlockedBy("has_cracked_tuff_bricks", has(ModBlocks.CRACKED_TUFF_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_TUFF_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_tuff_bricks", has(ModBlocks.CRACKED_TUFF_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_tuff_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_TUFF_BRICKS.get())
                .unlockedBy("has_cracked_tuff_bricks", has(ModBlocks.CRACKED_TUFF_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_TUFF_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_tuff_bricks", has(ModBlocks.CRACKED_TUFF_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_tuff_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_TUFF_BRICKS.get())
                .unlockedBy("has_cracked_tuff_bricks", has(ModBlocks.CRACKED_TUFF_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_TUFF_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TUFF_BRICK_WALL.get())
                .unlockedBy("has_cracked_tuff_bricks", has(ModBlocks.CRACKED_TUFF_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_tuff_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_TUFF_BRICKS.get())
                .unlockedBy("has_mossy_tuff_bricks", has(ModBlocks.MOSSY_TUFF_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_TUFF_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_STAIRS.get())
                .unlockedBy("has_mossy_tuff_bricks", has(ModBlocks.MOSSY_TUFF_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_tuff_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_TUFF_BRICKS.get())
                .unlockedBy("has_mossy_tuff_bricks", has(ModBlocks.MOSSY_TUFF_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_TUFF_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_SLAB.get(),2)
                .unlockedBy("has_mossy_tuff_bricks", has(ModBlocks.MOSSY_TUFF_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_tuff_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_TUFF_BRICKS.get())
                .unlockedBy("has_mossy_tuff_bricks", has(ModBlocks.MOSSY_TUFF_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_TUFF_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_WALL.get())
                .unlockedBy("has_mossy_tuff_bricks", has(ModBlocks.MOSSY_TUFF_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_tuff_brick_wall_from_stonecutting"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICKS.get())
                .group("mossy_tuff_bricks")
                .requires(Blocks.TUFF_BRICKS)
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_tuff_brick_from_moss_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICKS.get())
                .group("mossy_tuff_bricks")
                .requires(Blocks.TUFF_BRICKS)
                .requires(Blocks.VINE)
                .unlockedBy("has_vine", has(Blocks.VINE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_tuff_brick_from_vine"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICKS.get())
                .group("mossy_tuff_bricks")
                .pattern("A")
                .pattern("Z")
                .pattern("A")
                .define('A', Blocks.MOSS_CARPET)
                .define('Z', Blocks.TUFF_BRICKS)
                .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_tuff_brick_from_moss_carpet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS.get(),4)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.POLISHED_CALCITE.get())
                .unlockedBy("has_polished_calcite", has(ModBlocks.POLISHED_CALCITE.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_CALCITE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS.get())
                .unlockedBy("has_polished_calcite", has(ModBlocks.POLISHED_CALCITE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_bricks_from_stonecutting_polished_calcite"));


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.CALCITE_BRICKS.get())
                .unlockedBy("has_calcite_bricks", has(ModBlocks.CALCITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CALCITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS.get())
                .unlockedBy("has_calcite_bricks", has(ModBlocks.CALCITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.CALCITE_BRICKS.get())
                .unlockedBy("has_calcite_bricks", has(ModBlocks.CALCITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CALCITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_calcite_bricks", has(ModBlocks.CALCITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.CALCITE_BRICKS.get())
                .unlockedBy("has_calcite_bricks", has(ModBlocks.CALCITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CALCITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL.get())
                .unlockedBy("has_calcite_bricks", has(ModBlocks.CALCITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_brick_wall_from_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CALCITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS.get())
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_bricks_from_stonecutting_from_calcite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CALCITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS.get())
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_brick_stairs_from_stonecutting_from_calcite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CALCITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_brick_slab_from_stonecutting_from_calcite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CALCITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL.get())
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_brick_wall_from_stonecutting_from_calcite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_CALCITE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS.get())
                .unlockedBy("has_polished_calcite", has(ModBlocks.POLISHED_CALCITE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_brick_stairs_from_stonecutting_from_polished_calcite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_CALCITE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_polished_calcite", has(ModBlocks.POLISHED_CALCITE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_brick_slab_from_stonecutting_from_polished_calcite"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_CALCITE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL.get())
                .unlockedBy("has_polished_calcite", has(ModBlocks.POLISHED_CALCITE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_brick_wall_from_stonecutting_from_polished_calcite"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_CALCITE_BRICKS.get())
                .unlockedBy("has_cracked_calcite_bricks", has(ModBlocks.CRACKED_CALCITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_CALCITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_calcite_bricks", has(ModBlocks.CRACKED_CALCITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_calcite_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_CALCITE_BRICKS.get())
                .unlockedBy("has_cracked_calcite_bricks", has(ModBlocks.CRACKED_CALCITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_CALCITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_calcite_bricks", has(ModBlocks.CRACKED_CALCITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_calcite_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_CALCITE_BRICKS.get())
                .unlockedBy("has_cracked_calcite_bricks", has(ModBlocks.CRACKED_CALCITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_CALCITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CALCITE_BRICK_WALL.get())
                .unlockedBy("has_cracked_calcite_bricks", has(ModBlocks.CRACKED_CALCITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_calcite_brick_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_CALCITE_BRICKS.get())
                .unlockedBy("has_mossy_calcite_bricks", has(ModBlocks.MOSSY_CALCITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_CALCITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_STAIRS.get())
                .unlockedBy("has_mossy_calcite_bricks", has(ModBlocks.MOSSY_CALCITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_calcite_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_CALCITE_BRICKS.get())
                .unlockedBy("has_mossy_calcite_bricks", has(ModBlocks.MOSSY_CALCITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_CALCITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_mossy_calcite_bricks", has(ModBlocks.MOSSY_CALCITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_calcite_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_CALCITE_BRICKS.get())
                .unlockedBy("has_mossy_calcite_bricks", has(ModBlocks.MOSSY_CALCITE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_CALCITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICK_WALL.get())
                .unlockedBy("has_mossy_calcite_bricks", has(ModBlocks.MOSSY_CALCITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_calcite_brick_wall_from_stonecutting"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICKS.get())
                .group("mossy_calcite_bricks")
                .requires(ModBlocks.CALCITE_BRICKS.get())
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_calcite_brick_from_moss_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICKS.get())
                .group("mossy_calcite_bricks")
                .requires(ModBlocks.CALCITE_BRICKS.get())
                .requires(Blocks.VINE)
                .unlockedBy("has_vine", has(Blocks.VINE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_calcite_brick_from_vine"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CALCITE_BRICKS.get())
                .group("mossy_calcite_bricks")
                .pattern("A")
                .pattern("Z")
                .pattern("A")
                .define('A', Blocks.MOSS_CARPET)
                .define('Z', ModBlocks.CALCITE_BRICKS.get())
                .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_calcite_brick_from_moss_carpet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS.get())
                .pattern("A")
                .pattern("A")
                .define('A', ModBlocks.CALCITE_BRICK_SLAB.get())
                .unlockedBy("has_calcite_brick_slab", has(ModBlocks.CALCITE_BRICK_SLAB.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CALCITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS.get())
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_calcite_bricks_from_calcite_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_CALCITE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS.get())
                .unlockedBy("has_polished_calcite", has(ModBlocks.POLISHED_CALCITE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_calcite_bricks_from_polished_calcite_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CALCITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_BRICKS.get())
                .unlockedBy("has_calcite_bricks", has(ModBlocks.CALCITE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_calcite_bricks_from_calcite_bricks_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Blocks.NETHERRACK)
                .unlockedBy("has_netherrack", has(Blocks.NETHERRACK))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.NETHERRACK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS.get())
                .unlockedBy("has_netherrack", has(Blocks.NETHERRACK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "netherrack_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', Blocks.NETHERRACK)
                .unlockedBy("has_netherrack", has(Blocks.NETHERRACK))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.NETHERRACK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB.get(),2)
                .unlockedBy("has_netherrack", has(Blocks.NETHERRACK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "netherrack_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.NETHERRACK)
                .unlockedBy("has_netherrack", has(Blocks.NETHERRACK))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.NETHERRACK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL.get())
                .unlockedBy("has_netherrack", has(Blocks.NETHERRACK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "netherrack_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICKS.get(),4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.SNOW_BLOCK)
                .unlockedBy("has_snow_bricks", has(Blocks.SNOW_BLOCK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.SNOW_BRICKS.get())
                .unlockedBy("has_netherrack", has(ModBlocks.SNOW_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.SNOW_BRICKS.get())
                .unlockedBy("has_netherrack", has(ModBlocks.SNOW_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.SNOW_BRICKS.get())
                .unlockedBy("has_netherrack", has(ModBlocks.SNOW_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_COBBLESTONE)
                .group("mossy_cobblestone")
                .pattern("A")
                .pattern("Z")
                .pattern("A")
                .define('A', Blocks.MOSS_CARPET)
                .define('Z', Blocks.COBBLESTONE)
                .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_cobblestone_from_moss_carpet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_STONE_BRICKS)
                .group("mossy_stone_bricks")
                .pattern("A")
                .pattern("Z")
                .pattern("A")
                .define('A', Blocks.MOSS_CARPET)
                .define('Z', Blocks.STONE_BRICKS)
                .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_stone_from_moss_carpet"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_TUFF), RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_TUFF)
                .unlockedBy("has_polished_tuff", has(Blocks.POLISHED_TUFF))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_tuff_from_polished_tuff_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.TUFF_BRICKS), RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_TUFF)
                .unlockedBy("has_tuff_bricks", has(Blocks.TUFF_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_tuff_from_tuff_bricks_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_DEEPSLATE)
                .unlockedBy("has_deepslate_bricks", has(Blocks.DEEPSLATE_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_deepslate_from_deepslate_bricks_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_DEEPSLATE)
                .unlockedBy("has_polished_deepslate", has(Blocks.POLISHED_DEEPSLATE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_deepslate_from_polished_deepslate_stonecutting"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE.get())
                .group("mossy_cobbled_deepslate")
                .requires(Blocks.COBBLED_DEEPSLATE)
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_cobbled_deepslate_from_moss_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE.get())
                .group("mossy_cobbled_deepslate")
                .requires(Blocks.COBBLED_DEEPSLATE)
                .requires(Blocks.VINE)
                .unlockedBy("has_vine", has(Blocks.VINE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_cobbled_deepslate_from_vine"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE.get())
                .group("mossy_cobbled_deepslate")
                .pattern("A")
                .pattern("Z")
                .pattern("A")
                .define('A', Blocks.MOSS_CARPET)
                .define('Z', Blocks.COBBLED_DEEPSLATE)
                .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_cobbled_deepslate_from_moss_carpet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_COBBLED_DEEPSLATE.get())
                .unlockedBy("has_mossy_cobbled_deepslate", has(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS.get())
                .unlockedBy("has_mossy_cobbled_deepslate", has(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_cobbled_deepslate_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_COBBLED_DEEPSLATE.get())
                .unlockedBy("has_mossy_cobbled_deepslate", has(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB.get(),2)
                .unlockedBy("has_mossy_cobbled_deepslate", has(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_cobbled_deepslate_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_COBBLED_DEEPSLATE.get())
                .unlockedBy("has_mossy_cobbled_deepslate", has(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL.get())
                .unlockedBy("has_mossy_cobbled_deepslate", has(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_cobbled_deepslate_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_DEEPSLATE_BRICKS.get())
                .unlockedBy("has_mossy_deepslate_bricks", has(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS.get())
                .unlockedBy("has_mossy_deepslate_bricks", has(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_deepslate_brick_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_DEEPSLATE_BRICKS.get())
                .unlockedBy("has_mossy_deepslate_bricks", has(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB.get(),2)
                .unlockedBy("has_mossy_deepslate_bricks", has(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_deepslate_brick_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_DEEPSLATE_BRICKS.get())
                .unlockedBy("has_mossy_deepslate_bricks", has(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL.get())
                .unlockedBy("has_mossy_deepslate_bricks", has(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_deepslate_brick_wall_from_stonecutting"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICKS.get())
                .group("mossy_deeplate_bricks")
                .requires(Blocks.DEEPSLATE_BRICKS)
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_deepslate_brick_from_moss_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICKS.get())
                .group("mossy_deeplate_bricks")
                .requires(Blocks.DEEPSLATE_BRICKS)
                .requires(Blocks.VINE)
                .unlockedBy("has_vine", has(Blocks.VINE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_deepslate_brick_from_vine"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICKS.get())
                .group("mossy_deeplate_bricks")
                .pattern("A")
                .pattern("Z")
                .pattern("A")
                .define('A', Blocks.MOSS_CARPET)
                .define('Z', Blocks.DEEPSLATE_BRICKS)
                .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_deepslate_bricks_from_moss_carpet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_DEEPSLATE_TILES.get())
                .unlockedBy("has_mossy_deepslate_tile_bricks", has(ModBlocks.MOSSY_DEEPSLATE_TILES.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DEEPSLATE_TILES.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS.get())
                .unlockedBy("has_mossy_deepslate_tile_bricks", has(ModBlocks.MOSSY_DEEPSLATE_TILES.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_deepslate_tile_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_DEEPSLATE_TILES.get())
                .unlockedBy("has_mossy_deepslate_tile_bricks", has(ModBlocks.MOSSY_DEEPSLATE_TILES.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DEEPSLATE_TILES.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB.get(),2)
                .unlockedBy("has_mossy_deepslate_tile_bricks", has(ModBlocks.MOSSY_DEEPSLATE_TILES.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_deepslate_tile_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.MOSSY_DEEPSLATE_TILES.get())
                .unlockedBy("has_mossy_deepslate_tile_bricks", has(ModBlocks.MOSSY_DEEPSLATE_TILES.get()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_DEEPSLATE_TILES.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_WALL.get())
                .unlockedBy("has_mossy_deepslate_tile_bricks", has(ModBlocks.MOSSY_DEEPSLATE_TILES.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_deepslate_tile_wall_from_stonecutting"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MOSSY_DEEPSLATE_TILES.get())
                .group("mossy_deeplate_tiles")
                .requires(Blocks.DEEPSLATE_TILES)
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_deepslate_tile_from_moss_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MOSSY_DEEPSLATE_TILES.get())
                .group("mossy_deeplate_tiles")
                .requires(Blocks.DEEPSLATE_TILES)
                .requires(Blocks.VINE)
                .unlockedBy("has_vine", has(Blocks.VINE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_deepslate_tile_from_vine"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILES.get())
                .group("mossy_deeplate_tiles")
                .pattern("A")
                .pattern("Z")
                .pattern("A")
                .define('A', Blocks.MOSS_CARPET)
                .define('Z', Blocks.DEEPSLATE_TILES)
                .unlockedBy("has_moss_carpet", has(Blocks.MOSS_CARPET))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_deepslate_tiles_from_moss_carpet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.get())
                .pattern("AA")
                .define('A', Blocks.POLISHED_DEEPSLATE)
                .unlockedBy("has_polished_deepslate", has(Blocks.POLISHED_DEEPSLATE))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POLISHED_DEEPSLATE_BUTTON.get())
                .requires(Blocks.POLISHED_DEEPSLATE)
                .unlockedBy("has_polished_deepslate", has(Blocks.POLISHED_DEEPSLATE))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Blocks.DEEPSLATE)
                .unlockedBy("has_deepslate", has(Blocks.DEEPSLATE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_STAIRS.get())
                .unlockedBy("has_deepslate", has(Blocks.DEEPSLATE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "deepslate_stairs_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB.get(),6)
                .pattern("AAA")
                .define('A', Blocks.DEEPSLATE)
                .unlockedBy("has_deepslate", has(Blocks.DEEPSLATE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB.get(),2)
                .unlockedBy("has_deepslate", has(Blocks.DEEPSLATE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "deepslate_slab_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Blocks.DEEPSLATE)
                .unlockedBy("has_deepslate", has(Blocks.DEEPSLATE))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_WALL.get())
                .unlockedBy("has_deepslate", has(Blocks.DEEPSLATE))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "deepslate_wall_from_stonecutting"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_INLAID_DEEPSLATE.get())
                .pattern("A")
                .pattern("B")
                .pattern("A")
                .define('A', Blocks.DEEPSLATE_BRICK_SLAB)
                .define('B', Blocks.SCULK)
                .unlockedBy("has_sculk", has(Blocks.SCULK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_PILLAR.get(),2)
                .pattern("A")
                .pattern("A")
                .define('A', Items.MUD_BRICKS)
                .unlockedBy("has_mud_bricks", has(Items.MUD_BRICKS))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MUD_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_PILLAR.get())
                .unlockedBy("has_mud_bricks", has(Blocks.MUD_BRICKS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mud_pillar_bricks_from_mud_bricks_stonecutting"));
    }
}