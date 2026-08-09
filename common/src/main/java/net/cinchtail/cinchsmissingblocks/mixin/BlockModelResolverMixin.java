package net.cinchtail.cinchsmissingblocks.mixin;

import net.cinchtail.cinchsmissingblocks.vertical.VerticalSlabModelPart;
import net.cinchtail.cinchsmissingblocks.vertical.VerticalSlabState;
import net.minecraft.client.renderer.block.BlockModelRenderState;
import net.minecraft.client.renderer.block.BlockModelResolver;
import net.minecraft.client.renderer.block.dispatch.BlockStateModelPart;
import net.minecraft.client.renderer.block.model.BlockDisplayContext;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;

/** Handles uses of slab block models outside normal chunk tessellation. */
@Mixin(BlockModelResolver.class)
public abstract class BlockModelResolverMixin {
    @Inject(method = "update", at = @At("RETURN"))
    private void cinchs$verticalModel(BlockModelRenderState renderState, BlockState blockState,
                                      BlockDisplayContext displayContext, CallbackInfo ci) {
        if (!(blockState.getBlock() instanceof SlabBlock)
                || !VerticalSlabState.isVertical(blockState)
                || blockState.getValue(SlabBlock.TYPE) == SlabType.DOUBLE) {
            return;
        }

        BlockModelRenderStateAccessor accessor = (BlockModelRenderStateAccessor) (Object) renderState;
        List<BlockStateModelPart> parts = accessor.cinchs$getModelParts();
        if (parts == null || parts.isEmpty()) {
            return;
        }

        int side = blockState.getValue(VerticalSlabState.SIDE);
        ArrayList<BlockStateModelPart> wrapped = new ArrayList<>(parts.size());
        for (BlockStateModelPart part : parts) {
            wrapped.add(new VerticalSlabModelPart(part, side));
        }
        accessor.cinchs$setModelParts(wrapped);
    }
}
