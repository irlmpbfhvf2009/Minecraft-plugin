package com.leo.Listener;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.leo.Items.Item;

public class GiveItemsOnPlayerJoinServer implements Listener{
    private Item items = new Item();
    
    public void onPlayJoinServer(PlayerJoinEvent event){
        for(int i=0;i<event.getPlayer().getInventory().getSize();i++){
            if(!event.getPlayer().getInventory().contains(items.getItem("bloodBook"))){
                event.getPlayer().getInventory().addItem(items.getItem("bloodBook"));
                event.getPlayer().sendMessage(ChatColor.AQUA+"獲得了一本回血書!");
            }else if(!event.getPlayer().getInventory().contains(items.getItem("hookGems"))){
                event.getPlayer().getInventory().addItem(items.getItem("hookGems"));
                event.getPlayer().sendMessage(ChatColor.AQUA+"獲得了一顆掛機寶石!");
            }
        }
    }
}
