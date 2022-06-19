package aribnb.systems.itemmanager;

import aribnb.systems.itemmanager.items.artifacts.EnderPouch.EnderPouch;
import aribnb.systems.itemmanager.items.artifacts.SoulBottle.SoulBottle;
import aribnb.systems.itemmanager.items.resources.ZombieHeart.ZombieHeart;

public class ItemManager {
    public EnderPouch enderpouch;
    public SoulBottle soulbottle;
    public ZombieHeart zombieheart;

    public ItemManager() {
        soulbottle = new SoulBottle();
        enderpouch = new EnderPouch();
        zombieheart = new ZombieHeart();
    }
}
