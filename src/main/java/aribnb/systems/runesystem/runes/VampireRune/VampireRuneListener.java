package aribnb.systems.runesystem.runes.VampireRune;

import aribnb.utils.nbt_formater.AribnbNbtFormater;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class VampireRuneListener implements Listener {

    public VampireRuneListener() {};

    @EventHandler
    public void vampireRune(EntityDeathEvent event) {
        Entity dead_entity = event.getEntity();

        Player player = (Player) event.getEntity().getKiller();
        if(player != null) {
            AribnbNbtFormater nbt = new AribnbNbtFormater(player.getInventory().getItemInMainHand());
            if(nbt.hasIntField("aribnb_runevampire")) {
                int Vampire_level = nbt.getIntField("aribnb_runevampire");
                double health = player.getHealth() + Vampire_level;

                if(health < player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue()) {
                    player.setHealth(health);
                } else {
                    player.setHealth(player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue());
                }
            }
        }
    }
}
