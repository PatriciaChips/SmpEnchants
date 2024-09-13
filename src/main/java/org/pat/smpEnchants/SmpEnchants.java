package org.pat.smpEnchants;

import org.bukkit.plugin.java.JavaPlugin;
import org.pat.smpEnchants.Commands.Test;

public final class SmpEnchants extends JavaPlugin {

    /**
     * Utils class is imported from v3
     * Method classes can be called from here such as
     * Utils.p (Player methods)
     * Utils.i (Itemstack methods)
     * Utils.t (Text methods)
     */

    @Override
    public void onEnable() {

        getCommand("test").setExecutor(new Test());

    }

    @Override
    public void onDisable() {

        //getServer().getPluginManager().registerEvents(new InteractEvent(), this);

    }
}
