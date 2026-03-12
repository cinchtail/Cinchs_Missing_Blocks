package net.cinchtail.cinchsmissingblocks;

import com.mojang.logging.LogUtils;
import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.item.ModItemGroups;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.*;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.moddiscovery.ModFile;
import org.slf4j.Logger;

import java.nio.file.Path;
import java.util.Optional;

@Mod(CinchsMissingBlocks.MOD_ID)
public class CinchsMissingBlocks
{
    public static final String MOD_ID = "cinchsmissingblocks";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CinchsMissingBlocks(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ModBlocks.register(modEventBus);

        ModItemGroups.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(this::onAddPackFinders);
    }
    private void onAddPackFinders(AddPackFindersEvent event) {
        if (event.getPackType() != PackType.CLIENT_RESOURCES)
            return;

        ModFile modFile = (ModFile) ModList.get().getModFileById(MOD_ID).getFile();
        Path packPath = modFile.findResource("resourcepacks/cinchs_double_slabs");

        event.addRepositorySource((consumer) -> {
            PackLocationInfo info = new PackLocationInfo(
                    MOD_ID + "_cinchs_double_slabs",
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