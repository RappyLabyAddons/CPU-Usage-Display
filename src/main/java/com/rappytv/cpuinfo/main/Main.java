package com.rappytv.cpuinfo.main;

import com.rappytv.cpuinfo.modules.Category;
import com.rappytv.cpuinfo.modules.cpu.CoreModule;
import com.rappytv.cpuinfo.modules.cpu.PercentUsageModule;
import com.sun.management.OperatingSystemMXBean;
import net.labymod.api.LabyModAddon;
import net.labymod.ingamegui.ModuleCategoryRegistry;
import net.labymod.settings.elements.BooleanElement;
import net.labymod.settings.elements.ControlElement;
import net.labymod.settings.elements.SettingsElement;
import net.labymod.utils.Consumer;
import net.minecraft.util.ResourceLocation;

import java.lang.management.ManagementFactory;
import java.util.List;

public class Main extends LabyModAddon {

    public static final OperatingSystemMXBean os = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
    public static boolean hyper = false;

    @Override
    public void onEnable() {
        ModuleCategoryRegistry.loadCategory(new Category());
        getApi().registerModule(new PercentUsageModule());
        getApi().registerModule(new CoreModule());
    }

    @Override
    public void loadConfig() {
        hyper = getConfig().has("hyperthreading") ? getConfig().get("hyperthreading").getAsBoolean() : hyper;
    }

    @Override
    protected void fillSettings(List<SettingsElement> list) {
        BooleanElement hyperbool = new BooleanElement("Is your CPU hyperthreading?", new ControlElement.IconData(new ResourceLocation("cpuinfo/textures/settings/portal.png")), new Consumer<Boolean>() {
            @Override
            public void accept(Boolean accepted) {
                hyper = accepted;

                getConfig().addProperty("hyperthreading", hyper);
                saveConfig();
            }
        }, hyper);

        list.add(hyperbool);
    }
}
