package net.cinchtail.cinchsmissingblocks.datagen;

import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.Identifier;

import java.util.Optional;

public class ModModels {

    public static final ModelTemplate WALL_POST = new ModelTemplate(
            Optional.of(Identifier.fromNamespaceAndPath("cinchsmissingblocks", "block/multi_texture_template_wall_post")),
            Optional.of("_post"),
            TextureSlot.TOP,
            TextureSlot.BOTTOM,
            TextureSlot.SIDE,
            TextureSlot.PARTICLE
    );

    public static final ModelTemplate WALL_SIDE = new ModelTemplate(
            Optional.of(Identifier.fromNamespaceAndPath("cinchsmissingblocks", "block/multi_texture_template_wall_side")),
            Optional.of("_side"),
            TextureSlot.TOP,
            TextureSlot.BOTTOM,
            TextureSlot.SIDE,
            TextureSlot.PARTICLE
    );

    public static final ModelTemplate WALL_SIDE_TALL = new ModelTemplate(
            Optional.of(Identifier.fromNamespaceAndPath("cinchsmissingblocks", "block/multi_texture_template_wall_side_tall")),
            Optional.of("_side_tall"),
            TextureSlot.TOP,
            TextureSlot.BOTTOM,
            TextureSlot.SIDE,
            TextureSlot.PARTICLE
    );

    public static final ModelTemplate WALL_INVENTORY = new ModelTemplate(
            Optional.of(Identifier.fromNamespaceAndPath("cinchsmissingblocks", "block/multi_texture_wall_inventory")),
            Optional.of("_inventory"),
            TextureSlot.TOP,
            TextureSlot.BOTTOM,
            TextureSlot.SIDE,
            TextureSlot.PARTICLE
    );
}