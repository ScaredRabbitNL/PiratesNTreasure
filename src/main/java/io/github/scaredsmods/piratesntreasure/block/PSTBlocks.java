package io.github.scaredsmods.piratesntreasure.block;

import io.github.scaredsmods.piratesntreasure.block.custom.TreasureChestBlock;
import io.github.scaredsmods.piratesntreasure.util.BlockRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class PSTBlocks {

    public static final Block TREASURE_CHEST = BlockRegistry.registerBlock("treasure_chest",
            new TreasureChestBlock(FabricBlockSettings.copyOf(Blocks.BARREL)));

    public static void registerPSTBlocks() {

    }
}
