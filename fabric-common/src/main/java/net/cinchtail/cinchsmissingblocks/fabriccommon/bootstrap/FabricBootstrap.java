package net.cinchtail.cinchsmissingblocks.fabriccommon.bootstrap;

import net.cinchtail.cinchsmissingblocks.common.catalog.ContentCatalog;
import net.cinchtail.cinchsmissingblocks.fabriccommon.config.FabricConfigState;
import net.cinchtail.cinchsmissingblocks.fabriccommon.config.FabricConfigStore;

import java.nio.file.Path;

public final class FabricBootstrap {
    private static FabricConfigState state;

    private FabricBootstrap() {
    }

    public static void initialize(FabricPlatformBridge platform) {
        ContentCatalog catalog = platform.version().catalog();
        state = FabricConfigStore.load(configPath(platform));
        platform.installContent(catalog);
        platform.registerCreativeTab(catalog, state);
        platform.registerServerNetworking(state);
        platform.registerDataPacks(catalog, state);
    }

    public static void initializeClient(FabricPlatformBridge platform) {
        ContentCatalog catalog = platform.version().catalog();
        FabricConfigState current = state != null ? state : FabricConfigStore.load(configPath(platform));
        platform.registerClientNetworking(current);
        platform.registerResourcePacks(catalog, current);
    }

    public static FabricConfigState state() {
        if (state == null) {
            throw new IllegalStateException("Fabric bootstrap has not initialized yet");
        }
        return state;
    }

    private static Path configPath(FabricPlatformBridge platform) {
        return platform.configDirectory().resolve("cinchsmissingblocks.json");
    }
}
