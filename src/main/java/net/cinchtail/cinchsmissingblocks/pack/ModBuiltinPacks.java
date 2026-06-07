package net.cinchtail.cinchsmissingblocks.pack;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModBuiltinPacks {

    private static final Logger LOGGER = LoggerFactory.getLogger("cinchsmissingblocks");

    public static void register(AddPackFindersEvent event, String modId) {

        if (event.getPackType() == PackType.CLIENT_RESOURCES) {

            event.addPackFinders(
                    Identifier.fromNamespaceAndPath(modId, "resource_packs/cinchs_double_slabs"),
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
                        Identifier.fromNamespaceAndPath(modId, "resource_packs/cinchs_tuff_pillars"),
                        PackType.CLIENT_RESOURCES,
                        Component.literal("Cinch's Tuff Pillars"),
                        PackSource.BUILT_IN,
                        true,
                        Pack.Position.TOP
                );
            }
        }

        if (event.getPackType() == PackType.SERVER_DATA) {

            if (ModConfigs.enableTuffBrickPillar) {

                event.addPackFinders(
                        Identifier.fromNamespaceAndPath(modId, "resource_packs/cinchs_tuff_pillar_recipes"),
                        PackType.SERVER_DATA,
                        Component.literal("Cinch's Tuff Pillars Recipes"),
                        PackSource.BUILT_IN,
                        true,
                        Pack.Position.TOP
                );
            } else {
                LOGGER.info("Cinch's Tuff Pillars datapack disabled by config");
            }
        }
    }
}