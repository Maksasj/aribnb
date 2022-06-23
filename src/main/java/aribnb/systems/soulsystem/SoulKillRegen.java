package aribnb.systems.soulsystem;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class SoulKillRegen implements Listener {
    SoulSystem soulsystem;

    public SoulKillRegen(SoulSystem sy) {
        soulsystem = sy;
    }

    @EventHandler
    public void regenSoulOnKill(EntityDeathEvent event) {
        Entity dead_entity = event.getEntity();
        Player player = (Player) event.getEntity().getKiller();

        if(player != null) {
            soulsystem.addSoulToPlayer(player, 1.0);
        }
    }
}
