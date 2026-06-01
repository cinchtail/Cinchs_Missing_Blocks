package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.network.ClientConfigSync;
import net.cinchtail.cinchsmissingblocks.pack.ModBuiltinPacks;
import net.fabricmc.api.ClientModInitializer;

public class CinchsMissingBlocksClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModBuiltinPacks.registerBuiltinPacks(CinchsMissingBlocks.MOD_ID);
        ClientConfigSync.register();
    }
}