package net.cinchtail.cinchsmissingblocks.network;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public record ConfigSyncPayload(boolean enableTuffBrickPillar)
        implements CustomPacketPayload {

    public static final Type<ConfigSyncPayload> TYPE =
            new Type<>(ResourceLocation.fromNamespaceAndPath(
                    MOD_ID, "config_sync"));

    public static final StreamCodec<FriendlyByteBuf, ConfigSyncPayload> CODEC =
            StreamCodec.composite(
                    net.minecraft.network.codec.ByteBufCodecs.BOOL,
                    ConfigSyncPayload::enableTuffBrickPillar,
                    ConfigSyncPayload::new
            );

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}