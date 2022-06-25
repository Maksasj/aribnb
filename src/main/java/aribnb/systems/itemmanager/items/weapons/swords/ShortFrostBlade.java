package aribnb.systems.itemmanager.items.weapons.swords;

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

public class ShortFrostBlade extends Item {

    public ShortFrostBlade(String id) {
        super(ItemTypes.SWORD, Rarities.EPIC, Material.IRON_SWORD);

        setName("Short Frost Blade");
        addScalarDamage(0.2, EquipmentSlot.OFF_HAND);
        addScalarAttackSpeed(0.1, EquipmentSlot.OFF_HAND);
        setMaxHealth(-2.0, EquipmentSlot.OFF_HAND);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        LootSystem.addLoot(EntityType.STRAY, this, 0.006);
    }
}
