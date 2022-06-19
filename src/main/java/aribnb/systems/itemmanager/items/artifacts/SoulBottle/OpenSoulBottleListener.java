package aribnb.systems.itemmanager.items.artifacts.SoulBottle;

import aribnb.utils.nbt_formater.AribnbNbtFormater;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class OpenSoulBottleListener implements Listener {
    public OpenSoulBottleListener() { }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if(event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (event.getPlayer().getInventory().getItemInMainHand().getType() == Material.POTION) {
                Player player = (Player) event.getPlayer();
                AribnbNbtFormater nbt = new AribnbNbtFormater(player.getInventory().getItemInMainHand());
                if(nbt.hasStringField("aribnb_artifact")) {
                    if(nbt.getStringField("aribnb_artifact").equals("aribnb_soulbottle")) {
                        player.openInventory(new SoulBottleGui().getInventory());
                        event.setCancelled(true);
                        System.out.println("Todo");
                    }
                }
            }
        }
    }
}
