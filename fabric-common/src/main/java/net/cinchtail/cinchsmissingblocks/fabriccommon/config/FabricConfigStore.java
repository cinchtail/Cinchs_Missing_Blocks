package net.cinchtail.cinchsmissingblocks.fabriccommon.config;

import net.cinchtail.cinchsmissingblocks.common.config.CmbConfig;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class FabricConfigStore {
    private static final Pattern BOOLEAN_FIELD = Pattern.compile("\\\"([^\\\"]+)\\\"\\s*:\\s*(true|false)");

    private FabricConfigStore() {
    }

    public static FabricConfigState load(Path configPath) {
        CmbConfig defaults = CmbConfig.defaults();
        boolean missing = !Files.exists(configPath);

        try {
            if (missing) {
                write(configPath, defaults);
                return new FabricConfigState(defaults, true);
            }

            Map<String, Boolean> values = parse(Files.readString(configPath, StandardCharsets.UTF_8));
            CmbConfig config = new CmbConfig(
                    values.getOrDefault("enableTerracottaVariants", defaults.enableTerracottaVariants()),
                    values.getOrDefault("enableConcreteVariants", defaults.enableConcreteVariants()),
                    values.getOrDefault("enableTuffBrickPillar", defaults.enableTuffBrickPillar()),
                    values.getOrDefault("enableReworkedDeepslateRecipes", defaults.enableReworkedDeepslateRecipes()),
                    values.getOrDefault("enableCorrectedCobbledDrops", defaults.enableCorrectedCobbledDrops()),
                    values.getOrDefault("doubleSlabsPackDefaultEnabled", defaults.doubleSlabsPackDefaultEnabled())
            );

            if (values.size() < 6) {
                write(configPath, config);
            }
            return new FabricConfigState(config, false);
        } catch (Exception exception) {
            try {
                write(configPath, defaults);
            } catch (Exception ignored) {
            }
            return new FabricConfigState(defaults, missing);
        }
    }

    static Map<String, Boolean> parse(String json) {
        Map<String, Boolean> values = new LinkedHashMap<>();
        Matcher matcher = BOOLEAN_FIELD.matcher(json);
        while (matcher.find()) {
            values.put(matcher.group(1), Boolean.parseBoolean(matcher.group(2)));
        }
        return values;
    }

    private static void write(Path path, CmbConfig config) throws IOException {
        Files.createDirectories(path.getParent());
        String json = "{\n" +
                "  \"enableTerracottaVariants\": " + config.enableTerracottaVariants() + ",\n" +
                "  \"enableConcreteVariants\": " + config.enableConcreteVariants() + ",\n" +
                "  \"enableTuffBrickPillar\": " + config.enableTuffBrickPillar() + ",\n" +
                "  \"enableReworkedDeepslateRecipes\": " + config.enableReworkedDeepslateRecipes() + ",\n" +
                "  \"enableCorrectedCobbledDrops\": " + config.enableCorrectedCobbledDrops() + ",\n" +
                "  \"doubleSlabsPackDefaultEnabled\": " + config.doubleSlabsPackDefaultEnabled() + "\n" +
                "}\n";
        Files.writeString(path, json, StandardCharsets.UTF_8);
    }
}
