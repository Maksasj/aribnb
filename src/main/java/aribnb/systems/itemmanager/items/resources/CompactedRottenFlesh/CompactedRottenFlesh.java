package aribnb.systems.itemmanager.items.resources.CompactedRottenFlesh;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

public class CompactedRottenFlesh extends Item {

    public CompactedRottenFlesh(String id) {
        super(ItemTypes.RESOURCE, Rarities.UNCOMMON, Material.ROTTEN_FLESH);

        setName("Compacted Rotten Flesh");

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        bindCraft();
    }

    private void bindCraft() {
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_compactedrottenflesh_craft"), item);
        sr.shape(   "RRR",
                    "RRR",
                    "RRR");
        sr.setIngredient('R', Material.ROTTEN_FLESH);
        Bukkit.getServer().addRecipe(sr);
    }
}
