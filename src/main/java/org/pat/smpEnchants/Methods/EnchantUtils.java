package org.pat.smpEnchants.Methods;

import it.unimi.dsi.fastutil.Hash;
import org.bukkit.ChatColor;
import org.bukkit.Tag;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.pat.pattyEssentialsV3.ColoredText;
import org.pat.pattyEssentialsV3.Utils;
import org.pat.smpEnchants.Enums.Enchants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class EnchantUtils {

    public static Tag boots = Tag.ITEMS_FOOT_ARMOR;
    public static Tag legs = Tag.ITEMS_LEG_ARMOR;
    public static Tag chestplate = Tag.ITEMS_CHEST_ARMOR;
    public static Tag helmet = Tag.ITEMS_HEAD_ARMOR;
    public static Tag swords = Tag.ITEMS_SWORDS;
    public static Tag axes = Tag.ITEMS_AXES;
    public static Tag pickaxes = Tag.ITEMS_PICKAXES;

    /** need to add crossbows and bows */

    public static boolean containsCustomEnchant(ItemStack item) {

        ItemMeta itemMeta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        if (itemMeta.hasLore())
        for (String str : itemMeta.getLore()) {
            lore.add(ChatColor.stripColor(str));
        }

        for (Enchants enchants : Enchants.values()) {
            if (lore.contains(enchants.getDisplayName()))
                return true;
        }

        return false;
    }

    public static LinkedHashMap<Enchants, Integer> getCustomEnchants(ItemStack item) {
        LinkedHashMap<Enchants, Integer> customEnchants = new LinkedHashMap<>();

        ItemMeta itemMeta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        for (String str : itemMeta.getLore()) {
            lore.add(ChatColor.stripColor(str));
        }

        for (String loree : lore) {
            for (Enchants enchants : Enchants.values()) { //lore.indexOf(ColoredText.t(enchants.getDisplayName())
                if (loree.contains(ColoredText.t(enchants.getDisplayName()))) {
                    Utils.log("check");
                    String guh = ChatColor.stripColor(loree);
                    guh = guh.replace(enchants.getDisplayName(), "");
                    guh = guh.replace(" ", "");
                    customEnchants.put(enchants, numeralTOInt(guh));
                }
            }
        }

        Utils.log(customEnchants.size() + "");

        return customEnchants;
    }

    public static int numeralTOInt(String str) {
        switch (str.toLowerCase()) {
            case "i":
                return 1;
            case "ii":
                return 2;
            case "iii":
                return 3;
            case "iv":
                return 4;
            case "v":
                return 5;
            case "vi":
                return 6;
            case "vii":
                return 7;
            case "viii":
                return 8;
            case "ix":
                return 9;
            case "x":
                return 10;
            default:
                return 0;
        }
    }

}
