package fr.glt.geosiearth.plugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CheckCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("Le plugin fonctionne correctement. Vous executez cette commande depuis la console.");
		}else {
			sender.sendMessage("Le plugin fonctionne correctement. Vous executez cette commande depuis le jeu.");
		}
		return false;
	}

}
