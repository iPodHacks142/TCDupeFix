package net.icraft.tcd;

import java.util.List;

import net.icraft.tcd.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlace
  implements Listener
{
  @EventHandler(priority=EventPriority.HIGH)
  public void onBlockPlace(BlockPlaceEvent event)
  {
    Player player = event.getPlayer();
    Block block = event.getBlock();
    int i = block.getTypeId();
    
    if (i == 7) //Bedrock
    {
      int y = block.getY();
      int x = block.getX();
      int z = block.getZ();
      World world = block.getWorld();

      Block c1 = world.getBlockAt(x + 1, y, z);
      Block c2 = world.getBlockAt(x - 1, y, z);
      Block c3 = world.getBlockAt(x, y, z + 1);
      Block c4 = world.getBlockAt(x, y, z - 1);
      Block c5 = world.getBlockAt(x, y + 1, z);
      Block c6 = world.getBlockAt(x, y - 1, z);

      
      if (c1.getTypeId() == 1038 || c2.getTypeId() == 1038 || c3.getTypeId() == 1038 || c4.getTypeId() == 1038 || c5.getTypeId() == 1038 || c6.getTypeId() == 1038){
    	  event.setCancelled(true);
          String player2 = event.getPlayer().getName();
          Bukkit.broadcast(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + player2 + " Tried to move bedrock!", "tcd.notify");
          player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "You can't place this near a Block Teleporter!");
      }
    }
    
    if (i == 1038) //Block teleporter
    {
      int y = block.getY();
      int x = block.getX();
      int z = block.getZ();
      World world = block.getWorld();

      Block c1 = world.getBlockAt(x + 1, y, z);
      Block c2 = world.getBlockAt(x - 1, y, z);
      Block c3 = world.getBlockAt(x, y, z + 1);
      Block c4 = world.getBlockAt(x, y, z - 1);
      Block c5 = world.getBlockAt(x, y + 1, z);
      Block c6 = world.getBlockAt(x, y - 1, z);

      
      if (c1.getTypeId() == 7 || c2.getTypeId() == 7 || c3.getTypeId() == 7 || c4.getTypeId() == 7 || c5.getTypeId() == 7 || c6.getTypeId() == 7){
    	  event.setCancelled(true);
          String player2 = event.getPlayer().getName();
          Bukkit.broadcast(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + player2 + " Tried to move bedrock!", "tcd.notify");
          player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "You can't place this near bedrock!");
      }
    }
    if (i == 1281) //conduit
    {
      int y = block.getY();
      int x = block.getX();
      int z = block.getZ();
      World world = block.getWorld();

      Block c1 = world.getBlockAt(x + 1, y, z);
      Block c2 = world.getBlockAt(x - 1, y, z);
      Block c3 = world.getBlockAt(x, y, z + 1);
      Block c4 = world.getBlockAt(x, y, z - 1);
      Block c5 = world.getBlockAt(x, y + 1, z);
      Block c6 = world.getBlockAt(x, y - 1, z);

      
      if (c1.getTypeId() == 1058 || c2.getTypeId() == 1058 || c3.getTypeId() == 1058 || c4.getTypeId() == 1058 || c5.getTypeId() == 1058 || c6.getTypeId() == 1058){
    	  event.setCancelled(true);
          String player2 = event.getPlayer().getName();
          Bukkit.broadcast(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + player2 + " Tried to dupe power!", "tcd.notify");
          player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "You can't place this near Aluminium Wire!");
      }
    }
    if (i == 1058) //wire
    {
      int y = block.getY();
      int x = block.getX();
      int z = block.getZ();
      World world = block.getWorld();

      Block c1 = world.getBlockAt(x + 1, y, z);
      Block c2 = world.getBlockAt(x - 1, y, z);
      Block c3 = world.getBlockAt(x, y, z + 1);
      Block c4 = world.getBlockAt(x, y, z - 1);
      Block c5 = world.getBlockAt(x, y + 1, z);
      Block c6 = world.getBlockAt(x, y - 1, z);

      
      if (c1.getTypeId() == 10714 || c2.getTypeId() == 10714 || c3.getTypeId() == 10714 || c4.getTypeId() == 10714 || c5.getTypeId() == 10714 || c6.getTypeId() == 10714){
    	  event.setCancelled(true);
          String player2 = event.getPlayer().getName();
          Bukkit.broadcast(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + player2 + " Tried to dupe power!", "tcd.notify");
          player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "You can't place this near Energy Conduits!");
      }
    }
  }
}