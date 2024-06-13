package io.github.scaredsmods.piratesntreasure;

import com.mojang.datafixers.kinds.Const;
import io.github.scaredsmods.piratesntreasure.event.KeyInputHandler;
import io.wispforest.owo.ui.component.Components;
import io.wispforest.owo.ui.container.Containers;
import io.wispforest.owo.ui.core.*;
import io.wispforest.owo.ui.hud.Hud;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

public class PSTHud {

    public static void addHuds() {
        Hud.add(new Identifier(Constants.MOD_ID, "hint"), () ->
                (Component) Containers.verticalFlow(Sizing.content(), Sizing.content())
                        .child(Components.label(
                                Text.empty()
                                        .append(Text.literal("! ").formatted(Formatting.YELLOW, Formatting.BOLD))
                                        .append(" Press ")
                                        .append(KeyBindingHelper.getBoundKeyOf(KeyInputHandler.drinkingKey).getLocalizedText().copy().formatted(Formatting.BLUE))
                                        .append(" to\nbegin owo-ui Academy")
                        ).horizontalTextAlignment(HorizontalAlignment.CENTER).shadow(true))
                        .surface(Surface.flat(0x77000000).and(Surface.outline(0xFF121212)))
                        .padding(Insets.of(5))
                        .positioning(Positioning.relative(100, 35))
                        .mouseLeave()
        );

    }



}
