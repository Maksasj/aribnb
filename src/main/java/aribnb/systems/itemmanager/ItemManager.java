package aribnb.systems.itemmanager;

import aribnb.systems.itemmanager.items.artifacts.EnderPouch.EnderPouch;
import aribnb.systems.itemmanager.items.artifacts.SoulBottle.SoulBottle;

public class ItemManager {
    public EnderPouch enderpouch;
    public SoulBottle soulbottle;

    public ItemManager() {
        soulbottle = new SoulBottle();
        enderpouch = new EnderPouch();
    }
}
