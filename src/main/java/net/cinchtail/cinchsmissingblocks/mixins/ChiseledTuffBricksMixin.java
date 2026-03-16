package net.cinchtail.cinchsmissingblocks.mixins;

import com.llamalad7.mixinextras.expression.Definition;
import com.llamalad7.mixinextras.expression.Expression;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Debug(export = true)
@Mixin(Blocks.class)
public abstract class ChiseledTuffBricksMixin {

    @Definition(id = "register", method = "Lnet/minecraft/block/Blocks;register(Ljava/lang/String;Lnet/minecraft/block/Block;)Lnet/minecraft/block/Block;")
    @Definition(id = "Block", type = Block.class)
    @Expression("register('chiseled_tuff_bricks', @(new Block(?)))")
    @WrapOperation(method = "<clinit>", at = @At("MIXINEXTRAS:EXPRESSION"))
    private static Block makeChiseledTuffBricksPillarBlock(AbstractBlock.Settings settings, Operation<Block> original) {
        return PillarBlock::new, AbstractBlock.Settings.create();
    }
}