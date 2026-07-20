package net.cinchtail.cinchsmissingblocks.block;

import net.cinchtail.cinchsmissingblocks.block.custom.SculkInlaidDeepslateBlock;
import net.cinchtail.cinchsmissingblocks.block.custom.TintedGlassPaneBlock;
import net.cinchtail.cinchsmissingblocks.item.ModItems;
import net.cinchtail.cinchsmissingblocks.util.ModBlockSetType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public class ModBlocks {
    public static DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    //Calcite Blocks
    public static final DeferredBlock<Block> CALCITE_STAIRS = registerBlock("calcite_stairs",
            () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(0.75F)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "calcite_stairs")))));
    public static final DeferredBlock<Block> CALCITE_SLAB = registerBlock("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(0.75F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "calcite_slab")))));
    public static final DeferredBlock<Block> CALCITE_WALL = registerBlock("calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(0.75F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "calcite_wall")))));
    public static final DeferredBlock<Block> POLISHED_CALCITE = registerBlock("polished_calcite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(3.5f, 6.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_calcite")))));
    public static final DeferredBlock<Block> POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_calcite_stairs")))));
    public static final DeferredBlock<Block> POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_calcite_slab")))));
    public static final DeferredBlock<Block> POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_calcite_wall")))));
    public static final DeferredBlock<Block> CALCITE_BRICKS = registerBlock("calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "calcite_bricks")))));
    public static final DeferredBlock<Block> CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "calcite_brick_stairs")))));
    public static final DeferredBlock<Block> CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "calcite_brick_slab")))));
    public static final DeferredBlock<Block> CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "calcite_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_calcite_bricks")))));
    public static final DeferredBlock<Block> CRACKED_CALCITE_BRICK_STAIRS = registerBlock("cracked_calcite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_calcite_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_CALCITE_BRICK_SLAB = registerBlock("cracked_calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_calcite_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_CALCITE_BRICK_WALL = registerBlock("cracked_calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_calcite_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_CALCITE_BRICKS = registerBlock("mossy_calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_calcite_bricks")))));
    public static final DeferredBlock<Block> MOSSY_CALCITE_BRICK_STAIRS = registerBlock("mossy_calcite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_calcite_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_CALCITE_BRICK_SLAB = registerBlock("mossy_calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_calcite_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_CALCITE_BRICK_WALL = registerBlock("mossy_calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_calcite_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_CALCITE_BRICKS = registerBlock("chiseled_calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1F, 1.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "chiseled_calcite_bricks")))));
    public static final DeferredBlock<Block> CALCITE_BRICK_PILLAR = registerBlock("calcite_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                    .strength(1F, 1.0F).sound(SoundType.CALCITE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "calcite_brick_pillar")))));

    //Dripstone Blocks
    public static final DeferredBlock<Block> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            () -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                            .strength(1.5F, 1.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "dripstone_stairs")))));
    public static final DeferredBlock<Block> DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 1.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "dripstone_slab")))));
    public static final DeferredBlock<Block> DRIPSTONE_WALL = registerBlock("dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 1.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "dripstone_wall")))));
    public static final DeferredBlock<Block> POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 1.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_dripstone")))));
    public static final DeferredBlock<Block> POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_dripstone_stairs")))));
    public static final DeferredBlock<Block> POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_dripstone_slab")))));
    public static final DeferredBlock<Block> POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_dripstone_wall")))));
    public static final DeferredBlock<Block> DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "dripstone_bricks")))));
    public static final DeferredBlock<Block> DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "dripstone_brick_stairs")))));
    public static final DeferredBlock<Block> DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "dripstone_brick_slab")))));
    public static final DeferredBlock<Block> DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "dripstone_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_DRIPSTONE_BRICKS = registerBlock("cracked_dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_dripstone_bricks")))));
    public static final DeferredBlock<Block> CRACKED_DRIPSTONE_BRICK_STAIRS = registerBlock("cracked_dripstone_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_dripstone_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_DRIPSTONE_BRICK_SLAB = registerBlock("cracked_dripstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_dripstone_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_DRIPSTONE_BRICK_WALL = registerBlock("cracked_dripstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_dripstone_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_DRIPSTONE_BRICKS = registerBlock("mossy_dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_dripstone_bricks")))));
    public static final DeferredBlock<Block> MOSSY_DRIPSTONE_BRICK_STAIRS = registerBlock("mossy_dripstone_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_dripstone_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_DRIPSTONE_BRICK_SLAB = registerBlock("mossy_dripstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_dripstone_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_DRIPSTONE_BRICK_WALL = registerBlock("mossy_dripstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_dripstone_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_DRIPSTONE_BRICKS = registerBlock("chiseled_dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(1.5F, 1.0F)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "chiseled_dripstone_bricks")))));
    public static final DeferredBlock<Block> DRIPSTONE_BRICK_PILLAR = registerBlock("dripstone_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "dripstone_brick_pillar")))));

    //Tuff Blocks
    public static final DeferredBlock<Block> CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.TUFF_BRICKS).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_tuff_bricks")))));
    public static final DeferredBlock<Block> CRACKED_TUFF_BRICK_STAIRS = registerBlock("cracked_tuff_brick_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_TUFF_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_tuff_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_TUFF_BRICK_SLAB = registerBlock("cracked_tuff_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)
                    .sound(SoundType.TUFF_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_tuff_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_TUFF_BRICK_WALL = registerBlock("cracked_tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS).requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_tuff_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_TUFF_BRICKS = registerBlock("mossy_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.TUFF_BRICKS).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_tuff_bricks")))));
    public static final DeferredBlock<Block> MOSSY_TUFF_BRICK_STAIRS = registerBlock("mossy_tuff_brick_stairs",
            () -> new StairBlock(Blocks.TUFF_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.TUFF_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_tuff_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_TUFF_BRICK_SLAB = registerBlock("mossy_tuff_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.TUFF_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_tuff_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_TUFF_BRICK_WALL = registerBlock("mossy_tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.TUFF_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_tuff_brick_wall")))));

    //Andesite Blocks
    public static final DeferredBlock<Block> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_andesite_wall")))));
    public static final DeferredBlock<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "andesite_bricks")))));
    public static final DeferredBlock<Block> ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "andesite_brick_stairs")))));
    public static final DeferredBlock<Block> ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "andesite_brick_slab")))));
    public static final DeferredBlock<Block> ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "andesite_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_andesite_bricks")))));
    public static final DeferredBlock<Block> CRACKED_ANDESITE_BRICK_STAIRS = registerBlock("cracked_andesite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_andesite_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_ANDESITE_BRICK_SLAB = registerBlock("cracked_andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_andesite_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_ANDESITE_BRICK_WALL = registerBlock("cracked_andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_andesite_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_ANDESITE_BRICKS = registerBlock("mossy_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_andesite_bricks")))));
    public static final DeferredBlock<Block> MOSSY_ANDESITE_BRICK_STAIRS = registerBlock("mossy_andesite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_andesite_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_ANDESITE_BRICK_SLAB = registerBlock("mossy_andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_andesite_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_ANDESITE_BRICK_WALL = registerBlock("mossy_andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_andesite_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_ANDESITE_BRICKS = registerBlock("chiseled_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "chiseled_andesite_bricks")))));
    public static final DeferredBlock<Block> ANDESITE_BRICK_PILLAR = registerBlock("andesite_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "andesite_brick_pillar")))));

    //Granite Blocks
    public static final DeferredBlock<Block> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_granite_wall")))));
    public static final DeferredBlock<Block> GRANITE_BRICKS = registerBlock("granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "granite_bricks")))));
    public static final DeferredBlock<Block> GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_GRANITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "granite_brick_stairs")))));
    public static final DeferredBlock<Block> GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "granite_brick_slab")))));
    public static final DeferredBlock<Block> GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "granite_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_granite_bricks")))));
    public static final DeferredBlock<Block> CRACKED_GRANITE_BRICK_STAIRS = registerBlock("cracked_granite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_GRANITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_granite_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_GRANITE_BRICK_SLAB = registerBlock("cracked_granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_granite_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_GRANITE_BRICK_WALL = registerBlock("cracked_granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_granite_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_GRANITE_BRICKS = registerBlock("mossy_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_granite_bricks")))));
    public static final DeferredBlock<Block> MOSSY_GRANITE_BRICK_STAIRS = registerBlock("mossy_granite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_GRANITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_granite_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_GRANITE_BRICK_SLAB = registerBlock("mossy_granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_granite_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_GRANITE_BRICK_WALL = registerBlock("mossy_granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_granite_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_GRANITE_BRICKS = registerBlock("chiseled_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "chiseled_granite_bricks")))));
    public static final DeferredBlock<Block> GRANITE_BRICK_PILLAR = registerBlock("granite_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "granite_brick_pillar")))));

    //Diorite Blocks
    public static final DeferredBlock<Block> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_diorite_wall")))));
    public static final DeferredBlock<Block> DIORITE_BRICKS = registerBlock("diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "diorite_bricks")))));
    public static final DeferredBlock<Block> DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_DIORITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "diorite_brick_stairs")))));
    public static final DeferredBlock<Block> DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "diorite_brick_slab")))));
    public static final DeferredBlock<Block> DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).setId(ResourceKey.create(Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "diorite_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_DIORITE_BRICKS = registerBlock("cracked_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_diorite_bricks")))));
    public static final DeferredBlock<Block> CRACKED_DIORITE_BRICK_STAIRS = registerBlock("cracked_diorite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_DIORITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_diorite_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_DIORITE_BRICK_SLAB = registerBlock("cracked_diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_diorite_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_DIORITE_BRICK_WALL = registerBlock("cracked_diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_diorite_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_DIORITE_BRICKS = registerBlock("mossy_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_diorite_bricks")))));
    public static final DeferredBlock<Block> MOSSY_DIORITE_BRICK_STAIRS = registerBlock("mossy_diorite_brick_stairs",
            () -> new StairBlock(Blocks.POLISHED_DIORITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_diorite_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_DIORITE_BRICK_SLAB = registerBlock("mossy_diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_diorite_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_DIORITE_BRICK_WALL = registerBlock("mossy_diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_diorite_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_DIORITE_BRICKS = registerBlock("chiseled_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "chiseled_diorite_bricks")))));
    public static final DeferredBlock<Block> DIORITE_BRICK_PILLAR = registerBlock("diorite_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "diorite_brick_pillar")))));

    //Quartz Blocks
    public static final DeferredBlock<Block> QUARTZ_WALL = registerBlock("quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)
                    .strength(0.8F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "quartz_wall")))));
    public static final DeferredBlock<Block> SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "smooth_quartz_wall")))));
    public static final DeferredBlock<Block> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).strength(0.8F)
                            .requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "quartz_brick_stairs")))));
    public static final DeferredBlock<Block> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)
                    .strength(0.8F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "quartz_brick_slab")))));
    public static final DeferredBlock<Block> QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)
                    .strength(0.8F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "quartz_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_QUARTZ_BRICKS = registerBlock("cracked_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS).strength(0.8F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_quartz_bricks")))));
    public static final DeferredBlock<Block> CRACKED_QUARTZ_BRICK_STAIRS = registerBlock("cracked_quartz_brick_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_QUARTZ_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS).requiresCorrectToolForDrops()
                            .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_quartz_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_QUARTZ_BRICK_SLAB = registerBlock("cracked_quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)
                    .requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_quartz_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_QUARTZ_BRICK_WALL = registerBlock("cracked_quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)
                    .requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_quartz_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_QUARTZ_BRICKS = registerBlock("mossy_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS).strength(0.8F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_quartz_bricks")))));
    public static final DeferredBlock<Block> MOSSY_QUARTZ_BRICK_STAIRS = registerBlock("mossy_quartz_brick_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_QUARTZ_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS).requiresCorrectToolForDrops()
                            .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_quartz_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_QUARTZ_BRICK_SLAB = registerBlock("mossy_quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)
                    .requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_quartz_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_QUARTZ_BRICK_WALL = registerBlock("mossy_quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)
                    .requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_quartz_brick_wall")))));

    //Brick Blocks
    public static final DeferredBlock<Block> CRACKED_BRICKS = registerBlock("cracked_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).strength(2.0F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_bricks")))));
    public static final DeferredBlock<Block> CRACKED_BRICK_STAIRS = registerBlock("cracked_brick_stairs",
            () -> new StairBlock(Blocks.BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_BRICK_SLAB = registerBlock("cracked_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_BRICK_WALL = registerBlock("cracked_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_BRICKS = registerBlock("mossy_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).strength(2.0F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_bricks")))));
    public static final DeferredBlock<Block> MOSSY_BRICK_STAIRS = registerBlock("mossy_brick_stairs",
            () -> new StairBlock(Blocks.BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_BRICK_SLAB = registerBlock("mossy_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_BRICK_WALL = registerBlock("mossy_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_BRICKS = registerBlock("chiseled_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).strength(2.0F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "chiseled_bricks")))));

    //Mud Brick Blocks
    public static final DeferredBlock<Block> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            () -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).requiresCorrectToolForDrops()
                            .strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "packed_mud_stairs")))));
    public static final DeferredBlock<Block> PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)
                    .requiresCorrectToolForDrops().strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "packed_mud_slab")))));
    public static final DeferredBlock<Block> PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)
                    .requiresCorrectToolForDrops().strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "packed_mud_wall")))));
    public static final DeferredBlock<Block> CRACKED_MUD_BRICKS = registerBlock("cracked_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                    .sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_mud_bricks")))));
    public static final DeferredBlock<Block> CRACKED_MUD_BRICK_STAIRS = registerBlock("cracked_mud_brick_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_MUD_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).requiresCorrectToolForDrops()
                            .strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_mud_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_MUD_BRICK_SLAB = registerBlock("cracked_mud_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_mud_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_MUD_BRICK_WALL = registerBlock("cracked_mud_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_mud_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_MUD_BRICKS = registerBlock("mossy_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                    .sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_mud_bricks")))));
    public static final DeferredBlock<Block> MOSSY_MUD_BRICK_STAIRS = registerBlock("mossy_mud_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_MUD_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_mud_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_MUD_BRICK_SLAB = registerBlock("mossy_mud_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)
                    .strength(1.5F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_mud_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_MUD_BRICK_WALL = registerBlock("mossy_mud_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)
                    .strength(1.5F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_mud_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_MUD_BRICKS = registerBlock("chiseled_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).strength(1.5F, 3.0F)
                    .sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "chiseled_mud_bricks")))));
    public static final DeferredBlock<Block> MUD_BRICK_PILLAR = registerBlock("mud_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)
                    .strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mud_brick_pillar")))));

    //Resin Blocks
    public static final DeferredBlock<Block> CRACKED_RESIN_BRICKS = registerBlock("cracked_resin_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RESIN_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.RESIN_BRICKS)
                    .setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_resin_bricks")))));
    public static final DeferredBlock<Block> CRACKED_RESIN_BRICK_STAIRS = registerBlock("cracked_resin_brick_stairs",
            () -> new StairBlock(Blocks.RESIN_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.RESIN_BRICKS).strength(1.5F, 6.0F).sound(SoundType.RESIN_BRICKS)
                            .setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_resin_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_RESIN_BRICK_SLAB = registerBlock("cracked_resin_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RESIN_BRICKS)
                    .strength(1.5F, 6.0F).sound(SoundType.RESIN_BRICKS)
                    .setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_resin_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_RESIN_BRICK_WALL = registerBlock("cracked_resin_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RESIN_BRICKS)
                    .strength(1.5F, 6.0F).sound(SoundType.RESIN_BRICKS)
                    .setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_resin_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_RESIN_BRICKS = registerBlock("mossy_resin_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RESIN_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.RESIN_BRICKS)
                    .setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_resin_bricks")))));
    public static final DeferredBlock<Block> MOSSY_RESIN_BRICK_STAIRS = registerBlock("mossy_resin_brick_stairs",
            () -> new StairBlock(Blocks.RESIN_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.RESIN_BRICKS).strength(1.5F, 6.0F)
                            .sound(SoundType.RESIN_BRICKS)
                            .setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_resin_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_RESIN_BRICK_SLAB = registerBlock("mossy_resin_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RESIN_BRICKS)
                    .strength(1.5F, 6.0F).sound(SoundType.RESIN_BRICKS)
                    .setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_resin_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_RESIN_BRICK_WALL = registerBlock("mossy_resin_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RESIN_BRICKS)
                    .strength(1.5F, 6.0F).sound(SoundType.RESIN_BRICKS)
                    .setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_resin_brick_wall")))));

    //Endstone Blocks
    public static final DeferredBlock<Block> END_STONE_STAIRS = registerBlock("end_stone_stairs",
            () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(3.0F, 9.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "end_stone_stairs")))));
    public static final DeferredBlock<Block> END_STONE_SLAB = registerBlock("end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "end_stone_slab")))));
    public static final DeferredBlock<Block> END_STONE_WALL = registerBlock("end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "end_stone_wall")))));
    public static final DeferredBlock<Block> POLISHED_END_STONE = registerBlock("polished_end_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_end_stone")))));
    public static final DeferredBlock<Block> POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            () -> new StairBlock(Blocks.END_STONE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).requiresCorrectToolForDrops()
                            .strength(3.0F, 9.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_end_stone_stairs")))));
    public static final DeferredBlock<Block> POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_end_stone_slab")))));
    public static final DeferredBlock<Block> POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_end_stone_wall")))));
    public static final DeferredBlock<Block> CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_end_stone_bricks")))));
    public static final DeferredBlock<Block> CRACKED_END_STONE_BRICK_STAIRS = registerBlock("cracked_end_stone_brick_stairs",
            () -> new StairBlock(Blocks.END_STONE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).requiresCorrectToolForDrops()
                            .strength(3.0F, 9.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_end_stone_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_END_STONE_BRICK_SLAB = registerBlock("cracked_end_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_end_stone_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_END_STONE_BRICK_WALL = registerBlock("cracked_end_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_end_stone_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_END_STONE_BRICKS = registerBlock("mossy_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(3.0F, 9.0F)
                    .sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_end_stone_bricks")))));
    public static final DeferredBlock<Block> MOSSY_END_STONE_BRICK_STAIRS = registerBlock("mossy_end_stone_brick_stairs",
            () -> new StairBlock(Blocks.END_STONE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(3.0F, 9.0F)
                            .sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_end_stone_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_END_STONE_BRICK_SLAB = registerBlock("mossy_end_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_end_stone_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_END_STONE_BRICK_WALL = registerBlock("mossy_end_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_end_stone_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(3.0F, 9.0F)
                    .sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "chiseled_end_stone_bricks")))));
    public static final DeferredBlock<Block> END_STONE_BRICK_PILLAR = registerBlock("end_stone_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "end_stone_brick_pillar")))));

    //Stone Blocks
    public static final DeferredBlock<Block> STONE_WALL = registerBlock("stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "stone_wall")))));
    public static final DeferredBlock<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).strength(2.0F, 6.0F)
                            .requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "smooth_stone_stairs")))));
    public static final DeferredBlock<Block> SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "smooth_stone_wall")))));
    public static final DeferredBlock<Block> CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
            () -> new StairBlock(Blocks.STONE_BRICK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_stone_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_stone_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_stone_brick_wall")))));
    public static final DeferredBlock<Block> STONE_TILES = registerBlock("stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).sound(SoundType.STONE)
                    .strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "stone_tiles")))));
    public static final DeferredBlock<Block> STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            () -> new StairBlock(Blocks.STONE_BRICKS.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
                    .sound(SoundType.STONE).strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "stone_tile_stairs")))));
    public static final DeferredBlock<Block> STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "stone_tile_slab")))));
    public static final DeferredBlock<Block> STONE_TILE_WALL = registerBlock("stone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "stone_tile_wall")))));
    public static final DeferredBlock<Block> CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).sound(SoundType.STONE)
                    .strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_stone_tiles")))));
    public static final DeferredBlock<Block> CRACKED_STONE_TILE_STAIRS = registerBlock("cracked_stone_tile_stairs",
            () -> new StairBlock(Blocks.STONE_BRICKS.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
                    .sound(SoundType.STONE).strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_stone_tile_stairs")))));
    public static final DeferredBlock<Block> CRACKED_STONE_TILE_SLAB = registerBlock("cracked_stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_stone_tile_slab")))));
    public static final DeferredBlock<Block> CRACKED_STONE_TILE_WALL = registerBlock("cracked_stone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_stone_tile_wall")))));
    public static final DeferredBlock<Block> MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).sound(SoundType.STONE)
                    .strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_stone_tiles")))));
    public static final DeferredBlock<Block> MOSSY_STONE_TILE_STAIRS = registerBlock("mossy_stone_tile_stairs",
            () -> new StairBlock(Blocks.STONE_BRICKS.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
                    .sound(SoundType.STONE).strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_stone_tile_stairs")))));
    public static final DeferredBlock<Block> MOSSY_STONE_TILE_SLAB = registerBlock("mossy_stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_stone_tile_slab")))));
    public static final DeferredBlock<Block> MOSSY_STONE_TILE_WALL = registerBlock("mossy_stone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_stone_tile_wall")))));
    public static final DeferredBlock<Block> STONE_BRICK_PILLAR = registerBlock("stone_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "stone_brick_pillar")))));

    //Deepslate Blocks
    public static final DeferredBlock<Block> DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            () -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).strength(3.0F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "deepslate_stairs")))));
    public static final DeferredBlock<Block> DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "deepslate_slab")))));
    public static final DeferredBlock<Block> DEEPSLATE_WALL = registerBlock("deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "deepslate_wall")))));
    public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE = registerBlock("mossy_cobbled_deepslate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).strength(3.5f, 6.0F)
                    .sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_cobbled_deepslate")))));
    public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE_STAIRS = registerBlock("mossy_cobbled_deepslate_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).strength(3.5f, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_cobbled_deepslate_stairs")))));
    public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE_SLAB = registerBlock("mossy_cobbled_deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_cobbled_deepslate_slab")))));
    public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE_WALL = registerBlock("mossy_cobbled_deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_cobbled_deepslate_wall")))));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs",
            () -> new StairBlock(Blocks.STONE_BRICK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_BRICKS).strength(3.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_deepslate_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_BRICKS)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_deepslate_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_BRICK_WALL = registerBlock("cracked_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_BRICKS)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_deepslate_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS).strength(3.5f, 6.0F)
                    .sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_deepslate_bricks")))));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS).strength(3.5f, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_deepslate_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_deepslate_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_deepslate_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs",
            () -> new StairBlock(Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_TILES).strength(3.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_deepslate_tile_stairs")))));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_TILES)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_TILES).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_deepslate_tile_slab")))));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_TILE_WALL = registerBlock("cracked_deepslate_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_TILES)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_deepslate_tile_wall")))));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_TILES = registerBlock("mossy_deepslate_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES).strength(3.5f, 6.0F)
                    .sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_deepslate_tiles")))));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock("mossy_deepslate_tile_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_DEEPSLATE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES).strength(3.5f, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_deepslate_tile_stairs")))));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_TILE_SLAB = registerBlock("mossy_deepslate_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_deepslate_tile_slab")))));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_TILE_WALL = registerBlock("mossy_deepslate_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_deepslate_tile_wall")))));
    public static final DeferredBlock<Block> DEEPSLATE_BRICK_PILLAR = registerBlock("deepslate_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "deepslate_brick_pillar")))));
    public static final DeferredBlock<Block> SCULK_INLAID_DEEPSLATE = registerBlock("sculk_inlaid_deepslate",
            () -> new SculkInlaidDeepslateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_DEEPSLATE).strength(2.5F, 3.0F)
                    .sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "sculk_inlaid_deepslate")))));
    public static final DeferredBlock<Block> POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            () -> new PressurePlateBlock(ModBlockSetType.POLISHED_DEEPSLATE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE).sound(SoundType.POLISHED_DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_deepslate_pressure_plate")))));
    public static final DeferredBlock<Block> POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            () -> new ButtonBlock(ModBlockSetType.POLISHED_DEEPSLATE, 20,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BUTTON).strength(0.5F).noCollission().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "polished_deepslate_button")))));

    //Blackstone Bricks
    public static final DeferredBlock<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs",
            () -> new StairBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)
                            .requiresCorrectToolForDrops().strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_polished_blackstone_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_polished_blackstone_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_polished_blackstone_brick_wall")))));
    public static final DeferredBlock<Block> BLACKSTONE_TILES = registerBlock("blackstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE).sound(SoundType.STONE)
                    .strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "blackstone_tiles")))));
    public static final DeferredBlock<Block> BLACKSTONE_TILE_STAIRS = registerBlock("blackstone_tile_stairs",
            () -> new StairBlock(Blocks.POLISHED_BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE)
                    .sound(SoundType.STONE).strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "blackstone_tile_stairs")))));
    public static final DeferredBlock<Block> BLACKSTONE_TILE_SLAB = registerBlock("blackstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "blackstone_tile_slab")))));
    public static final DeferredBlock<Block> BLACKSTONE_TILE_WALL = registerBlock("blackstone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "blackstone_tile_wall")))));
    public static final DeferredBlock<Block> CRACKED_BLACKSTONE_TILES = registerBlock("cracked_blackstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE).sound(SoundType.STONE)
                    .strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_blackstone_tiles")))));
    public static final DeferredBlock<Block> CRACKED_BLACKSTONE_TILE_STAIRS = registerBlock("cracked_blackstone_tile_stairs",
            () -> new StairBlock(Blocks.POLISHED_BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE)
                    .sound(SoundType.STONE).strength(1.5F, 6.0F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_blackstone_tile_stairs")))));
    public static final DeferredBlock<Block> CRACKED_BLACKSTONE_TILE_SLAB = registerBlock("cracked_blackstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_blackstone_tile_slab")))));
    public static final DeferredBlock<Block> CRACKED_BLACKSTONE_TILE_WALL = registerBlock("cracked_blackstone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_blackstone_tile_wall")))));
    public static final DeferredBlock<Block> BLACKSTONE_BRICK_PILLAR = registerBlock("blackstone_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)
                    .strength(3.5f, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "blackstone_brick_pillar")))));

    //Netherrack
    public static final DeferredBlock<Block> NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            () -> new StairBlock(Blocks.NETHERRACK.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK).requiresCorrectToolForDrops()
                            .strength(0.4F).sound(SoundType.NETHERRACK).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "netherrack_stairs")))));
    public static final DeferredBlock<Block> NETHERRACK_SLAB = registerBlock("netherrack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)
                    .requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "netherrack_slab")))));
    public static final DeferredBlock<Block> NETHERRACK_WALL = registerBlock("netherrack_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)
                    .requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "netherrack_wall")))));

    //Nether Bricks
    public static final DeferredBlock<Block> CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs",
            () -> new StairBlock(Blocks.NETHER_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_nether_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)
                    .sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_nether_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)
                    .sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_nether_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_NETHER_BRICK_FENCE = registerBlock("cracked_nether_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_nether_brick_fence")))));

    //Red Nether Bricks
    public static final DeferredBlock<Block> RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "red_nether_brick_fence")))));
    public static final DeferredBlock<Block> CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_red_nether_bricks")))));
    public static final DeferredBlock<Block> CRACKED_RED_NETHER_BRICK_STAIRS = registerBlock("cracked_red_nether_brick_stairs",
            () -> new StairBlock(Blocks.RED_NETHER_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_red_nether_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_RED_NETHER_BRICK_SLAB = registerBlock("cracked_red_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)
                    .sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_red_nether_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_RED_NETHER_BRICK_WALL = registerBlock("cracked_red_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)
                    .sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_red_nether_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_RED_NETHER_BRICK_FENCE = registerBlock("cracked_red_nether_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_red_nether_brick_fence")))));
    public static final DeferredBlock<Block> CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "chiseled_red_nether_bricks")))));

    //Blue Nether Bricks
    public static final DeferredBlock<Block> BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "blue_nether_bricks")))));
    public static final DeferredBlock<Block> BLUE_NETHER_BRICK_STAIRS = registerBlock("blue_nether_brick_stairs",
            () -> new StairBlock(ModBlocks.BLUE_NETHER_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "blue_nether_brick_stairs")))));
    public static final DeferredBlock<Block> BLUE_NETHER_BRICK_SLAB = registerBlock("blue_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.BLUE_NETHER_BRICKS.get())
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "blue_nether_brick_slab")))));
    public static final DeferredBlock<Block> BLUE_NETHER_BRICK_WALL = registerBlock("blue_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.BLUE_NETHER_BRICKS.get())
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "blue_nether_brick_wall")))));
    public static final DeferredBlock<Block> BLUE_NETHER_BRICK_FENCE = registerBlock("blue_nether_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "blue_nether_brick_fence")))));
    public static final DeferredBlock<Block> CRACKED_BLUE_NETHER_BRICKS = registerBlock("cracked_blue_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_blue_nether_bricks")))));
    public static final DeferredBlock<Block> CRACKED_BLUE_NETHER_BRICK_STAIRS = registerBlock("cracked_blue_nether_brick_stairs",
            () -> new StairBlock(ModBlocks.BLUE_NETHER_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_blue_nether_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_BLUE_NETHER_BRICK_SLAB = registerBlock("cracked_blue_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.BLUE_NETHER_BRICKS.get())
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_blue_nether_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_BLUE_NETHER_BRICK_WALL = registerBlock("cracked_blue_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.BLUE_NETHER_BRICKS.get())
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_blue_nether_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_BLUE_NETHER_BRICK_FENCE = registerBlock("cracked_blue_nether_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_FENCE)
                    .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_blue_nether_brick_fence")))));
    public static final DeferredBlock<Block> CHISELED_BLUE_NETHER_BRICKS = registerBlock("chiseled_blue_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(ModBlocks.BLUE_NETHER_BRICKS.get()).strength(2.0F, 6.0F)
                    .sound(SoundType.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "chiseled_blue_nether_bricks")))));

    //Prismarine Blocks
    public static final DeferredBlock<Block> PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "prismarine_brick_wall")))));
    public static final DeferredBlock<Block> DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "dark_prismarine_wall")))));
    public static final DeferredBlock<Block> CRACKED_PRISMARINE_BRICKS = registerBlock("cracked_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_prismarine_bricks")))));
    public static final DeferredBlock<Block> CRACKED_PRISMARINE_BRICK_STAIRS = registerBlock("cracked_prismarine_brick_stairs",
            () -> new StairBlock(Blocks.PRISMARINE_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_prismarine_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_PRISMARINE_BRICK_SLAB = registerBlock("cracked_prismarine_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_prismarine_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_PRISMARINE_BRICK_WALL = registerBlock("cracked_prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_prismarine_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_PRISMARINE_BRICKS = registerBlock("mossy_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_prismarine_bricks")))));
    public static final DeferredBlock<Block> MOSSY_PRISMARINE_BRICK_STAIRS = registerBlock("mossy_prismarine_brick_stairs",
            () -> new StairBlock(Blocks.PRISMARINE_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_prismarine_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_PRISMARINE_BRICK_SLAB = registerBlock("mossy_prismarine_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_prismarine_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_PRISMARINE_BRICK_WALL = registerBlock("mossy_prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_prismarine_brick_wall")))));
    public static final DeferredBlock<Block> CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "chiseled_prismarine_bricks")))));
    public static final DeferredBlock<Block> PRISMARINE_BRICK_PILLAR = registerBlock("prismarine_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "prismarine_brick_pillar")))));

    //Smooth Basalt
    public static final DeferredBlock<Block> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            () -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT).requiresCorrectToolForDrops()
                            .strength(1.25F, 4.2F).sound(SoundType.BASALT).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "smooth_basalt_stairs")))));
    public static final DeferredBlock<Block> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT)
                    .requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "smooth_basalt_slab")))));
    public static final DeferredBlock<Block> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT)
                    .requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "smooth_basalt_wall")))));

    //Sandstone Blocks
    public static final DeferredBlock<Block> SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "smooth_sandstone_wall")))));
    public static final DeferredBlock<Block> CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            () -> new StairBlock(Blocks.SANDSTONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE).strength(0.8F)
                            .requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cut_sandstone_stairs")))));
    public static final DeferredBlock<Block> CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE)
                    .strength(0.8F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cut_sandstone_wall")))));
    public static final DeferredBlock<Block> SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).strength(0.8F)
                    .sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "sandstone_bricks")))));
    public static final DeferredBlock<Block> SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            () -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "sandstone_brick_stairs")))));
    public static final DeferredBlock<Block> SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "sandstone_brick_slab")))));
    public static final DeferredBlock<Block> SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "sandstone_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_SANDSTONE_BRICKS = registerBlock("cracked_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).strength(0.8F)
                    .sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_sandstone_bricks")))));
    public static final DeferredBlock<Block> CRACKED_SANDSTONE_BRICK_STAIRS = registerBlock("cracked_sandstone_brick_stairs",
            () -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_sandstone_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_SANDSTONE_BRICK_SLAB = registerBlock("cracked_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_sandstone_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_SANDSTONE_BRICK_WALL = registerBlock("cracked_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_sandstone_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_SANDSTONE_BRICKS = registerBlock("mossy_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).strength(0.8F)
                    .sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_sandstone_bricks")))));
    public static final DeferredBlock<Block> MOSSY_SANDSTONE_BRICK_STAIRS = registerBlock("mossy_sandstone_brick_stairs",
            () -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_sandstone_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_SANDSTONE_BRICK_SLAB = registerBlock("mossy_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_sandstone_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_SANDSTONE_BRICK_WALL = registerBlock("mossy_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_sandstone_brick_wall")))));
    public static final DeferredBlock<Block> SANDSTONE_BRICK_PILLAR = registerBlock("sandstone_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).strength(0.8F)
                    .sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "sandstone_brick_pillar")))));

    //Red Sandstone Blocks
    public static final DeferredBlock<Block> SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_RED_SANDSTONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "smooth_red_sandstone_wall")))));
    public static final DeferredBlock<Block> CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            () -> new StairBlock(Blocks.RED_SANDSTONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_RED_SANDSTONE).strength(0.8F)
                            .requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "cut_red_sandstone_stairs")))));
    public static final DeferredBlock<Block> CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_RED_SANDSTONE)
                    .strength(0.8F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cut_red_sandstone_wall")))));
    public static final DeferredBlock<Block> RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).strength(0.8F)
                    .sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "red_sandstone_bricks")))));
    public static final DeferredBlock<Block> RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs",
            () -> new StairBlock(Blocks.RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "red_sandstone_brick_stairs")))));
    public static final DeferredBlock<Block> RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "red_sandstone_brick_slab")))));
    public static final DeferredBlock<Block> RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "red_sandstone_brick_wall")))));
    public static final DeferredBlock<Block> CRACKED_RED_SANDSTONE_BRICKS = registerBlock("cracked_red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).strength(0.8F)
                    .sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_red_sandstone_bricks")))));
    public static final DeferredBlock<Block> CRACKED_RED_SANDSTONE_BRICK_STAIRS = registerBlock("cracked_red_sandstone_brick_stairs",
            () -> new StairBlock(Blocks.RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_red_sandstone_brick_stairs")))));
    public static final DeferredBlock<Block> CRACKED_RED_SANDSTONE_BRICK_SLAB = registerBlock("cracked_red_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_red_sandstone_brick_slab")))));
    public static final DeferredBlock<Block> CRACKED_RED_SANDSTONE_BRICK_WALL = registerBlock("cracked_red_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cracked_red_sandstone_brick_wall")))));
    public static final DeferredBlock<Block> MOSSY_RED_SANDSTONE_BRICKS = registerBlock("mossy_red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).strength(0.8F)
                    .sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_red_sandstone_bricks")))));
    public static final DeferredBlock<Block> MOSSY_RED_SANDSTONE_BRICK_STAIRS = registerBlock("mossy_red_sandstone_brick_stairs",
            () -> new StairBlock(Blocks.RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_red_sandstone_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_RED_SANDSTONE_BRICK_SLAB = registerBlock("mossy_red_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_red_sandstone_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_RED_SANDSTONE_BRICK_WALL = registerBlock("mossy_red_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)
                    .strength(0.8F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_red_sandstone_brick_wall")))));
    public static final DeferredBlock<Block> RED_SANDSTONE_BRICK_PILLAR = registerBlock("red_sandstone_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).strength(0.8F)
                    .sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "red_sandstone_brick_pillar")))));

    //Purpur Blocks
    public static final DeferredBlock<Block> PURPUR_WALL = registerBlock("purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "purpur_wall")))));
    public static final DeferredBlock<Block> CHISELED_PURPUR = registerBlock("chiseled_purpur",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).strength(1.5F, 6.0F)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "chiseled_purpur")))));

    //Snow Blocks
    public static final DeferredBlock<Block> SNOW_BRICKS = registerBlock("snow_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK).strength(0.2F).sound(SoundType.SNOW).setId(ResourceKey.create(Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "snow_bricks")))));
    public static final DeferredBlock<Block> SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            () -> new StairBlock(Blocks.SNOW_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK)
                    .strength(0.2F).sound(SoundType.SNOW).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "snow_brick_stairs")))));
    public static final DeferredBlock<Block> SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK).strength(0.2F).sound(SoundType.SNOW).setId(ResourceKey.create(Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "snow_brick_slab")))));
    public static final DeferredBlock<Block> SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK).strength(0.2F).sound(SoundType.SNOW).setId(ResourceKey.create(Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "snow_brick_wall")))));

    //Tinted Glass Pane
    public static final DeferredBlock<Block> TINTED_GLASS_PANE = registerBlock("tinted_glass_pane",
            () -> new TintedGlassPaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS_PANE).strength(0.3F).sound(SoundType.GLASS).mapColor(MapColor.COLOR_GRAY)
                    .noOcclusion().isValidSpawn(Blocks::never).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "tinted_glass_pane")))));

    //Terracotta Variants
    public static final DeferredBlock<Block> TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            () -> new StairBlock(Blocks.TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "terracotta_stairs")))));
    public static final DeferredBlock<Block> TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "terracotta_slab")))));
    public static final DeferredBlock<Block> TERRACOTTA_WALL = registerBlock("terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "terracotta_wall")))));
    public static final DeferredBlock<Block> WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            () -> new StairBlock(Blocks.WHITE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "white_terracotta_stairs")))));
    public static final DeferredBlock<Block> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "white_terracotta_slab")))));
    public static final DeferredBlock<Block> WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "white_terracotta_wall")))));
    public static final DeferredBlock<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "light_gray_terracotta_stairs")))));
    public static final DeferredBlock<Block> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "light_gray_terracotta_slab")))));
    public static final DeferredBlock<Block> LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "light_gray_terracotta_wall")))));
    public static final DeferredBlock<Block> GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            () -> new StairBlock(Blocks.GRAY_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "gray_terracotta_stairs")))));
    public static final DeferredBlock<Block> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "gray_terracotta_slab")))));
    public static final DeferredBlock<Block> GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "gray_terracotta_wall")))));
    public static final DeferredBlock<Block> BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            () -> new StairBlock(Blocks.BLACK_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "black_terracotta_stairs")))));
    public static final DeferredBlock<Block> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "black_terracotta_slab")))));
    public static final DeferredBlock<Block> BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "black_terracotta_wall")))));
    public static final DeferredBlock<Block> BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            () -> new StairBlock(Blocks.BROWN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "brown_terracotta_stairs")))));
    public static final DeferredBlock<Block> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "brown_terracotta_slab")))));
    public static final DeferredBlock<Block> BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "brown_terracotta_wall")))));
    public static final DeferredBlock<Block> RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            () -> new StairBlock(Blocks.RED_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "red_terracotta_stairs")))));
    public static final DeferredBlock<Block> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "red_terracotta_slab")))));
    public static final DeferredBlock<Block> RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "red_terracotta_wall")))));
    public static final DeferredBlock<Block> ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            () -> new StairBlock(Blocks.ORANGE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "orange_terracotta_stairs")))));
    public static final DeferredBlock<Block> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "orange_terracotta_slab")))));
    public static final DeferredBlock<Block> ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "orange_terracotta_wall")))));
    public static final DeferredBlock<Block> YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            () -> new StairBlock(Blocks.YELLOW_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "yellow_terracotta_stairs")))));
    public static final DeferredBlock<Block> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "yellow_terracotta_slab")))));
    public static final DeferredBlock<Block> YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "yellow_terracotta_wall")))));
    public static final DeferredBlock<Block> LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            () -> new StairBlock(Blocks.LIME_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "lime_terracotta_stairs")))));
    public static final DeferredBlock<Block> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "lime_terracotta_slab")))));
    public static final DeferredBlock<Block> LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "lime_terracotta_wall")))));
    public static final DeferredBlock<Block> GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            () -> new StairBlock(Blocks.GREEN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "green_terracotta_stairs")))));
    public static final DeferredBlock<Block> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "green_terracotta_slab")))));
    public static final DeferredBlock<Block> GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "green_terracotta_wall")))));
    public static final DeferredBlock<Block> CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            () -> new StairBlock(Blocks.CYAN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cyan_terracotta_stairs")))));
    public static final DeferredBlock<Block> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cyan_terracotta_slab")))));
    public static final DeferredBlock<Block> CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cyan_terracotta_wall")))));
    public static final DeferredBlock<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "light_blue_terracotta_stairs")))));
    public static final DeferredBlock<Block> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "light_blue_terracotta_slab")))));
    public static final DeferredBlock<Block> LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "light_blue_terracotta_wall")))));
    public static final DeferredBlock<Block> BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            () -> new StairBlock(Blocks.BLUE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "blue_terracotta_stairs")))));
    public static final DeferredBlock<Block> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "blue_terracotta_slab")))));
    public static final DeferredBlock<Block> BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "blue_terracotta_wall")))));
    public static final DeferredBlock<Block> PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            () -> new StairBlock(Blocks.PURPLE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "purple_terracotta_stairs")))));
    public static final DeferredBlock<Block> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "purple_terracotta_slab")))));
    public static final DeferredBlock<Block> PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "purple_terracotta_wall")))));
    public static final DeferredBlock<Block> MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            () -> new StairBlock(Blocks.MAGENTA_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "magenta_terracotta_stairs")))));
    public static final DeferredBlock<Block> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "magenta_terracotta_slab")))));
    public static final DeferredBlock<Block> MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "magenta_terracotta_wall")))));
    public static final DeferredBlock<Block> PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            () -> new StairBlock(Blocks.PINK_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "pink_terracotta_stairs")))));
    public static final DeferredBlock<Block> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "pink_terracotta_slab")))));
    public static final DeferredBlock<Block> PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "pink_terracotta_wall")))));


    //Concrete Variants
    public static final DeferredBlock<Block> WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            () -> new StairBlock(Blocks.WHITE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "white_concrete_stairs")))));
    public static final DeferredBlock<Block> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "white_concrete_slab")))));
    public static final DeferredBlock<Block> WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "white_concrete_wall")))));
    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "light_gray_concrete_stairs")))));
    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "light_gray_concrete_slab")))));
    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "light_gray_concrete_wall")))));
    public static final DeferredBlock<Block> GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            () -> new StairBlock(Blocks.GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "gray_concrete_stairs")))));
    public static final DeferredBlock<Block> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "gray_concrete_slab")))));
    public static final DeferredBlock<Block> GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "gray_concrete_wall")))));
    public static final DeferredBlock<Block> BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            () -> new StairBlock(Blocks.BLACK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "black_concrete_stairs")))));
    public static final DeferredBlock<Block> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "black_concrete_slab")))));
    public static final DeferredBlock<Block> BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "black_concrete_wall")))));
    public static final DeferredBlock<Block> BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            () -> new StairBlock(Blocks.BROWN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "brown_concrete_stairs")))));
    public static final DeferredBlock<Block> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "brown_concrete_slab")))));
    public static final DeferredBlock<Block> BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "brown_concrete_wall")))));
    public static final DeferredBlock<Block> RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            () -> new StairBlock(Blocks.RED_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "red_concrete_stairs")))));
    public static final DeferredBlock<Block> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "red_concrete_slab")))));
    public static final DeferredBlock<Block> RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "red_concrete_wall")))));
    public static final DeferredBlock<Block> ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            () -> new StairBlock(Blocks.ORANGE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "orange_concrete_stairs")))));
    public static final DeferredBlock<Block> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "orange_concrete_slab")))));
    public static final DeferredBlock<Block> ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "orange_concrete_wall")))));
    public static final DeferredBlock<Block> YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            () -> new StairBlock(Blocks.YELLOW_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "yellow_concrete_stairs")))));
    public static final DeferredBlock<Block> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "yellow_concrete_slab")))));
    public static final DeferredBlock<Block> YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "yellow_concrete_wall")))));
    public static final DeferredBlock<Block> LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            () -> new StairBlock(Blocks.LIME_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "lime_concrete_stairs")))));
    public static final DeferredBlock<Block> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "lime_concrete_slab")))));
    public static final DeferredBlock<Block> LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "lime_concrete_wall")))));
    public static final DeferredBlock<Block> GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            () -> new StairBlock(Blocks.GREEN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "green_concrete_stairs")))));
    public static final DeferredBlock<Block> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "green_concrete_slab")))));
    public static final DeferredBlock<Block> GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "green_concrete_wall")))));
    public static final DeferredBlock<Block> CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            () -> new StairBlock(Blocks.CYAN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cyan_concrete_stairs")))));
    public static final DeferredBlock<Block> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cyan_concrete_slab")))));
    public static final DeferredBlock<Block> CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "cyan_concrete_wall")))));
    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "light_blue_concrete_stairs")))));
    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "light_blue_concrete_slab")))));
    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "light_blue_concrete_wall")))));
    public static final DeferredBlock<Block> BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            () -> new StairBlock(Blocks.BLUE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "blue_concrete_stairs")))));
    public static final DeferredBlock<Block> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "blue_concrete_slab")))));
    public static final DeferredBlock<Block> BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "blue_concrete_wall")))));
    public static final DeferredBlock<Block> PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            () -> new StairBlock(Blocks.PURPLE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "purple_concrete_stairs")))));
    public static final DeferredBlock<Block> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "purple_concrete_slab")))));
    public static final DeferredBlock<Block> PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "purple_concrete_wall")))));
    public static final DeferredBlock<Block> MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            () -> new StairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "magenta_concrete_stairs")))));
    public static final DeferredBlock<Block> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "magenta_concrete_slab")))));
    public static final DeferredBlock<Block> MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "magenta_concrete_wall")))));
    public static final DeferredBlock<Block> PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            () -> new StairBlock(Blocks.PINK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)
                    .sound(SoundType.STONE).strength(1.25F, 4.2F).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "pink_concrete_stairs")))));
    public static final DeferredBlock<Block> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "pink_concrete_slab")))));
    public static final DeferredBlock<Block> PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)
                    .strength(1.25F, 4.2F).sound(SoundType.STONE).setId(ResourceKey.create(Registries.BLOCK,
                            ResourceLocation.fromNamespaceAndPath(MOD_ID, "pink_concrete_wall")))));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().useBlockDescriptionPrefix()
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, name)))));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        CinchsMissingBlocks.LOGGER.info("Registering ModBlocks for " + MOD_ID);
    }
}