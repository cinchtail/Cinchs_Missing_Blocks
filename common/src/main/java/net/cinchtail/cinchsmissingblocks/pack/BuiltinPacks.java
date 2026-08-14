package net.cinchtail.cinchsmissingblocks.pack;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public final class BuiltinPacks {
    private BuiltinPacks() {
    }

    public static List<Definition> available(Type type, Predicate<String> isModLoaded) {
        List<Definition> packs = new ArrayList<>();

        if (type == Type.CLIENT_RESOURCES) {
            if (ModConfigs.enableTuffBrickPillar) {
                packs.add(pack(MOD_ID, "cinchs_tuff_pillars", "Cinch's Tuff Pillars",
                        type, Activation.ALWAYS_ENABLED));
            }
            packs.add(pack(MOD_ID, "cinchs_double_slabs", "Cinch's Double Slabs", type,
                    ModConfigs.doubleSlabsPackDefaultEnabled
                            ? Activation.DEFAULT_ENABLED
                            : Activation.NORMAL));
            return List.copyOf(packs);
        }

        if (isModLoaded.test("cinchsvillagerstatues")) {
            packs.add(pack("cinchsvillagerstatues", "z_override_cinchsvillagerstatues",
                    "Compat: Cinch's Villager Statues", type, Activation.ALWAYS_ENABLED));
        }
        if (isModLoaded.test("cinchslostmobgrinders")) {
            packs.add(pack("cinchslostmobgrinders", "z_override_cinchslostmobgrinders",
                    "Compat: Cinch's Lost Mob Grinders", type, Activation.ALWAYS_ENABLED));
        }
        if (ModConfigs.enableTuffBrickPillar) {
            packs.add(pack(MOD_ID, "tuff_pillar_recipes", "Tuff Pillars Recipes",
                    type, Activation.ALWAYS_ENABLED));
        }
        if (ModConfigs.enableReworkedDeepslateRecipes || ModConfigs.configMissing) {
            packs.add(pack(MOD_ID, "reworked_deepslate_recipes", "Reworked Deepslate Recipes",
                    type, Activation.ALWAYS_ENABLED));
        }
        if (ModConfigs.enableCorrectedCobbledDrops || ModConfigs.configMissing) {
            packs.add(pack(MOD_ID, "corrected_cobbled_drops", "Corrected Cobbled Drops",
                    type, Activation.ALWAYS_ENABLED));
        }
        if (ModConfigs.enableTerracottaVariants || ModConfigs.configMissing) {
            packs.add(pack(MOD_ID, "terracotta_variants_recipes", "Terracotta Variants Recipes",
                    type, Activation.ALWAYS_ENABLED));
        }
        if (ModConfigs.enableConcreteVariants || ModConfigs.configMissing) {
            packs.add(pack(MOD_ID, "concrete_variants_recipes", "Concrete Variants Recipes",
                    type, Activation.ALWAYS_ENABLED));
        }

        return List.copyOf(packs);
    }

    private static Definition pack(String namespace, String folder, String displayName,
                                   Type type, Activation activation) {
        return new Definition(namespace, folder, displayName, type, activation);
    }

    public enum Type {
        CLIENT_RESOURCES,
        SERVER_DATA
    }

    public enum Activation {
        ALWAYS_ENABLED,
        DEFAULT_ENABLED,
        NORMAL
    }

    public record Definition(
            String namespace,
            String folder,
            String displayName,
            Type type,
            Activation activation
    ) {
    }
}
