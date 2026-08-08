package net.cinchtail.cinchsmissingblocks.common.catalog;

import net.cinchtail.cinchsmissingblocks.common.block.BlockSpec;
import net.cinchtail.cinchsmissingblocks.common.block.SoundProfile;
import net.cinchtail.cinchsmissingblocks.common.creative.CreativeEntrySpec;
import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;
import net.cinchtail.cinchsmissingblocks.common.item.ItemSpec;
import net.cinchtail.cinchsmissingblocks.common.pack.PackSpec;
import net.cinchtail.cinchsmissingblocks.common.recipe.RecipeSpec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public record ContentCatalog(
        List<BlockSpec> blocks,
        List<ItemSpec> items,
        List<RecipeSpec> recipes,
        List<CreativeEntrySpec> creativeEntries,
        List<PackSpec> packs
) {
    public ContentCatalog {
        blocks = List.copyOf(blocks);
        items = List.copyOf(items);
        recipes = List.copyOf(recipes);
        creativeEntries = List.copyOf(creativeEntries);
        packs = List.copyOf(packs);
        validateUniqueIds(blocks, items);
        validateReferences(blocks, items, recipes, creativeEntries);
    }

    private static void validateUniqueIds(List<BlockSpec> blocks, List<ItemSpec> items) {
        Set<ResourceId> ids = new HashSet<>();
        for (BlockSpec block : blocks) {
            if (!ids.add(block.id())) {
                throw new IllegalArgumentException("Duplicate content id: " + block.id());
            }
        }
        for (ItemSpec item : items) {
            if (!ids.add(item.id())) {
                throw new IllegalArgumentException("Duplicate content id: " + item.id());
            }
        }
    }

    private static void validateReferences(
            List<BlockSpec> blocks,
            List<ItemSpec> items,
            List<RecipeSpec> recipes,
            List<CreativeEntrySpec> creativeEntries
    ) {
        Set<ResourceId> modContent = new HashSet<>();
        blocks.forEach(block -> modContent.add(block.id()));
        items.forEach(item -> modContent.add(item.id()));

        for (RecipeSpec recipe : recipes) {
            validateModReference("recipe result", recipe.result(), modContent);
            validateModReference("recipe input", recipe.input(), modContent);
            recipe.secondaryInput().ifPresent(id -> validateModReference("recipe secondary input", id, modContent));
        }
        for (CreativeEntrySpec entry : creativeEntries) {
            validateModReference("creative entry", entry.id(), modContent);
        }
    }

    private static void validateModReference(String type, ResourceId id, Set<ResourceId> modContent) {
        if (id.namespace().equals("cinchsmissingblocks") && !modContent.contains(id)) {
            throw new IllegalArgumentException("Unknown " + type + ": " + id);
        }
    }


    /**
     * Creates a view of this catalog that only references vanilla content available on the target game version.
     * Mod-to-mod references are closed transitively so recipes and creative entries never point at skipped content.
     */
    public ContentCatalog filtered(VanillaAvailability availability) {
        Objects.requireNonNull(availability, "availability");

        List<BlockSpec> keptBlocks = new ArrayList<>(blocks);
        boolean changed;
        do {
            Set<ResourceId> keptBlockIds = new HashSet<>();
            keptBlocks.forEach(block -> keptBlockIds.add(block.id()));
            changed = keptBlocks.removeIf(block -> !blockAvailable(block, availability, keptBlockIds));
        } while (changed);

        Set<ResourceId> keptContent = new HashSet<>();
        keptBlocks.forEach(block -> keptContent.add(block.id()));
        items.forEach(item -> keptContent.add(item.id()));

        List<RecipeSpec> keptRecipes = recipes.stream()
                .filter(recipe -> referenceAvailable(recipe.result(), availability, keptContent))
                .filter(recipe -> referenceAvailable(recipe.input(), availability, keptContent))
                .filter(recipe -> recipe.secondaryInput().map(id -> referenceAvailable(id, availability, keptContent)).orElse(true))
                .toList();

        List<CreativeEntrySpec> keptCreative = creativeEntries.stream()
                .filter(entry -> referenceAvailable(entry.id(), availability, keptContent))
                .toList();

        List<PackSpec> keptPacks = packs.stream()
                .filter(pack -> pack.requiredVanillaId().map(availability::isAvailable).orElse(true))
                .toList();

        return new ContentCatalog(keptBlocks, items, keptRecipes, keptCreative, keptPacks);
    }

    private static boolean blockAvailable(BlockSpec block, VanillaAvailability availability, Set<ResourceId> keptBlockIds) {
        if (!soundAvailable(block.properties().sound(), availability)) {
            return false;
        }
        if (block.baseBlock().isPresent() && !referenceAvailable(block.baseBlock().orElseThrow(), availability, keptBlockIds)) {
            return false;
        }
        return referenceAvailable(block.model().textureSource(), availability, keptBlockIds);
    }

    private static boolean soundAvailable(SoundProfile sound, VanillaAvailability availability) {
        ResourceId required = switch (sound) {
            case TUFF_BRICKS -> ResourceId.minecraft("tuff_bricks");
            case RESIN_BRICKS -> ResourceId.minecraft("resin_bricks");
            case CINNABAR -> ResourceId.minecraft("cinnabar");
            case SULFUR -> ResourceId.minecraft("sulfur");
            default -> null;
        };
        return required == null || availability.isAvailable(required);
    }

    private static boolean referenceAvailable(ResourceId id, VanillaAvailability availability, Set<ResourceId> keptModContent) {
        if (id.namespace().equals("minecraft")) {
            return availability.isAvailable(id);
        }
        if (id.namespace().equals("cinchsmissingblocks")) {
            return keptModContent.contains(id);
        }
        return true;
    }

    public BlockSpec block(ResourceId id) {
        for (BlockSpec block : blocks) {
            if (block.id().equals(id)) {
                return block;
            }
        }
        throw new IllegalArgumentException("Unknown common block: " + id);
    }

    public ItemSpec item(ResourceId id) {
        for (ItemSpec item : items) {
            if (item.id().equals(id)) {
                return item;
            }
        }
        throw new IllegalArgumentException("Unknown common item: " + id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private final List<BlockSpec> blocks = new ArrayList<>();
        private final List<ItemSpec> items = new ArrayList<>();
        private final List<RecipeSpec> recipes = new ArrayList<>();
        private final List<CreativeEntrySpec> creativeEntries = new ArrayList<>();
        private final List<PackSpec> packs = new ArrayList<>();

        public Builder block(BlockSpec block) {
            blocks.add(Objects.requireNonNull(block, "block"));
            return this;
        }

        public Builder item(ItemSpec item) {
            items.add(Objects.requireNonNull(item, "item"));
            return this;
        }

        public Builder recipe(RecipeSpec recipe) {
            recipes.add(Objects.requireNonNull(recipe, "recipe"));
            return this;
        }

        public Builder recipes(List<RecipeSpec> recipes) {
            recipes.forEach(this::recipe);
            return this;
        }

        public Builder creative(CreativeEntrySpec entry) {
            creativeEntries.add(Objects.requireNonNull(entry, "entry"));
            return this;
        }

        public Builder creative(List<CreativeEntrySpec> entries) {
            entries.forEach(this::creative);
            return this;
        }

        public Builder pack(PackSpec pack) {
            packs.add(Objects.requireNonNull(pack, "pack"));
            return this;
        }

        public ContentCatalog build() {
            return new ContentCatalog(blocks, items, recipes, creativeEntries, packs);
        }
    }
}
