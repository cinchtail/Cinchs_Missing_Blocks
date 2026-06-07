package net.cinchtail.cinchsmissingblocks.network;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;

public class NetworkInit {

    @SubscribeEvent
    public static void register(RegisterPayloadHandlersEvent event) {

        event.registrar(CinchsMissingBlocks.MOD_ID)
                .playToServer(
                        ConfigSyncPayload.TYPE,
                        ConfigSyncPayload.CODEC,
                        ServerConfigValidator::handle
                );
    }
}