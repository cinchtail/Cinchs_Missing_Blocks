package net.cinchtail.cinchsmissingblocks.platform;

import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;
import net.minecraft.resources.ResourceLocation;

public final class FabricResourceIds {
    private FabricResourceIds() {}
    public static ResourceLocation toMinecraft(ResourceId id) {
        return new ResourceLocation(id.namespace(), id.path());
    }
}
