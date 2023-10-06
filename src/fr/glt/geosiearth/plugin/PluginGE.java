package fr.glt.geosiearth.plugin;

import org.bukkit.plugin.java.JavaPlugin;


import fr.glt.geosiearth.plugin.commands.CheckCommand;
import fr.glt.geosiearth.plugin.commands.permission.GepermsCommand;
import fr.glt.geosiearth.plugin.events.EventsClass;
import java.util.ArrayList; 

public class PluginGE extends JavaPlugin{
	
	public ArrayList<String> groupslist = new ArrayList<String>();
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		
		System.out.println("Geosiearth Plugin V" + getDescription().getVersion() + " running on Spigot API V" + getDescription().getAPIVersion());
		getCommand("check").setExecutor(new CheckCommand());
		getCommand("geperms").setExecutor(new GepermsCommand(this));
		getServer().getPluginManager().registerEvents(new EventsClass(this), this);
		
		
	}

}
