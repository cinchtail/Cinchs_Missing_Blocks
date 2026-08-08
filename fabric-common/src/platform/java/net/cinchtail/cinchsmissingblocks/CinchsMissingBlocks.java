package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.common.CmbContent;
import net.cinchtail.cinchsmissingblocks.fabriccommon.bootstrap.FabricBootstrap;
import net.cinchtail.cinchsmissingblocks.platform.FabricPlatform;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class CinchsMissingBlocks implements ModInitializer {
    public static final String MOD_ID = CmbContent.MOD_ID;
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        FabricBootstrap.initialize(FabricPlatform.INSTANCE);
        LOGGER.info("Cinch's Missing Blocks initialized for Fabric {}.", FabricPlatform.INSTANCE.version().minecraftVersion());
    }
}
