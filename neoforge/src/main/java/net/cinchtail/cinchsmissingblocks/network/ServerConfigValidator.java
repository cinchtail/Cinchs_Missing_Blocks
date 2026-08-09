package net.cinchtail.cinchsmissingblocks.network;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public final class ServerConfigValidator {
    private ServerConfigValidator() {}

    public static void handle(ConfigSyncPayload payload, IPayloadContext context) {
        if (!(context.player() instanceof ServerPlayer player)) return;
        if (!player.server.isDedicatedServer() && !player.server.isPublished()) return;

        boolean serverValue = ModConfigs.enableTuffBrickPillar;
        boolean clientValue = payload.enableTuffBrickPillar();
        if (serverValue != clientValue) {
            player.connection.disconnect(Component.literal(
                    "Config Mismatch\n\n" +
                    "Your Cinch's Missing Blocks config does not match the server.\n\n" +
                    "Server requires: \"enableTuffBrickPillar\": " + serverValue + "\n" +
                    "Your config: \"enableTuffBrickPillar\": " + clientValue + "\n\n" +
                    "Please update your config and reconnect.\n\n" +
                    "Your config is located in .minecraft/config/cinchsmissingblocks.json."
            ));
        }
    }
}
