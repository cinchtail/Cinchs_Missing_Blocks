package net.cinchtail.cinchsmissingblocks.platform;

import net.cinchtail.cinchsmissingblocks.fabriccommon.config.FabricConfigState;
import net.cinchtail.cinchsmissingblocks.network.FabricClientConfigNetworking;
import net.cinchtail.cinchsmissingblocks.network.FabricConfigNetworking;

public final class FabricPlatform extends FabricPlatformBase {
    public static final FabricPlatform INSTANCE = new FabricPlatform();

    private FabricPlatform() {
    }

    @Override
    public void registerServerNetworking(FabricConfigState config) {
        FabricConfigNetworking.registerServer(config);
    }

    @Override
    public void registerClientNetworking(FabricConfigState config) {
        FabricClientConfigNetworking.register(config);
    }
}
