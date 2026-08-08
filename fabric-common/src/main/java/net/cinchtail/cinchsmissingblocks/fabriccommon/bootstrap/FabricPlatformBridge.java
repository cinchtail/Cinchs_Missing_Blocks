package net.cinchtail.cinchsmissingblocks.fabriccommon.bootstrap;

import net.cinchtail.cinchsmissingblocks.common.catalog.ContentCatalog;
import net.cinchtail.cinchsmissingblocks.fabriccommon.config.FabricConfigState;
import net.cinchtail.cinchsmissingblocks.fabriccommon.version.FabricVersionProfile;

import java.nio.file.Path;

public interface FabricPlatformBridge {
    FabricVersionProfile version();
    Path configDirectory();
    void installContent(ContentCatalog catalog);
    void registerCreativeTab(ContentCatalog catalog, FabricConfigState config);
    void registerServerNetworking(FabricConfigState config);
    void registerDataPacks(ContentCatalog catalog, FabricConfigState config);
    void registerClientNetworking(FabricConfigState config);
    void registerResourcePacks(ContentCatalog catalog, FabricConfigState config);
}
