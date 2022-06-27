package aribnb.systems.itemmanager.items.armor.sets.WhiteSpider;

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

public class WhiteSpiderBoots extends Item {

    public WhiteSpiderBoots(String id) {
        super(ItemTypes.BOOTS, Rarities.RARE, Material.LEATHER_BOOTS);

        setLeatherColorFromRGB(13762557);

        setName("White Spider Boots");
        addScalarMovementSpeed(0.1, EquipmentSlot.FEET);
        setArmor(3.0, EquipmentSlot.FEET);
        setMaxHealth(3.0, EquipmentSlot.FEET);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.CAVE_SPIDER, this, 0.0007);
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("Just don't hit it with a slipper, please");

        return lore;
    };
}
