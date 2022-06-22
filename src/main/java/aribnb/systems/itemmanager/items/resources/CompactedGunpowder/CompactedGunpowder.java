package aribnb.systems.itemmanager.items.resources.CompactedGunpowder;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

public class CompactedGunpowder extends Item {

    public CompactedGunpowder(String id) {
        super(ItemTypes.RESOURCE, Rarities.UNCOMMON, Material.GUNPOWDER);

        setName("Compacted Gunpowder");

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        bindCraft();
    }

    private void bindCraft() {
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_compactedgunpowder_craft"), item);
        sr.shape(   "GGG",
                    "GGG",
                    "GGG");
        sr.setIngredient('G', Material.GUNPOWDER);
        Bukkit.getServer().addRecipe(sr);
    }
}
