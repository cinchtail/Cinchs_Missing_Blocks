package net.cinchtail.cinchsmissingblocks.pack;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public class BuiltinDataPacks {

    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final String VILLAGER_STATUES = "z_override_cinchsvillagerstatues";
    public static final String LOST_MOB_GRINDERS = "z_override_cinchslostmobgrinders";
    public static final String TUFF_PILLAR_RECIPES = "tuff_pillar_recipes";
    public static final String REWORKED_DEEPSLATE_RECIPES = "reworked_deepslate_recipes";
    public static final String CORRECTED_COBBLED_DROPS = "corrected_cobbled_drops";
    public static final String TERRACOTTA_VARIANTS_RECIPES = "terracotta_variants_recipes";
    public static final String CONCRETE_VARIANTS_RECIPES = "concrete_variants_recipes";

    public static void registerBuiltinPacks(String modId) {

        FabricLoader.getInstance().getModContainer(modId).ifPresent(container -> {

            if (FabricLoader.getInstance().isModLoaded("cinchsvillagerstatues")) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        Identifier.fromNamespaceAndPath("cinchsvillagerstatues", VILLAGER_STATUES),
                        container,
                        Component.literal("Compat: Cinch's Villager Statues"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                );
            }

            if (FabricLoader.getInstance().isModLoaded("cinchslostmobgrinders")) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        Identifier.fromNamespaceAndPath("cinchslostmobgrinders", LOST_MOB_GRINDERS),
                        container,
                        Component.literal("Compat: Cinch's Lost Mob Grinders"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                );
            }

            if (ModConfigs.enableTuffBrickPillar || !ModConfigs.configMissing) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        Identifier.fromNamespaceAndPath(modId, TUFF_PILLAR_RECIPES),
                        container,
                        Component.literal("Tuff Pillars Recipes"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                );
            } else {
                LOGGER.info("Tuff Pillar recipes disabled by config");
            }

            if (ModConfigs.enableReworkedDeepslateRecipes || ModConfigs.configMissing) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        Identifier.fromNamespaceAndPath(modId, REWORKED_DEEPSLATE_RECIPES),
                        container,
                        Component.literal("Reworked Deepslate Recipes"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                );
            } else {
                LOGGER.info("Reworked deepslate recipes disabled by config");
            }

            if (ModConfigs.enableCorrectedCobbledDrops || !ModConfigs.configMissing) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        Identifier.fromNamespaceAndPath(modId, CORRECTED_COBBLED_DROPS),
                        container,
                        Component.literal("Corrected Cobbled Drops"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                );
            } else {
                LOGGER.info("Corrected Cobble Drops loot tables disabled by config");
            }

            if (ModConfigs.enableTerracottaVariants || !ModConfigs.configMissing) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        Identifier.fromNamespaceAndPath(modId, TERRACOTTA_VARIANTS_RECIPES),
                        container,
                        Component.literal("Terracotta Variants Recipes"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                );
            } else {
                LOGGER.info("Terracotta variants disabled by config (Recipes)");
            }

            if (ModConfigs.enableConcreteVariants || !ModConfigs.configMissing) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        Identifier.fromNamespaceAndPath(modId, CONCRETE_VARIANTS_RECIPES),
                        container,
                        Component.literal("Concrete Variants Recipes"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                );
            } else {
                LOGGER.info("Concrete variants disabled by config (Recipes)");
            }
        });
    }
}