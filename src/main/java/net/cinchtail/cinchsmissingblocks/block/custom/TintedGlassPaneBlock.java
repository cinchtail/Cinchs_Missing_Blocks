package net.cinchtail.cinchsmissingblocks.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class TintedGlassPaneBlock extends PaneBlock {

    public TintedGlassPaneBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    @Override
    protected int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        return 7;
    }
}