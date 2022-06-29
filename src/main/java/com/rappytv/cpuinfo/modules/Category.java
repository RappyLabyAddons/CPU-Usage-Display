package com.rappytv.cpuinfo.modules;

import net.labymod.ingamegui.ModuleCategory;
import net.labymod.settings.elements.ControlElement;
import net.minecraft.util.ResourceLocation;

public class Category extends ModuleCategory {


    public Category() {
        super("CPU Info", true, new ControlElement.IconData(new ResourceLocation("cpuinfo/textures/icon.png")));
    }
}
