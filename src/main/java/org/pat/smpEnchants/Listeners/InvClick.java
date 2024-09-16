package org.pat.smpEnchants.Listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.pat.pattyEssentialsV3.ColoredText;
import org.pat.pattyEssentialsV3.Enums.MenuEnum;
import org.pat.pattyEssentialsV3.Utils;
import org.pat.smpEnchants.Enums.Enchants;
import org.pat.smpEnchants.Methods.EnchantUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class InvClick implements Listener {

    @EventHandler
    public void invClick(InventoryClickEvent e) {

        Player p = (Player) e.getWhoClicked();

        ItemStack heldItem = null;
        if (e.getCursor() != null)
            heldItem = e.getCursor();

        ItemStack clickedItem = null;
        if (e.getCurrentItem() != null)
            clickedItem = e.getCurrentItem();

        if (heldItem != null && clickedItem != null) {
            if (heldItem.getItemMeta() != null && clickedItem.getItemMeta() != null) {
                if (EnchantUtils.containsCustomEnchant(heldItem)) { //checking if the item is a enchant book with a custom enchant
                    LinkedHashMap<Enchants, Integer> enchants = EnchantUtils.getCustomEnchants(heldItem); //get a map of all the enchants contained on the book and the level they have
                    ItemMeta itemMeta = clickedItem.getItemMeta();
                    List<String> lore = new ArrayList<>();
                    if (itemMeta.hasLore())
                    lore.addAll(itemMeta.getLore());

                    Utils.log(enchants.size() + " | ");

                    if (enchants.size() > 0) {
                        for (Enchants keys : enchants.keySet()) {
                            lore.add(ColoredText.t("&7" + keys.getDisplayName() + " " + ((enchants.get(keys) > 0) ? enchants.get(keys):"")));
                        }
                        heldItem.setType(Material.AIR);
                        itemMeta.setLore(lore);
                        clickedItem.setItemMeta(itemMeta);
                        e.setCancelled(true);
                    } else {
                        p.sendMessage(Utils.fMsg("no custom enchants"));
                    }
                } else {
                    p.sendMessage(Utils.fMsg("fatass1"));
                }
            }
        } else {
            p.sendMessage(Utils.fMsg("fatass"));
        }

    }

}
