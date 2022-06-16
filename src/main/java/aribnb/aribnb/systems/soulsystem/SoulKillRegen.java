package aribnb.aribnb.systems.soulsystem;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class SoulKillRegen implements Listener {

    @EventHandler
    public void regenSoulOnKill(EntityDeathEvent event) {
        Entity dead_entity = event.getEntity();

        if (dead_entity.getLastDamageCause() instanceof Player) {
            Player player = (Player) dead_entity.getLastDamageCause();
            System.out.println("TODO");
            SoulSystem.addSoulToPlayer(player, 1.0);
        }
    }
}
