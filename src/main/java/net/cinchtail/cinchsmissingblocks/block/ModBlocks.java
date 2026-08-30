package net.cinchtail.cinchsmissingblocks.block;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.cinchtail.cinchsmissingblocks.block.custom.SculkInlaidDeepslateBlock;
import net.cinchtail.cinchsmissingblocks.block.custom.TintedGlassPaneBlock;
import net.cinchtail.cinchsmissingblocks.util.ModBlockSetType;
import net.cinchtail.cinchsmissingblocks.util.ModWoodTypes;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.Properties;
import java.util.function.Function;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public class ModBlocks {

    //Calcite Blocks
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            properties -> new StairsBlock(Blocks.CALCITE.getDefaultState(), Block.Settings.copy(Blocks.CALCITE)
                    .strength(0.75F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_stairs")))));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(0.75F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_slab")))));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(0.75F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_wall")))));
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            properties -> new Block(Block.Settings.copy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_calcite")))));
    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            properties -> new StairsBlock(Blocks.CALCITE.getDefaultState(), Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_calcite_stairs")))));
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_calcite_slab")))));
    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_calcite_wall")))));
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_bricks")))));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            properties -> new StairsBlock(Blocks.CALCITE.getDefaultState(), Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_brick_stairs")))));
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_brick_slab")))));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_brick_wall")))));
    public static final Block CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_calcite_bricks")))));
    public static final Block CRACKED_CALCITE_BRICK_STAIRS = registerBlock("cracked_calcite_brick_stairs",
            properties -> new StairsBlock(Blocks.CALCITE.getDefaultState(), Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_calcite_brick_stairs")))));
    public static final Block CRACKED_CALCITE_BRICK_SLAB = registerBlock("cracked_calcite_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_calcite_brick_slab")))));
    public static final Block CRACKED_CALCITE_BRICK_WALL = registerBlock("cracked_calcite_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_calcite_brick_wall")))));
    public static final Block MOSSY_CALCITE_BRICKS = registerBlock("mossy_calcite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_calcite_bricks")))));
    public static final Block MOSSY_CALCITE_BRICK_STAIRS = registerBlock("mossy_calcite_brick_stairs",
            properties -> new StairsBlock(Blocks.CALCITE.getDefaultState(), Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_calcite_brick_stairs")))));
    public static final Block MOSSY_CALCITE_BRICK_SLAB = registerBlock("mossy_calcite_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_calcite_brick_slab")))));
    public static final Block MOSSY_CALCITE_BRICK_WALL = registerBlock("mossy_calcite_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_calcite_brick_wall")))));
    public static final Block CHISELED_CALCITE_BRICKS = registerBlock("chiseled_calcite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "chiseled_calcite_bricks")))));
    public static final Block CALCITE_BRICK_PILLAR = registerBlock("calcite_brick_pillar",
            properties -> new PillarBlock(Block.Settings.copy(ModBlocks.CALCITE_BRICKS).strength(1F, 1.0F).sounds(BlockSoundGroup.CALCITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "calcite_brick_pillar")))));


    //Dripstone Blocks
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            properties -> new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 1.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_stairs")))));
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 1.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_slab")))));
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 1.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_wall")))));
    public static final Block POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            properties -> new Block(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 1.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_dripstone")))));
    public static final Block POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            properties -> new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_dripstone_stairs")))));
    public static final Block POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_dripstone_slab")))));
    public static final Block POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_dripstone_wall")))));
    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_bricks")))));
    public static final Block DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            properties -> new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_brick_stairs")))));
    public static final Block DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_brick_slab")))));
    public static final Block DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_brick_wall")))));
    public static final Block CRACKED_DRIPSTONE_BRICKS = registerBlock("cracked_dripstone_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_dripstone_bricks")))));
    public static final Block CRACKED_DRIPSTONE_BRICK_STAIRS = registerBlock("cracked_dripstone_brick_stairs",
            properties -> new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_dripstone_brick_stairs")))));
    public static final Block CRACKED_DRIPSTONE_BRICK_SLAB = registerBlock("cracked_dripstone_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_dripstone_brick_slab")))));
    public static final Block CRACKED_DRIPSTONE_BRICK_WALL = registerBlock("cracked_dripstone_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_dripstone_brick_wall")))));
    public static final Block MOSSY_DRIPSTONE_BRICKS = registerBlock("mossy_dripstone_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_dripstone_bricks")))));
    public static final Block MOSSY_DRIPSTONE_BRICK_STAIRS = registerBlock("mossy_dripstone_brick_stairs",
            properties -> new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_dripstone_brick_stairs")))));
    public static final Block MOSSY_DRIPSTONE_BRICK_SLAB = registerBlock("mossy_dripstone_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_dripstone_brick_slab")))));
    public static final Block MOSSY_DRIPSTONE_BRICK_WALL = registerBlock("mossy_dripstone_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_dripstone_brick_wall")))));
    public static final Block CHISELED_DRIPSTONE_BRICKS = registerBlock("chiseled_dripstone_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 1.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "chiseled_dripstone_bricks")))));
    public static final Block DRIPSTONE_BRICK_PILLAR = registerBlock("dripstone_brick_pillar",
            properties -> new PillarBlock(Block.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 1.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dripstone_brick_pillar")))));

    //Tuff Blocks
    public static final Block CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.TUFF_BRICKS).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.TUFF_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_tuff_bricks")))));
    public static final Block CRACKED_TUFF_BRICK_STAIRS = registerBlock("cracked_tuff_brick_stairs",
            properties -> new StairsBlock(Blocks.TUFF_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.TUFF_BRICKS)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_tuff_brick_stairs")))));
    public static final Block CRACKED_TUFF_BRICK_SLAB = registerBlock("cracked_tuff_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.TUFF_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_tuff_brick_slab")))));
    public static final Block CRACKED_TUFF_BRICK_WALL = registerBlock("cracked_tuff_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.TUFF_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_tuff_brick_wall")))));
    public static final Block MOSSY_TUFF_BRICKS = registerBlock("mossy_tuff_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.TUFF_BRICKS).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.TUFF_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_tuff_bricks")))));
    public static final Block MOSSY_TUFF_BRICK_STAIRS = registerBlock("mossy_tuff_brick_stairs",
            properties -> new StairsBlock(Blocks.TUFF_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.TUFF_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_tuff_brick_stairs")))));
    public static final Block MOSSY_TUFF_BRICK_SLAB = registerBlock("mossy_tuff_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.TUFF_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_tuff_brick_slab")))));
    public static final Block MOSSY_TUFF_BRICK_WALL = registerBlock("mossy_tuff_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.TUFF_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_tuff_brick_wall")))));

    //Andesite Blocks
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_andesite_wall")))));
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "andesite_bricks")))));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            properties -> new StairsBlock(Blocks.POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "andesite_brick_stairs")))));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "andesite_brick_slab")))));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "andesite_brick_wall")))));
    public static final Block CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_andesite_bricks")))));
    public static final Block CRACKED_ANDESITE_BRICK_STAIRS = registerBlock("cracked_andesite_brick_stairs",
            properties -> new StairsBlock(Blocks.POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_andesite_brick_stairs")))));
    public static final Block CRACKED_ANDESITE_BRICK_SLAB = registerBlock("cracked_andesite_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_andesite_brick_slab")))));
    public static final Block CRACKED_ANDESITE_BRICK_WALL = registerBlock("cracked_andesite_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_andesite_brick_wall")))));
    public static final Block MOSSY_ANDESITE_BRICKS = registerBlock("mossy_andesite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_andesite_bricks")))));
    public static final Block MOSSY_ANDESITE_BRICK_STAIRS = registerBlock("mossy_andesite_brick_stairs",
            properties -> new StairsBlock(Blocks.POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_andesite_brick_stairs")))));
    public static final Block MOSSY_ANDESITE_BRICK_SLAB = registerBlock("mossy_andesite_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_andesite_brick_slab")))));
    public static final Block MOSSY_ANDESITE_BRICK_WALL = registerBlock("mossy_andesite_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_andesite_brick_wall")))));
    public static final Block CHISELED_ANDESITE_BRICKS = registerBlock("chiseled_andesite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "chiseled_andesite_bricks")))));
    public static final Block ANDESITE_BRICK_PILLAR = registerBlock("andesite_brick_pillar",
            properties -> new PillarBlock(Block.Settings.copy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "andesite_brick_pillar")))));

    //Granite Blocks
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_granite_wall")))));
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "granite_bricks")))));
    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            properties -> new StairsBlock(Blocks.POLISHED_GRANITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_GRANITE)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "granite_brick_stairs")))));
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "granite_brick_slab")))));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "granite_brick_wall")))));
    public static final Block CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_granite_bricks")))));
    public static final Block CRACKED_GRANITE_BRICK_STAIRS = registerBlock("cracked_granite_brick_stairs",
            properties -> new StairsBlock(Blocks.POLISHED_GRANITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_GRANITE)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_granite_brick_stairs")))));
    public static final Block CRACKED_GRANITE_BRICK_SLAB = registerBlock("cracked_granite_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_granite_brick_slab")))));
    public static final Block CRACKED_GRANITE_BRICK_WALL = registerBlock("cracked_granite_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_granite_brick_wall")))));
    public static final Block MOSSY_GRANITE_BRICKS = registerBlock("mossy_granite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_granite_bricks")))));
    public static final Block MOSSY_GRANITE_BRICK_STAIRS = registerBlock("mossy_granite_brick_stairs",
            properties -> new StairsBlock(Blocks.POLISHED_GRANITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_GRANITE)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_granite_brick_stairs")))));
    public static final Block MOSSY_GRANITE_BRICK_SLAB = registerBlock("mossy_granite_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_granite_brick_slab")))));
    public static final Block MOSSY_GRANITE_BRICK_WALL = registerBlock("mossy_granite_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_granite_brick_wall")))));
    public static final Block CHISELED_GRANITE_BRICKS = registerBlock("chiseled_granite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "chiseled_granite_bricks")))));
    public static final Block GRANITE_BRICK_PILLAR = registerBlock("granite_brick_pillar",
            properties -> new PillarBlock(Block.Settings.copy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "granite_brick_pillar")))));


    //Diorite Blocks
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_diorite_wall")))));
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diorite_bricks")))));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            properties -> new StairsBlock(Blocks.POLISHED_DIORITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_DIORITE)
                            .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diorite_brick_stairs")))));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diorite_brick_slab")))));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diorite_brick_wall")))));
    public static final Block CRACKED_DIORITE_BRICKS = registerBlock("cracked_diorite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_diorite_bricks")))));
    public static final Block CRACKED_DIORITE_BRICK_STAIRS = registerBlock("cracked_diorite_brick_stairs",
            properties -> new StairsBlock(Blocks.POLISHED_DIORITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_diorite_brick_stairs")))));
    public static final Block CRACKED_DIORITE_BRICK_SLAB = registerBlock("cracked_diorite_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_diorite_brick_slab")))));
    public static final Block CRACKED_DIORITE_BRICK_WALL = registerBlock("cracked_diorite_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_diorite_brick_wall")))));
    public static final Block MOSSY_DIORITE_BRICKS = registerBlock("mossy_diorite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_diorite_bricks")))));
    public static final Block MOSSY_DIORITE_BRICK_STAIRS = registerBlock("mossy_diorite_brick_stairs",
            properties -> new StairsBlock(Blocks.POLISHED_DIORITE.getDefaultState(), Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_diorite_brick_stairs")))));
    public static final Block MOSSY_DIORITE_BRICK_SLAB = registerBlock("mossy_diorite_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_diorite_brick_slab")))));
    public static final Block MOSSY_DIORITE_BRICK_WALL = registerBlock("mossy_diorite_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_diorite_brick_wall")))));
    public static final Block CHISELED_DIORITE_BRICKS = registerBlock("chiseled_diorite_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "chiseled_diorite_bricks")))));
    public static final Block DIORITE_BRICK_PILLAR = registerBlock("diorite_brick_pillar",
            properties -> new PillarBlock(Block.Settings.copy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "diorite_brick_pillar")))));

    //Quartz Blocks
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.QUARTZ_BLOCK)
                    .strength(0.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "quartz_wall")))));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.SMOOTH_QUARTZ)
                    .strength(2.0F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_quartz_wall")))));
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            properties -> new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.QUARTZ_BRICKS).strength(0.8F)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "quartz_brick_stairs")))));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.QUARTZ_BRICKS)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "quartz_brick_slab")))));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.QUARTZ_BRICKS)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "quartz_brick_wall")))));
    public static final Block CRACKED_QUARTZ_BRICKS = registerBlock("cracked_quartz_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.QUARTZ_BRICKS).strength(0.8F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_quartz_bricks")))));
    public static final Block CRACKED_QUARTZ_BRICK_STAIRS = registerBlock("cracked_quartz_brick_stairs",
            properties -> new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.QUARTZ_BRICKS).strength(0.8F).sounds(BlockSoundGroup.STONE)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_quartz_brick_stairs")))));
    public static final Block CRACKED_QUARTZ_BRICK_SLAB = registerBlock("cracked_quartz_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.QUARTZ_BRICKS)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_quartz_brick_slab")))));
    public static final Block CRACKED_QUARTZ_BRICK_WALL = registerBlock("cracked_quartz_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.QUARTZ_BRICKS)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_quartz_brick_wall")))));
    public static final Block MOSSY_QUARTZ_BRICKS = registerBlock("mossy_quartz_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.QUARTZ_BRICKS).strength(0.8F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_quartz_bricks")))));
    public static final Block MOSSY_QUARTZ_BRICK_STAIRS = registerBlock("mossy_quartz_brick_stairs",
            properties -> new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.QUARTZ_BRICKS).strength(0.8F).sounds(BlockSoundGroup.STONE)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_quartz_brick_stairs")))));
    public static final Block MOSSY_QUARTZ_BRICK_SLAB = registerBlock("mossy_quartz_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.QUARTZ_BRICKS)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_quartz_brick_slab")))));
    public static final Block MOSSY_QUARTZ_BRICK_WALL = registerBlock("mossy_quartz_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.QUARTZ_BRICKS)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_quartz_brick_wall")))));

    //Brick Blocks
    public static final Block CRACKED_BRICKS = registerBlock("cracked_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.BRICKS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_bricks")))));
    public static final Block CRACKED_BRICK_STAIRS = registerBlock("cracked_brick_stairs",
            properties -> new StairsBlock(Blocks.BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.BRICKS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_brick_stairs")))));
    public static final Block CRACKED_BRICK_SLAB = registerBlock("cracked_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_brick_slab")))));
    public static final Block CRACKED_BRICK_WALL = registerBlock("cracked_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_brick_wall")))));
    public static final Block MOSSY_BRICKS = registerBlock("mossy_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.BRICKS).strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_bricks")))));
    public static final Block MOSSY_BRICK_STAIRS = registerBlock("mossy_brick_stairs",
            properties -> new StairsBlock(Blocks.BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.BRICKS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_brick_stairs")))));
    public static final Block MOSSY_BRICK_SLAB = registerBlock("mossy_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_brick_slab")))));
    public static final Block MOSSY_BRICK_WALL = registerBlock("mossy_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_brick_wall")))));
    public static final Block CHISELED_BRICKS = registerBlock("chiseled_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.BRICKS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "chiseled_bricks")))));

    //Mud Brick Blocks
    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            properties -> new StairsBlock(Blocks.MUD_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.MUD_BRICKS).strength(1.0F, 3.0F).sounds(BlockSoundGroup.PACKED_MUD)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "packed_mud_stairs")))));
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.MUD_BRICKS)
                    .strength(1.0F, 3.0F).sounds(BlockSoundGroup.PACKED_MUD)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "packed_mud_slab")))));
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.MUD_BRICKS)
                    .strength(1.0F, 3.0F).sounds(BlockSoundGroup.PACKED_MUD)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "packed_mud_wall")))));
    public static final Block CRACKED_MUD_BRICKS = registerBlock("cracked_mud_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                    .sounds(BlockSoundGroup.MUD_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_mud_bricks")))));
    public static final Block CRACKED_MUD_BRICK_STAIRS = registerBlock("cracked_mud_brick_stairs",
            properties -> new StairsBlock(Blocks.MUD_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_mud_brick_stairs")))));
    public static final Block CRACKED_MUD_BRICK_SLAB = registerBlock("cracked_mud_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.MUD_BRICKS)
                    .strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_mud_brick_slab")))));
    public static final Block CRACKED_MUD_BRICK_WALL = registerBlock("cracked_mud_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.MUD_BRICKS)
                    .strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_mud_brick_wall")))));
    public static final Block MOSSY_MUD_BRICKS = registerBlock("mossy_mud_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                    .sounds(BlockSoundGroup.MUD_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_mud_bricks")))));
    public static final Block MOSSY_MUD_BRICK_STAIRS = registerBlock("mossy_mud_brick_stairs",
            properties -> new StairsBlock(Blocks.MUD_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                            .sounds(BlockSoundGroup.MUD_BRICKS)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_mud_brick_stairs")))));
    public static final Block MOSSY_MUD_BRICK_SLAB = registerBlock("mossy_mud_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.MUD_BRICKS)
                    .strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_mud_brick_slab")))));
    public static final Block MOSSY_MUD_BRICK_WALL = registerBlock("mossy_mud_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.MUD_BRICKS)
                    .strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_mud_brick_wall")))));
    public static final Block CHISELED_MUD_BRICKS = registerBlock("chiseled_mud_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "chiseled_mud_bricks")))));
    public static final Block MUD_BRICK_PILLAR = registerBlock("mud_brick_pillar",
            properties -> new PillarBlock(Block.Settings.copy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mud_brick_pillar")))));

    //Resin Blocks
    public static final Block CRACKED_RESIN_BRICKS = registerBlock("cracked_resin_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.RESIN_BRICKS).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.RESIN_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_resin_bricks")))));
    public static final Block CRACKED_RESIN_BRICK_STAIRS = registerBlock("cracked_resin_brick_stairs",
            properties -> new StairsBlock(Blocks.RESIN_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.RESIN_BRICKS).strength(1.5F, 6.0F).sounds(BlockSoundGroup.RESIN_BRICKS)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_resin_brick_stairs")))));
    public static final Block CRACKED_RESIN_BRICK_SLAB = registerBlock("cracked_resin_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.RESIN_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.RESIN_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_resin_brick_slab")))));
    public static final Block CRACKED_RESIN_BRICK_WALL = registerBlock("cracked_resin_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.RESIN_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.RESIN_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_resin_brick_wall")))));
    public static final Block MOSSY_RESIN_BRICKS = registerBlock("mossy_resin_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.RESIN_BRICKS).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.RESIN_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_resin_bricks")))));
    public static final Block MOSSY_RESIN_BRICK_STAIRS = registerBlock("mossy_resin_brick_stairs",
            properties -> new StairsBlock(Blocks.RESIN_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.RESIN_BRICKS).strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.RESIN_BRICKS)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_resin_brick_stairs")))));
    public static final Block MOSSY_RESIN_BRICK_SLAB = registerBlock("mossy_resin_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.RESIN_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.RESIN_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_resin_brick_slab")))));
    public static final Block MOSSY_RESIN_BRICK_WALL = registerBlock("mossy_resin_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.RESIN_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.RESIN_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_resin_brick_wall")))));

    //Endstone Blocks
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            properties -> new StairsBlock(Blocks.END_STONE.getDefaultState(),
                    Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F)
                            .sounds(BlockSoundGroup.STONE)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "end_stone_stairs")))));
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "end_stone_slab")))));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "end_stone_wall")))));
    public static final Block POLISHED_END_STONE = registerBlock("polished_end_stone",
            properties -> new Block(Block.Settings.copy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_end_stone")))));
    public static final Block POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            properties -> new StairsBlock(Blocks.END_STONE.getDefaultState(),
                    Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_end_stone_stairs")))));
    public static final Block POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_end_stone_slab")))));
    public static final Block POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_end_stone_wall")))));
    public static final Block CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_end_stone_bricks")))));
    public static final Block CRACKED_END_STONE_BRICK_STAIRS = registerBlock("cracked_end_stone_brick_stairs",
            properties -> new StairsBlock(Blocks.END_STONE.getDefaultState(),
                    Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_end_stone_brick_stairs")))));
    public static final Block CRACKED_END_STONE_BRICK_SLAB = registerBlock("cracked_end_stone_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_end_stone_brick_slab")))));
    public static final Block CRACKED_END_STONE_BRICK_WALL = registerBlock("cracked_end_stone_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_end_stone_brick_wall")))));
    public static final Block MOSSY_END_STONE_BRICKS = registerBlock("mossy_end_stone_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_end_stone_bricks")))));
    public static final Block MOSSY_END_STONE_BRICK_STAIRS = registerBlock("mossy_end_stone_brick_stairs",
            properties -> new StairsBlock(Blocks.END_STONE.getDefaultState(),
                    Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_end_stone_brick_stairs")))));
    public static final Block MOSSY_END_STONE_BRICK_SLAB = registerBlock("mossy_end_stone_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_end_stone_brick_slab")))));
    public static final Block MOSSY_END_STONE_BRICK_WALL = registerBlock("mossy_end_stone_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_end_stone_brick_wall")))));
    public static final Block CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.END_STONE).strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "chiseled_end_stone_bricks")))));
    public static final Block END_STONE_BRICK_PILLAR = registerBlock("end_stone_brick_pillar",
            properties -> new PillarBlock(Block.Settings.copy(Blocks.END_STONE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "end_stone_brick_pillar")))));

    //Stone Blocks
    public static final Block STONE_WALL = registerBlock("stone_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.STONE)
                    .strength(2.0F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "stone_wall")))));
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            properties -> new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),
                    Block.Settings.copy(Blocks.SMOOTH_STONE).strength(2.0F, 6.0F)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_stone_stairs")))));
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.SMOOTH_STONE)
                    .strength(2.0F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_stone_wall")))));
    public static final Block CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
            properties -> new StairsBlock(Blocks.STONE_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.STONE_BRICKS).strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_stone_brick_stairs")))));
    public static final Block CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_stone_brick_slab")))));
    public static final Block CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_stone_brick_wall")))));
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            properties -> new Block(Block.Settings.copy(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.STONE).strength(1.5F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "stone_tiles")))));
    public static final Block STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            properties -> new StairsBlock(Blocks.STONE_BRICKS.getDefaultState(),Block.Settings.copy(Blocks.STONE_BRICKS)
                    .sounds(BlockSoundGroup.STONE).strength(1.5F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "stone_tile_stairs")))));
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "stone_tile_slab")))));
    public static final Block STONE_TILE_WALL = registerBlock("stone_tile_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "stone_tile_wall")))));
    public static final Block CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            properties -> new Block(Block.Settings.copy(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.STONE).strength(1.5F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_stone_tiles")))));
    public static final Block CRACKED_STONE_TILE_STAIRS = registerBlock("cracked_stone_tile_stairs",
            properties -> new StairsBlock(Blocks.STONE_BRICKS.getDefaultState(),Block.Settings.copy(Blocks.STONE_BRICKS)
                    .sounds(BlockSoundGroup.STONE).strength(1.5F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_stone_tile_stairs")))));
    public static final Block CRACKED_STONE_TILE_SLAB = registerBlock("cracked_stone_tile_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_stone_tile_slab")))));
    public static final Block CRACKED_STONE_TILE_WALL = registerBlock("cracked_stone_tile_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_stone_tile_wall")))));
    public static final Block MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            properties -> new Block(Block.Settings.copy(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.STONE).strength(1.5F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_stone_tiles")))));
    public static final Block MOSSY_STONE_TILE_STAIRS = registerBlock("mossy_stone_tile_stairs",
            properties -> new StairsBlock(Blocks.STONE_BRICKS.getDefaultState(),Block.Settings.copy(Blocks.STONE_BRICKS)
                    .sounds(BlockSoundGroup.STONE).strength(1.5F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_stone_tile_stairs")))));
    public static final Block MOSSY_STONE_TILE_SLAB = registerBlock("mossy_stone_tile_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_stone_tile_slab")))));
    public static final Block MOSSY_STONE_TILE_WALL = registerBlock("mossy_stone_tile_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_stone_tile_wall")))));
    public static final Block STONE_BRICK_PILLAR = registerBlock("stone_brick_pillar",
            properties -> new PillarBlock(Block.Settings.copy(Blocks.STONE).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "stone_brick_pillar")))));

    //Deepslate Blocks
    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            properties -> new StairsBlock(Blocks.DEEPSLATE.getDefaultState(),
                    Block.Settings.copy(Blocks.DEEPSLATE).strength(3.0F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "deepslate_stairs")))));
    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.DEEPSLATE)
                    .strength(3.0F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "deepslate_slab")))));
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.DEEPSLATE)
                    .strength(3.0F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "deepslate_wall")))));
    public static final Block MOSSY_COBBLED_DEEPSLATE = registerBlock("mossy_cobbled_deepslate",
            properties -> new Block(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE).strength(3.5f, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_cobbled_deepslate")))));
    public static final Block MOSSY_COBBLED_DEEPSLATE_STAIRS = registerBlock("mossy_cobbled_deepslate_stairs",
            properties -> new StairsBlock(ModBlocks.MOSSY_COBBLED_DEEPSLATE.getDefaultState(),Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)
                    .sounds(BlockSoundGroup.DEEPSLATE).strength(3.5f, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_cobbled_deepslate_stairs")))));
    public static final Block MOSSY_COBBLED_DEEPSLATE_SLAB = registerBlock("mossy_cobbled_deepslate_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_cobbled_deepslate_slab")))));
    public static final Block MOSSY_COBBLED_DEEPSLATE_WALL = registerBlock("mossy_cobbled_deepslate_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_cobbled_deepslate_wall")))));
    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs",
            properties -> new StairsBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).strength(3.5F, 6.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_deepslate_brick_stairs")))));
    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)
                    .strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_deepslate_brick_slab")))));
    public static final Block CRACKED_DEEPSLATE_BRICK_WALL = registerBlock("cracked_deepslate_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)
                    .strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_deepslate_brick_wall")))));
    public static final Block MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.DEEPSLATE_BRICKS).strength(3.5f, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_deepslate_bricks")))));
    public static final Block MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            properties -> new StairsBlock(ModBlocks.MOSSY_DEEPSLATE_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.DEEPSLATE_BRICKS).strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_deepslate_brick_stairs")))));
    public static final Block MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_deepslate_brick_slab")))));
    public static final Block MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_deepslate_brick_wall")))));
    public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs",
            properties -> new StairsBlock(Blocks.CRACKED_DEEPSLATE_TILES.getDefaultState(),
                    Block.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES).strength(3.5F, 6.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE_TILES)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_deepslate_tile_stairs")))));
    public static final Block CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES)
                    .strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_deepslate_tile_slab")))));
    public static final Block CRACKED_DEEPSLATE_TILE_WALL = registerBlock("cracked_deepslate_tile_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES)
                    .strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_deepslate_tile_wall")))));
    public static final Block MOSSY_DEEPSLATE_TILES = registerBlock("mossy_deepslate_tiles",
            properties -> new Block(Block.Settings.copy(Blocks.DEEPSLATE_TILES).strength(3.5f, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_deepslate_tiles")))));
    public static final Block MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock("mossy_deepslate_tile_stairs",
            properties -> new StairsBlock(ModBlocks.MOSSY_DEEPSLATE_TILES.getDefaultState(),
                    Block.Settings.copy(Blocks.DEEPSLATE_TILES).strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_deepslate_tile_stairs")))));
    public static final Block MOSSY_DEEPSLATE_TILE_SLAB = registerBlock("mossy_deepslate_tile_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_deepslate_tile_slab")))));
    public static final Block MOSSY_DEEPSLATE_TILE_WALL = registerBlock("mossy_deepslate_tile_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_deepslate_tile_wall")))));
    public static final Block DEEPSLATE_BRICK_PILLAR = registerBlock("deepslate_brick_pillar",
            properties -> new PillarBlock(Block.Settings.copy(Blocks.DEEPSLATE).strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "deepslate_brick_pillar")))));
    public static final Block SCULK_INLAID_DEEPSLATE = registerBlock("sculk_inlaid_deepslate",
            properties -> new SculkInlaidDeepslateBlock(Block.Settings.copy(Blocks.CHISELED_DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "sculk_inlaid_deepslate")))));
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            properties -> new PressurePlateBlock(ModBlockSetType.POLISHED_DEEPSLATE,
                    Block.Settings.copy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE).sounds(BlockSoundGroup.POLISHED_DEEPSLATE).pistonBehavior(PistonBehavior.DESTROY)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_deepslate_pressure_plate")))));
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            properties -> new ButtonBlock(ModBlockSetType.POLISHED_DEEPSLATE, 20, AbstractBlock.Settings.create()
                    .noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "polished_deepslate_button")))));

    //Blackstone Bricks
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs",
            properties -> new StairsBlock(Blocks.POLISHED_BLACKSTONE.getDefaultState(),
                    Block.Settings.copy(Blocks.POLISHED_BLACKSTONE).strength(1.5F, 6.0F)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_polished_blackstone_brick_stairs")))));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.POLISHED_BLACKSTONE).strength(1.5F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_polished_blackstone_brick_slab")))));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.POLISHED_BLACKSTONE).strength(1.5F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_polished_blackstone_brick_wall")))));
    public static final Block BLACKSTONE_TILES = registerBlock("blackstone_tiles",
            properties -> new Block(Block.Settings.copy(Blocks.POLISHED_BLACKSTONE).sounds(BlockSoundGroup.STONE).strength(1.5F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blackstone_tiles")))));
    public static final Block BLACKSTONE_TILE_STAIRS = registerBlock("blackstone_tile_stairs",
            properties -> new StairsBlock(Blocks.POLISHED_BLACKSTONE.getDefaultState(),Block.Settings.copy(Blocks.POLISHED_BLACKSTONE)
                    .sounds(BlockSoundGroup.STONE).strength(1.5F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blackstone_tile_stairs")))));
    public static final Block BLACKSTONE_TILE_SLAB = registerBlock("blackstone_tile_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.POLISHED_BLACKSTONE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blackstone_tile_slab")))));
    public static final Block BLACKSTONE_TILE_WALL = registerBlock("blackstone_tile_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.POLISHED_BLACKSTONE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blackstone_tile_wall")))));
    public static final Block CRACKED_BLACKSTONE_TILES = registerBlock("cracked_blackstone_tiles",
            properties -> new Block(Block.Settings.copy(Blocks.POLISHED_BLACKSTONE).sounds(BlockSoundGroup.STONE).strength(1.5F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_blackstone_tiles")))));
    public static final Block CRACKED_BLACKSTONE_TILE_STAIRS = registerBlock("cracked_blackstone_tile_stairs",
            properties -> new StairsBlock(Blocks.POLISHED_BLACKSTONE.getDefaultState(),Block.Settings.copy(Blocks.POLISHED_BLACKSTONE)
                    .sounds(BlockSoundGroup.STONE).strength(1.5F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_blackstone_tile_stairs")))));
    public static final Block CRACKED_BLACKSTONE_TILE_SLAB = registerBlock("cracked_blackstone_tile_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.POLISHED_BLACKSTONE)
                    .strength(1.5F,6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_blackstone_tile_slab")))));
    public static final Block CRACKED_BLACKSTONE_TILE_WALL = registerBlock("cracked_blackstone_tile_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.POLISHED_BLACKSTONE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_blackstone_tile_wall")))));
    public static final Block BLACKSTONE_BRICK_PILLAR = registerBlock("blackstone_brick_pillar",
            properties -> new PillarBlock(Block.Settings.copy(Blocks.POLISHED_BLACKSTONE).strength(1.5f, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blackstone_brick_pillar")))));

    //Netherrack
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            properties -> new StairsBlock(Blocks.NETHERRACK.getDefaultState(),
                    Block.Settings.copy(Blocks.NETHERRACK).strength(0.4F)
                            .sounds(BlockSoundGroup.NETHERRACK)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "netherrack_stairs")))));
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.NETHERRACK)
                    .strength(0.4F).sounds(BlockSoundGroup.NETHERRACK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "netherrack_slab")))));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.NETHERRACK)
                    .strength(0.4F).sounds(BlockSoundGroup.NETHERRACK)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "netherrack_wall")))));

    //Nether Bricks
    public static final Block NETHER_BRICK_FENCEGATE = registerBlock("nether_brick_fencegate",
            properties -> new FenceGateBlock(ModWoodTypes.NETHER_BRICKS, Block.Settings.copy(Blocks.NETHER_BRICKS)
                    .solid().strength(2.0F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "nether_brick_fencegate")))));

    public static final Block CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs",
            properties -> new StairsBlock(Blocks.NETHER_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_nether_brick_stairs")))));
    public static final Block CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_nether_brick_slab")))));
    public static final Block CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_nether_brick_wall")))));
    public static final Block CRACKED_NETHER_BRICK_FENCE = registerBlock("cracked_nether_brick_fence",
            properties -> new FenceBlock(Block.Settings.copy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_nether_brick_fence")))));
    public static final Block CRACKED_NETHER_BRICK_FENCEGATE = registerBlock("cracked_nether_brick_fencegate",
            properties -> new FenceGateBlock(ModWoodTypes.NETHER_BRICKS, Block.Settings.copy(Blocks.NETHER_BRICKS)
                    .solid().strength(2.0F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_nether_brick_fencegate")))));
    public static final Block NETHER_BRICK_PILLAR = registerBlock("nether_brick_pillar",
            properties -> new PillarBlock(Block.Settings.copy(Blocks.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "nether_brick_pillar")))));

    //Red Nether Bricks
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            properties -> new FenceBlock(Block.Settings.copy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_nether_brick_fence")))));
    public static final Block RED_NETHER_BRICK_FENCEGATE = registerBlock("red_nether_brick_fencegate",
            properties -> new FenceGateBlock(ModWoodTypes.NETHER_BRICKS, Block.Settings.copy(Blocks.NETHER_BRICKS)
                    .solid().strength(2.0F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_nether_brick_fencegate")))));
    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.RED_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_red_nether_bricks")))));
    public static final Block CRACKED_RED_NETHER_BRICK_STAIRS = registerBlock("cracked_red_nether_brick_stairs",
            properties -> new StairsBlock(Blocks.RED_NETHER_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.RED_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_red_nether_brick_stairs")))));
    public static final Block CRACKED_RED_NETHER_BRICK_SLAB = registerBlock("cracked_red_nether_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.RED_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_red_nether_brick_slab")))));
    public static final Block CRACKED_RED_NETHER_BRICK_WALL = registerBlock("cracked_red_nether_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.RED_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_red_nether_brick_wall")))));
    public static final Block CRACKED_RED_NETHER_BRICK_FENCE = registerBlock("cracked_red_nether_brick_fence",
            properties -> new FenceBlock(Block.Settings.copy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_red_nether_brick_fence")))));
    public static final Block CRACKED_RED_NETHER_BRICK_FENCEGATE = registerBlock("cracked_red_nether_brick_fencegate",
            properties -> new FenceGateBlock(ModWoodTypes.NETHER_BRICKS, Block.Settings.copy(Blocks.NETHER_BRICKS)
                    .solid().strength(2.0F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_red_nether_brick_fencegate")))));
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.RED_NETHER_BRICKS).strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "chiseled_red_nether_bricks")))));

    //Blue Nether Bricks
    public static final Block BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_nether_bricks")))));
    public static final Block BLUE_NETHER_BRICK_STAIRS = registerBlock("blue_nether_brick_stairs",
            properties -> new StairsBlock(ModBlocks.BLUE_NETHER_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.RED_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_nether_brick_stairs")))));
    public static final Block BLUE_NETHER_BRICK_SLAB = registerBlock("blue_nether_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(ModBlocks.BLUE_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_nether_brick_slab")))));
    public static final Block BLUE_NETHER_BRICK_WALL = registerBlock("blue_nether_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(ModBlocks.BLUE_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_nether_brick_wall")))));
    public static final Block BLUE_NETHER_BRICK_FENCE = registerBlock("blue_nether_brick_fence",
            properties -> new FenceBlock(Block.Settings.copy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_nether_brick_fence")))));
    public static final Block BLUE_NETHER_BRICK_FENCEGATE = registerBlock("blue_nether_brick_fencegate",
            properties -> new FenceGateBlock(ModWoodTypes.NETHER_BRICKS, Block.Settings.copy(Blocks.NETHER_BRICKS)
                    .solid().strength(2.0F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_nether_brick_fencegate")))));
    public static final Block CRACKED_BLUE_NETHER_BRICKS = registerBlock("cracked_blue_nether_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_blue_nether_bricks")))));
    public static final Block CRACKED_BLUE_NETHER_BRICK_STAIRS = registerBlock("cracked_blue_nether_brick_stairs",
            properties -> new StairsBlock(ModBlocks.BLUE_NETHER_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.RED_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_blue_nether_brick_stairs")))));
    public static final Block CRACKED_BLUE_NETHER_BRICK_SLAB = registerBlock("cracked_blue_nether_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(ModBlocks.BLUE_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_blue_nether_brick_slab")))));
    public static final Block CRACKED_BLUE_NETHER_BRICK_WALL = registerBlock("cracked_blue_nether_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(ModBlocks.BLUE_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_blue_nether_brick_wall")))));
    public static final Block CRACKED_BLUE_NETHER_BRICK_FENCE = registerBlock("cracked_blue_nether_brick_fence",
            properties -> new FenceBlock(Block.Settings.copy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_blue_nether_brick_fence")))));
    public static final Block CRACKED_BLUE_NETHER_BRICK_FENCEGATE = registerBlock("cracked_blue_nether_brick_fencegate",
            properties -> new FenceGateBlock(ModWoodTypes.NETHER_BRICKS, Block.Settings.copy(Blocks.NETHER_BRICKS)
                    .solid().strength(2.0F, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_blue_nether_brick_fencegate")))));
    public static final Block CHISELED_BLUE_NETHER_BRICKS = registerBlock("chiseled_blue_nether_bricks",
            properties -> new Block(Block.Settings.copy(ModBlocks.BLUE_NETHER_BRICKS).strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "chiseled_blue_nether_bricks")))));

    //Prismarine Blocks
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "prismarine_brick_wall")))));
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "dark_prismarine_wall")))));
    public static final Block CRACKED_PRISMARINE_BRICKS = registerBlock("cracked_prismarine_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.PRISMARINE_BRICKS).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_prismarine_bricks")))));
    public static final Block CRACKED_PRISMARINE_BRICK_STAIRS = registerBlock("cracked_prismarine_brick_stairs",
            properties -> new StairsBlock(Blocks.PRISMARINE_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_prismarine_brick_stairs")))));
    public static final Block CRACKED_PRISMARINE_BRICK_SLAB = registerBlock("cracked_prismarine_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_prismarine_brick_slab")))));
    public static final Block CRACKED_PRISMARINE_BRICK_WALL = registerBlock("cracked_prismarine_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_prismarine_brick_wall")))));
    public static final Block MOSSY_PRISMARINE_BRICKS = registerBlock("mossy_prismarine_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.PRISMARINE_BRICKS).strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_prismarine_bricks")))));
    public static final Block MOSSY_PRISMARINE_BRICK_STAIRS = registerBlock("mossy_prismarine_brick_stairs",
            properties -> new StairsBlock(Blocks.PRISMARINE_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_prismarine_brick_stairs")))));
    public static final Block MOSSY_PRISMARINE_BRICK_SLAB = registerBlock("mossy_prismarine_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_prismarine_brick_slab")))));
    public static final Block MOSSY_PRISMARINE_BRICK_WALL = registerBlock("mossy_prismarine_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_prismarine_brick_wall")))));
    public static final Block CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "chiseled_prismarine_bricks")))));
    public static final Block PRISMARINE_BRICK_PILLAR = registerBlock("prismarine_brick_pillar",
            properties -> new PillarBlock(Block.Settings.copy(Blocks.PRISMARINE_BRICKS).strength(1.5f, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "prismarine_brick_pillar")))));

    //Smooth Basalt
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            properties -> new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), Block.Settings.copy(Blocks.SMOOTH_BASALT)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.BASALT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_basalt_stairs")))));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.SMOOTH_BASALT)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.BASALT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_basalt_slab")))));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.SMOOTH_BASALT)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.BASALT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_basalt_wall")))));

    //Sandstone Blocks
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.SMOOTH_SANDSTONE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_sandstone_wall")))));
    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            properties -> new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.CUT_SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cut_sandstone_stairs")))));
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.CUT_SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cut_sandstone_wall")))));
    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.SANDSTONE).strength(0.8F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "sandstone_bricks")))));
    public static final Block SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            properties -> new StairsBlock(Blocks.SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "sandstone_brick_stairs")))));
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "sandstone_brick_slab")))));
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "sandstone_brick_wall")))));
    public static final Block CRACKED_SANDSTONE_BRICKS = registerBlock("cracked_sandstone_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.SANDSTONE).strength(0.8F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_sandstone_bricks")))));
    public static final Block CRACKED_SANDSTONE_BRICK_STAIRS = registerBlock("cracked_sandstone_brick_stairs",
            properties -> new StairsBlock(Blocks.SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_sandstone_brick_stairs")))));
    public static final Block CRACKED_SANDSTONE_BRICK_SLAB = registerBlock("cracked_sandstone_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_sandstone_brick_slab")))));
    public static final Block CRACKED_SANDSTONE_BRICK_WALL = registerBlock("cracked_sandstone_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_sandstone_brick_wall")))));
    public static final Block MOSSY_SANDSTONE_BRICKS = registerBlock("mossy_sandstone_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.SANDSTONE).strength(0.8F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_sandstone_bricks")))));
    public static final Block MOSSY_SANDSTONE_BRICK_STAIRS = registerBlock("mossy_sandstone_brick_stairs",
            properties -> new StairsBlock(Blocks.SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_sandstone_brick_stairs")))));
    public static final Block MOSSY_SANDSTONE_BRICK_SLAB = registerBlock("mossy_sandstone_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_sandstone_brick_slab")))));
    public static final Block MOSSY_SANDSTONE_BRICK_WALL = registerBlock("mossy_sandstone_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_sandstone_brick_wall")))));
    public static final Block SANDSTONE_BRICK_PILLAR = registerBlock("sandstone_brick_pillar",
            properties -> new PillarBlock(Block.Settings.copy(Blocks.RED_SANDSTONE).strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "sandstone_brick_pillar")))));

    //Red Sandstone Blocks
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "smooth_red_sandstone_wall")))));
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            properties -> new StairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.CUT_RED_SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cut_red_sandstone_stairs")))));
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.CUT_RED_SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cut_red_sandstone_wall")))));
    public static final Block RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.RED_SANDSTONE).strength(0.8F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_sandstone_bricks")))));
    public static final Block RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs",
            properties -> new StairsBlock(Blocks.RED_SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_sandstone_brick_stairs")))));
    public static final Block RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_sandstone_brick_slab")))));
    public static final Block RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_sandstone_brick_wall")))));
    public static final Block CRACKED_RED_SANDSTONE_BRICKS = registerBlock("cracked_red_sandstone_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.RED_SANDSTONE).strength(0.8F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_red_sandstone_bricks")))));
    public static final Block CRACKED_RED_SANDSTONE_BRICK_STAIRS = registerBlock("cracked_red_sandstone_brick_stairs",
            properties -> new StairsBlock(Blocks.RED_SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_red_sandstone_brick_stairs")))));
    public static final Block CRACKED_RED_SANDSTONE_BRICK_SLAB = registerBlock("cracked_red_sandstone_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_red_sandstone_brick_slab")))));
    public static final Block CRACKED_RED_SANDSTONE_BRICK_WALL = registerBlock("cracked_red_sandstone_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cracked_red_sandstone_brick_wall")))));
    public static final Block MOSSY_RED_SANDSTONE_BRICKS = registerBlock("mossy_red_sandstone_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.RED_SANDSTONE).strength(0.8F)
                    .sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_red_sandstone_bricks")))));
    public static final Block MOSSY_RED_SANDSTONE_BRICK_STAIRS = registerBlock("mossy_red_sandstone_brick_stairs",
            properties -> new StairsBlock(Blocks.RED_SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_red_sandstone_brick_stairs")))));
    public static final Block MOSSY_RED_SANDSTONE_BRICK_SLAB = registerBlock("mossy_red_sandstone_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_red_sandstone_brick_slab")))));
    public static final Block MOSSY_RED_SANDSTONE_BRICK_WALL = registerBlock("mossy_red_sandstone_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_red_sandstone_brick_wall")))));
    public static final Block RED_SANDSTONE_BRICK_PILLAR = registerBlock("red_sandstone_brick_pillar",
            properties -> new PillarBlock(Block.Settings.copy(Blocks.RED_SANDSTONE).strength(0.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_sandstone_brick_pillar")))));

    //Purpur Blocks
    public static final Block PURPUR_WALL = registerBlock("purpur_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.PURPUR_BLOCK)
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "purpur_wall")))));
    public static final Block CHISELED_PURPUR = registerBlock("chiseled_purpur",
            properties -> new Block(Block.Settings.copy(Blocks.PURPUR_BLOCK).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "chiseled_purpur")))));

    //Snow Blocks
    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            properties -> new Block(Block.Settings.copy(Blocks.SNOW_BLOCK).strength(0.2F).sounds(BlockSoundGroup.SNOW)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "snow_bricks")))));
    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            properties -> new StairsBlock(Blocks.SNOW_BLOCK.getDefaultState(), Block.Settings.copy(Blocks.SNOW_BLOCK)
                    .strength(0.2F).sounds(BlockSoundGroup.SNOW)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "snow_brick_stairs")))));
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.SNOW_BLOCK).strength(0.2F).sounds(BlockSoundGroup.SNOW)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "snow_brick_slab")))));
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.SNOW_BLOCK).strength(0.2F).sounds(BlockSoundGroup.SNOW)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "snow_brick_wall")))));

    //Tinted Glass Pane
    public static final Block TINTED_GLASS_PANE = registerBlock("tinted_glass_pane",
            properties -> new TintedGlassPaneBlock(Block.Settings.copyShallow(Blocks.GLASS_PANE).strength(0.3F).sounds(BlockSoundGroup.GLASS)
                    .nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "tinted_glass_pane")))));

    //Terracotta Variants
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            properties -> new StairsBlock(Blocks.TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "terracotta_stairs")))));
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "terracotta_slab")))));
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "terracotta_wall")))));
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            properties -> new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.WHITE_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "white_terracotta_stairs")))));
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.WHITE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "white_terracotta_slab")))));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.WHITE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "white_terracotta_wall")))));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            properties -> new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_gray_terracotta_stairs")))));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_gray_terracotta_slab")))));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_gray_terracotta_wall")))));
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            properties -> new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.GRAY_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gray_terracotta_stairs")))));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.GRAY_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gray_terracotta_slab")))));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.GRAY_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gray_terracotta_wall")))));
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            properties -> new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.BLACK_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "black_terracotta_stairs")))));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.BLACK_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "black_terracotta_slab")))));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.BLACK_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "black_terracotta_wall")))));
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            properties -> new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.BROWN_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "brown_terracotta_stairs")))));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.BROWN_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "brown_terracotta_slab")))));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.BROWN_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "brown_terracotta_wall")))));
    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            properties -> new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.RED_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_terracotta_stairs")))));
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.RED_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_terracotta_slab")))));
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.RED_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_terracotta_wall")))));
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            properties -> new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.ORANGE_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "orange_terracotta_stairs")))));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.ORANGE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "orange_terracotta_slab")))));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.ORANGE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "orange_terracotta_wall")))));
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            properties -> new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.YELLOW_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "yellow_terracotta_stairs")))));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.YELLOW_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "yellow_terracotta_slab")))));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.YELLOW_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "yellow_terracotta_wall")))));
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            properties -> new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.LIME_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "lime_terracotta_stairs")))));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.LIME_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "lime_terracotta_slab")))));
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.LIME_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "lime_terracotta_wall")))));
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            properties -> new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.GREEN_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "green_terracotta_stairs")))));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.GREEN_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "green_terracotta_slab")))));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.GREEN_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "green_terracotta_wall")))));
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            properties -> new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.CYAN_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cyan_terracotta_stairs")))));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.CYAN_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cyan_terracotta_slab")))));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.CYAN_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cyan_terracotta_wall")))));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            properties -> new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_blue_terracotta_stairs")))));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_blue_terracotta_slab")))));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_blue_terracotta_wall")))));
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            properties -> new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.BLUE_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_terracotta_stairs")))));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.BLUE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_terracotta_slab")))));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.BLUE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_terracotta_wall")))));
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            properties -> new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.PURPLE_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "purple_terracotta_stairs")))));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.PURPLE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "purple_terracotta_slab")))));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.PURPLE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "purple_terracotta_wall")))));
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            properties -> new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.MAGENTA_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "magenta_terracotta_stairs")))));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.MAGENTA_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "magenta_terracotta_slab")))));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.MAGENTA_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "magenta_terracotta_wall")))));
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            properties -> new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(),Block.Settings.copy(Blocks.PINK_TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE).strength(1.25F, 4.2F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "pink_terracotta_stairs")))));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.PINK_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "pink_terracotta_slab")))));
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.PINK_TERRACOTTA)
                    .strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "pink_terracotta_wall")))));


    //Concrete Variants
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            properties -> new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.WHITE_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "white_concrete_stairs")))));
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.WHITE_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "white_concrete_slab")))));
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.WHITE_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "white_concrete_wall")))));
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            properties -> new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_gray_concrete_stairs")))));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_gray_concrete_slab")))));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_gray_concrete_wall")))));
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            properties -> new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.GRAY_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gray_concrete_stairs")))));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.GRAY_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gray_concrete_slab")))));
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.GRAY_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "gray_concrete_wall")))));
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            properties -> new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.BLACK_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "black_concrete_stairs")))));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.BLACK_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "black_concrete_slab")))));
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.BLACK_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "black_concrete_wall")))));
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            properties -> new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.BROWN_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "brown_concrete_stairs")))));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.BROWN_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "brown_concrete_slab")))));
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.BROWN_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "brown_concrete_wall")))));
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            properties -> new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.RED_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_concrete_stairs")))));
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.RED_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_concrete_slab")))));
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.RED_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "red_concrete_wall")))));
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            properties -> new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.ORANGE_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "orange_concrete_stairs")))));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.ORANGE_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "orange_concrete_slab")))));
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.ORANGE_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "orange_concrete_wall")))));
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            properties -> new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.YELLOW_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "yellow_concrete_stairs")))));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.YELLOW_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "yellow_concrete_slab")))));
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.YELLOW_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "yellow_concrete_wall")))));
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            properties -> new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.LIME_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "lime_concrete_stairs")))));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.LIME_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "lime_concrete_slab")))));
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.LIME_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "lime_concrete_wall")))));
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            properties -> new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.GREEN_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "green_concrete_stairs")))));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.GREEN_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "green_concrete_slab")))));
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.GREEN_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "green_concrete_wall")))));
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            properties -> new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.CYAN_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cyan_concrete_stairs")))));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.CYAN_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cyan_concrete_slab")))));
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.CYAN_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "cyan_concrete_wall")))));
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            properties -> new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_blue_concrete_stairs")))));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_blue_concrete_slab")))));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "light_blue_concrete_wall")))));
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            properties -> new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.BLUE_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_concrete_stairs")))));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.BLUE_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_concrete_slab")))));
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.BLUE_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "blue_concrete_wall")))));
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            properties -> new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.PURPLE_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "purple_concrete_stairs")))));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.PURPLE_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "purple_concrete_slab")))));
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.PURPLE_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "purple_concrete_wall")))));
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            properties -> new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.MAGENTA_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "magenta_concrete_stairs")))));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.MAGENTA_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "magenta_concrete_slab")))));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.MAGENTA_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "magenta_concrete_wall")))));
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            properties -> new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(),Block.Settings.copy(Blocks.PINK_CONCRETE)
                    .sounds(BlockSoundGroup.STONE).strength(1.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "pink_concrete_stairs")))));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            properties -> new SlabBlock(Block.Settings.copy(Blocks.PINK_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "pink_concrete_slab")))));
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            properties -> new WallBlock(Block.Settings.copy(Blocks.PINK_CONCRETE)
                    .strength(1.8F).sounds(BlockSoundGroup.STONE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "pink_concrete_wall")))));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), toRegister);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, name)))));
    }
    public static void registerModBlocks() {
        CinchsMissingBlocks.LOGGER.info("Registering ModBlocks for " + MOD_ID);
    }
}