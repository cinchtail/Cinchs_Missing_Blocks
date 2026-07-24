package net.cinchtail.cinchsmissingblocks.network;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public record ConfigSyncPayload(boolean enableTuffBrickPillar) implements CustomPacketPayload {

    public static final Identifier ID = Identifier.fromNamespaceAndPath(MOD_ID, "config_sync");

    public static final Type<ConfigSyncPayload> TYPE = new Type<>(ID);

    public static final StreamCodec<FriendlyByteBuf, ConfigSyncPayload> CODEC =
            StreamCodec.of(
                    (buf, payload) -> buf.writeBoolean(payload.enableTuffBrickPillar()),
                    buf -> new ConfigSyncPayload(buf.readBoolean())
            );

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}