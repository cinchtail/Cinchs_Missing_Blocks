package net.cinchtail.cinchsmissingblocks.network;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.network.ServerPlayerEntity;

public class ServerConfigSync {

    public static void sendTo(ServerPlayerEntity player) {
        ConfigSyncPayload payload = new ConfigSyncPayload(
                ModConfigs.enableTuffBrickPillar,
                ModConfigs.doubleSlabsPackDefaultEnabled
        );
        ServerPlayNetworking.send(player, payload);
    }
}