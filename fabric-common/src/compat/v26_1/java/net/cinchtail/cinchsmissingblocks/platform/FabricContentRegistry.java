package net.cinchtail.cinchsmissingblocks.platform;

import net.cinchtail.cinchsmissingblocks.block.custom.SculkInlaidDeepslateBlock;
import net.cinchtail.cinchsmissingblocks.block.custom.TintedGlassPaneBlock;
import net.cinchtail.cinchsmissingblocks.common.block.BlockPropertiesSpec;
import net.cinchtail.cinchsmissingblocks.common.block.BlockSetProfile;
import net.cinchtail.cinchsmissingblocks.common.block.BlockSpec;
import net.cinchtail.cinchsmissingblocks.common.catalog.ContentCatalog;
import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;
import net.cinchtail.cinchsmissingblocks.common.item.ItemSpec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.HashMap;
import java.util.Map;

public final class FabricContentRegistry {
    private static final Map<ResourceId, Block> REGISTERED_BLOCKS = new HashMap<>();
    private static final Map<ResourceId, Item> REGISTERED_ITEMS = new HashMap<>();
    private static boolean installed;

    private FabricContentRegistry() {
    }

    public static void install(ContentCatalog catalog) {
        if (installed) {
            return;
        }
        catalog.blocks().forEach(FabricContentRegistry::register);
        catalog.items().forEach(FabricContentRegistry::registerItem);
        installed = true;
    }

    public static Block register(BlockSpec spec) {
        if (REGISTERED_BLOCKS.containsKey(spec.id())) {
            throw new IllegalStateException("Block already registered through common content: " + spec.id());
        }

        Identifier id = FabricResourceIds.toMinecraft(spec.id());
        BlockBehaviour.Properties properties = applyProperties(BlockBehaviour.Properties.of(), spec.properties())
                .setId(ResourceKey.create(Registries.BLOCK, id));

        Block block = switch (spec.behavior()) {
            case SCULK_XP_DROP -> new SculkInlaidDeepslateBlock(properties);
            case TINTED_GLASS_PANE -> new TintedGlassPaneBlock(
                    properties
                            .isValidSpawn(Blocks::never)
                            .isRedstoneConductor(Blocks::never)
                            .isSuffocating(Blocks::never)
                            .isViewBlocking(Blocks::never)
                            .noOcclusion()
            );
            case STANDARD -> createStandardBlock(spec, properties);
        };

        Registry.register(
                BuiltInRegistries.ITEM,
                id,
                new BlockItem(
                        block,
                        new Item.Properties()
                                .useBlockDescriptionPrefix()
                                .setId(ResourceKey.create(Registries.ITEM, id))
                )
        );
        Block registered = Registry.register(BuiltInRegistries.BLOCK, id, block);
        REGISTERED_BLOCKS.put(spec.id(), registered);
        return registered;
    }

    private static Block createStandardBlock(BlockSpec spec, BlockBehaviour.Properties properties) {
        return switch (spec.kind()) {
            case SIMPLE -> new Block(properties);
            case STAIRS -> new StairBlock(resolveBlock(spec.baseBlock().orElseThrow()).defaultBlockState(), properties);
            case SLAB -> new SlabBlock(properties);
            case WALL -> new WallBlock(properties);
            case PILLAR -> new RotatedPillarBlock(properties);
            case FENCE -> new FenceBlock(properties);
            case PRESSURE_PLATE -> new PressurePlateBlock(resolveBlockSet(spec.blockSet().orElseThrow()), properties);
            case BUTTON -> new ButtonBlock(
                    resolveBlockSet(spec.blockSet().orElseThrow()),
                    spec.buttonPressTicks(),
                    properties
            );
        };
    }

