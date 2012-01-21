package org.beide.tntdispenser;

import java.util.logging.Logger;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Event;

public class tntDispenser extends JavaPlugin {
	private static Logger log = Logger.getLogger("Minecraft");
	PluginDescriptionFile desc;
	
	public void onDisable() {
		log.info("Disabled " + desc.getName());
	}
	
	public void onEnable() {
		desc = this.getDescription();
		
		log.info(desc.getName() + " version "
			 + desc.getVersion());
		
		
		getServer().getPluginManager().registerEvent(Event.Type.BLOCK_DISPENSE, new tntDispenserEventHandler(this, getConfig()),
																								 Event.Priority.Normal, this);
	}
	
}

