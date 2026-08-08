package net.cinchtail.cinchsmissingblocks.network;

import net.cinchtail.cinchsmissingblocks.fabriccommon.config.FabricConfigState;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.DisconnectedScreen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;

public final class FabricClientConfigNetworking {
    private FabricClientConfigNetworking() {
    }

    public static void register(FabricConfigState state) {
        ClientPlayNetworking.registerGlobalReceiver(
                ConfigSyncPayload.TYPE,
                (payload, ctx) -> {
                    boolean serverValue = payload.enableTuffBrickPillar();
                    boolean clientValue = state.config().enableTuffBrickPillar();

                    if (serverValue == clientValue) {
                        return;
                    }

                    ctx.client().execute(() -> {
                        Minecraft mc = ctx.client();
                        if (mc.player == null || mc.level == null) {
                            return;
                        }

                        Component message = Component.literal(
                                "Your Cinch's Missing Blocks config does not match the server.\n\n" +
                                        "Server requires: " + serverValue + "\n" +
                                        "Your config: " + clientValue + "\n\n" +
                                        "Update your config and reconnect.\n" +
                                        ".minecraft/config/cinchsmissingblocks.json"
                        );

                        mc.disconnect(new TitleScreen(), false);
                        mc.setScreenAndShow(new DisconnectedScreen(
                                new TitleScreen(),
                                Component.literal("Disconnected"),
                                message
                        ));
                    });
                }
        );
    }
}
