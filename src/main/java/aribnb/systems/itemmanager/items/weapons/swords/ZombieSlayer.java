package aribnb.systems.itemmanager.items.weapons.swords;

import aribnb.aribnb.Aribnb;
import aribnb.systems.itemmanager.ItemManager;
import aribnb.systems.itemmanager.items.resources.ZombieHeart.ZombieHeart;
import aribnb.systems.runesystem.RuneManager;
import aribnb.utils.itemlore_builder.*;
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

public class ZombieSlayer {
    public ItemStack zombieslayer;

    public ZombieSlayer() {
        ItemStack item = new ItemStack(Material.STONE_SWORD, 1);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§r§9Zombie slayer");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "Melee attack damage",6.0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "Melee attack damage",-2.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));

        //Lore builder
        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setItemType("SWORD");
        lorebuilder.setRarity(Rarities.RARE);
        lorebuilder.buildAttributeLoreFromMeta(meta);
        lorebuilder.addRuneLore(RuneManager.getRune("aribnb_runevampire"));
        meta.setLore(lorebuilder.buildLore());

        PersistentDataContainer data = meta.getPersistentDataContainer();
        data.set(new NamespacedKey(Aribnb.getPlugin(), "aribnb_sword"), PersistentDataType.STRING, "aribnb_zombieslayer");
        data.set(new NamespacedKey(Aribnb.getPlugin(), "aribnb_runevampire"), PersistentDataType.INTEGER, 2);
        item.setItemMeta(meta);

        zombieslayer = item;

        ItemStack zombieheart = ItemManager.getZombieHeart();
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
