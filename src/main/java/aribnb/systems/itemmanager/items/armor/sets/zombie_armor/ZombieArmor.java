package aribnb.systems.itemmanager.items.armor.sets.zombie_armor;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class ZombieArmor {
    public static ItemStack zombie_armor_helmet;
    public static ItemStack zombie_armor_chestplate;
    public static ItemStack zombie_armor_leggings;
    public static ItemStack zombie_armor_boots;

    public ZombieArmor() {
        //Helmet
        ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Dilapidated Chainmail Helmet");
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier("GENERIC_MAX_HEALTH", 20, AttributeModifier.Operation.ADD_NUMBER));
        item.setItemMeta(meta);

        //Shaped Recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_zombie_armor_helmet"), item);
        sr.shape(   "ZZZ",
                    "Z Z",
                    "   ");
        sr.setIngredient('Z', Material.ROTTEN_FLESH);
        Bukkit.getServer().addRecipe(sr);
        zombie_armor_helmet = item;
    }


}
