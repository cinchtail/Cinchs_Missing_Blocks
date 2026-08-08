package net.cinchtail.cinchsmissingblocks.fabriccommon.version;

import net.cinchtail.cinchsmissingblocks.common.CmbContent;
import net.cinchtail.cinchsmissingblocks.common.catalog.ContentCatalog;
import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;

import java.util.Set;

/**
 * Minecraft/Fabric compatibility facts that are safe to share without linking against Minecraft classes.
 *
 * Every supported Minecraft release gets an explicit profile. Build modules may target several profiles when
 * their Java API and resource formats are compatible, but the catalog itself always remains version-aware.
 */
public enum FabricVersionProfile {
    MC_1_20("1.20", false, false, false, false, false, false, false, true, false, "15", "15"),
    MC_1_20_1("1.20.1", false, false, false, false, false, false, false, true, false, "15", "15"),
    MC_1_20_2("1.20.2", false, false, false, false, false, false, false, true, false, "18", "18"),
    MC_1_20_3("1.20.3", false, false, false, false, false, false, false, true, false, "26", "22"),
    MC_1_20_4("1.20.4", false, false, false, false, false, false, false, true, false, "26", "22"),
    MC_1_20_5("1.20.5", false, false, false, false, false, true, false, false, false, "41", "32"),
    MC_1_20_6("1.20.6", false, false, false, false, false, true, false, false, false, "41", "32"),

    MC_1_21("1.21", true, false, false, false, true, true, false, false, false, "48", "34"),
    MC_1_21_1("1.21.1", true, false, false, false, true, true, false, false, false, "48", "34"),
    MC_1_21_2("1.21.2", true, false, false, false, true, true, false, false, false, "57", "42"),
    MC_1_21_3("1.21.3", true, false, false, false, true, true, false, false, false, "57", "42"),
    MC_1_21_4("1.21.4", true, true, false, false, true, true, false, false, true, "61", "46"),
    MC_1_21_5("1.21.5", true, true, false, false, true, true, false, false, true, "71", "55"),
    MC_1_21_6("1.21.6", true, true, false, false, true, true, false, false, true, "80", "63"),
    MC_1_21_7("1.21.7", true, true, false, false, true, true, false, false, true, "81", "64"),
    MC_1_21_8("1.21.8", true, true, false, false, true, true, false, false, true, "81", "64"),
    MC_1_21_9("1.21.9", true, true, false, false, true, true, false, false, true, "88.0", "69.0"),
    MC_1_21_10("1.21.10", true, true, false, false, true, true, false, false, true, "88.0", "69.0"),
    MC_1_21_11("1.21.11", true, true, false, false, true, true, false, false, true, "94.1", "75.0"),

    MC_26_1("26.1", true, true, false, false, true, true, true, false, true, "101.1", "84.0"),
    MC_26_1_1("26.1.1", true, true, false, false, true, true, true, false, true, "101.1", "84.0"),
    MC_26_1_2("26.1.2", true, true, false, false, true, true, true, false, true, "101.1", "84.0"),
    MC_26_2("26.2", true, true, true, true, true, true, true, false, true, "107.1", "88.0");

    private static final Set<String> TUFF_1_21 = Set.of(
            "tuff_bricks", "polished_tuff", "chiseled_tuff"
    );
    private static final Set<String> RESIN = Set.of(
            "resin_bricks", "pale_moss_block", "pale_hanging_moss", "pale_moss_carpet"
    );
    private static final Set<String> SULFUR_CAVES = Set.of(
            "cinnabar", "polished_cinnabar", "cinnabar_bricks",
            "sulfur", "polished_sulfur", "sulfur_bricks"
    );
    private static final Set<ResourceId> TUFF_PILLAR_PACKS = Set.of(
            ResourceId.mod("tuff_pillar_recipes"),
            ResourceId.mod("cinchs_tuff_pillars")
    );

    private final String minecraftVersion;
    private final boolean tuffBricks;
    private final boolean resin;
    private final boolean sulfurCaves;
    private final boolean tuffBrickPillarPatch;
    private final boolean singularDataDirectories;
    private final boolean resultUsesId;
    private final boolean directIngredientIds;
    private final boolean legacyItemPredicates;
    private final boolean modernItemDefinitions;
    private final String dataPackFormat;
    private final String resourcePackFormat;

    FabricVersionProfile(
            String minecraftVersion,
            boolean tuffBricks,
            boolean resin,
            boolean sulfurCaves,
            boolean tuffBrickPillarPatch,
            boolean singularDataDirectories,
            boolean resultUsesId,
            boolean directIngredientIds,
            boolean legacyItemPredicates,
            boolean modernItemDefinitions,
            String dataPackFormat,
            String resourcePackFormat
    ) {
        this.minecraftVersion = minecraftVersion;
        this.tuffBricks = tuffBricks;
        this.resin = resin;
        this.sulfurCaves = sulfurCaves;
        this.tuffBrickPillarPatch = tuffBrickPillarPatch;
        this.singularDataDirectories = singularDataDirectories;
        this.resultUsesId = resultUsesId;
        this.directIngredientIds = directIngredientIds;
        this.legacyItemPredicates = legacyItemPredicates;
        this.modernItemDefinitions = modernItemDefinitions;
        this.dataPackFormat = dataPackFormat;
        this.resourcePackFormat = resourcePackFormat;
    }

    public static FabricVersionProfile forMinecraftVersion(String minecraftVersion) {
        for (FabricVersionProfile profile : values()) {
            if (profile.minecraftVersion.equals(minecraftVersion)) {
                return profile;
            }
        }
        throw new IllegalArgumentException("Unsupported Minecraft version: " + minecraftVersion);
    }

    public String minecraftVersion() { return minecraftVersion; }
    public boolean supportsTuffBrickPillar() { return tuffBrickPillarPatch; }
    public boolean singularDataDirectories() { return singularDataDirectories; }
    public boolean resultUsesId() { return resultUsesId; }
    public boolean directIngredientIds() { return directIngredientIds; }
    public boolean legacyItemPredicates() { return legacyItemPredicates; }
    public boolean modernItemDefinitions() { return modernItemDefinitions; }
    public String dataPackFormat() { return dataPackFormat; }
    public String resourcePackFormat() { return resourcePackFormat; }

    public String recipeDirectory() { return singularDataDirectories ? "recipe" : "recipes"; }
    public String advancementDirectory() { return singularDataDirectories ? "advancement" : "advancements"; }
    public String lootTableDirectory() { return singularDataDirectories ? "loot_table" : "loot_tables"; }

    public ContentCatalog catalog() {
        ContentCatalog base = CmbContent.CATALOG.filtered(this::isVanillaAvailable);
        if (tuffBrickPillarPatch) {
            return base;
        }
        return new ContentCatalog(
                base.blocks(),
                base.items(),
                base.recipes(),
                base.creativeEntries(),
                base.packs().stream().filter(pack -> !TUFF_PILLAR_PACKS.contains(pack.id())).toList()
        );
    }

    public boolean isVanillaAvailable(ResourceId id) {
        if (!"minecraft".equals(id.namespace())) {
            return true;
        }
        String path = id.path();
        if (!tuffBricks && TUFF_1_21.contains(path)) {
            return false;
        }
        if (!resin && RESIN.contains(path)) {
            return false;
        }
        return sulfurCaves || !SULFUR_CAVES.contains(path);
    }
}
