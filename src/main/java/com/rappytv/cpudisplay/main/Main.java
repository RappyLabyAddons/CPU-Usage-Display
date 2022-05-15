package com.rappytv.cpudisplay.main;

import com.rappytv.cpudisplay.modules.CPUModule;
import net.labymod.api.LabyModAddon;
import net.labymod.settings.elements.SettingsElement;

import java.util.List;

public class Main extends LabyModAddon {

    @Override
    public void onEnable() {
        this.getApi().registerModule(new CPUModule());
    }

    @Override
    public void loadConfig() {}

    @Override
    protected void fillSettings(List<SettingsElement> list) {}
}
