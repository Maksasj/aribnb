package aribnb.systems.itemmanager;

import aribnb.systems.itemmanager.items.armor.unique_pieces.BlazePants.BlazePants;
import aribnb.systems.itemmanager.items.armor.unique_pieces.BlazeSkull.BlazeSkull;
import aribnb.systems.itemmanager.items.armor.sets.Skeleton.BowlerHat;
import aribnb.systems.itemmanager.items.armor.sets.Skeleton.BowlerJacket;
import aribnb.systems.itemmanager.items.armor.sets.Zombie.DilapidatedChainmail;
import aribnb.systems.itemmanager.items.armor.sets.Zombie.DilapidatedChainmailHelmet;
import aribnb.systems.itemmanager.items.armor.sets.ZombifiedPiglin.FakeCrown;
import aribnb.systems.itemmanager.items.armor.sets.ZombifiedPiglin.GoldPlatedBoots;
import aribnb.systems.itemmanager.items.armor.unique_pieces.PiglinWarriorChestplate.PiglinWarriorChestplate;
import aribnb.systems.itemmanager.items.armor.sets.ZombifiedPiglin.PorkBib;
import aribnb.systems.itemmanager.items.armor.sets.ZombifiedPiglin.PorkPants;
import aribnb.systems.itemmanager.items.armor.sets.Skeleton.RaggedBoots;
import aribnb.systems.itemmanager.items.armor.sets.Skeleton.RaggedLeggings;
import aribnb.systems.itemmanager.items.armor.sets.Zombie.RubberElasticBoots;
import aribnb.systems.itemmanager.items.armor.sets.Zombie.RubberElasticPants;
import aribnb.systems.itemmanager.items.armor.unique_pieces.SerialKillerMask.SerialKillerMask;
import aribnb.systems.itemmanager.items.armor.sets.Spider.SpuderBoots;
import aribnb.systems.itemmanager.items.armor.sets.Spider.SpuderChestplate;
import aribnb.systems.itemmanager.items.armor.sets.Spider.SpuderHelmet;
import aribnb.systems.itemmanager.items.armor.sets.Spider.SpuderPants;
import aribnb.systems.itemmanager.items.armor.sets.Turtle.TurtleBoots;
import aribnb.systems.itemmanager.items.armor.sets.Turtle.TurtleCap;
import aribnb.systems.itemmanager.items.armor.sets.Turtle.TurtleJacket;
import aribnb.systems.itemmanager.items.armor.sets.Turtle.TurtlePants;
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
import aribnb.systems.itemmanager.items.resources.VoidInk.VoidInk;
import aribnb.systems.itemmanager.items.weapons.crossbows.EagleEye;
import aribnb.systems.itemmanager.items.weapons.rod.BattleHook;
import aribnb.systems.itemmanager.items.weapons.swords.SacrificialDagger;
import aribnb.systems.itemmanager.items.weapons.swords.ShortFrostBlade;
import aribnb.systems.itemmanager.items.weapons.swords.VexDagger;
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
        items.put("aribnb_piglinwarriorchestplate", new PiglinWarriorChestplate("aribnb_piglinwarriorchestplate"));

        //ZOMBIE
        items.put("aribnb_rubberelasticpants", new RubberElasticPants("aribnb_rubberelasticpants"));
        items.put("aribnb_rubberelasticboots", new RubberElasticBoots("aribnb_rubberelasticboots"));
        items.put("aribnb_dilapidatedchainmail", new DilapidatedChainmail("aribnb_dilapidatedchainmail"));
        items.put("aribnb_dilapidatedchainmailhelmet", new DilapidatedChainmailHelmet("aribnb_dilapidatedchainmailhelmet"));

        //ZOMBIFIED_PIGLIN
        items.put("aribnb_porkbib", new PorkBib("aribnb_porkbib"));
        items.put("aribnb_porkpants", new PorkPants("aribnb_porkpants"));
        items.put("aribnb_goldplatedboots", new GoldPlatedBoots("aribnb_goldplatedboots"));
        items.put("aribnb_fakecrown", new FakeCrown("aribnb_fakecrown"));

        //VINDICATOR
        items.put("aribnb_serialkillermask", new SerialKillerMask("aribnb_serialkillermask"));

        //VEX
        items.put("aribnb_vexdagger", new VexDagger("aribnb_vexdagger"));

        //TURTLE
        items.put("aribnb_turtlecap", new TurtleCap("aribnb_turtlecap"));
        items.put("aribnb_turtlejacket", new TurtleJacket("aribnb_turtlejacket"));
        items.put("aribnb_turtlepants", new TurtlePants("aribnb_turtlepants"));
        items.put("aribnb_turtleboots", new TurtleBoots("aribnb_turtleboots"));

        //STRAY
        items.put("aribnb_shortfrostblade", new ShortFrostBlade("aribnb_shortfrostblade"));

        //SPIDER
        items.put("aribnb_spuderhelmet", new SpuderHelmet("aribnb_spuderhelmet"));
        items.put("aribnb_spuderchestplate", new SpuderChestplate("aribnb_spuderchestplate"));
        items.put("aribnb_spuderpants", new SpuderPants("aribnb_spuderpants"));
        items.put("aribnb_spuderboots", new SpuderBoots("aribnb_spuderboots"));

        //SKELETON
        items.put("aribnb_raggedboots", new RaggedBoots("aribnb_raggedboots"));
        items.put("aribnb_raggedleggings", new RaggedLeggings("aribnb_raggedleggings"));
        items.put("aribnb_bowlerjacket", new BowlerJacket("aribnb_bowlerjacket"));
        items.put("aribnb_bowlerhat", new BowlerHat("aribnb_bowlerhat"));

        //PUFFERFISH
        items.put("aribnb_battlehook", new BattleHook("aribnb_battlehook"));

        //PILLAGER
        items.put("aribnb_eagleeye", new EagleEye("aribnb_eagleeye"));

        //BLAZE
        items.put("aribnb_blazeskull", new BlazeSkull("aribnb_blazeskull"));
        items.put("aribnb_blazepants", new BlazePants("aribnb_blazepants"));

        //SQUID
        items.put("aribnb_voidink", new VoidInk("aribnb_voidink"));

        //HUSK
        items.put("aribnb_sacrificialdagger", new SacrificialDagger("aribnb_sacrificialdagger"));
    }

    public static ItemStack getItemStack(String id) {
        return items.get(id).item;
    }

    public static Item getItem(String id) {
        return items.get(id);
    }
}
