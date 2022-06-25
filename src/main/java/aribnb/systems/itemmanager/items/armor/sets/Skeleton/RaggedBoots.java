package aribnb.systems.itemmanager.items.armor.sets.Skeleton;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;

public class RaggedBoots extends Item {

    public RaggedBoots(String id) {
        super(ItemTypes.BOOTS, Rarities.COMMON, Material.LEATHER_BOOTS);

        setLeatherColorFromRGB(16720161);

        setName("Ragged Boots");
        addScalarMovementSpeed(0.1, EquipmentSlot.FEET);
        setArmor(1.0, EquipmentSlot.FEET);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.SKELETON, this, 0.005);
    }
}
