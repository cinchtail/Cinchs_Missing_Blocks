package net.cinchtail.cinchsmissingblocks.datagen;

import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class BlockModelHelpers {

    public static void button(BlockStateModelGenerator gen, Block button, Identifier texture) {
        Identifier regular = Models.BUTTON.upload(button, TextureMap.texture(texture), gen.modelCollector);
        Identifier pressed = Models.BUTTON_PRESSED.upload(button, TextureMap.texture(texture), gen.modelCollector);
        Identifier inventory = Models.BUTTON_INVENTORY.upload(button, TextureMap.texture(texture), gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createButtonBlockState(button, regular, pressed)
        );
        gen.registerParentedItemModel(button, inventory);
    }

    public static void pressurePlate(BlockStateModelGenerator gen, Block pressurePlate, Identifier texture) {
        Identifier up = Models.PRESSURE_PLATE_UP.upload(pressurePlate, TextureMap.texture(texture), gen.modelCollector);
        Identifier down = Models.PRESSURE_PLATE_DOWN.upload(pressurePlate, TextureMap.texture(texture), gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createPressurePlateBlockState(pressurePlate, up, down)
        );
        gen.registerParentedItemModel(pressurePlate, up);
    }

    public static void slab(BlockStateModelGenerator gen, Block slab, Block base, Identifier texture) {
        TextureMap tex = new TextureMap()
                .put(TextureKey.BOTTOM, texture)
                .put(TextureKey.TOP, texture)
                .put(TextureKey.SIDE, texture);

        Identifier bottom = Models.SLAB.upload(slab, tex, gen.modelCollector);
        Identifier top = Models.SLAB_TOP.upload(slab, tex, gen.modelCollector);

        Identifier dbl = ModelIds.getBlockModelId(base);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createSlabBlockState(slab, bottom, top, dbl)
        );

        gen.registerParentedItemModel(slab, bottom);
    }

    public static void stairs(BlockStateModelGenerator gen, Block stairs, Identifier texture) {
        TextureMap tex = new TextureMap()
                .put(TextureKey.BOTTOM, texture)
                .put(TextureKey.TOP, texture)
                .put(TextureKey.SIDE, texture);

        Identifier regular = Models.STAIRS.upload(stairs, tex, gen.modelCollector);
        Identifier inner = Models.INNER_STAIRS.upload(stairs, tex, gen.modelCollector);
        Identifier outer = Models.OUTER_STAIRS.upload(stairs, tex, gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createStairsBlockState(stairs, inner, regular, outer)
        );

        gen.registerParentedItemModel(stairs, regular);
    }

    public static void wall(BlockStateModelGenerator gen, Block wall, Identifier texture) {
        TextureMap tex = new TextureMap()
                .put(TextureKey.WALL, texture);

        Identifier post = Models.TEMPLATE_WALL_POST.upload(wall, tex, gen.modelCollector);
        Identifier low = Models.TEMPLATE_WALL_SIDE.upload(wall, tex, gen.modelCollector);
        Identifier tall = Models.TEMPLATE_WALL_SIDE_TALL.upload(wall, tex, gen.modelCollector);
        Identifier inventory = Models.WALL_INVENTORY.upload(wall, tex, gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createWallBlockState(wall, post, low, tall)
        );

        gen.registerParentedItemModel(wall, inventory);
    }

    public static void cubeColumn(BlockStateModelGenerator gen, Block block, Identifier end, Identifier side) {
        TextureMap tex = new TextureMap()
                .put(TextureKey.END, end)
                .put(TextureKey.SIDE, side);

        Identifier model = Models.CUBE_COLUMN.upload(block, tex, gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createSingletonBlockState(block, model)
        );

        gen.registerParentedItemModel(block, model);
    }

    public static void pillar(BlockStateModelGenerator gen, Block block, Identifier end, Identifier side) {
        TextureMap tex = new TextureMap()
                .put(TextureKey.END, end)
                .put(TextureKey.SIDE, side);

        Identifier model = Models.CUBE_COLUMN.upload(block, tex, gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createAxisRotatedBlockState(block, model)
        );

        gen.registerParentedItemModel(block, model);
    }

    public static void fence(BlockStateModelGenerator gen, Block fence, Identifier texture) {
        TextureMap tex = new TextureMap()
                .put(TextureKey.TEXTURE, texture);

        Identifier post = Models.FENCE_POST.upload(fence, tex, gen.modelCollector);
        Identifier side = Models.FENCE_SIDE.upload(fence, tex, gen.modelCollector);
        Identifier inventory = Models.FENCE_INVENTORY.upload(fence, tex, gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createFenceBlockState(fence, post, side)
        );

        gen.registerParentedItemModel(fence, inventory);
    }
}