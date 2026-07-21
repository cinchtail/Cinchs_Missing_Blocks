package net.cinchtail.cinchsmissingblocks.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockState;

public class TintedGlassPaneBlock extends IronBarsBlock {


    public TintedGlassPaneBlock(Properties properties) {
        super(properties);
    }

    protected boolean propagatesSkylightDown(BlockState blockState, BlockGetter reader, BlockPos blockPos) {
        return false;
    }

    protected int getLightBlock(BlockState blockState, BlockGetter level, BlockPos blockPos) {
        return 7;
    }
}