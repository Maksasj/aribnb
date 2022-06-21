package aribnb.systems.itemmanager;

import aribnb.systems.itemmanager.items.artifacts.EnderPouch.EnderPouch;
import aribnb.systems.itemmanager.items.artifacts.SoulBottle.SoulBottle;
import aribnb.systems.itemmanager.items.resources.ZombieHeart.ZombieHeart;
import aribnb.systems.itemmanager.items.weapons.swords.ZombieSlayer;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class ItemManager {
    private static HashMap<String, Item> items;

    public ItemManager() {
        items = new HashMap<String, Item>();
        items.put("aribnb_soulbottle", new SoulBottle("aribnb_soulbottle"));
        items.put("aribnb_enderpouch", new EnderPouch("aribnb_enderpouch"));
        items.put("aribnb_zombieheart", new ZombieHeart("aribnb_zombieheart"));
        items.put("aribnb_zombieslayer", new ZombieSlayer("aribnb_zombieslayer"));
    }

    public static ItemStack getItem(String id) {
        return items.get(id).item;
    }
}
