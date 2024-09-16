package org.pat.smpEnchants;

import org.bukkit.plugin.java.JavaPlugin;
import org.pat.pattyEssentialsV3.Utils;
import org.pat.smpEnchants.Commands.Test;
import org.pat.smpEnchants.Listeners.InvClick;

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

        /** Commands */
        getCommand("test").setExecutor(new Test());

        /** Listeners */
        getServer().getPluginManager().registerEvents(new InvClick(), this);

    }

    @Override
    public void onDisable() {

    }
}
