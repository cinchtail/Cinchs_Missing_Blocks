package net.cinchtail.cinchsmissingblocks.block;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.cinchtail.cinchsmissingblocks.util.ModBlockSetType;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //Calcite Blocks
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), Block.Settings.copy(Blocks.CALCITE)
                    .strength(0.75F).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(0.75F).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(0.75F).sounds(BlockSoundGroup.CALCITE)));
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            new Block(Block.Settings.copy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)));
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            new SlabBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)));
    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            new WallBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(Block.Settings.copy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            new Block(Block.Settings.copy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block CRACKED_CALCITE_BRICK_STAIRS = registerBlock("cracked_calcite_brick_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CRACKED_CALCITE_BRICK_SLAB = registerBlock("cracked_calcite_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CRACKED_CALCITE_BRICK_WALL = registerBlock("cracked_calcite_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)));
    public static final Block MOSSY_CALCITE_BRICKS = registerBlock("mossy_calcite_bricks",
            new Block(Block.Settings.copy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block MOSSY_CALCITE_BRICK_STAIRS = registerBlock("mossy_calcite_brick_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)));
    public static final Block MOSSY_CALCITE_BRICK_SLAB = registerBlock("mossy_calcite_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)));
    public static final Block MOSSY_CALCITE_BRICK_WALL = registerBlock("mossy_calcite_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CHISELED_CALCITE_BRICKS = registerBlock("chiseled_calcite_bricks",
            new Block(Block.Settings.copy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sounds(BlockSoundGroup.CALCITE)));


    //Dripstone Blocks
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 1.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            new SlabBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 1.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 1.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            new Block(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 1.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            new SlabBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            new WallBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            new Block(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_DRIPSTONE_BRICKS = registerBlock("cracked_dripstone_bricks",
            new Block(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_DRIPSTONE_BRICK_STAIRS = registerBlock("cracked_dripstone_brick_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_DRIPSTONE_BRICK_SLAB = registerBlock("cracked_dripstone_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_DRIPSTONE_BRICK_WALL = registerBlock("cracked_dripstone_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block MOSSY_DRIPSTONE_BRICKS = registerBlock("mossy_dripstone_bricks",
            new Block(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block MOSSY_DRIPSTONE_BRICK_STAIRS = registerBlock("mossy_dripstone_brick_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block MOSSY_DRIPSTONE_BRICK_SLAB = registerBlock("mossy_dripstone_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block MOSSY_DRIPSTONE_BRICK_WALL = registerBlock("mossy_dripstone_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block CHISELED_DRIPSTONE_BRICKS = registerBlock("chiseled_dripstone_bricks",
            new Block(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 1.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    //Tuff Blocks
    public static final Block CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks",
            new Block(Block.Settings.copy(Blocks.TUFF_BRICKS).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block CRACKED_TUFF_BRICK_STAIRS = registerBlock("cracked_tuff_brick_stairs",
            new StairsBlock(Blocks.TUFF_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.TUFF_BRICKS)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block CRACKED_TUFF_BRICK_SLAB = registerBlock("cracked_tuff_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.TUFF_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block CRACKED_TUFF_BRICK_WALL = registerBlock("cracked_tuff_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.TUFF_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block MOSSY_TUFF_BRICKS = registerBlock("mossy_tuff_bricks",
            new Block(Block.Settings.copy(Blocks.TUFF_BRICKS).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block MOSSY_TUFF_BRICK_STAIRS = registerBlock("mossy_tuff_brick_stairs",
            new StairsBlock(Blocks.TUFF_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.TUFF_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block MOSSY_TUFF_BRICK_SLAB = registerBlock("mossy_tuff_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.TUFF_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block MOSSY_TUFF_BRICK_WALL = registerBlock("mossy_tuff_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.TUFF_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));

    //Andesite Blocks
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F)));
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(Block.Settings.copy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            new StairsBlock(Blocks.POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks",
            new Block(Block.Settings.copy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_ANDESITE_BRICK_STAIRS = registerBlock("cracked_andesite_brick_stairs",
            new StairsBlock(Blocks.POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_ANDESITE_BRICK_SLAB = registerBlock("cracked_andesite_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_ANDESITE_BRICK_WALL = registerBlock("cracked_andesite_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_ANDESITE_BRICKS = registerBlock("mossy_andesite_bricks",
            new Block(Block.Settings.copy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_ANDESITE_BRICK_STAIRS = registerBlock("mossy_andesite_brick_stairs",
            new StairsBlock(Blocks.POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_ANDESITE_BRICK_SLAB = registerBlock("mossy_andesite_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_ANDESITE_BRICK_WALL = registerBlock("mossy_andesite_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_ANDESITE_BRICKS = registerBlock("chiseled_andesite_bricks",
            new Block(Block.Settings.copy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    //Granite Blocks
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(Block.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F)));
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(Block.Settings.copy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            new StairsBlock(Blocks.POLISHED_GRANITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_GRANITE)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks",
            new Block(Block.Settings.copy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_GRANITE_BRICK_STAIRS = registerBlock("cracked_granite_brick_stairs",
            new StairsBlock(Blocks.POLISHED_GRANITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_GRANITE)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_GRANITE_BRICK_SLAB = registerBlock("cracked_granite_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_GRANITE_BRICK_WALL = registerBlock("cracked_granite_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_GRANITE_BRICKS = registerBlock("mossy_granite_bricks",
            new Block(Block.Settings.copy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_GRANITE_BRICK_STAIRS = registerBlock("mossy_granite_brick_stairs",
            new StairsBlock(Blocks.POLISHED_GRANITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_GRANITE)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_GRANITE_BRICK_SLAB = registerBlock("mossy_granite_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_GRANITE_BRICK_WALL = registerBlock("mossy_granite_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_GRANITE_BRICKS = registerBlock("chiseled_granite_bricks",
            new Block(Block.Settings.copy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));


    //Diorite Blocks
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F)));
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(Block.Settings.copy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            new StairsBlock(Blocks.POLISHED_DIORITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_DIORITE)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block CRACKED_DIORITE_BRICKS = registerBlock("cracked_diorite_bricks",
            new Block(Block.Settings.copy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_DIORITE_BRICK_STAIRS = registerBlock("cracked_diorite_brick_stairs",
            new StairsBlock(Blocks.POLISHED_DIORITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_DIORITE_BRICK_SLAB = registerBlock("cracked_diorite_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_DIORITE_BRICK_WALL = registerBlock("cracked_diorite_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_DIORITE_BRICKS = registerBlock("mossy_diorite_bricks",
            new Block(Block.Settings.copy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_DIORITE_BRICK_STAIRS = registerBlock("mossy_diorite_brick_stairs",
            new StairsBlock(Blocks.POLISHED_DIORITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_DIORITE_BRICK_SLAB = registerBlock("mossy_diorite_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_DIORITE_BRICK_WALL = registerBlock("mossy_diorite_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_DIORITE_BRICKS = registerBlock("chiseled_diorite_bricks",
            new Block(Block.Settings.copy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    //Quartz Blocks
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            new WallBlock(Block.Settings.copy(Blocks.QUARTZ_BLOCK)
                    .strength(2.0F, 6.0F)));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            new WallBlock(Block.Settings.copy(Blocks.SMOOTH_QUARTZ)
                    .strength(2.0F, 6.0F)));
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.QUARTZ_BRICKS).strength(0.8F)));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.QUARTZ_BRICKS)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.QUARTZ_BRICKS)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_QUARTZ_BRICKS = registerBlock("cracked_quartz_bricks",
            new Block(Block.Settings.copy(Blocks.QUARTZ_BRICKS).strength(0.8F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_QUARTZ_BRICK_STAIRS = registerBlock("cracked_quartz_brick_stairs",
            new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.QUARTZ_BRICKS).strength(0.8F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_QUARTZ_BRICK_SLAB = registerBlock("cracked_quartz_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.QUARTZ_BRICKS)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_QUARTZ_BRICK_WALL = registerBlock("cracked_quartz_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.QUARTZ_BRICKS)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_QUARTZ_BRICKS = registerBlock("mossy_quartz_bricks",
            new Block(Block.Settings.copy(Blocks.QUARTZ_BRICKS).strength(0.8F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_QUARTZ_BRICK_STAIRS = registerBlock("mossy_quartz_brick_stairs",
            new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.QUARTZ_BRICKS).strength(0.8F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_QUARTZ_BRICK_SLAB = registerBlock("mossy_quartz_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.QUARTZ_BRICKS)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_QUARTZ_BRICK_WALL = registerBlock("mossy_quartz_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.QUARTZ_BRICKS)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    //Brick Blocks
    public static final Block CRACKED_BRICKS = registerBlock("cracked_bricks",
            new Block(Block.Settings.copy(Blocks.BRICKS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_BRICK_STAIRS = registerBlock("cracked_brick_stairs",
            new StairsBlock(Blocks.BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.BRICKS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_BRICK_SLAB = registerBlock("cracked_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_BRICK_WALL = registerBlock("cracked_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_BRICKS = registerBlock("mossy_bricks",
            new Block(Block.Settings.copy(Blocks.BRICKS).strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_BRICK_STAIRS = registerBlock("mossy_brick_stairs",
            new StairsBlock(Blocks.BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.BRICKS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_BRICK_SLAB = registerBlock("mossy_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_BRICK_WALL = registerBlock("mossy_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_BRICKS = registerBlock("chiseled_bricks",
            new Block(Block.Settings.copy(Blocks.BRICKS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));

    //Mud Brick Blocks
    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            new StairsBlock(Blocks.MUD_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.MUD_BRICKS).strength(1.0F, 3.0F).sounds(BlockSoundGroup.PACKED_MUD)));
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            new SlabBlock(Block.Settings.copy(Blocks.MUD_BRICKS)
                    .strength(1.0F, 3.0F).sounds(BlockSoundGroup.PACKED_MUD)));
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            new WallBlock(Block.Settings.copy(Blocks.MUD_BRICKS)
                    .strength(1.0F, 3.0F).sounds(BlockSoundGroup.PACKED_MUD)));
    public static final Block CRACKED_MUD_BRICKS = registerBlock("cracked_mud_bricks",
            new Block(Block.Settings.copy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                    .sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block CRACKED_MUD_BRICK_STAIRS = registerBlock("cracked_mud_brick_stairs",
            new StairsBlock(Blocks.MUD_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block CRACKED_MUD_BRICK_SLAB = registerBlock("cracked_mud_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.MUD_BRICKS)
                    .strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block CRACKED_MUD_BRICK_WALL = registerBlock("cracked_mud_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.MUD_BRICKS)
                    .strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICKS = registerBlock("mossy_mud_bricks",
            new Block(Block.Settings.copy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                    .sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICK_STAIRS = registerBlock("mossy_mud_brick_stairs",
            new StairsBlock(Blocks.MUD_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                            .sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICK_SLAB = registerBlock("mossy_mud_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.MUD_BRICKS)
                    .strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICK_WALL = registerBlock("mossy_mud_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.MUD_BRICKS)
                    .strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block CHISELED_MUD_BRICKS = registerBlock("chiseled_mud_bricks",
            new Block(Block.Settings.copy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                    .sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MUD_PILLAR = registerBlock("mud_pillar",
            new Block(Block.Settings.copy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                    .sounds(BlockSoundGroup.MUD_BRICKS)));

    //Endstone Blocks
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(),
                    Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F)
                            .sounds(BlockSoundGroup.STONE)));
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            new SlabBlock(Block.Settings.copy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            new WallBlock(Block.Settings.copy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_END_STONE = registerBlock("polished_end_stone",
            new Block(Block.Settings.copy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(),
                    Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F)
                            .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            new SlabBlock(Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            new WallBlock(Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            new Block(Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_END_STONE_BRICK_STAIRS = registerBlock("cracked_end_stone_brick_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(),
                    Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F)
                            .sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_END_STONE_BRICK_SLAB = registerBlock("cracked_end_stone_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_END_STONE_BRICK_WALL = registerBlock("cracked_end_stone_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            new Block(Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block END_STONE_PILLAR = registerBlock("end_stone_pillar",
            new PillarBlock(Block.Settings.copy(Blocks.END_STONE_BRICKS)));

    //Stone Blocks
    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(Block.Settings.copy(Blocks.STONE)
                    .strength(2.0F, 6.0F)));
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),
                    Block.Settings.copy(Blocks.SMOOTH_STONE).strength(2.0F, 6.0F)));
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(Block.Settings.copy(Blocks.SMOOTH_STONE)
                    .strength(2.0F, 6.0F)));
    public static final Block CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
            new StairsBlock(Blocks.STONE_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.STONE_BRICKS).strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    //Deepslate Blocks
    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs",
            new StairsBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).strength(3.5F, 6.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)
                    .strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICK_WALL = registerBlock("cracked_deepslate_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)
                    .strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs",
            new StairsBlock(Blocks.CRACKED_DEEPSLATE_TILES.getDefaultState(),
                    Block.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES).strength(3.5F, 6.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab",
            new SlabBlock(Block.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES)
                    .strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block CRACKED_DEEPSLATE_TILE_WALL = registerBlock("cracked_deepslate_tile_wall",
            new WallBlock(Block.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES)
                    .strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block SCULK_INLAID_DEEPSLATE = registerBlock("sculk_inlaid_deepslate",
            new SculkInlaidDeepslateBlock(Block.Settings.copy(Blocks.CHISELED_DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F)));
    public static final Block MOSSY_COBBLED_DEEPSLATE = registerBlock("mossy_cobbled_deepslate",
            new Block(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE).strength(3.5f, 6.0F)));
    public static final Block MOSSY_COBBLED_DEEPSLATE_STAIRS = registerBlock("mossy_cobbled_deepslate_stairs",
            new StairsBlock(ModBlocks.MOSSY_COBBLED_DEEPSLATE.getDefaultState(),Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)
                    .sounds(BlockSoundGroup.DEEPSLATE).strength(3.5f, 6.0F)));
    public static final Block MOSSY_COBBLED_DEEPSLATE_SLAB = registerBlock("mossy_cobbled_deepslate_slab",
            new SlabBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block MOSSY_COBBLED_DEEPSLATE_WALL = registerBlock("mossy_cobbled_deepslate_wall",
            new WallBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            new Block(Block.Settings.copy(Blocks.DEEPSLATE_BRICKS).strength(3.5f, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            new StairsBlock(ModBlocks.MOSSY_DEEPSLATE_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.DEEPSLATE_BRICKS).strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block MOSSY_DEEPSLATE_TILES = registerBlock("mossy_deepslate_tiles",
            new Block(Block.Settings.copy(Blocks.DEEPSLATE_TILES).strength(3.5f, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock("mossy_deepslate_tile_stairs",
            new StairsBlock(ModBlocks.MOSSY_DEEPSLATE_TILES.getDefaultState(),
                    Block.Settings.copy(Blocks.DEEPSLATE_TILES).strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block MOSSY_DEEPSLATE_TILE_SLAB = registerBlock("mossy_deepslate_tile_slab",
            new SlabBlock(Block.Settings.copy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block MOSSY_DEEPSLATE_TILE_WALL = registerBlock("mossy_deepslate_tile_wall",
            new WallBlock(Block.Settings.copy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            new StairsBlock(Blocks.DEEPSLATE.getDefaultState(),
                    Block.Settings.copy(Blocks.STONE).strength(3.0F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            new SlabBlock(Block.Settings.copy(Blocks.DEEPSLATE)
                    .strength(3.0F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            new WallBlock(Block.Settings.copy(Blocks.DEEPSLATE)
                    .strength(3.0F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button", CreatePolishedDeepslateButton());
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.POLISHED_DEEPSLATE,
                    Block.Settings.copy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE).sounds(BlockSoundGroup.POLISHED_DEEPSLATE)));

    //Blackstone Bricks
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs",
            new StairsBlock(Blocks.POLISHED_BLACKSTONE.getDefaultState(),
                    Block.Settings.copy(Blocks.POLISHED_BLACKSTONE).strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.POLISHED_BLACKSTONE).strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.POLISHED_BLACKSTONE).strength(1.5F, 6.0F)));

    //Netherrack
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            new StairsBlock(Blocks.NETHERRACK.getDefaultState(),
                    Block.Settings.copy(Blocks.NETHERRACK).strength(0.4F)
                            .sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            new SlabBlock(Block.Settings.copy(Blocks.NETHERRACK)
                    .strength(0.4F).sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            new WallBlock(Block.Settings.copy(Blocks.NETHERRACK)
                    .strength(0.4F).sounds(BlockSoundGroup.NETHERRACK)));

    //Nether Bricks
    public static final Block CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs",
            new StairsBlock(Blocks.NETHER_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_FENCE = registerBlock("cracked_nether_brick_fence",
            new FenceBlock(Block.Settings.copy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));

    //Red Nether Bricks
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new FenceBlock(Block.Settings.copy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            new Block(Block.Settings.copy(Blocks.RED_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CRACKED_RED_NETHER_BRICK_STAIRS = registerBlock("cracked_red_nether_brick_stairs",
            new StairsBlock(Blocks.RED_NETHER_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.RED_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CRACKED_RED_NETHER_BRICK_SLAB = registerBlock("cracked_red_nether_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.RED_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CRACKED_RED_NETHER_BRICK_WALL = registerBlock("cracked_red_nether_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.RED_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CRACKED_RED_NETHER_BRICK_FENCE = registerBlock("cracked_red_nether_brick_fence",
            new FenceBlock(Block.Settings.copy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            new Block(Block.Settings.copy(Blocks.RED_NETHER_BRICKS).strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    //Prismarine Blocks
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            new WallBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_PRISMARINE_BRICKS = registerBlock("cracked_prismarine_bricks",
            new Block(Block.Settings.copy(Blocks.PRISMARINE_BRICKS).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_PRISMARINE_BRICK_STAIRS = registerBlock("cracked_prismarine_brick_stairs",
            new StairsBlock(Blocks.PRISMARINE_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_PRISMARINE_BRICK_SLAB = registerBlock("cracked_prismarine_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_PRISMARINE_BRICK_WALL = registerBlock("cracked_prismarine_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_PRISMARINE_BRICKS = registerBlock("mossy_prismarine_bricks",
            new Block(Block.Settings.copy(Blocks.PRISMARINE_BRICKS).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_PRISMARINE_BRICK_STAIRS = registerBlock("mossy_prismarine_brick_stairs",
            new StairsBlock(Blocks.PRISMARINE_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_PRISMARINE_BRICK_SLAB = registerBlock("mossy_prismarine_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_PRISMARINE_BRICK_WALL = registerBlock("mossy_prismarine_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",
            new Block(Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    //Smooth Basalt
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), Block.Settings.copy(Blocks.SMOOTH_BASALT)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(Block.Settings.copy(Blocks.SMOOTH_BASALT)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(Block.Settings.copy(Blocks.SMOOTH_BASALT)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.BASALT)));

    //Sandstone Blocks
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(Block.Settings.copy(Blocks.SMOOTH_SANDSTONE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.CUT_SANDSTONE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            new WallBlock(Block.Settings.copy(Blocks.CUT_SANDSTONE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));

    //Red Sandstone Blocks
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            new WallBlock(Block.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            new StairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.CUT_RED_SANDSTONE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            new WallBlock(Block.Settings.copy(Blocks.CUT_RED_SANDSTONE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));

    //Purpur Blocks
    public static final Block PURPUR_WALL = registerBlock("purpur_wall",
            new WallBlock(Block.Settings.copy(Blocks.PURPUR_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_PURPUR = registerBlock("chiseled_purpur",
            new Block(Block.Settings.copy(Blocks.PURPUR_BLOCK).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    //Snow Blocks
    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            new Block(Block.Settings.copy(Blocks.SNOW_BLOCK).strength(0.2F).sounds(BlockSoundGroup.SNOW)));
    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            new StairsBlock(Blocks.SNOW_BLOCK.getDefaultState(), Block.Settings.copy(Blocks.SNOW_BLOCK)
                    .strength(0.2F).sounds(BlockSoundGroup.SNOW)));
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.SNOW_BLOCK).strength(0.2F).sounds(BlockSoundGroup.SNOW)));
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.SNOW_BLOCK).strength(0.2F).sounds(BlockSoundGroup.SNOW)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CinchsMissingBlocks.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(CinchsMissingBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static Block CreatePolishedDeepslateButton() {
        return new ButtonBlock(ModBlockSetType.POLISHED_DEEPSLATE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY));
    }
    public static void registerModBlocks() {
        CinchsMissingBlocks.LOGGER.info("Registering ModBlocks for " + CinchsMissingBlocks.MOD_ID);
    }
}