package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.network.ClientConfigSync;
import net.cinchtail.cinchsmissingblocks.pack.FabricBuiltinPacks;
import net.fabricmc.api.ClientModInitializer;

public class CinchsMissingBlocksClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientConfigSync.register();
        FabricBuiltinPacks.registerResourcePacks();
    }
}
