package net.cinchtail.cinchsmissingblocks.platform;

import net.cinchtail.cinchsmissingblocks.common.catalog.ContentCatalog;
import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;
import net.cinchtail.cinchsmissingblocks.fabriccommon.config.FabricConfigState;
import net.cinchtail.cinchsmissingblocks.fabriccommon.policy.FabricCreativePolicy;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public final class FabricCreativeTabs {
    private FabricCreativeTabs() {}

    public static void register(ContentCatalog catalog, FabricConfigState state) {
        Registry.register(
                BuiltInRegistries.CREATIVE_MODE_TAB,
                ResourceLocation.fromNamespaceAndPath(MOD_ID, "cinchs_missing_blocks"),
                FabricItemGroup.builder()
                        .icon(() -> new ItemStack(FabricContentRegistry.resolveItem(ResourceId.mod("calcite_bricks"))))
                        .title(Component.translatable("itemgroup.cinchsmissingblocks"))
                        .displayItems((parameters, output) -> catalog.creativeEntries().stream()
                                .filter(entry -> FabricCreativePolicy.enabled(entry.gate(), state))
                                .forEach(entry -> output.accept(FabricContentRegistry.resolveItemLike(entry.id()))))
                        .build()
        );
    }
}
