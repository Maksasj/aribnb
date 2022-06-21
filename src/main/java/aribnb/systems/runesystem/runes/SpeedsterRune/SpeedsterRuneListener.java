package aribnb.systems.runesystem.runes.SpeedsterRune;

import aribnb.utils.nbt_formater.AribnbNbtFormater;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpeedsterRuneListener implements Listener {

    public SpeedsterRuneListener() {};

    @EventHandler
    public void speedsterRune(EntityDeathEvent event) {
        Entity dead_entity = event.getEntity();

        if(event.getEntity().getKiller() instanceof Player) {
            Player player = (Player) event.getEntity().getKiller();
            if (player != null) {
                AribnbNbtFormater nbt = new AribnbNbtFormater(player.getInventory().getItemInMainHand());
                if (nbt.hasIntField("aribnb_runespeedster")) {
                    Integer lvl = nbt.getIntField("aribnb_runespeedster");
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, lvl * 20 * 4, 0));
                }
            }
        }
    }
}
