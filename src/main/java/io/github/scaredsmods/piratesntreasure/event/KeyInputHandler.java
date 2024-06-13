package io.github.scaredsmods.piratesntreasure.event;

import io.github.scaredsmods.piratesntreasure.PSTHud;
import io.github.scaredsmods.piratesntreasure.config.screen.MyFirstScreen;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {

    public static final String KEY_DRINK_WATER = "key.tutorialmod.drink_water";

    public static KeyBinding drinkingKey = new KeyBinding(KEY_DRINK_WATER, GLFW.GLFW_KEY_H, "key.categories.misc");

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(drinkingKey.wasPressed()) {
                // This happens when our custom key is pressed
                client.setScreen(new MyFirstScreen());
            }
        });
    }

    public static void register() {
        PSTHud.addHuds();
        registerKeyInputs();
    }


}