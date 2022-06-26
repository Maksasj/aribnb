package aribnb.systems.itemmanager.items.armor.unique_pieces.BlazePants;

import aribnb.utils.nbt_formater.AribnbNbtFormater;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

public class BlazePantsListener implements Listener {

    public BlazePantsListener() {};

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        if(event.getPlayer() != null) {
            ItemStack item = event.getPlayer().getInventory().getLeggings();
            if(item == null) {
                return;
            }

            AribnbNbtFormater nbtformater = new AribnbNbtFormater(item);

            if(nbtformater.hasStringField("aribnb_type")) {
                if(nbtformater.getStringField("aribnb_type").equals("aribnb_leggings")) {
                    if(nbtformater.getStringField("aribnb_leggings").equals("aribnb_blazepants")) {

                        Location loc = event.getPlayer().getLocation();
                        if(event.getPlayer().getWorld().getBlockAt(loc).getType().equals(Material.AIR)) {
                            event.getPlayer().getWorld().getBlockAt(loc).setType(Material.FIRE);
                        }
                    }
                }
            }
        }
    }
}
