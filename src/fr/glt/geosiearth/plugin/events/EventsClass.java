package fr.glt.geosiearth.plugin.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.glt.geosiearth.plugin.PluginGE;

public class EventsClass implements Listener {
	
	private PluginGE mainlink;
	
	public EventsClass(PluginGE pluginGE) {
		this.mainlink = pluginGE;
 	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();

		e.setJoinMessage(mainlink.getConfig().getString("messages.join").replace("%player%", p.getDisplayName()).replace("&", "§"));
		String title = mainlink.getConfig().getString("messages.splashtitle").replace("%player%", p.getDisplayName()).replace("&", "§");
		String desc = mainlink.getConfig().getString("messages.splashdesc").replace("%player%", p.getDisplayName()).replace("&", "§");
		p.sendTitle(title, desc, 2, 40, 2);	
		if(p.hasPlayedBefore() == true) {
			System.out.println(p.getDisplayName() + " haves already joined the server before.");
		}else {
			Bukkit.broadcastMessage(mainlink.getConfig().getString("messages.firstjoinmess").replace("%player%", p.getDisplayName()).replace("&", "§"));
		}
	}
	

}
