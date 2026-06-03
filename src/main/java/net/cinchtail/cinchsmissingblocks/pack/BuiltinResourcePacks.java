package net.cinchtail.cinchsmissingblocks.pack;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuiltinResourcePacks {

    private static final Logger LOGGER = LoggerFactory.getLogger("cinchsmissingblocks");

    public static final String TUFF_PILLARS = "cinchs_tuff_pillars";
    public static final String DOUBLE_SLABS = "cinchs_double_slabs";

    public static void registerBuiltinPacks(String modId) {

        FabricLoader.getInstance().getModContainer(modId).ifPresent(container -> {

            if (ModConfigs.enableTuffBrickPillar) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        Identifier.of(modId, TUFF_PILLARS),
                        container,
                        Text.literal("Cinch's Tuff Pillars"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                );
            } else {
                LOGGER.info("Tuff Pillar textures disabled by config");
            }

            ResourceManagerHelper.registerBuiltinResourcePack(
                    Identifier.of(modId, DOUBLE_SLABS),
                    container,
                    Text.literal("Cinch's Double Slabs"),
                    ModConfigs.doubleSlabsPackDefaultEnabled
                            ? ResourcePackActivationType.DEFAULT_ENABLED
                            : ResourcePackActivationType.NORMAL
            );
        });
    }
}