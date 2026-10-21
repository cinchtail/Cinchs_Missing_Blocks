package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
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
    }
}