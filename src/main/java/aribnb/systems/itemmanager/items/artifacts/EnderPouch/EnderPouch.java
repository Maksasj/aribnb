package aribnb.systems.itemmanager.items.artifacts.EnderPouch;

import aribnb.aribnb.Aribnb;
import aribnb.systems.itemmanager.items.artifacts.EnderPouch.OpenEnderPouchListener;

import aribnb.systems.soulsystem.SoulKillRegen;
import aribnb.utils.itemlore_builder.AbilitieLoreType;
import aribnb.utils.itemlore_builder.ItemAbilitiesLore;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
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
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class EnderPouch {
    public static ItemStack ender_pouch;

    public EnderPouch() {
        ItemStack item = new ItemStack(Material.ENDER_EYE, 1);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§r§9Ender pouch");
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setItemType("ARTIFACT");
        lorebuilder.setRarity(Rarities.RARE);

        List<String> ab_lore = new ArrayList<>();;
        ab_lore.add("Open your ender chest");
        ab_lore.add("everywhere you want");
        lorebuilder.addItemAbilitieLore(new ItemAbilitiesLore(ab_lore, AbilitieLoreType.RIGHT_CLICK));
        meta.setLore(lorebuilder.buildLore());

        PersistentDataContainer data = meta.getPersistentDataContainer();
        data.set(new NamespacedKey(Aribnb.getPlugin(), "aribnb_artifact"), PersistentDataType.STRING, "aribnb_enderpouch");
        item.setItemMeta(meta);

        ender_pouch = item;

        System.out.println("adjsbka");

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_enderpouch_craft"), item);
        sr.shape(   "BCB",
                    "BEB",
                    "BBB");
        sr.setIngredient('E', Material.ENDER_EYE);
        sr.setIngredient('C', Material.ENDER_CHEST);
        sr.setIngredient('B', Material.BLACK_WOOL);

        Bukkit.getServer().addRecipe(sr);
        getServer().getPluginManager().registerEvents(new OpenEnderPouchListener(), Aribnb.getPlugin());
    }
}
