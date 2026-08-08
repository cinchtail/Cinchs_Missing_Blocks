package net.cinchtail.cinchsmissingblocks.fabriccommon.policy;

import net.cinchtail.cinchsmissingblocks.common.creative.CreativeGate;
import net.cinchtail.cinchsmissingblocks.fabriccommon.config.FabricConfigState;

public final class FabricCreativePolicy {
    private FabricCreativePolicy() {}

    public static boolean enabled(CreativeGate gate, FabricConfigState state) {
        var config = state.config();
        return switch (gate) {
            case ALWAYS -> true;
            case TERRACOTTA_VARIANTS -> config.enableTerracottaVariants() || state.wasMissing();
            case CONCRETE_VARIANTS -> config.enableConcreteVariants() || state.wasMissing();
        };
    }
}
