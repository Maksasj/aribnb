package aribnb.systems.itemmanager;

import aribnb.systems.itemmanager.items.artifacts.EnderPouch.EnderPouch;
import aribnb.systems.itemmanager.items.artifacts.SoulBottle.SoulBottle;
import aribnb.systems.itemmanager.items.resources.ZombieHeart.ZombieHeart;
import aribnb.systems.itemmanager.items.weapons.swords.ZombieSlayer;
import org.bukkit.inventory.ItemStack;

public class ItemManager {
    public static EnderPouch enderpouch;
    public static SoulBottle soulbottle;
    public static ZombieHeart zombieheart;
    public static ZombieSlayer zombieslayer;

    public ItemManager() {
        soulbottle = new SoulBottle();
        enderpouch = new EnderPouch();
        zombieheart = new ZombieHeart();
        zombieslayer = new ZombieSlayer();
    }

    public static ItemStack getZombieHeart() {
        return zombieheart.zombieheart;
    }
}
