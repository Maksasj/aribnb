package aribnb.systems.runesystem.runes.SecondChanceRune;

import aribnb.utils.nbt_formater.AribnbNbtFormater;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.meta.Damageable;

public class SecondChanceRuneListener implements Listener {
    public SecondChanceRuneListener() { }

    @EventHandler
    public void onPlayerInteract(PlayerItemDamageEvent event) {
        if (event.getPlayer().getInventory().getItemInMainHand() != null) {
            Player player = event.getPlayer();

            AribnbNbtFormater nbt = new AribnbNbtFormater(player.getInventory().getItemInMainHand());
            if(nbt.hasIntField("aribnb_runesecondchance")) {
                int damage = ((Damageable) player.getInventory().getItemInMainHand().getItemMeta()).getDamage();
                int max_damage = player.getInventory().getItemInMainHand().getType().getMaxDurability();

                if(damage <= max_damage - 1) {
                    event.setCancelled(true);

                    Damageable dmg = (Damageable) player.getInventory().getItemInMainHand().getItemMeta();
                    dmg.setDamage(0);
                    player.getInventory().getItemInMainHand().setItemMeta(dmg);
                }
            }
        }
    }
}