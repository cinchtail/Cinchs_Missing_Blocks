package net.cinchtail.cinchsmissingblocks.mixin;

import net.cinchtail.cinchsmissingblocks.vertical.VerticalSlabBlockStateModel;
import net.cinchtail.cinchsmissingblocks.vertical.VerticalSlabState;
import net.minecraft.client.renderer.block.BlockStateModelSet;
import net.minecraft.client.renderer.block.dispatch.BlockStateModel;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/** Applies vertical geometry to the normal world/chunk block-state model pipeline. */
@Mixin(BlockStateModelSet.class)
public abstract class BlockStateModelSetMixin {
    @Unique
    private volatile Map<BlockState, BlockStateModel> cinchs$verticalModels;

    @Inject(method = "get", at = @At("RETURN"), cancellable = true)
    private void cinchs$verticalModel(BlockState state, CallbackInfoReturnable<BlockStateModel> cir) {
        if (!(state.getBlock() instanceof SlabBlock)
                || !VerticalSlabState.isVertical(state)
                || state.getValue(SlabBlock.TYPE) == SlabType.DOUBLE) {
            return;
        }

        Map<BlockState, BlockStateModel> models = this.cinchs$verticalModels;
        if (models == null) {
            synchronized (this) {
                models = this.cinchs$verticalModels;
                if (models == null) {
                    models = new ConcurrentHashMap<>();
                    this.cinchs$verticalModels = models;
                }
            }
        }

        BlockStateModel baseModel = cir.getReturnValue();
        int side = state.getValue(VerticalSlabState.SIDE);
        cir.setReturnValue(models.computeIfAbsent(state, ignored -> new VerticalSlabBlockStateModel(baseModel, side)));
    }
}
