package net.cinchtail.cinchsmissingblocks.platform;

import net.cinchtail.cinchsmissingblocks.common.catalog.ContentCatalog;
import net.cinchtail.cinchsmissingblocks.fabriccommon.bootstrap.FabricPlatformBridge;
import net.cinchtail.cinchsmissingblocks.fabriccommon.config.FabricConfigState;
import net.cinchtail.cinchsmissingblocks.fabriccommon.version.FabricVersionProfile;
import net.cinchtail.cinchsmissingblocks.platform.pack.FabricBuiltinPacks;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

/**
 * Fabric loader glue that is compiled by every version module against its own Minecraft/Fabric API.
 */
public abstract class FabricPlatformBase implements FabricPlatformBridge {
    @Override
    public final FabricVersionProfile version() {
        String minecraftVersion = FabricLoader.getInstance()
                .getModContainer("minecraft")
                .orElseThrow(() -> new IllegalStateException("Minecraft mod container is unavailable"))
                .getMetadata()
                .getVersion()
                .getFriendlyString();
        return FabricVersionProfile.forMinecraftVersion(minecraftVersion);
    }

    @Override
    public final Path configDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }

    @Override
    public final void installContent(ContentCatalog catalog) {
        FabricContentRegistry.install(catalog);
    }

    @Override
    public final void registerCreativeTab(ContentCatalog catalog, FabricConfigState config) {
        FabricCreativeTabs.register(catalog, config);
    }

    @Override
    public void registerServerNetworking(FabricConfigState config) {
    }

    @Override
    public final void registerDataPacks(ContentCatalog catalog, FabricConfigState config) {
        FabricBuiltinPacks.registerDataPacks(catalog, config);
    }

    @Override
    public void registerClientNetworking(FabricConfigState config) {
    }

    @Override
    public final void registerResourcePacks(ContentCatalog catalog, FabricConfigState config) {
        FabricBuiltinPacks.registerResourcePacks(catalog, config);
    }
}
