package aribnb.systems.lootsystem;

import aribnb.systems.itemmanager.Item;
import org.bukkit.entity.EntityType;

public class LootType {
    public EntityType entitytype;

    public Item item;

    public double chance;

    public LootType(EntityType type, Item _item, double ch) {
        entitytype = type;
        item = _item;
        chance = ch;
    }
}
