package net.cinchtail.cinchsmissingblocks.pack;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public class BuiltinDataPacks {

    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final String VILLAGER_STATUES = "z_override_cinchsvillagerstatues";
    public static final String LOST_MOB_GRINDERS = "z_override_cinchslostmobgrinders";
    public static final String TUFF_PILLAR_RECIPES = "tuff_pillar_recipes";
    public static final String REWORKED_DEEPSLATE_RECIPES = "reworked_deepslate_recipes";

    public static void registerBuiltinPacks(String modId) {

        FabricLoader.getInstance().getModContainer(modId).ifPresent(container -> {

            if (FabricLoader.getInstance().isModLoaded("cinchsvillagerstatues")) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        Identifier.of("cinchsvillagerstatues", VILLAGER_STATUES),
                        container,
                        Text.literal("Compat: Cinch's Villager Statues"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                );
            }

            if (FabricLoader.getInstance().isModLoaded("cinchslostmobgrinders")) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        Identifier.of("cinchslostmobgrinders", LOST_MOB_GRINDERS),
                        container,
                        Text.literal("Compat: Cinch's Lost Mob Grinders"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                );
            }

            if (ModConfigs.enableTuffBrickPillar) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        Identifier.of(modId, TUFF_PILLAR_RECIPES),
                        container,
                        Text.literal("Tuff Pillars Recipes"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                );
            } else {
                LOGGER.info("Tuff Pillar recipes disabled by config");
            }

            if (ModConfigs.enableReworkedDeepslateRecipes || ModConfigs.configMissing) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        Identifier.of(modId, REWORKED_DEEPSLATE_RECIPES),
                        container,
                        Text.literal("Reworked Deepslate Recipes"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                );
            } else {
                LOGGER.info("Reworked deepslate recipes disabled by config");
            }
        });
    }
}