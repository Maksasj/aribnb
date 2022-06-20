package aribnb.systems.runesystem.runes.FadingTouchRune;

import aribnb.utils.nbt_formater.AribnbNbtFormater;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class FadingTouchRuneListener implements Listener {

    public FadingTouchRuneListener() {};

    @EventHandler
    public void fadingtouchRune(EntityDamageByEntityEvent event) {
        Player player = (Player) event.getDamager();

        if(player != null) {
            AribnbNbtFormater nbt = new AribnbNbtFormater(player.getInventory().getItemInMainHand());
            if(nbt.hasIntField("aribnb_runefadingtouch")) {
                Integer lvl = nbt.getIntField("aribnb_runefadingtouch");

                Random rand = new Random(); //instance of random class
                Double random = rand.nextDouble(100);

                if(random <= 10) {
                    LivingEntity livingEntity = (LivingEntity) event.getEntity();
                    livingEntity.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 60, lvl));
                }
            }
        }
    }
}
