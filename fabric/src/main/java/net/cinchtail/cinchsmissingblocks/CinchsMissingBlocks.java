package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.cinchtail.cinchsmissingblocks.item.ModItemGroups;
import net.cinchtail.cinchsmissingblocks.item.ModItems;
import net.cinchtail.cinchsmissingblocks.network.ConfigSyncPayload;
import net.cinchtail.cinchsmissingblocks.network.NetworkInit;
import net.cinchtail.cinchsmissingblocks.network.ServerConfigSync;
import net.cinchtail.cinchsmissingblocks.pack.BuiltinDataPacks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CinchsMissingBlocks implements ModInitializer {
	public static final String MOD_ID = "cinchsmissingblocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		NetworkInit.register();
		ServerConfigSync.register();
		BuiltinDataPacks.registerBuiltinPacks(MOD_ID);

		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			ServerPlayNetworking.send(handler.player, new ConfigSyncPayload(ModConfigs.enableTuffBrickPillar));
		});

		LOGGER.info("Cinch's Missing Blocks initialized.");
	}
}