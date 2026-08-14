package net.cinchtail.cinchsmissingblocks.pack;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public final class FabricBuiltinPacks {
    private FabricBuiltinPacks() {
    }

    public static void registerDataPacks() {
        register(BuiltinPacks.Type.SERVER_DATA);
    }

    public static void registerResourcePacks() {
        register(BuiltinPacks.Type.CLIENT_RESOURCES);
    }

    private static void register(BuiltinPacks.Type type) {
        FabricLoader loader = FabricLoader.getInstance();
        loader.getModContainer(MOD_ID).ifPresent(container ->
                BuiltinPacks.available(type, loader::isModLoaded).forEach(pack ->
                        ResourceManagerHelper.registerBuiltinResourcePack(
                                Identifier.fromNamespaceAndPath(pack.namespace(), pack.folder()),
                                container,
                                Component.literal(pack.displayName()),
                                activation(pack.activation())
                        )));
    }

    private static ResourcePackActivationType activation(BuiltinPacks.Activation activation) {
        return switch (activation) {
            case ALWAYS_ENABLED -> ResourcePackActivationType.ALWAYS_ENABLED;
            case DEFAULT_ENABLED -> ResourcePackActivationType.DEFAULT_ENABLED;
            case NORMAL -> ResourcePackActivationType.NORMAL;
        };
    }
}
