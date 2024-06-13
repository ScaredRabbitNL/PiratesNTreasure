package io.github.scaredsmods.piratesntreasure.item;

import io.github.scaredsmods.piratesntreasure.Constants;
import io.github.scaredsmods.piratesntreasure.block.PSTBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class PSTItemGroups {



    //TODO: Change the icon to pirate hat
    public static final ItemGroup PST_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Constants.MOD_ID, Constants.PIRATESNTREASURE_ITEMS_TAB),
            FabricItemGroup.builder().displayName(Text.translatable(Constants.PIRATESNTREASURE_ITEMS_TAB_TRANSLATION))
                    .icon(() -> new ItemStack(PSTItems.DIAMOND_MACHETE)) .entries((displayContext, entries) -> {
                        entries.add(PSTItems.WOOD_MACHETE);
                        entries.add(PSTItems.STONE_MACHETE);
                        entries.add(PSTItems.IRON_MACHETE);
                        entries.add(PSTItems.GOLD_MACHETE);
                        entries.add(PSTItems.DIAMOND_MACHETE);
                        entries.add(PSTItems.NETHERITE_MACHETE);
                        entries.add(PSTItems.PIRATE_HAT);
                    }).build());

    public static final ItemGroup PST_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Constants.MOD_ID, Constants.PIRATESNTREASURE_BLOCKS_TAB),
            FabricItemGroup.builder().displayName(Text.translatable(Constants.PIRATESNTREASURE_BLOCKS_TAB_TRANSLATION))
                    .icon(() -> new ItemStack(PSTBlocks.TREASURE_BARREL)).entries((displayContext, entries) -> {
                        entries.add(PSTBlocks.TREASURE_BARREL);
                    }).build());

    public static void registerPSTItemGroups() {

    }
}
