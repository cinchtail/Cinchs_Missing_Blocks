package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.item.ModItemGroups;
import net.cinchtail.cinchsmissingblocks.item.ModItems;
import net.cinchtail.cinchsmissingblocks.pack.ModBuiltinPacks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(CinchsMissingBlocksNeoForge.MOD_ID)
public class CinchsMissingBlocksNeoForge {
    public static final String MOD_ID = "cinchsmissingblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public CinchsMissingBlocksNeoForge(IEventBus modEventBus, ModContainer modContainer) {
        ModItemGroups.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        modEventBus.addListener(this::addPackFinders);
        LOGGER.info("Cinch's Missing Blocks initialized on NeoForge 26.2");
    }

    private void addPackFinders(AddPackFindersEvent event) {
        ModBuiltinPacks.register(event, MOD_ID);
    }
}