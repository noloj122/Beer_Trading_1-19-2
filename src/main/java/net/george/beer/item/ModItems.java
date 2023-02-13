package net.george.beer.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.george.beer.BeerClient;
import net.george.beer.beer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ALCOHOL_PERMIT = registerItem("alcohol_permit",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(beer.MOD_ID, name), item);
    }



    public static void registerModItems() {

    }
}
