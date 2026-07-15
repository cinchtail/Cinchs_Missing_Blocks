package net.cinchtail.cinchsmissingblocks.network;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import org.w3c.dom.Text;

public class ClientConfigSync {

    public static void register() {

        /*ClientPlayNetworking.registerGlobalReceiver(
                ConfigSyncPayload.ID,
                (payload, context) -> {

                    MinecraftClient client = MinecraftClient.getInstance();
                    boolean serverWantsTuffPillars = payload.enableTuffBrickPillar();
                    boolean clientValue = ModConfigs.enableTuffBrickPillar;

                    if (serverWantsTuffPillars != clientValue) {
                        client.execute(() -> {
                            if (client.getNetworkHandler() != null) {
                                client.getNetworkHandler().getConnection().disconnect(
                                        Text.literal(
                                                "Your Cinch's Missing Blocks config does not match the server.\n\n" +
                                                        "Server requires: \"enableTuffBrickPillar\": " + serverWantsTuffPillars + "\n" +
                                                        "Your config: \"enableTuffBrickPillar\": " + clientValue + "\n\n" +
                                                        "Please update your config and reconnect.\n\n" +
                                                        "Your config is located in .minecraft\\config\\cinchsmissingblocks.json."
                                        )
                                );
                            }
                        });
                    }
                }*/
        //);
    }
}