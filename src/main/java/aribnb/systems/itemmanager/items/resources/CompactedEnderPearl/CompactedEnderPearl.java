package aribnb.systems.itemmanager.items.resources.CompactedEnderPearl;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

public class CompactedEnderPearl extends Item {

    public CompactedEnderPearl(String id) {
        super(ItemTypes.RESOURCE, Rarities.UNCOMMON, Material.ENDER_PEARL);

        setName("Compacted Ender Pearl");

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        bindCraft();
    }

    private void bindCraft() {
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_compactedenderpearl_craft"), item);
        sr.shape(   "PPP",
                    "PPP",
                    "PPP");
        sr.setIngredient('P', Material.ENDER_PEARL);
        Bukkit.getServer().addRecipe(sr);
    }
}
