package aribnb.systems.itemmanager.items.artifacts.EnderPouch;

import aribnb.aribnb.Aribnb;
import aribnb.systems.itemmanager.Item;

import aribnb.systems.itemmanager.ItemTypes;
import aribnb.utils.itemlore_builder.AbilitieLoreType;
import aribnb.utils.itemlore_builder.ItemAbilitiesLore;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import aribnb.utils.nbt_formater.AribnbNbtFormater;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class EnderPouch extends Item {

    public EnderPouch(String id) {
        super(ItemTypes.ARTIFACT, Rarities.RARE, Material.ENDER_EYE);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§r§9Ender pouch");
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        AribnbNbtFormater nbtFormater = new AribnbNbtFormater(meta);
        nbtFormater.setStrField("aribnb_artifact", "aribnb_enderpouch");

        List<String> ab_lore = new ArrayList<>();;
        ab_lore.add("Open your ender chest");
        ab_lore.add("everywhere you want");

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setItemType("ARTIFACT");
        lorebuilder.setRarity(Rarities.RARE);
        lorebuilder.addItemAbilitieLore(new ItemAbilitiesLore(ab_lore, AbilitieLoreType.RIGHT_CLICK));
        meta.setLore(lorebuilder.buildLore());

        item.setItemMeta(meta);

        bindCraft();
        getServer().getPluginManager().registerEvents(new OpenEnderPouchListener(), Aribnb.getPlugin());
    }

    private void bindCraft() {
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_enderpouch_craft"), item);
        sr.shape(   "BCB",
                "BEB",
                "BBB");
        sr.setIngredient('E', Material.ENDER_EYE);
        sr.setIngredient('C', Material.ENDER_CHEST);
        sr.setIngredient('B', Material.BLACK_WOOL);

        Bukkit.getServer().addRecipe(sr);
    }
}
