package net.cinchtail.cinchsmissingblocks.vertical;

import net.minecraft.client.resources.model.BakedModel;

/** Cache entry kept outside the mixin package so it is loadable at runtime. */
public final class VerticalModelCacheEntry {
    public final BakedModel base;
    public final int side;
    public final BakedModel vertical;

    public VerticalModelCacheEntry(BakedModel base, int side, BakedModel vertical) {
        this.base = base;
        this.side = side;
        this.vertical = vertical;
    }
}
