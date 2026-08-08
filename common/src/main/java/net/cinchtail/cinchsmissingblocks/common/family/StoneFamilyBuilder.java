package net.cinchtail.cinchsmissingblocks.common.family;

import net.cinchtail.cinchsmissingblocks.common.block.BlockKind;
import net.cinchtail.cinchsmissingblocks.common.block.BlockPropertiesSpec;
import net.cinchtail.cinchsmissingblocks.common.block.BlockSpec;
import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;
import net.cinchtail.cinchsmissingblocks.common.loot.LootSpec;
import net.cinchtail.cinchsmissingblocks.common.model.ModelKind;
import net.cinchtail.cinchsmissingblocks.common.model.ModelSpec;
import net.cinchtail.cinchsmissingblocks.common.recipe.RecipeCategorySpec;
import net.cinchtail.cinchsmissingblocks.common.recipe.RecipeKind;
import net.cinchtail.cinchsmissingblocks.common.recipe.RecipeSpec;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class StoneFamilyBuilder {
    private final String name;
    private final ResourceId raw;
    private final Map<String, BlockSpec> blocks = new LinkedHashMap<>();
    private final List<RecipeSpec> recipes = new ArrayList<>();

    private ResourceId polished;
    private ResourceId bricks;
    private ResourceId brickSlab;
    private ResourceId stairBase;

    private StoneFamilyBuilder(String name, ResourceId raw) {
        this.name = Objects.requireNonNull(name, "name");
        this.raw = Objects.requireNonNull(raw, "raw");
        this.stairBase = raw;
    }

    public static StoneFamilyBuilder create(String name, ResourceId raw) {
        return new StoneFamilyBuilder(name, raw);
    }

    public StoneFamilyBuilder stairsBase(ResourceId stairBase) {
        this.stairBase = Objects.requireNonNull(stairBase, "stairBase");
        return this;
    }

    public StoneFamilyBuilder rawShapes(BlockPropertiesSpec properties) {
        addShape(name + "_stairs", BlockKind.STAIRS, properties, ModelKind.STAIRS, raw, LootSpec.self());
        addShape(name + "_slab", BlockKind.SLAB, properties, ModelKind.SLAB, raw, LootSpec.slab());
        addShape(name + "_wall", BlockKind.WALL, properties, ModelKind.WALL, raw, LootSpec.self());

        addShapeRecipes(name + "_stairs", name + "_slab", name + "_wall", raw, List.of(raw));
        return this;
    }

    public StoneFamilyBuilder customPolished(BlockPropertiesSpec properties) {
        String path = "polished_" + name;
        BlockSpec polishedBlock = addBlock(path, BlockKind.SIMPLE, properties, ModelKind.CUBE, ResourceId.mod(path), LootSpec.self(), null);
        polished = polishedBlock.id();

        recipes.add(RecipeSpec.of(RecipeKind.POLISHED, RecipeCategorySpec.BUILDING_BLOCKS, polished, raw));
        recipes.add(RecipeSpec.stonecutting(RecipeCategorySpec.BUILDING_BLOCKS, polished, raw, 1));
        return this;
    }

    public StoneFamilyBuilder existingPolished(ResourceId polished) {
        this.polished = Objects.requireNonNull(polished, "polished");
        return this;
    }

    public StoneFamilyBuilder existingBricks(ResourceId bricks) {
        this.bricks = Objects.requireNonNull(bricks, "bricks");
        return this;
    }

    public StoneFamilyBuilder wall(
            String path,
            BlockPropertiesSpec properties,
            ResourceId craftingInput,
            ResourceId textureSource,
            ModelKind modelKind,
            List<ResourceId> stonecuttingInputs
    ) {
        BlockSpec wall = addShape(path, BlockKind.WALL, properties, modelKind, textureSource, LootSpec.self());
        recipes.add(RecipeSpec.of(RecipeKind.WALL, RecipeCategorySpec.DECORATIONS, wall.id(), craftingInput));
        stonecuttingInputs.forEach(input ->
                recipes.add(RecipeSpec.stonecutting(RecipeCategorySpec.DECORATIONS, wall.id(), input, 1))
        );
        return this;
    }

    public StoneFamilyBuilder polishedShapes(BlockPropertiesSpec properties) {
        ResourceId polishedId = requirePolished();
        String prefix = "polished_" + name;

        addShape(prefix + "_stairs", BlockKind.STAIRS, properties, ModelKind.STAIRS, polishedId, LootSpec.self());
        addShape(prefix + "_slab", BlockKind.SLAB, properties, ModelKind.SLAB, polishedId, LootSpec.slab());
        addShape(prefix + "_wall", BlockKind.WALL, properties, ModelKind.WALL, polishedId, LootSpec.self());

        addShapeRecipes(
                prefix + "_stairs",
                prefix + "_slab",
                prefix + "_wall",
                polishedId,
                List.of(raw, polishedId)
        );
        return this;
    }

    public StoneFamilyBuilder polishedWall(BlockPropertiesSpec properties) {
        ResourceId polishedId = requirePolished();
        String path = "polished_" + name + "_wall";
        BlockSpec wall = addShape(path, BlockKind.WALL, properties, ModelKind.WALL, polishedId, LootSpec.self());

        recipes.add(RecipeSpec.of(RecipeKind.WALL, RecipeCategorySpec.DECORATIONS, wall.id(), polishedId));
        recipes.add(RecipeSpec.stonecutting(RecipeCategorySpec.DECORATIONS, wall.id(), raw, 1));
        recipes.add(RecipeSpec.stonecutting(RecipeCategorySpec.DECORATIONS, wall.id(), polishedId, 1));
        return this;
    }

    public StoneFamilyBuilder bricks(BlockPropertiesSpec properties) {
        ResourceId polishedId = requirePolished();
        String blockPath = name + "_bricks";
        BlockSpec brickBlock = addBlock(blockPath, BlockKind.SIMPLE, properties, ModelKind.CUBE, ResourceId.mod(blockPath), LootSpec.self(), null);
        bricks = brickBlock.id();

        String stairsPath = name + "_brick_stairs";
        String slabPath = name + "_brick_slab";
        String wallPath = name + "_brick_wall";
        addShape(stairsPath, BlockKind.STAIRS, properties, ModelKind.STAIRS, bricks, LootSpec.self());
        addShape(slabPath, BlockKind.SLAB, properties, ModelKind.SLAB, bricks, LootSpec.slab());
        addShape(wallPath, BlockKind.WALL, properties, ModelKind.WALL, bricks, LootSpec.self());
        brickSlab = ResourceId.mod(slabPath);

        recipes.add(RecipeSpec.of(RecipeKind.BRICKS, RecipeCategorySpec.BUILDING_BLOCKS, bricks, polishedId));
        recipes.add(RecipeSpec.stonecutting(RecipeCategorySpec.BUILDING_BLOCKS, bricks, raw, 1));
        recipes.add(RecipeSpec.stonecutting(RecipeCategorySpec.BUILDING_BLOCKS, bricks, polishedId, 1));

        addShapeRecipes(stairsPath, slabPath, wallPath, bricks, List.of(raw, polishedId, bricks));
        return this;
    }

    public StoneFamilyBuilder brickShapes(BlockPropertiesSpec properties, List<ResourceId> stonecuttingInputs) {
        ResourceId brickId = requireBricks();
        String stairsPath = name + "_brick_stairs";
        String slabPath = name + "_brick_slab";
        String wallPath = name + "_brick_wall";

        addShape(stairsPath, BlockKind.STAIRS, properties, ModelKind.STAIRS, brickId, LootSpec.self());
        addShape(slabPath, BlockKind.SLAB, properties, ModelKind.SLAB, brickId, LootSpec.slab());
        addShape(wallPath, BlockKind.WALL, properties, ModelKind.WALL, brickId, LootSpec.self());
        brickSlab = ResourceId.mod(slabPath);

        addShapeRecipes(stairsPath, slabPath, wallPath, brickId, stonecuttingInputs);
        return this;
    }

    public StoneFamilyBuilder crackedBricks(BlockPropertiesSpec blockProperties, BlockPropertiesSpec shapeProperties) {
        ResourceId brickId = requireBricks();
        String blockPath = "cracked_" + name + "_bricks";
        BlockSpec cracked = addBlock(blockPath, BlockKind.SIMPLE, blockProperties, ModelKind.CUBE, ResourceId.mod(blockPath), LootSpec.self(), null);

        String stairsPath = "cracked_" + name + "_brick_stairs";
        String slabPath = "cracked_" + name + "_brick_slab";
        String wallPath = "cracked_" + name + "_brick_wall";
        addShape(stairsPath, BlockKind.STAIRS, shapeProperties, ModelKind.STAIRS, cracked.id(), LootSpec.self());
        addShape(slabPath, BlockKind.SLAB, shapeProperties, ModelKind.SLAB, cracked.id(), LootSpec.slab());
        addShape(wallPath, BlockKind.WALL, shapeProperties, ModelKind.WALL, cracked.id(), LootSpec.self());

        recipes.add(RecipeSpec.of(RecipeKind.SMELTING, RecipeCategorySpec.BUILDING_BLOCKS, cracked.id(), brickId));
        addShapeRecipes(stairsPath, slabPath, wallPath, cracked.id(), List.of(cracked.id()));
        return this;
    }

    public StoneFamilyBuilder mossyBricks(BlockPropertiesSpec blockProperties, BlockPropertiesSpec shapeProperties) {
        ResourceId brickId = requireBricks();
        String blockPath = "mossy_" + name + "_bricks";
        BlockSpec mossy = addBlock(blockPath, BlockKind.SIMPLE, blockProperties, ModelKind.CUBE, ResourceId.mod(blockPath), LootSpec.self(), null);

        String stairsPath = "mossy_" + name + "_brick_stairs";
        String slabPath = "mossy_" + name + "_brick_slab";
        String wallPath = "mossy_" + name + "_brick_wall";
        addShape(stairsPath, BlockKind.STAIRS, shapeProperties, ModelKind.STAIRS, mossy.id(), LootSpec.self());
        addShape(slabPath, BlockKind.SLAB, shapeProperties, ModelKind.SLAB, mossy.id(), LootSpec.slab());
        addShape(wallPath, BlockKind.WALL, shapeProperties, ModelKind.WALL, mossy.id(), LootSpec.self());

        recipes.add(RecipeSpec.of(RecipeKind.MOSSY_FROM_MOSS_BLOCK, RecipeCategorySpec.BUILDING_BLOCKS, mossy.id(), brickId));
        recipes.add(RecipeSpec.of(RecipeKind.MOSSY_FROM_VINE, RecipeCategorySpec.BUILDING_BLOCKS, mossy.id(), brickId));
        recipes.add(RecipeSpec.of(RecipeKind.MOSSY_FROM_MOSS_CARPET, RecipeCategorySpec.BUILDING_BLOCKS, mossy.id(), brickId));
        addShapeRecipes(stairsPath, slabPath, wallPath, mossy.id(), List.of(mossy.id()));
        return this;
    }

    public StoneFamilyBuilder chiseled(BlockPropertiesSpec properties, ModelKind modelKind) {
        ResourceId polishedId = requirePolished();
        ResourceId brickId = requireBricks();
        if (brickSlab == null) {
            throw new IllegalStateException("Brick slab must exist before chiseled " + name);
        }

        String path = "chiseled_" + name + "_bricks";
        BlockSpec chiseled = addBlock(path, BlockKind.SIMPLE, properties, modelKind, ResourceId.mod(path), LootSpec.self(), null);

        recipes.add(RecipeSpec.of(RecipeKind.CHISELED, RecipeCategorySpec.BUILDING_BLOCKS, chiseled.id(), brickSlab));
        recipes.add(RecipeSpec.stonecutting(RecipeCategorySpec.BUILDING_BLOCKS, chiseled.id(), raw, 1));
        recipes.add(RecipeSpec.stonecutting(RecipeCategorySpec.BUILDING_BLOCKS, chiseled.id(), polishedId, 1));
        recipes.add(RecipeSpec.stonecutting(RecipeCategorySpec.BUILDING_BLOCKS, chiseled.id(), brickId, 1));
        return this;
    }

    public StoneFamilyBuilder pillar(BlockPropertiesSpec properties) {
        ResourceId polishedId = requirePolished();
        ResourceId brickId = requireBricks();
        String path = name + "_brick_pillar";
        BlockSpec pillar = addBlock(path, BlockKind.PILLAR, properties, ModelKind.PILLAR, ResourceId.mod(path), LootSpec.self(), null);

        recipes.add(RecipeSpec.of(RecipeKind.PILLAR, RecipeCategorySpec.BUILDING_BLOCKS, pillar.id(), brickId));
        recipes.add(RecipeSpec.stonecutting(RecipeCategorySpec.BUILDING_BLOCKS, pillar.id(), raw, 1));
        recipes.add(RecipeSpec.stonecutting(RecipeCategorySpec.BUILDING_BLOCKS, pillar.id(), polishedId, 1));
        recipes.add(RecipeSpec.stonecutting(RecipeCategorySpec.BUILDING_BLOCKS, pillar.id(), brickId, 1));
        return this;
    }

    public StoneFamilyBuilder overrideProperties(String path, BlockPropertiesSpec properties) {
        BlockSpec current = requireBlock(path);
        blocks.put(path, BlockSpec.of(
                current.id(),
                current.kind(),
                current.baseBlock().orElse(null),
                properties,
                current.loot(),
                current.model()
        ));
        return this;
    }

    public StoneFamily build() {
        return new StoneFamily(blocks, recipes);
    }

    private void addShapeRecipes(
            String stairsPath,
            String slabPath,
            String wallPath,
            ResourceId craftingInput,
            List<ResourceId> stonecuttingInputs
    ) {
        ResourceId stairs = requireBlock(stairsPath).id();
        ResourceId slab = requireBlock(slabPath).id();
        ResourceId wall = requireBlock(wallPath).id();

        recipes.add(RecipeSpec.of(RecipeKind.STAIRS, RecipeCategorySpec.BUILDING_BLOCKS, stairs, craftingInput));
        stonecuttingInputs.forEach(input -> recipes.add(RecipeSpec.stonecutting(RecipeCategorySpec.BUILDING_BLOCKS, stairs, input, 1)));

        recipes.add(RecipeSpec.of(RecipeKind.SLAB, RecipeCategorySpec.BUILDING_BLOCKS, slab, craftingInput));
        stonecuttingInputs.forEach(input -> recipes.add(RecipeSpec.stonecutting(RecipeCategorySpec.BUILDING_BLOCKS, slab, input, 2)));

        recipes.add(RecipeSpec.of(RecipeKind.WALL, RecipeCategorySpec.DECORATIONS, wall, craftingInput));
        stonecuttingInputs.forEach(input -> recipes.add(RecipeSpec.stonecutting(RecipeCategorySpec.DECORATIONS, wall, input, 1)));
    }

    private BlockSpec addShape(
            String path,
            BlockKind kind,
            BlockPropertiesSpec properties,
            ModelKind modelKind,
            ResourceId textureSource,
            LootSpec loot
    ) {
        ResourceId baseBlock = kind == BlockKind.STAIRS ? stairBase : null;
        return addBlock(path, kind, properties, modelKind, textureSource, loot, baseBlock);
    }

    private BlockSpec addBlock(
            String path,
            BlockKind kind,
            BlockPropertiesSpec properties,
            ModelKind modelKind,
            ResourceId textureSource,
            LootSpec loot,
            ResourceId baseBlock
    ) {
        if (blocks.containsKey(path)) {
            throw new IllegalArgumentException("Duplicate block in stone family: " + path);
        }

        BlockSpec block = BlockSpec.of(
                ResourceId.mod(path),
                kind,
                baseBlock,
                properties,
                loot,
                new ModelSpec(modelKind, textureSource)
        );
        blocks.put(path, block);
        return block;
    }

    private BlockSpec requireBlock(String path) {
        BlockSpec block = blocks.get(path);
        if (block == null) {
            throw new IllegalStateException("Missing block in " + name + " family: " + path);
        }
        return block;
    }

    private ResourceId requirePolished() {
        if (polished == null) {
            throw new IllegalStateException("Polished source is not configured for " + name);
        }
        return polished;
    }

    private ResourceId requireBricks() {
        if (bricks == null) {
            throw new IllegalStateException("Bricks are not configured for " + name);
        }
        return bricks;
    }
}
