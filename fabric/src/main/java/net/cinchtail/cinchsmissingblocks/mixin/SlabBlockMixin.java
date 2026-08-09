package net.cinchtail.cinchsmissingblocks.mixin;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.cinchtail.cinchsmissingblocks.vertical.VerticalSlabState;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SlabBlock.class)
public abstract class SlabBlockMixin {
    private static final VoxelShape CINCHS_NORTH = Block.createCuboidShape(0, 0, 0, 16, 16, 8);
    private static final VoxelShape CINCHS_SOUTH = Block.createCuboidShape(0, 0, 8, 16, 16, 16);
    private static final VoxelShape CINCHS_WEST = Block.createCuboidShape(0, 0, 0, 8, 16, 16);
    private static final VoxelShape CINCHS_EAST = Block.createCuboidShape(8, 0, 0, 16, 16, 16);

    @Inject(method = "appendProperties", at = @At("TAIL"))
    private void cinchs$appendVerticalProperties(StateManager.Builder<Block, BlockState> builder, CallbackInfo ci) {
        builder.add(VerticalSlabState.VERTICAL, VerticalSlabState.SIDE);
    }

    @Inject(method = "getPlacementState", at = @At("RETURN"), cancellable = true)
    private void cinchs$verticalPlacement(ItemPlacementContext context, CallbackInfoReturnable<BlockState> cir) {
        BlockState result = cir.getReturnValue();
        if (result == null) return;

        // Never let the custom vertical property leak into a normal vanilla placement.
        BlockState horizontal = cinchs$horizontal(result);

        if (!ModConfigs.enableVerticalSlabs) {
            cir.setReturnValue(horizontal);
            return;
        }

        // A merged/double slab is always a normal full block state.
        if (result.get(SlabBlock.TYPE) == SlabType.DOUBLE) {
            cir.setReturnValue(horizontal);
            return;
        }

        Direction clickedFace = context.getSide();

        // Floor/ceiling placements always use vanilla slab placement.
        if (clickedFace == Direction.UP || clickedFace == Direction.DOWN) {
            cir.setReturnValue(horizontal);
            return;
        }

        // On a wall, only the upper half of the clicked face creates a vertical slab.
        double localY = context.getHitPos().y - Math.floor(context.getHitPos().y);
        if (localY < 0.5D) {
            cir.setReturnValue(horizontal);
            return;
        }

        // Occupy the half of the destination cell touching the support block.
        Direction occupiedSide = clickedFace.getOpposite();
        cir.setReturnValue(horizontal
                .with(SlabBlock.TYPE, SlabType.BOTTOM)
                .with(VerticalSlabState.VERTICAL, true)
                .with(VerticalSlabState.SIDE, cinchs$side(occupiedSide)));
    }

    private static BlockState cinchs$horizontal(BlockState state) {
        return state
                .with(VerticalSlabState.VERTICAL, false)
                .with(VerticalSlabState.SIDE, 0);
    }

    @Inject(method = "getOutlineShape", at = @At("HEAD"), cancellable = true)
    private void cinchs$verticalShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context, CallbackInfoReturnable<VoxelShape> cir) {
        if (!VerticalSlabState.isVertical(state) || state.get(SlabBlock.TYPE) == SlabType.DOUBLE) return;
        cir.setReturnValue(switch (state.get(VerticalSlabState.SIDE)) {
            case 0 -> CINCHS_NORTH;
            case 1 -> CINCHS_EAST;
            case 2 -> CINCHS_SOUTH;
            default -> CINCHS_WEST;
        });
    }

    @Inject(method = "canReplace", at = @At("HEAD"), cancellable = true)
    private void cinchs$verticalReplace(BlockState state, ItemPlacementContext context, CallbackInfoReturnable<Boolean> cir) {
        if (!VerticalSlabState.isVertical(state) || state.get(SlabBlock.TYPE) == SlabType.DOUBLE) return;
        if (!context.getStack().isOf(state.getBlock().asItem())) {
            cir.setReturnValue(false);
            return;
        }

        Direction clicked = context.getSide();
        double localY = context.getHitPos().y - Math.floor(context.getHitPos().y);

        // Clicking the top, or the upper half from the side, merges the same slab
        // into the existing vertical slab so vanilla can return DOUBLE.
        if (clicked == Direction.UP || (clicked.getAxis().isHorizontal() && localY >= 0.5D)) {
            cir.setReturnValue(true);
            return;
        }

        // Also allow merging from the exposed/open side of the vertical slab.
        int openFace = switch (state.get(VerticalSlabState.SIDE)) {
            case 0 -> 2;
            case 1 -> 3;
            case 2 -> 0;
            default -> 1;
        };
        cir.setReturnValue(clicked.getAxis().isHorizontal() && cinchs$side(clicked) == openFace);
    }

    private static int cinchs$side(Direction direction) {
        return switch (direction) {
            case NORTH -> 0;
            case EAST -> 1;
            case SOUTH -> 2;
            case WEST -> 3;
            default -> -1;
        };
    }
}
