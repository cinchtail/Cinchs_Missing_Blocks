package net.cinchtail.cinchsmissingblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class TintedGlassPaneBlock extends IronBarsBlock {

    public static final MapCodec<TintedGlassPaneBlock> CODEC = simpleCodec(TintedGlassPaneBlock::new);

    public MapCodec<TintedGlassPaneBlock> codec() {
        return CODEC;
    }

    public TintedGlassPaneBlock(final BlockBehaviour.Properties properties) {
        super(properties);
    }

    protected boolean propagatesSkylightDown(final BlockState state) {
        return false;
    }

    protected int getLightDampening(final BlockState state) {
        return 7;
    }
}