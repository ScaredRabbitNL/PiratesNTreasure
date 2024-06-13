package io.github.scaredsmods.piratesntreasure.block;

import io.github.scaredsmods.piratesntreasure.block.custom.TreasureBarrelBlock;
import io.github.scaredsmods.piratesntreasure.util.BlockRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class PSTBlocks {

    public static final Block TREASURE_BARREL = BlockRegistry.registerBlock("treasure_barrel",
            new TreasureBarrelBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static void registerPSTBlocks() {

    }
}
