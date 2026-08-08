package net.cinchtail.cinchsmissingblocks.network;

import net.cinchtail.cinchsmissingblocks.fabriccommon.config.FabricConfigState;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.chat.Component;

public final class FabricConfigNetworking {
    private FabricConfigNetworking() {
    }

    public static void registerServer(FabricConfigState state) {
        PayloadTypeRegistry.clientboundPlay().register(ConfigSyncPayload.TYPE, ConfigSyncPayload.CODEC);
        PayloadTypeRegistry.serverboundPlay().register(ConfigSyncPayload.TYPE, ConfigSyncPayload.CODEC);

        ServerPlayNetworking.registerGlobalReceiver(
                ConfigSyncPayload.TYPE,
                (payload, context) -> {
                    boolean serverValue = state.config().enableTuffBrickPillar();
                    boolean clientValue = payload.enableTuffBrickPillar();

                    if (serverValue != clientValue) {
                        context.player().connection.disconnect(Component.literal(
                                "Your Cinch's Missing Blocks config does not match the server.\n\n" +
                                        "Server requires: " + serverValue + "\n" +
                                        "Your config: " + clientValue + "\n\n" +
                                        "Please update your config and reconnect.\n\n" +
                                        "Your config is located in .minecraft/config/cinchsmissingblocks.json."
                        ));
                    }
                }
        );

        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) ->
                ServerPlayNetworking.send(
                        handler.player,
                        new ConfigSyncPayload(state.config().enableTuffBrickPillar())
                )
        );
    }
}
