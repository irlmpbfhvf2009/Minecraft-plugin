package com.leo;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import com.leo.Commands.test;
import com.leo.Listener.GiveItemsOnPlayerJoinServer;

public class Main extends JavaPlugin {

    public void onEnable() {
        setupCommands();
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN+"CustomItems&onJoinServer has been Enable!");
        getServer().getPluginManager().registerEvents(new GiveItemsOnPlayerJoinServer(),this);
        getLogger().info("插件啟動中...");
    }

    public void onDisable() {
        getLogger().info("插件關閉完成");
    }

    public void setupCommands() {
        getCommand("test").setExecutor(new test(this));
    }


}
