package net.cinchtail.cinchsmissingblocks.item;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public class ModItems {

    public static final Item RED_NETHER_BRICK = registerItem("red_nether_brick", new Item(new Item.Settings()));
    public static final Item BLUE_NETHER_BRICK = registerItem("blue_nether_brick", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CinchsMissingBlocks.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CinchsMissingBlocks.LOGGER.info("Registering ModItems for " + MOD_ID);
    }
}