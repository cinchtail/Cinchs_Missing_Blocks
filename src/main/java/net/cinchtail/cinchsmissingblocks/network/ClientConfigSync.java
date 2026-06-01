package net.cinchtail.cinchsmissingblocks.network;

import net.cinchtail.cinchsmissingblocks.pack.ModBuiltinPacks;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.MinecraftClient;

public class ClientConfigSync {

    public static void register() {
        ClientPlayNetworking.registerGlobalReceiver(
                ConfigSyncPayload.ID,
                (payload, context) -> context.client().execute(() -> {

                    MinecraftClient client = MinecraftClient.getInstance();
                    var manager = client.getResourcePackManager();

                    String tuffPillars = "cinchsmissingblocks:" + ModBuiltinPacks.TUFF_PILLARS;
                    String tuffPillarRecipes = "cinchsmissingblocks:" + ModBuiltinPacks.TUFF_PILLAR_RECIPES;
                    String doubleSlabs = "cinchsmissingblocks:" + ModBuiltinPacks.DOUBLE_SLABS;

                    boolean enableTuff = payload.enableTuffBrickPillar();
                    boolean enableDouble = payload.enableDoubleSlabs();

                    boolean tuffEnabled = manager.getEnabledIds().contains(tuffPillars);
                    boolean tuffRecipesEnabled = manager.getEnabledIds().contains(tuffPillarRecipes);
                    boolean doubleEnabled = manager.getEnabledIds().contains(doubleSlabs);

                    boolean changed = false;

                    if (enableTuff && !tuffEnabled) {
                        manager.enable(tuffPillars);
                        changed = true;
                    }
                    if (!enableTuff && tuffEnabled) {
                        manager.disable(tuffPillars);
                        changed = true;
                    }

                    if (enableTuff && !tuffRecipesEnabled) {
                        manager.enable(tuffPillarRecipes);
                        changed = true;
                    }
                    if (!enableTuff && tuffRecipesEnabled) {
                        manager.disable(tuffPillarRecipes);
                        changed = true;
                    }

                    if (enableDouble && !doubleEnabled) {
                        manager.enable(doubleSlabs);
                        changed = true;
                    }
                    if (!enableDouble && doubleEnabled) {
                        manager.disable(doubleSlabs);
                        changed = true;
                    }

                    if (changed) {
                        client.reloadResources();
                    }
                })
        );
    }
}