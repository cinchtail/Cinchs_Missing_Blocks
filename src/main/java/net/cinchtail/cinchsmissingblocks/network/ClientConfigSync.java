package net.cinchtail.cinchsmissingblocks.network;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.cinchtail.cinchsmissingblocks.pack.BuiltinResourcePacks;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.MinecraftClient;
import net.minecraft.resource.ResourcePackProfile;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ClientConfigSync {

    public static void register() {

        ClientPlayNetworking.registerGlobalReceiver(
                ConfigSyncPayload.ID,
                (payload, context) -> {

                    MinecraftClient client = MinecraftClient.getInstance();
                    boolean serverWantsTuffPillars = payload.enableTuffBrickPillar();

                    client.execute(() -> {

                        var manager = client.getResourcePackManager();

                        String tuffId = Identifier.of(
                                CinchsMissingBlocks.MOD_ID,
                                BuiltinResourcePacks.TUFF_PILLARS
                        ).toString();

                        List<ResourcePackProfile> enabledProfiles =
                                new ArrayList<>(manager.getEnabledProfiles());

                        List<String> enabledNames = new ArrayList<>();
                        for (ResourcePackProfile profile : enabledProfiles) {
                            enabledNames.add(profile.getId());
                        }

                        if (serverWantsTuffPillars) {
                            if (!enabledNames.contains(tuffId)) enabledNames.add(tuffId);
                        } else {
                            enabledNames.remove(tuffId);
                        }

                        manager.setEnabledProfiles(enabledNames);
                        client.reloadResources();

                        ModConfigs.enableTuffBrickPillar = serverWantsTuffPillars;
                        ModConfigs.doubleSlabsPackDefaultEnabled = payload.enableDoubleSlabs();
                        ModConfigs.save();
                    });
                }
        );
    }
}