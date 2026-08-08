package net.cinchtail.cinchsmissingblocks.common.pack;

import net.cinchtail.cinchsmissingblocks.common.config.ConfigFlag;
import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;

import java.util.Objects;
import java.util.Optional;

public record PackSpec(
        ResourceId id,
        PackType type,
        String displayName,
        PackActivation activation,
        Optional<ConfigFlag> registrationGate,
        boolean registerWhenConfigMissing,
        Optional<ConfigFlag> defaultEnabledGate,
        Optional<String> requiredModId,
        Optional<ResourceId> requiredVanillaId
) {
    public PackSpec {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(type, "type");
        Objects.requireNonNull(displayName, "displayName");
        Objects.requireNonNull(activation, "activation");
        Objects.requireNonNull(registrationGate, "registrationGate");
        Objects.requireNonNull(defaultEnabledGate, "defaultEnabledGate");
        Objects.requireNonNull(requiredModId, "requiredModId");
        Objects.requireNonNull(requiredVanillaId, "requiredVanillaId");
    }

    public static PackSpec gated(
            ResourceId id,
            PackType type,
            String displayName,
            PackActivation activation,
            ConfigFlag gate,
            boolean registerWhenConfigMissing
    ) {
        return new PackSpec(id, type, displayName, activation, Optional.of(gate), registerWhenConfigMissing,
                Optional.empty(), Optional.empty(), Optional.empty());
    }

    public static PackSpec compatibility(ResourceId id, PackType type, String displayName, String requiredModId) {
        return new PackSpec(id, type, displayName, PackActivation.ALWAYS_ENABLED, Optional.empty(), false,
                Optional.empty(), Optional.of(requiredModId), Optional.empty());
    }

    public static PackSpec configurableDefault(
            ResourceId id,
            PackType type,
            String displayName,
            ConfigFlag defaultEnabledGate
    ) {
        return new PackSpec(id, type, displayName, PackActivation.NORMAL, Optional.empty(), false,
                Optional.of(defaultEnabledGate), Optional.empty(), Optional.empty());
    }

    public PackSpec requiringVanilla(ResourceId vanillaId) {
        return new PackSpec(id, type, displayName, activation, registrationGate, registerWhenConfigMissing,
                defaultEnabledGate, requiredModId, Optional.of(vanillaId));
    }
}
