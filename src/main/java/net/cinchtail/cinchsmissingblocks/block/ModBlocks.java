package net.cinchtail.cinchsmissingblocks.block;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.cinchtail.cinchsmissingblocks.block.custom.SculkInlaidDeepslateBlock;
import net.cinchtail.cinchsmissingblocks.block.custom.TintedGlassPaneBlock;
import net.cinchtail.cinchsmissingblocks.util.ModBlockSetType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public class ModBlocks {

    //Calcite Blocks
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            properties -> new StairBlock(Blocks.CALCITE.defaultBlockState(),
                    properties.strength(0.75F).sound(SoundType.CALCITE)
                            .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            properties -> new SlabBlock(properties
                    .strength(0.75F).sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            properties -> new WallBlock(properties
                    .strength(0.75F).sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            properties -> new Block(properties.strength(1F, 1.0F)
                    .sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            properties -> new StairBlock(Blocks.CALCITE.defaultBlockState(), properties
                    .strength(1F, 1.0F).sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            properties -> new SlabBlock(properties
                    .strength(1F, 1.0F).sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            properties -> new WallBlock(properties
                    .strength(1F, 1.0F).sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            properties -> new Block(properties.strength(1F, 1.0F)
                    .sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            properties -> new StairBlock(Blocks.CALCITE.defaultBlockState(), properties
                    .strength(1F, 1.0F).sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1F, 1.0F).sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1F, 1.0F).sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            properties -> new Block(properties.strength(1F, 1.0F)
                    .sound(SoundType.CALCITE)));
    public static final Block CRACKED_CALCITE_BRICK_STAIRS = registerBlock("cracked_calcite_brick_stairs",
            properties -> new StairBlock(Blocks.CALCITE.defaultBlockState(), properties
                    .strength(1F, 1.0F).sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_CALCITE_BRICK_SLAB = registerBlock("cracked_calcite_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1F, 1.0F).sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_CALCITE_BRICK_WALL = registerBlock("cracked_calcite_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1F, 1.0F).sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_CALCITE_BRICKS = registerBlock("mossy_calcite_bricks",
            properties -> new Block(properties.strength(1F, 1.0F)
                    .sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_CALCITE_BRICK_STAIRS = registerBlock("mossy_calcite_brick_stairs",
            properties -> new StairBlock(Blocks.CALCITE.defaultBlockState(), properties
                    .strength(1F, 1.0F).sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_CALCITE_BRICK_SLAB = registerBlock("mossy_calcite_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1F, 1.0F).sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_CALCITE_BRICK_WALL = registerBlock("mossy_calcite_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1F, 1.0F).sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CHISELED_CALCITE_BRICKS = registerBlock("chiseled_calcite_bricks",
            properties -> new Block(properties.strength(1F, 1.0F)
                    .sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CALCITE_BRICK_PILLAR = registerBlock("calcite_brick_pillar",
            properties -> new RotatedPillarBlock(properties
                    .strength(1F, 1.0F).sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));


    //Dripstone Blocks
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            properties -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), properties
                    .strength(1.5F, 1.0F).sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 1.0F).sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 1.0F).sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            properties -> new Block(properties.strength(1.5F, 1.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            properties -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), properties.strength(1.5F, 6.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            properties -> new SlabBlock(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            properties -> new WallBlock(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            properties -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block CRACKED_DRIPSTONE_BRICKS = registerBlock("cracked_dripstone_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block CRACKED_DRIPSTONE_BRICK_STAIRS = registerBlock("cracked_dripstone_brick_stairs",
            properties -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block CRACKED_DRIPSTONE_BRICK_SLAB = registerBlock("cracked_dripstone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block CRACKED_DRIPSTONE_BRICK_WALL = registerBlock("cracked_dripstone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DRIPSTONE_BRICKS = registerBlock("mossy_dripstone_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DRIPSTONE_BRICK_STAIRS = registerBlock("mossy_dripstone_brick_stairs",
            properties -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DRIPSTONE_BRICK_SLAB = registerBlock("mossy_dripstone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DRIPSTONE_BRICK_WALL = registerBlock("mossy_dripstone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block CHISELED_DRIPSTONE_BRICKS = registerBlock("chiseled_dripstone_bricks",
            properties -> new Block(properties.strength(1.5F, 1.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final Block DRIPSTONE_BRICK_PILLAR = registerBlock("dripstone_brick_pillar",
            properties -> new RotatedPillarBlock(properties.strength(1.5F, 1.0F).sound(SoundType.DRIPSTONE_BLOCK)
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    //Tuff Blocks
    public static final Block CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.TUFF_BRICKS).mapColor(MapColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_TUFF_BRICK_STAIRS = registerBlock("cracked_tuff_brick_stairs",
            properties -> new StairBlock(Blocks.TUFF_BRICKS.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block CRACKED_TUFF_BRICK_SLAB = registerBlock("cracked_tuff_brick_slab",
            properties -> new SlabBlock(properties.requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block CRACKED_TUFF_BRICK_WALL = registerBlock("cracked_tuff_brick_wall",
            properties -> new WallBlock(properties.requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block MOSSY_TUFF_BRICKS = registerBlock("mossy_tuff_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.TUFF_BRICKS).requiresCorrectToolForDrops()
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block MOSSY_TUFF_BRICK_STAIRS = registerBlock("mossy_tuff_brick_stairs",
            properties -> new StairBlock(Blocks.TUFF_BRICKS.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block MOSSY_TUFF_BRICK_SLAB = registerBlock("mossy_tuff_brick_slab",
            properties -> new SlabBlock(properties.requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block MOSSY_TUFF_BRICK_WALL = registerBlock("mossy_tuff_brick_wall",
            properties -> new WallBlock(properties.requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM)));

    //Andesite Blocks
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            properties -> new StairBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_ANDESITE_BRICK_STAIRS = registerBlock("cracked_andesite_brick_stairs",
            properties -> new StairBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_ANDESITE_BRICK_SLAB = registerBlock("cracked_andesite_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_ANDESITE_BRICK_WALL = registerBlock("cracked_andesite_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_ANDESITE_BRICKS = registerBlock("mossy_andesite_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_ANDESITE_BRICK_STAIRS = registerBlock("mossy_andesite_brick_stairs",
            properties -> new StairBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_ANDESITE_BRICK_SLAB = registerBlock("mossy_andesite_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_ANDESITE_BRICK_WALL = registerBlock("mossy_andesite_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CHISELED_ANDESITE_BRICKS = registerBlock("chiseled_andesite_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block ANDESITE_BRICK_PILLAR = registerBlock("andesite_brick_pillar",
            properties -> new RotatedPillarBlock(properties.strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Granite Blocks
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F)
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            properties -> new StairBlock(Blocks.POLISHED_GRANITE.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_GRANITE_BRICK_STAIRS = registerBlock("cracked_granite_brick_stairs",
            properties -> new StairBlock(Blocks.POLISHED_GRANITE.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_GRANITE_BRICK_SLAB = registerBlock("cracked_granite_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_GRANITE_BRICK_WALL = registerBlock("cracked_granite_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_GRANITE_BRICKS = registerBlock("mossy_granite_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_GRANITE_BRICK_STAIRS = registerBlock("mossy_granite_brick_stairs",
            properties -> new StairBlock(Blocks.POLISHED_GRANITE.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_GRANITE_BRICK_SLAB = registerBlock("mossy_granite_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_GRANITE_BRICK_WALL = registerBlock("mossy_granite_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CHISELED_GRANITE_BRICKS = registerBlock("chiseled_granite_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block GRANITE_BRICK_PILLAR = registerBlock("granite_brick_pillar",
            properties -> new RotatedPillarBlock(properties.strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));


    //Diorite Blocks
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            properties -> new StairBlock(Blocks.POLISHED_DIORITE.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_DIORITE_BRICKS = registerBlock("cracked_diorite_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_DIORITE_BRICK_STAIRS = registerBlock("cracked_diorite_brick_stairs",
            properties -> new StairBlock(Blocks.POLISHED_DIORITE.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_DIORITE_BRICK_SLAB = registerBlock("cracked_diorite_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_DIORITE_BRICK_WALL = registerBlock("cracked_diorite_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DIORITE_BRICKS = registerBlock("mossy_diorite_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DIORITE_BRICK_STAIRS = registerBlock("mossy_diorite_brick_stairs",
            properties -> new StairBlock(Blocks.POLISHED_DIORITE.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DIORITE_BRICK_SLAB = registerBlock("mossy_diorite_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DIORITE_BRICK_WALL = registerBlock("mossy_diorite_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CHISELED_DIORITE_BRICKS = registerBlock("chiseled_diorite_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block DIORITE_BRICK_PILLAR = registerBlock("diorite_brick_pillar",
            properties -> new RotatedPillarBlock(properties.strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Quartz Blocks
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            properties -> new WallBlock(properties
                    .strength(0.8F)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            properties -> new WallBlock(properties
                    .strength(2.0F, 6.0F)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            properties -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(),
                    properties.strength(0.8F)
                            .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            properties -> new WallBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_QUARTZ_BRICKS = registerBlock("cracked_quartz_bricks",
            properties -> new Block(properties.strength(0.8F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_QUARTZ_BRICK_STAIRS = registerBlock("cracked_quartz_brick_stairs",
            properties -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(),
                    properties.strength(0.8F).sound(SoundType.STONE)
                            .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_QUARTZ_BRICK_SLAB = registerBlock("cracked_quartz_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_QUARTZ_BRICK_WALL = registerBlock("cracked_quartz_brick_wall",
            properties -> new WallBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_QUARTZ_BRICKS = registerBlock("mossy_quartz_bricks",
            properties -> new Block(properties.strength(0.8F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_QUARTZ_BRICK_STAIRS = registerBlock("mossy_quartz_brick_stairs",
            properties -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(),
                    properties.strength(0.8F).sound(SoundType.STONE)
                            .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_QUARTZ_BRICK_SLAB = registerBlock("mossy_quartz_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_QUARTZ_BRICK_WALL = registerBlock("mossy_quartz_brick_wall",
            properties -> new WallBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Brick Blocks
    public static final Block CRACKED_BRICKS = registerBlock("cracked_bricks",
            properties -> new Block(properties.strength(2.0F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_BRICK_STAIRS = registerBlock("cracked_brick_stairs",
            properties -> new StairBlock(Blocks.BRICKS.defaultBlockState(),
                    properties.strength(2.0F, 6.0F).sound(SoundType.STONE)
                            .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_BRICK_SLAB = registerBlock("cracked_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_BRICK_WALL = registerBlock("cracked_brick_wall",
            properties -> new WallBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_BRICKS = registerBlock("mossy_bricks",
            properties -> new Block(properties.strength(2.0F, 6.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_BRICK_STAIRS = registerBlock("mossy_brick_stairs",
            properties -> new StairBlock(Blocks.BRICKS.defaultBlockState(),
                    properties.strength(2.0F, 6.0F).sound(SoundType.STONE)
                            .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_BRICK_SLAB = registerBlock("mossy_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_BRICK_WALL = registerBlock("mossy_brick_wall",
            properties -> new WallBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CHISELED_BRICKS = registerBlock("chiseled_bricks",
            properties -> new Block(properties.strength(2.0F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Mud Brick Blocks
    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            properties -> new StairBlock(Blocks.MUD_BRICKS.defaultBlockState(),
                    properties.strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            properties -> new SlabBlock(properties
                    .strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            properties -> new WallBlock(properties
                    .strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_MUD_BRICKS = registerBlock("cracked_mud_bricks",
            properties -> new Block(properties.strength(1.5F, 3.0F)
                    .sound(SoundType.MUD_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_MUD_BRICK_STAIRS = registerBlock("cracked_mud_brick_stairs",
            properties -> new StairBlock(Blocks.MUD_BRICKS.defaultBlockState(),
                    properties.strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_MUD_BRICK_SLAB = registerBlock("cracked_mud_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_MUD_BRICK_WALL = registerBlock("cracked_mud_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_MUD_BRICKS = registerBlock("mossy_mud_bricks",
            properties -> new Block(properties.strength(1.5F, 3.0F)
                    .sound(SoundType.MUD_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_MUD_BRICK_STAIRS = registerBlock("mossy_mud_brick_stairs",
            properties -> new StairBlock(Blocks.MUD_BRICKS.defaultBlockState(),
                    properties.strength(1.5F, 3.0F)
                            .sound(SoundType.MUD_BRICKS)
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_MUD_BRICK_SLAB = registerBlock("mossy_mud_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_MUD_BRICK_WALL = registerBlock("mossy_mud_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CHISELED_MUD_BRICKS = registerBlock("chiseled_mud_bricks",
            properties -> new Block(properties.strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MUD_BRICK_PILLAR = registerBlock("mud_brick_pillar",
            properties -> new RotatedPillarBlock(properties.strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Resin Blocks
    public static final Block CRACKED_RESIN_BRICKS = registerBlock("cracked_resin_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.RESIN_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_RESIN_BRICK_STAIRS = registerBlock("cracked_resin_brick_stairs",
            properties -> new StairBlock(Blocks.RESIN_BRICKS.defaultBlockState(),
                    properties.strength(1.5F, 6.0F).sound(SoundType.RESIN_BRICKS)
                            .mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_RESIN_BRICK_SLAB = registerBlock("cracked_resin_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.RESIN_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_RESIN_BRICK_WALL = registerBlock("cracked_resin_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.RESIN_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_RESIN_BRICKS = registerBlock("mossy_resin_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.RESIN_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_RESIN_BRICK_STAIRS = registerBlock("mossy_resin_brick_stairs",
            properties -> new StairBlock(Blocks.RESIN_BRICKS.defaultBlockState(),
                    properties.strength(1.5F, 6.0F).sound(SoundType.RESIN_BRICKS)
                            .mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_RESIN_BRICK_SLAB = registerBlock("mossy_resin_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.RESIN_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_RESIN_BRICK_WALL = registerBlock("mossy_resin_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.RESIN_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Endstone Blocks
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            properties -> new StairBlock(Blocks.END_STONE.defaultBlockState(),
                    properties.strength(3.0F, 9.0F).sound(SoundType.STONE)
                            .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            properties -> new SlabBlock(properties
                    .strength(3.0F, 9.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            properties -> new WallBlock(properties
                    .strength(3.0F, 9.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block POLISHED_END_STONE = registerBlock("polished_end_stone",
            properties -> new Block(properties
                    .strength(3.0F, 9.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            properties -> new StairBlock(Blocks.END_STONE.defaultBlockState(),
                    properties.strength(3.0F, 9.0F).sound(SoundType.STONE)
                            .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            properties -> new SlabBlock(properties.strength(3.0F, 9.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            properties -> new WallBlock(properties.strength(3.0F, 9.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            properties -> new Block(properties.strength(3.0F, 9.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_END_STONE_BRICK_STAIRS = registerBlock("cracked_end_stone_brick_stairs",
            properties -> new StairBlock(Blocks.END_STONE.defaultBlockState(),
                    properties.strength(3.0F, 9.0F).sound(SoundType.STONE)
                            .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_END_STONE_BRICK_SLAB = registerBlock("cracked_end_stone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(3.0F, 9.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_END_STONE_BRICK_WALL = registerBlock("cracked_end_stone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(3.0F, 9.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_END_STONE_BRICKS = registerBlock("mossy_end_stone_bricks",
            properties -> new Block(properties.strength(3.0F, 9.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_END_STONE_BRICK_STAIRS = registerBlock("mossy_end_stone_brick_stairs",
            properties -> new StairBlock(Blocks.END_STONE.defaultBlockState(),
                    properties.strength(3.0F, 9.0F).sound(SoundType.STONE)
                            .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_END_STONE_BRICK_SLAB = registerBlock("mossy_end_stone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(3.0F, 9.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_END_STONE_BRICK_WALL = registerBlock("mossy_end_stone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(3.0F, 9.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            properties -> new Block(properties.strength(3.0F, 9.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block END_STONE_BRICK_PILLAR = registerBlock("end_stone_brick_pillar",
            properties -> new RotatedPillarBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Stone Blocks
    public static final Block STONE_WALL = registerBlock("stone_wall",
            properties -> new WallBlock(properties
                    .strength(2.0F, 6.0F)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            properties -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(),
                    properties.strength(2.0F, 6.0F)
                            .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            properties -> new WallBlock(properties
                    .strength(2.0F, 6.0F)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
            properties -> new StairBlock(Blocks.STONE_BRICKS.defaultBlockState(),
                    properties.strength(1.5F, 6.0F).sound(SoundType.STONE)
                            .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            properties -> new Block(properties.sound(SoundType.STONE).strength(1.5F, 6.0F)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            properties -> new StairBlock(Blocks.STONE_BRICKS.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.5F, 6.0F)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block STONE_TILE_WALL = registerBlock("stone_tile_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            properties -> new Block(properties.sound(SoundType.STONE).strength(1.5F, 6.0F)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_STONE_TILE_STAIRS = registerBlock("cracked_stone_tile_stairs",
            properties -> new StairBlock(Blocks.STONE_BRICKS.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.5F, 6.0F)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_STONE_TILE_SLAB = registerBlock("cracked_stone_tile_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_STONE_TILE_WALL = registerBlock("cracked_stone_tile_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            properties -> new Block(properties.sound(SoundType.STONE).strength(1.5F, 6.0F)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_STONE_TILE_STAIRS = registerBlock("mossy_stone_tile_stairs",
            properties -> new StairBlock(Blocks.STONE_BRICKS.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.5F, 6.0F)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_STONE_TILE_SLAB = registerBlock("mossy_stone_tile_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_STONE_TILE_WALL = registerBlock("mossy_stone_tile_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block STONE_BRICK_PILLAR = registerBlock("stone_brick_pillar",
            properties -> new RotatedPillarBlock(properties.strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Deepslate Blocks
    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            properties -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(),
                    properties.strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)
                            .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            properties -> new SlabBlock(properties
                    .strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            properties -> new WallBlock(properties
                    .strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_COBBLED_DEEPSLATE = registerBlock("mossy_cobbled_deepslate",
            properties -> new Block(properties.sound(SoundType.DEEPSLATE).strength(3.5f, 6.0F)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_COBBLED_DEEPSLATE_STAIRS = registerBlock("mossy_cobbled_deepslate_stairs",
            properties -> new StairBlock(ModBlocks.MOSSY_COBBLED_DEEPSLATE.defaultBlockState(),properties
                    .sound(SoundType.DEEPSLATE).strength(3.5f, 6.0F)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_COBBLED_DEEPSLATE_SLAB = registerBlock("mossy_cobbled_deepslate_slab",
            properties -> new SlabBlock(properties
                    .strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_COBBLED_DEEPSLATE_WALL = registerBlock("mossy_cobbled_deepslate_wall",
            properties -> new WallBlock(properties
                    .strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs",
            properties -> new StairBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.defaultBlockState(),
                    properties.strength(3.5F, 6.0F)
                            .sound(SoundType.DEEPSLATE_BRICKS)
                            .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_DEEPSLATE_BRICK_WALL = registerBlock("cracked_deepslate_brick_wall",
            properties -> new WallBlock(properties
                    .strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            properties -> new Block(properties.strength(3.5f, 6.0F)
                    .sound(SoundType.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            properties -> new StairBlock(ModBlocks.MOSSY_DEEPSLATE_BRICKS.defaultBlockState(),
                    properties.strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)
                            .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            properties -> new WallBlock(properties
                    .strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs",
            properties -> new StairBlock(Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(),
                    properties.strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES)
                            .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab",
            properties -> new SlabBlock(properties
                    .strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_DEEPSLATE_TILE_WALL = registerBlock("cracked_deepslate_tile_wall",
            properties -> new WallBlock(properties
                    .strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DEEPSLATE_TILES = registerBlock("mossy_deepslate_tiles",
            properties -> new Block(properties.strength(3.5f, 6.0F)
                    .sound(SoundType.DEEPSLATE_TILES)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock("mossy_deepslate_tile_stairs",
            properties -> new StairBlock(ModBlocks.MOSSY_DEEPSLATE_TILES.defaultBlockState(),
                    properties.strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE_TILES)
                            .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DEEPSLATE_TILE_SLAB = registerBlock("mossy_deepslate_tile_slab",
            properties -> new SlabBlock(properties
                    .strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE_TILES)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_DEEPSLATE_TILE_WALL = registerBlock("mossy_deepslate_tile_wall",
            properties -> new WallBlock(properties
                    .strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE_TILES)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block DEEPSLATE_BRICK_PILLAR = registerBlock("deepslate_brick_pillar",
            properties -> new RotatedPillarBlock(properties.strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block SCULK_INLAID_DEEPSLATE = registerBlock("sculk_inlaid_deepslate",
            properties -> new SculkInlaidDeepslateBlock(properties.sound(SoundType.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            properties -> new PressurePlateBlock(ModBlockSetType.POLISHED_DEEPSLATE,
                    properties.pushReaction(PushReaction.DESTROY).noCollision().sound(SoundType.POLISHED_DEEPSLATE).mapColor(MapColor.DEEPSLATE)
                            .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            properties -> new ButtonBlock(ModBlockSetType.POLISHED_DEEPSLATE, 20, properties
                    .noCollision().strength(0.5F).pushReaction(PushReaction.DESTROY).forceSolidOn()
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Blackstone Bricks
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs",
            properties -> new StairBlock(Blocks.POLISHED_BLACKSTONE.defaultBlockState(),
                    properties.strength(1.5F, 6.0F)
                            .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            properties -> new SlabBlock(properties.strength(1.5F, 6.0F)
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            properties -> new WallBlock(properties.strength(1.5F, 6.0F)
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block BLACKSTONE_TILES = registerBlock("blackstone_tiles",
            properties -> new Block(properties.sound(SoundType.STONE).strength(1.5F, 6.0F)
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block BLACKSTONE_TILE_STAIRS = registerBlock("blackstone_tile_stairs",
            properties -> new StairBlock(Blocks.POLISHED_BLACKSTONE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.5F, 6.0F)
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block BLACKSTONE_TILE_SLAB = registerBlock("blackstone_tile_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block BLACKSTONE_TILE_WALL = registerBlock("blackstone_tile_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_BLACKSTONE_TILES = registerBlock("cracked_blackstone_tiles",
            properties -> new Block(properties.sound(SoundType.STONE).strength(1.5F, 6.0F)
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_BLACKSTONE_TILE_STAIRS = registerBlock("cracked_blackstone_tile_stairs",
            properties -> new StairBlock(Blocks.POLISHED_BLACKSTONE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.5F, 6.0F)
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_BLACKSTONE_TILE_SLAB = registerBlock("cracked_blackstone_tile_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F,6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_BLACKSTONE_TILE_WALL = registerBlock("cracked_blackstone_tile_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block BLACKSTONE_BRICK_PILLAR = registerBlock("blackstone_brick_pillar",
            properties -> new RotatedPillarBlock(properties.strength(1.5f, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Netherrack
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            properties -> new StairBlock(Blocks.NETHERRACK.defaultBlockState(),
                    properties.strength(0.4F).sound(SoundType.NETHERRACK)
                            .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            properties -> new SlabBlock(properties
                    .strength(0.4F).sound(SoundType.NETHERRACK)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            properties -> new WallBlock(properties
                    .strength(0.4F).sound(SoundType.NETHERRACK)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    //Nether Bricks
    public static final Block CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs",
            properties -> new StairBlock(Blocks.NETHER_BRICKS.defaultBlockState(), properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall",
            properties -> new WallBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_NETHER_BRICK_FENCE = registerBlock("cracked_nether_brick_fence",
            properties -> new FenceBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Red Nether Bricks
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            properties -> new FenceBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            properties -> new Block(properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_RED_NETHER_BRICK_STAIRS = registerBlock("cracked_red_nether_brick_stairs",
            properties -> new StairBlock(Blocks.RED_NETHER_BRICKS.defaultBlockState(), properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_RED_NETHER_BRICK_SLAB = registerBlock("cracked_red_nether_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_RED_NETHER_BRICK_WALL = registerBlock("cracked_red_nether_brick_wall",
            properties -> new WallBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_RED_NETHER_BRICK_FENCE = registerBlock("cracked_red_nether_brick_fence",
            properties -> new FenceBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            properties -> new Block(properties.strength(2.0F, 6.0F)
                    .sound(SoundType.NETHER_BRICKS).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Blue Nether Bricks
    public static final Block BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks",
            properties -> new Block(properties.strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block BLUE_NETHER_BRICK_STAIRS = registerBlock("blue_nether_brick_stairs",
            properties -> new StairBlock(ModBlocks.BLUE_NETHER_BRICKS.defaultBlockState(), properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block BLUE_NETHER_BRICK_SLAB = registerBlock("blue_nether_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block BLUE_NETHER_BRICK_WALL = registerBlock("blue_nether_brick_wall",
            properties -> new WallBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block BLUE_NETHER_BRICK_FENCE = registerBlock("blue_nether_brick_fence",
            properties -> new FenceBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_BLUE_NETHER_BRICKS = registerBlock("cracked_blue_nether_bricks",
            properties -> new Block(properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_BLUE_NETHER_BRICK_STAIRS = registerBlock("cracked_blue_nether_brick_stairs",
            properties -> new StairBlock(ModBlocks.BLUE_NETHER_BRICKS.defaultBlockState(), properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_BLUE_NETHER_BRICK_SLAB = registerBlock("cracked_blue_nether_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_BLUE_NETHER_BRICK_WALL = registerBlock("cracked_blue_nether_brick_wall",
            properties -> new WallBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_BLUE_NETHER_BRICK_FENCE = registerBlock("cracked_blue_nether_brick_fence",
            properties -> new FenceBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CHISELED_BLUE_NETHER_BRICKS = registerBlock("chiseled_blue_nether_bricks",
            properties -> new Block(properties.strength(2.0F, 6.0F)
                    .sound(SoundType.NETHER_BRICKS)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Prismarine Blocks
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            properties -> new WallBlock(properties.strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_PRISMARINE_BRICKS = registerBlock("cracked_prismarine_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_PRISMARINE_BRICK_STAIRS = registerBlock("cracked_prismarine_brick_stairs",
            properties -> new StairBlock(Blocks.PRISMARINE_BRICKS.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_PRISMARINE_BRICK_SLAB = registerBlock("cracked_prismarine_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_PRISMARINE_BRICK_WALL = registerBlock("cracked_prismarine_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_PRISMARINE_BRICKS = registerBlock("mossy_prismarine_bricks",
            properties -> new Block(properties.strength(1.5F, 6.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_PRISMARINE_BRICK_STAIRS = registerBlock("mossy_prismarine_brick_stairs",
            properties -> new StairBlock(Blocks.PRISMARINE_BRICKS.defaultBlockState(), properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_PRISMARINE_BRICK_SLAB = registerBlock("mossy_prismarine_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_PRISMARINE_BRICK_WALL = registerBlock("mossy_prismarine_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",
            properties -> new Block(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block PRISMARINE_BRICK_PILLAR = registerBlock("prismarine_brick_pillar",
            properties -> new RotatedPillarBlock(properties.strength(1.5f, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Smooth Basalt
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            properties -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(), properties
                    .strength(1.25F, 4.2F).sound(SoundType.BASALT)
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.BASALT)
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.BASALT)
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Sandstone Blocks
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            properties -> new WallBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            properties -> new StairBlock(Blocks.CUT_SANDSTONE.defaultBlockState(), properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            properties -> new WallBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            properties -> new Block(properties.strength(0.8F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            properties -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_SANDSTONE_BRICKS = registerBlock("cracked_sandstone_bricks",
            properties -> new Block(properties.strength(0.8F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_SANDSTONE_BRICK_STAIRS = registerBlock("cracked_sandstone_brick_stairs",
            properties -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_SANDSTONE_BRICK_SLAB = registerBlock("cracked_sandstone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_SANDSTONE_BRICK_WALL = registerBlock("cracked_sandstone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_SANDSTONE_BRICKS = registerBlock("mossy_sandstone_bricks",
            properties -> new Block(properties.strength(0.8F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_SANDSTONE_BRICK_STAIRS = registerBlock("mossy_sandstone_brick_stairs",
            properties -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_SANDSTONE_BRICK_SLAB = registerBlock("mossy_sandstone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_SANDSTONE_BRICK_WALL = registerBlock("mossy_sandstone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block SANDSTONE_BRICK_PILLAR = registerBlock("sandstone_brick_pillar",
            properties -> new RotatedPillarBlock(properties.strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Red Sandstone Blocks
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            properties -> new WallBlock(properties
                    .strength(2.0F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            properties -> new StairBlock(Blocks.CUT_RED_SANDSTONE.defaultBlockState(), properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            properties -> new WallBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            properties -> new Block(properties.strength(0.8F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs",
            properties -> new StairBlock(Blocks.RED_SANDSTONE.defaultBlockState(), properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_RED_SANDSTONE_BRICKS = registerBlock("cracked_red_sandstone_bricks",
            properties -> new Block(properties.strength(0.8F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_RED_SANDSTONE_BRICK_STAIRS = registerBlock("cracked_red_sandstone_brick_stairs",
            properties -> new StairBlock(Blocks.RED_SANDSTONE.defaultBlockState(), properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_RED_SANDSTONE_BRICK_SLAB = registerBlock("cracked_red_sandstone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CRACKED_RED_SANDSTONE_BRICK_WALL = registerBlock("cracked_red_sandstone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_RED_SANDSTONE_BRICKS = registerBlock("mossy_red_sandstone_bricks",
            properties -> new Block(properties.strength(0.8F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_RED_SANDSTONE_BRICK_STAIRS = registerBlock("mossy_red_sandstone_brick_stairs",
            properties -> new StairBlock(Blocks.RED_SANDSTONE.defaultBlockState(), properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_RED_SANDSTONE_BRICK_SLAB = registerBlock("mossy_red_sandstone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block MOSSY_RED_SANDSTONE_BRICK_WALL = registerBlock("mossy_red_sandstone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block RED_SANDSTONE_BRICK_PILLAR = registerBlock("red_sandstone_brick_pillar",
            properties -> new RotatedPillarBlock(properties.strength(0.8F).sound(SoundType.STONE)
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Purpur Blocks
    public static final Block PURPUR_WALL = registerBlock("purpur_wall",
            properties -> new WallBlock(properties
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));
    public static final Block CHISELED_PURPUR = registerBlock("chiseled_purpur",
            properties -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    //Snow Blocks
    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            properties -> new Block(properties.strength(0.2F).sound(SoundType.SNOW)
                    .mapColor(MapColor.SNOW).requiresCorrectToolForDrops()));
    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            properties -> new StairBlock(Blocks.SNOW_BLOCK.defaultBlockState(), properties
                    .strength(0.2F).sound(SoundType.SNOW)
                    .mapColor(MapColor.SNOW).requiresCorrectToolForDrops()));
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            properties -> new SlabBlock(properties.strength(0.2F).sound(SoundType.SNOW)
                    .mapColor(MapColor.SNOW).requiresCorrectToolForDrops()));
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            properties -> new WallBlock(properties.strength(0.2F).sound(SoundType.SNOW)
                    .mapColor(MapColor.SNOW).requiresCorrectToolForDrops()));

    //Tinted Glass Pane
    public static final Block TINTED_GLASS_PANE = registerBlock("tinted_glass_pane",
            properties -> new TintedGlassPaneBlock(properties.strength(0.3F).sound(SoundType.GLASS)
                    .isValidSpawn(Blocks::never).isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never).isViewBlocking(Blocks::never)
                    .noOcclusion().mapColor(MapColor.COLOR_GRAY)));

    //Terracotta Variants
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            properties -> new StairBlock(Blocks.TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            properties -> new StairBlock(Blocks.WHITE_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            properties -> new StairBlock(Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            properties -> new StairBlock(Blocks.GRAY_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            properties -> new StairBlock(Blocks.BLACK_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            properties -> new StairBlock(Blocks.BROWN_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            properties -> new StairBlock(Blocks.RED_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            properties -> new StairBlock(Blocks.ORANGE_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            properties -> new StairBlock(Blocks.YELLOW_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            properties -> new StairBlock(Blocks.LIME_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)));
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)));
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            properties -> new StairBlock(Blocks.GREEN_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            properties -> new StairBlock(Blocks.CYAN_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            properties -> new StairBlock(Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            properties -> new StairBlock(Blocks.BLUE_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            properties -> new StairBlock(Blocks.PURPLE_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            properties -> new StairBlock(Blocks.MAGENTA_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            properties -> new StairBlock(Blocks.PINK_TERRACOTTA.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_PINK)));


    //Concrete Variants
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            properties -> new StairBlock(Blocks.WHITE_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.WHITE)));
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.WHITE)));
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.WHITE)));
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            properties -> new StairBlock(Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.LIGHT_GRAY)));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.LIGHT_GRAY)));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.LIGHT_GRAY)));
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            properties -> new StairBlock(Blocks.GRAY_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.GRAY)));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.GRAY)));
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.GRAY)));
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            properties -> new StairBlock(Blocks.BLACK_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.BLACK)));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.BLACK)));
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.BLACK)));
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            properties -> new StairBlock(Blocks.BROWN_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.BROWN)));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.BROWN)));
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.BROWN)));
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            properties -> new StairBlock(Blocks.RED_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.RED)));
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.RED)));
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.RED)));
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            properties -> new StairBlock(Blocks.ORANGE_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.ORANGE)));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.ORANGE)));
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.ORANGE)));
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            properties -> new StairBlock(Blocks.YELLOW_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.YELLOW)));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.YELLOW)));
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.YELLOW)));
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            properties -> new StairBlock(Blocks.LIME_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.LIME)));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.LIME)));
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.LIME)));
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            properties -> new StairBlock(Blocks.GREEN_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.GREEN)));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.GREEN)));
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.GREEN)));
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            properties -> new StairBlock(Blocks.CYAN_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.CYAN)));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.CYAN)));
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.CYAN)));
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            properties -> new StairBlock(Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.LIGHT_BLUE)));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.LIGHT_BLUE)));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.LIGHT_BLUE)));
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            properties -> new StairBlock(Blocks.BLUE_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.BLUE)));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.BLUE)));
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.BLUE)));
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            properties -> new StairBlock(Blocks.PURPLE_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.PURPLE)));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.PURPLE)));
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.PURPLE)));
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            properties -> new StairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.MAGENTA)));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.MAGENTA)));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.MAGENTA)));
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            properties -> new StairBlock(Blocks.PINK_CONCRETE.defaultBlockState(),properties
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.PINK)));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.PINK)));
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().mapColor(DyeColor.PINK)));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name), toRegister);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name)))));
    }
    public static void registerModBlocks() {
        CinchsMissingBlocks.LOGGER.info("Registering ModBlocks for " + MOD_ID);
    }
}