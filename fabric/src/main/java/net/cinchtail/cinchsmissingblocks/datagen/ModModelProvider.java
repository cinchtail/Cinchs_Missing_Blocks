package net.cinchtail.cinchsmissingblocks.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

public final class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generators) {
        ModModelGenerators.generateBlockStateModels(generators);
    }

    @Override
    public void generateItemModels(ItemModelGenerators generators) {
        ModModelGenerators.generateItemModels(generators);
    }
}
