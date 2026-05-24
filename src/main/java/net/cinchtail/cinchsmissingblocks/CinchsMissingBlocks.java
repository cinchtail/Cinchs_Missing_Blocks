package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.cinchtail.cinchsmissingblocks.item.ModItemGroups;
import net.cinchtail.cinchsmissingblocks.pack.ModBuiltinPacks;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.LoggerFactory;

@Mod(CinchsMissingBlocks.MOD_ID)
public class CinchsMissingBlocks {
    public static final String MOD_ID = "cinchsmissingblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(CinchsMissingBlocks.class);

    static {
        ModConfigs.load();
    }

    public CinchsMissingBlocks(@NotNull IEventBus bus) {
        ModBlocks.BLOCKS.register(bus);
        ModBlocks.ModItems.ITEMS.register(bus);
        ModItemGroups.CREATIVE_MODE_TABS.register(bus);
        bus.addListener(this::addPackFinders);
    }

    @SubscribeEvent
    public void addPackFinders(AddPackFindersEvent event) {
        ModBuiltinPacks.register(event, MOD_ID);
    }
}