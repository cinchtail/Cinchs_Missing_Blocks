package net.cinchtail.cinchsmissingblocks.network;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;

public class ClientConfigSender {

    @SubscribeEvent
    public static void onClientJoin(ClientPlayerNetworkEvent.LoggingIn event) {

        boolean clientValue = ModConfigs.enableTuffBrickPillar;

        event.getConnection().send(
                new net.minecraft.network.protocol.common.ServerboundCustomPayloadPacket(
                        new ConfigSyncPayload(clientValue)
                )
        );
    }
}