package net.cinchtail.cinchsmissingblocks;

import com.mojang.logging.LogUtils;
import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.item.ModItemGroups;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

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
    }
}