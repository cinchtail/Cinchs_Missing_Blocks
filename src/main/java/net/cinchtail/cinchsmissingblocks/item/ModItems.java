package net.cinchtail.cinchsmissingblocks.item;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocks.MOD_ID;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredItem<Item> RED_NETHER_BRICK = ITEMS.register("red_nether_brick", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLUE_NETHER_BRICK = ITEMS.register("blue_nether_brick", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        CinchsMissingBlocks.LOGGER.info("Registering ModItems for " + MOD_ID);
    }
}