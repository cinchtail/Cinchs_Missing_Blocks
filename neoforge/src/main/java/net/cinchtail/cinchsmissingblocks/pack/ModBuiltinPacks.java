package net.cinchtail.cinchsmissingblocks.pack;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.event.AddPackFindersEvent;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public final class ModBuiltinPacks {
    private ModBuiltinPacks() {}

    public static void register(AddPackFindersEvent event) {
        BuiltinPacks.Type type = event.getPackType() == PackType.CLIENT_RESOURCES
                ? BuiltinPacks.Type.CLIENT_RESOURCES
                : BuiltinPacks.Type.SERVER_DATA;

        BuiltinPacks.available(type, ModList.get()::isLoaded)
                .forEach(pack -> addPack(event, pack));
    }

    private static void addPack(AddPackFindersEvent event, BuiltinPacks.Definition pack) {
        event.addPackFinders(
                Identifier.fromNamespaceAndPath(MOD_ID, "resourcepacks/" + pack.folder()),
                event.getPackType(),
                Component.literal(pack.displayName()),
                pack.activation() == BuiltinPacks.Activation.DEFAULT_ENABLED
                        ? PackSource.DEFAULT
                        : PackSource.BUILT_IN,
                pack.activation() != BuiltinPacks.Activation.NORMAL,
                Pack.Position.TOP
        );
    }
}
