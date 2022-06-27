package aribnb.systems.itemmanager.items.resources.SpiderEgg;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;

public class SpiderEgg extends Item {

    public SpiderEgg(String id) {
        super(ItemTypes.RESOURCE, Rarities.UNCOMMON, Material.PLAYER_HEAD);

        SkullMeta skullmeta = (SkullMeta) getMeta();
        setSkinViaBase64(skullmeta, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTY2MTcxMzEyNTBlNTc4MzMzYTQ0MWZkZjRhNWI4YzYyMTYzNjQwYTlkMDZjZDY3ZGI4OTAzMWQwM2FjY2Y2In19fQ==");

        setName("Spider Egg");

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        LootSystem.addLoot(EntityType.CAVE_SPIDER, this, 0.002);
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("Used to summon the Black Widow");

        return lore;
    };
}
