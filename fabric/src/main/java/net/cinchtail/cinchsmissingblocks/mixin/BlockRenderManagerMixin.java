package net.cinchtail.cinchsmissingblocks.mixin;

import net.cinchtail.cinchsmissingblocks.vertical.VerticalSlabBakedModel;
import net.cinchtail.cinchsmissingblocks.vertical.VerticalSlabState;
import net.cinchtail.cinchsmissingblocks.vertical.VerticalModelCacheEntry;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.client.render.block.BlockModels;
import net.minecraft.client.render.model.BakedModel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Mixin(BlockModels.class)
public abstract class BlockRenderManagerMixin {
    @Unique
    private final Map<BlockState, VerticalModelCacheEntry> cinchs$verticalModels = new ConcurrentHashMap<>();

    @Inject(method = "getModel", at = @At("RETURN"), cancellable = true)
    private void cinchs$verticalModel(BlockState state, CallbackInfoReturnable<BakedModel> cir) {
        if (!(state.getBlock() instanceof SlabBlock)
                || !VerticalSlabState.isVertical(state)
                || state.get(SlabBlock.TYPE) == SlabType.DOUBLE) {
            return;
        }

        BakedModel base = cir.getReturnValue();
        int side = state.get(VerticalSlabState.SIDE);
        VerticalModelCacheEntry entry = this.cinchs$verticalModels.compute(state, (ignored, old) -> {
            if (old != null && old.base == base && old.side == side) return old;
            return new VerticalModelCacheEntry(base, side, new VerticalSlabBakedModel(base, side));
        });
        cir.setReturnValue(entry.vertical);
    }
}
