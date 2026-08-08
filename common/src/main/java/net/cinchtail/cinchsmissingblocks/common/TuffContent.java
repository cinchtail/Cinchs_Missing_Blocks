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
import net.cinchtail.cinchsmissingblocks.common.recipe.RecipeSpec;

import java.util.List;

public final class TuffContent {
    private static final ResourceId TUFF = ResourceId.minecraft("tuff");
    private static final ResourceId TUFF_BRICKS = ResourceId.minecraft("tuff_bricks");

    private static final BlockPropertiesSpec BLOCK = properties(true);
    private static final BlockPropertiesSpec SHAPE = properties(true);
    private static final BlockPropertiesSpec STAIRS = properties(false);

    private static final StoneFamily FAMILY = StoneFamilyBuilder.create("tuff", TUFF)
            .stairsBase(TUFF_BRICKS)
            .existingBricks(TUFF_BRICKS)
            .crackedBricks(BLOCK, SHAPE)
            .overrideProperties("cracked_tuff_brick_stairs", STAIRS)
            .mossyBricks(BLOCK, SHAPE)
            .overrideProperties("mossy_tuff_brick_stairs", STAIRS)
            .build();

    public static final BlockSpec CRACKED_TUFF_BRICKS = block("cracked_tuff_bricks");
    public static final BlockSpec CRACKED_TUFF_BRICK_STAIRS = block("cracked_tuff_brick_stairs");
    public static final BlockSpec CRACKED_TUFF_BRICK_SLAB = block("cracked_tuff_brick_slab");
    public static final BlockSpec CRACKED_TUFF_BRICK_WALL = block("cracked_tuff_brick_wall");
    public static final BlockSpec MOSSY_TUFF_BRICKS = block("mossy_tuff_bricks");
    public static final BlockSpec MOSSY_TUFF_BRICK_STAIRS = block("mossy_tuff_brick_stairs");
    public static final BlockSpec MOSSY_TUFF_BRICK_SLAB = block("mossy_tuff_brick_slab");
    public static final BlockSpec MOSSY_TUFF_BRICK_WALL = block("mossy_tuff_brick_wall");

    public static final List<BlockSpec> BLOCKS = FAMILY.blocks();
    public static final List<RecipeSpec> RECIPES = FAMILY.recipes();

    private TuffContent() {
    }

    public static void contribute(ContentCatalog.Builder catalog) {
        BLOCKS.forEach(catalog::block);
        catalog.recipes(RECIPES);
    }

    private static BlockSpec block(String path) {
        return FAMILY.block(path);
    }

    private static BlockPropertiesSpec properties(boolean requiresCorrectToolForDrops) {
        BlockPropertiesSpec.Builder builder = BlockPropertiesSpec.builder()
                .strength(1.5F, 6.0F)
                .sound(SoundProfile.TUFF_BRICKS)
                .mapColor(MapColorProfile.TERRACOTTA_GRAY)
                .instrument(InstrumentProfile.BASEDRUM);

        if (requiresCorrectToolForDrops) {
            builder.requiresCorrectToolForDrops();
        }
        return builder.build();
    }
}
