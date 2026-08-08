package net.cinchtail.cinchsmissingblocks.block.custom;

import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

/** Light-query signatures used from Minecraft 1.21.2 until the 26.1 API generation. */
public final class TintedGlassPaneBlock extends IronBarsBlock {
    public TintedGlassPaneBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public boolean propagatesSkylightDown(BlockState state) {
        return false;
    }

    public int getLightBlock(BlockState state) {
        return 7;
    }
}
