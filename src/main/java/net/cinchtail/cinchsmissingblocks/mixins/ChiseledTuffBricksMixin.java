package net.cinchtail.cinchsmissingblocks.mixins;

import com.llamalad7.mixinextras.expression.Definition;
import com.llamalad7.mixinextras.expression.Expression;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Debug(export = true)
@Mixin(Blocks.class)
public abstract class ChiseledTuffBricksMixin {
    /*@Definition(id = "register", method = "Lnet/minecrafr/world/level/block/Blocks;register(Lnet/lang/String;Lnet/minecraft/world/level/block;")
    @Definition(id = "Block", type = Blocks.class)
    @Expression("register('chiseled_tuff_bricks', new Block(?))")
    @ModifyArg(method = "<clinit>", at = @At("MIXINEXTRAS:EXPRESSION"))
    private static Block makeChiseledTuffBricksPillarBlock(Block original) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.TUFF_BRICKS));
    }*/
}