package aribnb.systems.itemmanager.items.armor.unique_pieces.BlazeSkull;

import aribnb.aribnb.Aribnb;
import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.utils.itemlore_builder.AbilitieLoreType;
import aribnb.utils.itemlore_builder.ItemAbilitiesLore;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class BlazeSkull extends Item {

    public BlazeSkull(String id) {
        super(ItemTypes.HELMET, Rarities.EPIC, Material.PLAYER_HEAD);

        SkullMeta skullmeta = (SkullMeta) getMeta();
        setSkinViaBase64(skullmeta, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzc0ZjY1ZjliOTk1OGE2MzkyYzhiNjMzMjRkNzZlODBkMmI1MDljMTk4NWEwMDIzMmFlY2NlNDA5NTg1YWUyYSJ9fX0=");

        setName("Blaze Skull");
        setMaxHealth(3.0, EquipmentSlot.HEAD);
        setArmor(4.0, EquipmentSlot.HEAD);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.addItemAbilitieLore(new ItemAbilitiesLore(getAbility(), AbilitieLoreType.PASSIVE));
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        bindCraft();

        getServer().getPluginManager().registerEvents(new BlazeSkullListener(), Aribnb.getPlugin());
    }

    public List<String> getAbility() {
        List<String> ab_lore = new ArrayList<>();;
        ab_lore.add("Gives you §cRegeneration II§7");
        ab_lore.add("while you on fire");

        return ab_lore;
    };

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("Molten skull of a");
        lore.add("very ancient blaze");

        return lore;
    };

    private void bindCraft() {
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_blazeskull_craft"), item);
        sr.shape(   "SSS",
                    "S S",
                    "   ");
        sr.setIngredient('S', Material.BLAZE_ROD);

        Bukkit.getServer().addRecipe(sr);
    }
}
