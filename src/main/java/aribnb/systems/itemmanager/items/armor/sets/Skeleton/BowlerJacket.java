package aribnb.systems.itemmanager.items.armor.sets.Skeleton;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;

public class BowlerJacket extends Item {

    public BowlerJacket(String id) {
        super(ItemTypes.CHESTPLATE, Rarities.COMMON, Material.LEATHER_CHESTPLATE);

        setLeatherColorFromRGB(2204671);

        setName("Bowler Jacket");
        setArmor(2.0, EquipmentSlot.CHEST);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.SKELETON, this, 0.005);
    }
}
