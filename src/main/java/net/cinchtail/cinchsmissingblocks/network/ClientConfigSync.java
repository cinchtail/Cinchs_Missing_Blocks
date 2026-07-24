package net.cinchtail.cinchsmissingblocks.network;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.gui.screens.DisconnectedScreen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;

public class ClientConfigSync {

    public static void register() {

        ClientPlayNetworking.registerGlobalReceiver(
                ConfigSyncPayload.TYPE,
                (payload, ctx) -> {

                    boolean serverValue = payload.enableTuffBrickPillar();
                    boolean clientValue = ModConfigs.enableTuffBrickPillar;

                    if (serverValue != clientValue) {

                        ctx.client().execute(() -> {

                            Component message = Component.literal(
                                    "Your Cinch's Missing Blocks config does not match the server.\n\n" +
                                            "Server requires: " + serverValue + "\n" +
                                            "Your config: " + clientValue + "\n\n" +
                                            "Update your config and reconnect.\n" +
                                            ".minecraft/config/cinchsmissingblocks.json"
                            );

                            ctx.client().disconnect(new TitleScreen(), false);

                            ctx.client().setScreenAndShow(
                                    new DisconnectedScreen(
                                            new TitleScreen(),
                                            Component.literal("Disconnected"),
                                            message
                                    )
                            );
                        });
                    }
                }
        );
    }
}