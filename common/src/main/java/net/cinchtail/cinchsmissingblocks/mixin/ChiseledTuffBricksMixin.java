package net.cinchtail.cinchsmissingblocks.mixin;

import com.llamalad7.mixinextras.expression.Definition;
import com.llamalad7.mixinextras.expression.Expression;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.references.BlockItemId;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

import java.util.function.Function;

@Debug(export = true)
@Mixin(Blocks.class)
public abstract class ChiseledTuffBricksMixin {

    @Shadow
    private static Block register(BlockItemId id, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
        throw new IllegalStateException();
    }

    @Definition(id = "register", method = "Lnet/minecraft/world/level/block/Blocks;register(Lnet/minecraft/references/BlockItemId;Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;)Lnet/minecraft/world/level/block/Block;")
    @Definition(id = "CHISELED_TUFF_BRICKS", field = "Lnet/minecraft/references/BlockItemIds;CHISELED_TUFF_BRICKS:Lnet/minecraft/references/BlockItemId;")
    @Expression("register(CHISELED_TUFF_BRICKS, ?)")
    @WrapOperation(method = "<clinit>", at = @At("MIXINEXTRAS:EXPRESSION"))
    private static Block makeChiseledTuffBricksPillarBlock(BlockItemId id, BlockBehaviour.Properties properties, Operation<Block> original) {
        return register(id, RotatedPillarBlock::new, properties);
    }
}
