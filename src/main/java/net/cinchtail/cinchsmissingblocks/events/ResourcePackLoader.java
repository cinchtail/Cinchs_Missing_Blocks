package net.cinchtail.cinchsmissingblocks.events;

import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.*;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.moddiscovery.ModFile;

import java.nio.file.Path;
import java.util.Optional;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public class ResourcePackLoader {
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ForgeEvents {

        @SubscribeEvent
        public void onAddPackFinders(AddPackFindersEvent event) {
            if (event.getPackType() != PackType.CLIENT_RESOURCES)
                return;

            ModFile modFile = (ModFile) ModList.get().getModFileById(MOD_ID).getFile();
            Path packPath = modFile.findResource("resourcepacks/cinchs_double_slabs");

            event.addRepositorySource((consumer) -> {
                PackLocationInfo info = new PackLocationInfo(
                        "cinchs_double_slabs",
                        Component.literal("Cinch's Double Slabs"),
                        PackSource.DEFAULT,
                        Optional.empty()
                );

                Pack.ResourcesSupplier supplier = new Pack.ResourcesSupplier() {
                    @Override
                    public PackResources openPrimary(PackLocationInfo location) {
                        return new PathPackResources(location, packPath);
                    }

                    @Override
                    public PackResources openFull(PackLocationInfo location, Pack.Metadata metadata) {
                        return new PathPackResources(location, packPath);
                    }
                };
                PackSelectionConfig selection = new PackSelectionConfig(
                        true,       // enabled by default
                        Pack.Position.TOP,  // highest priority
                        false               // not hidden
                );
                Pack pack = Pack.readMetaAndCreate(
                        info, supplier, PackType.CLIENT_RESOURCES, selection
                );
                if (pack != null) {
                    consumer.accept(pack);
                }
            });
        }
    }
}