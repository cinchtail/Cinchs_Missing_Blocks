package net.cinchtail.cinchsmissingblocks;

import net.cinchtail.cinchsmissingblocks.block.ModBlocks;
import net.cinchtail.cinchsmissingblocks.network.ClientConfigSync;
import net.cinchtail.cinchsmissingblocks.pack.BuiltinResourcePacks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class CinchsMissingBlocksClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientConfigSync.register();
        BuiltinResourcePacks.registerBuiltinPacks(CinchsMissingBlocks.MOD_ID);

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.TINTED_GLASS_PANE,
                RenderLayer.getTranslucent()
        );
    }
}