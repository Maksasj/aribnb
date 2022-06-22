package aribnb.systems.itemmanager.items.resources.CompactedBone;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemManager;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

public class ThriceCompactedBone extends Item {

    public ThriceCompactedBone(String id) {
        super(ItemTypes.RESOURCE, Rarities.EPIC, Material.BONE);

        setName("Thrice Compacted Bone");

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        bindCraft();
    }

    private void bindCraft() {
        ItemStack tmp_item = ItemManager.getItemStack("aribnb_twicecompactedbone");
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_thricecompactedbone"), item);
        sr.shape(   "BBB",
                    "BBB",
                    "BBB");
        sr.setIngredient('B', new RecipeChoice.ExactChoice(tmp_item));
        Bukkit.getServer().addRecipe(sr);
    }
}
