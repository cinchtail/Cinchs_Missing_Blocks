package net.cinchtail.cinchsmissingblocks.item;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocksNeoForge.MOD_ID;

public class ModItems {
    private static final Map<Identifier, Item> ITEMS = new LinkedHashMap<>();

    public static final Item RED_NETHER_BRICK = registerItem("red_nether_brick", Item::new);
    public static final Item BLUE_NETHER_BRICK = registerItem("blue_nether_brick", Item::new);


    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        Identifier id = Identifier.fromNamespaceAndPath(MOD_ID, name);
        Item item = function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id)));
        ITEMS.put(id, item); return item;
    }
    public static void registerItems() {
        ITEMS.forEach((id, value) -> Registry.register(BuiltInRegistries.ITEM, id, value));
        CinchsMissingBlocks.LOGGER.info("Registered {} standalone items for {}", ITEMS.size(), MOD_ID);
    }
}