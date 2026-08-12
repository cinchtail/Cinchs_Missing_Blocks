package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.cinchtail.cinchsmissingblocks.item.ModItemGroups;
import net.cinchtail.cinchsmissingblocks.item.ModItems;
import net.cinchtail.cinchsmissingblocks.network.ClientConfigSender;
import net.cinchtail.cinchsmissingblocks.network.NetworkInit;
import net.cinchtail.cinchsmissingblocks.pack.ModBuiltinPacks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import net.neoforged.neoforge.registries.RegisterEvent;
import net.minecraft.core.registries.Registries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(CinchsMissingBlocks.MOD_ID)
public class CinchsMissingBlocks {
    public static final String MOD_ID = "cinchsmissingblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public CinchsMissingBlocks(IEventBus bus) {
        ModConfigs.load();
        // Do not eagerly initialize blocks/items here. NeoForge registries are frozen
        // outside their RegisterEvent window, and Item/Block constructors create
        // intrusive holders immediately in 1.21.1.
        bus.addListener(this::onRegister);
        bus.register(NetworkInit.class);
        NeoForge.EVENT_BUS.register(ClientConfigSender.class);
        bus.addListener(this::addPackFinders);
        bus.addListener(this::onClientSetup);
        LOGGER.info("Cinch's Missing Blocks initialized on NeoForge 1.21.1.");
    }

    private void onRegister(RegisterEvent event) {
        if (event.getRegistryKey().equals(Registries.BLOCK)) {
            ModBlocks.registerBlocks();
            return;
        }
        if (event.getRegistryKey().equals(Registries.ITEM)) {
            ModItems.registerItems();
            ModBlocks.registerBlockItems();
            return;
        }
        if (event.getRegistryKey().equals(Registries.CREATIVE_MODE_TAB)) {
            ModItemGroups.registerItemGroup();
        }
    }

    private void onClientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TINTED_GLASS_PANE, RenderType.translucent());
    }

    private void addPackFinders(AddPackFindersEvent event) {
        ModBuiltinPacks.register(event, MOD_ID);
    }
}
