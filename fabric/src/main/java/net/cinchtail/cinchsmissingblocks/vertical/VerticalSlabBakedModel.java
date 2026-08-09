package net.cinchtail.cinchsmissingblocks.vertical;

import net.minecraft.block.BlockState;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.BakedQuad;
import net.minecraft.client.render.model.json.ModelOverrideList;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.texture.Sprite;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import org.jetbrains.annotations.Nullable;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/**
 * Rotates a slab's baked quads instead of rotating a MatrixStack after model lookup.
 * This keeps geometry, culling and face lighting consistent with the vertical hitbox.
 */
public final class VerticalSlabBakedModel implements BakedModel {
    private final BakedModel delegate;
    private final int side;
    private final Map<List<BakedQuad>, List<BakedQuad>> listCache = new IdentityHashMap<>();

    public VerticalSlabBakedModel(BakedModel delegate, int side) {
        this.delegate = delegate;
        this.side = side & 3;
    }

    @Override
    public List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction face, Random random) {
        Direction sourceFace = face == null ? null : inverseRotate(face, this.side);
        List<BakedQuad> source = this.delegate.getQuads(state, sourceFace, random);
        if (source.isEmpty()) return source;

        synchronized (this.listCache) {
            return this.listCache.computeIfAbsent(source, list -> list.stream()
                    .map(quad -> rotateQuad(quad, this.side))
                    .toList());
        }
    }

    @Override
    public boolean useAmbientOcclusion() {
        return this.delegate.useAmbientOcclusion();
    }

    @Override
    public boolean hasDepth() {
        return this.delegate.hasDepth();
    }

    @Override
    public boolean isSideLit() {
        return this.delegate.isSideLit();
    }

    @Override
    public boolean isBuiltin() {
        return this.delegate.isBuiltin();
    }

    @Override
    public Sprite getParticleSprite() {
        return this.delegate.getParticleSprite();
    }

    @Override
    public ModelTransformation getTransformation() {
        return this.delegate.getTransformation();
    }

    @Override
    public ModelOverrideList getOverrides() {
        return this.delegate.getOverrides();
    }

    private static BakedQuad rotateQuad(BakedQuad quad, int side) {
        int[] data = quad.getVertexData().clone();
        int stride = data.length / 4;
        if (stride < 3) return quad;

        for (int vertex = 0; vertex < 4; vertex++) {
            int base = vertex * stride;
            float x = Float.intBitsToFloat(data[base]);
            float y = Float.intBitsToFloat(data[base + 1]);
            float z = Float.intBitsToFloat(data[base + 2]);

            float nx;
            float ny;
            float nz;
            switch (side & 3) {
                case 0 -> { nx = x;        ny = 1.0F - z; nz = y; }
                case 1 -> { nx = 1.0F - y; ny = x;        nz = z; }
                case 2 -> { nx = x;        ny = z;        nz = 1.0F - y; }
                default -> { nx = y;       ny = 1.0F - x; nz = z; }
            }

            data[base] = Float.floatToRawIntBits(nx);
            data[base + 1] = Float.floatToRawIntBits(ny);
            data[base + 2] = Float.floatToRawIntBits(nz);
        }

        return new BakedQuad(
                data,
                quad.getColorIndex(),
                rotate(quad.getFace(), side),
                quad.getSprite(),
                quad.hasShade()
        );
    }

    private static Direction inverseRotate(Direction direction, int side) {
        return rotate(direction, (side + 2) & 3);
    }

    private static Direction rotate(Direction direction, int side) {
        return switch (side & 3) {
            case 0 -> switch (direction) {
                case DOWN -> Direction.NORTH;
                case UP -> Direction.SOUTH;
                case NORTH -> Direction.UP;
                case SOUTH -> Direction.DOWN;
                default -> direction;
            };
            case 1 -> switch (direction) {
                case DOWN -> Direction.EAST;
                case UP -> Direction.WEST;
                case EAST -> Direction.UP;
                case WEST -> Direction.DOWN;
                default -> direction;
            };
            case 2 -> switch (direction) {
                case DOWN -> Direction.SOUTH;
                case UP -> Direction.NORTH;
                case NORTH -> Direction.DOWN;
                case SOUTH -> Direction.UP;
                default -> direction;
            };
            default -> switch (direction) {
                case DOWN -> Direction.WEST;
                case UP -> Direction.EAST;
                case EAST -> Direction.DOWN;
                case WEST -> Direction.UP;
                default -> direction;
            };
        };
    }
}
