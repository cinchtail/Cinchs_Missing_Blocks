package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.item.ModItemGroups;
import net.cinchtail.cinchsmissingblocks.item.ModItems;
import net.cinchtail.cinchsmissingblocks.pack.ModBuiltinPacks;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import net.neoforged.neoforge.registries.RegisterEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(CinchsMissingBlocks.MOD_ID)
public class CinchsMissingBlocks {
    public static final String MOD_ID = "cinchsmissingblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public CinchsMissingBlocks(IEventBus bus) {
        bus.addListener(this::onRegister);
        bus.addListener(this::addPackFinders);
        LOGGER.info("Cinch's Missing Blocks initialized on NeoForge 26.2.");
    }

    private void onRegister(RegisterEvent event) {
        if (event.getRegistryKey().equals(Registries.BLOCK)) {
            ModBlocks.registerBlocks();
            return;
        }
        if (event.getRegistryKey().equals(Registries.ITEM)) {
            ModItems.registerItems();
            return;
        }
        if (event.getRegistryKey().equals(Registries.CREATIVE_MODE_TAB)) {
            ModItemGroups.registerItemGroup();
        }
    }

    private void addPackFinders(AddPackFindersEvent event) {
        ModBuiltinPacks.register(event, MOD_ID);
    }
}