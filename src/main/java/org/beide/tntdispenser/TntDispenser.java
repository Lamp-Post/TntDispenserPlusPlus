package org.beide.tntdispenser;

import java.util.logging.Logger;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Event;

/*
 * This file is part of tntDispenser.
 * 
 * tntDispenser is free software: you can redistribute it and/or modify *
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * tntDispenser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with tntDispenser.  If not, see <http://www.gnu.org/licenses/>.
 */


@SuppressWarnings("unused")
public class TntDispenser extends JavaPlugin {
	private static Logger log = Logger.getLogger("Minecraft");
	PluginDescriptionFile desc;
	
	@Override
	public void onEnable() {
            getLogger().info("Have fun!");
		
		
		getServer().getPluginManager().registerEvents(new TntDispenserEventHandler(this, getConfig()), this);

	}
	
	@Override
	public void onDisable() {
		getLogger().info("Bye!");
	}
	

	
}

