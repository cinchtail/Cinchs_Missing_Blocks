package net.cinchtail.cinchsmissingblocks.common.id;

import java.util.Objects;
import java.util.regex.Pattern;

public record ResourceId(String namespace, String path) {
    private static final Pattern NAMESPACE = Pattern.compile("[a-z0-9_.-]+");
    private static final Pattern PATH = Pattern.compile("[a-z0-9/._-]+");

    public ResourceId {
        Objects.requireNonNull(namespace, "namespace");
        Objects.requireNonNull(path, "path");

        if (!NAMESPACE.matcher(namespace).matches()) {
            throw new IllegalArgumentException("Invalid namespace: " + namespace);
        }
        if (!PATH.matcher(path).matches()) {
            throw new IllegalArgumentException("Invalid path: " + path);
        }
    }

    public static ResourceId minecraft(String path) {
        return new ResourceId("minecraft", path);
    }

    public static ResourceId mod(String path) {
        return new ResourceId("cinchsmissingblocks", path);
    }

    @Override
    public String toString() {
        return namespace + ":" + path;
    }
}
