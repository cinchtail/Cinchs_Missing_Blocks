package net.cinchtail.cinchsmissingblocks.pack;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public final class ModBuiltinPacks {
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    private ModBuiltinPacks() {}

    public static void register(AddPackFindersEvent event, String modId) {
        if (event.getPackType() == PackType.CLIENT_RESOURCES) {
            event.addPackFinders(
                    ResourceLocation.fromNamespaceAndPath(modId, "resource_packs/cinchs_double_slabs"),
                    PackType.CLIENT_RESOURCES,
                    Component.literal("Cinch's Double Slabs"),
                    ModConfigs.doubleSlabsPackDefaultEnabled ? PackSource.DEFAULT : PackSource.BUILT_IN,
                    false,
                    Pack.Position.TOP
            );
            if (ModConfigs.enableTuffBrickPillar) {
                event.addPackFinders(
                        ResourceLocation.fromNamespaceAndPath(modId, "resource_packs/cinchs_tuff_pillars"),
                        PackType.CLIENT_RESOURCES,
                        Component.literal("Cinch's Tuff Pillars"),
                        PackSource.BUILT_IN,
                        true,
                        Pack.Position.TOP
                );
            } else {
                LOGGER.info("Tuff Pillar textures disabled by config");
            }
        }

        if (event.getPackType() == PackType.SERVER_DATA) {
            if (ModConfigs.enableTuffBrickPillar) {
                addDataPack(event, modId, "cinchs_tuff_pillar_recipes", "Cinch's Tuff Pillars Recipes");
            }
            if (ModConfigs.enableReworkedDeepslateRecipes || ModConfigs.configMissing) {
                addDataPack(event, modId, "reworked_deepslate_recipes", "Reworked Deepslate Recipes");
            }
            if (ModConfigs.enableCorrectedCobbledDrops || ModConfigs.configMissing) {
                addDataPack(event, modId, "corrected_cobbled_drops", "Corrected Cobbled Drops");
            }
            if (ModConfigs.enableTerracottaVariants || ModConfigs.configMissing) {
                addDataPack(event, modId, "terracotta_variants_recipes", "Terracotta Variants Recipes");
            }
            if (ModConfigs.enableConcreteVariants || ModConfigs.configMissing) {
                addDataPack(event, modId, "concrete_variants_recipes", "Concrete Variants Recipes");
            }
        }
    }

    private static void addDataPack(AddPackFindersEvent event, String modId, String path, String title) {
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(modId, "resource_packs/" + path),
                PackType.SERVER_DATA,
                Component.literal(title),
                PackSource.BUILT_IN,
                true,
                Pack.Position.TOP
        );
    }
}
