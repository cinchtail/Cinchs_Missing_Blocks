package net.cinchtail.cinchsmissingblocks.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.*;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;

public final class BlockModelHelpers {

    private BlockModelHelpers() {
    }

    private static MultiVariant mv(Identifier model) {
        return BlockModelGenerators.plainVariant(model);
    }

    public static void slab(BlockModelGenerators gen, Block slab, Block base, Block textureSource) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(textureSource))
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(textureSource))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(textureSource));

        Identifier bottom = ModelTemplates.SLAB_BOTTOM.create(slab, tex, gen.modelOutput);
        Identifier top = ModelTemplates.SLAB_TOP.create(slab, tex, gen.modelOutput);
        Identifier dbl = ModelLocationUtils.getModelLocation(base);

        gen.blockStateOutput.accept(
                BlockModelGenerators.createSlab(slab, mv(bottom), mv(top), mv(dbl))
        );

        gen.registerSimpleItemModel(slab, bottom);
    }

    public static void stairs(BlockModelGenerators gen, Block stairs, Block textureSource) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(textureSource))
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(textureSource))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(textureSource));

        Identifier regular = ModelTemplates.STAIRS_STRAIGHT.create(stairs, tex, gen.modelOutput);
        Identifier inner = ModelTemplates.STAIRS_INNER.create(stairs, tex, gen.modelOutput);
        Identifier outer = ModelTemplates.STAIRS_OUTER.create(stairs, tex, gen.modelOutput);

        gen.blockStateOutput.accept(
                BlockModelGenerators.createStairs(stairs, mv(inner), mv(regular), mv(outer))
        );

        gen.registerSimpleItemModel(stairs, regular);
    }

    public static void wall(BlockModelGenerators gen, Block wall, Block textureSource) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.WALL, TextureMapping.getBlockTexture(textureSource));

        Identifier post = ModelTemplates.WALL_POST.create(wall, tex, gen.modelOutput);
        Identifier low = ModelTemplates.WALL_LOW_SIDE.create(wall, tex, gen.modelOutput);
        Identifier tall = ModelTemplates.WALL_TALL_SIDE.create(wall, tex, gen.modelOutput);
        Identifier inventory = ModelTemplates.WALL_INVENTORY.create(wall, tex, gen.modelOutput);

        gen.blockStateOutput.accept(
                BlockModelGenerators.createWall(wall, mv(post), mv(low), mv(tall))
        );

        gen.registerSimpleItemModel(wall, inventory);
    }

    public static void wallCustomSide(BlockModelGenerators gen, Block wall, Block textureSource) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.WALL, TextureMapping.getBlockTexture(textureSource, "_side"));

        Identifier post = ModelTemplates.WALL_POST.create(wall, tex, gen.modelOutput);
        Identifier low = ModelTemplates.WALL_LOW_SIDE.create(wall, tex, gen.modelOutput);
        Identifier tall = ModelTemplates.WALL_TALL_SIDE.create(wall, tex, gen.modelOutput);
        Identifier inventory = ModelTemplates.WALL_INVENTORY.create(wall, tex, gen.modelOutput);

        gen.blockStateOutput.accept(
                BlockModelGenerators.createWall(wall, mv(post), mv(low), mv(tall))
        );

        gen.registerSimpleItemModel(wall, inventory);
    }

    public static void wallCustomTop(BlockModelGenerators gen, Block wall, Block textureSource) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.WALL, TextureMapping.getBlockTexture(textureSource, "_top"));

        Identifier post = ModelTemplates.WALL_POST.create(wall, tex, gen.modelOutput);
        Identifier low = ModelTemplates.WALL_LOW_SIDE.create(wall, tex, gen.modelOutput);
        Identifier tall = ModelTemplates.WALL_TALL_SIDE.create(wall, tex, gen.modelOutput);
        Identifier inventory = ModelTemplates.WALL_INVENTORY.create(wall, tex, gen.modelOutput);

        gen.blockStateOutput.accept(
                BlockModelGenerators.createWall(wall, mv(post), mv(low), mv(tall))
        );

        gen.registerSimpleItemModel(wall, inventory);
    }

    public static void wallCustomBottom(BlockModelGenerators gen, Block wall, Block textureSource) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.WALL, TextureMapping.getBlockTexture(textureSource, "_bottom"));

        Identifier post = ModelTemplates.WALL_POST.create(wall, tex, gen.modelOutput);
        Identifier low = ModelTemplates.WALL_LOW_SIDE.create(wall, tex, gen.modelOutput);
        Identifier tall = ModelTemplates.WALL_TALL_SIDE.create(wall, tex, gen.modelOutput);
        Identifier inventory = ModelTemplates.WALL_INVENTORY.create(wall, tex, gen.modelOutput);

        gen.blockStateOutput.accept(
                BlockModelGenerators.createWall(wall, mv(post), mv(low), mv(tall))
        );

        gen.registerSimpleItemModel(wall, inventory);
    }

    public static void fence(BlockModelGenerators gen, Block fence, Block textureSource) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.TEXTURE, TextureMapping.getBlockTexture(textureSource));

        Identifier post = ModelTemplates.FENCE_POST.create(fence, tex, gen.modelOutput);
        Identifier side = ModelTemplates.FENCE_SIDE.create(fence, tex, gen.modelOutput);
        Identifier inventory = ModelTemplates.FENCE_INVENTORY.create(fence, tex, gen.modelOutput);

        gen.blockStateOutput.accept(
                BlockModelGenerators.createFence(fence, mv(post), mv(side))
        );

        gen.registerSimpleItemModel(fence, inventory);
    }

    public static void cubeColumn(BlockModelGenerators gen, Block block, Block textureSource) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.END, TextureMapping.getBlockTexture(textureSource, "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(textureSource, "_side"));

        Identifier model = ModelTemplates.CUBE_COLUMN.create(block, tex, gen.modelOutput);

        gen.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(block, BlockModelGenerators.plainVariant(model))
        );

        gen.registerSimpleItemModel(block, model);
    }

    public static void pillar(BlockModelGenerators gen, Block block, Block textureSource) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.END, TextureMapping.getBlockTexture(textureSource, "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(textureSource, "_side"));

        Identifier model = ModelTemplates.CUBE_COLUMN.create(block, tex, gen.modelOutput);

        gen.blockStateOutput.accept(
                BlockModelGenerators.createAxisAlignedPillarBlock(block, mv(model))
                );

        gen.registerSimpleItemModel(block, model);
    }

    public static void pressurePlate(BlockModelGenerators gen, Block pressurePlate, Block textureSource) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.TEXTURE, TextureMapping.getBlockTexture(textureSource));

        Identifier up = ModelTemplates.PRESSURE_PLATE_UP.create(pressurePlate, tex, gen.modelOutput);
        Identifier down = ModelTemplates.PRESSURE_PLATE_DOWN.create(pressurePlate, tex, gen.modelOutput);

        gen.blockStateOutput.accept(
                BlockModelGenerators.createPressurePlate(pressurePlate, mv(up), mv(down))
        );

        gen.registerSimpleItemModel(pressurePlate, up);
    }

    public static void button(BlockModelGenerators gen, Block button, Block textureSource) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.TEXTURE, TextureMapping.getBlockTexture(textureSource));

        Identifier regular = ModelTemplates.BUTTON.create(button, tex, gen.modelOutput);
        Identifier pressed = ModelTemplates.BUTTON_PRESSED.create(button, tex, gen.modelOutput);
        Identifier inventory = ModelTemplates.BUTTON_INVENTORY.create(button, tex, gen.modelOutput);

        gen.blockStateOutput.accept(
                BlockModelGenerators.createButton(button, mv(regular), mv(pressed))
        );

        gen.registerSimpleItemModel(button, inventory);
    }
}
