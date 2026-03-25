package net.cinchtail.cinchsmissingblocks.datagen;

import net.minecraft.block.Block;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TextureMap;
import net.minecraft.util.Identifier;

public class BlockModelHelpers {

    private BlockModelHelpers() {
    }

    public static void button(BlockStateModelGenerator gen, Block block, Identifier texture) {
        Identifier regular = Models.BUTTON.upload(block, TextureMap.texture(texture), gen.modelCollector);
        Identifier pressed = Models.BUTTON_PRESSED.upload(block, TextureMap.texture(texture), gen.modelCollector);
        Identifier inventory = Models.BUTTON_INVENTORY.upload(block, TextureMap.texture(texture), gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createButtonBlockState(block, regular, pressed)
        );
        gen.registerParentedItemModel(block, inventory);
    }

    public static void pressurePlate(BlockStateModelGenerator gen, Block block, Identifier texture) {
        Identifier up = Models.PRESSURE_PLATE_UP.upload(block, TextureMap.texture(texture), gen.modelCollector);
        Identifier down = Models.PRESSURE_PLATE_DOWN.upload(block, TextureMap.texture(texture), gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createPressurePlateBlockState(block, up, down)
        );
    }

    public static void slab(BlockStateModelGenerator gen, Block slab, Block base, Identifier texture) {
        Identifier bottom = Models.SLAB.upload(slab, TextureMap.texture(texture), gen.modelCollector);
        Identifier top = Models.SLAB_TOP.upload(slab, TextureMap.texture(texture), gen.modelCollector);
        Identifier dbl = Models.CUBE_ALL.upload(base, TextureMap.texture(texture), gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createSlabBlockState(slab, bottom, top, dbl)
        );
    }

    public static void stairs(BlockStateModelGenerator gen, Block stairs, Identifier texture) {
        Identifier regular = Models.STAIRS.upload(stairs, TextureMap.texture(texture), gen.modelCollector);
        Identifier inner = Models.INNER_STAIRS.upload(stairs, TextureMap.texture(texture), gen.modelCollector);
        Identifier outer = Models.OUTER_STAIRS.upload(stairs, TextureMap.texture(texture), gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createStairsBlockState(stairs, inner, regular, outer)
        );
    }

    public static void wall(BlockStateModelGenerator gen, Block wall, Identifier texture) {
        Identifier post = Models.TEMPLATE_WALL_POST.upload(wall, TextureMap.texture(texture), gen.modelCollector);
        Identifier low = Models.TEMPLATE_WALL_SIDE.upload(wall, TextureMap.texture(texture), gen.modelCollector);
        Identifier tall = Models.TEMPLATE_WALL_SIDE_TALL.upload(wall, TextureMap.texture(texture), gen.modelCollector);
        Identifier inventory = Models.WALL_INVENTORY.upload(wall, TextureMap.texture(texture), gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createWallBlockState(wall, post, low, tall)
        );

        gen.registerParentedItemModel(wall, inventory);
    }

    public static void fence(BlockStateModelGenerator gen, Block fence, Identifier texture) {
        Identifier post = Models.FENCE_POST.upload(fence, TextureMap.texture(texture), gen.modelCollector);
        Identifier side = Models.FENCE_SIDE.upload(fence, TextureMap.texture(texture), gen.modelCollector);
        Identifier inventory = Models.FENCE_INVENTORY.upload(fence, TextureMap.texture(texture), gen.modelCollector);

        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createFenceBlockState(fence, post, side)
        );

        gen.registerParentedItemModel(fence, inventory);
    }
}
