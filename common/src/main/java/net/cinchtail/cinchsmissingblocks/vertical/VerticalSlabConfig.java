package net.cinchtail.cinchsmissingblocks.vertical;

/** Loader-neutral runtime view of the vertical slab config option. */
public final class VerticalSlabConfig {
    private static volatile boolean enabled = true;

    private VerticalSlabConfig() {}

    public static boolean isEnabled() {
        return enabled;
    }

    public static void setEnabled(boolean value) {
        enabled = value;
    }
}
