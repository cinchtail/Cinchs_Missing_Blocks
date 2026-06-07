package net.cinchtail.cinchsmissingblocks.network;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.minecraft.network.protocol.common.ServerboundCustomPayloadPacket;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;

public class ClientConfigSender {

    @SubscribeEvent
    public static void onClientLogin(ClientPlayerNetworkEvent.LoggingIn event) {

        boolean clientValue = ModConfigs.enableTuffBrickPillar;

        event.getConnection().send(
                new ServerboundCustomPayloadPacket(
                        new ConfigSyncPayload(clientValue)
                )
        );
    }
}