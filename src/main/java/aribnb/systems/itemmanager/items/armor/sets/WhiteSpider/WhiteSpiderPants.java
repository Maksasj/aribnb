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

public class WhiteSpiderPants extends Item {

    public WhiteSpiderPants(String id) {
        super(ItemTypes.LEGGINGS, Rarities.RARE, Material.LEATHER_LEGGINGS);

        setLeatherColorFromRGB(13762557);

        setName("White Spider Pants");
        addScalarMovementSpeed(0.1, EquipmentSlot.LEGS);
        setArmor(3.0, EquipmentSlot.LEGS);
        setMaxHealth(3.0, EquipmentSlot.LEGS);

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
