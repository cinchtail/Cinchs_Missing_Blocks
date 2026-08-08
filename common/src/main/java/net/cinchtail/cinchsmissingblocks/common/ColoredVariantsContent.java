package net.cinchtail.cinchsmissingblocks.common;

import net.cinchtail.cinchsmissingblocks.common.block.BlockKind;
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

/** Shared definitions for the 16 dyed Terracotta and Concrete shape variants. */
public final class ColoredVariantsContent {
    private ColoredVariantsContent() {
    }

    public static void contribute(ContentCatalog.Builder catalog) {
        add(catalog, "white_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_WHITE, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("white_terracotta"));
        add(catalog, "white_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_WHITE, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("white_terracotta"));
        add(catalog, "white_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_WHITE, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("white_terracotta"));
        add(catalog, "white_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_WHITE, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("white_concrete"));
        add(catalog, "white_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_WHITE, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("white_concrete"));
        add(catalog, "white_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_WHITE, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("white_concrete"));
        add(catalog, "light_gray_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_LIGHT_GRAY, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("light_gray_terracotta"));
        add(catalog, "light_gray_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_LIGHT_GRAY, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("light_gray_terracotta"));
        add(catalog, "light_gray_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_LIGHT_GRAY, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("light_gray_terracotta"));
        add(catalog, "light_gray_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_LIGHT_GRAY, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("light_gray_concrete"));
        add(catalog, "light_gray_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_LIGHT_GRAY, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("light_gray_concrete"));
        add(catalog, "light_gray_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_LIGHT_GRAY, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("light_gray_concrete"));
        add(catalog, "gray_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_GRAY, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("gray_terracotta"));
        add(catalog, "gray_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_GRAY, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("gray_terracotta"));
        add(catalog, "gray_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_GRAY, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("gray_terracotta"));
        add(catalog, "gray_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_GRAY, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("gray_concrete"));
        add(catalog, "gray_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_GRAY, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("gray_concrete"));
        add(catalog, "gray_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_GRAY, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("gray_concrete"));
        add(catalog, "black_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_BLACK, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("black_terracotta"));
        add(catalog, "black_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_BLACK, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("black_terracotta"));
        add(catalog, "black_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_BLACK, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("black_terracotta"));
        add(catalog, "black_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_BLACK, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("black_concrete"));
        add(catalog, "black_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_BLACK, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("black_concrete"));
        add(catalog, "black_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_BLACK, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("black_concrete"));
        add(catalog, "brown_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_BROWN, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("brown_terracotta"));
        add(catalog, "brown_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_BROWN, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("brown_terracotta"));
        add(catalog, "brown_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_BROWN, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("brown_terracotta"));
        add(catalog, "brown_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_BROWN, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("brown_concrete"));
        add(catalog, "brown_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_BROWN, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("brown_concrete"));
        add(catalog, "brown_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_BROWN, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("brown_concrete"));
        add(catalog, "red_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_RED, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("red_terracotta"));
        add(catalog, "red_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_RED, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("red_terracotta"));
        add(catalog, "red_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_RED, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("red_terracotta"));
        add(catalog, "red_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_RED, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("red_concrete"));
        add(catalog, "red_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_RED, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("red_concrete"));
        add(catalog, "red_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_RED, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("red_concrete"));
        add(catalog, "orange_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_ORANGE, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("orange_terracotta"));
        add(catalog, "orange_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_ORANGE, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("orange_terracotta"));
        add(catalog, "orange_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_ORANGE, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("orange_terracotta"));
        add(catalog, "orange_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_ORANGE, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("orange_concrete"));
        add(catalog, "orange_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_ORANGE, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("orange_concrete"));
        add(catalog, "orange_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_ORANGE, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("orange_concrete"));
        add(catalog, "yellow_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_YELLOW, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("yellow_terracotta"));
        add(catalog, "yellow_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_YELLOW, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("yellow_terracotta"));
        add(catalog, "yellow_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_YELLOW, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("yellow_terracotta"));
        add(catalog, "yellow_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_YELLOW, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("yellow_concrete"));
        add(catalog, "yellow_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_YELLOW, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("yellow_concrete"));
        add(catalog, "yellow_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_YELLOW, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("yellow_concrete"));
        add(catalog, "lime_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_LIGHT_GREEN, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("lime_terracotta"));
        add(catalog, "lime_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_LIGHT_GREEN, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("lime_terracotta"));
        add(catalog, "lime_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_LIGHT_GREEN, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("lime_terracotta"));
        add(catalog, "lime_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_LIGHT_GREEN, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("lime_concrete"));
        add(catalog, "lime_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_LIGHT_GREEN, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("lime_concrete"));
        add(catalog, "lime_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_LIGHT_GREEN, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("lime_concrete"));
        add(catalog, "green_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_GREEN, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("green_terracotta"));
        add(catalog, "green_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_GREEN, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("green_terracotta"));
        add(catalog, "green_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_GREEN, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("green_terracotta"));
        add(catalog, "green_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_GREEN, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("green_concrete"));
        add(catalog, "green_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_GREEN, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("green_concrete"));
        add(catalog, "green_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_GREEN, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("green_concrete"));
        add(catalog, "cyan_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_CYAN, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("cyan_terracotta"));
        add(catalog, "cyan_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_CYAN, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("cyan_terracotta"));
        add(catalog, "cyan_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_CYAN, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("cyan_terracotta"));
        add(catalog, "cyan_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_CYAN, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("cyan_concrete"));
        add(catalog, "cyan_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_CYAN, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("cyan_concrete"));
        add(catalog, "cyan_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_CYAN, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("cyan_concrete"));
        add(catalog, "light_blue_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_LIGHT_BLUE, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("light_blue_terracotta"));
        add(catalog, "light_blue_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_LIGHT_BLUE, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("light_blue_terracotta"));
        add(catalog, "light_blue_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_LIGHT_BLUE, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("light_blue_terracotta"));
        add(catalog, "light_blue_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_LIGHT_BLUE, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("light_blue_concrete"));
        add(catalog, "light_blue_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_LIGHT_BLUE, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("light_blue_concrete"));
        add(catalog, "light_blue_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_LIGHT_BLUE, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("light_blue_concrete"));
        add(catalog, "blue_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_BLUE, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("blue_terracotta"));
        add(catalog, "blue_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_BLUE, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("blue_terracotta"));
        add(catalog, "blue_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_BLUE, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("blue_terracotta"));
        add(catalog, "blue_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_BLUE, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("blue_concrete"));
        add(catalog, "blue_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_BLUE, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("blue_concrete"));
        add(catalog, "blue_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_BLUE, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("blue_concrete"));
        add(catalog, "purple_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_PURPLE, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("purple_terracotta"));
        add(catalog, "purple_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_PURPLE, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("purple_terracotta"));
        add(catalog, "purple_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_PURPLE, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("purple_terracotta"));
        add(catalog, "purple_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_PURPLE, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("purple_concrete"));
        add(catalog, "purple_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_PURPLE, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("purple_concrete"));
        add(catalog, "purple_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_PURPLE, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("purple_concrete"));
        add(catalog, "magenta_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_MAGENTA, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("magenta_terracotta"));
        add(catalog, "magenta_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_MAGENTA, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("magenta_terracotta"));
        add(catalog, "magenta_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_MAGENTA, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("magenta_terracotta"));
        add(catalog, "magenta_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_MAGENTA, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("magenta_concrete"));
        add(catalog, "magenta_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_MAGENTA, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("magenta_concrete"));
        add(catalog, "magenta_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_MAGENTA, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("magenta_concrete"));
        add(catalog, "pink_terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.25F, 4.2F, MapColorProfile.TERRACOTTA_PINK, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("pink_terracotta"));
        add(catalog, "pink_terracotta_slab", BlockKind.SLAB, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_PINK, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("pink_terracotta"));
        add(catalog, "pink_terracotta_wall", BlockKind.WALL, null, 1.25F, 4.2F, MapColorProfile.TERRACOTTA_PINK, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("pink_terracotta"));
        add(catalog, "pink_concrete_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), 1.8F, 1.8F, MapColorProfile.TERRACOTTA_PINK, LootSpec.self(), ModelKind.STAIRS, ResourceId.minecraft("pink_concrete"));
        add(catalog, "pink_concrete_slab", BlockKind.SLAB, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_PINK, LootSpec.slab(), ModelKind.SLAB, ResourceId.minecraft("pink_concrete"));
        add(catalog, "pink_concrete_wall", BlockKind.WALL, null, 1.8F, 1.8F, MapColorProfile.TERRACOTTA_PINK, LootSpec.self(), ModelKind.WALL, ResourceId.minecraft("pink_concrete"));
    }

    private static void add(ContentCatalog.Builder catalog, String id, BlockKind kind, ResourceId base, float hardness, float resistance, MapColorProfile mapColor, LootSpec loot, ModelKind model, ResourceId texture) {
        BlockPropertiesSpec properties = BlockPropertiesSpec.builder()
                .strength(hardness, resistance)
                .sound(SoundProfile.STONE)
                .mapColor(mapColor)
                .instrument(InstrumentProfile.BASEDRUM)
                .requiresCorrectToolForDrops()
                .build();
        catalog.block(BlockSpec.of(ResourceId.mod(id), kind, base, properties, loot, new ModelSpec(model, texture)));
    }
}
