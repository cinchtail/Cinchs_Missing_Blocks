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

public final class DioriteContent {
    private static final ResourceId RAW = ResourceId.minecraft("diorite");
    private static final ResourceId POLISHED = ResourceId.minecraft("polished_diorite");
    private static final BlockPropertiesSpec STONE = properties(1.5F, 6.0F);
    private static final BlockPropertiesSpec LEGACY_BRICK_WALL = properties(0.0F, 0.0F);

    private static final StoneFamily FAMILY = StoneFamilyBuilder.create("diorite", RAW)
            .existingPolished(POLISHED)
            .stairsBase(POLISHED)
            .polishedWall(STONE)
            .bricks(STONE)
            .overrideProperties("diorite_brick_wall", LEGACY_BRICK_WALL)
            .crackedBricks(STONE, STONE)
            .mossyBricks(STONE, STONE)
            .chiseled(STONE, ModelKind.CUBE)
            .pillar(STONE)
            .build();

    public static final BlockSpec POLISHED_DIORITE_WALL = block("polished_diorite_wall");
    public static final BlockSpec DIORITE_BRICKS = block("diorite_bricks");
    public static final BlockSpec DIORITE_BRICK_STAIRS = block("diorite_brick_stairs");
    public static final BlockSpec DIORITE_BRICK_SLAB = block("diorite_brick_slab");
    public static final BlockSpec DIORITE_BRICK_WALL = block("diorite_brick_wall");
    public static final BlockSpec CRACKED_DIORITE_BRICKS = block("cracked_diorite_bricks");
    public static final BlockSpec CRACKED_DIORITE_BRICK_STAIRS = block("cracked_diorite_brick_stairs");
    public static final BlockSpec CRACKED_DIORITE_BRICK_SLAB = block("cracked_diorite_brick_slab");
    public static final BlockSpec CRACKED_DIORITE_BRICK_WALL = block("cracked_diorite_brick_wall");
    public static final BlockSpec MOSSY_DIORITE_BRICKS = block("mossy_diorite_bricks");
    public static final BlockSpec MOSSY_DIORITE_BRICK_STAIRS = block("mossy_diorite_brick_stairs");
    public static final BlockSpec MOSSY_DIORITE_BRICK_SLAB = block("mossy_diorite_brick_slab");
    public static final BlockSpec MOSSY_DIORITE_BRICK_WALL = block("mossy_diorite_brick_wall");
    public static final BlockSpec CHISELED_DIORITE_BRICKS = block("chiseled_diorite_bricks");
    public static final BlockSpec DIORITE_BRICK_PILLAR = block("diorite_brick_pillar");

    public static final List<BlockSpec> BLOCKS = FAMILY.blocks();
    public static final List<RecipeSpec> RECIPES = FAMILY.recipes();

    private DioriteContent() {
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
                .sound(SoundProfile.STONE)
                .mapColor(MapColorProfile.QUARTZ)
                .instrument(InstrumentProfile.BASEDRUM)
                .requiresCorrectToolForDrops()
                .build();
    }
}
