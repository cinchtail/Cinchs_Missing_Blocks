package net.cinchtail.cinchsmissingblocks.network;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.minecraft.network.protocol.common.ServerboundCustomPayloadPacket;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;

public final class ClientConfigSender {
    private ClientConfigSender() {}

    @SubscribeEvent
    public static void onClientJoin(ClientPlayerNetworkEvent.LoggingIn event) {
        event.getConnection().send(new ServerboundCustomPayloadPacket(
                new ConfigSyncPayload(ModConfigs.enableTuffBrickPillar)
        ));
    }
}
