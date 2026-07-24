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

public class ModBuiltinPacks {

    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void register(AddPackFindersEvent event, String modId) {

        if (event.getPackType() == PackType.CLIENT_RESOURCES) {

            event.addPackFinders(
                    ResourceLocation.fromNamespaceAndPath(modId, "resource_packs/cinchs_double_slabs"),
                    PackType.CLIENT_RESOURCES,
                    Component.literal("Cinch's Double Slabs"),
                    ModConfigs.doubleSlabsPackDefaultEnabled
                            ? PackSource.DEFAULT
                            : PackSource.BUILT_IN,
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
            }
            else {
                LOGGER.info("Tuff Pillar textures disabled by config");
            }
        }

        if (event.getPackType() == PackType.SERVER_DATA) {

            if (ModConfigs.enableTuffBrickPillar) {

                event.addPackFinders(
                        ResourceLocation.fromNamespaceAndPath(modId, "resource_packs/cinchs_tuff_pillar_recipes"),
                        PackType.SERVER_DATA,
                        Component.literal("Cinch's Tuff Pillars Recipes"),
                        PackSource.BUILT_IN,
                        true,
                        Pack.Position.TOP
                );
            } else {
                LOGGER.info("Tuff Pillar recipes disabled by config");
            }
        }

        if (event.getPackType() == PackType.SERVER_DATA) {

            if (ModConfigs.enableReworkedDeepslateRecipes || ModConfigs.configMissing) {

                event.addPackFinders(
                        ResourceLocation.fromNamespaceAndPath(modId, "resource_packs/reworked_deepslate_recipes"),
                        PackType.SERVER_DATA,
                        Component.literal("Reworked Deepslate Recipes"),
                        PackSource.BUILT_IN,
                        true,
                        Pack.Position.TOP
                );
            } else {
                LOGGER.info("Reworked deepslate recipes disabled by config");
            }
        }

        if (event.getPackType() == PackType.SERVER_DATA) {

            if (ModConfigs.enableCorrectedCobbledDrops || ModConfigs.configMissing) {

                event.addPackFinders(
                        ResourceLocation.fromNamespaceAndPath(modId, "resource_packs/corrected_cobbled_drops"),
                        PackType.SERVER_DATA,
                        Component.literal("Corrected Cobbled Drops"),
                        PackSource.BUILT_IN,
                        true,
                        Pack.Position.TOP
                );
            } else {
                LOGGER.info("Corrected Cobble Drops loot tables disabled by config");
            }
        }

        if (event.getPackType() == PackType.SERVER_DATA) {

            if (ModConfigs.enableTerracottaVariants || ModConfigs.configMissing) {

                event.addPackFinders(
                        ResourceLocation.fromNamespaceAndPath(modId, "resource_packs/terracotta_variants_recipes"),
                        PackType.SERVER_DATA,
                        Component.literal("Terracotta Variants Recipes"),
                        PackSource.BUILT_IN,
                        true,
                        Pack.Position.TOP
                );
            } else {
                LOGGER.info("Terracotta variants disabled by config (Recipes)");
            }
        }

        if (event.getPackType() == PackType.SERVER_DATA) {

            if (ModConfigs.enableConcreteVariants || ModConfigs.configMissing) {

                event.addPackFinders(
                        ResourceLocation.fromNamespaceAndPath(modId, "resource_packs/concrete_variants_recipes"),
                        PackType.SERVER_DATA,
                        Component.literal("Concrete Variants Recipes"),
                        PackSource.BUILT_IN,
                        true,
                        Pack.Position.TOP
                );
            } else {
                LOGGER.info("Concrete variants disabled by config (Recipes)");
            }
        }
    }
}