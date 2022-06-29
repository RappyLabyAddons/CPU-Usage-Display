package com.rappytv.cpuinfo.modules.cpu;

import com.rappytv.cpuinfo.main.Main;
import com.rappytv.cpuinfo.modules.Category;
import net.labymod.ingamegui.ModuleCategory;
import net.labymod.ingamegui.moduletypes.SimpleModule;
import net.labymod.settings.elements.ControlElement;

import net.minecraft.util.ResourceLocation;


public class PercentUsageModule extends SimpleModule {

    @Override
    public String getDisplayName() {
        return "CPU";
    }

    @Override
    public String getDisplayValue() {
        return ((int) (Main.os.getSystemCpuLoad() * 100)) + "%";
    }

    @Override
    public String getDefaultValue() {
        return "9%";
    }

    @Override
    public ControlElement.IconData getIconData() {
        return new ControlElement.IconData(new ResourceLocation("cpuinfo/textures/modules/percentage.png"));
    }

    @Override
    public void loadSettings() {}

    @Override
    public String getSettingName() {
        return "cpu_usage";
    }

    @Override
    public String getControlName() {
        return "CPU Usage";
    }

    @Override
    public String getDescription() {
        return "Displays the current CPU Usage.";
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
