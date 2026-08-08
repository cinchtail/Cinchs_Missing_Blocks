package net.cinchtail.cinchsmissingblocks.common.block;

import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;
import net.cinchtail.cinchsmissingblocks.common.loot.LootSpec;
import net.cinchtail.cinchsmissingblocks.common.model.ModelSpec;

import java.util.Objects;
import java.util.Optional;

public record BlockSpec(
        ResourceId id,
        BlockKind kind,
        Optional<ResourceId> baseBlock,
        BlockPropertiesSpec properties,
        LootSpec loot,
        ModelSpec model,
        Optional<BlockSetProfile> blockSet,
        int buttonPressTicks,
        BlockBehavior behavior
) {
    public BlockSpec {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(kind, "kind");
        Objects.requireNonNull(baseBlock, "baseBlock");
        Objects.requireNonNull(properties, "properties");
        Objects.requireNonNull(loot, "loot");
        Objects.requireNonNull(model, "model");
        Objects.requireNonNull(blockSet, "blockSet");
        Objects.requireNonNull(behavior, "behavior");

        if (kind == BlockKind.STAIRS && baseBlock.isEmpty()) {
            throw new IllegalArgumentException("Stairs require a base block: " + id);
        }
        if ((kind == BlockKind.PRESSURE_PLATE || kind == BlockKind.BUTTON) && blockSet.isEmpty()) {
            throw new IllegalArgumentException(kind + " requires a block set profile: " + id);
        }
        if (kind == BlockKind.BUTTON && buttonPressTicks <= 0) {
            throw new IllegalArgumentException("Button press ticks must be positive: " + id);
        }
    }

    public static BlockSpec of(
            ResourceId id,
            BlockKind kind,
            ResourceId baseBlock,
            BlockPropertiesSpec properties,
            LootSpec loot,
            ModelSpec model
    ) {
        return new BlockSpec(
                id,
                kind,
                Optional.ofNullable(baseBlock),
                properties,
                loot,
                model,
                Optional.empty(),
                0,
                BlockBehavior.STANDARD
        );
    }

    public static BlockSpec interactive(
            ResourceId id,
            BlockKind kind,
            BlockPropertiesSpec properties,
            LootSpec loot,
            ModelSpec model,
            BlockSetProfile blockSet,
            int buttonPressTicks
    ) {
        return new BlockSpec(
                id,
                kind,
                Optional.empty(),
                properties,
                loot,
                model,
                Optional.of(blockSet),
                buttonPressTicks,
                BlockBehavior.STANDARD
        );
    }

    public static BlockSpec custom(
            ResourceId id,
            BlockPropertiesSpec properties,
            LootSpec loot,
            ModelSpec model,
            BlockBehavior behavior
    ) {
        if (behavior == BlockBehavior.STANDARD) {
            throw new IllegalArgumentException("A custom block requires a non-standard behavior: " + id);
        }
        return new BlockSpec(
                id,
                BlockKind.SIMPLE,
                Optional.empty(),
                properties,
                loot,
                model,
                Optional.empty(),
                0,
                behavior
        );
    }
}
