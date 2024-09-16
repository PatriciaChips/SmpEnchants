package org.pat.smpEnchants.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.pat.pattyEssentialsV3.Listeners.Enchant;
import org.pat.pattyEssentialsV3.Utils;
import org.pat.smpEnchants.Enums.Enchants;
import org.pat.smpEnchants.Methods.EnchantUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test implements TabExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String cmd, String[] args) {

        if (sender instanceof Player p) { /** Keep clear if not under use (used as a template) */

            p.getInventory().addItem(Utils.i.createItemstack("", Material.ENCHANTED_BOOK, 1, Arrays.stream(new String[]{"&7" + Enchants.speed.getDisplayName()}).toList(), null, false, true));

        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String cmd, String[] args) {
        List<String> arguments = new ArrayList<>();

        return arguments;
    }
}
