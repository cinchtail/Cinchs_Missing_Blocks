package net.cinchtail.cinchsmissingblocks.util;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

import java.util.Set;
import java.util.stream.Stream;

public class ModWoodTypes {
    private static final Set<WoodType> VALUES = new ObjectArraySet<>();
    public static final WoodType NETHER_BRICKS = register(
            new WoodType("nether_bricks", ModBlockSetType.NETHER_BRICKS, BlockSoundGroup.NETHER_BRICKS,
                    BlockSoundGroup.NETHER_BRICKS, SoundEvents.BLOCK_NETHER_WOOD_FENCE_GATE_CLOSE, SoundEvents.BLOCK_NETHER_WOOD_FENCE_GATE_OPEN));

    public static WoodType register(WoodType type) {
        VALUES.add(type);
        return type;
    }

    public static Stream<WoodType> values() {
        return VALUES.stream();
    }
}