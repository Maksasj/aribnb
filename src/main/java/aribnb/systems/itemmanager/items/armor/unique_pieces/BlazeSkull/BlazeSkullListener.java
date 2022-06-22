package aribnb.systems.itemmanager.items.armor.unique_pieces.BlazeSkull;

import aribnb.utils.nbt_formater.AribnbNbtFormater;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class BlazeSkullListener implements Listener {

    public BlazeSkullListener() { }

    @EventHandler
    public void onFire(EntityDamageEvent event){
        Entity entity = event.getEntity();
        Material block = event.getEntity().getLocation().getBlock().getType();
        if(entity instanceof Player){
            if(block == Material.FIRE){
                Player player = (Player) entity;
                AribnbNbtFormater nbtformater = new AribnbNbtFormater(player.getInventory().getItem(EquipmentSlot.HEAD));

                if(nbtformater.hasStringField("aribnb_helmet")) {
                    if(nbtformater.getStringField("aribnb_helmet").equals("aribnb_blazeskull")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 80, 1));
                    }
                }
            }
        }
    }
}
