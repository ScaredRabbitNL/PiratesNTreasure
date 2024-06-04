package io.github.scaredsmods.piratesntreasure.util;

import io.github.scaredsmods.piratesntreasure.Constants;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistry {


    public static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Constants.MOD_ID, name), item);
    }
}
