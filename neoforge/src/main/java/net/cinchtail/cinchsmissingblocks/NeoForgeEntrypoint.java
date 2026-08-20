package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.item.ModItemGroups;
import net.cinchtail.cinchsmissingblocks.item.ModItems;
import net.cinchtail.cinchsmissingblocks.pack.ModBuiltinPacks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(CinchsMissingBlocks.MOD_ID)
public final class NeoForgeEntrypoint {
    public NeoForgeEntrypoint(IEventBus bus) {
        CinchsMissingBlocks.initialize(FMLPaths.CONFIGDIR.get());
        bus.addListener(this::onRegister);
        bus.addListener(this::addPackFinders);
        CinchsMissingBlocks.LOGGER.info("Cinch's Missing Blocks initialized on NeoForge.");
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
            ModItemGroups.registerItemGroup(CreativeModeTab.builder()
                    .icon(ModItemGroups::createIcon)
                    .title(ModItemGroups.title())
                    .displayItems((parameters, output) -> ModItemGroups.populate(output::accept))
                    .build());
        }
    }

    private void addPackFinders(AddPackFindersEvent event) {
        ModBuiltinPacks.register(event, CinchsMissingBlocks.MOD_ID);
    }
}
