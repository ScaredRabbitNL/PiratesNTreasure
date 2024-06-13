package io.github.scaredsmods.piratesntreasure.item;

import io.github.scaredsmods.piratesntreasure.item.custom.EyePatchItem;
import io.github.scaredsmods.piratesntreasure.util.ItemRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Rarity;

public class PSTItems {

    public static final Item PIRATE_HAT = ItemRegistry.registerItems("pirate_hat",
            new Item(new Item.Settings().rarity(Rarity.COMMON)));

    public static final Item WOOD_MACHETE = ItemRegistry.registerItems("wooden_machete",
           new SwordItem(ToolMaterials.WOOD, 7, -1.5F, new FabricItemSettings()));

    public static final Item STONE_MACHETE = ItemRegistry.registerItems("stone_machete",
            new SwordItem(ToolMaterials.STONE, 7, -1.5F, new FabricItemSettings()));

    public static final Item IRON_MACHETE = ItemRegistry.registerItems("iron_machete",
            new SwordItem(ToolMaterials.IRON, 7, -1.5F, new FabricItemSettings()));

    public static final Item GOLD_MACHETE = ItemRegistry.registerItems("golden_machete",
            new SwordItem(ToolMaterials.IRON, 7, -1.5F, new FabricItemSettings()));

    public static final Item DIAMOND_MACHETE = ItemRegistry.registerItems("diamond_machete",
            new SwordItem(ToolMaterials.IRON, 7, -1.5F, new FabricItemSettings()));

    public static final Item NETHERITE_MACHETE = ItemRegistry.registerItems("netherite_machete",
            new SwordItem(ToolMaterials.IRON, 7, -1.5F, new FabricItemSettings().fireproof()));


    public static final Item EYE_PATCH = ItemRegistry.registerItems("eye_patch",
            new EyePatchItem(new FabricItemSettings()));

    public static void registerPSTItems() {

    }
}
