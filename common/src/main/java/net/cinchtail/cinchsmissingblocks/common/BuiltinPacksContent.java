package net.cinchtail.cinchsmissingblocks.common;

import net.cinchtail.cinchsmissingblocks.common.catalog.ContentCatalog;
import net.cinchtail.cinchsmissingblocks.common.config.ConfigFlag;
import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;
import net.cinchtail.cinchsmissingblocks.common.pack.PackActivation;
import net.cinchtail.cinchsmissingblocks.common.pack.PackSpec;
import net.cinchtail.cinchsmissingblocks.common.pack.PackType;

public final class BuiltinPacksContent {
    private BuiltinPacksContent() {
    }

    public static void contribute(ContentCatalog.Builder catalog) {
        catalog.pack(PackSpec.compatibility(
                new ResourceId("cinchsvillagerstatues", "z_override_cinchsvillagerstatues"),
                PackType.DATA,
                "Compat: Cinch's Villager Statues",
                "cinchsvillagerstatues"
        ));
        catalog.pack(PackSpec.compatibility(
                new ResourceId("cinchslostmobgrinders", "z_override_cinchslostmobgrinders"),
                PackType.DATA,
                "Compat: Cinch's Lost Mob Grinders",
                "cinchslostmobgrinders"
        ));
        catalog.pack(PackSpec.gated(
                ResourceId.mod("tuff_pillar_recipes"),
                PackType.DATA,
                "Tuff Pillars Recipes",
                PackActivation.ALWAYS_ENABLED,
                ConfigFlag.TUFF_BRICK_PILLAR,
                false
        ).requiringVanilla(ResourceId.minecraft("tuff_bricks")));
        catalog.pack(PackSpec.gated(
                ResourceId.mod("reworked_deepslate_recipes"),
                PackType.DATA,
                "Reworked Deepslate Recipes",
                PackActivation.ALWAYS_ENABLED,
                ConfigFlag.REWORKED_DEEPSLATE_RECIPES,
                true
        ));
        catalog.pack(PackSpec.gated(
                ResourceId.mod("corrected_cobbled_drops"),
                PackType.DATA,
                "Corrected Cobbled Drops",
                PackActivation.ALWAYS_ENABLED,
                ConfigFlag.CORRECTED_COBBLED_DROPS,
                true
        ));
        catalog.pack(PackSpec.gated(
                ResourceId.mod("terracotta_variants_recipes"),
                PackType.DATA,
                "Terracotta Variants Recipes",
                PackActivation.ALWAYS_ENABLED,
                ConfigFlag.TERRACOTTA_VARIANTS,
                true
        ));
        catalog.pack(PackSpec.gated(
                ResourceId.mod("concrete_variants_recipes"),
                PackType.DATA,
                "Concrete Variants Recipes",
                PackActivation.ALWAYS_ENABLED,
                ConfigFlag.CONCRETE_VARIANTS,
                true
        ));
        catalog.pack(PackSpec.gated(
                ResourceId.mod("cinchs_tuff_pillars"),
                PackType.RESOURCE,
                "Cinch's Tuff Pillars",
                PackActivation.ALWAYS_ENABLED,
                ConfigFlag.TUFF_BRICK_PILLAR,
                false
        ).requiringVanilla(ResourceId.minecraft("tuff_bricks")));
        catalog.pack(PackSpec.configurableDefault(
                ResourceId.mod("cinchs_double_slabs"),
                PackType.RESOURCE,
                "Cinch's Double Slabs",
                ConfigFlag.DOUBLE_SLABS_DEFAULT_ENABLED
        ));
    }
}
