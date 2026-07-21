package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.cinchtail.cinchsmissingblocks.item.ModItemGroups;
import net.cinchtail.cinchsmissingblocks.item.ModItems;
import net.cinchtail.cinchsmissingblocks.network.ClientConfigSender;
import net.cinchtail.cinchsmissingblocks.network.NetworkInit;
import net.cinchtail.cinchsmissingblocks.pack.ModBuiltinPacks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(CinchsMissingBlocks.MOD_ID)
public class CinchsMissingBlocks {
    public static final String MOD_ID = "cinchsmissingblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(CinchsMissingBlocks.class);

    public CinchsMissingBlocks(@NotNull IEventBus bus) {
        ModConfigs.load();
        ModItems.register(bus);
        ModBlocks.register(bus);
        ModItemGroups.CREATIVE_MODE_TABS.register(bus);
        bus.register(NetworkInit.class);
        NeoForge.EVENT_BUS.register(ClientConfigSender.class);
        bus.addListener(this::addPackFinders);
        bus.addListener(this::onClientSetup);
    }

    @SubscribeEvent
    public void onClientSetup(FMLClientSetupEvent event) {
        //ItemBlockRenderTypes.setRenderLayer(ModBlocks.TINTED_GLASS_PANE.get(), RenderType.translucent());
    }

    @SubscribeEvent
    public void addPackFinders(AddPackFindersEvent event) {
        ModBuiltinPacks.register(event, MOD_ID);
    }
}