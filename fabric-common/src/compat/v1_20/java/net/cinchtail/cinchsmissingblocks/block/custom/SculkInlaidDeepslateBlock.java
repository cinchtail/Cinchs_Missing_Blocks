package net.cinchtail.cinchsmissingblocks.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public final class SculkInlaidDeepslateBlock extends Block {
    public SculkInlaidDeepslateBlock(Properties properties) { super(properties); }

    @Override
    public void spawnAfterBreak(BlockState state, ServerLevel level, BlockPos pos, ItemStack tool, boolean dropExperience) {
        super.spawnAfterBreak(state, level, pos, tool, dropExperience);
        if (dropExperience) tryDropExperience(level, pos, tool, UniformInt.of(1, 5));
    }
}
