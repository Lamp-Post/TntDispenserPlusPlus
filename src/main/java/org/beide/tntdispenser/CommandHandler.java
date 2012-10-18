package org.beide.tntdispenser;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandHandler implements CommandExecutor
{
	JavaPlugin plugin;
	FileConfiguration config;
	
	CommandHandler(JavaPlugin p, FileConfiguration c) {
		super();
		plugin = p;
		config = c;
	}


	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) 
	{
		if((config.contains("Worlds." + args[0])) && (args[1].equalsIgnoreCase("enable")) && (args[2].equalsIgnoreCase("true")))
		{
		config.set("Worlds." + args[0] + ".enabled", true);
		plugin.saveConfig();
		plugin.reloadConfig();
		sender.sendMessage("[TntDispenserPlusPlus] TntDispenserPlusPlus is enabled in world: " + args[0]);
		return true;
		} 
		if((config.contains("Worlds." + args[0])) && (args[1].equalsIgnoreCase("enable")) && (args[2].equalsIgnoreCase("false")))
		{
		config.set("Worlds." + args[0] + ".enabled", false);
		plugin.saveConfig();
		plugin.reloadConfig();
		sender.sendMessage("[TntDispenserPlusPlus] TntDispenserPlusPlus is disabled in world: " + args[0]);
		return true;
		}
		/*TODO if((config.contains("Worlds." + args[0])) && (args[1].equalsIgnoreCase("creative")) && (args[2].equalsIgnoreCase("true")))
		{
		config.set("Worlds." + args[0] + ".creative world", true);
		plugin.saveConfig();
		plugin.reloadConfig();
		sender.sendMessage("[TntDispenserPlusPlus] " + args[0] + " is set to: Creative");
		return true;
		} 
		if((config.contains("Worlds." + args[0])) && (args[1].equalsIgnoreCase("creative")) && (args[2].equalsIgnoreCase("false")))
		{
		config.set("Worlds." + args[0] + ".creative world", false);
		plugin.saveConfig();
		plugin.reloadConfig();
		sender.sendMessage("[TntDispenserPlusPlus] " + args[0] + " is set to: Survival");
		return true;
		} */
		if(args[0].equalsIgnoreCase("reload"))
		{
		plugin.reloadConfig();
		sender.sendMessage("[TntDispenserPlusPlus] Config is reloaded");
		return true;
		}
		else{
		sender.sendMessage("[TntDispenserPlusPlus] That is not a command used by this plugin");	
		return true;
		}
		
	}

}
