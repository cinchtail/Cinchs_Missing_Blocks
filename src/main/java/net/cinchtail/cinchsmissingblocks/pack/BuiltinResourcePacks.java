package net.cinchtail.cinchsmissingblocks.pack;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BuiltinResourcePacks {

    public static final String TUFF_PILLARS = "cinchs_tuff_pillars";
    public static final String DOUBLE_SLABS = "cinchs_double_slabs";

    public static void registerBuiltinPacks(String modId) {

        FabricLoader.getInstance().getModContainer(modId).ifPresent(container -> {

            ResourceManagerHelper.registerBuiltinResourcePack(
                    Identifier.of(modId, TUFF_PILLARS),
                    container,
                    Text.literal("Cinch's Tuff Pillars"),
                    ResourcePackActivationType.NORMAL
            );

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