package net.cinchtail.cinchsmissingblocks.mixins;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Blocks.class)
public class ChiseledTuffBricksMixin {

    @Shadow
    @Final
    @Mutable
    public static Block CHISELED_TUFF_BRICKS;

    @Inject(method = "<clinit>", at = @At("RETURN"))
    private static void replaceChiseledTuffBricks(CallbackInfo ci) {
        BlockBehaviour.Properties props = BlockBehaviour.Properties.ofLegacyCopy(Blocks.TUFF_BRICKS);

        CHISELED_TUFF_BRICKS = new RotatedPillarBlock(props);
    }
}