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
    public static boolean enableTuffBrickPillar;
    public static boolean enableReworkedDeepslateRecipes;
    public static boolean doubleSlabsPackDefaultEnabled;

    public static void load() {
        try {
            if (!Files.exists(CONFIG_PATH)) {
                configMissing = true;
                generateDefault();
                return;
            }

            JsonObject json;

            try (Reader reader = Files.newBufferedReader(CONFIG_PATH)) {
                json = GSON.fromJson(reader, JsonObject.class);
            }

            enableTerracottaVariants =
                    !json.has("enableTerracottaVariants") || json.get("enableTerracottaVariants").getAsBoolean();

            enableTuffBrickPillar =
                    !json.has("enableTuffBrickPillar") || json.get("enableTuffBrickPillar").getAsBoolean();

            enableReworkedDeepslateRecipes =
                    !json.has("enableReworkedDeepslateRecipes") || json.get("enableReworkedDeepslateRecipes").getAsBoolean();

            doubleSlabsPackDefaultEnabled =
                    !json.has("doubleSlabsPackDefaultEnabled") || json.get("doubleSlabsPackDefaultEnabled").getAsBoolean();

            rewriteConfig();

        } catch (Exception e) {
            configMissing = true;
            LOGGER.error("Failed to read config, regenerating defaults", e);
            generateDefault();
        }
    }

    private static void generateDefault() {
        try {
            JsonObject json = new JsonObject();

            json.addProperty("enableTerracottaVariants", true);
            json.addProperty("enableTuffBrickPillar", false);
            json.addProperty("enableReworkedDeepslateRecipes", true);
            json.addProperty("doubleSlabsPackDefaultEnabled", false);

            Files.createDirectories(CONFIG_PATH.getParent());

            try (Writer writer = Files.newBufferedWriter(CONFIG_PATH)) {
                GSON.toJson(json, writer);
            }

        } catch (IOException e) {
            LOGGER.error("Failed to generate default config", e);
        }
    }

    private static void rewriteConfig() {
        try {
            JsonObject json = new JsonObject();

            json.addProperty("enableTerracottaVariants", enableTerracottaVariants);
            json.addProperty("enableTuffBrickPillar", enableTuffBrickPillar);
            json.addProperty("enableReworkedDeepslateRecipes", enableReworkedDeepslateRecipes);
            json.addProperty("doubleSlabsPackDefaultEnabled", doubleSlabsPackDefaultEnabled);

            try (Writer writer = Files.newBufferedWriter(CONFIG_PATH)) {
                GSON.toJson(json, writer);
            }

        } catch (IOException e) {
            LOGGER.error("Failed to rewrite config", e);
        }
    }
}