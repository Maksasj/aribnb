package aribnb.systems.itemmanager.items.resources.CompactedEnderPearl;

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

public class FourfoldCompactedEnderPearl extends Item {

    public FourfoldCompactedEnderPearl(String id) {
        super(ItemTypes.RESOURCE, Rarities.LEGENDARY, Material.ENDER_PEARL);

        setName("Fourfold Compacted Ender Pearl");

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        bindCraft();
    }

    private void bindCraft() {
        ItemStack tmp_item = ItemManager.getItemStack("aribnb_thricecompactedenderpearl");
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_fourfoldcompactedenderpearl_craft"), item);
        sr.shape(   "PPP",
                    "PPP",
                    "PPP");
        sr.setIngredient('P', new RecipeChoice.ExactChoice(tmp_item));
        Bukkit.getServer().addRecipe(sr);
    }
}
