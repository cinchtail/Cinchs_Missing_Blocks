package net.cinchtail.cinchsmissingblocks.common;

import net.cinchtail.cinchsmissingblocks.common.block.BlockKind;
import net.cinchtail.cinchsmissingblocks.common.block.BlockPropertiesSpec;
import net.cinchtail.cinchsmissingblocks.common.block.BlockSetProfile;
import net.cinchtail.cinchsmissingblocks.common.block.BlockSpec;
import net.cinchtail.cinchsmissingblocks.common.block.InstrumentProfile;
import net.cinchtail.cinchsmissingblocks.common.block.MapColorProfile;
import net.cinchtail.cinchsmissingblocks.common.block.SoundProfile;
import net.cinchtail.cinchsmissingblocks.common.catalog.ContentCatalog;
import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;
import net.cinchtail.cinchsmissingblocks.common.loot.LootSpec;
import net.cinchtail.cinchsmissingblocks.common.model.ModelKind;
import net.cinchtail.cinchsmissingblocks.common.model.ModelSpec;

/**
 * Vanilla-adjacent blocks that do not need custom Minecraft behavior.
 *
 * <p>This class intentionally keeps the definitions explicit. The shared layer owns the data,
 * while platform modules only translate these specs into their current Minecraft API.</p>
 */
public final class StandardBlocksContent {
    private StandardBlocksContent() {
    }

