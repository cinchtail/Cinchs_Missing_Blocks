package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.cinchtail.cinchsmissingblocks.item.ModItemGroups;
import net.cinchtail.cinchsmissingblocks.pack.ModBuiltinPacks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CinchsMissingBlocks implements ModInitializer {
	public static final String MOD_ID = "cinchsmissingblocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	static {
		ModConfigs.load();
	}

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModBuiltinPacks.registerBuiltinPacks(MOD_ID);
	}
}