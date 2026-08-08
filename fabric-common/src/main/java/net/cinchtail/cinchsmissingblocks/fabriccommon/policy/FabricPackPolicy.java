package net.cinchtail.cinchsmissingblocks.fabriccommon.policy;

import net.cinchtail.cinchsmissingblocks.common.pack.PackActivation;
import net.cinchtail.cinchsmissingblocks.common.pack.PackSpec;
import net.cinchtail.cinchsmissingblocks.fabriccommon.config.FabricConfigState;

import java.util.function.Predicate;

public final class FabricPackPolicy {
    private FabricPackPolicy() {}

    public static boolean shouldRegister(PackSpec spec, FabricConfigState state, Predicate<String> isModLoaded) {
        if (spec.requiredModId().isPresent() && !isModLoaded.test(spec.requiredModId().orElseThrow())) {
            return false;
        }
        if (spec.registrationGate().isEmpty()) {
            return true;
        }
        boolean enabled = state.config().enabled(spec.registrationGate().orElseThrow());
        return enabled || (spec.registerWhenConfigMissing() && state.wasMissing());
    }

    public static PackActivation activation(PackSpec spec, FabricConfigState state) {
        if (spec.defaultEnabledGate().isPresent() && state.config().enabled(spec.defaultEnabledGate().orElseThrow())) {
            return PackActivation.DEFAULT_ENABLED;
        }
        return spec.activation();
    }
}