    public static void contribute(ContentCatalog.Builder catalog) {

        // Brick Blocks
        block(catalog, "cracked_bricks", BlockKind.SIMPLE, null, props(2.0F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("cracked_bricks"));
        block(catalog, "cracked_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("bricks"), props(2.0F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("cracked_bricks"));
        block(catalog, "cracked_brick_slab", BlockKind.SLAB, null, props(2.0F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("cracked_bricks"));
        block(catalog, "cracked_brick_wall", BlockKind.WALL, null, props(2.0F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("cracked_bricks"));
        block(catalog, "mossy_bricks", BlockKind.SIMPLE, null, props(2.0F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("mossy_bricks"));
        block(catalog, "mossy_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("bricks"), props(2.0F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("mossy_bricks"));
        block(catalog, "mossy_brick_slab", BlockKind.SLAB, null, props(2.0F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("mossy_bricks"));
        block(catalog, "mossy_brick_wall", BlockKind.WALL, null, props(2.0F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("mossy_bricks"));
        block(catalog, "chiseled_bricks", BlockKind.SIMPLE, null, props(2.0F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("chiseled_bricks"));

        // Mud Brick Blocks
        block(catalog, "packed_mud_stairs", BlockKind.STAIRS, ResourceId.minecraft("mud_bricks"), props(1.0F, 3.0F, SoundProfile.PACKED_MUD, MapColorProfile.TERRACOTTA_LIGHT_GRAY, true, true, false, false, false), ModelKind.STAIRS, ResourceId.minecraft("packed_mud"));
        block(catalog, "packed_mud_slab", BlockKind.SLAB, null, props(1.0F, 3.0F, SoundProfile.PACKED_MUD, MapColorProfile.TERRACOTTA_LIGHT_GRAY, true, true, false, false, false), ModelKind.SLAB, ResourceId.minecraft("packed_mud"));
        block(catalog, "packed_mud_wall", BlockKind.WALL, null, props(1.0F, 3.0F, SoundProfile.PACKED_MUD, MapColorProfile.TERRACOTTA_LIGHT_GRAY, true, true, false, false, false), ModelKind.WALL, ResourceId.minecraft("packed_mud"));
        block(catalog, "cracked_mud_bricks", BlockKind.SIMPLE, null, props(1.5F, 3.0F, SoundProfile.MUD_BRICKS, MapColorProfile.TERRACOTTA_LIGHT_GRAY, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("cracked_mud_bricks"));
        block(catalog, "cracked_mud_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("mud_bricks"), props(1.5F, 3.0F, SoundProfile.MUD_BRICKS, MapColorProfile.TERRACOTTA_LIGHT_GRAY, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("cracked_mud_bricks"));
        block(catalog, "cracked_mud_brick_slab", BlockKind.SLAB, null, props(1.5F, 3.0F, SoundProfile.MUD_BRICKS, MapColorProfile.TERRACOTTA_LIGHT_GRAY, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("cracked_mud_bricks"));
        block(catalog, "cracked_mud_brick_wall", BlockKind.WALL, null, props(1.5F, 3.0F, SoundProfile.MUD_BRICKS, MapColorProfile.TERRACOTTA_LIGHT_GRAY, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("cracked_mud_bricks"));
        block(catalog, "mossy_mud_bricks", BlockKind.SIMPLE, null, props(1.5F, 3.0F, SoundProfile.MUD_BRICKS, MapColorProfile.TERRACOTTA_LIGHT_GRAY, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("mossy_mud_bricks"));
        block(catalog, "mossy_mud_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("mud_bricks"), props(1.5F, 3.0F, SoundProfile.MUD_BRICKS, MapColorProfile.TERRACOTTA_LIGHT_GRAY, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("mossy_mud_bricks"));
        block(catalog, "mossy_mud_brick_slab", BlockKind.SLAB, null, props(1.5F, 3.0F, SoundProfile.MUD_BRICKS, MapColorProfile.TERRACOTTA_LIGHT_GRAY, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("mossy_mud_bricks"));
        block(catalog, "mossy_mud_brick_wall", BlockKind.WALL, null, props(1.5F, 3.0F, SoundProfile.MUD_BRICKS, MapColorProfile.TERRACOTTA_LIGHT_GRAY, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("mossy_mud_bricks"));
        block(catalog, "chiseled_mud_bricks", BlockKind.SIMPLE, null, props(1.5F, 3.0F, SoundProfile.MUD_BRICKS, MapColorProfile.TERRACOTTA_LIGHT_GRAY, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("chiseled_mud_bricks"));
        block(catalog, "mud_brick_pillar", BlockKind.PILLAR, null, props(1.5F, 3.0F, SoundProfile.MUD_BRICKS, MapColorProfile.TERRACOTTA_LIGHT_GRAY, true, true, false, false, false), ModelKind.PILLAR, ResourceId.mod("mud_brick_pillar"));

        // Resin Blocks
        block(catalog, "cracked_resin_bricks", BlockKind.SIMPLE, null, props(1.5F, 6.0F, SoundProfile.RESIN_BRICKS, MapColorProfile.TERRACOTTA_ORANGE, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("cracked_resin_bricks"));
        block(catalog, "cracked_resin_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("resin_bricks"), props(1.5F, 6.0F, SoundProfile.RESIN_BRICKS, MapColorProfile.TERRACOTTA_ORANGE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("cracked_resin_bricks"));
        block(catalog, "cracked_resin_brick_slab", BlockKind.SLAB, null, props(1.5F, 6.0F, SoundProfile.RESIN_BRICKS, MapColorProfile.TERRACOTTA_ORANGE, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("cracked_resin_bricks"));
        block(catalog, "cracked_resin_brick_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.RESIN_BRICKS, MapColorProfile.TERRACOTTA_ORANGE, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("cracked_resin_bricks"));
        block(catalog, "mossy_resin_bricks", BlockKind.SIMPLE, null, props(1.5F, 6.0F, SoundProfile.RESIN_BRICKS, MapColorProfile.TERRACOTTA_ORANGE, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("mossy_resin_bricks"));
        block(catalog, "mossy_resin_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("resin_bricks"), props(1.5F, 6.0F, SoundProfile.RESIN_BRICKS, MapColorProfile.TERRACOTTA_ORANGE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("mossy_resin_bricks"));
        block(catalog, "mossy_resin_brick_slab", BlockKind.SLAB, null, props(1.5F, 6.0F, SoundProfile.RESIN_BRICKS, MapColorProfile.TERRACOTTA_ORANGE, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("mossy_resin_bricks"));
        block(catalog, "mossy_resin_brick_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.RESIN_BRICKS, MapColorProfile.TERRACOTTA_ORANGE, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("mossy_resin_bricks"));

        // Endstone Blocks
        block(catalog, "end_stone_stairs", BlockKind.STAIRS, ResourceId.minecraft("end_stone"), props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.STAIRS, ResourceId.minecraft("end_stone"));
        block(catalog, "end_stone_slab", BlockKind.SLAB, null, props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.SLAB, ResourceId.minecraft("end_stone"));
        block(catalog, "end_stone_wall", BlockKind.WALL, null, props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.WALL, ResourceId.minecraft("end_stone"));
        block(catalog, "polished_end_stone", BlockKind.SIMPLE, null, props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("polished_end_stone"));
        block(catalog, "polished_end_stone_stairs", BlockKind.STAIRS, ResourceId.minecraft("end_stone"), props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("polished_end_stone"));
        block(catalog, "polished_end_stone_slab", BlockKind.SLAB, null, props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("polished_end_stone"));
        block(catalog, "polished_end_stone_wall", BlockKind.WALL, null, props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("polished_end_stone"));
        block(catalog, "cracked_end_stone_bricks", BlockKind.SIMPLE, null, props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("cracked_end_stone_bricks"));
        block(catalog, "cracked_end_stone_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("end_stone"), props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("cracked_end_stone_bricks"));
        block(catalog, "cracked_end_stone_brick_slab", BlockKind.SLAB, null, props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("cracked_end_stone_bricks"));
        block(catalog, "cracked_end_stone_brick_wall", BlockKind.WALL, null, props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("cracked_end_stone_bricks"));
        block(catalog, "mossy_end_stone_bricks", BlockKind.SIMPLE, null, props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("mossy_end_stone_bricks"));
        block(catalog, "mossy_end_stone_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("end_stone"), props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("mossy_end_stone_bricks"));
        block(catalog, "mossy_end_stone_brick_slab", BlockKind.SLAB, null, props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("mossy_end_stone_bricks"));
        block(catalog, "mossy_end_stone_brick_wall", BlockKind.WALL, null, props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("mossy_end_stone_bricks"));
        block(catalog, "chiseled_end_stone_bricks", BlockKind.SIMPLE, null, props(3.0F, 9.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("chiseled_end_stone_bricks"));
        block(catalog, "end_stone_brick_pillar", BlockKind.PILLAR, null, props(0.0F, 0.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.PILLAR, ResourceId.mod("end_stone_brick_pillar"));

        // Stone Blocks
        block(catalog, "stone_wall", BlockKind.WALL, null, props(2.0F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.WALL, ResourceId.minecraft("stone"));
        block(catalog, "smooth_stone_stairs", BlockKind.STAIRS, ResourceId.minecraft("smooth_stone"), props(2.0F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.minecraft("smooth_stone"));
        block(catalog, "smooth_stone_wall", BlockKind.WALL, null, props(2.0F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.WALL, ResourceId.minecraft("smooth_stone"));
        block(catalog, "cracked_stone_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("stone_bricks"), props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.minecraft("cracked_stone_bricks"));
        block(catalog, "cracked_stone_brick_slab", BlockKind.SLAB, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.SLAB, ResourceId.minecraft("cracked_stone_bricks"));
        block(catalog, "cracked_stone_brick_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.WALL, ResourceId.minecraft("cracked_stone_bricks"));
        block(catalog, "stone_tiles", BlockKind.SIMPLE, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("stone_tiles"));
        block(catalog, "stone_tile_stairs", BlockKind.STAIRS, ResourceId.minecraft("stone_bricks"), props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("stone_tiles"));
        block(catalog, "stone_tile_slab", BlockKind.SLAB, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("stone_tiles"));
        block(catalog, "stone_tile_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("stone_tiles"));
        block(catalog, "cracked_stone_tiles", BlockKind.SIMPLE, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("cracked_stone_tiles"));
        block(catalog, "cracked_stone_tile_stairs", BlockKind.STAIRS, ResourceId.minecraft("stone_bricks"), props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("cracked_stone_tiles"));
        block(catalog, "cracked_stone_tile_slab", BlockKind.SLAB, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("cracked_stone_tiles"));
        block(catalog, "cracked_stone_tile_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("cracked_stone_tiles"));
        block(catalog, "mossy_stone_tiles", BlockKind.SIMPLE, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("mossy_stone_tiles"));
        block(catalog, "mossy_stone_tile_stairs", BlockKind.STAIRS, ResourceId.minecraft("stone_bricks"), props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("mossy_stone_tiles"));
        block(catalog, "mossy_stone_tile_slab", BlockKind.SLAB, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("mossy_stone_tiles"));
        block(catalog, "mossy_stone_tile_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("mossy_stone_tiles"));
        block(catalog, "stone_brick_pillar", BlockKind.PILLAR, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.STONE, true, true, false, false, false), ModelKind.PILLAR, ResourceId.mod("stone_brick_pillar"));

        // Deepslate Blocks
        block(catalog, "deepslate_stairs", BlockKind.STAIRS, ResourceId.minecraft("deepslate"), props(3.0F, 6.0F, SoundProfile.DEEPSLATE, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.PREBUILT_BLOCK_ITEM, ResourceId.mod("deepslate_stairs"));
        block(catalog, "deepslate_slab", BlockKind.SLAB, null, props(3.0F, 6.0F, SoundProfile.DEEPSLATE, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.PREBUILT_BLOCK_ITEM, ResourceId.mod("deepslate_slab"));
        block(catalog, "deepslate_wall", BlockKind.WALL, null, props(3.0F, 6.0F, SoundProfile.DEEPSLATE, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.PREBUILT_WALL_ITEM, ResourceId.mod("deepslate_wall"));
        block(catalog, "mossy_cobbled_deepslate", BlockKind.SIMPLE, null, props(3.5F, 6.0F, SoundProfile.DEEPSLATE, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("mossy_cobbled_deepslate"));
        block(catalog, "mossy_cobbled_deepslate_stairs", BlockKind.STAIRS, ResourceId.mod("mossy_cobbled_deepslate"), props(3.5F, 6.0F, SoundProfile.DEEPSLATE, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("mossy_cobbled_deepslate"));
        block(catalog, "mossy_cobbled_deepslate_slab", BlockKind.SLAB, null, props(3.5F, 6.0F, SoundProfile.DEEPSLATE, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("mossy_cobbled_deepslate"));
        block(catalog, "mossy_cobbled_deepslate_wall", BlockKind.WALL, null, props(3.5F, 6.0F, SoundProfile.DEEPSLATE, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("mossy_cobbled_deepslate"));
        block(catalog, "cracked_deepslate_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("cracked_deepslate_bricks"), props(3.5F, 6.0F, SoundProfile.DEEPSLATE_BRICKS, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.minecraft("cracked_deepslate_bricks"));
        block(catalog, "cracked_deepslate_brick_slab", BlockKind.SLAB, null, props(3.5F, 6.0F, SoundProfile.DEEPSLATE_BRICKS, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.SLAB, ResourceId.minecraft("cracked_deepslate_bricks"));
        block(catalog, "cracked_deepslate_brick_wall", BlockKind.WALL, null, props(3.5F, 6.0F, SoundProfile.DEEPSLATE_BRICKS, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.WALL, ResourceId.minecraft("cracked_deepslate_bricks"));
        block(catalog, "mossy_deepslate_bricks", BlockKind.SIMPLE, null, props(3.5F, 6.0F, SoundProfile.DEEPSLATE_BRICKS, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("mossy_deepslate_bricks"));
        block(catalog, "mossy_deepslate_brick_stairs", BlockKind.STAIRS, ResourceId.mod("mossy_deepslate_bricks"), props(3.5F, 6.0F, SoundProfile.DEEPSLATE_BRICKS, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("mossy_deepslate_bricks"));
        block(catalog, "mossy_deepslate_brick_slab", BlockKind.SLAB, null, props(3.5F, 6.0F, SoundProfile.DEEPSLATE_BRICKS, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("mossy_deepslate_bricks"));
        block(catalog, "mossy_deepslate_brick_wall", BlockKind.WALL, null, props(3.5F, 6.0F, SoundProfile.DEEPSLATE_BRICKS, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("mossy_deepslate_bricks"));
        block(catalog, "cracked_deepslate_tile_stairs", BlockKind.STAIRS, ResourceId.minecraft("cracked_deepslate_tiles"), props(3.5F, 6.0F, SoundProfile.DEEPSLATE_TILES, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.minecraft("cracked_deepslate_tiles"));
        block(catalog, "cracked_deepslate_tile_slab", BlockKind.SLAB, null, props(3.5F, 6.0F, SoundProfile.DEEPSLATE_TILES, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.SLAB, ResourceId.minecraft("cracked_deepslate_tiles"));
        block(catalog, "cracked_deepslate_tile_wall", BlockKind.WALL, null, props(3.5F, 6.0F, SoundProfile.DEEPSLATE_TILES, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.WALL, ResourceId.minecraft("cracked_deepslate_tiles"));
        block(catalog, "mossy_deepslate_tiles", BlockKind.SIMPLE, null, props(3.5F, 6.0F, SoundProfile.DEEPSLATE_TILES, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("mossy_deepslate_tiles"));
        block(catalog, "mossy_deepslate_tile_stairs", BlockKind.STAIRS, ResourceId.mod("mossy_deepslate_tiles"), props(3.5F, 6.0F, SoundProfile.DEEPSLATE_TILES, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("mossy_deepslate_tiles"));
        block(catalog, "mossy_deepslate_tile_slab", BlockKind.SLAB, null, props(3.5F, 6.0F, SoundProfile.DEEPSLATE_TILES, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("mossy_deepslate_tiles"));
        block(catalog, "mossy_deepslate_tile_wall", BlockKind.WALL, null, props(3.5F, 6.0F, SoundProfile.DEEPSLATE_TILES, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("mossy_deepslate_tiles"));
        block(catalog, "deepslate_brick_pillar", BlockKind.PILLAR, null, props(3.5F, 6.0F, SoundProfile.DEEPSLATE_BRICKS, MapColorProfile.DEEPSLATE, true, true, false, false, false), ModelKind.PILLAR, ResourceId.mod("deepslate_brick_pillar"));
        interactive(catalog, "polished_deepslate_pressure_plate", BlockKind.PRESSURE_PLATE, props(0.0F, 0.0F, SoundProfile.POLISHED_DEEPSLATE, MapColorProfile.DEEPSLATE, true, true, true, true, false), ModelKind.PRESSURE_PLATE, ResourceId.minecraft("polished_deepslate"), BlockSetProfile.POLISHED_DEEPSLATE, 0);
        interactive(catalog, "polished_deepslate_button", BlockKind.BUTTON, props(0.5F, 0.5F, SoundProfile.STONE, MapColorProfile.DEEPSLATE, true, true, true, true, true), ModelKind.BUTTON, ResourceId.minecraft("polished_deepslate"), BlockSetProfile.POLISHED_DEEPSLATE, 20);

        // Blackstone Bricks
        block(catalog, "cracked_polished_blackstone_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("polished_blackstone"), props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_BLACK, true, true, false, false, false), ModelKind.STAIRS, ResourceId.minecraft("cracked_polished_blackstone_bricks"));
        block(catalog, "cracked_polished_blackstone_brick_slab", BlockKind.SLAB, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_BLACK, true, true, false, false, false), ModelKind.SLAB, ResourceId.minecraft("cracked_polished_blackstone_bricks"));
        block(catalog, "cracked_polished_blackstone_brick_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_BLACK, true, true, false, false, false), ModelKind.WALL, ResourceId.minecraft("cracked_polished_blackstone_bricks"));
        block(catalog, "blackstone_tiles", BlockKind.SIMPLE, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_BLACK, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("blackstone_tiles"));
        block(catalog, "blackstone_tile_stairs", BlockKind.STAIRS, ResourceId.minecraft("polished_blackstone"), props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_BLACK, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("blackstone_tiles"));
        block(catalog, "blackstone_tile_slab", BlockKind.SLAB, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_BLACK, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("blackstone_tiles"));
        block(catalog, "blackstone_tile_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_BLACK, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("blackstone_tiles"));
        block(catalog, "cracked_blackstone_tiles", BlockKind.SIMPLE, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_BLACK, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("cracked_blackstone_tiles"));
        block(catalog, "cracked_blackstone_tile_stairs", BlockKind.STAIRS, ResourceId.minecraft("polished_blackstone"), props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_BLACK, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("cracked_blackstone_tiles"));
        block(catalog, "cracked_blackstone_tile_slab", BlockKind.SLAB, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_BLACK, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("cracked_blackstone_tiles"));
        block(catalog, "cracked_blackstone_tile_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_BLACK, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("cracked_blackstone_tiles"));
        block(catalog, "blackstone_brick_pillar", BlockKind.PILLAR, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_BLACK, true, true, false, false, false), ModelKind.PILLAR, ResourceId.mod("blackstone_brick_pillar"));

        // Netherrack
        block(catalog, "netherrack_stairs", BlockKind.STAIRS, ResourceId.minecraft("netherrack"), props(0.4F, 0.4F, SoundProfile.NETHERRACK, MapColorProfile.NETHER, true, true, false, false, false), ModelKind.STAIRS, ResourceId.minecraft("netherrack"));
        block(catalog, "netherrack_slab", BlockKind.SLAB, null, props(0.4F, 0.4F, SoundProfile.NETHERRACK, MapColorProfile.NETHER, true, true, false, false, false), ModelKind.SLAB, ResourceId.minecraft("netherrack"));
        block(catalog, "netherrack_wall", BlockKind.WALL, null, props(0.4F, 0.4F, SoundProfile.NETHERRACK, MapColorProfile.NETHER, true, true, false, false, false), ModelKind.WALL, ResourceId.minecraft("netherrack"));

        // Nether Bricks
        block(catalog, "cracked_nether_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("nether_bricks"), props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.NETHER, true, true, false, false, false), ModelKind.STAIRS, ResourceId.minecraft("cracked_nether_bricks"));
        block(catalog, "cracked_nether_brick_slab", BlockKind.SLAB, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.NETHER, true, true, false, false, false), ModelKind.SLAB, ResourceId.minecraft("cracked_nether_bricks"));
        block(catalog, "cracked_nether_brick_wall", BlockKind.WALL, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.NETHER, true, true, false, false, false), ModelKind.WALL, ResourceId.minecraft("cracked_nether_bricks"));
        block(catalog, "cracked_nether_brick_fence", BlockKind.FENCE, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.NETHER, true, true, false, false, false), ModelKind.FENCE, ResourceId.minecraft("cracked_nether_bricks"));

        // Red Nether Bricks
        block(catalog, "red_nether_brick_fence", BlockKind.FENCE, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.NETHER, true, true, false, false, false), ModelKind.FENCE, ResourceId.minecraft("red_nether_bricks"));
        block(catalog, "cracked_red_nether_bricks", BlockKind.SIMPLE, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.NETHER, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("cracked_red_nether_bricks"));
        block(catalog, "cracked_red_nether_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("red_nether_bricks"), props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.NETHER, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("cracked_red_nether_bricks"));
        block(catalog, "cracked_red_nether_brick_slab", BlockKind.SLAB, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.NETHER, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("cracked_red_nether_bricks"));
        block(catalog, "cracked_red_nether_brick_wall", BlockKind.WALL, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.NETHER, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("cracked_red_nether_bricks"));
        block(catalog, "cracked_red_nether_brick_fence", BlockKind.FENCE, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.NETHER, true, true, false, false, false), ModelKind.FENCE, ResourceId.mod("cracked_red_nether_bricks"));
        block(catalog, "chiseled_red_nether_bricks", BlockKind.SIMPLE, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.NETHER, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("chiseled_red_nether_bricks"));

        // Blue Nether Bricks
        block(catalog, "blue_nether_bricks", BlockKind.SIMPLE, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.COLOR_LIGHT_BLUE, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("blue_nether_bricks"));
        block(catalog, "blue_nether_brick_stairs", BlockKind.STAIRS, ResourceId.mod("blue_nether_bricks"), props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.COLOR_LIGHT_BLUE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("blue_nether_bricks"));
        block(catalog, "blue_nether_brick_slab", BlockKind.SLAB, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.COLOR_LIGHT_BLUE, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("blue_nether_bricks"));
        block(catalog, "blue_nether_brick_wall", BlockKind.WALL, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.COLOR_LIGHT_BLUE, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("blue_nether_bricks"));
        block(catalog, "blue_nether_brick_fence", BlockKind.FENCE, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.COLOR_LIGHT_BLUE, true, true, false, false, false), ModelKind.FENCE, ResourceId.mod("blue_nether_bricks"));
        block(catalog, "cracked_blue_nether_bricks", BlockKind.SIMPLE, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.COLOR_LIGHT_BLUE, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("cracked_blue_nether_bricks"));
        block(catalog, "cracked_blue_nether_brick_stairs", BlockKind.STAIRS, ResourceId.mod("blue_nether_bricks"), props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.COLOR_LIGHT_BLUE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("cracked_blue_nether_bricks"));
        block(catalog, "cracked_blue_nether_brick_slab", BlockKind.SLAB, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.COLOR_LIGHT_BLUE, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("cracked_blue_nether_bricks"));
        block(catalog, "cracked_blue_nether_brick_wall", BlockKind.WALL, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.COLOR_LIGHT_BLUE, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("cracked_blue_nether_bricks"));
        block(catalog, "cracked_blue_nether_brick_fence", BlockKind.FENCE, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.COLOR_LIGHT_BLUE, true, true, false, false, false), ModelKind.FENCE, ResourceId.mod("cracked_blue_nether_bricks"));
        block(catalog, "chiseled_blue_nether_bricks", BlockKind.SIMPLE, null, props(2.0F, 6.0F, SoundProfile.NETHER_BRICKS, MapColorProfile.COLOR_LIGHT_BLUE, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("chiseled_blue_nether_bricks"));

        // Prismarine Blocks
        block(catalog, "prismarine_brick_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.DIAMOND, true, true, false, false, false), ModelKind.WALL, ResourceId.minecraft("prismarine_bricks"));
        block(catalog, "dark_prismarine_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.DIAMOND, true, true, false, false, false), ModelKind.WALL, ResourceId.minecraft("dark_prismarine"));
        block(catalog, "cracked_prismarine_bricks", BlockKind.SIMPLE, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.DIAMOND, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("cracked_prismarine_bricks"));
        block(catalog, "cracked_prismarine_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("prismarine_bricks"), props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.DIAMOND, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("cracked_prismarine_bricks"));
        block(catalog, "cracked_prismarine_brick_slab", BlockKind.SLAB, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.DIAMOND, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("cracked_prismarine_bricks"));
        block(catalog, "cracked_prismarine_brick_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.DIAMOND, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("cracked_prismarine_bricks"));
        block(catalog, "mossy_prismarine_bricks", BlockKind.SIMPLE, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.DIAMOND, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("mossy_prismarine_bricks"));
        block(catalog, "mossy_prismarine_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("prismarine_bricks"), props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.DIAMOND, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("mossy_prismarine_bricks"));
        block(catalog, "mossy_prismarine_brick_slab", BlockKind.SLAB, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.DIAMOND, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("mossy_prismarine_bricks"));
        block(catalog, "mossy_prismarine_brick_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.DIAMOND, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("mossy_prismarine_bricks"));
        block(catalog, "chiseled_prismarine_bricks", BlockKind.SIMPLE, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.DIAMOND, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("chiseled_prismarine_bricks"));
        block(catalog, "prismarine_brick_pillar", BlockKind.PILLAR, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.DIAMOND, true, true, false, false, false), ModelKind.PILLAR, ResourceId.mod("prismarine_brick_pillar"));

        // Smooth Basalt
        block(catalog, "smooth_basalt_stairs", BlockKind.STAIRS, ResourceId.minecraft("smooth_basalt"), props(1.25F, 4.2F, SoundProfile.BASALT, MapColorProfile.COLOR_BLACK, true, true, false, false, false), ModelKind.STAIRS, ResourceId.minecraft("smooth_basalt"));
        block(catalog, "smooth_basalt_slab", BlockKind.SLAB, null, props(1.25F, 4.2F, SoundProfile.BASALT, MapColorProfile.COLOR_BLACK, true, true, false, false, false), ModelKind.SLAB, ResourceId.minecraft("smooth_basalt"));
        block(catalog, "smooth_basalt_wall", BlockKind.WALL, null, props(1.25F, 4.2F, SoundProfile.BASALT, MapColorProfile.COLOR_BLACK, true, true, false, false, false), ModelKind.WALL, ResourceId.minecraft("smooth_basalt"));

        // Sandstone Blocks
        block(catalog, "smooth_sandstone_wall", BlockKind.WALL, null, props(2.0F, 6.0F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.WALL_CUSTOM_TOP, ResourceId.minecraft("sandstone"));
        block(catalog, "cut_sandstone_stairs", BlockKind.STAIRS, ResourceId.minecraft("cut_sandstone"), props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.PREBUILT_BLOCK_ITEM, ResourceId.mod("cut_sandstone_stairs"));
        block(catalog, "cut_sandstone_wall", BlockKind.WALL, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.PREBUILT_WALL_ITEM, ResourceId.mod("cut_sandstone_wall"));
        block(catalog, "sandstone_bricks", BlockKind.SIMPLE, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("sandstone_bricks"));
        block(catalog, "sandstone_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("sandstone"), props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("sandstone_bricks"));
        block(catalog, "sandstone_brick_slab", BlockKind.SLAB, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("sandstone_bricks"));
        block(catalog, "sandstone_brick_wall", BlockKind.WALL, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("sandstone_bricks"));
        block(catalog, "cracked_sandstone_bricks", BlockKind.SIMPLE, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("cracked_sandstone_bricks"));
        block(catalog, "cracked_sandstone_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("sandstone"), props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("cracked_sandstone_bricks"));
        block(catalog, "cracked_sandstone_brick_slab", BlockKind.SLAB, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("cracked_sandstone_bricks"));
        block(catalog, "cracked_sandstone_brick_wall", BlockKind.WALL, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("cracked_sandstone_bricks"));
        block(catalog, "mossy_sandstone_bricks", BlockKind.SIMPLE, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("mossy_sandstone_bricks"));
        block(catalog, "mossy_sandstone_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("sandstone"), props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("mossy_sandstone_bricks"));
        block(catalog, "mossy_sandstone_brick_slab", BlockKind.SLAB, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("mossy_sandstone_bricks"));
        block(catalog, "mossy_sandstone_brick_wall", BlockKind.WALL, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("mossy_sandstone_bricks"));
        block(catalog, "sandstone_brick_pillar", BlockKind.PILLAR, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.PILLAR, ResourceId.mod("sandstone_brick_pillar"));

        // Red Sandstone Blocks
        block(catalog, "smooth_red_sandstone_wall", BlockKind.WALL, null, props(2.0F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.WALL_CUSTOM_TOP, ResourceId.minecraft("red_sandstone"));
        block(catalog, "cut_red_sandstone_stairs", BlockKind.STAIRS, ResourceId.minecraft("cut_red_sandstone"), props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.PREBUILT_BLOCK_ITEM, ResourceId.mod("cut_red_sandstone_stairs"));
        block(catalog, "cut_red_sandstone_wall", BlockKind.WALL, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.PREBUILT_WALL_ITEM, ResourceId.mod("cut_red_sandstone_wall"));
        block(catalog, "red_sandstone_bricks", BlockKind.SIMPLE, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("red_sandstone_bricks"));
        block(catalog, "red_sandstone_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("red_sandstone"), props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("red_sandstone_bricks"));
        block(catalog, "red_sandstone_brick_slab", BlockKind.SLAB, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("red_sandstone_bricks"));
        block(catalog, "red_sandstone_brick_wall", BlockKind.WALL, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("red_sandstone_bricks"));
        block(catalog, "cracked_red_sandstone_bricks", BlockKind.SIMPLE, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("cracked_red_sandstone_bricks"));
        block(catalog, "cracked_red_sandstone_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("red_sandstone"), props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("cracked_red_sandstone_bricks"));
        block(catalog, "cracked_red_sandstone_brick_slab", BlockKind.SLAB, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("cracked_red_sandstone_bricks"));
        block(catalog, "cracked_red_sandstone_brick_wall", BlockKind.WALL, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("cracked_red_sandstone_bricks"));
        block(catalog, "mossy_red_sandstone_bricks", BlockKind.SIMPLE, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("mossy_red_sandstone_bricks"));
        block(catalog, "mossy_red_sandstone_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("red_sandstone"), props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("mossy_red_sandstone_bricks"));
        block(catalog, "mossy_red_sandstone_brick_slab", BlockKind.SLAB, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("mossy_red_sandstone_bricks"));
        block(catalog, "mossy_red_sandstone_brick_wall", BlockKind.WALL, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("mossy_red_sandstone_bricks"));
        block(catalog, "red_sandstone_brick_pillar", BlockKind.PILLAR, null, props(0.8F, 0.8F, SoundProfile.STONE, MapColorProfile.SAND, true, true, false, false, false), ModelKind.PILLAR, ResourceId.mod("red_sandstone_brick_pillar"));

        // Cinnabar Blocks
        block(catalog, "cracked_cinnabar_bricks", BlockKind.SIMPLE, null, props(1.5F, 6.0F, SoundProfile.CINNABAR, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("cracked_cinnabar_bricks"));
        block(catalog, "cracked_cinnabar_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("cinnabar"), props(1.5F, 6.0F, SoundProfile.CINNABAR, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("cracked_cinnabar_bricks"));
        block(catalog, "cracked_cinnabar_brick_slab", BlockKind.SLAB, null, props(1.5F, 6.0F, SoundProfile.CINNABAR, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("cracked_cinnabar_bricks"));
        block(catalog, "cracked_cinnabar_brick_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.CINNABAR, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("cracked_cinnabar_bricks"));
        block(catalog, "mossy_cinnabar_bricks", BlockKind.SIMPLE, null, props(1.5F, 6.0F, SoundProfile.CINNABAR, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("mossy_cinnabar_bricks"));
        block(catalog, "mossy_cinnabar_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("cinnabar"), props(1.5F, 6.0F, SoundProfile.CINNABAR, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("mossy_cinnabar_bricks"));
        block(catalog, "mossy_cinnabar_brick_slab", BlockKind.SLAB, null, props(1.5F, 6.0F, SoundProfile.CINNABAR, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("mossy_cinnabar_bricks"));
        block(catalog, "mossy_cinnabar_brick_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.CINNABAR, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("mossy_cinnabar_bricks"));
        block(catalog, "cinnabar_brick_pillar", BlockKind.PILLAR, null, props(1.5F, 6.0F, SoundProfile.CINNABAR, MapColorProfile.COLOR_RED, true, true, false, false, false), ModelKind.PILLAR, ResourceId.mod("cinnabar_brick_pillar"));
        block(catalog, "cracked_sulfur_bricks", BlockKind.SIMPLE, null, props(1.5F, 6.0F, SoundProfile.SULFUR, MapColorProfile.COLOR_YELLOW, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("cracked_sulfur_bricks"));
        block(catalog, "cracked_sulfur_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("sulfur"), props(1.5F, 6.0F, SoundProfile.SULFUR, MapColorProfile.COLOR_YELLOW, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("cracked_sulfur_bricks"));
        block(catalog, "cracked_sulfur_brick_slab", BlockKind.SLAB, null, props(1.5F, 6.0F, SoundProfile.SULFUR, MapColorProfile.COLOR_YELLOW, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("cracked_sulfur_bricks"));
        block(catalog, "cracked_sulfur_brick_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.SULFUR, MapColorProfile.COLOR_YELLOW, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("cracked_sulfur_bricks"));
        block(catalog, "mossy_sulfur_bricks", BlockKind.SIMPLE, null, props(1.5F, 6.0F, SoundProfile.SULFUR, MapColorProfile.COLOR_YELLOW, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("mossy_sulfur_bricks"));
        block(catalog, "mossy_sulfur_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("sulfur"), props(1.5F, 6.0F, SoundProfile.SULFUR, MapColorProfile.COLOR_YELLOW, true, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("mossy_sulfur_bricks"));
        block(catalog, "mossy_sulfur_brick_slab", BlockKind.SLAB, null, props(1.5F, 6.0F, SoundProfile.SULFUR, MapColorProfile.COLOR_YELLOW, true, true, false, false, false), ModelKind.SLAB, ResourceId.mod("mossy_sulfur_bricks"));
        block(catalog, "mossy_sulfur_brick_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.SULFUR, MapColorProfile.COLOR_YELLOW, true, true, false, false, false), ModelKind.WALL, ResourceId.mod("mossy_sulfur_bricks"));
        block(catalog, "sulfur_brick_pillar", BlockKind.PILLAR, null, props(1.5F, 6.0F, SoundProfile.SULFUR, MapColorProfile.COLOR_YELLOW, true, true, false, false, false), ModelKind.PILLAR, ResourceId.mod("sulfur_brick_pillar"));

        // Purpur Blocks
        block(catalog, "purpur_wall", BlockKind.WALL, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_MAGENTA, true, true, false, false, false), ModelKind.WALL, ResourceId.minecraft("purpur_block"));
        block(catalog, "chiseled_purpur", BlockKind.SIMPLE, null, props(1.5F, 6.0F, SoundProfile.STONE, MapColorProfile.COLOR_MAGENTA, true, true, false, false, false), ModelKind.CUBE, ResourceId.mod("chiseled_purpur"));

        // Snow Blocks
        blockWithLoot(catalog, "snow_bricks", BlockKind.SIMPLE, null, props(0.2F, 0.2F, SoundProfile.SNOW, MapColorProfile.SNOW, false, true, false, false, false), ModelKind.CUBE, ResourceId.mod("snow_bricks"), LootSpec.snowballsOrSelf());
        blockWithLoot(catalog, "snow_brick_stairs", BlockKind.STAIRS, ResourceId.minecraft("snow_block"), props(0.2F, 0.2F, SoundProfile.SNOW, MapColorProfile.SNOW, false, true, false, false, false), ModelKind.STAIRS, ResourceId.mod("snow_bricks"), LootSpec.snowballsOrSelf());
        blockWithLoot(catalog, "snow_brick_slab", BlockKind.SLAB, null, props(0.2F, 0.2F, SoundProfile.SNOW, MapColorProfile.SNOW, false, true, false, false, false), ModelKind.SLAB, ResourceId.mod("snow_bricks"), LootSpec.snowballSlab());
        blockWithLoot(catalog, "snow_brick_wall", BlockKind.WALL, null, props(0.2F, 0.2F, SoundProfile.SNOW, MapColorProfile.SNOW, false, true, false, false, false), ModelKind.WALL, ResourceId.mod("snow_bricks"), LootSpec.snowballsOrSelf());

        // Terracotta Variants
        block(catalog, "terracotta_stairs", BlockKind.STAIRS, ResourceId.minecraft("terracotta"), props(1.25F, 4.2F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.STAIRS, ResourceId.minecraft("terracotta"));
        block(catalog, "terracotta_slab", BlockKind.SLAB, null, props(1.25F, 4.2F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.SLAB, ResourceId.minecraft("terracotta"));
        block(catalog, "terracotta_wall", BlockKind.WALL, null, props(1.25F, 4.2F, SoundProfile.STONE, MapColorProfile.COLOR_ORANGE, true, true, false, false, false), ModelKind.WALL, ResourceId.minecraft("terracotta"));
    }

    private static void block(
            ContentCatalog.Builder catalog,
            String path,
            BlockKind kind,
            ResourceId baseBlock,
            BlockPropertiesSpec properties,
            ModelKind modelKind,
            ResourceId textureSource
    ) {
        catalog.block(BlockSpec.of(
                ResourceId.mod(path),
                kind,
                baseBlock,
                properties,
                kind == BlockKind.SLAB ? LootSpec.slab() : LootSpec.self(),
                new ModelSpec(modelKind, textureSource)
        ));
    }

    private static void blockWithLoot(
            ContentCatalog.Builder catalog,
            String path,
            BlockKind kind,
            ResourceId baseBlock,
            BlockPropertiesSpec properties,
            ModelKind modelKind,
            ResourceId textureSource,
            LootSpec loot
    ) {
        catalog.block(BlockSpec.of(
                ResourceId.mod(path),
                kind,
                baseBlock,
                properties,
                loot,
                new ModelSpec(modelKind, textureSource)
        ));
    }

    private static void interactive(
            ContentCatalog.Builder catalog,
            String path,
            BlockKind kind,
            BlockPropertiesSpec properties,
            ModelKind modelKind,
            ResourceId textureSource,
            BlockSetProfile blockSet,
            int buttonPressTicks
    ) {
        catalog.block(BlockSpec.interactive(
                ResourceId.mod(path),
                kind,
                properties,
                LootSpec.self(),
                new ModelSpec(modelKind, textureSource),
                blockSet,
                buttonPressTicks
        ));
    }

    private static BlockPropertiesSpec props(
            float hardness,
            float resistance,
            SoundProfile sound,
            MapColorProfile mapColor,
            boolean instrument,
            boolean requiresCorrectToolForDrops,
            boolean noCollision,
            boolean destroyOnPush,
            boolean forceSolidOn
    ) {
        BlockPropertiesSpec.Builder builder = BlockPropertiesSpec.builder()
                .strength(hardness, resistance)
                .sound(sound)
                .mapColor(mapColor);

        if (instrument) {
            builder.instrument(InstrumentProfile.BASEDRUM);
        }
        if (requiresCorrectToolForDrops) {
            builder.requiresCorrectToolForDrops();
        }
        if (noCollision) {
            builder.noCollision();
        }
        if (destroyOnPush) {
            builder.destroyOnPush();
        }
        if (forceSolidOn) {
            builder.forceSolidOn();
        }
        return builder.build();
    }
}
