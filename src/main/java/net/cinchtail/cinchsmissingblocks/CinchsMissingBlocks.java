package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.item.ModCreativeModeTabs;
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
		ModCreativeModeTabs.registerItemGroups();
		ModBlocks.registerModBlocks();
	}

	public final class BuiltinPackLoader {

		public static void registerPacks(String modId) {
			FabricLoader.getInstance().getModContainer(modId).ifPresent(container -> {
				register(modId, container, "cinchs_double_slabs", "Cinch's Double Slabs", ResourcePackActivationType.DEFAULT_ENABLED);
				register(modId, container, "cinchs_tuff_pillars", "Cinch's Tuff Pillars", ResourcePackActivationType.DEFAULT_ENABLED);
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