package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.cinchtail.cinchsmissingblocks.item.ModItemGroups;
import net.cinchtail.cinchsmissingblocks.network.ConfigSyncPayload;
import net.cinchtail.cinchsmissingblocks.network.NetworkInit;
import net.cinchtail.cinchsmissingblocks.network.ServerConfigSync;
import net.cinchtail.cinchsmissingblocks.pack.FabricBuiltinPacks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.loader.api.FabricLoader;

public final class FabricEntrypoint implements ModInitializer {
    @Override
    public void onInitialize() {
        CinchsMissingBlocks.initialize(FabricLoader.getInstance().getConfigDir());
        CinchsMissingBlocks.registerContent(FabricCreativeModeTab.builder()
                .icon(ModItemGroups::createIcon)
                .title(ModItemGroups.title())
                .displayItems((parameters, output) -> ModItemGroups.populate(output::accept))
                .build());
        NetworkInit.register();
        ServerConfigSync.register();
        FabricBuiltinPacks.registerDataPacks();

        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) ->
                ServerPlayNetworking.send(handler.player,
                        new ConfigSyncPayload(ModConfigs.enableTuffBrickPillar)));

        CinchsMissingBlocks.LOGGER.info("Cinch's Missing Blocks initialized on Fabric.");
    }
}
