package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.fabriccommon.bootstrap.FabricBootstrap;
import net.cinchtail.cinchsmissingblocks.platform.FabricPlatform;
import net.fabricmc.api.ClientModInitializer;

public final class CinchsMissingBlocksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FabricBootstrap.initializeClient(FabricPlatform.INSTANCE);
    }
}
