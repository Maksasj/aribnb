package aribnb.systems.itemmanager.items.artifacts.SoulBottle;

import aribnb.aribnb.Aribnb;
import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.items.artifacts.EnderPouch.OpenEnderPouchListener;

import aribnb.systems.soulsystem.SoulKillRegen;
import aribnb.utils.itemlore_builder.AbilitieLoreType;
import aribnb.utils.itemlore_builder.ItemAbilitiesLore;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import aribnb.utils.nbt_formater.AribnbNbtFormater;
import jdk.tools.jlink.plugin.Plugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class SoulBottle extends Item {

    public SoulBottle() {
        super(Rarities.EPIC);
        item = new ItemStack(Material.POTION, 1);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§r§5Soul bottle");
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        PotionMeta pmeta = (PotionMeta) meta;
        PotionData pdata = new PotionData(PotionType.WATER);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        List<String> ab_lore = new ArrayList<>();;
        ab_lore.add("Store and accumulate");
        ab_lore.add("gained souls");

        lorebuilder.setItemType("ARTIFACT");
        lorebuilder.addCustomInfo("§bSouls stored: 0.0/100.0");
        lorebuilder.setRarity(Rarities.EPIC);
        lorebuilder.addItemAbilitieLore(new ItemAbilitiesLore(ab_lore, AbilitieLoreType.CLICK));

        pmeta.setBasePotionData(pdata);
        pmeta.setLore(lorebuilder.buildLore());

        AribnbNbtFormater nbtFormater = new AribnbNbtFormater(meta);
        nbtFormater.setStrField("aribnb_artifact", "aribnb_soulbottle");
        nbtFormater.setDoubleField("aribnb_soulbottle_capacity", 0.0);
        nbtFormater.setDoubleField("aribnb_soulbottle_max_capacity", 100.0);

        item.setItemMeta(meta);

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_soulbottle_craft"), item);
        sr.shape(   " B ",
                    "XNX",
                    "XXX");
        sr.setIngredient('X', Material.EXPERIENCE_BOTTLE);
        sr.setIngredient('N', Material.NETHER_STAR);
        sr.setIngredient('B', Material.CRYING_OBSIDIAN);

        Bukkit.getServer().addRecipe(sr);
        getServer().getPluginManager().registerEvents(new OpenSoulBottleListener(), Aribnb.getPlugin());
        getServer().getPluginManager().registerEvents(new OpenSoulBottleGuiListener(), Aribnb.getPlugin());
    }
}
