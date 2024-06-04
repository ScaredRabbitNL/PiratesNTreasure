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
            new Identifier(Constants.MOD_ID, Constants.PST_G_I),
            FabricItemGroup.builder().displayName(Text.translatable(Constants.PST_G_I_T))
                    .icon(() -> new ItemStack(PSTItems.DIAMOND_MACHETE)) .entries((displayContext, entries) -> {
                        entries.add(PSTItems.WOOD_MACHETE);
                        entries.add(PSTItems.STONE_MACHETE);
                        entries.add(PSTItems.IRON_MACHETE);
                        entries.add(PSTItems.GOLD_MACHETE);
                        entries.add(PSTItems.DIAMOND_MACHETE);
                        entries.add(PSTItems.NETHERITE_MACHETE);
                        entries.add(PSTItems.PIRATE_HAT);
                        entries.add(PSTBlocks.TREASURE_CHEST);
                    }).build());

    public static void registerPSTItemGroups() {

    }
}
