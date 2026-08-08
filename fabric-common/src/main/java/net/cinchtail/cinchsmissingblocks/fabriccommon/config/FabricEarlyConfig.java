package net.cinchtail.cinchsmissingblocks.fabriccommon.config;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public final class FabricEarlyConfig {
    private FabricEarlyConfig() {
    }

    public static boolean tuffBrickPillarEnabled(Path configPath, boolean featureSupported) {
        if (!featureSupported) {
            return false;
        }
        try {
            if (!Files.exists(configPath)) {
                return true;
            }
            Map<String, Boolean> values = FabricConfigStore.parse(Files.readString(configPath, StandardCharsets.UTF_8));
            return values.getOrDefault("enableTuffBrickPillar", true);
        } catch (Exception ignored) {
            return true;
        }
    }
}
