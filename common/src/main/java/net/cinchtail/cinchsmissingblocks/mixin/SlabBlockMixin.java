package net.cinchtail.cinchsmissingblocks.mixin;

import net.cinchtail.cinchsmissingblocks.vertical.VerticalSlabConfig;
import net.cinchtail.cinchsmissingblocks.vertical.VerticalSlabState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SlabBlock.class)
public abstract class SlabBlockMixin {
    private static final VoxelShape CINCHS_NORTH = Block.box(0, 0, 0, 16, 16, 8);
    private static final VoxelShape CINCHS_SOUTH = Block.box(0, 0, 8, 16, 16, 16);
    private static final VoxelShape CINCHS_WEST = Block.box(0, 0, 0, 8, 16, 16);
    private static final VoxelShape CINCHS_EAST = Block.box(8, 0, 0, 16, 16, 16);

    @Inject(method = "createBlockStateDefinition", at = @At("TAIL"))
    private void cinchs$appendVerticalProperties(StateDefinition.Builder<Block, BlockState> builder, CallbackInfo ci) {
        builder.add(VerticalSlabState.VERTICAL, VerticalSlabState.SIDE);
    }

    @Inject(method = "getStateForPlacement", at = @At("RETURN"), cancellable = true)
    private void cinchs$verticalPlacement(BlockPlaceContext context, CallbackInfoReturnable<BlockState> cir) {
        BlockState result = cir.getReturnValue();
        if (result == null) return;

        // CRITICAL: our extra BooleanProperty must never be allowed to leak into
        // normal slab placement. Every vanilla path is normalized explicitly.
        BlockState horizontal = cinchs$horizontal(result);

        if (!VerticalSlabConfig.isEnabled()) {
            cir.setReturnValue(horizontal);
            return;
        }

        // Vanilla merge remains a normal full/double slab.
        if (result.getValue(SlabBlock.TYPE) == SlabType.DOUBLE) {
            cir.setReturnValue(horizontal);
            return;
        }

        Direction clickedFace = context.getClickedFace();

        // Looking at the top or underside of a block always behaves exactly like
        // a vanilla slab, regardless of where inside the face the crosshair is.
        if (clickedFace == Direction.UP || clickedFace == Direction.DOWN) {
            cir.setReturnValue(horizontal);
            return;
        }

        // A wall placement only becomes vertical in the upper 50% of that face.
        double localY = context.getClickLocation().y - Math.floor(context.getClickLocation().y);
        if (localY < 0.5D) {
            cir.setReturnValue(horizontal);
            return;
        }

        // On a wall, occupy the half of the new cell that touches the support.
        Direction occupiedSide = clickedFace.getOpposite();
        cir.setReturnValue(horizontal
                .setValue(SlabBlock.TYPE, SlabType.BOTTOM)
                .setValue(VerticalSlabState.VERTICAL, true)
                .setValue(VerticalSlabState.SIDE, cinchs$side(occupiedSide)));
    }

    private static BlockState cinchs$horizontal(BlockState state) {
        return state
                .setValue(VerticalSlabState.VERTICAL, false)
                .setValue(VerticalSlabState.SIDE, 0);
    }

    @Inject(method = "getShape", at = @At("HEAD"), cancellable = true)
    private void cinchs$verticalShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context, CallbackInfoReturnable<VoxelShape> cir) {
        if (!VerticalSlabState.isVertical(state) || state.getValue(SlabBlock.TYPE) == SlabType.DOUBLE) return;
        cir.setReturnValue(switch (state.getValue(VerticalSlabState.SIDE)) {
            case 0 -> CINCHS_NORTH; case 1 -> CINCHS_EAST; case 2 -> CINCHS_SOUTH; default -> CINCHS_WEST;
        });
    }

    @Inject(method = "canBeReplaced", at = @At("HEAD"), cancellable = true)
    private void cinchs$verticalReplace(BlockState state, BlockPlaceContext context, CallbackInfoReturnable<Boolean> cir) {
        if (!VerticalSlabState.isVertical(state) || state.getValue(SlabBlock.TYPE) == SlabType.DOUBLE) return;
        if (!context.getItemInHand().is(state.getBlock().asItem())) {
            cir.setReturnValue(false);
            return;
        }

        Direction clicked = context.getClickedFace();
        double localY = context.getClickLocation().y - Math.floor(context.getClickLocation().y);

        // A same-type slab aimed at the top of a vertical slab should replace the
        // existing state, allowing SlabBlock#getStateForPlacement to return DOUBLE.
        if (clicked == Direction.UP || (clicked.getAxis().isHorizontal() && localY >= 0.5D)) {
            cir.setReturnValue(true);
            return;
        }

        // Keep the intuitive vanilla-style merge from the exposed/open side too.
        int openFace = switch (state.getValue(VerticalSlabState.SIDE)) {
            case 0 -> 2;
            case 1 -> 3;
            case 2 -> 0;
            default -> 1;
        };
        cir.setReturnValue(clicked.getAxis().isHorizontal() && cinchs$side(clicked) == openFace);
    }

    private static int cinchs$side(Direction d) {
        return switch (d) {
            case NORTH -> 0;
            case EAST -> 1;
            case SOUTH -> 2;
            case WEST -> 3;
            default -> -1;
        };
    }
}
