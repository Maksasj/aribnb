package aribnb.systems.lootsystem;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import aribnb.systems.itemmanager.Item;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.List;
import java.util.Random;

public class LootSystemListener implements Listener {

    @EventHandler
    public void onDeath(EntityDeathEvent event) {
        event.setDroppedExp(event.getDroppedExp());

        LivingEntity entity = event.getEntity();
        List<LootType> loot_table = LootSystem.getLootTable();

        for(LootType loot : loot_table) {
            EntityType key = loot.entitytype;
            Item value = loot.item;

            if(entity.getType().equals(key)) {
                Random rand = new Random(); //instance of random class
                double random = (rand.nextDouble(1000000) / 1000000.0);

                if(random <= loot.chance) {
                    event.getDrops().clear();
                    entity.getLocation().getWorld().dropItem(entity.getLocation(), value.item);
                    break;
                }
            }
        }
    }
}
