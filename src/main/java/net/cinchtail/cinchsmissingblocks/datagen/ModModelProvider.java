package net.cinchtail.cinchsmissingblocks.datagen;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator gen) {
        var calcite = TextureMap.getId(Blocks.CALCITE);
        BlockStateModelGenerator.BlockTexturePool polishedCalcitePool = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_CALCITE);
        BlockStateModelGenerator.BlockTexturePool calciteBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CALCITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedCalciteBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_CALCITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyCalciteBricksPool = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_CALCITE_BRICKS);

        BlockModelHelpers.stairs(gen, ModBlocks.CALCITE_STAIRS, calcite);
        BlockModelHelpers.slab(gen, ModBlocks.CALCITE_SLAB, Blocks.CALCITE, calcite);
        BlockModelHelpers.wall(gen, ModBlocks.CALCITE_WALL, calcite);

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





        var polishedDeepslate = TextureMap.getId(Blocks.POLISHED_DEEPSLATE);

        BlockModelHelpers.button(gen, ModBlocks.POLISHED_DEEPSLATE_BUTTON, polishedDeepslate);
        BlockModelHelpers.pressurePlate(gen, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, polishedDeepslate);

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