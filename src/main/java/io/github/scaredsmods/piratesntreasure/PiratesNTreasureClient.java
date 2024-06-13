package io.github.scaredsmods.piratesntreasure;

import io.github.scaredsmods.piratesntreasure.event.KeyInputHandler;
import net.fabricmc.api.ClientModInitializer;

public class PiratesNTreasureClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();
    }
}
