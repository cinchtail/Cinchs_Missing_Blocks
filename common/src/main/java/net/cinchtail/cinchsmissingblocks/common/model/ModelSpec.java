package net.cinchtail.cinchsmissingblocks.common.model;

import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;

import java.util.Objects;

public record ModelSpec(ModelKind kind, ResourceId textureSource) {
    public ModelSpec {
        Objects.requireNonNull(kind, "kind");
        Objects.requireNonNull(textureSource, "textureSource");
    }
}
