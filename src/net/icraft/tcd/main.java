package net.icraft.tcd;

import java.util.List;
import java.util.logging.Logger;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin
{
  Logger log = Logger.getLogger("Minecraft");
  public static List<String> station;
  public static String itemduct;

  public void onDisable()
  {
    this.log.info("|=================================|");
    this.log.info("|      Created iPodHacks142       |");
    this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    this.log.info("|          TCDupeFixer            |");
    this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    this.log.info("|      --==  Disabled  ==--       |");
    this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    this.log.info("|              v1.0               |");
    this.log.info("|=================================|");
  }

  public void onEnable()
  {
	    this.log.info("|=================================|");
	    this.log.info("|      Created iPodHacks142       |");
	    this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
	    this.log.info("|           TCDupeFixer           |");
	    this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
	    this.log.info("|       --==  Enabled  ==--       |");
	    this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
	    this.log.info("|              v1.0               |");
	    this.log.info("|=================================|");

    saveDefaultConfig();
    station = getConfig().getStringList("CraftingStationIDs");
    itemduct = getConfig().getString("ItemductIDs");

    getServer().getPluginManager().registerEvents(new BlockPlace(), this);
  }
}