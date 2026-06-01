package net.cinchtail.cinchsmissingblocks.pack;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModBuiltinPacks {

    private static final Logger LOGGER = LoggerFactory.getLogger("cinchsmissingblocks");

    public static final String VILLAGER_STATUES = "z_override_cinchsvillagerstatues";
    public static final String LOST_MOB_GRINDERS = "z_override_cinchslostmobgrinders";
    public static final String TUFF_PILLARS = "cinchs_tuff_pillars";
    public static final String TUFF_PILLAR_RECIPES = "cinchs_tuff_pillar_recipes";
    public static final String DOUBLE_SLABS = "cinchs_double_slabs";

    public static void registerBuiltinPacks(String modId) {

        FabricLoader.getInstance().getModContainer(modId).ifPresent(container -> {

            ResourceManagerHelper.registerBuiltinResourcePack(
                    Identifier.of("cinchsvillagerstatues", VILLAGER_STATUES),
                    container,
                    Text.literal("Compat: Cinch's Villager Statues"),
                    ResourcePackActivationType.ALWAYS_ENABLED
            );

            ResourceManagerHelper.registerBuiltinResourcePack(
                    Identifier.of("cinchslostmobgrinders", LOST_MOB_GRINDERS),
                    container,
                    Text.literal("Compat: Cinch's Lost Mob Grinders"),
                    ResourcePackActivationType.ALWAYS_ENABLED
            );

            if (ModConfigs.enableTuffBrickPillar) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        Identifier.of(modId, "cinchs_tuff_pillars"),
                        container,
                        Text.literal("Cinch's Tuff Pillars"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                );

                ResourceManagerHelper.registerBuiltinResourcePack(
                        Identifier.of(modId, "cinchs_tuff_pillar_recipes"),
                        container,
                        Text.literal("Cinch's Tuff Pillars Recipes"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                );

            } else {
                LOGGER.info("Cinch's Tuff Pillars packs disabled by config");
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