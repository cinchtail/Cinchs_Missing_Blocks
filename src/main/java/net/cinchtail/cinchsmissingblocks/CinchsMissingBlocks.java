package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.item.ModItemGroups;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(CinchsMissingBlocks.MOD_ID)
public class CinchsMissingBlocks {
    public static final String MOD_ID = "cinchsmissingblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(CinchsMissingBlocks.class);

    public CinchsMissingBlocks(@NotNull IEventBus bus) {
        ModBlocks.BLOCKS.register(bus);
        ModBlocks.ModItems.ITEMS.register(bus);
        ModItemGroups.CREATIVE_MODE_TABS.register(bus);
        bus.addListener(this::addPackFinders);
    }

    @SubscribeEvent
    public void addPackFinders(AddPackFindersEvent event) {
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(MOD_ID,"cinchs_double_slabs"),
                PackType.CLIENT_RESOURCES,
                Component.literal("Cinch's Double Slabs"),
                PackSource.BUILT_IN,
                false,      // enabled by default
                Pack.Position.TOP      // highest priority
        );
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(MOD_ID,"cinchs_tuff_pillars"),
                PackType.CLIENT_RESOURCES,
                Component.literal("Cinch's Tuff Pillars"),
                PackSource.BUILT_IN,
                false,      // enabled by default
                Pack.Position.TOP      // highest priority
        );
    }
}