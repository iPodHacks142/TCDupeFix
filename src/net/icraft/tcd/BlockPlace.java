package net.icraft.tcd;

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
    if ((i == 2035) || (i == 2034))
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
      if ((c1.getTypeId() == 1281) || (c2.getTypeId() == 1281) || (c3.getTypeId() == 1281) || (c4.getTypeId() == 1281) || (c5.getTypeId() == 1281) || (c6.getTypeId() == 1281))
      {
        event.setCancelled(true);
        String player2 = event.getPlayer().getName();
        Bukkit.broadcast(ChatColor.GOLD + "[TCDupeFix] " + ChatColor.RED + player2 + " Tried to dupe using a crafting station and itemduct.", "tcd.notify");
        player.sendMessage(ChatColor.GOLD + "[TCDupeFix] " + ChatColor.RED + "You can't place this near an Itemduct!");
      }
    }
    if (i == 1281)
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
      if ((c1.getTypeId() == 2035) || (c2.getTypeId() == 2035) || (c3.getTypeId() == 2035) || (c4.getTypeId() == 2035) || (c5.getTypeId() == 2035) || (c6.getTypeId() == 2035) || (c1.getTypeId() == 2034) || (c2.getTypeId() == 2034) || (c3.getTypeId() == 2034) || (c4.getTypeId() == 2034) || (c5.getTypeId() == 2034) || (c6.getTypeId() == 2034))
      {
        event.setCancelled(true);
        String player2 = event.getPlayer().getName();
        Bukkit.broadcast(ChatColor.GOLD + "[TCDupeFix] " + ChatColor.RED + player2 + " Tried to dupe using a crafting station and itemduct.", "tcd.notify");
        player.sendMessage(ChatColor.GOLD + "[TCDupeFix] " + ChatColor.RED + "You can't place this near an Crafting Station!");
      }
    }
  }
}
