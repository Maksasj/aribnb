package aribnb.systems.itemmanager.items.resources.ZombieHeart;

import aribnb.aribnb.Aribnb;
import aribnb.systems.itemmanager.Item;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import aribnb.utils.nbt_formater.AribnbNbtFormater;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class ZombieHeart extends Item {

    public ZombieHeart() {
        super(Rarities.UNCOMMON);

        item = new ItemStack(Material.ROTTEN_FLESH, 1);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§r§aZombie heart");
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        AribnbNbtFormater nbtFormater = new AribnbNbtFormater(meta);
        nbtFormater.setStrField("aribnb_resource", "aribnb_zombieheart");

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setItemType("RESOURCE");
        lorebuilder.setRarity(Rarities.UNCOMMON);
        meta.setLore(lorebuilder.buildLore());

        item.setItemMeta(meta);

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_zombieheart_craft"), item);
        sr.shape(   "RRR",
                    "RSR",
                    "RRR");
        sr.setIngredient('R', Material.ROTTEN_FLESH);
        sr.setIngredient('S', Material.SPIDER_EYE);

        Bukkit.getServer().addRecipe(sr);
    }
}
