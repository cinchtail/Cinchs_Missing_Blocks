package net.cinchtail.cinchsmissingblocks.platform;

import net.cinchtail.cinchsmissingblocks.block.custom.SculkInlaidDeepslateBlock;
import net.cinchtail.cinchsmissingblocks.block.custom.TintedGlassPaneBlock;
import net.cinchtail.cinchsmissingblocks.common.block.BlockPropertiesSpec;
import net.cinchtail.cinchsmissingblocks.common.block.BlockSpec;
import net.cinchtail.cinchsmissingblocks.common.catalog.ContentCatalog;
import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;
import net.cinchtail.cinchsmissingblocks.common.item.ItemSpec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.HashMap;
import java.util.Map;

public final class FabricContentRegistry {
    private static final Map<ResourceId, Block> BLOCKS = new HashMap<>();
    private static final Map<ResourceId, Item> ITEMS = new HashMap<>();
    private static boolean installed;
    private FabricContentRegistry() {}

    public static void install(ContentCatalog catalog) {
        if (installed) return;
        catalog.blocks().forEach(FabricContentRegistry::register);
        catalog.items().forEach(FabricContentRegistry::registerItem);
        installed = true;
    }

    private static void register(BlockSpec spec) {
        ResourceLocation id = FabricResourceIds.toMinecraft(spec.id());
        BlockBehaviour.Properties properties = applyProperties(BlockBehaviour.Properties.of(), spec.properties());
        Block block = switch (spec.behavior()) {
            case SCULK_XP_DROP -> new SculkInlaidDeepslateBlock(properties);
            case TINTED_GLASS_PANE -> new TintedGlassPaneBlock(properties.noOcclusion());
            case STANDARD -> createStandardBlock(spec, properties);
        };
        Registry.register(BuiltInRegistries.BLOCK, id, block);
        Registry.register(BuiltInRegistries.ITEM, id, new BlockItem(block, new Item.Properties()));
        BLOCKS.put(spec.id(), block);
    }

    private static Block createStandardBlock(BlockSpec spec, BlockBehaviour.Properties properties) {
        return switch (spec.kind()) {
            case SIMPLE -> new Block(properties);
            case STAIRS -> new StairBlock(resolveBlock(spec.baseBlock().orElseThrow()).defaultBlockState(), properties);
            case SLAB -> new SlabBlock(properties);
            case WALL -> new WallBlock(properties);
            case PILLAR -> new RotatedPillarBlock(properties);
            case FENCE -> new FenceBlock(properties);
            case PRESSURE_PLATE -> new CompatPressurePlateBlock(properties);
            case BUTTON -> new CompatButtonBlock(spec.buttonPressTicks(), properties);
        };
    }

    private static void registerItem(ItemSpec spec) {
        ResourceLocation id = FabricResourceIds.toMinecraft(spec.id());
        Item item = Registry.register(BuiltInRegistries.ITEM, id, new Item(new Item.Properties()));
        ITEMS.put(spec.id(), item);
    }

    public static Block resolveBlock(ResourceId id) {
        Block own = BLOCKS.get(id);
        if (own != null) return own;
        return BuiltInRegistries.BLOCK.get(FabricResourceIds.toMinecraft(id));
    }

    public static Item resolveItem(ResourceId id) {
        Item own = ITEMS.get(id);
        if (own != null) return own;
        return BuiltInRegistries.ITEM.get(FabricResourceIds.toMinecraft(id));
    }

    public static ItemLike resolveItemLike(ResourceId id) { return resolveItem(id); }

    private static BlockBehaviour.Properties applyProperties(BlockBehaviour.Properties properties, BlockPropertiesSpec spec) {
        properties.strength(spec.hardness(), spec.resistance());
        properties.sound(switch (spec.sound()) {
            case CALCITE -> SoundType.CALCITE;
            case DRIPSTONE_BLOCK -> SoundType.DRIPSTONE_BLOCK;
            case STONE -> SoundType.STONE;
            case TUFF_BRICKS -> SoundType.STONE;
            case PACKED_MUD -> SoundType.PACKED_MUD;
            case MUD_BRICKS -> SoundType.MUD_BRICKS;
            case RESIN_BRICKS, CINNABAR, SULFUR -> SoundType.STONE;
            case DEEPSLATE -> SoundType.DEEPSLATE;
            case DEEPSLATE_BRICKS -> SoundType.DEEPSLATE_BRICKS;
            case DEEPSLATE_TILES -> SoundType.DEEPSLATE_TILES;
            case POLISHED_DEEPSLATE -> SoundType.POLISHED_DEEPSLATE;
            case NETHERRACK -> SoundType.NETHERRACK;
            case NETHER_BRICKS -> SoundType.NETHER_BRICKS;
            case BASALT -> SoundType.BASALT;
            case SNOW -> SoundType.SNOW;
            case GLASS -> SoundType.GLASS;
        });
        spec.mapColor().ifPresent(value -> properties.mapColor(switch (value) {
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
        spec.instrument().ifPresent(value -> properties.instrument(switch (value) { case BASEDRUM -> NoteBlockInstrument.BASEDRUM; }));
        if (spec.requiresCorrectToolForDrops()) properties.requiresCorrectToolForDrops();
        if (spec.noCollision()) properties.noCollission();
        if (spec.destroyOnPush()) properties.pushReaction(PushReaction.DESTROY);
        if (spec.forceSolidOn()) properties.forceSolidOn();
        return properties;
    }

    private static final class CompatPressurePlateBlock extends PressurePlateBlock {
        private CompatPressurePlateBlock(BlockBehaviour.Properties properties) {
            super(BlockSetType.STONE, properties);
        }
    }

    private static final class CompatButtonBlock extends ButtonBlock {
        private CompatButtonBlock(int ticks, BlockBehaviour.Properties properties) {
            super(BlockSetType.STONE, ticks, properties);
        }
    }

}
