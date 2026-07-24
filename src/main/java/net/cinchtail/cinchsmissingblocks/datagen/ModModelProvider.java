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

        BlockModelHelpers.wall(gen, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);

        gen.createTrivialCube(ModBlocks.CHISELED_PURPUR);

        gen.itemModelOutput.accept(ModBlocks.TINTED_GLASS_PANE.asItem(), ItemModelUtils.plainModel(
                Identifier.parse("cinchsmissingblocks:item/tinted_glass_pane")));

        BlockModelHelpers.stairs(gen, ModBlocks.TERRACOTTA_STAIRS, Blocks.TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA, Blocks.TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA, Blocks.WHITE_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA, Blocks.LIGHT_GRAY_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA, Blocks.GRAY_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA, Blocks.BLACK_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA, Blocks.BROWN_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.BROWN_TERRACOTTA_WALL, Blocks.BROWN_TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA, Blocks.RED_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA, Blocks.ORANGE_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA, Blocks.YELLOW_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA, Blocks.LIME_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA, Blocks.GREEN_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA, Blocks.CYAN_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA, Blocks.LIGHT_BLUE_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA, Blocks.BLUE_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.BLUE_TERRACOTTA_WALL, Blocks.BLUE_TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA, Blocks.PURPLE_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA, Blocks.MAGENTA_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA);
        BlockModelHelpers.stairs(gen, ModBlocks.PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA);
        BlockModelHelpers.slab(gen, ModBlocks.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA, Blocks.PINK_TERRACOTTA);
        BlockModelHelpers.wall(gen, ModBlocks.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA);

        BlockModelHelpers.stairs(gen, ModBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE, Blocks.WHITE_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
        BlockModelHelpers.stairs(gen, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE, Blocks.LIGHT_GRAY_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
        BlockModelHelpers.stairs(gen, ModBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE, Blocks.GRAY_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
        BlockModelHelpers.stairs(gen, ModBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE, Blocks.BLACK_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
        BlockModelHelpers.stairs(gen, ModBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE, Blocks.BROWN_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
        BlockModelHelpers.stairs(gen, ModBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE, Blocks.RED_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
        BlockModelHelpers.stairs(gen, ModBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE, Blocks.ORANGE_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
        BlockModelHelpers.stairs(gen, ModBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE, Blocks.YELLOW_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
        BlockModelHelpers.stairs(gen, ModBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE, Blocks.LIME_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
        BlockModelHelpers.stairs(gen, ModBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE, Blocks.GREEN_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
        BlockModelHelpers.stairs(gen, ModBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE, Blocks.CYAN_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
        BlockModelHelpers.stairs(gen, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE, Blocks.LIGHT_BLUE_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
        BlockModelHelpers.stairs(gen, ModBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE, Blocks.BLUE_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
        BlockModelHelpers.stairs(gen, ModBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE, Blocks.PURPLE_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
        BlockModelHelpers.stairs(gen, ModBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE, Blocks.MAGENTA_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
        BlockModelHelpers.stairs(gen, ModBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE);
        BlockModelHelpers.slab(gen, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE, Blocks.PINK_CONCRETE);
        BlockModelHelpers.wall(gen, ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
    }
    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.RED_NETHER_BRICK, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BLUE_NETHER_BRICK, ModelTemplates.FLAT_ITEM);
    }
}