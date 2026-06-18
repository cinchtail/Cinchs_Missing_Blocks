package net.cinchtail.cinchsmissingblocks.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;

public class TintedGlassPaneBlock extends PaneBlock {

    public TintedGlassPaneBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean isTransparent(BlockState state) {
        return false;
    }

    @Override
    protected int getOpacity(BlockState state) {
        return 7;
    }
}