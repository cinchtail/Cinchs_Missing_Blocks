package net.cinchtail.cinchsmissingblocks.datagen;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public class ModModels {

    public static final Model WALL_POST = new Model(
            Optional.of(Identifier.of(MOD_ID, "block/multi_texture_template_wall_post")),
            Optional.of("_post"),
            TextureKey.TOP,
            TextureKey.BOTTOM,
            TextureKey.SIDE,
            TextureKey.PARTICLE
    );

    public static final Model WALL_SIDE = new Model(
            Optional.of(Identifier.of(MOD_ID, "block/multi_texture_template_wall_side")),
            Optional.of("_side"),
            TextureKey.TOP,
            TextureKey.BOTTOM,
            TextureKey.SIDE,
            TextureKey.PARTICLE
    );

    public static final Model WALL_SIDE_TALL = new Model(
            Optional.of(Identifier.of(MOD_ID, "block/multi_texture_template_wall_side_tall")),
            Optional.of("_side_tall"),
            TextureKey.TOP,
            TextureKey.BOTTOM,
            TextureKey.SIDE,
            TextureKey.PARTICLE
    );

    public static final Model WALL_INVENTORY = new Model(
            Optional.of(Identifier.of(MOD_ID, "block/multi_texture_wall_inventory")),
            Optional.of("_inventory"),
            TextureKey.TOP,
            TextureKey.BOTTOM,
            TextureKey.SIDE,
            TextureKey.PARTICLE
    );
}