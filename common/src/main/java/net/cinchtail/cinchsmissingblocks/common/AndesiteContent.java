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

public final class AndesiteContent {
    private static final ResourceId RAW = ResourceId.minecraft("andesite");
    private static final ResourceId POLISHED = ResourceId.minecraft("polished_andesite");
    private static final BlockPropertiesSpec STONE = properties(MapColorProfile.STONE);

    private static final StoneFamily FAMILY = StoneFamilyBuilder.create("andesite", RAW)
            .existingPolished(POLISHED)
            .stairsBase(POLISHED)
            .polishedWall(STONE)
            .bricks(STONE)
            .crackedBricks(STONE, STONE)
            .mossyBricks(STONE, STONE)
            .chiseled(STONE, ModelKind.CUBE)
            .pillar(STONE)
            .build();

    public static final BlockSpec POLISHED_ANDESITE_WALL = block("polished_andesite_wall");
    public static final BlockSpec ANDESITE_BRICKS = block("andesite_bricks");
    public static final BlockSpec ANDESITE_BRICK_STAIRS = block("andesite_brick_stairs");
    public static final BlockSpec ANDESITE_BRICK_SLAB = block("andesite_brick_slab");
    public static final BlockSpec ANDESITE_BRICK_WALL = block("andesite_brick_wall");
    public static final BlockSpec CRACKED_ANDESITE_BRICKS = block("cracked_andesite_bricks");
    public static final BlockSpec CRACKED_ANDESITE_BRICK_STAIRS = block("cracked_andesite_brick_stairs");
    public static final BlockSpec CRACKED_ANDESITE_BRICK_SLAB = block("cracked_andesite_brick_slab");
    public static final BlockSpec CRACKED_ANDESITE_BRICK_WALL = block("cracked_andesite_brick_wall");
    public static final BlockSpec MOSSY_ANDESITE_BRICKS = block("mossy_andesite_bricks");
    public static final BlockSpec MOSSY_ANDESITE_BRICK_STAIRS = block("mossy_andesite_brick_stairs");
    public static final BlockSpec MOSSY_ANDESITE_BRICK_SLAB = block("mossy_andesite_brick_slab");
    public static final BlockSpec MOSSY_ANDESITE_BRICK_WALL = block("mossy_andesite_brick_wall");
    public static final BlockSpec CHISELED_ANDESITE_BRICKS = block("chiseled_andesite_bricks");
    public static final BlockSpec ANDESITE_BRICK_PILLAR = block("andesite_brick_pillar");

    public static final List<BlockSpec> BLOCKS = FAMILY.blocks();
    public static final List<RecipeSpec> RECIPES = FAMILY.recipes();

    private AndesiteContent() {
    }

    public static void contribute(ContentCatalog.Builder catalog) {
        BLOCKS.forEach(catalog::block);
        catalog.recipes(RECIPES);
    }

    private static BlockSpec block(String path) {
        return FAMILY.block(path);
    }

    private static BlockPropertiesSpec properties(MapColorProfile mapColor) {
        return BlockPropertiesSpec.builder()
                .strength(1.5F, 6.0F)
                .sound(SoundProfile.STONE)
                .mapColor(mapColor)
                .instrument(InstrumentProfile.BASEDRUM)
                .requiresCorrectToolForDrops()
                .build();
    }
}
