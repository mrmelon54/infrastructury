package com.mrmelon54.infrastructury.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;

public interface ConfigScreenRegistrar {
    Screen registerConfigScreen(Minecraft mc, Screen screen);
}
