package net.cinchtail.cinchsmissingblocks.vertical;

import net.minecraft.block.BlockState;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;

public final class VerticalSlabState {
    public static final BooleanProperty VERTICAL = BooleanProperty.of("cinchs_vertical");
    public static final IntProperty SIDE = IntProperty.of("cinchs_vertical_side", 0, 3);

    private VerticalSlabState() {}

    public static boolean isVertical(BlockState state) {
        return state.contains(VERTICAL) && state.get(VERTICAL);
    }
}
