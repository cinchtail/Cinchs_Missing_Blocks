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
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

import static net.minecraft.world.level.block.Blocks.*;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CinchsMissingBlocks.MOD_ID);

    //Calcite Blocks
    public static final RegistryObject<Block> CALCITE_STAIRS = registerBlock("calcite_stairs",
            (properties) -> new StairBlock(CALCITE.defaultBlockState(), properties.strength(0.75F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_SLAB = registerBlock("calcite_slab",
            (properties) -> new SlabBlock(properties.strength(0.75F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_WALL = registerBlock("calcite_wall",
            (properties) -> new WallBlock(properties.strength(0.75F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> POLISHED_CALCITE = registerBlock("polished_calcite",
            (properties) -> new Block(properties.strength(1F, 4.0F).sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            (properties) -> new StairBlock(CALCITE.defaultBlockState(),
                    properties.strength(1F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            (properties) -> new SlabBlock(properties.strength(1F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            (properties) -> new WallBlock(properties.strength(1F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_BRICKS = registerBlock("calcite_bricks",
            (properties) -> new Block(properties.strength(1F, 4.0F).sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            (properties) -> new StairBlock(CALCITE.defaultBlockState(),
                    properties.strength(1F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            (properties) -> new SlabBlock(properties.strength(1F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            (properties) -> new WallBlock(properties.strength(1F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            (properties) -> new Block(properties.strength(1F, 4.0F).sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_CALCITE_BRICK_STAIRS = registerBlock("cracked_calcite_brick_stairs",
            (properties) -> new StairBlock(CALCITE.defaultBlockState(),
                    properties.strength(1F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CRACKED_CALCITE_BRICK_SLAB = registerBlock("cracked_calcite_brick_slab",
            (properties) -> new SlabBlock(properties.strength(1F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CRACKED_CALCITE_BRICK_WALL = registerBlock("cracked_calcite_brick_wall",
            (properties) -> new WallBlock(properties.strength(1F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> MOSSY_CALCITE_BRICKS = registerBlock("mossy_calcite_bricks",
            (properties) -> new Block(properties.strength(1F, 4.0F).sound(SoundType.CALCITE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_CALCITE_BRICK_STAIRS = registerBlock("mossy_calcite_brick_stairs",
            (properties) -> new StairBlock(CALCITE.defaultBlockState(),
                    properties.strength(1F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> MOSSY_CALCITE_BRICK_SLAB = registerBlock("mossy_calcite_brick_slab",
            (properties) -> new SlabBlock(properties.strength(1F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> MOSSY_CALCITE_BRICK_WALL = registerBlock("mossy_calcite_brick_wall",
            (properties) -> new WallBlock(properties.strength(1F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CHISELED_CALCITE_BRICKS = registerBlock("chiseled_calcite_bricks",
            (properties) -> new Block(properties.strength(1F, 1.0F)
                    .sound(SoundType.CALCITE).requiresCorrectToolForDrops()));

    //Dripstone Blocks
    public static final RegistryObject<Block> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            (properties) -> new StairBlock(DRIPSTONE_BLOCK.defaultBlockState(),
                    properties.strength(1.5F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            (properties) -> new SlabBlock(properties.strength(1.5F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_WALL = registerBlock("dripstone_wall",
            (properties) -> new WallBlock(properties.strength(1.5F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            (properties) -> new Block(properties.strength(1.5F, 1.0F).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            (properties) -> new StairBlock(DRIPSTONE_BLOCK.defaultBlockState(),
                    properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            (properties) -> new SlabBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            (properties) -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            (properties) -> new StairBlock(DRIPSTONE_BLOCK.defaultBlockState(),
                    properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            (properties) -> new SlabBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            (properties) -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CRACKED_DRIPSTONE_BRICKS = registerBlock("cracked_dripstone_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_DRIPSTONE_BRICK_STAIRS = registerBlock("cracked_dripstone_brick_stairs",
            (properties) -> new StairBlock(DRIPSTONE_BLOCK.defaultBlockState(),
                    properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CRACKED_DRIPSTONE_BRICK_SLAB = registerBlock("cracked_dripstone_brick_slab",
            (properties) -> new SlabBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CRACKED_DRIPSTONE_BRICK_WALL = registerBlock("cracked_dripstone_brick_wall",
            (properties) -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MOSSY_DRIPSTONE_BRICKS = registerBlock("mossy_dripstone_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_DRIPSTONE_BRICK_STAIRS = registerBlock("mossy_dripstone_brick_stairs",
            (properties) -> new StairBlock(DRIPSTONE_BLOCK.defaultBlockState(),
                    properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MOSSY_DRIPSTONE_BRICK_SLAB = registerBlock("mossy_dripstone_brick_slab",
            (properties) -> new SlabBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MOSSY_DRIPSTONE_BRICK_WALL = registerBlock("mossy_dripstone_brick_wall",
            (properties) -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CHISELED_DRIPSTONE_BRICKS = registerBlock("chiseled_dripstone_bricks",
            (properties) -> new Block(properties.strength(1.5F, 1.0F).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));


    //Tuff Blocks
    public static final RegistryObject<Block> CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_TUFF_BRICK_STAIRS = registerBlock("cracked_tuff_brick_stairs",
            (properties) -> new StairBlock(TUFF_BRICKS.defaultBlockState(), properties.requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS)));
    public static final RegistryObject<Block> CRACKED_TUFF_BRICK_SLAB = registerBlock("cracked_tuff_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS)));
    public static final RegistryObject<Block> CRACKED_TUFF_BRICK_WALL = registerBlock("cracked_tuff_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS)));
    public static final RegistryObject<Block> MOSSY_TUFF_BRICKS = registerBlock("mossy_tuff_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.TUFF_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_TUFF_BRICK_STAIRS = registerBlock("mossy_tuff_brick_stairs",
            (properties) -> new StairBlock(TUFF_BRICKS.defaultBlockState(),
                    properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.TUFF_BRICKS)));
    public static final RegistryObject<Block> MOSSY_TUFF_BRICK_SLAB = registerBlock("mossy_tuff_brick_slab",
            (properties) -> new SlabBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.TUFF_BRICKS)));
    public static final RegistryObject<Block> MOSSY_TUFF_BRICK_WALL = registerBlock("mossy_tuff_brick_wall",
            (properties) -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.TUFF_BRICKS)));

    //Andesite Blocks
    public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            (properties) -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            (properties) -> new StairBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_ANDESITE_BRICK_STAIRS = registerBlock("cracked_andesite_brick_stairs",
            (properties) -> new StairBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_ANDESITE_BRICK_SLAB = registerBlock("cracked_andesite_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_ANDESITE_BRICK_WALL = registerBlock("cracked_andesite_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_ANDESITE_BRICKS = registerBlock("mossy_andesite_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_ANDESITE_BRICK_STAIRS = registerBlock("mossy_andesite_brick_stairs",
            (properties) -> new StairBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_ANDESITE_BRICK_SLAB = registerBlock("mossy_andesite_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_ANDESITE_BRICK_WALL = registerBlock("mossy_andesite_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_ANDESITE_BRICKS = registerBlock("chiseled_andesite_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    //Granite Blocks
    public static final RegistryObject<Block> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            (properties) -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRANITE_BRICKS = registerBlock("granite_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            (properties) -> new StairBlock(Blocks.POLISHED_GRANITE.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_GRANITE_BRICK_STAIRS = registerBlock("cracked_granite_brick_stairs",
            (properties) -> new StairBlock(Blocks.POLISHED_GRANITE.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_GRANITE_BRICK_SLAB = registerBlock("cracked_granite_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_GRANITE_BRICK_WALL = registerBlock("cracked_granite_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_GRANITE_BRICKS = registerBlock("mossy_granite_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_GRANITE_BRICK_STAIRS = registerBlock("mossy_granite_brick_stairs",
            (properties) -> new StairBlock(Blocks.POLISHED_GRANITE.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_GRANITE_BRICK_SLAB = registerBlock("mossy_granite_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_GRANITE_BRICK_WALL = registerBlock("mossy_granite_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_GRANITE_BRICKS = registerBlock("chiseled_granite_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    //Diorite Blocks
    public static final RegistryObject<Block> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            (properties) -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIORITE_BRICKS = registerBlock("diorite_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            (properties) -> new StairBlock(Blocks.POLISHED_DIORITE.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            (properties) -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_DIORITE_BRICKS = registerBlock("cracked_diorite_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_DIORITE_BRICK_STAIRS = registerBlock("cracked_diorite_brick_stairs",
            (properties) -> new StairBlock(Blocks.POLISHED_DIORITE.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_DIORITE_BRICK_SLAB = registerBlock("cracked_diorite_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_DIORITE_BRICK_WALL = registerBlock("cracked_diorite_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_DIORITE_BRICKS = registerBlock("mossy_diorite_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_DIORITE_BRICK_STAIRS = registerBlock("mossy_diorite_brick_stairs",
            (properties) -> new StairBlock(Blocks.POLISHED_DIORITE.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_DIORITE_BRICK_SLAB = registerBlock("mossy_diorite_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_DIORITE_BRICK_WALL = registerBlock("mossy_diorite_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_DIORITE_BRICKS = registerBlock("chiseled_diorite_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    //Quartz Blocks
    public static final RegistryObject<Block> QUARTZ_WALL = registerBlock("quartz_wall",
            (properties) -> new WallBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            (properties) -> new WallBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            (properties) -> new StairBlock(QUARTZ_STAIRS.defaultBlockState(),
                    properties.strength(0.8F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            (properties) -> new SlabBlock(properties.strength(0.8F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            (properties) -> new WallBlock(properties.strength(0.8F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_QUARTZ_BRICKS = registerBlock("cracked_quartz_bricks",
            (properties) -> new Block(properties.strength(0.8F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_QUARTZ_BRICK_STAIRS = registerBlock("cracked_quartz_brick_stairs",
            (properties) -> new StairBlock(ModBlocks.CRACKED_QUARTZ_BRICKS.get().defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_QUARTZ_BRICK_SLAB = registerBlock("cracked_quartz_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_QUARTZ_BRICK_WALL = registerBlock("cracked_quartz_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_QUARTZ_BRICKS = registerBlock("mossy_quartz_bricks",
            (properties) -> new Block(properties.strength(0.8F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_QUARTZ_BRICK_STAIRS = registerBlock("mossy_quartz_brick_stairs",
            (properties) -> new StairBlock(ModBlocks.CRACKED_QUARTZ_BRICKS.get().defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_QUARTZ_BRICK_SLAB = registerBlock("mossy_quartz_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_QUARTZ_BRICK_WALL = registerBlock("mossy_quartz_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    //Brick Blocks
    public static final RegistryObject<Block> CRACKED_BRICKS = registerBlock("cracked_bricks",
            (properties) -> new Block(properties.strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_BRICK_STAIRS = registerBlock("cracked_brick_stairs",
            (properties) -> new StairBlock(BRICKS.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_BRICK_SLAB = registerBlock("cracked_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_BRICK_WALL = registerBlock("cracked_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_BRICKS = registerBlock("mossy_bricks",
            (properties) -> new Block(properties.strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_BRICK_STAIRS = registerBlock("mossy_brick_stairs",
            (properties) -> new StairBlock(Blocks.BRICKS.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_BRICK_SLAB = registerBlock("mossy_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_BRICK_WALL = registerBlock("mossy_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_BRICKS = registerBlock("chiseled_bricks",
            (properties) -> new Block(properties.strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    //Mud Brick Blocks
    public static final RegistryObject<Block> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            (properties) -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)));
    public static final RegistryObject<Block> PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)));
    public static final RegistryObject<Block> PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)));
    public static final RegistryObject<Block> CRACKED_MUD_BRICKS = registerBlock("cracked_mud_bricks",
            (properties) -> new Block(properties.strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_MUD_BRICK_STAIRS = registerBlock("cracked_mud_brick_stairs",
            (properties) -> new StairBlock(ModBlocks.CRACKED_MUD_BRICKS.get().defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> CRACKED_MUD_BRICK_SLAB = registerBlock("cracked_mud_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> CRACKED_MUD_BRICK_WALL = registerBlock("cracked_mud_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> MOSSY_MUD_BRICKS = registerBlock("mossy_mud_bricks",
            (properties) -> new Block(properties.strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_MUD_BRICK_STAIRS = registerBlock("mossy_mud_brick_stairs",
            (properties) -> new StairBlock(ModBlocks.MOSSY_MUD_BRICKS.get().defaultBlockState(),
                    properties.strength(1.5F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> MOSSY_MUD_BRICK_SLAB = registerBlock("mossy_mud_brick_slab",
            (properties) -> new SlabBlock(properties.strength(1.5F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> MOSSY_MUD_BRICK_WALL = registerBlock("mossy_mud_brick_wall",
            (properties) -> new WallBlock(properties.strength(1.5F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> CHISELED_MUD_BRICKS = registerBlock("chiseled_mud_bricks",
            (properties) -> new Block(properties.strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops()));

    //Endstone Blocks
    public static final RegistryObject<Block> END_STONE_STAIRS = registerBlock("end_stone_stairs",
            (properties) -> new StairBlock(STONE_STAIRS.defaultBlockState(),
                    properties.strength(3.0F, 9.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> END_STONE_SLAB = registerBlock("end_stone_slab",
            (properties) -> new SlabBlock(properties.strength(3.0F, 9.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> END_STONE_WALL = registerBlock("end_stone_wall",
            (properties) -> new WallBlock(properties.strength(3.0F, 9.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            (properties) -> new Block(properties.requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_STAIRS = registerBlock("cracked_end_stone_brick_stairs",
            (properties) -> new StairBlock(END_STONE.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_SLAB = registerBlock("cracked_end_stone_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_WALL = registerBlock("cracked_end_stone_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            (properties) -> new Block(properties.strength(3.0F, 9.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> END_STONE_PILLAR = registerBlock("end_stone_pillar",
            (properties) -> new RotatedPillarBlock(properties.strength(3.0F, 9.0F).sound(SoundType.STONE)));

    //Stone Blocks
    public static final RegistryObject<Block> STONE_WALL = registerBlock("stone_wall",
            (properties) -> new WallBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            (properties) -> new StairBlock(STONE_STAIRS.defaultBlockState(),
                    properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            (properties) -> new WallBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
            (properties) -> new StairBlock(STONE_BRICK_STAIRS.defaultBlockState(),
                    properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            (properties) -> new SlabBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            (properties) -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //Deepslate Blocks
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs",
            (properties) -> new StairBlock(STONE_BRICK_STAIRS.defaultBlockState(),
                    properties.strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            (properties) -> new SlabBlock(properties.strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_WALL = registerBlock("cracked_deepslate_brick_wall",
            (properties) -> new WallBlock(properties.strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs",
            (properties) -> new StairBlock(Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(),
                    properties.strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab",
            (properties) -> new SlabBlock(properties.strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_WALL = registerBlock("cracked_deepslate_tile_wall",
            (properties) -> new WallBlock(properties.strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    //Blackstone Bricks
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs",
            (properties) -> new StairBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    //Netherrack
    public static final RegistryObject<Block> NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            (properties) -> new StairBlock(Blocks.NETHERRACK.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> NETHERRACK_SLAB = registerBlock("netherrack_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> NETHERRACK_WALL = registerBlock("netherrack_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));

    //Nether Bricks
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs",
            (properties) -> new StairBlock(Blocks.NETHER_BRICKS.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_FENCE = registerBlock("cracked_nether_brick_fence",
            (properties) -> new FenceBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));

    //Red Nether Bricks
    public static final RegistryObject<Block> RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            (properties) -> new FenceBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            (properties) -> new Block(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICK_STAIRS = registerBlock("cracked_red_nether_brick_stairs",
            (properties) -> new StairBlock(Blocks.RED_NETHER_BRICKS.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICK_SLAB = registerBlock("cracked_red_nether_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICK_WALL = registerBlock("cracked_red_nether_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICK_FENCE = registerBlock("cracked_red_nether_brick_fence",
            (properties) -> new FenceBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            (properties) -> new Block(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));

    //Prismarine Blocks
    public static final RegistryObject<Block> PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            (properties) -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            (properties) -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_PRISMARINE_BRICKS = registerBlock("cracked_prismarine_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_PRISMARINE_BRICK_STAIRS = registerBlock("cracked_prismarine_brick_stairs",
            (properties) -> new StairBlock(PRISMARINE_BRICKS.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_PRISMARINE_BRICK_SLAB = registerBlock("cracked_prismarine_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_PRISMARINE_BRICK_WALL = registerBlock("cracked_prismarine_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_PRISMARINE_BRICKS = registerBlock("mossy_prismarine_bricks",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_PRISMARINE_BRICK_STAIRS = registerBlock("mossy_prismarine_brick_stairs",
            (properties) -> new StairBlock(PRISMARINE_BRICKS.defaultBlockState(), properties.requiresCorrectToolForDrops()
                            .strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_PRISMARINE_BRICK_SLAB = registerBlock("mossy_prismarine_brick_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_PRISMARINE_BRICK_WALL = registerBlock("mossy_prismarine_brick_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));

    //Smooth Basalt
    public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            (properties) -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            (properties) -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            (properties) -> new WallBlock(properties.requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));

    //Sandstone Blocks
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            (properties) -> new WallBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            (properties) -> new StairBlock(SANDSTONE_STAIRS.defaultBlockState(),
                    properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            (properties) -> new WallBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //Red Sandstone Blocks
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            (properties) -> new WallBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            (properties) -> new StairBlock(SANDSTONE_STAIRS.defaultBlockState(),
                    properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            (properties) -> new WallBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //Purpur Blocks
    public static final RegistryObject<Block> PURPUR_WALL = registerBlock("purpur_wall",
            (properties) -> new WallBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_PURPUR = registerBlock("chiseled_purpur",
            (properties) -> new Block(properties.strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        RegistryObject<T> toReturn = BLOCKS.register(name,
                () -> function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, name)))));
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, name))).useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}