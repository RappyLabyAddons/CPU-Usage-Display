package com.rappytv.cpuinfo.modules.cpu;

import com.rappytv.cpuinfo.main.Main;
import com.rappytv.cpuinfo.modules.Category;
import net.labymod.ingamegui.ModuleCategory;
import net.labymod.ingamegui.moduletypes.SimpleModule;
import net.labymod.settings.elements.ControlElement;
import net.minecraft.util.ResourceLocation;

public class CoreModule extends SimpleModule {

    @Override
    public String getDisplayName() {
        return "Cores";
    }

    @Override
    public String getDisplayValue() {
        int cores = Runtime.getRuntime().availableProcessors();
        if(Main.hyper) cores /= 2;
        return String.valueOf(cores);
    }

    @Override
    public String getDefaultValue() {
        return "4";
    }

    @Override
    public ControlElement.IconData getIconData() {
        return new ControlElement.IconData(new ResourceLocation("cpuinfo/textures/modules/cores.png"));
    }

    @Override
    public void loadSettings() {}

    @Override
    public String getSettingName() {
        return "cpu_cores";
    }

    @Override
    public String getControlName() {
        return "CPU Cores";
    }

    @Override
    public String getDescription() {
        return "Displays the quantity of cores your CPU has.";
    }

    @Override
    public int getSortingId() {
        return 7;
    }

    @Override
    public ModuleCategory getCategory() {
        return new Category();
    }
}
