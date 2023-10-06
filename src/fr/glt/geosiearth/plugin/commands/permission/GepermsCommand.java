package fr.glt.geosiearth.plugin.commands.permission;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import fr.glt.geosiearth.plugin.PluginGE;

public class GepermsCommand implements CommandExecutor {
	
	private PluginGE mainlink;

	public GepermsCommand(PluginGE pluginGE) {
		mainlink = pluginGE;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(args.length < 1) {
			sender.sendMessage("Commande incomplète. Faites /geperms help pour plus d'infos.");
		}
		
		if(args.length == 1) {
			if(args[0].equals("help")) {
				sender.sendMessage("en cours frr calme att un peu j'ai pas ton temps salope");
			}
			if(args[0].equals("group")) {
				sender.sendMessage("Arguments manquants. /geperms help :)");
			}
		}
		
		if(args.length == 2) {
			if(args[0].equals("group") && args[1].equals("create")) {
				sender.sendMessage("Arguments manquants. /geperms help :)");
			}
			if(args[0].equals("group") && args[1].equals("addperm")) {
				sender.sendMessage("Arguments manquants. /geperms help :)");
			}
			if(args[0].equals("group") && args[1].equals("addplayer")) {
				sender.sendMessage("Arguments manquants. /geperms help :)");
			}
		}
		
		if(args.length == 3) {
			if(args[0].equals("group") && args[1].equals("create")) {
				String grpName = args[2];
				if(mainlink.groupslist.contains(grpName)) {
					sender.sendMessage("Ce groupe existe déjà.");
				}else {
					mainlink.groupslist.add(grpName);
				}
		    }
		}
		
		return false;
	}

}
