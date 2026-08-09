package net.cinchtail.cinchsmissingblocks.item;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;
import net.minecraft.core.registries.BuiltInRegistries;
import java.util.LinkedHashMap;
import java.util.Map;

public class ModItems {
    private static final Map<ResourceLocation, Item> CINCHS_ITEMS = new LinkedHashMap<>();

    public static final Item RED_NETHER_BRICK = registerItem("red_nether_brick", new Item(new Item.Properties()));
    public static final Item BLUE_NETHER_BRICK = registerItem("blue_nether_brick", new Item(new Item.Properties()));


    private static Item registerItem(String name, Item item) { ResourceLocation id=ResourceLocation.fromNamespaceAndPath(MOD_ID,name); CINCHS_ITEMS.put(id,item); return item; }
    public static void registerItems() {
        CINCHS_ITEMS.forEach((id, value) -> Registry.register(BuiltInRegistries.ITEM, id, value));
        CinchsMissingBlocks.LOGGER.info("Registered {} standalone items for {}", CINCHS_ITEMS.size(), MOD_ID);
    }
}
