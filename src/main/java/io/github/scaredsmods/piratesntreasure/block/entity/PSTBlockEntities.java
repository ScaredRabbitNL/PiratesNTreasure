package io.github.scaredsmods.piratesntreasure.block.entity;

import io.github.scaredsmods.piratesntreasure.Constants;
import io.github.scaredsmods.piratesntreasure.block.PSTBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PSTBlockEntities {

    public static BlockEntityType<TreasureChestBlockEntity> TREASURE_CHEST_TYPE;

    public static void registerPSTBlockEntityTypes() {
        TREASURE_CHEST_TYPE = Registry.register(
                Registries.BLOCK_ENTITY_TYPE, new Identifier(Constants.MOD_ID, "treasure_chest_be"),
                FabricBlockEntityTypeBuilder.create(TreasureChestBlockEntity::new, PSTBlocks.TREASURE_CHEST)
                        .build()
        );
    }
}
