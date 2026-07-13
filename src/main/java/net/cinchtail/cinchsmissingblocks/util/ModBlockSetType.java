package net.cinchtail.cinchsmissingblocks.util;


import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.block.BlockSetType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

import java.util.Set;
import java.util.stream.Stream;

public class ModBlockSetType {
    private static final Set<BlockSetType> VALUES = new ObjectArraySet<>();
    public static final BlockSetType POLISHED_DEEPSLATE = register(new BlockSetType("polished_deepslate", true,true,
            false, BlockSetType.ActivationRule.MOBS, BlockSoundGroup.POLISHED_DEEPSLATE, SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN,
            SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));

    public static BlockSetType register(BlockSetType blockSetType) {
        VALUES.add(blockSetType);
        return blockSetType;
    }
    public static Stream<BlockSetType> values() {
        return VALUES.stream();
    }
}