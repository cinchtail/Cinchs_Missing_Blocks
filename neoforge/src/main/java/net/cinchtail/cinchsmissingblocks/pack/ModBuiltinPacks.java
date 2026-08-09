package net.cinchtail.cinchsmissingblocks.pack;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public final class ModBuiltinPacks {
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private ModBuiltinPacks() {}

    public static void register(AddPackFindersEvent event, String modId) {
        if (event.getPackType() == PackType.CLIENT_RESOURCES) {
            if (ModConfigs.enableTuffBrickPillar) {
                addPack(event, modId, "cinchs_tuff_pillars", PackType.CLIENT_RESOURCES,
                        "Cinch's Tuff Pillars", PackSource.BUILT_IN, true);
            } else {
                LOGGER.info("Tuff Pillar textures disabled by config");
            }

            addPack(event, modId, "cinchs_double_slabs", PackType.CLIENT_RESOURCES,
                    "Cinch's Double Slabs",
                    ModConfigs.doubleSlabsPackDefaultEnabled ? PackSource.DEFAULT : PackSource.BUILT_IN,
                    ModConfigs.doubleSlabsPackDefaultEnabled);
        }

        if (event.getPackType() == PackType.SERVER_DATA) {
            if (ModList.get().isLoaded("cinchsvillagerstatues")) {
                addPack(event, modId, "z_override_cinchsvillagerstatues", PackType.SERVER_DATA,
                        "Compat: Cinch's Villager Statues", PackSource.BUILT_IN, true);
            }
            if (ModList.get().isLoaded("cinchslostmobgrinders")) {
                addPack(event, modId, "z_override_cinchslostmobgrinders", PackType.SERVER_DATA,
                        "Compat: Cinch's Lost Mob Grinders", PackSource.BUILT_IN, true);
            }
            if (ModConfigs.enableTuffBrickPillar) {
                addPack(event, modId, "tuff_pillar_recipes", PackType.SERVER_DATA,
                        "Tuff Pillars Recipes", PackSource.BUILT_IN, true);
            }
            if (ModConfigs.enableReworkedDeepslateRecipes || ModConfigs.configMissing) {
                addPack(event, modId, "reworked_deepslate_recipes", PackType.SERVER_DATA,
                        "Reworked Deepslate Recipes", PackSource.BUILT_IN, true);
            }
            if (ModConfigs.enableCorrectedCobbledDrops || ModConfigs.configMissing) {
                addPack(event, modId, "corrected_cobbled_drops", PackType.SERVER_DATA,
                        "Corrected Cobbled Drops", PackSource.BUILT_IN, true);
            }
            if (ModConfigs.enableTerracottaVariants || ModConfigs.configMissing) {
                addPack(event, modId, "terracotta_variants_recipes", PackType.SERVER_DATA,
                        "Terracotta Variants Recipes", PackSource.BUILT_IN, true);
            }
            if (ModConfigs.enableConcreteVariants || ModConfigs.configMissing) {
                addPack(event, modId, "concrete_variants_recipes", PackType.SERVER_DATA,
                        "Concrete Variants Recipes", PackSource.BUILT_IN, true);
            }
        }
    }

    private static void addPack(AddPackFindersEvent event, String modId, String folder, PackType type,
                                String displayName, PackSource source, boolean alwaysActive) {
        event.addPackFinders(
                Identifier.fromNamespaceAndPath(modId, "resourcepacks/" + folder),
                type,
                Component.literal(displayName),
                source,
                alwaysActive,
                Pack.Position.TOP
        );
    }
}
