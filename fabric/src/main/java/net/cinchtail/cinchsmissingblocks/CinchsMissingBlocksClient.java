package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.network.ClientConfigSync;
import net.cinchtail.cinchsmissingblocks.pack.BuiltinResourcePacks;
import net.fabricmc.api.ClientModInitializer;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocksFabric.MOD_ID;

public class CinchsMissingBlocksClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientConfigSync.register();
        BuiltinResourcePacks.registerBuiltinPacks(MOD_ID);
    }
}