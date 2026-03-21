package net.cinchtail.cinchsmissingblocks.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class TuffPillarConfig {
    public static ForgeConfigSpec.BooleanValue ENABLE_CHISELED_TUFF_BRICKS;

    public static final ForgeConfigSpec SPEC;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        ENABLE_CHISELED_TUFF_BRICKS = builder
                .comment("Change chiseled tuff bricks into tuff pillar")
                .define("enableChiseledTuffBricks", true);

        SPEC = builder.build();
    }
}