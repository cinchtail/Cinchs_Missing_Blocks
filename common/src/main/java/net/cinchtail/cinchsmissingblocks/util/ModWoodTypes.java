package net.cinchtail.cinchsmissingblocks.util;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.Set;
import java.util.stream.Stream;

public class ModWoodTypes {
    private static final Set<WoodType> VALUES = new ObjectArraySet<>();
    public static final WoodType NETHER_BRICKS = register(
            new WoodType("nether_bricks", ModBlockSetType.NETHER_BRICKS, SoundType.NETHER_BRICKS,
                    SoundType.NETHER_BRICKS, SoundEvents.NETHER_WOOD_FENCE_GATE_CLOSE, SoundEvents.NETHER_WOOD_FENCE_GATE_OPEN));

    public static WoodType register(WoodType type) {
        VALUES.add(type);
        return type;
    }

    public static Stream<WoodType> values() {
        return VALUES.stream();
    }
}