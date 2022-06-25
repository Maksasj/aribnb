package aribnb.systems.itemmanager.items.armor.unique_pieces.SpuderBoots;

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

public class SpuderBoots extends Item {

    public SpuderBoots(String id) {
        super(ItemTypes.BOOTS, Rarities.UNCOMMON, Material.LEATHER_BOOTS);

        setLeatherColorFromRGB(2236438);

        setName("Spuder Boots");
        addScalarMovementSpeed(0.05, EquipmentSlot.FEET);
        setArmor(3.0, EquipmentSlot.FEET);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.SPIDER, this, 0.01);
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("Oh no, take that spider outside !!");

        return lore;
    };
}
