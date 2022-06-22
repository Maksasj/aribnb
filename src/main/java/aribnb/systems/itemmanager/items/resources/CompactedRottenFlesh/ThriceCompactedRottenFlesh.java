package aribnb.systems.itemmanager.items.resources.CompactedRottenFlesh;

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

public class ThriceCompactedRottenFlesh extends Item {

    public ThriceCompactedRottenFlesh(String id) {
        super(ItemTypes.RESOURCE, Rarities.EPIC, Material.ROTTEN_FLESH);

        setName("Thrice Compacted Rotten Flesh");

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        bindCraft();
    }

    private void bindCraft() {
        ItemStack tmp_item = ItemManager.getItemStack("aribnb_twicecompactedrottenflesh");
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_thricecompactedrottenflesh_craft"), item);
        sr.shape(   "RRR",
                    "RRR",
                    "RRR");
        sr.setIngredient('R', new RecipeChoice.ExactChoice(tmp_item));
        Bukkit.getServer().addRecipe(sr);
    }
}
