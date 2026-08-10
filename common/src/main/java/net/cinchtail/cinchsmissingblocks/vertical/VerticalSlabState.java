package net.cinchtail.cinchsmissingblocks.vertical;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public final class VerticalSlabState {
    public static final BooleanProperty VERTICAL = BooleanProperty.create("cinchs_vertical");
    public static final IntegerProperty SIDE = IntegerProperty.create("cinchs_vertical_side", 0, 3);
    private VerticalSlabState() {}
    public static boolean isVertical(BlockState state) { return state.hasProperty(VERTICAL) && state.getValue(VERTICAL); }
}
