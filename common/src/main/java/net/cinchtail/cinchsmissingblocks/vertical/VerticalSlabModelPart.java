package net.cinchtail.cinchsmissingblocks.vertical;

import net.minecraft.client.renderer.block.dispatch.BlockStateModelPart;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.Direction;
import org.joml.Vector3f;
import org.joml.Vector3fc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * Rotates a baked slab model at quad level instead of rotating a PoseStack after culling.
 * This keeps geometry, face direction, culling and lighting in agreement.
 */
public final class VerticalSlabModelPart implements BlockStateModelPart {
    private final BlockStateModelPart delegate;
    private final int side;
    private final AtomicReferenceArray<List<BakedQuad>> quadCache = new AtomicReferenceArray<>(7);

    public VerticalSlabModelPart(BlockStateModelPart delegate, int side) {
        this.delegate = delegate;
        this.side = side & 3;
    }

    @Override
    public List<BakedQuad> getQuads(Direction direction) {
        int cacheIndex = direction == null ? 0 : direction.ordinal() + 1;
        List<BakedQuad> cached = this.quadCache.get(cacheIndex);
        if (cached != null) {
            return cached;
        }

        Direction sourceDirection = direction == null ? null : inverseRotate(direction, this.side);
        List<BakedQuad> source = this.delegate.getQuads(sourceDirection);
        List<BakedQuad> transformed;
        if (source.isEmpty()) {
            transformed = List.of();
        } else {
            ArrayList<BakedQuad> result = new ArrayList<>(source.size());
            for (BakedQuad quad : source) {
                result.add(rotateQuad(quad, this.side));
            }
            transformed = List.copyOf(result);
        }

        if (this.quadCache.compareAndSet(cacheIndex, null, transformed)) {
            return transformed;
        }
        return this.quadCache.get(cacheIndex);
    }

    @Override
    public boolean useAmbientOcclusion() {
        return this.delegate.useAmbientOcclusion();
    }

    @Override
    public Material.Baked particleMaterial() {
        return this.delegate.particleMaterial();
    }

    @Override
    public int materialFlags() {
        return this.delegate.materialFlags();
    }

    private static BakedQuad rotateQuad(BakedQuad quad, int side) {
        return new BakedQuad(
                rotatePosition(quad.position0(), side),
                rotatePosition(quad.position1(), side),
                rotatePosition(quad.position2(), side),
                rotatePosition(quad.position3(), side),
                quad.packedUV0(),
                quad.packedUV1(),
                quad.packedUV2(),
                quad.packedUV3(),
                rotate(quad.direction(), side),
                quad.materialInfo()
        );
    }

    private static Vector3fc rotatePosition(Vector3fc position, int side) {
        float x = position.x();
        float y = position.y();
        float z = position.z();
        return switch (side & 3) {
            // NORTH: bottom half -> north half, +90 degrees around X.
            case 0 -> new Vector3f(x, 1.0F - z, y);
            // EAST: bottom half -> east half, +90 degrees around Z.
            case 1 -> new Vector3f(1.0F - y, x, z);
            // SOUTH: bottom half -> south half, -90 degrees around X.
            case 2 -> new Vector3f(x, z, 1.0F - y);
            // WEST: bottom half -> west half, -90 degrees around Z.
            default -> new Vector3f(y, 1.0F - x, z);
        };
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
