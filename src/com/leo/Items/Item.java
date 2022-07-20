package com.leo.Items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Item {

    public ItemStack getItem(String itemName){
        if(itemName.equalsIgnoreCase("bloodBook")){
            ItemStack bloodBook = new ItemStack(Material.BOOK,1);
            ItemMeta meta = bloodBook.getItemMeta();
            meta.setDisplayName("§c回血书");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("手持回血,每10秒回1滴");
            meta.setLore(lore);
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            bloodBook.setItemMeta(meta);
            return bloodBook;
        }else if(itemName.equalsIgnoreCase("hookGems")){
            ItemStack hookGems = new ItemStack(Material.DIAMOND,1);
            ItemMeta meta = hookGems.getItemMeta();
            meta.setDisplayName("掛機寶石");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("手持寶石持續加經驗,每10秒加100經驗");
            meta.setLore(lore);
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            hookGems.setItemMeta(meta);
            return hookGems;
        }
        return null;
    }
    
}
