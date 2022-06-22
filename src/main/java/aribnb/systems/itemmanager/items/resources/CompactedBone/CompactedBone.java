package aribnb.systems.itemmanager.items.resources.CompactedBone;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

public class CompactedBone extends Item {

    public CompactedBone(String id) {
        super(ItemTypes.RESOURCE, Rarities.UNCOMMON, Material.BONE);

        setName("Compacted Bone");

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        bindCraft();
    }

    private void bindCraft() {
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_compactedbone_craft"), item);
        sr.shape(   "BBB",
                    "BBB",
                    "BBB");
        sr.setIngredient('B', Material.BONE);
        Bukkit.getServer().addRecipe(sr);
    }
}
