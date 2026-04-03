package net.cinchtail.cinchsmissingblocks.block;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.cinchtail.cinchsmissingblocks.util.ModBlockSetType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CinchsMissingBlocks.MOD_ID);

    //Calcite Blocks
    public static final RegistryObject<Block> CALCITE_STAIRS = registerBlock("calcite_stairs",
            () -> new StairBlock(STONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(0.75F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_SLAB = registerBlock("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(0.75F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_WALL = registerBlock("calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(0.75F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> POLISHED_CALCITE = registerBlock("polished_calcite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1F, 1.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1F, 1.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_BRICKS = registerBlock("calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1F, 1.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1F, 1.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1F, 1.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_CALCITE_BRICK_STAIRS = registerBlock("cracked_calcite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1F, 1.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CRACKED_CALCITE_BRICK_SLAB = registerBlock("cracked_calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CRACKED_CALCITE_BRICK_WALL = registerBlock("cracked_calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> MOSSY_CALCITE_BRICKS = registerBlock("mossy_calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1F, 1.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_CALCITE_BRICK_STAIRS = registerBlock("mossy_calcite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1F, 1.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> MOSSY_CALCITE_BRICK_SLAB = registerBlock("mossy_calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> MOSSY_CALCITE_BRICK_WALL = registerBlock("mossy_calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CHISELED_CALCITE_BRICKS = registerBlock("chiseled_calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1F, 1.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALCITE_BRICK_PILLAR = registerBlock("calcite_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1F, 1.0F).sound(SoundType.CALCITE)));

    //Dripstone Blocks
    public static final RegistryObject<Block> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            () -> new StairBlock(DRIPSTONE_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                            .strength(1.5F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                    .strength(1.5F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_WALL = registerBlock("dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                    .strength(1.5F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 1.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CRACKED_DRIPSTONE_BRICKS = registerBlock("cracked_dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_DRIPSTONE_BRICK_STAIRS = registerBlock("cracked_dripstone_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CRACKED_DRIPSTONE_BRICK_SLAB = registerBlock("cracked_dripstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CRACKED_DRIPSTONE_BRICK_WALL = registerBlock("cracked_dripstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MOSSY_DRIPSTONE_BRICKS = registerBlock("mossy_dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_DRIPSTONE_BRICK_STAIRS = registerBlock("mossy_dripstone_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MOSSY_DRIPSTONE_BRICK_SLAB = registerBlock("mossy_dripstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MOSSY_DRIPSTONE_BRICK_WALL = registerBlock("mossy_dripstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CHISELED_DRIPSTONE_BRICKS = registerBlock("chiseled_dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 1.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DRIPSTONE_BRICK_PILLAR = registerBlock("dripstone_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK)));

    //Tuff Blocks
    public static final RegistryObject<Block> CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(TUFF_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.TUFF_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_TUFF_BRICK_STAIRS = registerBlock("cracked_tuff_brick_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_TUFF_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(TUFF_BRICKS).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS)));
    public static final RegistryObject<Block> CRACKED_TUFF_BRICK_SLAB = registerBlock("cracked_tuff_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(TUFF_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS)));
    public static final RegistryObject<Block> CRACKED_TUFF_BRICK_WALL = registerBlock("cracked_tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(TUFF_BRICKS).requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS)));
    public static final RegistryObject<Block> MOSSY_TUFF_BRICKS = registerBlock("mossy_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(TUFF_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.TUFF_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_TUFF_BRICK_STAIRS = registerBlock("mossy_tuff_brick_stairs",
            () -> new StairBlock(TUFF_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(TUFF_BRICKS).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.TUFF_BRICKS)));
    public static final RegistryObject<Block> MOSSY_TUFF_BRICK_SLAB = registerBlock("mossy_tuff_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(TUFF_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.TUFF_BRICKS)));
    public static final RegistryObject<Block> MOSSY_TUFF_BRICK_WALL = registerBlock("mossy_tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(TUFF_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.TUFF_BRICKS)));

    //Andesite Blocks
    public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_ANDESITE_BRICK_STAIRS = registerBlock("cracked_andesite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_ANDESITE_BRICK_SLAB = registerBlock("cracked_andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_ANDESITE_BRICK_WALL = registerBlock("cracked_andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_ANDESITE_BRICKS = registerBlock("mossy_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_ANDESITE_BRICK_STAIRS = registerBlock("mossy_andesite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_ANDESITE_BRICK_SLAB = registerBlock("mossy_andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_ANDESITE_BRICK_WALL = registerBlock("mossy_andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_ANDESITE_BRICKS = registerBlock("chiseled_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(STONE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ANDESITE_BRICK_PILLAR = registerBlock("andesite_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(STONE)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)));

    //Granite Blocks
    public static final RegistryObject<Block> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_GRANITE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRANITE_BRICKS = registerBlock("granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_GRANITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_GRANITE_BRICK_STAIRS = registerBlock("cracked_granite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_GRANITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_GRANITE_BRICK_SLAB = registerBlock("cracked_granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_GRANITE_BRICK_WALL = registerBlock("cracked_granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_GRANITE_BRICKS = registerBlock("mossy_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_GRANITE_BRICK_STAIRS = registerBlock("mossy_granite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_GRANITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_GRANITE_BRICK_SLAB = registerBlock("mossy_granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_GRANITE_BRICK_WALL = registerBlock("mossy_granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_GRANITE_BRICKS = registerBlock("chiseled_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(STONE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRANITE_BRICK_PILLAR = registerBlock("granite_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(STONE)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)));

    //Diorite Blocks
    public static final RegistryObject<Block> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIORITE_BRICKS = registerBlock("diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_DIORITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)));
    public static final RegistryObject<Block> CRACKED_DIORITE_BRICKS = registerBlock("cracked_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_DIORITE_BRICK_STAIRS = registerBlock("cracked_diorite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_DIORITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_DIORITE_BRICK_SLAB = registerBlock("cracked_diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_DIORITE_BRICK_WALL = registerBlock("cracked_diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_DIORITE_BRICKS = registerBlock("mossy_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_DIORITE_BRICK_STAIRS = registerBlock("mossy_diorite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_DIORITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_DIORITE_BRICK_SLAB = registerBlock("mossy_diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_DIORITE_BRICK_WALL = registerBlock("mossy_diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_DIORITE_BRICKS = registerBlock("chiseled_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(STONE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIORITE_BRICK_PILLAR = registerBlock("diorite_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(STONE)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)));

    //Quartz Blocks
    public static final RegistryObject<Block> QUARTZ_WALL = registerBlock("quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BLOCK)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_QUARTZ)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairBlock(QUARTZ_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(QUARTZ_BLOCK).strength(0.8F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BLOCK)
                    .strength(0.8F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BLOCK)
                    .strength(0.8F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_QUARTZ_BRICKS = registerBlock("cracked_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS).strength(0.8F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_QUARTZ_BRICK_STAIRS = registerBlock("cracked_quartz_brick_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_QUARTZ_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS).requiresCorrectToolForDrops()
                            .strength(0.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_QUARTZ_BRICK_SLAB = registerBlock("cracked_quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)
                    .requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_QUARTZ_BRICK_WALL = registerBlock("cracked_quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)
                    .requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_QUARTZ_BRICKS = registerBlock("mossy_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS).strength(0.8F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_QUARTZ_BRICK_STAIRS = registerBlock("mossy_quartz_brick_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_QUARTZ_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS).requiresCorrectToolForDrops()
                            .strength(0.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_QUARTZ_BRICK_SLAB = registerBlock("mossy_quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)
                    .requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_QUARTZ_BRICK_WALL = registerBlock("mossy_quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)
                    .requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    //Brick Blocks
    public static final RegistryObject<Block> CRACKED_BRICKS = registerBlock("cracked_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).strength(2.0F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_BRICK_STAIRS = registerBlock("cracked_brick_stairs",
            () -> new StairBlock(Blocks.BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_BRICK_SLAB = registerBlock("cracked_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_BRICK_WALL = registerBlock("cracked_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_BRICKS = registerBlock("mossy_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).strength(2.0F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_BRICK_STAIRS = registerBlock("mossy_brick_stairs",
            () -> new StairBlock(Blocks.BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_BRICK_SLAB = registerBlock("mossy_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_BRICK_WALL = registerBlock("mossy_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_BRICKS = registerBlock("chiseled_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(BRICKS).requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    //Mud Brick Blocks
    public static final RegistryObject<Block> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            () -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).requiresCorrectToolForDrops()
                            .strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)));
    public static final RegistryObject<Block> PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)
                    .requiresCorrectToolForDrops().strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)));
    public static final RegistryObject<Block> PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)
                    .requiresCorrectToolForDrops().strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)));
    public static final RegistryObject<Block> CRACKED_MUD_BRICKS = registerBlock("cracked_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                    .sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_MUD_BRICK_STAIRS = registerBlock("cracked_mud_brick_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_MUD_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).requiresCorrectToolForDrops()
                            .strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> CRACKED_MUD_BRICK_SLAB = registerBlock("cracked_mud_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> CRACKED_MUD_BRICK_WALL = registerBlock("cracked_mud_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> MOSSY_MUD_BRICKS = registerBlock("mossy_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS).strength(1.5F, 3.0F)
                    .sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_MUD_BRICK_STAIRS = registerBlock("mossy_mud_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_MUD_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS).strength(1.5F, 3.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> MOSSY_MUD_BRICK_SLAB = registerBlock("mossy_mud_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS)
                    .strength(1.5F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> MOSSY_MUD_BRICK_WALL = registerBlock("mossy_mud_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS)
                    .strength(1.5F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> CHISELED_MUD_BRICKS = registerBlock("chiseled_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS).strength(1.5F, 3.0F)
                    .sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MUD_BRICK_PILLAR = registerBlock("mud_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS)
                    .strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));

    //Endstone Blocks
    public static final RegistryObject<Block> END_STONE_STAIRS = registerBlock("end_stone_stairs",
            () -> new StairBlock(STONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(END_STONE).strength(3.0F, 9.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> END_STONE_SLAB = registerBlock("end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(END_STONE)
                    .strength(3.0F, 9.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> END_STONE_WALL = registerBlock("end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(END_STONE)
                    .strength(3.0F, 9.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_END_STONE = registerBlock("polished_end_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            () -> new StairBlock(END_STONE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).requiresCorrectToolForDrops()
                            .strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_STAIRS = registerBlock("cracked_end_stone_brick_stairs",
            () -> new StairBlock(END_STONE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).requiresCorrectToolForDrops()
                            .strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_SLAB = registerBlock("cracked_end_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_WALL = registerBlock("cracked_end_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(END_STONE).strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> END_STONE_BRICK_PILLAR = registerBlock("end_stone_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(END_STONE_BRICKS)
                    .strength(3.0F, 9.0F).sound(SoundType.STONE)));

    //Stone Blocks
    public static final RegistryObject<Block> STONE_WALL = registerBlock("stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(STONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            () -> new StairBlock(STONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE).strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
            () -> new StairBlock(STONE_BRICK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(STONE_BRICKS).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(STONE_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(STONE_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_BRICK_PILLAR = registerBlock("stone_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(STONE)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)));

    //Deepslate Blocks
    public static final RegistryObject<Block> DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            () -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(3.0F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_WALL = registerBlock("deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE = registerBlock("mossy_cobbled_deepslate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).strength(3.5f, 6.0F)
                    .sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_STAIRS = registerBlock("mossy_cobbled_deepslate_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).strength(3.5f, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_SLAB = registerBlock("mossy_cobbled_deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_WALL = registerBlock("mossy_cobbled_deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs",
            () -> new StairBlock(STONE_BRICK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CRACKED_DEEPSLATE_BRICKS).strength(3.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CRACKED_DEEPSLATE_BRICKS)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_WALL = registerBlock("cracked_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CRACKED_DEEPSLATE_BRICKS)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS).strength(3.5f, 6.0F)
                    .sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS).strength(3.5f, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs",
            () -> new StairBlock(Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_TILES).strength(3.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_TILES)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_WALL = registerBlock("cracked_deepslate_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_TILES)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_TILES = registerBlock("mossy_deepslate_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES).strength(3.5f, 6.0F)
                    .sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock("mossy_deepslate_tile_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_DEEPSLATE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES).strength(3.5f, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_TILE_SLAB = registerBlock("mossy_deepslate_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_TILE_WALL = registerBlock("mossy_deepslate_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_PILLAR = registerBlock("deepslate_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> SCULK_INLAID_DEEPSLATE = registerBlock("sculk_inlaid_deepslate",
            () -> new SculkInlaidDeepslateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_DEEPSLATE).strength(2.5F, 3.0F)
                    .sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            () -> new PressurePlateBlock(ModBlockSetType.POLISHED_DEEPSLATE, BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE).sound(SoundType.POLISHED_DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            () -> new ButtonBlock(ModBlockSetType.POLISHED_DEEPSLATE, 20, BlockBehaviour.Properties.of()
                    .noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));

    //Blackstone Bricks
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs",
            () -> new StairBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)
                            .requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final RegistryObject<Block> BLACKSTONE_BRICK_PILLAR = registerBlock("blackstone_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_BLACKSTONE_BRICKS)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)));

    //Netherrack
    public static final RegistryObject<Block> NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            () -> new StairBlock(Blocks.NETHERRACK.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK).requiresCorrectToolForDrops()
                            .strength(0.4F).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> NETHERRACK_SLAB = registerBlock("netherrack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)
                    .requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> NETHERRACK_WALL = registerBlock("netherrack_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)
                    .requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));

    //Nether Bricks
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs",
            () -> new StairBlock(Blocks.NETHER_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_FENCE = registerBlock("cracked_nether_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));

    //Red Nether Bricks
    public static final RegistryObject<Block> RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(RED_NETHER_BRICKS).strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICK_STAIRS = registerBlock("cracked_red_nether_brick_stairs",
            () -> new StairBlock(Blocks.RED_NETHER_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(RED_NETHER_BRICKS).requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICK_SLAB = registerBlock("cracked_red_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(RED_NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICK_WALL = registerBlock("cracked_red_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(RED_NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICK_FENCE = registerBlock("cracked_red_nether_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(RED_NETHER_BRICKS).strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));

    //Prismarine Blocks
    public static final RegistryObject<Block> PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(DARK_PRISMARINE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_PRISMARINE_BRICKS = registerBlock("cracked_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_PRISMARINE_BRICK_STAIRS = registerBlock("cracked_prismarine_brick_stairs",
            () -> new StairBlock(PRISMARINE_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_PRISMARINE_BRICK_SLAB = registerBlock("cracked_prismarine_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_PRISMARINE_BRICK_WALL = registerBlock("cracked_prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_PRISMARINE_BRICKS = registerBlock("mossy_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_PRISMARINE_BRICK_STAIRS = registerBlock("mossy_prismarine_brick_stairs",
            () -> new StairBlock(PRISMARINE_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_PRISMARINE_BRICK_SLAB = registerBlock("mossy_prismarine_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_PRISMARINE_BRICK_WALL = registerBlock("mossy_prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(PRISMARINE_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PRISMARINE_BRICK_PILLAR = registerBlock("prismarine_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE)));

    //Smooth Basalt
    public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            () -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT).requiresCorrectToolForDrops()
                            .strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT)
                    .requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT)
                    .requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));

    //Sandstone Blocks
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_SANDSTONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            () -> new StairBlock(SANDSTONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CUT_SANDSTONE).strength(2.0F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CUT_SANDSTONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //Red Sandstone Blocks
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_RED_SANDSTONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            () -> new StairBlock(SANDSTONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CUT_RED_SANDSTONE).strength(2.0F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CUT_RED_SANDSTONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //Purpur Blocks
    public static final RegistryObject<Block> PURPUR_WALL = registerBlock("purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(PURPUR_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_PURPUR = registerBlock("chiseled_purpur",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));

    //Snow Blocks
    public static final RegistryObject<Block> SNOW_BRICKS = registerBlock("snow_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK).strength(0.2F).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            () -> new StairBlock(SNOW_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK)
                    .strength(0.2F).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK).strength(0.2F).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK).strength(0.2F).sound(SoundType.SNOW)));

    public static class ModItems {
        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, CinchsMissingBlocks.MOD_ID);
    }
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> registeredBlock = BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(registeredBlock.get(), new Item.Properties()));
        return registeredBlock;
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ModItems.ITEMS.register(eventBus);
    }
}