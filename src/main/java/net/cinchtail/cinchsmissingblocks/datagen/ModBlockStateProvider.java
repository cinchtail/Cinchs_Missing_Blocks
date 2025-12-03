package net.cinchtail.cinchsmissingblocks.datagen;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.cinchtail.cinchsmissingblocks.block.ModBlocks.*;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CinchsMissingBlocks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(CHISELED_END_STONE_BRICKS);
        blockWithItem(CHISELED_RED_NETHER_BRICKS);
        blockWithItem(CRACKED_RED_NETHER_BRICKS);
        blockWithItem(MOSSY_MUD_BRICKS);
        blockWithItem(CHISELED_MUD_BRICKS);
        blockWithItem(CRACKED_MUD_BRICKS);
        blockWithItem(POLISHED_CALCITE);
        blockWithItem(POLISHED_DRIPSTONE);
        blockWithItem(CRACKED_QUARTZ_BRICKS);
        blockWithItem(CRACKED_BRICKS);
        blockWithItem(CRACKED_PRISMARINE_BRICKS);
        blockWithItem(CRACKED_END_STONE_BRICKS);
        blockWithItem(MOSSY_BRICKS);
        blockWithItem(MOSSY_QUARTZ_BRICKS);
        blockWithItem(CRACKED_TUFF_BRICKS);
        blockWithItem(MOSSY_TUFF_BRICKS);
        blockWithItem(CALCITE_BRICKS);
        blockWithItem(CRACKED_CALCITE_BRICKS);
        blockWithItem(MOSSY_CALCITE_BRICKS);
        blockWithItem(DRIPSTONE_BRICKS);
        blockWithItem(CRACKED_DRIPSTONE_BRICKS);
        blockWithItem(MOSSY_DRIPSTONE_BRICKS);
        blockWithItem(ANDESITE_BRICKS);
        blockWithItem(CRACKED_ANDESITE_BRICKS);
        blockWithItem(MOSSY_ANDESITE_BRICKS);
        blockWithItem(GRANITE_BRICKS);
        blockWithItem(CRACKED_GRANITE_BRICKS);
        blockWithItem(MOSSY_GRANITE_BRICKS);
        blockWithItem(CHISELED_BRICKS);
        blockWithItem(DIORITE_BRICKS);
        blockWithItem(CRACKED_DIORITE_BRICKS);
        blockWithItem(MOSSY_DIORITE_BRICKS);
        blockWithItem(CHISELED_PURPUR);
        blockWithItem(CHISELED_ANDESITE_BRICKS);
        blockWithItem(CHISELED_GRANITE_BRICKS);
        blockWithItem(CHISELED_DIORITE_BRICKS);

        vanillaSlabBlock(CALCITE_SLAB, Blocks.CALCITE);
        vanillaSlabBlock(DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK);
        vanillaSlabBlock(QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS);
        vanillaSlabBlock(END_STONE_SLAB, Blocks.END_STONE);
        modSlabBlock(MOSSY_MUD_BRICK_SLAB, MOSSY_MUD_BRICKS);
        modSlabBlock(POLISHED_CALCITE_SLAB, POLISHED_CALCITE);
        modSlabBlock(POLISHED_DRIPSTONE_SLAB, POLISHED_DRIPSTONE);
        vanillaSlabBlock(CRACKED_STONE_BRICK_SLAB, Blocks.CRACKED_STONE_BRICKS);
        vanillaSlabBlock(CRACKED_DEEPSLATE_BRICK_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS);
        vanillaSlabBlock(CRACKED_DEEPSLATE_TILE_SLAB, Blocks.CRACKED_DEEPSLATE_TILES);
        vanillaSlabBlock(CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        vanillaSlabBlock(CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS);
        modSlabBlock(CRACKED_RED_NETHER_BRICK_SLAB, CRACKED_RED_NETHER_BRICKS);
        modSlabBlock(CRACKED_MUD_BRICK_SLAB, CRACKED_MUD_BRICKS);
        modSlabBlock(CRACKED_QUARTZ_BRICK_SLAB, CRACKED_QUARTZ_BRICKS);
        vanillaSlabBlock(SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT);
        modSlabBlock(CRACKED_BRICK_SLAB, CRACKED_BRICKS);
        modSlabBlock(CRACKED_PRISMARINE_BRICK_SLAB, CRACKED_PRISMARINE_BRICKS);
        modSlabBlock(CRACKED_END_STONE_BRICK_SLAB, CRACKED_END_STONE_BRICKS);
        modSlabBlock(MOSSY_BRICK_SLAB, MOSSY_BRICKS);
        modSlabBlock(MOSSY_QUARTZ_BRICK_SLAB, MOSSY_QUARTZ_BRICKS);
        modSlabBlock(CRACKED_TUFF_BRICK_SLAB, CRACKED_TUFF_BRICKS);
        modSlabBlock(MOSSY_TUFF_BRICK_SLAB, MOSSY_TUFF_BRICKS);
        modSlabBlock(CALCITE_BRICK_SLAB, CALCITE_BRICKS);
        modSlabBlock(CRACKED_CALCITE_BRICK_SLAB, CRACKED_CALCITE_BRICKS);
        modSlabBlock(MOSSY_CALCITE_BRICK_SLAB, MOSSY_CALCITE_BRICKS);
        modSlabBlock(DRIPSTONE_BRICK_SLAB, DRIPSTONE_BRICKS);
        modSlabBlock(CRACKED_DRIPSTONE_BRICK_SLAB, CRACKED_DRIPSTONE_BRICKS);
        modSlabBlock(MOSSY_DRIPSTONE_BRICK_SLAB, MOSSY_DRIPSTONE_BRICKS);
        modSlabBlock(ANDESITE_BRICK_SLAB, ANDESITE_BRICKS);
        modSlabBlock(CRACKED_ANDESITE_BRICK_SLAB, CRACKED_ANDESITE_BRICKS);
        modSlabBlock(MOSSY_ANDESITE_BRICK_SLAB, MOSSY_ANDESITE_BRICKS);
        modSlabBlock(GRANITE_BRICK_SLAB, GRANITE_BRICKS);
        modSlabBlock(CRACKED_GRANITE_BRICK_SLAB, CRACKED_GRANITE_BRICKS);
        modSlabBlock(MOSSY_GRANITE_BRICK_SLAB, MOSSY_GRANITE_BRICKS);
        modSlabBlock(DIORITE_BRICK_SLAB, DIORITE_BRICKS);
        modSlabBlock(CRACKED_DIORITE_BRICK_SLAB, CRACKED_DIORITE_BRICKS);
        modSlabBlock(MOSSY_DIORITE_BRICK_SLAB, MOSSY_DIORITE_BRICKS);
        vanillaSlabBlock(NETHERRACK_SLAB, Blocks.NETHERRACK);
        vanillaSlabBlock(PACKED_MUD_SLAB, Blocks.PACKED_MUD);


        vanillaStairsBlock(SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
        vanillaStairsBlock(CALCITE_STAIRS, Blocks.CALCITE);
        vanillaStairsBlock(DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);
        vanillaStairsBlock(QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);
        vanillaStairsBlock(END_STONE_STAIRS, Blocks.END_STONE);
        modStairsBlock(MOSSY_MUD_BRICK_STAIRS, MOSSY_MUD_BRICKS);
        modStairsBlock(POLISHED_CALCITE_STAIRS, POLISHED_CALCITE);
        modStairsBlock(POLISHED_DRIPSTONE_STAIRS, POLISHED_DRIPSTONE);
        vanillaStairsBlock(CRACKED_STONE_BRICK_STAIRS, Blocks.CRACKED_STONE_BRICKS);
        vanillaStairsBlock(CRACKED_DEEPSLATE_BRICK_STAIRS, Blocks.CRACKED_DEEPSLATE_BRICKS);
        vanillaStairsBlock( CRACKED_DEEPSLATE_TILE_STAIRS, Blocks.CRACKED_DEEPSLATE_TILES);
        vanillaStairsBlock(CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        vanillaStairsBlock(CRACKED_NETHER_BRICK_STAIRS, Blocks.CRACKED_NETHER_BRICKS);
        modStairsBlock(CRACKED_RED_NETHER_BRICK_STAIRS, CRACKED_RED_NETHER_BRICKS);
        modStairsBlock(CRACKED_MUD_BRICK_STAIRS, CRACKED_MUD_BRICKS);
        modStairsBlock(CRACKED_QUARTZ_BRICK_STAIRS, CRACKED_QUARTZ_BRICKS);
        vanillaStairsBlock(SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);
        modStairsBlock(CRACKED_BRICK_STAIRS, CRACKED_BRICKS);
        modStairsBlock(CRACKED_PRISMARINE_BRICK_STAIRS, CRACKED_PRISMARINE_BRICKS);
        modStairsBlock(CRACKED_END_STONE_BRICK_STAIRS, CRACKED_END_STONE_BRICKS);
        modStairsBlock(MOSSY_BRICK_STAIRS, MOSSY_BRICKS);
        modStairsBlock(MOSSY_QUARTZ_BRICK_STAIRS, MOSSY_QUARTZ_BRICKS);
        modStairsBlock(CRACKED_TUFF_BRICK_STAIRS, CRACKED_TUFF_BRICKS);
        modStairsBlock(MOSSY_TUFF_BRICK_STAIRS, MOSSY_TUFF_BRICKS);
        modStairsBlock(CALCITE_BRICK_STAIRS, CALCITE_BRICKS);
        modStairsBlock(CRACKED_CALCITE_BRICK_STAIRS, CRACKED_CALCITE_BRICKS);
        modStairsBlock(MOSSY_CALCITE_BRICK_STAIRS, MOSSY_CALCITE_BRICKS);
        modStairsBlock(DRIPSTONE_BRICK_STAIRS, DRIPSTONE_BRICKS);
        modStairsBlock(CRACKED_DRIPSTONE_BRICK_STAIRS, CRACKED_DRIPSTONE_BRICKS);
        modStairsBlock(MOSSY_DRIPSTONE_BRICK_STAIRS, MOSSY_DRIPSTONE_BRICKS);
        modStairsBlock(ANDESITE_BRICK_STAIRS, ANDESITE_BRICKS);
        modStairsBlock(CRACKED_ANDESITE_BRICK_STAIRS, CRACKED_ANDESITE_BRICKS);
        modStairsBlock(MOSSY_ANDESITE_BRICK_STAIRS, MOSSY_ANDESITE_BRICKS);
        modStairsBlock(GRANITE_BRICK_STAIRS, GRANITE_BRICKS);
        modStairsBlock(CRACKED_GRANITE_BRICK_STAIRS, CRACKED_GRANITE_BRICKS);
        modStairsBlock(MOSSY_GRANITE_BRICK_STAIRS, MOSSY_GRANITE_BRICKS);
        modStairsBlock(DIORITE_BRICK_STAIRS, DIORITE_BRICKS);
        modStairsBlock(CRACKED_DIORITE_BRICK_STAIRS, CRACKED_DIORITE_BRICKS);
        modStairsBlock(MOSSY_DIORITE_BRICK_STAIRS, MOSSY_DIORITE_BRICKS);
        vanillaStairsBlock(NETHERRACK_STAIRS, Blocks.NETHERRACK);
        vanillaStairsBlock(PACKED_MUD_STAIRS, Blocks.PACKED_MUD);


        vanillaWallBlock(SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);
        vanillaWallBlock(STONE_WALL, Blocks.STONE);
        vanillaWallBlock(POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
        vanillaWallBlock(POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
        vanillaWallBlock(POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
        vanillaWallBlock(PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);
        vanillaWallBlock(DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);
        vanillaWallBlock(PURPUR_WALL, Blocks.PURPUR_BLOCK);
        vanillaWallBlock(CALCITE_WALL, Blocks.CALCITE);
        vanillaWallBlock(DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);
        vanillaWallBlock(QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);
        vanillaWallBlock(END_STONE_WALL, Blocks.END_STONE);
        vanillaWallBlock(CRACKED_STONE_BRICK_WALL, Blocks.CRACKED_STONE_BRICKS);
        vanillaWallBlock(CRACKED_DEEPSLATE_BRICK_WALL, Blocks.CRACKED_DEEPSLATE_BRICKS);
        vanillaWallBlock(CRACKED_DEEPSLATE_TILE_WALL, Blocks.CRACKED_DEEPSLATE_TILES);
        vanillaWallBlock(CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        vanillaWallBlock(CRACKED_NETHER_BRICK_WALL, Blocks.CRACKED_NETHER_BRICKS);
        vanillaWallBlock(SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);
        modWallBlock(MOSSY_MUD_BRICK_WALL, MOSSY_MUD_BRICKS);
        modWallBlock(POLISHED_CALCITE_WALL, POLISHED_CALCITE);
        modWallBlock(POLISHED_DRIPSTONE_WALL, POLISHED_DRIPSTONE);
        modWallBlock(CRACKED_RED_NETHER_BRICK_WALL, CRACKED_RED_NETHER_BRICKS);
        modWallBlock(CRACKED_MUD_BRICK_WALL, CRACKED_MUD_BRICKS);
        modWallBlock(CRACKED_QUARTZ_BRICK_WALL, CRACKED_QUARTZ_BRICKS);
        modWallBlock(CRACKED_BRICK_WALL, CRACKED_BRICKS);
        modWallBlock(CRACKED_PRISMARINE_BRICK_WALL, CRACKED_PRISMARINE_BRICKS);
        modWallBlock(CRACKED_END_STONE_BRICK_WALL, CRACKED_END_STONE_BRICKS);
        modWallBlock(MOSSY_BRICK_WALL, MOSSY_BRICKS);
        modWallBlock(MOSSY_QUARTZ_BRICK_WALL, MOSSY_QUARTZ_BRICKS);
        modWallBlock(CRACKED_TUFF_BRICK_WALL, CRACKED_TUFF_BRICKS);
        modWallBlock(MOSSY_TUFF_BRICK_WALL, MOSSY_TUFF_BRICKS);
        modWallBlock(CALCITE_BRICK_WALL, CALCITE_BRICKS);
        modWallBlock(CRACKED_CALCITE_BRICK_WALL, CRACKED_CALCITE_BRICKS);
        modWallBlock(MOSSY_CALCITE_BRICK_WALL, MOSSY_CALCITE_BRICKS);
        modWallBlock(DRIPSTONE_BRICK_WALL, DRIPSTONE_BRICKS);
        modWallBlock(CRACKED_DRIPSTONE_BRICK_WALL, CRACKED_DRIPSTONE_BRICKS);
        modWallBlock(MOSSY_DRIPSTONE_BRICK_WALL, MOSSY_DRIPSTONE_BRICKS);
        modWallBlock(ANDESITE_BRICK_WALL, ANDESITE_BRICKS);
        modWallBlock(CRACKED_ANDESITE_BRICK_WALL, CRACKED_ANDESITE_BRICKS);
        modWallBlock(MOSSY_ANDESITE_BRICK_WALL, MOSSY_ANDESITE_BRICKS);
        modWallBlock(GRANITE_BRICK_WALL, GRANITE_BRICKS);
        modWallBlock(CRACKED_GRANITE_BRICK_WALL, CRACKED_GRANITE_BRICKS);
        modWallBlock(MOSSY_GRANITE_BRICK_WALL, MOSSY_GRANITE_BRICKS);
        modWallBlock(DIORITE_BRICK_WALL, DIORITE_BRICKS);
        modWallBlock(CRACKED_DIORITE_BRICK_WALL, CRACKED_DIORITE_BRICKS);
        modWallBlock(MOSSY_DIORITE_BRICK_WALL, MOSSY_DIORITE_BRICKS);
        vanillaWallBlock(NETHERRACK_WALL, Blocks.NETHERRACK);
        vanillaWallBlock(PACKED_MUD_WALL, Blocks.PACKED_MUD);


        vanillaFenceBlock(RED_NETHER_BRICK_FENCE, Blocks.RED_NETHER_BRICKS);
        vanillaFenceBlock(CRACKED_NETHER_BRICK_FENCE, Blocks.CRACKED_NETHER_BRICKS);
        modFenceBlock(CRACKED_RED_NETHER_BRICK_FENCE, CRACKED_RED_NETHER_BRICKS);

        axisBlock((RotatedPillarBlock) END_STONE_PILLAR.get(), ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "block/end_stone_pillar_side"),
                ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "block/end_stone_pillar_top"));
    }
    public void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    public void vanillaStairsBlock(RegistryObject<Block> block, Block texture) {
        simpleBlockItem(block.get(), models().withExistingParent((block.get()).asItem().toString(), blockTexture(block)));
        stairsBlock((StairBlock)block.get(), blockTexture(texture));
    }
    public void modStairsBlock(RegistryObject<Block> block, RegistryObject<Block> texture) {
        simpleBlockItem(block.get(), models().withExistingParent((block.get()).asItem().toString(), blockTexture(block)));
        stairsBlock((StairBlock)block.get(), blockTexture(texture));
    }
    public void vanillaSlabBlock(RegistryObject<Block> block, Block texture) {
        simpleBlockItem(block.get(), models().withExistingParent(block.get().asItem().toString(), blockTexture(block)));
        slabBlock((SlabBlock) block.get(), ForgeRegistries.BLOCKS.getKey(texture), blockTexture(texture));
    }
    public void modSlabBlock(RegistryObject<Block> block, RegistryObject<Block> texture) {
        simpleBlockItem(block.get(), models().withExistingParent((block.get()).asItem().toString(), blockTexture(block)));
        slabBlock((SlabBlock)block.get(), texture.getId(), blockTexture(texture));
    }
    public void vanillaWallBlock(RegistryObject<Block> block, Block texture) {
        simpleBlockItem(block.get(), models().wallInventory(key(block).getPath() + "_inventory", blockTexture(texture)));
        wallBlock((WallBlock)block.get(), blockTexture(texture));
    }
    public void modWallBlock(RegistryObject<Block> block, RegistryObject<Block> texture) {
        simpleBlockItem(block.get(), models().wallInventory(key(block).getPath() + "_inventory", blockTexture(texture)));
        wallBlock((WallBlock) block.get(), blockTexture(texture));
    }
    public void vanillaFenceBlock(RegistryObject<Block> block, Block texture) {
        simpleBlockItem(block.get(), models().fenceInventory(key(block).toString(), blockTexture(texture)));
        fenceBlock((FenceBlock) block.get(), blockTexture(texture));
    }
    public void modFenceBlock(RegistryObject<Block> block, RegistryObject<Block> texture) {
        simpleBlockItem(block.get(), models().fenceInventory(key(block).toString(), blockTexture(texture)));
        fenceBlock((FenceBlock) block.get(), blockTexture(texture));
    }
    public String getName(Supplier<? extends Block> block) {
        return block.get().builtInRegistryHolder().key().location().getPath();
    }
    public ResourceLocation blockLoc(Supplier<? extends Block> block) {
        return ResourceLocation.fromNamespaceAndPath(CinchsMissingBlocks.MOD_ID, "block/" + getName(block));
    }
    public ResourceLocation blockTexture(RegistryObject<Block> block) {
        ResourceLocation name = key(block);
        return ResourceLocation.fromNamespaceAndPath(name.getNamespace(), ModItemModelProvider.BLOCK_FOLDER + "/" + name.getPath());
    }
    public ResourceLocation blockTexture(RegistryObject<Block> block, String string) {
        ResourceLocation name = key(block);
        return ResourceLocation.fromNamespaceAndPath(name.getNamespace(), ModelProvider.BLOCK_FOLDER + "/" + name.getPath() + string);
    }
    private ResourceLocation key(RegistryObject<Block> block) {
        return ForgeRegistries.BLOCKS.getKey(block.get());
    }
    private String name(RegistryObject<Block> block) {
        return key(block).getPath();
    }
}