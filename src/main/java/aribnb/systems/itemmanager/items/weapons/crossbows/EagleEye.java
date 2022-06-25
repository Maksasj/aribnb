package aribnb.systems.itemmanager.items.weapons.crossbows;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;

import java.util.ArrayList;
import java.util.List;

public class EagleEye extends Item {

    public EagleEye(String id) {
        super(ItemTypes.CROSSBOW, Rarities.EPIC, Material.CROSSBOW);

        setName("Eagle Eye");

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        LootSystem.addLoot(EntityType.PILLAGER, this, 0.01);
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("Even grandfathers fought with this indestructible crossbow");

        return lore;
    };
}