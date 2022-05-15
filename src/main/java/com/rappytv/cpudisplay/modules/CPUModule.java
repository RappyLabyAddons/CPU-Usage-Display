package com.rappytv.cpudisplay.modules;

import net.labymod.ingamegui.ModuleCategory;
import net.labymod.ingamegui.ModuleCategoryRegistry;
import net.labymod.ingamegui.moduletypes.SimpleModule;
import net.labymod.settings.elements.ControlElement;

import com.sun.management.OperatingSystemMXBean;
import net.minecraft.util.ResourceLocation;

import java.lang.management.ManagementFactory;

public class CPUModule extends SimpleModule {

    private final OperatingSystemMXBean os = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

    @Override
    public String getDisplayName() {
        return "CPU";
    }

    @Override
    public String getDisplayValue() {
        return ((int) (os.getSystemCpuLoad() * 100)) + "%";
    }

    @Override
    public String getDefaultValue() {
        return String.valueOf(0);
    }

    @Override
    public ControlElement.IconData getIconData() {
        return new ControlElement.IconData(new ResourceLocation("cpu_usage/textures/icon.png"));
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
        return "Displays the current CPU Usage on your screen.";
    }

    @Override
    public int getSortingId() {
        return 7;
    }

    @Override
    public ModuleCategory getCategory() {
        return ModuleCategoryRegistry.CATEGORY_INFO;
    }
}
