package io.github.scaredsmods.piratesntreasure.util;

import io.github.scaredsmods.piratesntreasure.Constants;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockRegistry {

    public static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Constants.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static Block registerBlock (String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Constants.MOD_ID, name), block);
    }
}
