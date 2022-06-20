package aribnb.systems.runesystem.runes.ThunderRune;

import aribnb.utils.nbt_formater.AribnbNbtFormater;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.util.Random;

public class ThunderRuneListener implements Listener {
    public ThunderRuneListener() {};

    @EventHandler
    public void thunderRune(EntityDamageByEntityEvent event) {
        Player player = (Player) event.getDamager();

        if(player != null) {
            AribnbNbtFormater nbt = new AribnbNbtFormater(player.getInventory().getItemInMainHand());
            if(nbt.hasIntField("aribnb_runethunder")) {
                Integer lvl = nbt.getIntField("aribnb_runethunder");

                Random rand = new Random(); //instance of random class
                int upperbound = 100;
                Double random = rand.nextDouble(upperbound);

                if(random <= lvl*3) {
                    player.getWorld().strikeLightningEffect(event.getEntity().getLocation());
                }
            }
        }
    }
}
