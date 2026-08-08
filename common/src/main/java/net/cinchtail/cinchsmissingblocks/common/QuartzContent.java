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

public final class QuartzContent {
    private static final ResourceId QUARTZ_BLOCK = ResourceId.minecraft("quartz_block");
    private static final ResourceId SMOOTH_QUARTZ = ResourceId.minecraft("smooth_quartz");
    private static final ResourceId QUARTZ_BRICKS = ResourceId.minecraft("quartz_bricks");

    private static final BlockPropertiesSpec QUARTZ = BlockPropertiesSpec.builder()
            .strength(0.8F)
            .sound(SoundProfile.STONE)
            .mapColor(MapColorProfile.QUARTZ)
            .instrument(InstrumentProfile.BASEDRUM)
            .requiresCorrectToolForDrops()
            .build();

    private static final BlockPropertiesSpec SMOOTH = BlockPropertiesSpec.builder()
            .strength(2.0F, 6.0F)
            .sound(SoundProfile.STONE)
            .mapColor(MapColorProfile.QUARTZ)
            .instrument(InstrumentProfile.BASEDRUM)
            .requiresCorrectToolForDrops()
            .build();

    private static final StoneFamily FAMILY = StoneFamilyBuilder.create("quartz", QUARTZ_BLOCK)
            .stairsBase(QUARTZ_BRICKS)
            .wall(
                    "quartz_wall",
                    QUARTZ,
                    QUARTZ_BLOCK,
                    QUARTZ_BLOCK,
                    ModelKind.WALL_CUSTOM_SIDE,
                    List.of(QUARTZ_BLOCK)
            )
            .wall(
                    "smooth_quartz_wall",
                    SMOOTH,
                    SMOOTH_QUARTZ,
                    QUARTZ_BLOCK,
                    ModelKind.WALL_CUSTOM_BOTTOM,
                    List.of(SMOOTH_QUARTZ)
            )
            .existingBricks(QUARTZ_BRICKS)
            .brickShapes(QUARTZ, List.of(QUARTZ_BLOCK, QUARTZ_BRICKS))
            .crackedBricks(QUARTZ, QUARTZ)
            .mossyBricks(QUARTZ, QUARTZ)
            .build();

    public static final BlockSpec QUARTZ_WALL = block("quartz_wall");
    public static final BlockSpec SMOOTH_QUARTZ_WALL = block("smooth_quartz_wall");
    public static final BlockSpec QUARTZ_BRICK_STAIRS = block("quartz_brick_stairs");
    public static final BlockSpec QUARTZ_BRICK_SLAB = block("quartz_brick_slab");
    public static final BlockSpec QUARTZ_BRICK_WALL = block("quartz_brick_wall");
    public static final BlockSpec CRACKED_QUARTZ_BRICKS = block("cracked_quartz_bricks");
    public static final BlockSpec CRACKED_QUARTZ_BRICK_STAIRS = block("cracked_quartz_brick_stairs");
    public static final BlockSpec CRACKED_QUARTZ_BRICK_SLAB = block("cracked_quartz_brick_slab");
    public static final BlockSpec CRACKED_QUARTZ_BRICK_WALL = block("cracked_quartz_brick_wall");
    public static final BlockSpec MOSSY_QUARTZ_BRICKS = block("mossy_quartz_bricks");
    public static final BlockSpec MOSSY_QUARTZ_BRICK_STAIRS = block("mossy_quartz_brick_stairs");
    public static final BlockSpec MOSSY_QUARTZ_BRICK_SLAB = block("mossy_quartz_brick_slab");
    public static final BlockSpec MOSSY_QUARTZ_BRICK_WALL = block("mossy_quartz_brick_wall");

    public static final List<BlockSpec> BLOCKS = FAMILY.blocks();
    public static final List<RecipeSpec> RECIPES = FAMILY.recipes();

    private QuartzContent() {
    }

    public static void contribute(ContentCatalog.Builder catalog) {
        BLOCKS.forEach(catalog::block);
        catalog.recipes(RECIPES);
    }

    private static BlockSpec block(String path) {
        return FAMILY.block(path);
    }
}
