package net.cinchtail.cinchsmissingblocks.common;

import net.cinchtail.cinchsmissingblocks.common.catalog.ContentCatalog;

public final class CmbContent {
    public static final String MOD_ID = "cinchsmissingblocks";
    public static final ContentCatalog CATALOG = createCatalog();

    private CmbContent() {
    }

    private static ContentCatalog createCatalog() {
        ContentCatalog.Builder catalog = ContentCatalog.builder();
        CalciteContent.contribute(catalog);
        DripstoneContent.contribute(catalog);
        TuffContent.contribute(catalog);
        AndesiteContent.contribute(catalog);
        GraniteContent.contribute(catalog);
        DioriteContent.contribute(catalog);
        QuartzContent.contribute(catalog);
        StandardBlocksContent.contribute(catalog);
        SpecialBlocksContent.contribute(catalog);
        ColoredVariantsContent.contribute(catalog);
        StandardItemsContent.contribute(catalog);
        StandardRecipesContent.contribute(catalog);
        CreativeContent.contribute(catalog);
        BuiltinPacksContent.contribute(catalog);
        return catalog.build();
    }
}
