package org.pat.smpEnchants.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.pat.pattyEssentialsV3.Utils;

import java.util.ArrayList;
import java.util.List;

public class Test implements TabExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String cmd, String[] args) {

        if (sender instanceof Player p) { /** Keep clear if not under use (used as a template) */

//a=brhhbdawdawd

        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String cmd, String[] args) {
        List<String> arguments = new ArrayList<>();

        return arguments;
    }
}
