package net.cinchtail.cinchsmissingblocks.common.loot;

import java.util.Objects;

public record LootSpec(LootKind kind) {
    public LootSpec {
        Objects.requireNonNull(kind, "kind");
    }

    public static LootSpec self() {
        return new LootSpec(LootKind.SELF);
    }

    public static LootSpec slab() {
        return new LootSpec(LootKind.SLAB);
    }

    public static LootSpec silkTouch() {
        return new LootSpec(LootKind.SILK_TOUCH);
    }

    public static LootSpec snowballsOrSelf() {
        return new LootSpec(LootKind.SNOWBALLS_OR_SELF);
    }

    public static LootSpec snowballSlab() {
        return new LootSpec(LootKind.SNOWBALL_SLAB);
    }
}
