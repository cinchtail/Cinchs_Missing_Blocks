package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.cinchtail.cinchsmissingblocks.item.ModItemGroups;
import net.cinchtail.cinchsmissingblocks.network.NetworkInit;
import net.cinchtail.cinchsmissingblocks.network.ServerConfigSync;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CinchsMissingBlocks implements ModInitializer {
	public static final String MOD_ID = "cinchsmissingblocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfigs.load();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		NetworkInit.register();

		ServerPlayConnectionEvents.INIT.register((handler, server) ->
				ServerConfigSync.sendTo(handler.player));

		LOGGER.info("Cinch's Missing Blocks initialized.");
	}
}