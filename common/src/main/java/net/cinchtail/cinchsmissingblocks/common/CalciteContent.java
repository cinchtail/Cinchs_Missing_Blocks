package net.cinchtail.cinchsmissingblocks.common;

import net.cinchtail.cinchsmissingblocks.common.block.BlockPropertiesSpec;
import net.cinchtail.cinchsmissingblocks.common.block.BlockSpec;
import net.cinchtail.cinchsmissingblocks.common.block.InstrumentProfile;
import net.cinchtail.cinchsmissingblocks.common.block.MapColorProfile;
import net.cinchtail.cinchsmissingblocks.common.block.SoundProfile;
import net.cinchtail.cinchsmissingblocks.common.catalog.ContentCatalog;
import net.cinchtail.cinchsmissingblocks.common.family.StoneFamily;
import net.cinchtail.cinchsmissingblocks.common.family.StoneFamilyBuilder;
import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;
import net.cinchtail.cinchsmissingblocks.common.model.ModelKind;
import net.cinchtail.cinchsmissingblocks.common.recipe.RecipeSpec;

import java.util.List;

public final class CalciteContent {
    private static final ResourceId VANILLA_CALCITE = ResourceId.minecraft("calcite");

    private static final BlockPropertiesSpec RAW = BlockPropertiesSpec.builder()
            .strength(0.75F)
            .sound(SoundProfile.CALCITE)
            .mapColor(MapColorProfile.TERRACOTTA_WHITE)
            .instrument(InstrumentProfile.BASEDRUM)
            .requiresCorrectToolForDrops()
            .build();

    private static final BlockPropertiesSpec WORKED = BlockPropertiesSpec.builder()
            .strength(1.0F, 1.0F)
            .sound(SoundProfile.CALCITE)
            .mapColor(MapColorProfile.TERRACOTTA_WHITE)
            .instrument(InstrumentProfile.BASEDRUM)
            .requiresCorrectToolForDrops()
            .build();

    private static final BlockPropertiesSpec CRACKED_BLOCK = BlockPropertiesSpec.builder()
            .strength(1.0F, 1.0F)
            .sound(SoundProfile.CALCITE)
            .build();

    private static final StoneFamily FAMILY = StoneFamilyBuilder.create("calcite", VANILLA_CALCITE)
            .rawShapes(RAW)
            .customPolished(WORKED)
            .polishedShapes(WORKED)
            .bricks(WORKED)
            .crackedBricks(CRACKED_BLOCK, WORKED)
            .mossyBricks(WORKED, WORKED)
            .chiseled(WORKED, ModelKind.CUBE_COLUMN)
            .pillar(WORKED)
            .build();

    public static final BlockSpec CALCITE_STAIRS = block("calcite_stairs");
    public static final BlockSpec CALCITE_SLAB = block("calcite_slab");
    public static final BlockSpec CALCITE_WALL = block("calcite_wall");
    public static final BlockSpec POLISHED_CALCITE = block("polished_calcite");
    public static final BlockSpec POLISHED_CALCITE_STAIRS = block("polished_calcite_stairs");
    public static final BlockSpec POLISHED_CALCITE_SLAB = block("polished_calcite_slab");
    public static final BlockSpec POLISHED_CALCITE_WALL = block("polished_calcite_wall");
    public static final BlockSpec CALCITE_BRICKS = block("calcite_bricks");
    public static final BlockSpec CALCITE_BRICK_STAIRS = block("calcite_brick_stairs");
    public static final BlockSpec CALCITE_BRICK_SLAB = block("calcite_brick_slab");
    public static final BlockSpec CALCITE_BRICK_WALL = block("calcite_brick_wall");
    public static final BlockSpec CRACKED_CALCITE_BRICKS = block("cracked_calcite_bricks");
    public static final BlockSpec CRACKED_CALCITE_BRICK_STAIRS = block("cracked_calcite_brick_stairs");
    public static final BlockSpec CRACKED_CALCITE_BRICK_SLAB = block("cracked_calcite_brick_slab");
    public static final BlockSpec CRACKED_CALCITE_BRICK_WALL = block("cracked_calcite_brick_wall");
    public static final BlockSpec MOSSY_CALCITE_BRICKS = block("mossy_calcite_bricks");
    public static final BlockSpec MOSSY_CALCITE_BRICK_STAIRS = block("mossy_calcite_brick_stairs");
    public static final BlockSpec MOSSY_CALCITE_BRICK_SLAB = block("mossy_calcite_brick_slab");
    public static final BlockSpec MOSSY_CALCITE_BRICK_WALL = block("mossy_calcite_brick_wall");
    public static final BlockSpec CHISELED_CALCITE_BRICKS = block("chiseled_calcite_bricks");
    public static final BlockSpec CALCITE_BRICK_PILLAR = block("calcite_brick_pillar");

    public static final List<BlockSpec> BLOCKS = FAMILY.blocks();
    public static final List<RecipeSpec> RECIPES = FAMILY.recipes();

    private CalciteContent() {
    }

    public static void contribute(ContentCatalog.Builder catalog) {
        BLOCKS.forEach(catalog::block);
        catalog.recipes(RECIPES);
    }

    private static BlockSpec block(String path) {
        return FAMILY.block(path);
    }
}
