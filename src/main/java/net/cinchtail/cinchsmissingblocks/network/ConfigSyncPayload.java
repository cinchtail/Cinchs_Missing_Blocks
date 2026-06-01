package net.cinchtail.cinchsmissingblocks.network;

import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;

public record ConfigSyncPayload(boolean enableTuffBrickPillar,
                                boolean enableDoubleSlabs) implements CustomPayload {

    public static final Id<ConfigSyncPayload> ID =
            new Id<>(Identifier.of("cinchsmissingblocks", "config_sync"));

    public static final PacketCodec<RegistryByteBuf, ConfigSyncPayload> CODEC =
            PacketCodec.of(
                    (value, buf) -> {
                        buf.writeBoolean(value.enableTuffBrickPillar());
                        buf.writeBoolean(value.enableDoubleSlabs());
                    },
                    buf -> new ConfigSyncPayload(buf.readBoolean(), buf.readBoolean())
            );

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}