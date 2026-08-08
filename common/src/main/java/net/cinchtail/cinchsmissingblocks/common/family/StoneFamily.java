package net.cinchtail.cinchsmissingblocks.common.family;

import net.cinchtail.cinchsmissingblocks.common.block.BlockSpec;
import net.cinchtail.cinchsmissingblocks.common.recipe.RecipeSpec;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class StoneFamily {
    private final Map<String, BlockSpec> blocksByPath;
    private final List<BlockSpec> blocks;
    private final List<RecipeSpec> recipes;

    StoneFamily(Map<String, BlockSpec> blocksByPath, List<RecipeSpec> recipes) {
        this.blocksByPath = Map.copyOf(new LinkedHashMap<>(blocksByPath));
        this.blocks = List.copyOf(blocksByPath.values());
        this.recipes = List.copyOf(recipes);
    }

    public BlockSpec block(String path) {
        BlockSpec block = blocksByPath.get(path);
        if (block == null) {
            throw new IllegalArgumentException("Unknown block in stone family: " + path);
        }
        return block;
    }

    public List<BlockSpec> blocks() {
        return blocks;
    }

    public List<RecipeSpec> recipes() {
        return recipes;
    }
}
