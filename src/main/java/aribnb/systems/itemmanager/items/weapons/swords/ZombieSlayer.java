package aribnb.systems.itemmanager.items.weapons.swords;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemManager;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.utils.itemlore_builder.*;
import aribnb.utils.nbt_formater.AribnbNbtFormater;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

public class ZombieSlayer extends Item {

    public ZombieSlayer(String id) {
        super(ItemTypes.SWORD, Rarities.RARE, Material.STONE_SWORD);

        setName("Zombie slayer");
        setDamage(6.0, EquipmentSlot.HAND);
        setAttackSpeed(-2.5, EquipmentSlot.HAND);

        AribnbNbtFormater nbtFormater = new AribnbNbtFormater(getMeta());
        nbtFormater.setStrField("aribnb_sword", "aribnb_zombieslayer");

        //Lore builder
        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta());
        getMeta().setLore(lorebuilder.buildLore());

        item.setItemMeta(getMeta());
        bindCraft();
    }

    private void bindCraft() {
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
