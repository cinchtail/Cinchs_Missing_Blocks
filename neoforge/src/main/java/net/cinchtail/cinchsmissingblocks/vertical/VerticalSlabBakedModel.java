package net.cinchtail.cinchsmissingblocks.vertical;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.BakedModelWrapper;
import net.neoforged.neoforge.client.model.data.ModelData;
import org.jetbrains.annotations.Nullable;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/** NeoForge 1.21.1 quad-level vertical slab model wrapper. */
public final class VerticalSlabBakedModel extends BakedModelWrapper<BakedModel> {
    private final int side;
    private final Map<List<BakedQuad>, List<BakedQuad>> listCache = new IdentityHashMap<>();

    public VerticalSlabBakedModel(BakedModel delegate, int side) {
        super(delegate);
        this.side = side & 3;
    }

    @Override
    public List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction face, RandomSource random) {
        Direction sourceFace = face == null ? null : inverseRotate(face, this.side);
        return transform(this.originalModel.getQuads(state, sourceFace, random));
    }

    @Override
    public List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction face, RandomSource random,
                                    ModelData modelData, @Nullable RenderType renderType) {
        Direction sourceFace = face == null ? null : inverseRotate(face, this.side);
        return transform(this.originalModel.getQuads(state, sourceFace, random, modelData, renderType));
    }

    private List<BakedQuad> transform(List<BakedQuad> source) {
        if (source.isEmpty()) return source;
        synchronized (this.listCache) {
            return this.listCache.computeIfAbsent(source, list -> list.stream()
                    .map(quad -> rotateQuad(quad, this.side))
                    .toList());
        }
    }

    private static BakedQuad rotateQuad(BakedQuad quad, int side) {
        int[] data = quad.getVertices().clone();
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
                quad.getTintIndex(),
                rotate(quad.getDirection(), side),
                quad.getSprite(),
                quad.isShade(),
                quad.hasAmbientOcclusion()
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
