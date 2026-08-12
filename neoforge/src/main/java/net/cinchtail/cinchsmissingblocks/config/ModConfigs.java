package net.cinchtail.cinchsmissingblocks.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.neoforged.fml.loading.FMLPaths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.*;
import java.nio.file.*;
import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public final class ModConfigs {
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path CONFIG_PATH = FMLPaths.CONFIGDIR.get().resolve("cinchsmissingblocks.json");
    public static boolean configMissing = false;
    public static boolean enableTerracottaVariants=true, enableConcreteVariants=true, enableTuffBrickPillar=false, enableReworkedDeepslateRecipes=true, enableCorrectedCobbledDrops=false, doubleSlabsPackDefaultEnabled=false, enableVerticalSlabs=true;
    private static boolean getOrDefault(JsonObject j,String k,boolean d) { return j.has(k)?j.get(k).getAsBoolean():d; }
    public static void load() {
        try {
            if (!Files.exists(CONFIG_PATH)) { configMissing=true; generateDefault(); return; }
            JsonObject j; try (Reader r=Files.newBufferedReader(CONFIG_PATH)) { j=GSON.fromJson(r,JsonObject.class); }
            if (j==null) j=new JsonObject();
            enableTerracottaVariants=getOrDefault(j,"enableTerracottaVariants",true);
            enableConcreteVariants=getOrDefault(j,"enableConcreteVariants",true);
            enableTuffBrickPillar=getOrDefault(j,"enableTuffBrickPillar",false);
            enableReworkedDeepslateRecipes=getOrDefault(j,"enableReworkedDeepslateRecipes",true);
            enableCorrectedCobbledDrops=getOrDefault(j,"enableCorrectedCobbledDrops",false);
            doubleSlabsPackDefaultEnabled=getOrDefault(j,"doubleSlabsPackDefaultEnabled",false);
            enableVerticalSlabs=getOrDefault(j,"enableVerticalSlabs",true);
            boolean u=false;
            u|=patch(j,"enableTerracottaVariants",enableTerracottaVariants); u|=patch(j,"enableConcreteVariants",enableConcreteVariants); u|=patch(j,"enableTuffBrickPillar",enableTuffBrickPillar);
            u|=patch(j,"enableReworkedDeepslateRecipes",enableReworkedDeepslateRecipes); u|=patch(j,"enableCorrectedCobbledDrops",enableCorrectedCobbledDrops); u|=patch(j,"doubleSlabsPackDefaultEnabled",doubleSlabsPackDefaultEnabled); u|=patch(j,"enableVerticalSlabs",enableVerticalSlabs);
            if(u) rewrite(j);
        } catch(Exception e) { LOGGER.error("Failed to read config, regenerating defaults",e); generateDefault(); }
    }
    private static void generateDefault() {
        enableTerracottaVariants=true; enableConcreteVariants=true; enableTuffBrickPillar=false; enableReworkedDeepslateRecipes=true; enableCorrectedCobbledDrops=false; doubleSlabsPackDefaultEnabled=false; enableVerticalSlabs=true;
        JsonObject j=new JsonObject(); j.addProperty("enableTerracottaVariants",true); j.addProperty("enableConcreteVariants",true); j.addProperty("enableTuffBrickPillar",false); j.addProperty("enableReworkedDeepslateRecipes",true); j.addProperty("enableCorrectedCobbledDrops",false); j.addProperty("doubleSlabsPackDefaultEnabled",false); j.addProperty("enableVerticalSlabs",true);
        try { Files.createDirectories(CONFIG_PATH.getParent()); rewrite(j); } catch(Exception e) { LOGGER.error("Failed to generate default config",e); }
    }
    private static boolean patch(JsonObject j,String k,boolean v) { if(!j.has(k)){j.addProperty(k,v);return true;} return false; }
    private static void rewrite(JsonObject j) throws IOException { try(Writer w=Files.newBufferedWriter(CONFIG_PATH)){GSON.toJson(j,w);} }
}
