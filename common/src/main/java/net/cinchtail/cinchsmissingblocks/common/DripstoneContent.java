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

public final class DripstoneContent {
    private static final ResourceId VANILLA_DRIPSTONE = ResourceId.minecraft("dripstone_block");

    private static final BlockPropertiesSpec RAW = properties(1.5F, 1.0F);
    private static final BlockPropertiesSpec WORKED = properties(1.5F, 6.0F);

    private static final StoneFamily FAMILY = StoneFamilyBuilder.create("dripstone", VANILLA_DRIPSTONE)
            .rawShapes(RAW)
            .customPolished(RAW)
            .polishedShapes(WORKED)
            .bricks(WORKED)
            .crackedBricks(WORKED, WORKED)
            .mossyBricks(WORKED, WORKED)
            .chiseled(RAW, ModelKind.CUBE_COLUMN)
            .pillar(RAW)
            .build();

    public static final BlockSpec DRIPSTONE_STAIRS = block("dripstone_stairs");
    public static final BlockSpec DRIPSTONE_SLAB = block("dripstone_slab");
    public static final BlockSpec DRIPSTONE_WALL = block("dripstone_wall");
    public static final BlockSpec POLISHED_DRIPSTONE = block("polished_dripstone");
    public static final BlockSpec POLISHED_DRIPSTONE_STAIRS = block("polished_dripstone_stairs");
    public static final BlockSpec POLISHED_DRIPSTONE_SLAB = block("polished_dripstone_slab");
    public static final BlockSpec POLISHED_DRIPSTONE_WALL = block("polished_dripstone_wall");
    public static final BlockSpec DRIPSTONE_BRICKS = block("dripstone_bricks");
    public static final BlockSpec DRIPSTONE_BRICK_STAIRS = block("dripstone_brick_stairs");
    public static final BlockSpec DRIPSTONE_BRICK_SLAB = block("dripstone_brick_slab");
    public static final BlockSpec DRIPSTONE_BRICK_WALL = block("dripstone_brick_wall");
    public static final BlockSpec CRACKED_DRIPSTONE_BRICKS = block("cracked_dripstone_bricks");
    public static final BlockSpec CRACKED_DRIPSTONE_BRICK_STAIRS = block("cracked_dripstone_brick_stairs");
    public static final BlockSpec CRACKED_DRIPSTONE_BRICK_SLAB = block("cracked_dripstone_brick_slab");
    public static final BlockSpec CRACKED_DRIPSTONE_BRICK_WALL = block("cracked_dripstone_brick_wall");
    public static final BlockSpec MOSSY_DRIPSTONE_BRICKS = block("mossy_dripstone_bricks");
    public static final BlockSpec MOSSY_DRIPSTONE_BRICK_STAIRS = block("mossy_dripstone_brick_stairs");
    public static final BlockSpec MOSSY_DRIPSTONE_BRICK_SLAB = block("mossy_dripstone_brick_slab");
    public static final BlockSpec MOSSY_DRIPSTONE_BRICK_WALL = block("mossy_dripstone_brick_wall");
    public static final BlockSpec CHISELED_DRIPSTONE_BRICKS = block("chiseled_dripstone_bricks");
    public static final BlockSpec DRIPSTONE_BRICK_PILLAR = block("dripstone_brick_pillar");

    public static final List<BlockSpec> BLOCKS = FAMILY.blocks();
    public static final List<RecipeSpec> RECIPES = FAMILY.recipes();

    private DripstoneContent() {
    }

    public static void contribute(ContentCatalog.Builder catalog) {
        BLOCKS.forEach(catalog::block);
        catalog.recipes(RECIPES);
    }

    private static BlockSpec block(String path) {
        return FAMILY.block(path);
    }

    private static BlockPropertiesSpec properties(float hardness, float resistance) {
        return BlockPropertiesSpec.builder()
                .strength(hardness, resistance)
                .sound(SoundProfile.DRIPSTONE_BLOCK)
                .mapColor(MapColorProfile.TERRACOTTA_BROWN)
                .instrument(InstrumentProfile.BASEDRUM)
                .requiresCorrectToolForDrops()
                .build();
    }
}
