package net.cinchtail.cinchsmissingblocks.platform;

import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;
import net.minecraft.resources.Identifier;

public final class FabricResourceIds {
    private FabricResourceIds() {
    }

    public static Identifier toMinecraft(ResourceId id) {
        return Identifier.fromNamespaceAndPath(id.namespace(), id.path());
    }
}
