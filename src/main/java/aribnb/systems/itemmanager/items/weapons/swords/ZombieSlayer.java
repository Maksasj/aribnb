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
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;

public class ZombieSlayer extends Item {

    public ZombieSlayer() {
        item = new ItemStack(Material.STONE_SWORD, 1);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§r§9Zombie slayer");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        setDamage(meta, 6.0, EquipmentSlot.HAND);
        setAttackSpeed(meta, -2.5, EquipmentSlot.HAND);

        AribnbNbtFormater nbtFormater = new AribnbNbtFormater(meta);
        nbtFormater.setIntField("aribnb_runevampire", 2);
        nbtFormater.setStrField("aribnb_sword", "aribnb_zombieslayer");

        //Lore builder
        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setItemType("Sword");
        lorebuilder.setRarity(Rarities.RARE);
        lorebuilder.buildAttributeLoreFromMeta(meta);
        lorebuilder.buildRuneFromMeta(meta);
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
