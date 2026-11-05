package net.cinchtail.cinchsmissingblocks.network;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

public class ServerConfigSync {

    public static void register() {

        ServerPlayNetworking.registerGlobalReceiver(
                ConfigSyncPayload.TYPE,
                (payload, context) -> {

                    ServerPlayer player = context.player();

                    boolean serverValue = ModConfigs.enableTuffBrickPillar;
                    boolean clientValue = payload.enableTuffBrickPillar();

                    if (serverValue != clientValue) {

                        player.connection.disconnect(
                                Component.literal(
                                        "Your Cinch's Missing Blocks config does not match the server.\n\n" +
                                                "Server requires: " + serverValue + "\n" +
                                                "Your config: " + clientValue + "\n\n" +
                                                "Please update your config and reconnect.\n\n" +
                                                "Your config is located in .minecraft/config/cinchsmissingblocks.json."
                                )
                        );
                    }
                }
        );
    }
}