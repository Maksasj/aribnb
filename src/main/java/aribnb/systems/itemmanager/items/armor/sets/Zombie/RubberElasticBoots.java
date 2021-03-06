package aribnb.systems.itemmanager.items.armor.sets.Zombie;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;

public class RubberElasticBoots extends Item {

    public RubberElasticBoots(String id) {
        super(ItemTypes.BOOTS, Rarities.COMMON, Material.LEATHER_BOOTS);

        setLeatherColorFromRGB(65335);

        setName("Rubber-Elastic Boots");
        setMovementSpeed(0.05, EquipmentSlot.FEET);
        setArmor(1.0, EquipmentSlot.FEET);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.ZOMBIE, this, 0.005);
    }
}
