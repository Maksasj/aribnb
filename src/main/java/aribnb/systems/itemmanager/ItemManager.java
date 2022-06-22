package aribnb.systems.itemmanager;

import aribnb.systems.itemmanager.items.armor.unique_pieces.BlazeSkull.BlazeSkull;
import aribnb.systems.itemmanager.items.artifacts.EnderPouch.EnderPouch;
import aribnb.systems.itemmanager.items.artifacts.SoulBottle.SoulBottle;
import aribnb.systems.itemmanager.items.resources.CompactedRottenFlesh.CompactedRottenFlesh;
import aribnb.systems.itemmanager.items.resources.CompactedRottenFlesh.FourfoldCompactedRottenFlesh;
import aribnb.systems.itemmanager.items.resources.CompactedRottenFlesh.ThriceCompactedRottenFlesh;
import aribnb.systems.itemmanager.items.resources.CompactedRottenFlesh.TwiceCompactedRottenFlesh;
import aribnb.systems.itemmanager.items.resources.CompactedString.CompactedString;
import aribnb.systems.itemmanager.items.resources.CompactedString.FourfoldCompactedString;
import aribnb.systems.itemmanager.items.resources.CompactedString.ThriceCompactedString;
import aribnb.systems.itemmanager.items.resources.CompactedString.TwiceCompactedString;
import aribnb.systems.itemmanager.items.weapons.swords.ZombieSlayer;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class ItemManager {
    private static HashMap<String, Item> items;

    public ItemManager() {
        items = new HashMap<String, Item>();

        //Resources
        items.put("aribnb_compactedrottenflesh", new CompactedRottenFlesh("aribnb_compactedrottenflesh"));
        items.put("aribnb_twicecompactedrottenflesh", new TwiceCompactedRottenFlesh("aribnb_twicecompactedrottenflesh"));
        items.put("aribnb_thricecompactedrottenflesh", new ThriceCompactedRottenFlesh("aribnb_thricecompactedrottenflesh"));
        items.put("aribnb_fourfoldcompactedrottenflesh", new FourfoldCompactedRottenFlesh("aribnb_fourfoldcompactedrottenflesh"));

        items.put("aribnb_compactedstring", new CompactedString("aribnb_compactedstring"));
        items.put("aribnb_twicecompactedstring", new TwiceCompactedString("aribnb_twicecompactedstring"));
        items.put("aribnb_thricecompactedstring", new ThriceCompactedString("aribnb_thricecompactedstring"));
        items.put("aribnb_fourfoldcompactedstring", new FourfoldCompactedString("aribnb_fourfoldcompactedstring"));

        items.put("aribnb_soulbottle", new SoulBottle("aribnb_soulbottle"));
        items.put("aribnb_enderpouch", new EnderPouch("aribnb_enderpouch"));
        items.put("aribnb_zombieslayer", new ZombieSlayer("aribnb_zombieslayer"));
        items.put("aribnb_blazeskull", new BlazeSkull("aribnb_blazeskull"));
    }

    public static ItemStack getItemStack(String id) {
        return items.get(id).item;
    }

    public static Item getItem(String id) {
        return items.get(id);
    }
}
