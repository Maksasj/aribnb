package aribnb.systems.itemmanager.items.resources.CompactedGunpowder;

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

public class FourfoldCompactedGunpowder extends Item {

    public FourfoldCompactedGunpowder(String id) {
        super(ItemTypes.RESOURCE, Rarities.LEGENDARY, Material.GUNPOWDER);

        setName("Fourfold Compacted Gunpowder");

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        bindCraft();
    }

    private void bindCraft() {
        ItemStack tmp_item = ItemManager.getItemStack("aribnb_thricecompactedgunpowder");
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_fourfoldcompactedgunpowder_craft"), item);
        sr.shape(   "GGG",
                    "GGG",
                    "GGG");
        sr.setIngredient('G', new RecipeChoice.ExactChoice(tmp_item));
        Bukkit.getServer().addRecipe(sr);
    }
}
