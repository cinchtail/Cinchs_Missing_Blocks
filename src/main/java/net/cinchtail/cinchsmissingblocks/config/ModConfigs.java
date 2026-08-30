package net.cinchtail.cinchsmissingblocks.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public class ModConfigs {

    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path CONFIG_PATH =
            FabricLoader.getInstance().getConfigDir().resolve("cinchsmissingblocks.json");

    public static boolean configMissing = false;

    public static boolean enableTerracottaVariants;
    public static boolean enableConcreteVariants;
    public static boolean enableTuffBrickPillar;
    public static boolean enableReworkedDeepslateRecipes;
    public static boolean enableCorrectedCobbledDrops;
    public static boolean doubleSlabsPackDefaultEnabled;

    private static boolean getOrDefault(JsonObject json, String key, boolean defaultValue) {
        return json.has(key) ? json.get(key).getAsBoolean() : defaultValue;
    }

    public static void load() {
        try {
            JsonObject json;
            if (!Files.exists(CONFIG_PATH)) {
                configMissing = true;
                generateDefault();
                return;
            }

            try (Reader reader = Files.newBufferedReader(CONFIG_PATH)) {
                json = GSON.fromJson(reader, JsonObject.class);
            }

            enableTerracottaVariants = getOrDefault(json, "enableTerracottaVariants", true);
            enableConcreteVariants = getOrDefault(json, "enableConcreteVariants", true);
            enableTuffBrickPillar = getOrDefault(json, "enableTuffBrickPillar", false);
            enableReworkedDeepslateRecipes = getOrDefault(json, "enableReworkedDeepslateRecipes", true);
            enableCorrectedCobbledDrops = getOrDefault(json, "enableCorrectedCobbledDrops", false);
            doubleSlabsPackDefaultEnabled = getOrDefault(json, "doubleSlabsPackDefaultEnabled", false);

            boolean updated = false;

            updated |= patchMissing(json, "enableTerracottaVariants", enableTerracottaVariants);
            updated |= patchMissing(json, "enableConcreteVariants", enableConcreteVariants);
            updated |= patchMissing(json, "enableTuffBrickPillar", enableTuffBrickPillar);
            updated |= patchMissing(json, "enableReworkedDeepslateRecipes", enableReworkedDeepslateRecipes);
            updated |= patchMissing(json, "enableCorrectedCobbledDrops", enableCorrectedCobbledDrops);
            updated |= patchMissing(json, "doubleSlabsPackDefaultEnabled", doubleSlabsPackDefaultEnabled);

            if (updated) {
                rewriteConfig(json);
            }

        } catch (Exception e) {
            LOGGER.error("Failed to read config, regenerating defaults", e);
            generateDefault();
        }
    }

    private static void generateDefault() {
        try {
            JsonObject json = new JsonObject();

            json.addProperty("enableTerracottaVariants", true);
            json.addProperty("enableConcreteVariants", true);
            json.addProperty("enableTuffBrickPillar", false);
            json.addProperty("enableReworkedDeepslateRecipes", true);
            json.addProperty("enableCorrectedCobbledDrops", false);
            json.addProperty("doubleSlabsPackDefaultEnabled", false);
            json.addProperty("enableVerticalSlabs", true);

            enableTerracottaVariants = true;
            enableConcreteVariants = true;
            enableTuffBrickPillar = false;
            enableReworkedDeepslateRecipes = true;
            enableCorrectedCobbledDrops = false;
            doubleSlabsPackDefaultEnabled = false;

            Files.createDirectories(CONFIG_PATH.getParent());

            try (Writer writer = Files.newBufferedWriter(CONFIG_PATH)) {
                GSON.toJson(json, writer);
            }

        } catch (IOException e) {
            LOGGER.error("Failed to generate default config", e);
        }
    }

    private static boolean patchMissing(JsonObject json, String key, boolean value) {
        if (!json.has(key)) {
            json.addProperty(key, value);
            return true;
        }
        return false;
    }

    private static void rewriteConfig(JsonObject json) {
        try (Writer writer = Files.newBufferedWriter(CONFIG_PATH)) {
            GSON.toJson(json, writer);
        } catch (IOException e) {
            LOGGER.error("Failed to rewrite config", e);
        }
    }
}