package net.cinchtail.cinchsmissingblocks.datagen;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
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







        BlockModelHelpers.wall(gen, ModBlocks.QUARTZ_WALL, Identifier.of("minecraft:block/quartz_block_side"));
        BlockModelHelpers.wall(gen, ModBlocks.SMOOTH_QUARTZ_WALL, Identifier.of("minecraft:block/quartz_block_bottom"));
        BlockModelHelpers.wall(gen, ModBlocks.SMOOTH_SANDSTONE_WALL, Identifier.of("minecraft:block/sandstone_top"));
        BlockModelHelpers.wall(gen, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Identifier.of("minecraft:block/red_sandstone_top"));

        BlockModelHelpers.button(gen, ModBlocks.POLISHED_DEEPSLATE_BUTTON, TextureMap.getId(Blocks.POLISHED_DEEPSLATE));
        BlockModelHelpers.pressurePlate(gen, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, TextureMap.getId(Blocks.POLISHED_DEEPSLATE));

        gen.registerParentedItemModel(ModBlocks.CUT_SANDSTONE_STAIRS, Identifier.of("cinchsmissingblocks:block/cut_sandstone_stairs"));
        gen.registerParentedItemModel(ModBlocks.CUT_SANDSTONE_WALL, Identifier.of("cinchsmissingblocks:block/cut_sandstone_wall_inventory"));
        gen.registerParentedItemModel(ModBlocks.CUT_RED_SANDSTONE_STAIRS, Identifier.of("cinchsmissingblocks:block/cut_red_sandstone_stairs"));
        gen.registerParentedItemModel(ModBlocks.CUT_RED_SANDSTONE_WALL, Identifier.of("cinchsmissingblocks:block/cut_red_sandstone_wall_inventory"));

        gen.registerParentedItemModel(ModBlocks.DEEPSLATE_STAIRS, Identifier.of("cinchsmissingblocks:block/deepslate_stairs"));
        gen.registerParentedItemModel(ModBlocks.DEEPSLATE_SLAB, Identifier.of("cinchsmissingblocks:block/deepslate_slab"));
        gen.registerParentedItemModel(ModBlocks.DEEPSLATE_WALL, Identifier.of("cinchsmissingblocks:block/deepslate_wall_inventory"));

        gen.registerParentedItemModel(ModBlocks.SCULK_INLAID_DEEPSLATE, Identifier.of("cinchsmissingblocks:block/sculk_inlaid_deepslate"));

        /*BlockStateModelGenerator.BlockTexturePool pinkGarnetPool = blockStateModelGenerator.registerStateWithModelReference(Blocks.POLISHED_DEEPSLATE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_NETHER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_END_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);

        pinkGarnetPool.stairs(ModBlocks.PINK_GARNET_STAIRS);
        pinkGarnetPool.slab(ModBlocks.PINK_GARNET_SLAB);

        pinkGarnetPool.button(ModBlocks.PINK_GARNET_BUTTON);
        pinkGarnetPool.pressurePlate(ModBlocks.PINK_GARNET_PRESSURE_PLATE);

        pinkGarnetPool.fence(ModBlocks.PINK_GARNET_FENCE);
        pinkGarnetPool.fenceGate(ModBlocks.PINK_GARNET_FENCE_GATE);
        pinkGarnetPool.wall(ModBlocks.PINK_GARNET_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.PINK_GARNET_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_GARNET_TRAPDOOR);

        blockStateModelGenerator.registerLog(ModBlocks.DRIFTWOOD_LOG).log(ModBlocks.DRIFTWOOD_LOG).wood(ModBlocks.DRIFTWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_DRIFTWOOD_LOG).log(ModBlocks.STRIPPED_DRIFTWOOD_LOG).wood(ModBlocks.STRIPPED_DRIFTWOOD_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GROWTH_CHAMBER);*/
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.NULL, Models.GENERATED);
    }
}