    public static Item registerItem(ItemSpec spec) {
        if (REGISTERED_ITEMS.containsKey(spec.id())) {
            throw new IllegalStateException("Item already registered through common content: " + spec.id());
        }

        Identifier id = FabricResourceIds.toMinecraft(spec.id());
        Item item = new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id)));
        Item registered = Registry.register(BuiltInRegistries.ITEM, id, item);
        REGISTERED_ITEMS.put(spec.id(), registered);
        return registered;
    }

    public static Block resolveBlock(ResourceId id) {
        Block registered = REGISTERED_BLOCKS.get(id);
        if (registered != null) {
            return registered;
        }

        Block block = BuiltInRegistries.BLOCK.getValue(FabricResourceIds.toMinecraft(id));
        if (block == null) {
            throw new IllegalArgumentException("Unknown block id: " + id);
        }
        return block;
    }

    public static Item resolveItem(ResourceId id) {
        Item registered = REGISTERED_ITEMS.get(id);
        if (registered != null) {
            return registered;
        }

        Item item = BuiltInRegistries.ITEM.getValue(FabricResourceIds.toMinecraft(id));
        if (item == null) {
            throw new IllegalArgumentException("Unknown item id: " + id);
        }
        return item;
    }

    public static ItemLike resolveItemLike(ResourceId id) {
        return resolveItem(id);
    }

    private static BlockSetType resolveBlockSet(BlockSetProfile profile) {
        return switch (profile) {
            case POLISHED_DEEPSLATE -> BlockSetType.STONE;
        };
    }

    private static BlockBehaviour.Properties applyProperties(
            BlockBehaviour.Properties properties,
            BlockPropertiesSpec spec
    ) {
        properties.strength(spec.hardness(), spec.resistance());
        properties.sound(switch (spec.sound()) {
            case CALCITE -> SoundType.CALCITE;
            case DRIPSTONE_BLOCK -> SoundType.DRIPSTONE_BLOCK;
            case STONE -> SoundType.STONE;
            case TUFF_BRICKS -> SoundType.TUFF_BRICKS;
            case PACKED_MUD -> SoundType.PACKED_MUD;
            case MUD_BRICKS -> SoundType.MUD_BRICKS;
            case RESIN_BRICKS -> SoundType.RESIN_BRICKS;
            case DEEPSLATE -> SoundType.DEEPSLATE;
            case DEEPSLATE_BRICKS -> SoundType.DEEPSLATE_BRICKS;
            case DEEPSLATE_TILES -> SoundType.DEEPSLATE_TILES;
            case POLISHED_DEEPSLATE -> SoundType.POLISHED_DEEPSLATE;
            case NETHERRACK -> SoundType.NETHERRACK;
            case NETHER_BRICKS -> SoundType.NETHER_BRICKS;
            case BASALT -> SoundType.BASALT;
            case CINNABAR -> SoundType.STONE;
            case SULFUR -> SoundType.STONE;
            case SNOW -> SoundType.SNOW;
            case GLASS -> SoundType.GLASS;
        });

        spec.mapColor().ifPresent(mapColor -> properties.mapColor(switch (mapColor) {
            case TERRACOTTA_WHITE -> MapColor.TERRACOTTA_WHITE;
            case TERRACOTTA_ORANGE -> MapColor.TERRACOTTA_ORANGE;
            case TERRACOTTA_MAGENTA -> MapColor.TERRACOTTA_MAGENTA;
            case TERRACOTTA_LIGHT_BLUE -> MapColor.TERRACOTTA_LIGHT_BLUE;
            case TERRACOTTA_YELLOW -> MapColor.TERRACOTTA_YELLOW;
            case TERRACOTTA_LIGHT_GREEN -> MapColor.TERRACOTTA_LIGHT_GREEN;
            case TERRACOTTA_PINK -> MapColor.TERRACOTTA_PINK;
            case TERRACOTTA_GRAY -> MapColor.TERRACOTTA_GRAY;
            case TERRACOTTA_LIGHT_GRAY -> MapColor.TERRACOTTA_LIGHT_GRAY;
            case TERRACOTTA_CYAN -> MapColor.TERRACOTTA_CYAN;
            case TERRACOTTA_PURPLE -> MapColor.TERRACOTTA_PURPLE;
            case TERRACOTTA_BLUE -> MapColor.TERRACOTTA_BLUE;
            case TERRACOTTA_BROWN -> MapColor.TERRACOTTA_BROWN;
            case TERRACOTTA_GREEN -> MapColor.TERRACOTTA_GREEN;
            case TERRACOTTA_RED -> MapColor.TERRACOTTA_RED;
            case TERRACOTTA_BLACK -> MapColor.TERRACOTTA_BLACK;
            case COLOR_BLACK -> MapColor.COLOR_BLACK;
            case COLOR_GRAY -> MapColor.COLOR_GRAY;
            case COLOR_LIGHT_BLUE -> MapColor.COLOR_LIGHT_BLUE;
            case COLOR_MAGENTA -> MapColor.COLOR_MAGENTA;
            case COLOR_ORANGE -> MapColor.COLOR_ORANGE;
            case COLOR_RED -> MapColor.COLOR_RED;
            case COLOR_YELLOW -> MapColor.COLOR_YELLOW;
            case DEEPSLATE -> MapColor.DEEPSLATE;
            case DIAMOND -> MapColor.DIAMOND;
            case DIRT -> MapColor.DIRT;
            case NETHER -> MapColor.NETHER;
            case QUARTZ -> MapColor.QUARTZ;
            case SAND -> MapColor.SAND;
            case SNOW -> MapColor.SNOW;
            case STONE -> MapColor.STONE;
        }));

        spec.instrument().ifPresent(instrument -> properties.instrument(switch (instrument) {
            case BASEDRUM -> NoteBlockInstrument.BASEDRUM;
        }));

        if (spec.requiresCorrectToolForDrops()) {
            properties.requiresCorrectToolForDrops();
        }
        if (spec.noCollision()) {
            properties.noCollision();
        }
        if (spec.destroyOnPush()) {
            properties.pushReaction(PushReaction.DESTROY);
        }
        if (spec.forceSolidOn()) {
            properties.forceSolidOn();
        }

        return properties;
    }
}
