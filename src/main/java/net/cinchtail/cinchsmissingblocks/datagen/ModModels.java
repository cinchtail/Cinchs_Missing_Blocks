package net.cinchtail.cinchsmissingblocks.datagen;

import net.minecraft.client.data.Model;
import net.minecraft.client.data.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModels {

    public static final Model WALL_POST = new Model(
            Optional.of(Identifier.of("cinchsmissingblocks", "block/multi_texture_template_wall_post")),
            Optional.of("_post"),
            TextureKey.TOP,
            TextureKey.BOTTOM,
            TextureKey.SIDE,
            TextureKey.PARTICLE
    );

    public static final Model WALL_SIDE = new Model(
            Optional.of(Identifier.of("cinchsmissingblocks", "block/multi_texture_template_wall_side")),
            Optional.of("_side"),
            TextureKey.TOP,
            TextureKey.BOTTOM,
            TextureKey.SIDE,
            TextureKey.PARTICLE
    );

    public static final Model WALL_SIDE_TALL = new Model(
            Optional.of(Identifier.of("cinchsmissingblocks", "block/multi_texture_template_wall_side_tall")),
            Optional.of("_side_tall"),
            TextureKey.TOP,
            TextureKey.BOTTOM,
            TextureKey.SIDE,
            TextureKey.PARTICLE
    );

    public static final Model WALL_INVENTORY = new Model(
            Optional.of(Identifier.of("cinchsmissingblocks", "block/multi_texture_wall_inventory")),
            Optional.of("_inventory"),
            TextureKey.TOP,
            TextureKey.BOTTOM,
            TextureKey.SIDE,
            TextureKey.PARTICLE
    );
}