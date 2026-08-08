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

public final class GraniteContent {
    private static final ResourceId RAW = ResourceId.minecraft("granite");
    private static final ResourceId POLISHED = ResourceId.minecraft("polished_granite");
    private static final BlockPropertiesSpec STONE = properties();

    private static final StoneFamily FAMILY = StoneFamilyBuilder.create("granite", RAW)
            .existingPolished(POLISHED)
            .stairsBase(POLISHED)
            .polishedWall(STONE)
            .bricks(STONE)
            .crackedBricks(STONE, STONE)
            .mossyBricks(STONE, STONE)
            .chiseled(STONE, ModelKind.CUBE)
            .pillar(STONE)
            .build();

    public static final BlockSpec POLISHED_GRANITE_WALL = block("polished_granite_wall");
    public static final BlockSpec GRANITE_BRICKS = block("granite_bricks");
    public static final BlockSpec GRANITE_BRICK_STAIRS = block("granite_brick_stairs");
    public static final BlockSpec GRANITE_BRICK_SLAB = block("granite_brick_slab");
    public static final BlockSpec GRANITE_BRICK_WALL = block("granite_brick_wall");
    public static final BlockSpec CRACKED_GRANITE_BRICKS = block("cracked_granite_bricks");
    public static final BlockSpec CRACKED_GRANITE_BRICK_STAIRS = block("cracked_granite_brick_stairs");
    public static final BlockSpec CRACKED_GRANITE_BRICK_SLAB = block("cracked_granite_brick_slab");
    public static final BlockSpec CRACKED_GRANITE_BRICK_WALL = block("cracked_granite_brick_wall");
    public static final BlockSpec MOSSY_GRANITE_BRICKS = block("mossy_granite_bricks");
    public static final BlockSpec MOSSY_GRANITE_BRICK_STAIRS = block("mossy_granite_brick_stairs");
    public static final BlockSpec MOSSY_GRANITE_BRICK_SLAB = block("mossy_granite_brick_slab");
    public static final BlockSpec MOSSY_GRANITE_BRICK_WALL = block("mossy_granite_brick_wall");
    public static final BlockSpec CHISELED_GRANITE_BRICKS = block("chiseled_granite_bricks");
    public static final BlockSpec GRANITE_BRICK_PILLAR = block("granite_brick_pillar");

    public static final List<BlockSpec> BLOCKS = FAMILY.blocks();
    public static final List<RecipeSpec> RECIPES = FAMILY.recipes();

    private GraniteContent() {
    }

    public static void contribute(ContentCatalog.Builder catalog) {
        BLOCKS.forEach(catalog::block);
        catalog.recipes(RECIPES);
    }

    private static BlockSpec block(String path) {
        return FAMILY.block(path);
    }

    private static BlockPropertiesSpec properties() {
        return BlockPropertiesSpec.builder()
                .strength(1.5F, 6.0F)
                .sound(SoundProfile.STONE)
                .mapColor(MapColorProfile.DIRT)
                .instrument(InstrumentProfile.BASEDRUM)
                .requiresCorrectToolForDrops()
                .build();
    }
}
