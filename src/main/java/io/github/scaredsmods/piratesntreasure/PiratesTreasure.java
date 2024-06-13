package io.github.scaredsmods.piratesntreasure;

import io.github.scaredsmods.piratesntreasure.block.PSTBlocks;
import io.github.scaredsmods.piratesntreasure.block.entity.PSTBlockEntities;

import io.github.scaredsmods.piratesntreasure.config.PSTConfigWrapper;
import io.github.scaredsmods.piratesntreasure.item.PSTItemGroups;
import io.github.scaredsmods.piratesntreasure.item.PSTItems;
import io.wispforest.owo.Owo;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PiratesTreasure implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger(Constants.MOD_ID);
	public static PSTConfigWrapper CONFIG_WRAPPER;


	@Override
	public void onInitialize() {

		PSTBlockEntities.registerPSTBlockEntityTypes();
		PSTItems.registerPSTItems();
		PSTItemGroups.registerPSTItemGroups();
		PSTBlocks.registerPSTBlocks();

		CONFIG_WRAPPER = PSTConfigWrapper.createAndLoad();

		LOGGER.info(Constants.MOD_ID + " has finished loading!");
	}
}