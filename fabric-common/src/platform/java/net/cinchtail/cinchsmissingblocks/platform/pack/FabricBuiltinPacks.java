package net.cinchtail.cinchsmissingblocks.platform.pack;

import net.cinchtail.cinchsmissingblocks.common.catalog.ContentCatalog;
import net.cinchtail.cinchsmissingblocks.common.pack.PackActivation;
import net.cinchtail.cinchsmissingblocks.common.pack.PackSpec;
import net.cinchtail.cinchsmissingblocks.common.pack.PackType;
import net.cinchtail.cinchsmissingblocks.fabriccommon.config.FabricConfigState;
import net.cinchtail.cinchsmissingblocks.fabriccommon.policy.FabricPackPolicy;
import net.cinchtail.cinchsmissingblocks.platform.FabricResourceIds;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public final class FabricBuiltinPacks {
    private FabricBuiltinPacks() {
    }

    public static void registerDataPacks(ContentCatalog catalog, FabricConfigState state) {
        register(catalog, state, PackType.DATA);
    }

    public static void registerResourcePacks(ContentCatalog catalog, FabricConfigState state) {
        register(catalog, state, PackType.RESOURCE);
    }

    private static void register(ContentCatalog catalog, FabricConfigState state, PackType type) {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container -> {
            for (PackSpec spec : catalog.packs()) {
                if (spec.type() != type || !FabricPackPolicy.shouldRegister(spec, state, FabricLoader.getInstance()::isModLoaded)) {
                    continue;
                }
                ResourceManagerHelper.registerBuiltinResourcePack(
                        FabricResourceIds.toMinecraft(spec.id()),
                        container,
                        Component.literal(spec.displayName()),
                        activation(FabricPackPolicy.activation(spec, state))
                );
            }
        });
    }

    private static ResourcePackActivationType activation(PackActivation activation) {
        return switch (activation) {
            case ALWAYS_ENABLED -> ResourcePackActivationType.ALWAYS_ENABLED;
            case DEFAULT_ENABLED -> ResourcePackActivationType.DEFAULT_ENABLED;
            case NORMAL -> ResourcePackActivationType.NORMAL;
        };
    }
}
