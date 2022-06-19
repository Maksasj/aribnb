package aribnb.systems.itemmanager.items.resources.ZombieHeart;

import aribnb.aribnb.Aribnb;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
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

public class ZombieHeart {
    public ItemStack zombieheart;

    public ZombieHeart() {
        System.out.println("faskjfnakmfakfnkafnakfna");
        ItemStack item = new ItemStack(Material.ROTTEN_FLESH, 1);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§r§aZombie heart");
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setItemType("RESOURCE");
        lorebuilder.setRarity(Rarities.UNCOMMON);

        meta.setLore(lorebuilder.buildLore());

        PersistentDataContainer data = meta.getPersistentDataContainer();
        data.set(new NamespacedKey(Aribnb.getPlugin(), "aribnb_resource"), PersistentDataType.STRING, "aribnb_zombieheart");
        item.setItemMeta(meta);

        zombieheart = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_zombieheart_craft"), item);
        sr.shape(   "RRR",
                    "RSR",
                    "RRR");
        sr.setIngredient('R', Material.ROTTEN_FLESH);
        sr.setIngredient('S', Material.SPIDER_EYE);

        Bukkit.getServer().addRecipe(sr);
    }
}
