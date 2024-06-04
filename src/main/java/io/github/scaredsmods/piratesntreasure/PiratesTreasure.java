package io.github.scaredsmods.piratesntreasure;

import io.github.scaredsmods.piratesntreasure.block.PSTBlocks;
import io.github.scaredsmods.piratesntreasure.block.entity.PSTBlockEntities;
import io.github.scaredsmods.piratesntreasure.block.entity.TreasureChestBlockEntity;
import io.github.scaredsmods.piratesntreasure.item.PSTItemGroups;
import io.github.scaredsmods.piratesntreasure.item.PSTItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PiratesTreasure implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger(Constants.MOD_ID);


	@Override
	public void onInitialize() {

		PSTBlockEntities.registerPSTBlockEntityTypes();
		PSTItems.registerPSTItems();
		PSTItemGroups.registerPSTItemGroups();
		PSTBlocks.registerPSTBlocks();

		LOGGER.info(Constants.MOD_ID + " has finished loading!");
	}
}