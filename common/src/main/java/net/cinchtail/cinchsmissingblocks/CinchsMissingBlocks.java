package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import net.cinchtail.cinchsmissingblocks.item.ModItemGroups;
import net.cinchtail.cinchsmissingblocks.item.ModItems;
import net.cinchtail.cinchsmissingblocks.vertical.VerticalSlabConfig;
import net.minecraft.world.item.CreativeModeTab;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;

public final class CinchsMissingBlocks {
    public static final String MOD_ID = "cinchsmissingblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private CinchsMissingBlocks() {
    }

    public static void initialize(Path configDirectory) {
        ModConfigs.load(configDirectory);
        VerticalSlabConfig.setEnabled(ModConfigs.enableVerticalSlabs);
    }

    public static void registerContent(CreativeModeTab itemGroup) {
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModBlocks.registerBlockItems();
        ModItemGroups.registerItemGroup(itemGroup);
    }
}
