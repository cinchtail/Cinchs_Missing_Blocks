package net.cinchtail.cinchsmissingblocks.fabriccommon.datagen;

import net.cinchtail.cinchsmissingblocks.common.block.BlockSpec;
import net.cinchtail.cinchsmissingblocks.common.catalog.ContentCatalog;
import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;
import net.cinchtail.cinchsmissingblocks.common.item.ItemSpec;
import net.cinchtail.cinchsmissingblocks.common.loot.LootKind;
import net.cinchtail.cinchsmissingblocks.common.model.ModelKind;
import net.cinchtail.cinchsmissingblocks.common.recipe.RecipeKind;
import net.cinchtail.cinchsmissingblocks.common.recipe.RecipeSpec;
import net.cinchtail.cinchsmissingblocks.fabriccommon.version.FabricVersionProfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Generates the common block assets/data without linking against a Minecraft datagen API.
 * The profile only changes resource paths and JSON shapes that changed between game versions.
 */
public final class FabricDataGeneratorMain {
    private static final String MOD_ID = "cinchsmissingblocks";

    private final FabricVersionProfile profile;
    private final Path output;
    private final ContentCatalog catalog;

    private FabricDataGeneratorMain(FabricVersionProfile profile, Path output) {
        this.profile = profile;
        this.output = output;
        this.catalog = profile.catalog();
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException("Usage: FabricDataGeneratorMain <profile enum> <output directory>");
        }
        FabricVersionProfile profile = FabricVersionProfile.valueOf(args[0]);
        Path output = Path.of(args[1]).toAbsolutePath().normalize();
        deleteTree(output);
        new FabricDataGeneratorMain(profile, output).generate();
        System.out.printf("Generated CMB data for %s: %d blocks, %d items, %d recipes%n",
                profile.minecraftVersion(), profile.catalog().blocks().size(), profile.catalog().items().size(), profile.catalog().recipes().size());
    }

    private void generate() throws IOException {
        for (BlockSpec block : catalog.blocks()) {
            generateBlockAssets(block);
            writeLoot(block);
        }
        for (ItemSpec item : catalog.items()) {
            generateItemAsset(item.id(), MOD_ID + ":item/" + item.id().path());
            writeJson(asset("models/item/" + item.id().path() + ".json"), map(
                    "parent", "minecraft:item/generated",
                    "textures", map("layer0", MOD_ID + ":item/" + item.id().path())
            ));
        }
        for (RecipeSpec recipe : catalog.recipes()) {
            writeRecipe(recipe);
            writeRecipeAdvancement(recipe);
        }
    }

    private void generateBlockAssets(BlockSpec spec) throws IOException {
        ResourceId id = spec.id();
        String model = id.namespace() + ":block/" + id.path();
        String source = texture(spec.model().textureSource());

        switch (spec.model().kind()) {
            case CUBE -> {
                simpleBlockState(id, model);
                writeJson(blockModel(id.path()), map("parent", "minecraft:block/cube_all", "textures", map("all", source)));
                generateItemAsset(id, model);
            }
            case STAIRS -> {
                stairsBlockState(id);
                texturedModel(id.path(), "minecraft:block/stairs", source, "bottom", "side", "top");
                texturedModel(id.path() + "_inner", "minecraft:block/inner_stairs", source, "bottom", "side", "top");
                texturedModel(id.path() + "_outer", "minecraft:block/outer_stairs", source, "bottom", "side", "top");
                generateItemAsset(id, model);
            }
            case SLAB -> {
                slabBlockState(spec);
                texturedModel(id.path(), "minecraft:block/slab", source, "bottom", "side", "top");
                texturedModel(id.path() + "_top", "minecraft:block/slab_top", source, "bottom", "side", "top");
                generateItemAsset(id, model);
            }
            case WALL, WALL_CUSTOM_SIDE, WALL_CUSTOM_TOP, WALL_CUSTOM_BOTTOM -> {
                wallBlockState(id);
                String suffix = switch (spec.model().kind()) {
                    case WALL_CUSTOM_SIDE -> "_side";
                    case WALL_CUSTOM_TOP -> "_top";
                    case WALL_CUSTOM_BOTTOM -> "_bottom";
                    default -> "";
                };
                String wallTexture = source + suffix;
                texturedModel(id.path() + "_post", "minecraft:block/template_wall_post", wallTexture, "wall");
                texturedModel(id.path() + "_side", "minecraft:block/template_wall_side", wallTexture, "wall");
                texturedModel(id.path() + "_side_tall", "minecraft:block/template_wall_side_tall", wallTexture, "wall");
                texturedModel(id.path() + "_inventory", "minecraft:block/wall_inventory", wallTexture, "wall");
                generateItemAsset(id, id.namespace() + ":block/" + id.path() + "_inventory");
            }
            case CUBE_COLUMN -> {
                simpleBlockState(id, model);
                columnModel(id.path(), source + "_side", source + "_top");
                generateItemAsset(id, model);
            }
            case PILLAR -> {
                axisBlockState(id);
                columnModel(id.path(), source + "_side", source + "_top");
                generateItemAsset(id, model);
            }
            case FENCE -> {
                fenceBlockState(id);
                texturedModel(id.path() + "_post", "minecraft:block/fence_post", source, "texture");
                texturedModel(id.path() + "_side", "minecraft:block/fence_side", source, "texture");
                texturedModel(id.path() + "_inventory", "minecraft:block/fence_inventory", source, "texture");
                generateItemAsset(id, id.namespace() + ":block/" + id.path() + "_inventory");
            }
            case PRESSURE_PLATE -> {
                pressurePlateBlockState(id);
                texturedModel(id.path(), "minecraft:block/pressure_plate_up", source, "texture");
                texturedModel(id.path() + "_down", "minecraft:block/pressure_plate_down", source, "texture");
                generateItemAsset(id, model);
            }
            case BUTTON -> {
                buttonBlockState(id);
                texturedModel(id.path(), "minecraft:block/button", source, "texture");
                texturedModel(id.path() + "_pressed", "minecraft:block/button_pressed", source, "texture");
                texturedModel(id.path() + "_inventory", "minecraft:block/button_inventory", source, "texture");
                generateItemAsset(id, id.namespace() + ":block/" + id.path() + "_inventory");
            }
            case PREBUILT_BLOCK_ITEM -> generateItemAsset(id, model);
            case PREBUILT_ITEM -> {
                if (profile.modernItemDefinitions()) {
                    generateItemAsset(id, id.namespace() + ":item/" + id.path());
                }
            }
            case PREBUILT_WALL_ITEM -> generateItemAsset(id, id.namespace() + ":block/" + id.path() + "_inventory");
        }
    }

    private void simpleBlockState(ResourceId id, String model) throws IOException {
        writeJson(blockState(id), map("variants", map("", map("model", model))));
    }

    private void stairsBlockState(ResourceId id) throws IOException {
        Map<String, Object> variants = new LinkedHashMap<>();
        String regular = id.namespace() + ":block/" + id.path();
        String inner = regular + "_inner";
        String outer = regular + "_outer";
        String[] facings = {"east", "north", "south", "west"};
        String[] shapes = {"inner_left", "inner_right", "outer_left", "outer_right", "straight"};
        int[][] bottomY = {
                {270, 0, 270, 0, 0},
                {180, 270, 180, 270, 270},
                {0, 90, 0, 90, 90},
                {90, 180, 90, 180, 180}
        };
        int[][] topY = {
                {0, 90, 0, 90, 0},
                {270, 0, 270, 0, 270},
                {90, 180, 90, 180, 90},
                {180, 270, 180, 270, 180}
        };
        for (int f = 0; f < facings.length; f++) {
            for (int s = 0; s < shapes.length; s++) {
                String model = shapes[s].startsWith("inner") ? inner : shapes[s].startsWith("outer") ? outer : regular;
                variants.put("facing=" + facings[f] + ",half=bottom,shape=" + shapes[s], variant(model, 0, bottomY[f][s], bottomY[f][s] != 0));
                variants.put("facing=" + facings[f] + ",half=top,shape=" + shapes[s], variant(model, 180, topY[f][s], true));
            }
        }
        writeJson(blockState(id), map("variants", variants));
    }

    private void slabBlockState(BlockSpec spec) throws IOException {
        ResourceId id = spec.id();
        String model = id.namespace() + ":block/" + id.path();
        ResourceId doubleSource = spec.model().textureSource();
        String doubleModel = doubleSource.namespace() + ":block/" + doubleSource.path();
        writeJson(blockState(id), map("variants", map(
                "type=bottom", map("model", model),
                "type=double", map("model", doubleModel),
                "type=top", map("model", model + "_top")
        )));
    }

    private void wallBlockState(ResourceId id) throws IOException {
        String base = id.namespace() + ":block/" + id.path();
        List<Object> multipart = new ArrayList<>();
        multipart.add(map("apply", map("model", base + "_post"), "when", map("up", "true")));
        String[] dirs = {"north", "east", "south", "west"};
        int[] rotations = {0, 90, 180, 270};
        for (int i = 0; i < dirs.length; i++) {
            multipart.add(map("apply", rotated(base + "_side", rotations[i], true), "when", map(dirs[i], "low")));
        }
        for (int i = 0; i < dirs.length; i++) {
            multipart.add(map("apply", rotated(base + "_side_tall", rotations[i], true), "when", map(dirs[i], "tall")));
        }
        writeJson(blockState(id), map("multipart", multipart));
    }

    private void axisBlockState(ResourceId id) throws IOException {
        String model = id.namespace() + ":block/" + id.path();
        writeJson(blockState(id), map("variants", map(
                "axis=x", variant(model, 90, 90, false),
                "axis=y", map("model", model),
                "axis=z", variant(model, 90, 0, false)
        )));
    }

    private void fenceBlockState(ResourceId id) throws IOException {
        String base = id.namespace() + ":block/" + id.path();
        List<Object> multipart = new ArrayList<>();
        multipart.add(map("apply", map("model", base + "_post")));
        String[] dirs = {"north", "east", "south", "west"};
        int[] rotations = {0, 90, 180, 270};
        for (int i = 0; i < dirs.length; i++) {
            multipart.add(map("apply", rotated(base + "_side", rotations[i], true), "when", map(dirs[i], "true")));
        }
        writeJson(blockState(id), map("multipart", multipart));
    }

    private void pressurePlateBlockState(ResourceId id) throws IOException {
        String base = id.namespace() + ":block/" + id.path();
        writeJson(blockState(id), map("variants", map(
                "powered=false", map("model", base),
                "powered=true", map("model", base + "_down")
        )));
    }

    private void buttonBlockState(ResourceId id) throws IOException {
        String base = id.namespace() + ":block/" + id.path();
        Map<String, Object> variants = new LinkedHashMap<>();
        String[] faces = {"ceiling", "floor", "wall"};
        String[] facings = {"east", "north", "south", "west"};
        for (String face : faces) {
            for (String facing : facings) {
                for (boolean powered : new boolean[]{false, true}) {
                    int x = 0, y = 0;
                    boolean uv = false;
                    if (face.equals("ceiling")) {
                        x = 180;
                        y = switch (facing) { case "east" -> 270; case "north" -> 180; case "south" -> 0; default -> 90; };
                    } else if (face.equals("floor")) {
                        y = switch (facing) { case "east" -> 90; case "north" -> 0; case "south" -> 180; default -> 270; };
                    } else {
                        x = 90;
                        y = switch (facing) { case "east" -> 90; case "north" -> 0; case "south" -> 180; default -> 270; };
                        uv = true;
                    }
                    String model = powered ? base + "_pressed" : base;
                    variants.put("face=" + face + ",facing=" + facing + ",powered=" + powered, variant(model, x, y, uv));
                }
            }
        }
        writeJson(blockState(id), map("variants", variants));
    }

    private void texturedModel(String name, String parent, String texture, String... slots) throws IOException {
        Map<String, Object> textures = new LinkedHashMap<>();
        for (String slot : slots) textures.put(slot, texture);
        writeJson(blockModel(name), map("parent", parent, "textures", textures));
    }

    private void columnModel(String name, String side, String end) throws IOException {
        writeJson(blockModel(name), map("parent", "minecraft:block/cube_column", "textures", map("end", end, "side", side)));
    }

    private void generateItemAsset(ResourceId id, String model) throws IOException {
        if (profile.modernItemDefinitions()) {
            writeJson(asset("items/" + id.path() + ".json"), map("model", map("type", "minecraft:model", "model", model)));
        } else {
            writeJson(asset("models/item/" + id.path() + ".json"), map("parent", model));
        }
    }

    private void writeLoot(BlockSpec block) throws IOException {
        Object json = switch (block.loot().kind()) {
            case SELF -> selfLoot(block.id());
            case SLAB -> slabLoot(block.id());
            case SILK_TOUCH -> silkTouchLoot(block.id());
            case SNOWBALLS_OR_SELF -> snowLoot(block.id());
            case SNOWBALL_SLAB -> snowSlabLoot(block.id());
        };
        writeJson(data(MOD_ID + "/" + profile.lootTableDirectory() + "/blocks/" + block.id().path() + ".json"), json);
    }

    private Object selfLoot(ResourceId id) {
        return map("type", "minecraft:block", "pools", list(map(
                "conditions", list(map("condition", "minecraft:survives_explosion")),
                "entries", list(map("type", "minecraft:item", "name", id.toString())),
                "rolls", 1.0
        )));
    }

    private Object slabLoot(ResourceId id) {
        return map("type", "minecraft:block", "pools", list(map(
                "entries", list(map(
                        "type", "minecraft:item",
                        "functions", list(
                                map("conditions", list(blockStateCondition(id, "type", "double")), "count", 2.0, "function", "minecraft:set_count"),
                                map("function", "minecraft:explosion_decay")
                        ),
                        "name", id.toString()
                )),
                "rolls", 1.0
        )));
    }

    private Object silkTouchLoot(ResourceId id) {
        return map("type", "minecraft:block", "pools", list(map(
                "conditions", list(silkTouchCondition()),
                "entries", list(map("type", "minecraft:item", "name", id.toString())),
                "rolls", 1.0
        )));
    }

    private Object snowLoot(ResourceId id) {
        return map("type", "minecraft:block", "pools", list(map(
                "entries", list(map("type", "minecraft:alternatives", "children", list(
                        map("type", "minecraft:item", "conditions", list(silkTouchCondition()), "name", id.toString()),
                        map("type", "minecraft:item", "functions", list(map("count", 4.0, "function", "minecraft:set_count"), map("function", "minecraft:explosion_decay")), "name", "minecraft:snowball")
                ))),
                "rolls", 1.0
        )));
    }

    private Object snowSlabLoot(ResourceId id) {
        Object silk = silkTouchCondition();
        Object invertedSilk = map("condition", "minecraft:inverted", "term", silkTouchCondition());
        return map("type", "minecraft:block", "pools", list(map(
                "entries", list(map("type", "minecraft:alternatives", "children", list(
                        map("type", "minecraft:item", "conditions", list(silk, blockStateCondition(id, "type", "double")), "functions", list(map("count", 2.0, "function", "minecraft:set_count")), "name", id.toString()),
                        map("type", "minecraft:item", "conditions", list(silkTouchCondition()), "name", id.toString()),
                        map("type", "minecraft:item", "conditions", list(invertedSilk, blockStateCondition(id, "type", "double")), "functions", list(map("count", 4.0, "function", "minecraft:set_count"), map("function", "minecraft:explosion_decay")), "name", "minecraft:snowball"),
                        map("type", "minecraft:item", "conditions", list(map("condition", "minecraft:inverted", "term", silkTouchCondition())), "functions", list(map("count", 2.0, "function", "minecraft:set_count"), map("function", "minecraft:explosion_decay")), "name", "minecraft:snowball")
                ))),
                "rolls", 1.0
        )));
    }

    private Object silkTouchCondition() {
        if (profile.legacyItemPredicates()) {
            return map("condition", "minecraft:match_tool", "predicate", map("enchantments", list(map(
                    "enchantment", "minecraft:silk_touch", "levels", map("min", 1)
            ))));
        }
        return map("condition", "minecraft:match_tool", "predicate", map("predicates", map(
                "minecraft:enchantments", list(map("enchantments", "minecraft:silk_touch", "levels", map("min", 1)))
        )));
    }

    private Object blockStateCondition(ResourceId id, String property, String value) {
        return map("block", id.toString(), "condition", "minecraft:block_state_property", "properties", map(property, value));
    }

    private void writeRecipe(RecipeSpec recipe) throws IOException {
        String id = recipeId(recipe);
        Object json = switch (recipe.kind()) {
            case STAIRS -> shaped(recipe, list("#  ", "## ", "###"), rmap("#", recipe.input()), recipe.count() == 1 ? 4 : recipe.count());
            case SLAB -> shaped(recipe, list("###"), rmap("#", recipe.input()), recipe.count() == 1 ? 6 : recipe.count());
            case WALL -> shaped(recipe, list("###", "###"), rmap("#", recipe.input()), recipe.count() == 1 ? 6 : recipe.count());
            case POLISHED, BRICKS -> shaped(recipe, list("##", "##"), rmap("#", recipe.input()), recipe.count() == 1 ? 4 : recipe.count());
            case CHISELED -> shaped(recipe, list("#", "#"), rmap("#", recipe.input()), recipe.count());
            case PILLAR -> shaped(recipe, list("#", "#"), rmap("#", recipe.input()), recipe.count() == 1 ? 2 : recipe.count());
            case STONECUTTING -> stonecutting(recipe);
            case SMELTING -> smelting(recipe);
            case MOSSY_FROM_MOSS_BLOCK -> shapeless(recipe, list(recipe.input(), ResourceId.minecraft("moss_block")), recipe.count());
            case MOSSY_FROM_VINE -> shapeless(recipe, list(recipe.input(), ResourceId.minecraft("vine")), recipe.count());
            case MOSSY_FROM_CUSTOM -> shapeless(recipe, list(recipe.input(), recipe.secondaryInput().orElseThrow()), recipe.count());
            case MOSSY_FROM_MOSS_CARPET -> shaped(recipe, list("#", "M", "#"), rmap("#", recipe.input(), "M", ResourceId.minecraft("moss_carpet")), recipe.count());
            case MOSSY_FROM_CUSTOM_CARPET -> shaped(recipe, list("#", "M", "#"), rmap("#", recipe.input(), "M", recipe.secondaryInput().orElseThrow()), recipe.count());
            case NETHER_BRICK_FENCE -> shaped(recipe, list("#I#", "#I#"), rmap("#", recipe.input(), "I", recipe.secondaryInput().orElse(ResourceId.minecraft("nether_brick"))), recipe.count() == 1 ? 6 : recipe.count());
            case PRESSURE_PLATE -> shaped(recipe, list("##"), rmap("#", recipe.input()), recipe.count());
            case BUTTON -> shapeless(recipe, list(recipe.input()), recipe.count());
            case CHECKER_2X2 -> shaped(recipe, list("AB", "BA"), rmap("A", recipe.input(), "B", recipe.secondaryInput().orElseThrow()), recipe.count());
            case SQUARE_2X2 -> shaped(recipe, list("##", "##"), rmap("#", recipe.input()), recipe.count());
            case VERTICAL_SANDWICH -> shaped(recipe, list("A", "B", "A"), rmap("A", recipe.input(), "B", recipe.secondaryInput().orElseThrow()), recipe.count());
            case STAINED_GLASS_PANE -> shaped(recipe, list("###", "###"), rmap("#", recipe.input()), recipe.count() == 1 ? 16 : recipe.count());
        };
        writeJson(data(MOD_ID + "/" + profile.recipeDirectory() + "/" + id + ".json"), json);
    }


    private void writeRecipeAdvancement(RecipeSpec recipe) throws IOException {
        String id = recipeId(recipe);
        ResourceId triggerItem = recipe.input();
        String criterionName = "has_" + triggerItem.path();
        String recipeId = MOD_ID + ":" + id;

        Object itemPredicate = profile.legacyItemPredicates()
                ? map("items", list(triggerItem.toString()))
                : map("items", triggerItem.toString());

        Object advancement = map(
                "parent", "minecraft:recipes/root",
                "criteria", map(
                        criterionName, map(
                                "conditions", map("items", list(itemPredicate)),
                                "trigger", "minecraft:inventory_changed"
                        ),
                        "has_the_recipe", map(
                                "conditions", map("recipe", recipeId),
                                "trigger", "minecraft:recipe_unlocked"
                        )
                ),
                "requirements", list(list("has_the_recipe", criterionName)),
                "rewards", map("recipes", list(recipeId))
        );

        writeJson(data(MOD_ID + "/" + profile.advancementDirectory() + "/recipes/" + category(recipe) + "/" + id + ".json"), advancement);
    }

    private Object shaped(RecipeSpec recipe, List<Object> pattern, Map<String, ResourceId> keys, int count) {
        Map<String, Object> keyJson = new LinkedHashMap<>();
        keys.forEach((key, id) -> keyJson.put(key, ingredient(id)));
        return map(
                "type", "minecraft:crafting_shaped",
                "category", category(recipe),
                "key", keyJson,
                "pattern", pattern,
                "result", result(recipe.result(), count)
        );
    }

    private Object shapeless(RecipeSpec recipe, List<ResourceId> ingredients, int count) {
        return map(
                "type", "minecraft:crafting_shapeless",
                "category", category(recipe),
                "ingredients", ingredients.stream().map(this::ingredient).toList(),
                "result", result(recipe.result(), count)
        );
    }

    private Object stonecutting(RecipeSpec recipe) {
        return map(
                "type", "minecraft:stonecutting",
                "ingredient", ingredient(recipe.input()),
                "result", profile.resultUsesId() ? map("id", recipe.result().toString(), "count", recipe.count()) : recipe.result().toString(),
                "count", profile.resultUsesId() ? null : recipe.count()
        ).entrySet().stream().filter(e -> e.getValue() != null).collect(
                LinkedHashMap::new, (m,e) -> m.put(e.getKey(),e.getValue()), LinkedHashMap::putAll
        );
    }

    private Object smelting(RecipeSpec recipe) {
        return map(
                "type", "minecraft:smelting",
                "category", category(recipe),
                "cookingtime", 200,
                "experience", 0.1,
                "ingredient", ingredient(recipe.input()),
                "result", profile.resultUsesId() ? map("id", recipe.result().toString()) : recipe.result().toString()
        );
    }

    private Object ingredient(ResourceId id) {
        if (profile.directIngredientIds()) return id.toString();
        return map("item", id.toString());
    }

    private Object result(ResourceId id, int count) {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put(profile.resultUsesId() ? "id" : "item", id.toString());
        if (count != 1) result.put("count", count);
        return result;
    }

    private String recipeId(RecipeSpec recipe) {
        if (recipe.kind() == RecipeKind.STONECUTTING) {
            long sameResult = catalog.recipes().stream()
                    .filter(other -> other.kind() == RecipeKind.STONECUTTING)
                    .filter(other -> other.result().equals(recipe.result()))
                    .count();
            return recipe.result().path() + "_sc" + (sameResult > 1 ? "_" + recipe.input().path() : "");
        }
        if (recipe.kind() == RecipeKind.SMELTING) {
            return recipe.result().path() + "_sm";
        }
        return switch (recipe.kind()) {
            case MOSSY_FROM_MOSS_BLOCK -> recipe.result().path() + "_from_moss_block";
            case MOSSY_FROM_VINE -> recipe.result().path() + "_from_vine";
            case MOSSY_FROM_MOSS_CARPET -> recipe.result().path() + "_from_moss_carpet";
            case MOSSY_FROM_CUSTOM -> recipe.result().path() + "_from_" + recipe.secondaryInput().orElseThrow().path();
            case MOSSY_FROM_CUSTOM_CARPET -> recipe.result().path() + "_from_" + recipe.secondaryInput().orElseThrow().path();
            default -> recipe.result().path();
        };
    }

    private String category(RecipeSpec recipe) {
        return recipe.category().name().toLowerCase();
    }

    private String texture(ResourceId id) {
        return id.namespace() + ":block/" + id.path();
    }

    private Path blockState(ResourceId id) { return asset("blockstates/" + id.path() + ".json"); }
    private Path blockModel(String name) { return asset("models/block/" + name + ".json"); }
    private Path asset(String relative) { return output.resolve("assets").resolve(MOD_ID).resolve(relative); }
    private Path data(String relative) { return output.resolve("data").resolve(relative); }

    private void writeJson(Path path, Object value) throws IOException {
        Files.createDirectories(path.getParent());
        Files.writeString(path, JsonWriter.write(value));
    }

    private static Map<String, Object> variant(String model, int x, int y, boolean uvlock) {
        Map<String, Object> out = new LinkedHashMap<>();
        out.put("model", model);
        if (uvlock) out.put("uvlock", true);
        if (x != 0) out.put("x", x);
        if (y != 0) out.put("y", y);
        return out;
    }

    private static Map<String, Object> rotated(String model, int y, boolean uvlock) {
        return variant(model, 0, y, uvlock);
    }

    private static Map<String, Object> map(Object... values) {
        Map<String, Object> map = new LinkedHashMap<>();
        for (int i = 0; i < values.length; i += 2) map.put((String) values[i], values[i + 1]);
        return map;
    }

    private static Map<String, ResourceId> rmap(Object... values) {
        Map<String, ResourceId> map = new LinkedHashMap<>();
        for (int i = 0; i < values.length; i += 2) map.put((String) values[i], (ResourceId) values[i + 1]);
        return map;
    }

    @SafeVarargs
    private static <T> List<T> list(T... values) { return List.of(values); }

    private static void deleteTree(Path root) throws IOException {
        if (!Files.exists(root)) return;
        try (var paths = Files.walk(root)) {
            for (Path path : paths.sorted((a, b) -> b.getNameCount() - a.getNameCount()).toList()) Files.delete(path);
        }
    }
}
