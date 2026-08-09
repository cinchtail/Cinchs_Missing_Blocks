package net.cinchtail.cinchsmissingblocks.config;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;

public class ModConfigsEarly {

    private static final Gson GSON = new Gson();
    private static final Path EARLY_CONFIG_PATH =
            Path.of("config/cinchsmissingblocks.json");

    public static boolean loadEarlyFlag() {
        try {
            if (!Files.exists(EARLY_CONFIG_PATH)) {
                return true;
            }

            try (Reader reader = Files.newBufferedReader(EARLY_CONFIG_PATH)) {
                JsonObject json = GSON.fromJson(reader, JsonObject.class);

                return !json.has("enableTuffBrickPillar")
                        || json.get("enableTuffBrickPillar").getAsBoolean();
            }

        } catch (Exception e) {
            return true;
        }
    }
}