package aribnb.systems.itemmanager;

import aribnb.systems.itemmanager.items.artifacts.EnderPouch.EnderPouch;
import aribnb.systems.itemmanager.items.artifacts.SoulBottle.SoulBottle;
import aribnb.systems.itemmanager.items.resources.ZombieHeart.ZombieHeart;
import aribnb.systems.itemmanager.items.weapons.swords.ZombieSlayer;
import aribnb.utils.itemlore_builder.AttributeLoreType;
import aribnb.utils.itemlore_builder.AttributeSlotType;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;

public class ItemManager {
    private static HashMap<String, Item> items;

    public ItemManager() {
        items = new HashMap<String, Item>();
        items.put("aribnb_soulbottle", new SoulBottle());
        items.put("aribnb_enderpouch", new EnderPouch());
        items.put("aribnb_zombieheart", new ZombieHeart());
        items.put("aribnb_zombieslayer", new ZombieSlayer());
    }

    public static ItemStack getItem(String id) {
        return items.get(id).item;
    }
}
