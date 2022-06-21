package aribnb.systems.itemmanager.items.weapons.swords;

import aribnb.aribnb.Aribnb;
import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemManager;
import aribnb.systems.itemmanager.items.resources.ZombieHeart.ZombieHeart;
import aribnb.systems.runesystem.RuneManager;
import aribnb.utils.itemlore_builder.*;
import aribnb.utils.nbt_formater.AribnbNbtFormater;
import com.google.common.collect.Multimap;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;

public class ZombieSlayer extends Item {

    public ZombieSlayer() {
        super(Rarities.RARE);
        item = new ItemStack(Material.STONE_SWORD, 1);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§r§9Zombie slayer");

        //Enchants
        //meta.addEnchant(Enchantment.DAMAGE_ALL, 6, true);
        //meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
        //meta.addEnchant(Enchantment.SWEEPING_EDGE, 4, true);
        //meta.addEnchant(Enchantment.DURABILITY, 3, true);
        //meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
        //meta.addEnchant(Enchantment.MENDING, 1, true);

        setDamage(meta, 6.0, EquipmentSlot.HAND);
        setAttackSpeed(meta, -2.5, EquipmentSlot.HAND);

        AribnbNbtFormater nbtFormater = new AribnbNbtFormater(meta);

        //Test runes
        //nbtFormater.setIntField("aribnb_runevampire", 14);
        //nbtFormater.setIntField("aribnb_runethunder", 69);
        //nbtFormater.setIntField("aribnb_runefadingtouch", 15);
        //nbtFormater.setIntField("aribnb_runecarlson", 45);
        //nbtFormater.setIntField("aribnb_runesecondchance", 1);
        //nbtFormater.setIntField("aribnb_runespeedster", 1);
        nbtFormater.setStrField("aribnb_sword", "aribnb_zombieslayer");

        //Lore builder
        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(Rarities.RARE, meta);
        meta.setLore(lorebuilder.buildLore());

        item.setItemMeta(meta);

        ItemStack zombieheart = ItemManager.getItem("aribnb_zombieheart");
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_zombieslayer_craft"), item);
        sr.shape(   " D ",
                    " Z ",
                    " S ");
        sr.setIngredient('D', Material.DIAMOND);
        sr.setIngredient('Z', new RecipeChoice.ExactChoice(zombieheart));
        sr.setIngredient('S', Material.STICK);

        Bukkit.getServer().addRecipe(sr);
    }
}
