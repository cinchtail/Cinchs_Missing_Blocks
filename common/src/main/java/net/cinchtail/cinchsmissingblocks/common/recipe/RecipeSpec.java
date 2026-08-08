package net.cinchtail.cinchsmissingblocks.common.recipe;

import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;

import java.util.Objects;
import java.util.Optional;

public record RecipeSpec(
        RecipeKind kind,
        RecipeCategorySpec category,
        ResourceId result,
        ResourceId input,
        Optional<ResourceId> secondaryInput,
        int count
) {
    public RecipeSpec {
        Objects.requireNonNull(kind, "kind");
        Objects.requireNonNull(category, "category");
        Objects.requireNonNull(result, "result");
        Objects.requireNonNull(input, "input");
        Objects.requireNonNull(secondaryInput, "secondaryInput");
        if (count < 1) {
            throw new IllegalArgumentException("Recipe count must be positive");
        }
    }

    public static RecipeSpec of(RecipeKind kind, RecipeCategorySpec category, ResourceId result, ResourceId input) {
        return new RecipeSpec(kind, category, result, input, Optional.empty(), 1);
    }

    public static RecipeSpec of(RecipeKind kind, RecipeCategorySpec category, ResourceId result, ResourceId input, int count) {
        return new RecipeSpec(kind, category, result, input, Optional.empty(), count);
    }

    public static RecipeSpec withSecondary(
            RecipeKind kind,
            RecipeCategorySpec category,
            ResourceId result,
            ResourceId input,
            ResourceId secondaryInput,
            int count
    ) {
        return new RecipeSpec(kind, category, result, input, Optional.of(secondaryInput), count);
    }

    public static RecipeSpec stonecutting(RecipeCategorySpec category, ResourceId result, ResourceId input, int count) {
        return new RecipeSpec(RecipeKind.STONECUTTING, category, result, input, Optional.empty(), count);
    }
}
