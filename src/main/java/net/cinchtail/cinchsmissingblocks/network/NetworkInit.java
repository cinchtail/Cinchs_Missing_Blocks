package net.cinchtail.cinchsmissingblocks.network;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public class NetworkInit {

    @SubscribeEvent
    public static void register(RegisterPayloadHandlersEvent event) {

        event.registrar(MOD_ID).playToServer(
                        ConfigSyncPayload.TYPE,
                        ConfigSyncPayload.CODEC,
                        ServerConfigValidator::handle
                );
    }
}