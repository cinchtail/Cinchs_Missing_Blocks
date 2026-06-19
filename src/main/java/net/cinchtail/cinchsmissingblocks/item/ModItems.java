package net.cinchtail.cinchsmissingblocks.item;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    public static final Item RED_NETHER_BRICK = registerItem("red_nether_brick", Item::new);
    public static final Item BLUE_NETHER_BRICK = registerItem("blue_nether_brick", Item::new);


    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(CinchsMissingBlocks.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CinchsMissingBlocks.MOD_ID, name)))));
    }
    public static void registerModItems() {
        CinchsMissingBlocks.LOGGER.info("Registering Mod Items for " + CinchsMissingBlocks.MOD_ID);
    }
}