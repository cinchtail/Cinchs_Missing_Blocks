package net.cinchtail.cinchsmissingblocks.block.custom;

import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockState;

public class TintedGlassPaneBlock extends IronBarsBlock {

    public TintedGlassPaneBlock(final Properties properties) {
        super(properties);
    }
    protected boolean propagatesSkylightDown(BlockState state) {
        return false;
    }
    protected int getLightDampening(BlockState state) {
        return 7;
    }
}