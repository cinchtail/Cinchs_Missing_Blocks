package net.cinchtail.cinchsmissingblocks.datagen;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TextureMap;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator gen) {
        BlockStateModelGenerator.BlockTexturePool polishedCalcitePool = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_CALCITE);
        BlockStateModelGenerator.BlockTexturePool calciteBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CALCITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedCalciteBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_CALCITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyCalciteBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_CALCITE_BRICKS);

        BlockModelHelpers.stairs(gen, ModBlocks.CALCITE_STAIRS, TextureMap.getId(Blocks.CALCITE));
        BlockModelHelpers.slab(gen, ModBlocks.CALCITE_SLAB, Blocks.CALCITE, TextureMap.getId(Blocks.CALCITE));
        BlockModelHelpers.wall(gen, ModBlocks.CALCITE_WALL, TextureMap.getId(Blocks.CALCITE));

        polishedCalcitePool.stairs(ModBlocks.POLISHED_CALCITE_STAIRS);
        polishedCalcitePool.slab(ModBlocks.POLISHED_CALCITE_SLAB);
        polishedCalcitePool.wall(ModBlocks.POLISHED_CALCITE_WALL);

        calciteBricksPool.stairs(ModBlocks.CALCITE_BRICK_STAIRS);
        calciteBricksPool.slab(ModBlocks.CALCITE_BRICK_SLAB);
        calciteBricksPool.wall(ModBlocks.CALCITE_BRICK_WALL);

        crackedCalciteBricksPool.stairs(ModBlocks.CRACKED_CALCITE_BRICK_STAIRS);
        crackedCalciteBricksPool.slab(ModBlocks.CRACKED_CALCITE_BRICK_SLAB);
        crackedCalciteBricksPool.wall(ModBlocks.CRACKED_CALCITE_BRICK_WALL);

        mossyCalciteBricksPool.stairs(ModBlocks.MOSSY_CALCITE_BRICK_STAIRS);
        mossyCalciteBricksPool.slab(ModBlocks.MOSSY_CALCITE_BRICK_SLAB);
        mossyCalciteBricksPool.wall(ModBlocks.MOSSY_CALCITE_BRICK_WALL);

        BlockModelHelpers.cubeColumn(gen, ModBlocks.CHISELED_CALCITE_BRICKS, Identifier.of("cinchsmissingblocks:block/chiseled_calcite_bricks_top"),
                Identifier.of("cinchsmissingblocks:block/chiseled_calcite_bricks_side"));

        BlockModelHelpers.pillar(gen,ModBlocks.CALCITE_BRICK_PILLAR, Identifier.of("cinchsmissingblocks:block/calcite_brick_pillar_top"),
                Identifier.of("cinchsmissingblocks:block/calcite_brick_pillar_side"));

        BlockStateModelGenerator.BlockTexturePool polishedDripstonePool = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DRIPSTONE);
        BlockStateModelGenerator.BlockTexturePool dripstoneBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.DRIPSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedDripstoneBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_DRIPSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyDripstoneBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_DRIPSTONE_BRICKS);

        BlockModelHelpers.stairs(gen, ModBlocks.DRIPSTONE_STAIRS, TextureMap.getId(Blocks.DRIPSTONE_BLOCK));
        BlockModelHelpers.slab(gen, ModBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK, TextureMap.getId(Blocks.DRIPSTONE_BLOCK));
        BlockModelHelpers.wall(gen, ModBlocks.DRIPSTONE_WALL, TextureMap.getId(Blocks.DRIPSTONE_BLOCK));

        polishedDripstonePool.stairs(ModBlocks.POLISHED_DRIPSTONE_STAIRS);
        polishedDripstonePool.slab(ModBlocks.POLISHED_DRIPSTONE_SLAB);
        polishedDripstonePool.wall(ModBlocks.POLISHED_DRIPSTONE_WALL);

        dripstoneBricksPool.stairs(ModBlocks.DRIPSTONE_BRICK_STAIRS);
        dripstoneBricksPool.slab(ModBlocks.DRIPSTONE_BRICK_SLAB);
        dripstoneBricksPool.wall(ModBlocks.DRIPSTONE_BRICK_WALL);

        crackedDripstoneBricksPool.stairs(ModBlocks.CRACKED_DRIPSTONE_BRICK_STAIRS);
        crackedDripstoneBricksPool.slab(ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB);
        crackedDripstoneBricksPool.wall(ModBlocks.CRACKED_DRIPSTONE_BRICK_WALL);

        mossyDripstoneBricksPool.stairs(ModBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS);
        mossyDripstoneBricksPool.slab(ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB);
        mossyDripstoneBricksPool.wall(ModBlocks.MOSSY_DRIPSTONE_BRICK_WALL);

        BlockModelHelpers.cubeColumn(gen, ModBlocks.CHISELED_DRIPSTONE_BRICKS, Identifier.of("cinchsmissingblocks:block/chiseled_dripstone_bricks_top"),
                Identifier.of("cinchsmissingblocks:block/chiseled_dripstone_bricks_side"));

        BlockModelHelpers.pillar(gen,ModBlocks.DRIPSTONE_BRICK_PILLAR, Identifier.of("cinchsmissingblocks:block/dripstone_brick_pillar_top"),
                Identifier.of("cinchsmissingblocks:block/dripstone_brick_pillar_side"));

        BlockStateModelGenerator.BlockTexturePool crackedTuffBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_TUFF_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyTuffBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_TUFF_BRICKS);

        crackedTuffBricksPool.stairs(ModBlocks.CRACKED_TUFF_BRICK_STAIRS);
        crackedTuffBricksPool.slab(ModBlocks.CRACKED_TUFF_BRICK_SLAB);
        crackedTuffBricksPool.wall(ModBlocks.CRACKED_TUFF_BRICK_WALL);

        mossyTuffBricksPool.stairs(ModBlocks.MOSSY_TUFF_BRICK_STAIRS);
        mossyTuffBricksPool.slab(ModBlocks.MOSSY_TUFF_BRICK_SLAB);
        mossyTuffBricksPool.wall(ModBlocks.MOSSY_TUFF_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool andesiteBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedAndesiteBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_ANDESITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyAndesiteBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_ANDESITE_BRICKS);

        BlockModelHelpers.wall(gen, ModBlocks.POLISHED_ANDESITE_WALL, TextureMap.getId(Blocks.POLISHED_ANDESITE));

        andesiteBricksPool.stairs(ModBlocks.ANDESITE_BRICK_STAIRS);
        andesiteBricksPool.slab(ModBlocks.ANDESITE_BRICK_SLAB);
        andesiteBricksPool.wall(ModBlocks.ANDESITE_BRICK_WALL);

        crackedAndesiteBricksPool.stairs(ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS);
        crackedAndesiteBricksPool.slab(ModBlocks.CRACKED_ANDESITE_BRICK_SLAB);
        crackedAndesiteBricksPool.wall(ModBlocks.CRACKED_ANDESITE_BRICK_WALL);

        mossyAndesiteBricksPool.stairs(ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS);
        mossyAndesiteBricksPool.slab(ModBlocks.MOSSY_ANDESITE_BRICK_SLAB);
        mossyAndesiteBricksPool.wall(ModBlocks.MOSSY_ANDESITE_BRICK_WALL);

        gen.registerSimpleCubeAll(ModBlocks.CHISELED_ANDESITE_BRICKS);

        BlockModelHelpers.pillar(gen,ModBlocks.ANDESITE_BRICK_PILLAR, Identifier.of("cinchsmissingblocks:block/andesite_brick_pillar_top"),
                Identifier.of("cinchsmissingblocks:block/andesite_brick_pillar_side"));

        BlockStateModelGenerator.BlockTexturePool graniteBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedGraniteBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyGraniteBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_GRANITE_BRICKS);

        BlockModelHelpers.wall(gen, ModBlocks.POLISHED_GRANITE_WALL, TextureMap.getId(Blocks.POLISHED_GRANITE));

        graniteBricksPool.stairs(ModBlocks.GRANITE_BRICK_STAIRS);
        graniteBricksPool.slab(ModBlocks.GRANITE_BRICK_SLAB);
        graniteBricksPool.wall(ModBlocks.GRANITE_BRICK_WALL);

        crackedGraniteBricksPool.stairs(ModBlocks.CRACKED_GRANITE_BRICK_STAIRS);
        crackedGraniteBricksPool.slab(ModBlocks.CRACKED_GRANITE_BRICK_SLAB);
        crackedGraniteBricksPool.wall(ModBlocks.CRACKED_GRANITE_BRICK_WALL);

        mossyGraniteBricksPool.stairs(ModBlocks.MOSSY_GRANITE_BRICK_STAIRS);
        mossyGraniteBricksPool.slab(ModBlocks.MOSSY_GRANITE_BRICK_SLAB);
        mossyGraniteBricksPool.wall(ModBlocks.MOSSY_GRANITE_BRICK_WALL);

        gen.registerSimpleCubeAll(ModBlocks.CHISELED_GRANITE_BRICKS);

        BlockModelHelpers.pillar(gen,ModBlocks.GRANITE_BRICK_PILLAR, Identifier.of("cinchsmissingblocks:block/granite_brick_pillar_top"),
                Identifier.of("cinchsmissingblocks:block/granite_brick_pillar_side"));

        BlockStateModelGenerator.BlockTexturePool dioriteBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.DIORITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedDioriteBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_DIORITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyDioriteBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_DIORITE_BRICKS);

        BlockModelHelpers.wall(gen, ModBlocks.POLISHED_DIORITE_WALL, TextureMap.getId(Blocks.POLISHED_DIORITE));

        dioriteBricksPool.stairs(ModBlocks.DIORITE_BRICK_STAIRS);
        dioriteBricksPool.slab(ModBlocks.DIORITE_BRICK_SLAB);
        dioriteBricksPool.wall(ModBlocks.DIORITE_BRICK_WALL);

        crackedDioriteBricksPool.stairs(ModBlocks.CRACKED_DIORITE_BRICK_STAIRS);
        crackedDioriteBricksPool.slab(ModBlocks.CRACKED_DIORITE_BRICK_SLAB);
        crackedDioriteBricksPool.wall(ModBlocks.CRACKED_DIORITE_BRICK_WALL);

        mossyDioriteBricksPool.stairs(ModBlocks.MOSSY_DIORITE_BRICK_STAIRS);
        mossyDioriteBricksPool.slab(ModBlocks.MOSSY_DIORITE_BRICK_SLAB);
        mossyDioriteBricksPool.wall(ModBlocks.MOSSY_DIORITE_BRICK_WALL);

        gen.registerSimpleCubeAll(ModBlocks.CHISELED_DIORITE_BRICKS);

        BlockModelHelpers.pillar(gen,ModBlocks.DIORITE_BRICK_PILLAR, Identifier.of("cinchsmissingblocks:block/diorite_brick_pillar_top"),
                Identifier.of("cinchsmissingblocks:block/diorite_brick_pillar_side"));

        BlockStateModelGenerator.BlockTexturePool crackedQuartzBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_QUARTZ_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyQuartzBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_QUARTZ_BRICKS);

        BlockModelHelpers.wall(gen, ModBlocks.QUARTZ_WALL, Identifier.of("minecraft:block/quartz_block_side"));
        BlockModelHelpers.wall(gen, ModBlocks.SMOOTH_QUARTZ_WALL, Identifier.of("minecraft:block/quartz_block_bottom"));

        BlockModelHelpers.stairs(gen, ModBlocks.QUARTZ_BRICK_STAIRS, TextureMap.getId(Blocks.QUARTZ_BRICKS));
        BlockModelHelpers.slab(gen, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS, TextureMap.getId(Blocks.QUARTZ_BRICKS));
        BlockModelHelpers.wall(gen, ModBlocks.QUARTZ_BRICK_WALL, TextureMap.getId(Blocks.QUARTZ_BRICKS));

        crackedQuartzBricksPool.stairs(ModBlocks.CRACKED_QUARTZ_BRICK_STAIRS);
        crackedQuartzBricksPool.slab(ModBlocks.CRACKED_QUARTZ_BRICK_SLAB);
        crackedQuartzBricksPool.wall(ModBlocks.CRACKED_QUARTZ_BRICK_WALL);

        mossyQuartzBricksPool.stairs(ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS);
        mossyQuartzBricksPool.slab(ModBlocks.MOSSY_QUARTZ_BRICK_SLAB);
        mossyQuartzBricksPool.wall(ModBlocks.MOSSY_QUARTZ_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool crackedBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_BRICKS);

        crackedBricksPool.stairs(ModBlocks.CRACKED_BRICK_STAIRS);
        crackedBricksPool.slab(ModBlocks.CRACKED_BRICK_SLAB);
        crackedBricksPool.wall(ModBlocks.CRACKED_BRICK_WALL);

        mossyBricksPool.stairs(ModBlocks.MOSSY_BRICK_STAIRS);
        mossyBricksPool.slab(ModBlocks.MOSSY_BRICK_SLAB);
        mossyBricksPool.wall(ModBlocks.MOSSY_BRICK_WALL);

        gen.registerSimpleCubeAll(ModBlocks.CHISELED_BRICKS);

        BlockStateModelGenerator.BlockTexturePool crackedMudBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_MUD_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyMudBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_MUD_BRICKS);

        BlockModelHelpers.stairs(gen, ModBlocks.PACKED_MUD_STAIRS, TextureMap.getId(Blocks.PACKED_MUD));
        BlockModelHelpers.slab(gen, ModBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD, TextureMap.getId(Blocks.PACKED_MUD));
        BlockModelHelpers.wall(gen, ModBlocks.PACKED_MUD_WALL, TextureMap.getId(Blocks.PACKED_MUD));

        crackedMudBricksPool.stairs(ModBlocks.CRACKED_MUD_BRICK_STAIRS);
        crackedMudBricksPool.slab(ModBlocks.CRACKED_MUD_BRICK_SLAB);
        crackedMudBricksPool.wall(ModBlocks.CRACKED_MUD_BRICK_WALL);

        mossyMudBricksPool.stairs(ModBlocks.MOSSY_MUD_BRICK_STAIRS);
        mossyMudBricksPool.slab(ModBlocks.MOSSY_MUD_BRICK_SLAB);
        mossyMudBricksPool.wall(ModBlocks.MOSSY_MUD_BRICK_WALL);

        gen.registerSimpleCubeAll(ModBlocks.CHISELED_MUD_BRICKS);

        BlockModelHelpers.pillar(gen,ModBlocks.MUD_BRICK_PILLAR, Identifier.of("cinchsmissingblocks:block/mud_brick_pillar_top"),
                Identifier.of("cinchsmissingblocks:block/mud_brick_pillar_side"));

        BlockStateModelGenerator.BlockTexturePool crackedResinBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_RESIN_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyResinBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_RESIN_BRICKS);

        crackedResinBricksPool.stairs(ModBlocks.CRACKED_RESIN_BRICK_STAIRS);
        crackedResinBricksPool.slab(ModBlocks.CRACKED_RESIN_BRICK_SLAB);
        crackedResinBricksPool.wall(ModBlocks.CRACKED_RESIN_BRICK_WALL);

        mossyResinBricksPool.stairs(ModBlocks.MOSSY_RESIN_BRICK_STAIRS);
        mossyResinBricksPool.slab(ModBlocks.MOSSY_RESIN_BRICK_SLAB);
        mossyResinBricksPool.wall(ModBlocks.MOSSY_RESIN_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool polishedEndStoneBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_END_STONE);
        BlockStateModelGenerator.BlockTexturePool crackedEndStoneBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_END_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyEndStoneBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_END_STONE_BRICKS);

        BlockModelHelpers.stairs(gen, ModBlocks.END_STONE_STAIRS, TextureMap.getId(Blocks.END_STONE));
        BlockModelHelpers.slab(gen, ModBlocks.END_STONE_SLAB, Blocks.END_STONE, TextureMap.getId(Blocks.END_STONE));
        BlockModelHelpers.wall(gen, ModBlocks.END_STONE_WALL, TextureMap.getId(Blocks.END_STONE));

        polishedEndStoneBricksPool.stairs(ModBlocks.POLISHED_END_STONE_STAIRS);
        polishedEndStoneBricksPool.slab(ModBlocks.POLISHED_END_STONE_SLAB);
        polishedEndStoneBricksPool.wall(ModBlocks.POLISHED_END_STONE_WALL);

        crackedEndStoneBricksPool.stairs(ModBlocks.CRACKED_END_STONE_BRICK_STAIRS);
        crackedEndStoneBricksPool.slab(ModBlocks.CRACKED_END_STONE_BRICK_SLAB);
        crackedEndStoneBricksPool.wall(ModBlocks.CRACKED_END_STONE_BRICK_WALL);

        mossyEndStoneBricksPool.stairs(ModBlocks.MOSSY_END_STONE_BRICK_STAIRS);
        mossyEndStoneBricksPool.slab(ModBlocks.MOSSY_END_STONE_BRICK_SLAB);
        mossyEndStoneBricksPool.wall(ModBlocks.MOSSY_END_STONE_BRICK_WALL);

        gen.registerSimpleCubeAll(ModBlocks.CHISELED_END_STONE_BRICKS);

        BlockModelHelpers.pillar(gen,ModBlocks.END_STONE_BRICK_PILLAR, Identifier.of("cinchsmissingblocks:block/end_stone_brick_pillar_top"),
                Identifier.of("cinchsmissingblocks:block/end_stone_brick_pillar_side"));

        BlockModelHelpers.wall(gen, ModBlocks.STONE_WALL, TextureMap.getId(Blocks.STONE));
        BlockModelHelpers.stairs(gen, ModBlocks.SMOOTH_STONE_STAIRS, TextureMap.getId(Blocks.SMOOTH_STONE));
        BlockModelHelpers.wall(gen, ModBlocks.SMOOTH_STONE_WALL, TextureMap.getId(Blocks.SMOOTH_STONE));

        BlockModelHelpers.stairs(gen, ModBlocks.CRACKED_STONE_BRICK_STAIRS, TextureMap.getId(Blocks.CRACKED_STONE_BRICKS));
        BlockModelHelpers.slab(gen, ModBlocks.CRACKED_STONE_BRICK_SLAB, Blocks.CRACKED_STONE_BRICKS, TextureMap.getId(Blocks.CRACKED_STONE_BRICKS));
        BlockModelHelpers.wall(gen, ModBlocks.CRACKED_STONE_BRICK_WALL, TextureMap.getId(Blocks.CRACKED_STONE_BRICKS));

        BlockStateModelGenerator.BlockTexturePool stoneTilesPool = gen.registerCubeAllModelTexturePool(ModBlocks.STONE_TILES);
        BlockStateModelGenerator.BlockTexturePool crackedStoneTilesPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_STONE_TILES);
        BlockStateModelGenerator.BlockTexturePool mossyStoneTilesPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_STONE_TILES);

        stoneTilesPool.stairs(ModBlocks.STONE_TILE_STAIRS);
        stoneTilesPool.slab(ModBlocks.STONE_TILE_SLAB);
        stoneTilesPool.wall(ModBlocks.STONE_TILE_WALL);
        crackedStoneTilesPool.stairs(ModBlocks.CRACKED_STONE_TILE_STAIRS);
        crackedStoneTilesPool.slab(ModBlocks.CRACKED_STONE_TILE_SLAB);
        crackedStoneTilesPool.wall(ModBlocks.CRACKED_STONE_TILE_WALL);
        mossyStoneTilesPool.stairs(ModBlocks.MOSSY_STONE_TILE_STAIRS);
        mossyStoneTilesPool.slab(ModBlocks.MOSSY_STONE_TILE_SLAB);
        mossyStoneTilesPool.wall(ModBlocks.MOSSY_STONE_TILE_WALL);

        BlockModelHelpers.pillar(gen,ModBlocks.STONE_BRICK_PILLAR, Identifier.of("cinchsmissingblocks:block/stone_brick_pillar_top"),
                Identifier.of("cinchsmissingblocks:block/stone_brick_pillar_side"));

        BlockStateModelGenerator.BlockTexturePool mossyCobbledDeepslatePool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_COBBLED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool mossyDeepslateBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_DEEPSLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyDeepslatetilesPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_DEEPSLATE_TILES);

        gen.registerParentedItemModel(ModBlocks.DEEPSLATE_STAIRS, Identifier.of("cinchsmissingblocks:block/deepslate_stairs"));
        gen.registerParentedItemModel(ModBlocks.DEEPSLATE_SLAB, Identifier.of("cinchsmissingblocks:block/deepslate_slab"));
        gen.registerParentedItemModel(ModBlocks.DEEPSLATE_WALL, Identifier.of("cinchsmissingblocks:block/deepslate_wall_inventory"));

        mossyCobbledDeepslatePool.stairs(ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS);
        mossyCobbledDeepslatePool.slab(ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB);
        mossyCobbledDeepslatePool.wall(ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL);

        BlockModelHelpers.stairs(gen, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, TextureMap.getId(Blocks.CRACKED_DEEPSLATE_BRICKS));
        BlockModelHelpers.slab(gen, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS, TextureMap.getId(Blocks.CRACKED_DEEPSLATE_BRICKS));
        BlockModelHelpers.wall(gen, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL, TextureMap.getId(Blocks.CRACKED_DEEPSLATE_BRICKS));

        mossyDeepslateBricksPool.stairs(ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
        mossyDeepslateBricksPool.slab(ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
        mossyDeepslateBricksPool.wall(ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL);

        BlockModelHelpers.stairs(gen, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, TextureMap.getId(Blocks.CRACKED_DEEPSLATE_TILES));
        BlockModelHelpers.slab(gen, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Blocks.CRACKED_DEEPSLATE_TILES, TextureMap.getId(Blocks.CRACKED_DEEPSLATE_TILES));
        BlockModelHelpers.wall(gen, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL, TextureMap.getId(Blocks.CRACKED_DEEPSLATE_TILES));

        mossyDeepslatetilesPool.stairs(ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS);
        mossyDeepslatetilesPool.slab(ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB);
        mossyDeepslatetilesPool.wall(ModBlocks.MOSSY_DEEPSLATE_TILE_WALL);

        BlockModelHelpers.pillar(gen,ModBlocks.DEEPSLATE_BRICK_PILLAR, Identifier.of("cinchsmissingblocks:block/deepslate_brick_pillar_top"),
                Identifier.of("cinchsmissingblocks:block/deepslate_brick_pillar_side"));

        gen.registerParentedItemModel(ModBlocks.SCULK_INLAID_DEEPSLATE, Identifier.of("cinchsmissingblocks:block/sculk_inlaid_deepslate"));

        BlockModelHelpers.button(gen, ModBlocks.POLISHED_DEEPSLATE_BUTTON, TextureMap.getId(Blocks.POLISHED_DEEPSLATE));
        BlockModelHelpers.pressurePlate(gen, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, TextureMap.getId(Blocks.POLISHED_DEEPSLATE));

        BlockModelHelpers.stairs(gen, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, TextureMap.getId(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
        BlockModelHelpers.slab(gen, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, TextureMap.getId(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
        BlockModelHelpers.wall(gen, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, TextureMap.getId(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));

        BlockStateModelGenerator.BlockTexturePool blacktoneTilesPool = gen.registerCubeAllModelTexturePool(ModBlocks.BLACKSTONE_TILES);
        BlockStateModelGenerator.BlockTexturePool crackedBlacktoneTilesPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_BLACKSTONE_TILES);

        blacktoneTilesPool.stairs(ModBlocks.BLACKSTONE_TILE_STAIRS);
        blacktoneTilesPool.slab(ModBlocks.BLACKSTONE_TILE_SLAB);
        blacktoneTilesPool.wall(ModBlocks.BLACKSTONE_TILE_WALL);
        crackedBlacktoneTilesPool.stairs(ModBlocks.CRACKED_BLACKSTONE_TILE_STAIRS);
        crackedBlacktoneTilesPool.slab(ModBlocks.CRACKED_BLACKSTONE_TILE_SLAB);
        crackedBlacktoneTilesPool.wall(ModBlocks.CRACKED_BLACKSTONE_TILE_WALL);

        BlockModelHelpers.pillar(gen,ModBlocks.BLACKSTONE_BRICK_PILLAR, Identifier.of("cinchsmissingblocks:block/blackstone_brick_pillar_top"),
                Identifier.of("cinchsmissingblocks:block/blackstone_brick_pillar_side"));

        BlockModelHelpers.stairs(gen, ModBlocks.NETHERRACK_STAIRS, TextureMap.getId(Blocks.NETHERRACK));
        BlockModelHelpers.slab(gen, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK, TextureMap.getId(Blocks.NETHERRACK));
        BlockModelHelpers.wall(gen, ModBlocks.NETHERRACK_WALL, TextureMap.getId(Blocks.NETHERRACK));

        BlockModelHelpers.stairs(gen, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, TextureMap.getId(Blocks.CRACKED_NETHER_BRICKS));
        BlockModelHelpers.slab(gen, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS, TextureMap.getId(Blocks.CRACKED_NETHER_BRICKS));
        BlockModelHelpers.wall(gen, ModBlocks.CRACKED_NETHER_BRICK_WALL, TextureMap.getId(Blocks.CRACKED_NETHER_BRICKS));
        BlockModelHelpers.fence(gen, ModBlocks.CRACKED_NETHER_BRICK_FENCE, TextureMap.getId(Blocks.CRACKED_NETHER_BRICKS));

        BlockStateModelGenerator.BlockTexturePool crackedRedNetherBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_RED_NETHER_BRICKS);

        BlockModelHelpers.fence(gen, ModBlocks.RED_NETHER_BRICK_FENCE, TextureMap.getId(Blocks.RED_NETHER_BRICKS));

        crackedRedNetherBricksPool.stairs(ModBlocks.CRACKED_RED_NETHER_BRICK_STAIRS);
        crackedRedNetherBricksPool.slab(ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB);
        crackedRedNetherBricksPool.wall(ModBlocks.CRACKED_RED_NETHER_BRICK_WALL);
        crackedRedNetherBricksPool.fence(ModBlocks.CRACKED_RED_NETHER_BRICK_FENCE);

        gen.registerSimpleCubeAll(ModBlocks.CHISELED_RED_NETHER_BRICKS);

        BlockStateModelGenerator.BlockTexturePool blueNetherBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.BLUE_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedBlueNetherBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

        blueNetherBricksPool.stairs(ModBlocks.BLUE_NETHER_BRICK_STAIRS);
        blueNetherBricksPool.slab(ModBlocks.BLUE_NETHER_BRICK_SLAB);
        blueNetherBricksPool.wall(ModBlocks.BLUE_NETHER_BRICK_WALL);
        blueNetherBricksPool.fence(ModBlocks.BLUE_NETHER_BRICK_FENCE);

        crackedBlueNetherBricksPool.stairs(ModBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS);
        crackedBlueNetherBricksPool.slab(ModBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB);
        crackedBlueNetherBricksPool.wall(ModBlocks.CRACKED_BLUE_NETHER_BRICK_WALL);
        crackedBlueNetherBricksPool.fence(ModBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE);

        gen.registerSimpleCubeAll(ModBlocks.CHISELED_BLUE_NETHER_BRICKS);

        BlockStateModelGenerator.BlockTexturePool crackedPrismarineBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_PRISMARINE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyPrismarineBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_PRISMARINE_BRICKS);

        BlockModelHelpers.wall(gen, ModBlocks.PRISMARINE_BRICK_WALL, TextureMap.getId(Blocks.PRISMARINE_BRICKS));
        BlockModelHelpers.wall(gen, ModBlocks.DARK_PRISMARINE_WALL, TextureMap.getId(Blocks.DARK_PRISMARINE));

        crackedPrismarineBricksPool.stairs(ModBlocks.CRACKED_PRISMARINE_BRICK_STAIRS);
        crackedPrismarineBricksPool.slab(ModBlocks.CRACKED_PRISMARINE_BRICK_SLAB);
        crackedPrismarineBricksPool.wall(ModBlocks.CRACKED_PRISMARINE_BRICK_WALL);

        mossyPrismarineBricksPool.stairs(ModBlocks.MOSSY_PRISMARINE_BRICK_STAIRS);
        mossyPrismarineBricksPool.slab(ModBlocks.MOSSY_PRISMARINE_BRICK_SLAB);
        mossyPrismarineBricksPool.wall(ModBlocks.MOSSY_PRISMARINE_BRICK_WALL);

        gen.registerSimpleCubeAll(ModBlocks.CHISELED_PRISMARINE_BRICKS);

        BlockModelHelpers.pillar(gen,ModBlocks.PRISMARINE_BRICK_PILLAR, Identifier.of("cinchsmissingblocks:block/prismarine_brick_pillar_top"),
                Identifier.of("cinchsmissingblocks:block/prismarine_brick_pillar_side"));

        BlockStateModelGenerator.BlockTexturePool snowBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.SNOW_BRICKS);

        snowBricksPool.stairs(ModBlocks.SNOW_BRICK_STAIRS);
        snowBricksPool.slab(ModBlocks.SNOW_BRICK_SLAB);
        snowBricksPool.wall(ModBlocks.SNOW_BRICK_WALL);

        BlockModelHelpers.stairs(gen, ModBlocks.SMOOTH_BASALT_STAIRS, TextureMap.getId(Blocks.SMOOTH_BASALT));
        BlockModelHelpers.slab(gen, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT, TextureMap.getId(Blocks.SMOOTH_BASALT));
        BlockModelHelpers.wall(gen, ModBlocks.SMOOTH_BASALT_WALL, TextureMap.getId(Blocks.SMOOTH_BASALT));

        BlockModelHelpers.wall(gen, ModBlocks.SMOOTH_SANDSTONE_WALL, Identifier.of("minecraft:block/sandstone_top"));

        gen.registerParentedItemModel(ModBlocks.CUT_SANDSTONE_STAIRS, Identifier.of("cinchsmissingblocks:block/cut_sandstone_stairs"));
        gen.registerParentedItemModel(ModBlocks.CUT_SANDSTONE_WALL, Identifier.of("cinchsmissingblocks:block/cut_sandstone_wall_inventory"));

        BlockStateModelGenerator.BlockTexturePool sandStoneBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.SANDSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedSandStoneBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_SANDSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossySandStoneBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_SANDSTONE_BRICKS);

        sandStoneBricksPool.stairs(ModBlocks.SANDSTONE_BRICK_STAIRS);
        sandStoneBricksPool.slab(ModBlocks.SANDSTONE_BRICK_SLAB);
        sandStoneBricksPool.wall(ModBlocks.SANDSTONE_BRICK_WALL);

        crackedSandStoneBricksPool.stairs(ModBlocks.CRACKED_SANDSTONE_BRICK_STAIRS);
        crackedSandStoneBricksPool.slab(ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB);
        crackedSandStoneBricksPool.wall(ModBlocks.CRACKED_SANDSTONE_BRICK_WALL);

        mossySandStoneBricksPool.stairs(ModBlocks.MOSSY_SANDSTONE_BRICK_STAIRS);
        mossySandStoneBricksPool.slab(ModBlocks.MOSSY_SANDSTONE_BRICK_SLAB);
        mossySandStoneBricksPool.wall(ModBlocks.MOSSY_SANDSTONE_BRICK_WALL);

        BlockModelHelpers.wall(gen, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Identifier.of("minecraft:block/red_sandstone_top"));

        gen.registerParentedItemModel(ModBlocks.CUT_RED_SANDSTONE_STAIRS, Identifier.of("cinchsmissingblocks:block/cut_red_sandstone_stairs"));
        gen.registerParentedItemModel(ModBlocks.CUT_RED_SANDSTONE_WALL, Identifier.of("cinchsmissingblocks:block/cut_red_sandstone_wall_inventory"));

        BlockStateModelGenerator.BlockTexturePool redSandStoneBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.RED_SANDSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedRedSandStoneBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyRedSandStoneBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);

        redSandStoneBricksPool.stairs(ModBlocks.RED_SANDSTONE_BRICK_STAIRS);
        redSandStoneBricksPool.slab(ModBlocks.RED_SANDSTONE_BRICK_SLAB);
        redSandStoneBricksPool.wall(ModBlocks.RED_SANDSTONE_BRICK_WALL);

        crackedRedSandStoneBricksPool.stairs(ModBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS);
        crackedRedSandStoneBricksPool.slab(ModBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB);
        crackedRedSandStoneBricksPool.wall(ModBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL);

        mossyRedSandStoneBricksPool.stairs(ModBlocks.MOSSY_RED_SANDSTONE_BRICK_STAIRS);
        mossyRedSandStoneBricksPool.slab(ModBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB);
        mossyRedSandStoneBricksPool.wall(ModBlocks.MOSSY_RED_SANDSTONE_BRICK_WALL);

        BlockModelHelpers.wall(gen, ModBlocks.PURPUR_WALL, TextureMap.getId(Blocks.PURPUR_BLOCK));

        gen.registerSimpleCubeAll(ModBlocks.CHISELED_PURPUR);

        gen.registerGlassAndPane(Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_PANE);

        BlockModelHelpers.stairs(gen, ModBlocks.TERRACOTTA_STAIRS, TextureMap.getId(Blocks.TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA, TextureMap.getId(Blocks.TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.TERRACOTTA_WALL, TextureMap.getId(Blocks.TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.WHITE_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.WHITE_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA, TextureMap.getId(Blocks.WHITE_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.WHITE_TERRACOTTA_WALL, TextureMap.getId(Blocks.WHITE_TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.LIGHT_GRAY_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA, TextureMap.getId(Blocks.LIGHT_GRAY_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, TextureMap.getId(Blocks.LIGHT_GRAY_TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.GRAY_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.GRAY_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA, TextureMap.getId(Blocks.GRAY_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.GRAY_TERRACOTTA_WALL, TextureMap.getId(Blocks.GRAY_TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.BLACK_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.BLACK_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA, TextureMap.getId(Blocks.BLACK_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.BLACK_TERRACOTTA_WALL, TextureMap.getId(Blocks.BLACK_TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.BROWN_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.BROWN_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA, TextureMap.getId(Blocks.BROWN_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.BROWN_TERRACOTTA_WALL, TextureMap.getId(Blocks.BROWN_TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.RED_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.RED_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA, TextureMap.getId(Blocks.RED_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.RED_TERRACOTTA_WALL, TextureMap.getId(Blocks.RED_TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.ORANGE_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.ORANGE_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA, TextureMap.getId(Blocks.ORANGE_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.ORANGE_TERRACOTTA_WALL, TextureMap.getId(Blocks.ORANGE_TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.YELLOW_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.YELLOW_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA, TextureMap.getId(Blocks.YELLOW_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.YELLOW_TERRACOTTA_WALL, TextureMap.getId(Blocks.YELLOW_TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.LIME_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.LIME_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA, TextureMap.getId(Blocks.LIME_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.LIME_TERRACOTTA_WALL, TextureMap.getId(Blocks.LIME_TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.GREEN_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.GREEN_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA, TextureMap.getId(Blocks.GREEN_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.GREEN_TERRACOTTA_WALL, TextureMap.getId(Blocks.GREEN_TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.CYAN_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.CYAN_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA, TextureMap.getId(Blocks.CYAN_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.CYAN_TERRACOTTA_WALL, TextureMap.getId(Blocks.CYAN_TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.LIGHT_BLUE_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA, TextureMap.getId(Blocks.LIGHT_BLUE_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, TextureMap.getId(Blocks.LIGHT_BLUE_TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.BLUE_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.BLUE_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA, TextureMap.getId(Blocks.BLUE_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.BLUE_TERRACOTTA_WALL, TextureMap.getId(Blocks.BLUE_TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.PURPLE_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.PURPLE_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA, TextureMap.getId(Blocks.PURPLE_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.PURPLE_TERRACOTTA_WALL, TextureMap.getId(Blocks.PURPLE_TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.MAGENTA_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.MAGENTA_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA, TextureMap.getId(Blocks.MAGENTA_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.MAGENTA_TERRACOTTA_WALL, TextureMap.getId(Blocks.MAGENTA_TERRACOTTA));

        BlockModelHelpers.stairs(gen, ModBlocks.PINK_TERRACOTTA_STAIRS, TextureMap.getId(Blocks.PINK_TERRACOTTA));
        BlockModelHelpers.slab(gen, ModBlocks.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA, TextureMap.getId(Blocks.PINK_TERRACOTTA));
        BlockModelHelpers.wall(gen, ModBlocks.PINK_TERRACOTTA_WALL, TextureMap.getId(Blocks.PINK_TERRACOTTA));
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RED_NETHER_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_NETHER_BRICK, Models.GENERATED);
    }
}