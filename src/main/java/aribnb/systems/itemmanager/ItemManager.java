package aribnb.systems.itemmanager;

import aribnb.systems.itemmanager.items.armor.unique_pieces.BlazeSkull.BlazeSkull;
import aribnb.systems.itemmanager.items.armor.unique_pieces.PiglinWarriorChestplate.PiglinWarriorChestplate;
import aribnb.systems.itemmanager.items.armor.unique_pieces.RubberElasticPants.RubberElasticPants;
import aribnb.systems.itemmanager.items.artifacts.EnderPouch.EnderPouch;
import aribnb.systems.itemmanager.items.artifacts.SoulBottle.SoulBottle;
import aribnb.systems.itemmanager.items.resources.CompactedBone.CompactedBone;
import aribnb.systems.itemmanager.items.resources.CompactedBone.FourfoldCompactedBone;
import aribnb.systems.itemmanager.items.resources.CompactedBone.ThriceCompactedBone;
import aribnb.systems.itemmanager.items.resources.CompactedBone.TwiceCompactedBone;
import aribnb.systems.itemmanager.items.resources.CompactedEnderPearl.CompactedEnderPearl;
import aribnb.systems.itemmanager.items.resources.CompactedEnderPearl.FourfoldCompactedEnderPearl;
import aribnb.systems.itemmanager.items.resources.CompactedEnderPearl.ThriceCompactedEnderPearl;
import aribnb.systems.itemmanager.items.resources.CompactedEnderPearl.TwiceCompactedEnderPearl;
import aribnb.systems.itemmanager.items.resources.CompactedGunpowder.CompactedGunpowder;
import aribnb.systems.itemmanager.items.resources.CompactedGunpowder.FourfoldCompactedGunpowder;
import aribnb.systems.itemmanager.items.resources.CompactedGunpowder.ThriceCompactedGunpowder;
import aribnb.systems.itemmanager.items.resources.CompactedGunpowder.TwiceCompactedGunpowder;
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

        items.put("aribnb_compactedgunpowder", new CompactedGunpowder("aribnb_compactedgunpowder"));
        items.put("aribnb_twicecompactedgunpowder", new TwiceCompactedGunpowder("aribnb_twicecompactedgunpowder"));
        items.put("aribnb_thricecompactedgunpowder", new ThriceCompactedGunpowder("aribnb_thricecompactedgunpowder"));
        items.put("aribnb_fourfoldcompactedgunpowder", new FourfoldCompactedGunpowder("aribnb_fourfoldcompactedgunpowder"));

        items.put("aribnb_compactedenderpearl", new CompactedEnderPearl("aribnb_compactedenderpearl"));
        items.put("aribnb_twicecompactedenderpearl", new TwiceCompactedEnderPearl("aribnb_twicecompactedenderpearl"));
        items.put("aribnb_thricecompactedenderpearl", new ThriceCompactedEnderPearl("aribnb_thricecompactedenderpearl"));
        items.put("aribnb_fourfoldcompactedenderpearl", new FourfoldCompactedEnderPearl("aribnb_fourfoldcompactedenderpearl"));

        items.put("aribnb_compactedbone", new CompactedBone("aribnb_compactedbone"));
        items.put("aribnb_twicecompactedbone", new TwiceCompactedBone("aribnb_twicecompactedbone"));
        items.put("aribnb_thricecompactedbone", new ThriceCompactedBone("aribnb_thricecompactedbone"));
        items.put("aribnb_fourfoldcompactedbone", new FourfoldCompactedBone("aribnb_fourfoldcompactedbone"));

        items.put("aribnb_soulbottle", new SoulBottle("aribnb_soulbottle"));
        items.put("aribnb_enderpouch", new EnderPouch("aribnb_enderpouch"));
        items.put("aribnb_zombieslayer", new ZombieSlayer("aribnb_zombieslayer"));
        items.put("aribnb_blazeskull", new BlazeSkull("aribnb_blazeskull"));
        items.put("aribnb_piglinwarriorchestplate", new PiglinWarriorChestplate("aribnb_piglinwarriorchestplate"));
        items.put("aribnb_rubberelasticpants", new RubberElasticPants("aribnb_rubberelasticpants"));
    }

    public static ItemStack getItemStack(String id) {
        return items.get(id).item;
    }

    public static Item getItem(String id) {
        return items.get(id);
    }
}
