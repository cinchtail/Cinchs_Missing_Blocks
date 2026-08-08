package net.cinchtail.cinchsmissingblocks.common.item;

import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;

import java.util.Objects;

public record ItemSpec(ResourceId id, ItemModelKind model) {
    public ItemSpec {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(model, "model");
    }

    public static ItemSpec flat(ResourceId id) {
        return new ItemSpec(id, ItemModelKind.FLAT);
    }
}
