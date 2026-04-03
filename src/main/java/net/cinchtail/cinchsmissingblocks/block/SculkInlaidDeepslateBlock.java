package net.cinchtail.cinchsmissingblocks.block;

import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.DropExperienceBlock;

public class SculkInlaidDeepslateBlock extends DropExperienceBlock {
    public SculkInlaidDeepslateBlock(Properties properties) {
        super(ConstantInt.of(1), properties);
    }
}