package net.cinchtail.cinchsmissingblocks.common.block;

import java.util.Objects;
import java.util.Optional;

public record BlockPropertiesSpec(
        float hardness,
        float resistance,
        SoundProfile sound,
        Optional<MapColorProfile> mapColor,
        Optional<InstrumentProfile> instrument,
        boolean requiresCorrectToolForDrops,
        boolean noCollision,
        boolean destroyOnPush,
        boolean forceSolidOn
) {
    public BlockPropertiesSpec {
        Objects.requireNonNull(sound, "sound");
        Objects.requireNonNull(mapColor, "mapColor");
        Objects.requireNonNull(instrument, "instrument");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private float hardness;
        private float resistance;
        private SoundProfile sound;
        private MapColorProfile mapColor;
        private InstrumentProfile instrument;
        private boolean requiresCorrectToolForDrops;
        private boolean noCollision;
        private boolean destroyOnPush;
        private boolean forceSolidOn;

        public Builder strength(float strength) {
            return strength(strength, strength);
        }

        public Builder strength(float hardness, float resistance) {
            this.hardness = hardness;
            this.resistance = resistance;
            return this;
        }

        public Builder sound(SoundProfile sound) {
            this.sound = Objects.requireNonNull(sound, "sound");
            return this;
        }

        public Builder mapColor(MapColorProfile mapColor) {
            this.mapColor = Objects.requireNonNull(mapColor, "mapColor");
            return this;
        }

        public Builder instrument(InstrumentProfile instrument) {
            this.instrument = Objects.requireNonNull(instrument, "instrument");
            return this;
        }

        public Builder requiresCorrectToolForDrops() {
            this.requiresCorrectToolForDrops = true;
            return this;
        }

        public Builder noCollision() {
            this.noCollision = true;
            return this;
        }

        public Builder destroyOnPush() {
            this.destroyOnPush = true;
            return this;
        }

        public Builder forceSolidOn() {
            this.forceSolidOn = true;
            return this;
        }

        public BlockPropertiesSpec build() {
            if (sound == null) {
                throw new IllegalStateException("A sound profile is required");
            }

            return new BlockPropertiesSpec(
                    hardness,
                    resistance,
                    sound,
                    Optional.ofNullable(mapColor),
                    Optional.ofNullable(instrument),
                    requiresCorrectToolForDrops,
                    noCollision,
                    destroyOnPush,
                    forceSolidOn
            );
        }
    }
}
