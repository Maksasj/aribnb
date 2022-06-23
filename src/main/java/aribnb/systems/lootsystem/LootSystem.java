package aribnb.systems.lootsystem;

import aribnb.aribnb.Aribnb;
import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemManager;
import org.bukkit.entity.EntityType;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class LootSystem {
    private static List<LootType> loot_table;

    public LootSystem() {
        loot_table = new ArrayList<>();

        getServer().getPluginManager().registerEvents(new LootSystemListener(), Aribnb.getPlugin());
    }

    public static void addLoot(EntityType type, Item item, double chance) {
        loot_table.add(new LootType(type, item, chance));
    }

    public static List<LootType> getLootTable() {
        return loot_table;
    }
}
