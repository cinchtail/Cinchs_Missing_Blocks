package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.cinchtail.cinchsmissingblocks.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CinchsMissingBlocks implements ModInitializer {
	public static final String MOD_ID = "cinchsmissingblocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	static {
		BuiltinPackLoader.registerPacks(MOD_ID);
	}

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		FabricLoader loader = FabricLoader.getInstance();

		if (loader.isModLoaded("cinchsvillagerstatues")) {
			loader.getModContainer(MOD_ID).ifPresent(container -> {
				ResourceManagerHelper.registerBuiltinResourcePack(
						Identifier.of(MOD_ID, "z_override_cinchsvillagerstatues"),
						container,
						Text.literal("Override: Cinch's Villager Statues"),
						ResourcePackActivationType.ALWAYS_ENABLED
				);
			});
		} else {
			LOGGER.info("cinchsvillagerstatues not present — override pack not loaded.");
		}

		if (ModConfigs.enableTuffBrickPillar) {
			FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container -> {
				ResourceManagerHelper.registerBuiltinResourcePack(
						Identifier.of(MOD_ID, "cinchs_tuff_pillars"),
						container,
						Text.literal("Cinch's Tuff Pillars"),
						ResourcePackActivationType.ALWAYS_ENABLED
				);
			});
		} else {
			LOGGER.info("Cinch's Tuff Pillars pack disabled by config");
		}
	}

	public static final class BuiltinPackLoader {

		public static void registerPacks(String modId) {
			FabricLoader.getInstance().getModContainer(modId).ifPresent(container -> {
				register(modId, container, "cinchs_double_slabs", "Cinch's Double Slabs", ResourcePackActivationType.DEFAULT_ENABLED);
			});
		}

		private static void register(String modId,
									 ModContainer container,
									 String folder,
									 String displayName,
									 ResourcePackActivationType type) {

			ResourceManagerHelper.registerBuiltinResourcePack(
					Identifier.of(modId, folder),
					container,
					Text.literal(displayName),
					type
			);
		}
	}
}