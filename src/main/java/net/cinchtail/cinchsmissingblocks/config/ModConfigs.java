package net.cinchtail.cinchsmissingblocks.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.fabricmc.loader.api.FabricLoader;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public class ModConfigs {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path CONFIG_PATH =
            FabricLoader.getInstance().getConfigDir().resolve("cinchsmissingblocks.json");

    public static boolean enableTuffBrickPillar = true;

    public static void load() {
        try {
            if (!Files.exists(CONFIG_PATH)) {
                generateDefault();
                return;
            }

            try (Reader reader = Files.newBufferedReader(CONFIG_PATH)) {
                JsonObject json = GSON.fromJson(reader, JsonObject.class);

                enableTuffBrickPillar =
                        !json.has("enableTuffBrickPillar") || json.get("enableTuffBrickPillar").getAsBoolean();
            }

        } catch (Exception e) {
            e.printStackTrace();
            generateDefault();
        }
    }

    private static void generateDefault() {
        try {
            JsonObject json = new JsonObject();
            json.addProperty("enableTuffBrickPillar", true);

            Files.createDirectories(CONFIG_PATH.getParent());

            try (Writer writer = Files.newBufferedWriter(CONFIG_PATH)) {
                GSON.toJson(json, writer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}