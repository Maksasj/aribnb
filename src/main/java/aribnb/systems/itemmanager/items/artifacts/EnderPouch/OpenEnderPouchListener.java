package aribnb.systems.itemmanager.items.artifacts.EnderPouch;

import aribnb.utils.nbt_formater.AribnbNbtFormater;
import org.bukkit.Material;
import org.bukkit.entity.EnderSignal;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class OpenEnderPouchListener implements Listener {

    public OpenEnderPouchListener() { }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if(event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            if (event.getPlayer().getInventory().getItemInMainHand().getType() == Material.ENDER_EYE) {
                Player player = (Player) event.getPlayer();

                AribnbNbtFormater nbt = new AribnbNbtFormater(player.getInventory().getItemInMainHand());
                if(nbt.hasStringField("aribnb_artifact")) {

                    if(nbt.getStringField("aribnb_artifact").equals("aribnb_enderpouch")) {
                        event.setCancelled(true);
                        player.openInventory(player.getEnderChest());
                    }
                }
            }
        }
    }
}
