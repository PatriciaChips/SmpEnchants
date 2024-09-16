package org.pat.smpEnchants.Enums;

import org.bukkit.Material;
import org.bukkit.Tag;
import org.pat.pattyEssentialsV3.ColoredText;
import org.pat.smpEnchants.Methods.EnchantUtils;

public enum Enchants {

    speed("Swift Feet", new String[]{""}, 5, new Tag[]{EnchantUtils.boots});

    private String displayName;
    private String[] lore;
    private Integer maxLevel;
    private Tag[] acceptedItems;

    Enchants(String displayName, String[] lore, Integer maxLevel, Tag[] acceptedItems) {
        this.displayName = displayName;
        this.lore = lore;
        this.maxLevel = maxLevel;
        this.acceptedItems = acceptedItems;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String[] getLore() {
        return lore;
    }

    public Integer getMaxLevel() {
        return maxLevel;
    }

    public Tag[] getAcceptedItems() {
        return acceptedItems;
    }
}
