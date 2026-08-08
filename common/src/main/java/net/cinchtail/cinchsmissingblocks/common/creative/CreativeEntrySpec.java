package net.cinchtail.cinchsmissingblocks.common.creative;

import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;

import java.util.Objects;

public record CreativeEntrySpec(ResourceId id, CreativeGate gate) {
    public CreativeEntrySpec {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(gate, "gate");
    }

    public static CreativeEntrySpec always(ResourceId id) {
        return new CreativeEntrySpec(id, CreativeGate.ALWAYS);
    }
}
