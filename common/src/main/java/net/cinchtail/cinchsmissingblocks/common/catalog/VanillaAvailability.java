package net.cinchtail.cinchsmissingblocks.common.catalog;

import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;

@FunctionalInterface
public interface VanillaAvailability {
    boolean isAvailable(ResourceId vanillaId);

    static VanillaAvailability all() {
        return id -> true;
    }
}
