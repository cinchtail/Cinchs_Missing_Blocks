package net.cinchtail.cinchsmissingblocks.block;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.cinchtail.cinchsmissingblocks.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CinchsMissingBlocks.MOD_ID);

    //Calcite Blocks
    public static final DeferredBlock<Block> CALCITE_STAIRS = registerBlock("calcite_stairs",
            () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(0.75F)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_stairs")))));
    public static final DeferredBlock<Block> CALCITE_SLAB = registerBlock("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(0.75F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_slab")))));
    public static final DeferredBlock<Block> CALCITE_WALL = registerBlock("calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(0.75F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_wall")))));
    public static final DeferredBlock<Block> POLISHED_CALCITE = registerBlock("polished_calcite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(3.5f, 6.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_calcite")))));
    public static final DeferredBlock<Block> POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_calcite_stairs")))));
    public static final DeferredBlock<Block> POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_calcite_slab")))));
    public static final DeferredBlock<Block> POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_calcite_wall")))));
    public static final DeferredBlock<Block> CALCITE_BRICKS = registerBlock("calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_bricks")))));
    public static final DeferredBlock<Block> CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_brick_stairs")))));
    public static final DeferredBlock<Block> CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_brick_slab")))));
    public static final DeferredBlock<Block> CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "calcite_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_calcite_bricks")))));
    public static final DeferredBlock<Block> CRACKED_CALCITE_BRICK_STAIRS = registerBlock("cracked_calcite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_calcite_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_CALCITE_BRICK_SLAB = registerBlock("cracked_calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_calcite_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_CALCITE_BRICK_WALL = registerBlock("cracked_calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_calcite_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_CALCITE_BRICKS = registerBlock("mossy_calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_calcite_bricks")))));
    public static final DeferredBlock<Block> MOSSY_CALCITE_BRICK_STAIRS = registerBlock("mossy_calcite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_calcite_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_CALCITE_BRICK_SLAB = registerBlock("mossy_calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_calcite_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_CALCITE_BRICK_WALL = registerBlock("mossy_calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_calcite_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_CALCITE_BRICKS = registerBlock("chiseled_calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_calcite_bricks")))));

    //Dripstone Blocks
    public static final DeferredBlock<Block> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            () -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                            .strength(1.5F, 1.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_stairs")))));
    public static final DeferredBlock<Block> DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 1.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_slab")))));
    public static final DeferredBlock<Block> DRIPSTONE_WALL = registerBlock("dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 1.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_wall")))));
    public static final DeferredBlock<Block> POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 1.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_dripstone")))));
    public static final DeferredBlock<Block> POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_dripstone_stairs")))));
    public static final DeferredBlock<Block> POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_dripstone_slab")))));
    public static final DeferredBlock<Block> POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_dripstone_wall")))));
    public static final DeferredBlock<Block> DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_bricks")))));
    public static final DeferredBlock<Block> DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_brick_stairs")))));
    public static final DeferredBlock<Block> DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_brick_slab")))));
    public static final DeferredBlock<Block> DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dripstone_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_DRIPSTONE_BRICKS = registerBlock("cracked_dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_dripstone_bricks")))));
    public static final DeferredBlock<Block> CRACKED_DRIPSTONE_BRICK_STAIRS = registerBlock("cracked_dripstone_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_dripstone_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_DRIPSTONE_BRICK_SLAB = registerBlock("cracked_dripstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_dripstone_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_DRIPSTONE_BRICK_WALL = registerBlock("cracked_dripstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_dripstone_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_DRIPSTONE_BRICKS = registerBlock("mossy_dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_dripstone_bricks")))));
    public static final DeferredBlock<Block> MOSSY_DRIPSTONE_BRICK_STAIRS = registerBlock("mossy_dripstone_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_dripstone_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_DRIPSTONE_BRICK_SLAB = registerBlock("mossy_dripstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_dripstone_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_DRIPSTONE_BRICK_WALL = registerBlock("mossy_dripstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_dripstone_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_DRIPSTONE_BRICKS = registerBlock("chiseled_dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 1.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_dripstone_bricks")))));

    //Tuff Blocks
    public static final DeferredBlock<Block> CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.TUFF_BRICKS).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_tuff_bricks")))));
    public static final DeferredBlock<Block> CRACKED_TUFF_BRICK_STAIRS = registerBlock("cracked_tuff_brick_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_TUFF_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_tuff_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_TUFF_BRICK_SLAB = registerBlock("cracked_tuff_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)
                    .sound(SoundType.TUFF_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_tuff_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_TUFF_BRICK_WALL = registerBlock("cracked_tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS).requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_tuff_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_TUFF_BRICKS = registerBlock("mossy_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.TUFF_BRICKS).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_tuff_bricks")))));
    public static final DeferredBlock<Block> MOSSY_TUFF_BRICK_STAIRS = registerBlock("mossy_tuff_brick_stairs",
            () -> new StairBlock(Blocks.TUFF_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.TUFF_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_tuff_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_TUFF_BRICK_SLAB = registerBlock("mossy_tuff_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.TUFF_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_tuff_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_TUFF_BRICK_WALL = registerBlock("mossy_tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.TUFF_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_tuff_brick_wall")))));

    //Andesite Blocks
    public static final DeferredBlock<Block> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_andesite_wall")))));
    public static final DeferredBlock<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "andesite_bricks")))));
    public static final DeferredBlock<Block> ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "andesite_brick_stairs")))));
    public static final DeferredBlock<Block> ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "andesite_brick_slab")))));
    public static final DeferredBlock<Block> ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "andesite_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_andesite_bricks")))));
    public static final DeferredBlock<Block> CRACKED_ANDESITE_BRICK_STAIRS = registerBlock("cracked_andesite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_andesite_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_ANDESITE_BRICK_SLAB = registerBlock("cracked_andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_andesite_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_ANDESITE_BRICK_WALL = registerBlock("cracked_andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_andesite_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_ANDESITE_BRICKS = registerBlock("mossy_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_andesite_bricks")))));
    public static final DeferredBlock<Block> MOSSY_ANDESITE_BRICK_STAIRS = registerBlock("mossy_andesite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_andesite_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_ANDESITE_BRICK_SLAB = registerBlock("mossy_andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_andesite_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_ANDESITE_BRICK_WALL = registerBlock("mossy_andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_andesite_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_ANDESITE_BRICKS = registerBlock("chiseled_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_andesite_bricks")))));

    //Granite Blocks
    public static final DeferredBlock<Block> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_granite_wall")))));
    public static final DeferredBlock<Block> GRANITE_BRICKS = registerBlock("granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "granite_bricks")))));
    public static final DeferredBlock<Block> GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_GRANITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "granite_brick_stairs")))));
    public static final DeferredBlock<Block> GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "granite_brick_slab")))));
    public static final DeferredBlock<Block> GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "granite_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_granite_bricks")))));
    public static final DeferredBlock<Block> CRACKED_GRANITE_BRICK_STAIRS = registerBlock("cracked_granite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_GRANITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_granite_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_GRANITE_BRICK_SLAB = registerBlock("cracked_granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_granite_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_GRANITE_BRICK_WALL = registerBlock("cracked_granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_granite_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_GRANITE_BRICKS = registerBlock("mossy_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_granite_bricks")))));
    public static final DeferredBlock<Block> MOSSY_GRANITE_BRICK_STAIRS = registerBlock("mossy_granite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_GRANITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_granite_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_GRANITE_BRICK_SLAB = registerBlock("mossy_granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_granite_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_GRANITE_BRICK_WALL = registerBlock("mossy_granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_granite_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_GRANITE_BRICKS = registerBlock("chiseled_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_granite_bricks")))));

    //Diorite Blocks
    public static final DeferredBlock<Block> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "polished_diorite_wall")))));
    public static final DeferredBlock<Block> DIORITE_BRICKS = registerBlock("diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "diorite_bricks")))));
    public static final DeferredBlock<Block> DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_DIORITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "diorite_brick_stairs")))));
    public static final DeferredBlock<Block> DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "diorite_brick_slab")))));
    public static final DeferredBlock<Block> DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).setId(ResourceKey.create(Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "diorite_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_DIORITE_BRICKS = registerBlock("cracked_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_diorite_bricks")))));
    public static final DeferredBlock<Block> CRACKED_DIORITE_BRICK_STAIRS = registerBlock("cracked_diorite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_DIORITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_diorite_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_DIORITE_BRICK_SLAB = registerBlock("cracked_diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_diorite_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_DIORITE_BRICK_WALL = registerBlock("cracked_diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_diorite_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_DIORITE_BRICKS = registerBlock("mossy_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_diorite_bricks")))));
    public static final DeferredBlock<Block> MOSSY_DIORITE_BRICK_STAIRS = registerBlock("mossy_diorite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_DIORITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_diorite_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_DIORITE_BRICK_SLAB = registerBlock("mossy_diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_diorite_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_DIORITE_BRICK_WALL = registerBlock("mossy_diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_diorite_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_DIORITE_BRICKS = registerBlock("chiseled_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_diorite_bricks")))));

    //Quartz Blocks
    public static final DeferredBlock<Block> QUARTZ_WALL = registerBlock("quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "quartz_wall")))));
    public static final DeferredBlock<Block> SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_quartz_wall")))));
    public static final DeferredBlock<Block> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).strength(0.8F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "quartz_brick_stairs")))));
    public static final DeferredBlock<Block> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)
                    .strength(0.8F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "quartz_brick_slab")))));
    public static final DeferredBlock<Block> QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)
                    .strength(0.8F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "quartz_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_QUARTZ_BRICKS = registerBlock("cracked_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS).strength(0.8F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_quartz_bricks")))));
    public static final DeferredBlock<Block> CRACKED_QUARTZ_BRICK_STAIRS = registerBlock("cracked_quartz_brick_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_QUARTZ_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS).requiresCorrectToolForDrops()
                            .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_quartz_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_QUARTZ_BRICK_SLAB = registerBlock("cracked_quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)
                    .requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_quartz_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_QUARTZ_BRICK_WALL = registerBlock("cracked_quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)
                    .requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_quartz_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_QUARTZ_BRICKS = registerBlock("mossy_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS).strength(0.8F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_quartz_bricks")))));
    public static final DeferredBlock<Block> MOSSY_QUARTZ_BRICK_STAIRS = registerBlock("mossy_quartz_brick_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_QUARTZ_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS).requiresCorrectToolForDrops()
                            .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_quartz_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_QUARTZ_BRICK_SLAB = registerBlock("mossy_quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)
                    .requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_quartz_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_QUARTZ_BRICK_WALL = registerBlock("mossy_quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)
                    .requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_quartz_brick_wall")))));

    //Brick Blocks
    public static final DeferredBlock<Block> CRACKED_BRICKS = registerBlock("cracked_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).strength(2.0F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_bricks")))));
    public static final DeferredBlock<Block> CRACKED_BRICK_STAIRS = registerBlock("cracked_brick_stairs",
            () -> new StairBlock(Blocks.BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_BRICK_SLAB = registerBlock("cracked_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_BRICK_WALL = registerBlock("cracked_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_BRICKS = registerBlock("mossy_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).strength(2.0F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_bricks")))));
    public static final DeferredBlock<Block> MOSSY_BRICK_STAIRS = registerBlock("mossy_brick_stairs",
            () -> new StairBlock(Blocks.BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_BRICK_SLAB = registerBlock("mossy_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_BRICK_WALL = registerBlock("mossy_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_BRICKS = registerBlock("chiseled_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).strength(2.0F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_bricks")))));

    //Mud Brick Blocks
    public static final DeferredBlock<Block> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            () -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).requiresCorrectToolForDrops()
                            .strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "packed_mud_stairs")))));
    public static final DeferredBlock<Block> PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)
                    .requiresCorrectToolForDrops().strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "packed_mud_slab")))));
    public static final DeferredBlock<Block> PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)
                    .requiresCorrectToolForDrops().strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "packed_mud_wall")))));
    public static final DeferredBlock<Block> CRACKED_MUD_BRICKS = registerBlock("cracked_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                    .sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_mud_bricks")))));
    public static final DeferredBlock<Block> CRACKED_MUD_BRICK_STAIRS = registerBlock("cracked_mud_brick_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_MUD_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).requiresCorrectToolForDrops()
                            .strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_mud_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_MUD_BRICK_SLAB = registerBlock("cracked_mud_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_mud_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_MUD_BRICK_WALL = registerBlock("cracked_mud_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_mud_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_MUD_BRICKS = registerBlock("mossy_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                    .sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_mud_bricks")))));
    public static final DeferredBlock<Block> MOSSY_MUD_BRICK_STAIRS = registerBlock("mossy_mud_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_MUD_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_mud_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_MUD_BRICK_SLAB = registerBlock("mossy_mud_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)
                    .strength(1.5F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_mud_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_MUD_BRICK_WALL = registerBlock("mossy_mud_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)
                    .strength(1.5F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_mud_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_MUD_BRICKS = registerBlock("chiseled_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                    .sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_mud_bricks")))));

    //Endstone Blocks
    public static final DeferredBlock<Block> END_STONE_STAIRS = registerBlock("end_stone_stairs",
            () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(3.0F, 9.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "end_stone_stairs")))));
    public static final DeferredBlock<Block> END_STONE_SLAB = registerBlock("end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "end_stone_slab")))));
    public static final DeferredBlock<Block> END_STONE_WALL = registerBlock("end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "end_stone_wall")))));
    public static final DeferredBlock<Block> CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_end_stone_bricks")))));
    public static final DeferredBlock<Block> CRACKED_END_STONE_BRICK_STAIRS = registerBlock("cracked_end_stone_brick_stairs",
            () -> new StairBlock(Blocks.END_STONE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).requiresCorrectToolForDrops()
                            .strength(3.0F, 9.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_end_stone_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_END_STONE_BRICK_SLAB = registerBlock("cracked_end_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_end_stone_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_END_STONE_BRICK_WALL = registerBlock("cracked_end_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_end_stone_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(3.0F, 9.0F)
                    .sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_end_stone_bricks")))));
    public static final DeferredBlock<Block> END_STONE_PILLAR = registerBlock("end_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "end_stone_pillar")))));

    //Stone Blocks
    public static final DeferredBlock<Block> STONE_WALL = registerBlock("stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "stone_wall")))));
    public static final DeferredBlock<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).strength(2.0F, 6.0F)
                            .requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_stone_stairs")))));
    public static final DeferredBlock<Block> SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_stone_wall")))));
    public static final DeferredBlock<Block> CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
            () -> new StairBlock(Blocks.STONE_BRICK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_stone_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_stone_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_stone_brick_wall")))));

    //Deepslate Blocks
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs",
            () -> new StairBlock(Blocks.STONE_BRICK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_BRICKS).strength(3.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_deepslate_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_BRICKS)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_deepslate_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_BRICK_WALL = registerBlock("cracked_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_BRICKS)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_deepslate_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs",
            () -> new StairBlock(Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_TILES).strength(3.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_deepslate_tile_stairs")))));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_TILES)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_TILES).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_deepslate_tile_slab")))));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_TILE_WALL = registerBlock("cracked_deepslate_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_TILES)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_TILES).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_deepslate_tile_wall")))));

    //Blackstone Bricks
    public static final DeferredBlock<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs",
            () -> new StairBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE)
                            .requiresCorrectToolForDrops().strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_polished_blackstone_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_polished_blackstone_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_polished_blackstone_brick_wall")))));
    //Netherrack
    public static final DeferredBlock<Block> NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            () -> new StairBlock(Blocks.NETHERRACK.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK).requiresCorrectToolForDrops()
                            .strength(0.4F).sound(SoundType.NETHERRACK).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "netherrack_stairs")))));
    public static final DeferredBlock<Block> NETHERRACK_SLAB = registerBlock("netherrack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)
                    .requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "netherrack_slab")))));
    public static final DeferredBlock<Block> NETHERRACK_WALL = registerBlock("netherrack_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)
                    .requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "netherrack_wall")))));

    //Nether Bricks
    public static final DeferredBlock<Block> CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs",
            () -> new StairBlock(Blocks.NETHER_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_nether_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)
                    .sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_nether_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)
                    .sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_nether_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_NETHER_BRICK_FENCE = registerBlock("cracked_nether_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_nether_brick_fence")))));

    //Red Nether Bricks
    public static final DeferredBlock<Block> RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "red_nether_brick_fence")))));
    public static final DeferredBlock<Block> CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_red_nether_bricks")))));
    public static final DeferredBlock<Block> CRACKED_RED_NETHER_BRICK_STAIRS = registerBlock("cracked_red_nether_brick_stairs",
            () -> new StairBlock(Blocks.RED_NETHER_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_red_nether_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_RED_NETHER_BRICK_SLAB = registerBlock("cracked_red_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)
                    .sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_red_nether_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_RED_NETHER_BRICK_WALL = registerBlock("cracked_red_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)
                    .sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_red_nether_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_RED_NETHER_BRICK_FENCE = registerBlock("cracked_red_nether_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_red_nether_brick_fence")))));
    public static final DeferredBlock<Block> CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_red_nether_bricks")))));

    //Prismarine Blocks
    public static final DeferredBlock<Block> PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "prismarine_brick_wall")))));
    public static final DeferredBlock<Block> DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "dark_prismarine_wall")))));
    public static final DeferredBlock<Block> CRACKED_PRISMARINE_BRICKS = registerBlock("cracked_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_prismarine_bricks")))));
    public static final DeferredBlock<Block> CRACKED_PRISMARINE_BRICK_STAIRS = registerBlock("cracked_prismarine_brick_stairs",
            () -> new StairBlock(Blocks.PRISMARINE_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_prismarine_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_PRISMARINE_BRICK_SLAB = registerBlock("cracked_prismarine_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_prismarine_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_PRISMARINE_BRICK_WALL = registerBlock("cracked_prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cracked_prismarine_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_PRISMARINE_BRICKS = registerBlock("mossy_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_prismarine_bricks")))));
    public static final DeferredBlock<Block> MOSSY_PRISMARINE_BRICK_STAIRS = registerBlock("mossy_prismarine_brick_stairs",
            () -> new StairBlock(Blocks.PRISMARINE_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_prismarine_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_PRISMARINE_BRICK_SLAB = registerBlock("mossy_prismarine_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_prismarine_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_PRISMARINE_BRICK_WALL = registerBlock("mossy_prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "mossy_prismarine_brick_wall")))));

    //Smooth Basalt
    public static final DeferredBlock<Block> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            () -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT).requiresCorrectToolForDrops()
                            .strength(1.25F, 4.2F).sound(SoundType.BASALT).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_basalt_stairs")))));
    public static final DeferredBlock<Block> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT)
                    .requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_basalt_slab")))));
    public static final DeferredBlock<Block> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT)
                    .requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_basalt_wall")))));

    //Sandstone Blocks
    public static final DeferredBlock<Block> SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_sandstone_wall")))));
    public static final DeferredBlock<Block> CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            () -> new StairBlock(Blocks.SANDSTONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE).strength(2.0F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cut_sandstone_stairs")))));
    public static final DeferredBlock<Block> CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cut_sandstone_wall")))));

    //Red Sandstone Blocks
    public static final DeferredBlock<Block> SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_RED_SANDSTONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "smooth_red_sandstone_wall")))));
    public static final DeferredBlock<Block> CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            () -> new StairBlock(Blocks.SANDSTONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_RED_SANDSTONE).strength(2.0F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cut_red_sandstone_stairs")))));
    public static final DeferredBlock<Block> CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_RED_SANDSTONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "cut_red_sandstone_wall")))));

    //Purpur Blocks
    public static final DeferredBlock<Block> PURPUR_WALL = registerBlock("purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "purpur_wall")))));
    public static final DeferredBlock<Block> CHISELED_PURPUR = registerBlock("chiseled_purpur",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "chiseled_purpur")))));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().useBlockDescriptionPrefix()
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, name)))));
    }
}