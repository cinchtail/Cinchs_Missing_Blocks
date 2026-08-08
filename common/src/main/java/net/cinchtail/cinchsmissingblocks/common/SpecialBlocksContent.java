package net.cinchtail.cinchsmissingblocks.common;

import net.cinchtail.cinchsmissingblocks.common.block.BlockBehavior;
import net.cinchtail.cinchsmissingblocks.common.block.BlockPropertiesSpec;
import net.cinchtail.cinchsmissingblocks.common.block.BlockSpec;
import net.cinchtail.cinchsmissingblocks.common.block.InstrumentProfile;
import net.cinchtail.cinchsmissingblocks.common.block.MapColorProfile;
import net.cinchtail.cinchsmissingblocks.common.block.SoundProfile;
import net.cinchtail.cinchsmissingblocks.common.catalog.ContentCatalog;
import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;
import net.cinchtail.cinchsmissingblocks.common.loot.LootSpec;
import net.cinchtail.cinchsmissingblocks.common.model.ModelKind;
import net.cinchtail.cinchsmissingblocks.common.model.ModelSpec;
import net.cinchtail.cinchsmissingblocks.common.recipe.RecipeCategorySpec;
import net.cinchtail.cinchsmissingblocks.common.recipe.RecipeKind;
import net.cinchtail.cinchsmissingblocks.common.recipe.RecipeSpec;

public final class SpecialBlocksContent {
    public static final ResourceId SCULK_INLAID_DEEPSLATE = ResourceId.mod("sculk_inlaid_deepslate");
    public static final ResourceId TINTED_GLASS_PANE = ResourceId.mod("tinted_glass_pane");

    private SpecialBlocksContent() {
    }

    public static void contribute(ContentCatalog.Builder catalog) {
        catalog.block(BlockSpec.custom(
                SCULK_INLAID_DEEPSLATE,
                BlockPropertiesSpec.builder()
                        .strength(3.5F, 6.0F)
                        .sound(SoundProfile.DEEPSLATE_BRICKS)
                        .mapColor(MapColorProfile.DEEPSLATE)
                        .instrument(InstrumentProfile.BASEDRUM)
                        .requiresCorrectToolForDrops()
                        .build(),
                LootSpec.silkTouch(),
                new ModelSpec(ModelKind.PREBUILT_BLOCK_ITEM, SCULK_INLAID_DEEPSLATE),
                BlockBehavior.SCULK_XP_DROP
        ));

        catalog.block(BlockSpec.custom(
                TINTED_GLASS_PANE,
                BlockPropertiesSpec.builder()
                        .strength(0.3F)
                        .sound(SoundProfile.GLASS)
                        .mapColor(MapColorProfile.COLOR_GRAY)
                        .build(),
                LootSpec.silkTouch(),
                new ModelSpec(ModelKind.PREBUILT_ITEM, TINTED_GLASS_PANE),
                BlockBehavior.TINTED_GLASS_PANE
        ));

        catalog.recipe(RecipeSpec.of(
                RecipeKind.STAINED_GLASS_PANE,
                RecipeCategorySpec.DECORATIONS,
                TINTED_GLASS_PANE,
                ResourceId.minecraft("tinted_glass")
        ));
    }
}
