package net.cinchtail.cinchsmissingblocks.network;

import net.minecraft.resources.Identifier;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public record ConfigSyncPayload(boolean enableTuffBrickPillar) { /* implements CustomPayload {

    public static final Id<ConfigSyncPayload> ID =
            new Id<>(Identifier.fromNamespaceAndPath(MOD_ID, "config_sync"));

    public static final PacketCodec<RegistryByteBuf, ConfigSyncPayload> CODEC =
            PacketCodec.of((value, buf) -> buf.writeBoolean(value.enableTuffBrickPillar()),
                    buf -> new ConfigSyncPayload(buf.readBoolean()));

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }*/
}