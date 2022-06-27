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

public class WhiteSpiderChestplate extends Item {

    public WhiteSpiderChestplate(String id) {
        super(ItemTypes.CHESTPLATE, Rarities.RARE, Material.LEATHER_CHESTPLATE);

        setLeatherColorFromRGB(13762557);

        setName("White Spider Chestplate");
        addScalarMovementSpeed(0.1, EquipmentSlot.CHEST);
        setArmor(5.0, EquipmentSlot.CHEST);
        setMaxHealth(3.0, EquipmentSlot.CHEST);

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
