package net.cinchtail.cinchsmissingblocks.block;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.cinchtail.cinchsmissingblocks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CinchsMissingBlocks.MOD_ID);

    //Miscellaneous Blocks
    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            () -> new StairBlock(STONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE)
                    .strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STONE_WALL = registerBlock("stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE)
                    .strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_GRANITE)
                    .strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_ANDESITE)
                    .strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_DIORITE)
                    .strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(PRISMARINE_BRICKS)
                    .strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(DARK_PRISMARINE)
                    .strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CUT_SANDSTONE)
                    .strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            () -> new StairBlock(SANDSTONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CUT_SANDSTONE).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CUT_RED_SANDSTONE)
                    .strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            () -> new StairBlock(SANDSTONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CUT_RED_SANDSTONE).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_SANDSTONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_RED_SANDSTONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> QUARTZ_WALL = registerBlock("quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BLOCK)
                    .strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_QUARTZ)
                    .strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPUR_WALL = registerBlock("purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(PURPUR_BLOCK)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALCITE_STAIRS = registerBlock("calcite_stairs",
            () -> new StairBlock(STONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_SLAB = registerBlock("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_WALL = registerBlock("calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            () -> new StairBlock(STONE_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_WALL = registerBlock("dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairBlock(QUARTZ_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(QUARTZ_BLOCK).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BLOCK)
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BLOCK)
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(END_STONE).strength(3.0F, 9.0F).sound(SoundType.STONE)));
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
    public static final RegistryObject<Block> RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(NETHER_BRICK_FENCE)
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(NETHER_BRICK_FENCE).strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CHISELED_MUD_BRICKS = registerBlock("chiseled_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS).strength(1.5f).sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
            () -> new StairBlock(STONE_BRICK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CRACKED_STONE_BRICKS).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CRACKED_STONE_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CRACKED_STONE_BRICKS)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
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
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs",
            () -> new StairBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE)
                            .requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs",
            () -> new StairBlock(Blocks.CRACKED_NETHER_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_NETHER_BRICKS).requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_FENCE = registerBlock("cracked_nether_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(NETHER_BRICK_FENCE)
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));
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


    //New Block Sets
    public static final RegistryObject<Block> MOSSY_MUD_BRICKS = registerBlock("mossy_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS).strength(1.5f)
                    .sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_MUD_BRICK_STAIRS = registerBlock("mossy_mud_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_MUD_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS).strength(1.5f)
                            .requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> MOSSY_MUD_BRICK_SLAB = registerBlock("mossy_mud_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS)
                    .strength(1.5f).requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> MOSSY_MUD_BRICK_WALL = registerBlock("mossy_mud_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS)
                    .strength(1.5f).requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> POLISHED_CALCITE = registerBlock("polished_calcite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1f)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1f)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_BRICKS = registerBlock("calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1f)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1f)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1f)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_CALCITE_BRICK_STAIRS = registerBlock("cracked_calcite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1f)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CRACKED_CALCITE_BRICK_SLAB = registerBlock("cracked_calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CRACKED_CALCITE_BRICK_WALL = registerBlock("cracked_calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> MOSSY_CALCITE_BRICKS = registerBlock("mossy_calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1f)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_CALCITE_BRICK_STAIRS = registerBlock("mossy_calcite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CALCITE).strength(1f)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> MOSSY_CALCITE_BRICK_SLAB = registerBlock("mossy_calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> MOSSY_CALCITE_BRICK_WALL = registerBlock("mossy_calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CALCITE)
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(2f)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(2f)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(2f)
                    .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).strength(2f)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).strength(2f)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CRACKED_DRIPSTONE_BRICKS = registerBlock("cracked_dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).strength(2f)
                    .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_DRIPSTONE_BRICK_STAIRS = registerBlock("cracked_dripstone_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).strength(2f)
                            .requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CRACKED_DRIPSTONE_BRICK_SLAB = registerBlock("cracked_dripstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CRACKED_DRIPSTONE_BRICK_WALL = registerBlock("cracked_dripstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(RED_NETHER_BRICKS).strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICK_STAIRS = registerBlock("cracked_red_nether_brick_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_RED_NETHER_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(CRACKED_NETHER_BRICKS).requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICK_SLAB = registerBlock("cracked_red_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(CRACKED_NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICK_WALL = registerBlock("cracked_red_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CRACKED_NETHER_BRICKS)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICK_FENCE = registerBlock("cracked_red_nether_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(NETHER_BRICK_FENCE)
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_MUD_BRICKS = registerBlock("cracked_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).strength(1.5f)
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
    public static final RegistryObject<Block> CRACKED_BRICKS = registerBlock("cracked_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).instrument(NoteBlockInstrument.BASEDRUM).strength(2.0F, 6.0F)
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
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).instrument(NoteBlockInstrument.BASEDRUM).strength(2.0F, 6.0F)
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
    public static final RegistryObject<Block> CRACKED_PRISMARINE_BRICKS = registerBlock("cracked_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).instrument(NoteBlockInstrument.BASEDRUM).strength(1.5F, 6.0F)
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
    public static final RegistryObject<Block> CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_STAIRS = registerBlock("cracked_end_stone_brick_stairs",
            () -> new StairBlock(END_STONE_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS).requiresCorrectToolForDrops()
                            .strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_SLAB = registerBlock("cracked_end_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_WALL = registerBlock("cracked_end_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)
                    .requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));
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
    public static final RegistryObject<Block> CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS).strength(1.5F, 6.0F)
                    .sound(SoundType.TUFF_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_TUFF_BRICK_STAIRS = registerBlock("cracked_tuff_brick_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_TUFF_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS).requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS)));
    public static final RegistryObject<Block> CRACKED_TUFF_BRICK_SLAB = registerBlock("cracked_tuff_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> CRACKED_TUFF_BRICK_WALL = registerBlock("cracked_tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS).requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS)));
    public static final RegistryObject<Block> MOSSY_TUFF_BRICKS = registerBlock("mossy_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5F, 6.0F)
                    .sound(SoundType.TUFF_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_TUFF_BRICK_STAIRS = registerBlock("mossy_tuff_brick_stairs",
            () -> new StairBlock(TUFF_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.TUFF_BRICKS)));
    public static final RegistryObject<Block> MOSSY_TUFF_BRICK_SLAB = registerBlock("mossy_tuff_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.TUFF_BRICKS)));
    public static final RegistryObject<Block> MOSSY_TUFF_BRICK_WALL = registerBlock("mossy_tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.TUFF_BRICKS)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}