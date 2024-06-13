package io.github.scaredsmods.piratesntreasure.datagen;

import io.github.scaredsmods.piratesntreasure.block.PSTBlocks;
import io.github.scaredsmods.piratesntreasure.item.PSTItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class PSTModelProvider extends FabricModelProvider {
    public PSTModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(PSTBlocks.TREASURE_BARREL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {


        itemModelGenerator.register(PSTItems.WOOD_MACHETE, Models.HANDHELD);
        itemModelGenerator.register(PSTItems.STONE_MACHETE, Models.HANDHELD);
        itemModelGenerator.register(PSTItems.GOLD_MACHETE, Models.HANDHELD);
        itemModelGenerator.register(PSTItems.IRON_MACHETE, Models.HANDHELD);
        itemModelGenerator.register(PSTItems.DIAMOND_MACHETE, Models.HANDHELD);
        itemModelGenerator.register(PSTItems.NETHERITE_MACHETE, Models.HANDHELD);

    }
}
