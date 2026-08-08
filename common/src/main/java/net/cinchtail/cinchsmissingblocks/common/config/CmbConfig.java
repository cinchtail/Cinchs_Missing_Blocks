package net.cinchtail.cinchsmissingblocks.common.config;

public record CmbConfig(
        boolean enableTerracottaVariants,
        boolean enableConcreteVariants,
        boolean enableTuffBrickPillar,
        boolean enableReworkedDeepslateRecipes,
        boolean enableCorrectedCobbledDrops,
        boolean doubleSlabsPackDefaultEnabled
) {
    public static CmbConfig defaults() {
        return new CmbConfig(true, true, false, true, false, false);
    }

    public boolean enabled(ConfigFlag flag) {
        return switch (flag) {
            case TERRACOTTA_VARIANTS -> enableTerracottaVariants;
            case CONCRETE_VARIANTS -> enableConcreteVariants;
            case TUFF_BRICK_PILLAR -> enableTuffBrickPillar;
            case REWORKED_DEEPSLATE_RECIPES -> enableReworkedDeepslateRecipes;
            case CORRECTED_COBBLED_DROPS -> enableCorrectedCobbledDrops;
            case DOUBLE_SLABS_DEFAULT_ENABLED -> doubleSlabsPackDefaultEnabled;
        };
    }
}
