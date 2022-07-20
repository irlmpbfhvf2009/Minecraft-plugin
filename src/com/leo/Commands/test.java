package com.leo.Commands;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.leo.Main;

public class test implements CommandExecutor {

    public test(Main main) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        p.setWalkSpeed((float) 0.30);
        if (label.equalsIgnoreCase("test")) {
            if (args.length == 0) {
                p.sendMessage(ChatColor.RED + "請輸入物品編號!");
                return true;
            }
            String a = args[0];
            switch (a) {
                case "001":
                    p.getInventory().addItem(item01());
                    break;
                default:
                    p.sendMessage(ChatColor.RED + "無此物品編號!");
            }
            return true;
        }
        return false;
    }

    public ItemStack item01() {
        // 宣告物品
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        // 設置物品的名字跟敘述
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(ChatColor.GOLD + "破邪之劍");
        im.setLore(Arrays.asList(ChatColor.WHITE + "擁有強大力量的劍", ChatColor.RED + "非常危險!"));
        item.setItemMeta(im);

        return item;
    }
}