package net.cinchtail.cinchsmissingblocks.item;

import net.cinchtail.cinchsmissingblocks.CinchsMissingBlocksNeoForge;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.cinchtail.cinchsmissingblocks.CinchsMissingBlocksNeoForge.MOD_ID;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CinchsMissingBlocksNeoForge.MOD_ID);

    public static final DeferredItem<Item> RED_NETHER_BRICK = ITEMS.registerSimpleItem("red_nether_brick");
    public static final DeferredItem<Item> BLUE_NETHER_BRICK = ITEMS.registerSimpleItem("blue_nether_brick");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        CinchsMissingBlocksNeoForge.LOGGER.info("Registering ModItems for NeoForge" + MOD_ID);
    }
}