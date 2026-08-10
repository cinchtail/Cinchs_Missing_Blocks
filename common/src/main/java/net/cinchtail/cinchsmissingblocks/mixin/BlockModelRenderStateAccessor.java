package net.cinchtail.cinchsmissingblocks.mixin;

import net.minecraft.client.renderer.block.BlockModelRenderState;
import net.minecraft.client.renderer.block.dispatch.BlockStateModelPart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(BlockModelRenderState.class)
public interface BlockModelRenderStateAccessor {
    @Accessor("modelParts")
    List<BlockStateModelPart> cinchs$getModelParts();

    @Accessor("modelParts")
    void cinchs$setModelParts(List<BlockStateModelPart> modelParts);
}
