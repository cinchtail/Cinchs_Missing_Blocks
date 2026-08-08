package net.cinchtail.cinchsmissingblocks.common;

import net.cinchtail.cinchsmissingblocks.common.catalog.ContentCatalog;
import net.cinchtail.cinchsmissingblocks.common.id.ResourceId;
import net.cinchtail.cinchsmissingblocks.common.item.ItemSpec;

public final class StandardItemsContent {
    private StandardItemsContent() {
    }

    public static void contribute(ContentCatalog.Builder catalog) {
        catalog.item(ItemSpec.flat(ResourceId.mod("red_nether_brick")));
        catalog.item(ItemSpec.flat(ResourceId.mod("blue_nether_brick")));
    }
}
