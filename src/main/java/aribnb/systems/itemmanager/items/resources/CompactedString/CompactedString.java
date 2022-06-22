package aribnb.systems.itemmanager.items.resources.CompactedString;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

public class CompactedString extends Item {

    public CompactedString(String id) {
        super(ItemTypes.RESOURCE, Rarities.UNCOMMON, Material.STRING);

        setName("Compacted String");

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        bindCraft();
    }

    private void bindCraft() {
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_compactedstring_craft"), item);
        sr.shape(   "SSS",
                    "SSS",
                    "SSS");
        sr.setIngredient('S', Material.STRING);
        Bukkit.getServer().addRecipe(sr);
    }
}
