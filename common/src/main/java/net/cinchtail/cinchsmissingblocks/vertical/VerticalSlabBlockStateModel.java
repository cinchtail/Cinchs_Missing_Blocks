package net.cinchtail.cinchsmissingblocks.vertical;

import net.minecraft.client.renderer.block.dispatch.BlockStateModel;
import net.minecraft.client.renderer.block.dispatch.BlockStateModelPart;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.util.RandomSource;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/** A loader-neutral wrapper used by the normal chunk/block-state model pipeline. */
public final class VerticalSlabBlockStateModel implements BlockStateModel {
    private final BlockStateModel delegate;
    private final int side;
    private final Map<BlockStateModelPart, BlockStateModelPart> wrappedParts = new ConcurrentHashMap<>();

    public VerticalSlabBlockStateModel(BlockStateModel delegate, int side) {
        this.delegate = delegate;
        this.side = side & 3;
    }

    @Override
    public void collectParts(RandomSource random, List<BlockStateModelPart> output) {
        int first = output.size();
        this.delegate.collectParts(random, output);
        for (int i = first; i < output.size(); i++) {
            BlockStateModelPart original = output.get(i);
            output.set(i, wrappedPart(original));
        }
    }

    @Override
    public Material.Baked particleMaterial() {
        return this.delegate.particleMaterial();
    }

    @Override
    public int materialFlags() {
        return this.delegate.materialFlags();
    }

    private BlockStateModelPart wrappedPart(BlockStateModelPart original) {
        return this.wrappedParts.computeIfAbsent(original, part -> new VerticalSlabModelPart(part, this.side));
    }
}
