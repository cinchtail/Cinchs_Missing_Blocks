package net.cinchtail.cinchsmissingblocks.datagen;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Blocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators gen) {
        var polishedCalciteFamily = gen.family(ModBlocks.POLISHED_CALCITE);
        var calciteBricksFamily = gen.family(ModBlocks.CALCITE_BRICKS);
        var crackedCalciteBricksFamily = gen.family(ModBlocks.CRACKED_CALCITE_BRICKS);
        var mossyCalciteBricksFamily = gen.family(ModBlocks.MOSSY_CALCITE_BRICKS);

        BlockModelHelpers.stairs(gen, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE);
        BlockModelHelpers.slab(gen, ModBlocks.CALCITE_SLAB, Blocks.CALCITE, Blocks.CALCITE);
        BlockModelHelpers.wall(gen, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

        polishedCalciteFamily.stairs(ModBlocks.POLISHED_CALCITE_STAIRS);
        polishedCalciteFamily.slab(ModBlocks.POLISHED_CALCITE_SLAB);
        polishedCalciteFamily.wall(ModBlocks.POLISHED_CALCITE_WALL);

        calciteBricksFamily.stairs(ModBlocks.CALCITE_BRICK_STAIRS);
        calciteBricksFamily.slab(ModBlocks.CALCITE_BRICK_SLAB);
        calciteBricksFamily.wall(ModBlocks.CALCITE_BRICK_WALL);

        crackedCalciteBricksFamily.stairs(ModBlocks.CRACKED_CALCITE_BRICK_STAIRS);
        crackedCalciteBricksFamily.slab(ModBlocks.CRACKED_CALCITE_BRICK_SLAB);
        crackedCalciteBricksFamily.wall(ModBlocks.CRACKED_CALCITE_BRICK_WALL);

        mossyCalciteBricksFamily.stairs(ModBlocks.MOSSY_CALCITE_BRICK_STAIRS);
        mossyCalciteBricksFamily.slab(ModBlocks.MOSSY_CALCITE_BRICK_SLAB);
        mossyCalciteBricksFamily.wall(ModBlocks.MOSSY_CALCITE_BRICK_WALL);

        BlockModelHelpers.cubeColumn(gen, ModBlocks.CHISELED_CALCITE_BRICKS, ModBlocks.CHISELED_CALCITE_BRICKS);

        BlockModelHelpers.pillar(gen, ModBlocks.CALCITE_BRICK_PILLAR, ModBlocks.CALCITE_BRICK_PILLAR);


        var polishedDripstoneFamily = gen.family(ModBlocks.POLISHED_DRIPSTONE);
        var dripstoneBricksFamily = gen.family(ModBlocks.DRIPSTONE_BRICKS);
        var crackedDripstoneBricksFamily = gen.family(ModBlocks.CRACKED_DRIPSTONE_BRICKS);
        var mossyDripstoneBricksFamily = gen.family(ModBlocks.MOSSY_DRIPSTONE_BRICKS);

        BlockModelHelpers.stairs(gen, ModBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);
        BlockModelHelpers.slab(gen, ModBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK, Blocks.DRIPSTONE_BLOCK);
        BlockModelHelpers.wall(gen, ModBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

        polishedDripstoneFamily.stairs(ModBlocks.POLISHED_DRIPSTONE_STAIRS);
        polishedDripstoneFamily.slab(ModBlocks.POLISHED_DRIPSTONE_SLAB);
        polishedDripstoneFamily.wall(ModBlocks.POLISHED_DRIPSTONE_WALL);

        dripstoneBricksFamily.stairs(ModBlocks.DRIPSTONE_BRICK_STAIRS);
        dripstoneBricksFamily.slab(ModBlocks.DRIPSTONE_BRICK_SLAB);
        dripstoneBricksFamily.wall(ModBlocks.DRIPSTONE_BRICK_WALL);

        crackedDripstoneBricksFamily.stairs(ModBlocks.CRACKED_DRIPSTONE_BRICK_STAIRS);
        crackedDripstoneBricksFamily.slab(ModBlocks.CRACKED_DRIPSTONE_BRICK_SLAB);
        crackedDripstoneBricksFamily.wall(ModBlocks.CRACKED_DRIPSTONE_BRICK_WALL);

        mossyDripstoneBricksFamily.stairs(ModBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS);
        mossyDripstoneBricksFamily.slab(ModBlocks.MOSSY_DRIPSTONE_BRICK_SLAB);
        mossyDripstoneBricksFamily.wall(ModBlocks.MOSSY_DRIPSTONE_BRICK_WALL);

        BlockModelHelpers.cubeColumn(gen, ModBlocks.CHISELED_DRIPSTONE_BRICKS, ModBlocks.CHISELED_DRIPSTONE_BRICKS);

        BlockModelHelpers.pillar(gen, ModBlocks.DRIPSTONE_BRICK_PILLAR, ModBlocks.DRIPSTONE_BRICK_PILLAR);

        var crackedTuffBricksFamily = gen.family(ModBlocks.CRACKED_TUFF_BRICKS);
        var mossyTuffBricksFamily = gen.family(ModBlocks.MOSSY_TUFF_BRICKS);

        crackedTuffBricksFamily.stairs(ModBlocks.CRACKED_TUFF_BRICK_STAIRS);
        crackedTuffBricksFamily.slab(ModBlocks.CRACKED_TUFF_BRICK_SLAB);
        crackedTuffBricksFamily.wall(ModBlocks.CRACKED_TUFF_BRICK_WALL);

        mossyTuffBricksFamily.stairs(ModBlocks.MOSSY_TUFF_BRICK_STAIRS);
        mossyTuffBricksFamily.slab(ModBlocks.MOSSY_TUFF_BRICK_SLAB);
        mossyTuffBricksFamily.wall(ModBlocks.MOSSY_TUFF_BRICK_WALL);

        var andesiteBricksFamily = gen.family(ModBlocks.ANDESITE_BRICKS);
        var crackedAndesiteBricksFamily = gen.family(ModBlocks.CRACKED_ANDESITE_BRICKS);
        var mossyAndesiteBricksFamily = gen.family(ModBlocks.MOSSY_ANDESITE_BRICKS);

        BlockModelHelpers.wall(gen, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);

        andesiteBricksFamily.stairs(ModBlocks.ANDESITE_BRICK_STAIRS);
        andesiteBricksFamily.slab(ModBlocks.ANDESITE_BRICK_SLAB);
        andesiteBricksFamily.wall(ModBlocks.ANDESITE_BRICK_WALL);

        crackedAndesiteBricksFamily.stairs(ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS);
        crackedAndesiteBricksFamily.slab(ModBlocks.CRACKED_ANDESITE_BRICK_SLAB);
        crackedAndesiteBricksFamily.wall(ModBlocks.CRACKED_ANDESITE_BRICK_WALL);

        mossyAndesiteBricksFamily.stairs(ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS);
        mossyAndesiteBricksFamily.slab(ModBlocks.MOSSY_ANDESITE_BRICK_SLAB);
        mossyAndesiteBricksFamily.wall(ModBlocks.MOSSY_ANDESITE_BRICK_WALL);

        gen.createTrivialCube(ModBlocks.CHISELED_ANDESITE_BRICKS);

        BlockModelHelpers.pillar(gen, ModBlocks.ANDESITE_BRICK_PILLAR, ModBlocks.ANDESITE_BRICK_PILLAR);

        var graniteBricksFamily = gen.family(ModBlocks.GRANITE_BRICKS);
        var crackedGraniteBricksFamily = gen.family(ModBlocks.CRACKED_GRANITE_BRICKS);
        var mossyGraniteBricksFamily = gen.family(ModBlocks.MOSSY_GRANITE_BRICKS);

        BlockModelHelpers.wall(gen, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);

        graniteBricksFamily.stairs(ModBlocks.GRANITE_BRICK_STAIRS);
        graniteBricksFamily.slab(ModBlocks.GRANITE_BRICK_SLAB);
        graniteBricksFamily.wall(ModBlocks.GRANITE_BRICK_WALL);

        crackedGraniteBricksFamily.stairs(ModBlocks.CRACKED_GRANITE_BRICK_STAIRS);
        crackedGraniteBricksFamily.slab(ModBlocks.CRACKED_GRANITE_BRICK_SLAB);
        crackedGraniteBricksFamily.wall(ModBlocks.CRACKED_GRANITE_BRICK_WALL);

        mossyGraniteBricksFamily.stairs(ModBlocks.MOSSY_GRANITE_BRICK_STAIRS);
        mossyGraniteBricksFamily.slab(ModBlocks.MOSSY_GRANITE_BRICK_SLAB);
        mossyGraniteBricksFamily.wall(ModBlocks.MOSSY_GRANITE_BRICK_WALL);

        gen.createTrivialCube(ModBlocks.CHISELED_GRANITE_BRICKS);

        BlockModelHelpers.pillar(gen, ModBlocks.GRANITE_BRICK_PILLAR, ModBlocks.GRANITE_BRICK_PILLAR);

        var dioriteBricksFamily = gen.family(ModBlocks.DIORITE_BRICKS);
        var crackedDioriteBricksFamily = gen.family(ModBlocks.CRACKED_DIORITE_BRICKS);
        var mossyDioriteBricksFamily = gen.family(ModBlocks.MOSSY_DIORITE_BRICKS);

        BlockModelHelpers.wall(gen, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);

        dioriteBricksFamily.stairs(ModBlocks.DIORITE_BRICK_STAIRS);
        dioriteBricksFamily.slab(ModBlocks.DIORITE_BRICK_SLAB);
        dioriteBricksFamily.wall(ModBlocks.DIORITE_BRICK_WALL);

        crackedDioriteBricksFamily.stairs(ModBlocks.CRACKED_DIORITE_BRICK_STAIRS);
        crackedDioriteBricksFamily.slab(ModBlocks.CRACKED_DIORITE_BRICK_SLAB);
        crackedDioriteBricksFamily.wall(ModBlocks.CRACKED_DIORITE_BRICK_WALL);

        mossyDioriteBricksFamily.stairs(ModBlocks.MOSSY_DIORITE_BRICK_STAIRS);
        mossyDioriteBricksFamily.slab(ModBlocks.MOSSY_DIORITE_BRICK_SLAB);
        mossyDioriteBricksFamily.wall(ModBlocks.MOSSY_DIORITE_BRICK_WALL);

        gen.createTrivialCube(ModBlocks.CHISELED_DIORITE_BRICKS);

        BlockModelHelpers.pillar(gen, ModBlocks.DIORITE_BRICK_PILLAR, ModBlocks.DIORITE_BRICK_PILLAR);

        var crackedQuartzBricksFamily = gen.family(ModBlocks.CRACKED_QUARTZ_BRICKS);
        var mossyQuartzBricksFamily = gen.family(ModBlocks.MOSSY_QUARTZ_BRICKS);

        BlockModelHelpers.wallCustomSide(gen, ModBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);
        BlockModelHelpers.wallCustomBottom(gen, ModBlocks.SMOOTH_QUARTZ_WALL, Blocks.QUARTZ_BLOCK);

        BlockModelHelpers.stairs(gen, ModBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);
        BlockModelHelpers.slab(gen, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS);
        BlockModelHelpers.wall(gen, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);

        crackedQuartzBricksFamily.stairs(ModBlocks.CRACKED_QUARTZ_BRICK_STAIRS);
        crackedQuartzBricksFamily.slab(ModBlocks.CRACKED_QUARTZ_BRICK_SLAB);
        crackedQuartzBricksFamily.wall(ModBlocks.CRACKED_QUARTZ_BRICK_WALL);

        mossyQuartzBricksFamily.stairs(ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS);
        mossyQuartzBricksFamily.slab(ModBlocks.MOSSY_QUARTZ_BRICK_SLAB);
        mossyQuartzBricksFamily.wall(ModBlocks.MOSSY_QUARTZ_BRICK_WALL);

        var crackedBricksFamily = gen.family(ModBlocks.CRACKED_BRICKS);
        var mossyBricksFamily = gen.family(ModBlocks.MOSSY_BRICKS);

        crackedBricksFamily.stairs(ModBlocks.CRACKED_BRICK_STAIRS);
        crackedBricksFamily.slab(ModBlocks.CRACKED_BRICK_SLAB);
        crackedBricksFamily.wall(ModBlocks.CRACKED_BRICK_WALL);

        mossyBricksFamily.stairs(ModBlocks.MOSSY_BRICK_STAIRS);
        mossyBricksFamily.slab(ModBlocks.MOSSY_BRICK_SLAB);
        mossyBricksFamily.wall(ModBlocks.MOSSY_BRICK_WALL);

        gen.createTrivialCube(ModBlocks.CHISELED_BRICKS);

        var crackedMudBricksFamily = gen.family(ModBlocks.CRACKED_MUD_BRICKS);
        var mossyMudBricksFamily = gen.family(ModBlocks.MOSSY_MUD_BRICKS);

        BlockModelHelpers.stairs(gen, ModBlocks.PACKED_MUD_STAIRS, Blocks.PACKED_MUD);
        BlockModelHelpers.slab(gen, ModBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD, Blocks.PACKED_MUD);
        BlockModelHelpers.wall(gen, ModBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);

        crackedMudBricksFamily.stairs(ModBlocks.CRACKED_MUD_BRICK_STAIRS);
        crackedMudBricksFamily.slab(ModBlocks.CRACKED_MUD_BRICK_SLAB);
        crackedMudBricksFamily.wall(ModBlocks.CRACKED_MUD_BRICK_WALL);

        mossyMudBricksFamily.stairs(ModBlocks.MOSSY_MUD_BRICK_STAIRS);
        mossyMudBricksFamily.slab(ModBlocks.MOSSY_MUD_BRICK_SLAB);
        mossyMudBricksFamily.wall(ModBlocks.MOSSY_MUD_BRICK_WALL);

        gen.createTrivialCube(ModBlocks.CHISELED_MUD_BRICKS);

        BlockModelHelpers.pillar(gen, ModBlocks.MUD_BRICK_PILLAR, ModBlocks.MUD_BRICK_PILLAR);

        var crackedResinBricksFamily = gen.family(ModBlocks.CRACKED_RESIN_BRICKS);
        var mossyResinBricksFamily = gen.family(ModBlocks.MOSSY_RESIN_BRICKS);

        crackedResinBricksFamily.stairs(ModBlocks.CRACKED_RESIN_BRICK_STAIRS);
        crackedResinBricksFamily.slab(ModBlocks.CRACKED_RESIN_BRICK_SLAB);
        crackedResinBricksFamily.wall(ModBlocks.CRACKED_RESIN_BRICK_WALL);

        mossyResinBricksFamily.stairs(ModBlocks.MOSSY_RESIN_BRICK_STAIRS);
        mossyResinBricksFamily.slab(ModBlocks.MOSSY_RESIN_BRICK_SLAB);
        mossyResinBricksFamily.wall(ModBlocks.MOSSY_RESIN_BRICK_WALL);

        var polishedEndStoneBricksFamily = gen.family(ModBlocks.POLISHED_END_STONE);
        var crackedEndStoneBricksFamily = gen.family(ModBlocks.CRACKED_END_STONE_BRICKS);
        var mossyEndStoneBricksFamily = gen.family(ModBlocks.MOSSY_END_STONE_BRICKS);

        BlockModelHelpers.stairs(gen, ModBlocks.END_STONE_STAIRS, Blocks.END_STONE);
        BlockModelHelpers.slab(gen, ModBlocks.END_STONE_SLAB, Blocks.END_STONE, Blocks.END_STONE);
        BlockModelHelpers.wall(gen, ModBlocks.END_STONE_WALL, Blocks.END_STONE);

        polishedEndStoneBricksFamily.stairs(ModBlocks.POLISHED_END_STONE_STAIRS);
        polishedEndStoneBricksFamily.slab(ModBlocks.POLISHED_END_STONE_SLAB);
        polishedEndStoneBricksFamily.wall(ModBlocks.POLISHED_END_STONE_WALL);

        crackedEndStoneBricksFamily.stairs(ModBlocks.CRACKED_END_STONE_BRICK_STAIRS);
        crackedEndStoneBricksFamily.slab(ModBlocks.CRACKED_END_STONE_BRICK_SLAB);
        crackedEndStoneBricksFamily.wall(ModBlocks.CRACKED_END_STONE_BRICK_WALL);

        mossyEndStoneBricksFamily.stairs(ModBlocks.MOSSY_END_STONE_BRICK_STAIRS);
        mossyEndStoneBricksFamily.slab(ModBlocks.MOSSY_END_STONE_BRICK_SLAB);
        mossyEndStoneBricksFamily.wall(ModBlocks.MOSSY_END_STONE_BRICK_WALL);

        gen.createTrivialCube(ModBlocks.CHISELED_END_STONE_BRICKS);

        BlockModelHelpers.pillar(gen, ModBlocks.END_STONE_BRICK_PILLAR, ModBlocks.END_STONE_BRICK_PILLAR);

        BlockModelHelpers.wall(gen, ModBlocks.STONE_WALL, Blocks.STONE);
        BlockModelHelpers.stairs(gen, ModBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
        BlockModelHelpers.wall(gen, ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

        BlockModelHelpers.stairs(gen, ModBlocks.CRACKED_STONE_BRICK_STAIRS, Blocks.CRACKED_STONE_BRICKS);
        BlockModelHelpers.slab(gen, ModBlocks.CRACKED_STONE_BRICK_SLAB, Blocks.CRACKED_STONE_BRICKS, Blocks.CRACKED_STONE_BRICKS);
        BlockModelHelpers.wall(gen, ModBlocks.CRACKED_STONE_BRICK_WALL, Blocks.CRACKED_STONE_BRICKS);

        var stoneTilesFamily = gen.family(ModBlocks.STONE_TILES);
        var crackedStoneTilesFamily = gen.family(ModBlocks.CRACKED_STONE_TILES);
        var mossyStoneTilesFamily = gen.family(ModBlocks.MOSSY_STONE_TILES);

        stoneTilesFamily.stairs(ModBlocks.STONE_TILE_STAIRS);
        stoneTilesFamily.slab(ModBlocks.STONE_TILE_SLAB);
        stoneTilesFamily.wall(ModBlocks.STONE_TILE_WALL);
        crackedStoneTilesFamily.stairs(ModBlocks.CRACKED_STONE_TILE_STAIRS);
        crackedStoneTilesFamily.slab(ModBlocks.CRACKED_STONE_TILE_SLAB);
        crackedStoneTilesFamily.wall(ModBlocks.CRACKED_STONE_TILE_WALL);
        mossyStoneTilesFamily.stairs(ModBlocks.MOSSY_STONE_TILE_STAIRS);
        mossyStoneTilesFamily.slab(ModBlocks.MOSSY_STONE_TILE_SLAB);
        mossyStoneTilesFamily.wall(ModBlocks.MOSSY_STONE_TILE_WALL);

        BlockModelHelpers.pillar(gen, ModBlocks.STONE_BRICK_PILLAR, ModBlocks.STONE_BRICK_PILLAR);

        var mossyCobbledDeepslateFamily = gen.family(ModBlocks.MOSSY_COBBLED_DEEPSLATE);
        var mossyDeepslateBricksFamily = gen.family(ModBlocks.MOSSY_DEEPSLATE_BRICKS);
        var mossyDeepslatetilesFamily = gen.family(ModBlocks.MOSSY_DEEPSLATE_TILES);

        gen.itemModelOutput.accept(ModBlocks.DEEPSLATE_STAIRS.asItem(), ItemModelUtils.plainModel(
                Identifier.parse("cinchsmissingblocks:block/deepslate_stairs")));
        gen.itemModelOutput.accept(ModBlocks.DEEPSLATE_SLAB.asItem(), ItemModelUtils.plainModel(
                Identifier.parse("cinchsmissingblocks:block/deepslate_slab")));
        gen.itemModelOutput.accept(ModBlocks.DEEPSLATE_WALL.asItem(), ItemModelUtils.plainModel(
                Identifier.parse("cinchsmissingblocks:block/deepslate_wall_inventory")));

        mossyCobbledDeepslateFamily.stairs(ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS);
        mossyCobbledDeepslateFamily.slab(ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB);
        mossyCobbledDeepslateFamily.wall(ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL);

        BlockModelHelpers.stairs(gen, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Blocks.CRACKED_DEEPSLATE_BRICKS);
        BlockModelHelpers.slab(gen, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS, Blocks.CRACKED_DEEPSLATE_BRICKS);
        BlockModelHelpers.wall(gen, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL, Blocks.CRACKED_DEEPSLATE_BRICKS);

        mossyDeepslateBricksFamily.stairs(ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
        mossyDeepslateBricksFamily.slab(ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
        mossyDeepslateBricksFamily.wall(ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL);

        BlockModelHelpers.stairs(gen, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Blocks.CRACKED_DEEPSLATE_TILES);
        BlockModelHelpers.slab(gen, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Blocks.CRACKED_DEEPSLATE_TILES, Blocks.CRACKED_DEEPSLATE_TILES);
        BlockModelHelpers.wall(gen, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL, Blocks.CRACKED_DEEPSLATE_TILES);

        mossyDeepslatetilesFamily.stairs(ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS);
        mossyDeepslatetilesFamily.slab(ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB);
        mossyDeepslatetilesFamily.wall(ModBlocks.MOSSY_DEEPSLATE_TILE_WALL);

        BlockModelHelpers.pillar(gen, ModBlocks.DEEPSLATE_BRICK_PILLAR, ModBlocks.DEEPSLATE_BRICK_PILLAR);

        gen.itemModelOutput.accept(ModBlocks.SCULK_INLAID_DEEPSLATE.asItem(), ItemModelUtils.plainModel(
                Identifier.parse("cinchsmissingblocks:block/sculk_inlaid_deepslate")));

        BlockModelHelpers.button(gen, ModBlocks.POLISHED_DEEPSLATE_BUTTON, Blocks.POLISHED_DEEPSLATE);
        BlockModelHelpers.pressurePlate(gen, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Blocks.POLISHED_DEEPSLATE);

        BlockModelHelpers.stairs(gen, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        BlockModelHelpers.slab(gen, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        BlockModelHelpers.wall(gen, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

        var blacktoneTilesFamily = gen.family(ModBlocks.BLACKSTONE_TILES);
        var crackedBlacktoneTilesFamily = gen.family(ModBlocks.CRACKED_BLACKSTONE_TILES);

        blacktoneTilesFamily.stairs(ModBlocks.BLACKSTONE_TILE_STAIRS);
        blacktoneTilesFamily.slab(ModBlocks.BLACKSTONE_TILE_SLAB);
        blacktoneTilesFamily.wall(ModBlocks.BLACKSTONE_TILE_WALL);
        crackedBlacktoneTilesFamily.stairs(ModBlocks.CRACKED_BLACKSTONE_TILE_STAIRS);
        crackedBlacktoneTilesFamily.slab(ModBlocks.CRACKED_BLACKSTONE_TILE_SLAB);
        crackedBlacktoneTilesFamily.wall(ModBlocks.CRACKED_BLACKSTONE_TILE_WALL);

        BlockModelHelpers.pillar(gen, ModBlocks.BLACKSTONE_BRICK_PILLAR, ModBlocks.BLACKSTONE_BRICK_PILLAR);

        BlockModelHelpers.stairs(gen, ModBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);
        BlockModelHelpers.slab(gen, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK, Blocks.NETHERRACK);
        BlockModelHelpers.wall(gen, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);

        BlockModelHelpers.stairs(gen, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.CRACKED_NETHER_BRICKS);
        BlockModelHelpers.slab(gen, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS, Blocks.CRACKED_NETHER_BRICKS);
        BlockModelHelpers.wall(gen, ModBlocks.CRACKED_NETHER_BRICK_WALL, Blocks.CRACKED_NETHER_BRICKS);
        BlockModelHelpers.fence(gen, ModBlocks.CRACKED_NETHER_BRICK_FENCE, Blocks.CRACKED_NETHER_BRICKS);

        var crackedRedNetherBricksFamily = gen.family(ModBlocks.CRACKED_RED_NETHER_BRICKS);

        BlockModelHelpers.fence(gen, ModBlocks.RED_NETHER_BRICK_FENCE, Blocks.RED_NETHER_BRICKS);

        crackedRedNetherBricksFamily.stairs(ModBlocks.CRACKED_RED_NETHER_BRICK_STAIRS);
        crackedRedNetherBricksFamily.slab(ModBlocks.CRACKED_RED_NETHER_BRICK_SLAB);
        crackedRedNetherBricksFamily.wall(ModBlocks.CRACKED_RED_NETHER_BRICK_WALL);
        crackedRedNetherBricksFamily.fence(ModBlocks.CRACKED_RED_NETHER_BRICK_FENCE);

        gen.createTrivialCube(ModBlocks.CHISELED_RED_NETHER_BRICKS);

        var blueNetherBricksFamily = gen.family(ModBlocks.BLUE_NETHER_BRICKS);
        var crackedBlueNetherBricksFamily = gen.family(ModBlocks.CRACKED_BLUE_NETHER_BRICKS);

        blueNetherBricksFamily.stairs(ModBlocks.BLUE_NETHER_BRICK_STAIRS);
        blueNetherBricksFamily.slab(ModBlocks.BLUE_NETHER_BRICK_SLAB);
        blueNetherBricksFamily.wall(ModBlocks.BLUE_NETHER_BRICK_WALL);
        blueNetherBricksFamily.fence(ModBlocks.BLUE_NETHER_BRICK_FENCE);

        crackedBlueNetherBricksFamily.stairs(ModBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS);
        crackedBlueNetherBricksFamily.slab(ModBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB);
        crackedBlueNetherBricksFamily.wall(ModBlocks.CRACKED_BLUE_NETHER_BRICK_WALL);
        crackedBlueNetherBricksFamily.fence(ModBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE);

        gen.createTrivialCube(ModBlocks.CHISELED_BLUE_NETHER_BRICKS);

        var crackedPrismarineBricksFamily = gen.family(ModBlocks.CRACKED_PRISMARINE_BRICKS);
        var mossyPrismarineBricksFamily = gen.family(ModBlocks.MOSSY_PRISMARINE_BRICKS);

        BlockModelHelpers.wall(gen, ModBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);
        BlockModelHelpers.wall(gen, ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);

        crackedPrismarineBricksFamily.stairs(ModBlocks.CRACKED_PRISMARINE_BRICK_STAIRS);
        crackedPrismarineBricksFamily.slab(ModBlocks.CRACKED_PRISMARINE_BRICK_SLAB);
        crackedPrismarineBricksFamily.wall(ModBlocks.CRACKED_PRISMARINE_BRICK_WALL);

        mossyPrismarineBricksFamily.stairs(ModBlocks.MOSSY_PRISMARINE_BRICK_STAIRS);
        mossyPrismarineBricksFamily.slab(ModBlocks.MOSSY_PRISMARINE_BRICK_SLAB);
        mossyPrismarineBricksFamily.wall(ModBlocks.MOSSY_PRISMARINE_BRICK_WALL);

        gen.createTrivialCube(ModBlocks.CHISELED_PRISMARINE_BRICKS);

        BlockModelHelpers.pillar(gen, ModBlocks.PRISMARINE_BRICK_PILLAR, ModBlocks.PRISMARINE_BRICK_PILLAR);

        var snowBricksFamily = gen.family(ModBlocks.SNOW_BRICKS);

        snowBricksFamily.stairs(ModBlocks.SNOW_BRICK_STAIRS);
        snowBricksFamily.slab(ModBlocks.SNOW_BRICK_SLAB);
        snowBricksFamily.wall(ModBlocks.SNOW_BRICK_WALL);

        BlockModelHelpers.stairs(gen, ModBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);
        BlockModelHelpers.slab(gen, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT, Blocks.SMOOTH_BASALT);
        BlockModelHelpers.wall(gen, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);

        BlockModelHelpers.wallCustomTop(gen, ModBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SANDSTONE);

        gen.itemModelOutput.accept(ModBlocks.CUT_SANDSTONE_STAIRS.asItem(), ItemModelUtils.plainModel(
                Identifier.parse("cinchsmissingblocks:block/cut_sandstone_stairs")));
        gen.itemModelOutput.accept(ModBlocks.CUT_SANDSTONE_WALL.asItem(), ItemModelUtils.plainModel(
                        Identifier.parse("cinchsmissingblocks:block/cut_sandstone_wall_inventory")));


        var sandStoneBricksFamily = gen.family(ModBlocks.SANDSTONE_BRICKS);
        var crackedSandStoneBricksFamily = gen.family(ModBlocks.CRACKED_SANDSTONE_BRICKS);
        var mossySandStoneBricksFamily = gen.family(ModBlocks.MOSSY_SANDSTONE_BRICKS);

        sandStoneBricksFamily.stairs(ModBlocks.SANDSTONE_BRICK_STAIRS);
        sandStoneBricksFamily.slab(ModBlocks.SANDSTONE_BRICK_SLAB);
        sandStoneBricksFamily.wall(ModBlocks.SANDSTONE_BRICK_WALL);

        crackedSandStoneBricksFamily.stairs(ModBlocks.CRACKED_SANDSTONE_BRICK_STAIRS);
        crackedSandStoneBricksFamily.slab(ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB);
        crackedSandStoneBricksFamily.wall(ModBlocks.CRACKED_SANDSTONE_BRICK_WALL);

        mossySandStoneBricksFamily.stairs(ModBlocks.MOSSY_SANDSTONE_BRICK_STAIRS);
        mossySandStoneBricksFamily.slab(ModBlocks.MOSSY_SANDSTONE_BRICK_SLAB);
        mossySandStoneBricksFamily.wall(ModBlocks.MOSSY_SANDSTONE_BRICK_WALL);

        BlockModelHelpers.pillar(gen, ModBlocks.SANDSTONE_BRICK_PILLAR, ModBlocks.SANDSTONE_BRICK_PILLAR);

        BlockModelHelpers.wallCustomTop(gen, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.RED_SANDSTONE);

        gen.itemModelOutput.accept(ModBlocks.CUT_RED_SANDSTONE_STAIRS.asItem(), ItemModelUtils.plainModel(
                Identifier.parse("cinchsmissingblocks:block/cut_red_sandstone_stairs")));
        gen.itemModelOutput.accept(ModBlocks.CUT_RED_SANDSTONE_WALL.asItem(), ItemModelUtils.plainModel(
                Identifier.parse("cinchsmissingblocks:block/cut_red_sandstone_wall_inventory")));

        var redSandStoneBricksFamily = gen.family(ModBlocks.RED_SANDSTONE_BRICKS);
        var crackedRedSandStoneBricksFamily = gen.family(ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);
        var mossyRedSandStoneBricksFamily = gen.family(ModBlocks.MOSSY_RED_SANDSTONE_BRICKS);

        redSandStoneBricksFamily.stairs(ModBlocks.RED_SANDSTONE_BRICK_STAIRS);
        redSandStoneBricksFamily.slab(ModBlocks.RED_SANDSTONE_BRICK_SLAB);
        redSandStoneBricksFamily.wall(ModBlocks.RED_SANDSTONE_BRICK_WALL);

        crackedRedSandStoneBricksFamily.stairs(ModBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS);
        crackedRedSandStoneBricksFamily.slab(ModBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB);
        crackedRedSandStoneBricksFamily.wall(ModBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL);

        mossyRedSandStoneBricksFamily.stairs(ModBlocks.MOSSY_RED_SANDSTONE_BRICK_STAIRS);
        mossyRedSandStoneBricksFamily.slab(ModBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB);
        mossyRedSandStoneBricksFamily.wall(ModBlocks.MOSSY_RED_SANDSTONE_BRICK_WALL);

        BlockModelHelpers.pillar(gen, ModBlocks.RED_SANDSTONE_BRICK_PILLAR, ModBlocks.RED_SANDSTONE_BRICK_PILLAR);

        var crackedCinnabarBricksFamily = gen.family(ModBlocks.CRACKED_CINNABAR_BRICKS);
        var mossyCinnabarBricksFamily = gen.family(ModBlocks.MOSSY_CINNABAR_BRICKS);

        crackedCinnabarBricksFamily.stairs(ModBlocks.CRACKED_CINNABAR_BRICK_STAIRS);
        crackedCinnabarBricksFamily.slab(ModBlocks.CRACKED_CINNABAR_BRICK_SLAB);
        crackedCinnabarBricksFamily.wall(ModBlocks.CRACKED_CINNABAR_BRICK_WALL);

        mossyCinnabarBricksFamily.stairs(ModBlocks.MOSSY_CINNABAR_BRICK_STAIRS);
        mossyCinnabarBricksFamily.slab(ModBlocks.MOSSY_CINNABAR_BRICK_SLAB);
        mossyCinnabarBricksFamily.wall(ModBlocks.MOSSY_CINNABAR_BRICK_WALL);

        BlockModelHelpers.pillar(gen, ModBlocks.CINNABAR_BRICK_PILLAR, ModBlocks.CINNABAR_BRICK_PILLAR);

        var crackedSulfurBricksFamily = gen.family(ModBlocks.CRACKED_SULFUR_BRICKS);
        var mossySulfurBricksFamily = gen.family(ModBlocks.MOSSY_SULFUR_BRICKS);

        crackedSulfurBricksFamily.stairs(ModBlocks.CRACKED_SULFUR_BRICK_STAIRS);
        crackedSulfurBricksFamily.slab(ModBlocks.CRACKED_SULFUR_BRICK_SLAB);
        crackedSulfurBricksFamily.wall(ModBlocks.CRACKED_SULFUR_BRICK_WALL);

        mossySulfurBricksFamily.stairs(ModBlocks.MOSSY_SULFUR_BRICK_STAIRS);
        mossySulfurBricksFamily.slab(ModBlocks.MOSSY_SULFUR_BRICK_SLAB);
        mossySulfurBricksFamily.wall(ModBlocks.MOSSY_SULFUR_BRICK_WALL);

        BlockModelHelpers.pillar(gen, ModBlocks.SULFUR_BRICK_PILLAR, ModBlocks.SULFUR_BRICK_PILLAR);

        BlockModelHelpers.wall(gen, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);

        gen.createTrivialCube(ModBlocks.CHISELED_PURPUR);

        gen.itemModelOutput.accept(ModBlocks.TINTED_GLASS_PANE.asItem(), ItemModelUtils.plainModel(
                Identifier.parse("cinchsmissingblocks:item/tinted_glass_pane")));

        BlockModelHelpers.stairs(gen, ModBlocks.TERRACOTTA_STAIRS, Blocks.TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA, Blocks.TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.white(), Blocks.DYED_TERRACOTTA.white());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.white(), Blocks.DYED_TERRACOTTA.white(), Blocks.DYED_TERRACOTTA.white());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.white(), Blocks.DYED_TERRACOTTA.white());
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.lightGray(), Blocks.DYED_TERRACOTTA.lightGray());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.lightGray(), Blocks.DYED_TERRACOTTA.lightGray(), Blocks.DYED_TERRACOTTA.lightGray());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.lightGray(), Blocks.DYED_TERRACOTTA.lightGray());
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.gray(), Blocks.DYED_TERRACOTTA.gray());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.gray(), Blocks.DYED_TERRACOTTA.gray(), Blocks.DYED_TERRACOTTA.gray());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.gray(), Blocks.DYED_TERRACOTTA.gray());
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.black(), Blocks.DYED_TERRACOTTA.black());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.black(), Blocks.DYED_TERRACOTTA.black(), Blocks.DYED_TERRACOTTA.black());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.black(), Blocks.DYED_TERRACOTTA.black());
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.brown(), Blocks.DYED_TERRACOTTA.brown());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.brown(), Blocks.DYED_TERRACOTTA.brown(), Blocks.DYED_TERRACOTTA.brown());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.brown(), Blocks.DYED_TERRACOTTA.brown());
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.red(), Blocks.DYED_TERRACOTTA.red());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.red(), Blocks.DYED_TERRACOTTA.red(), Blocks.DYED_TERRACOTTA.red());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.red(), Blocks.DYED_TERRACOTTA.red());
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.orange(), Blocks.DYED_TERRACOTTA.orange());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.orange(), Blocks.DYED_TERRACOTTA.orange(), Blocks.DYED_TERRACOTTA.orange());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.orange(), Blocks.DYED_TERRACOTTA.orange());
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.yellow(), Blocks.DYED_TERRACOTTA.yellow());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.yellow(), Blocks.DYED_TERRACOTTA.yellow(), Blocks.DYED_TERRACOTTA.yellow());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.yellow(), Blocks.DYED_TERRACOTTA.yellow());
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.lime(), Blocks.DYED_TERRACOTTA.lime());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.lime(), Blocks.DYED_TERRACOTTA.lime(), Blocks.DYED_TERRACOTTA.lime());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.lime(), Blocks.DYED_TERRACOTTA.lime());
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.green(), Blocks.DYED_TERRACOTTA.green());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.green(), Blocks.DYED_TERRACOTTA.green(), Blocks.DYED_TERRACOTTA.green());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.green(), Blocks.DYED_TERRACOTTA.green());
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.cyan(), Blocks.DYED_TERRACOTTA.cyan());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.cyan(), Blocks.DYED_TERRACOTTA.cyan(), Blocks.DYED_TERRACOTTA.cyan());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.cyan(), Blocks.DYED_TERRACOTTA.cyan());
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.lightBlue(), Blocks.DYED_TERRACOTTA.lightBlue());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.lightBlue(), Blocks.DYED_TERRACOTTA.lightBlue(), Blocks.DYED_TERRACOTTA.lightBlue());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.lightBlue(), Blocks.DYED_TERRACOTTA.lightBlue());
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.blue(), Blocks.DYED_TERRACOTTA.blue());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.blue(), Blocks.DYED_TERRACOTTA.blue(), Blocks.DYED_TERRACOTTA.blue());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.blue(), Blocks.DYED_TERRACOTTA.blue());
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.purple(), Blocks.DYED_TERRACOTTA.purple());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.purple(), Blocks.DYED_TERRACOTTA.purple(), Blocks.DYED_TERRACOTTA.purple());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.purple(), Blocks.DYED_TERRACOTTA.purple());
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.magenta(), Blocks.DYED_TERRACOTTA.magenta());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.magenta(), Blocks.DYED_TERRACOTTA.magenta(), Blocks.DYED_TERRACOTTA.magenta());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.magenta(), Blocks.DYED_TERRACOTTA.magenta());
        BlockModelHelpers.stairs(gen, ModBlocks.DYED_TERRACOTTA_STAIRS.pink(), Blocks.DYED_TERRACOTTA.pink());
        BlockModelHelpers.slab(gen, ModBlocks.DYED_TERRACOTTA_SLAB.pink(), Blocks.DYED_TERRACOTTA.pink(), Blocks.DYED_TERRACOTTA.pink());
        BlockModelHelpers.wall(gen, ModBlocks.DYED_TERRACOTTA_WALL.pink(), Blocks.DYED_TERRACOTTA.pink());

        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.white(), Blocks.CONCRETE.white());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.white(), Blocks.CONCRETE.white(), Blocks.CONCRETE.white());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.white(), Blocks.CONCRETE.white());
        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.lightGray(), Blocks.CONCRETE.lightGray());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.lightGray(), Blocks.CONCRETE.lightGray(), Blocks.CONCRETE.lightGray());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.lightGray(), Blocks.CONCRETE.lightGray());
        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.gray(), Blocks.CONCRETE.gray());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.gray(), Blocks.CONCRETE.gray(), Blocks.CONCRETE.gray());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.gray(), Blocks.CONCRETE.gray());
        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.black(), Blocks.CONCRETE.black());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.black(), Blocks.CONCRETE.black(), Blocks.CONCRETE.black());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.black(), Blocks.CONCRETE.black());
        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.brown(), Blocks.CONCRETE.brown());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.brown(), Blocks.CONCRETE.brown(), Blocks.CONCRETE.brown());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.brown(), Blocks.CONCRETE.brown());
        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.red(), Blocks.CONCRETE.red());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.red(), Blocks.CONCRETE.red(), Blocks.CONCRETE.red());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.red(), Blocks.CONCRETE.red());
        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.orange(), Blocks.CONCRETE.orange());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.orange(), Blocks.CONCRETE.orange(), Blocks.CONCRETE.orange());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.orange(), Blocks.CONCRETE.orange());
        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.yellow(), Blocks.CONCRETE.yellow());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.yellow(), Blocks.CONCRETE.yellow(), Blocks.CONCRETE.yellow());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.yellow(), Blocks.CONCRETE.yellow());
        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.lime(), Blocks.CONCRETE.lime());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.lime(), Blocks.CONCRETE.lime(), Blocks.CONCRETE.lime());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.lime(), Blocks.CONCRETE.lime());
        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.green(), Blocks.CONCRETE.green());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.green(), Blocks.CONCRETE.green(), Blocks.CONCRETE.green());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.green(), Blocks.CONCRETE.green());
        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.cyan(), Blocks.CONCRETE.cyan());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.cyan(), Blocks.CONCRETE.cyan(), Blocks.CONCRETE.cyan());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.cyan(), Blocks.CONCRETE.cyan());
        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.lightBlue(), Blocks.CONCRETE.lightBlue());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.lightBlue(), Blocks.CONCRETE.lightBlue(), Blocks.CONCRETE.lightBlue());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.lightBlue(), Blocks.CONCRETE.lightBlue());
        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.blue(), Blocks.CONCRETE.blue());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.blue(), Blocks.CONCRETE.blue(), Blocks.CONCRETE.blue());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.blue(), Blocks.CONCRETE.blue());
        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.purple(), Blocks.CONCRETE.purple());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.purple(), Blocks.CONCRETE.purple(), Blocks.CONCRETE.purple());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.purple(), Blocks.CONCRETE.purple());
        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.magenta(), Blocks.CONCRETE.magenta());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.magenta(), Blocks.CONCRETE.magenta(), Blocks.CONCRETE.magenta());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.magenta(), Blocks.CONCRETE.magenta());
        BlockModelHelpers.stairs(gen, ModBlocks.CONCRETE_STAIRS.pink(), Blocks.CONCRETE.pink());
        BlockModelHelpers.slab(gen, ModBlocks.CONCRETE_SLAB.pink(), Blocks.CONCRETE.pink(), Blocks.CONCRETE.pink());
        BlockModelHelpers.wall(gen, ModBlocks.CONCRETE_WALL.pink(), Blocks.CONCRETE.pink());
    }
    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.RED_NETHER_BRICK, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BLUE_NETHER_BRICK, ModelTemplates.FLAT_ITEM);
    }
}