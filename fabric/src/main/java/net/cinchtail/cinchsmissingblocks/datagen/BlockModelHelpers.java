package net.cinchtail.cinchsmissingblocks.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocksFabric.MOD_ID;

public class BlockModelHelpers {

    private static MultiVariant mv(Identifier model) {
        return BlockModelGenerators.plainVariant(model);
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

    public static void fenceGate(BlockModelGenerators gen, Block gate, Block textureSource) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.TEXTURE, TextureMapping.getBlockTexture(textureSource));

        Identifier open = ModelTemplates.FENCE_GATE_CLOSED.create(gate, tex, gen.modelOutput);
        Identifier closed = ModelTemplates.FENCE_GATE_OPEN.create(gate, tex, gen.modelOutput);
        Identifier openWall = ModelTemplates.FENCE_GATE_WALL_CLOSED.create(gate, tex, gen.modelOutput);
        Identifier closedWall = ModelTemplates.FENCE_GATE_WALL_OPEN.create(gate, tex, gen.modelOutput);
        gen.blockStateOutput.accept(
                BlockModelGenerators.createFenceGate(
                        gate, mv(open), mv(closed), mv(openWall), mv(closedWall), true));

        gen.registerSimpleItemModel(gate, closed);
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

    public static void definableCubeAll(BlockModelGenerators gen, Block block, String texture) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.ALL, material(texture));

        Identifier model = ModelTemplates.CUBE_ALL.create(
                block, tex, gen.modelOutput);

        gen.blockStateOutput.accept(
                BlockModelGenerators.createSimpleBlock(
                        block, mv(model)));

        gen.registerSimpleItemModel(block, model);
    }

    public static void definableBlock(BlockModelGenerators gen, Block block, String top, String bottom, String side) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.TOP, material(top))
                .put(TextureSlot.BOTTOM, material(bottom))
                .put(TextureSlot.SIDE, material(side));

        Identifier model = ModelTemplates.CUBE_BOTTOM_TOP.create(block, tex, gen.modelOutput);

        gen.blockStateOutput.accept(
                BlockModelGenerators.createSimpleBlock(
                        block, mv(model)));

        gen.registerSimpleItemModel(block, model);
    }

    public static void definableStairs(BlockModelGenerators gen, Block stairs, String top, String bottom, String side) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.TOP, material(top))
                .put(TextureSlot.BOTTOM, material(bottom))
                .put(TextureSlot.SIDE, material(side));

        Identifier regular = ModelTemplates.STAIRS_STRAIGHT.create(stairs, tex, gen.modelOutput);
        Identifier inner = ModelTemplates.STAIRS_INNER.create(stairs, tex, gen.modelOutput);
        Identifier outer = ModelTemplates.STAIRS_OUTER.create(stairs, tex, gen.modelOutput);


        gen.blockStateOutput.accept(
                BlockModelGenerators.createStairs(stairs, mv(inner), mv(regular), mv(outer)));

        gen.registerSimpleItemModel(stairs, regular);
    }

    public static void definableSlab(BlockModelGenerators gen, Block slab, Block base, String top, String bottom, String side) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.TOP, material(top))
                .put(TextureSlot.BOTTOM, material(bottom))
                .put(TextureSlot.SIDE, material(side));

        Identifier slabModel = ModelTemplates.SLAB_BOTTOM.create(slab, tex, gen.modelOutput);
        Identifier slabModelTop = ModelTemplates.SLAB_TOP.create(slab, tex, gen.modelOutput);
        Identifier doubleModel = ModelLocationUtils.getModelLocation(base);

        gen.blockStateOutput.accept(
                BlockModelGenerators.createSlab(slab, mv(slabModel), mv(slabModelTop), mv(doubleModel))
        );

        gen.registerSimpleItemModel(slab, slabModel);
    }

    public static void definableWall(BlockModelGenerators gen, Block wall, String top, String bottom, String side) {
        TextureMapping tex = new TextureMapping()
                .put(TextureSlot.TOP, material(top))
                .put(TextureSlot.BOTTOM, material(bottom))
                .put(TextureSlot.SIDE, material(side))
                .put(TextureSlot.PARTICLE, material(top));

        Identifier post = ModModels.WALL_POST.create(wall, tex, gen.modelOutput);
        Identifier low = ModModels.WALL_SIDE.create(wall, tex, gen.modelOutput);
        Identifier tall = ModModels.WALL_SIDE_TALL.create(wall, tex, gen.modelOutput);
        Identifier inventory = ModModels.WALL_INVENTORY.create(wall, tex, gen.modelOutput);

        gen.blockStateOutput.accept(BlockModelGenerators.createWall(wall, mv(post), mv(low), mv(tall)));

        gen.registerSimpleItemModel(wall, inventory);
    }

    private static Material material(String texture) {
        String[] split = texture.split(":", 2);

        if (split.length != 2) {
            throw new IllegalArgumentException(
                    "Texture must be in the format namespace:path. Example: modid:block/block_texture");
        }

        return new Material(Identifier.fromNamespaceAndPath(split[0], split[1]));
    }
}