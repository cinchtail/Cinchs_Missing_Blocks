package net.cinchtail.cinchsmissingblocks.network;

import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;

public class NetworkInit {
    public static void register() {

        PayloadTypeRegistry.clientboundPlay().register(ConfigSyncPayload.TYPE, ConfigSyncPayload.CODEC);
        PayloadTypeRegistry.serverboundPlay().register(ConfigSyncPayload.TYPE, ConfigSyncPayload.CODEC);
    }
}