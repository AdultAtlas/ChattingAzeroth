package me.eclecticboogaloo.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin {
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onChat(AsyncPlayerChatEvent e) {
		String playerMessage = e.getMessage();
		e.setCancelled(true);
		if (e.getMessage().startsWith("((")) 
			for (Player p : Bukkit.getServer().getOnlinePlayers())
				p.sendMessage(e.getPlayer().getName() + "" + ChatColor.GOLD + (playerMessage.substring(2)));
		else if (playerMessage.startsWith("*")) {
			ChatUtils.emotify(e.getMessage());
		}
		else if (playerMessage.startsWith("\"")) {
			ChatUtils.chatify(e.getMessage());
		}

		//for (Entity p : e.getPlayer().getNearbyEntities(1, 1, 1))
			//if (p instanceof Player) {
				//p.sendMessage("test");
			//}
	}
	
}
