package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.network.ClientConfigSync;
import net.cinchtail.cinchsmissingblocks.pack.BuiltinResourcePacks;
import net.fabricmc.api.ClientModInitializer;

public class CinchsMissingBlocksClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientConfigSync.register();
        BuiltinResourcePacks.registerBuiltinPacks(CinchsMissingBlocks.MOD_ID);
    }
}