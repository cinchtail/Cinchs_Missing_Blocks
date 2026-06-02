package net.cinchtail.cinchsmissingblocks.network;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.minecraft.server.network.ServerPlayerEntity;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

public class ServerConfigSync {

    public static void sendTo(ServerPlayerEntity player) {
        ServerPlayNetworking.send(
                player,
                new ConfigSyncPayload(
                        ModConfigs.enableTuffBrickPillar,
                        ModConfigs.doubleSlabsPackDefaultEnabled
                )
        );
    }
}