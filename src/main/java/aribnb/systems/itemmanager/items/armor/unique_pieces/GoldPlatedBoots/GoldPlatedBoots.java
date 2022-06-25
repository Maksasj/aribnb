package aribnb.systems.itemmanager.items.armor.unique_pieces.GoldPlatedBoots;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;

public class GoldPlatedBoots extends Item {

    public GoldPlatedBoots(String id) {
        super(ItemTypes.BOOTS, Rarities.RARE, Material.GOLDEN_BOOTS);

        setName("Gold-Plated Boots");
        setMovementSpeed(0.05, EquipmentSlot.FEET);
        setArmor(1.0, EquipmentSlot.FEET);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.ZOMBIFIED_PIGLIN, this, 0.005);
    }
}
