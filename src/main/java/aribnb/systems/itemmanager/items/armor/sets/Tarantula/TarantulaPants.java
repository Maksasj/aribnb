package aribnb.systems.itemmanager.items.armor.sets.Tarantula;

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

public class TarantulaPants extends Item {

    public TarantulaPants(String id) {
        super(ItemTypes.LEGGINGS, Rarities.UNCOMMON, Material.LEATHER_LEGGINGS);

        setLeatherColorFromRGB(7675689);

        setName("Tarantula Pants");
        addScalarMovementSpeed(0.05, EquipmentSlot.CHEST);
        setArmor(2.0, EquipmentSlot.CHEST);
        setMaxHealth(2.0, EquipmentSlot.CHEST);

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
        lore.add("Not with a slipper!");

        return lore;
    };
}
