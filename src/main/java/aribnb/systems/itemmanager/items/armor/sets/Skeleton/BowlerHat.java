package aribnb.systems.itemmanager.items.armor.sets.Skeleton;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;

public class BowlerHat extends Item {

    public BowlerHat(String id) {
        super(ItemTypes.HELMET, Rarities.COMMON, Material.LEATHER_HELMET);

        setLeatherColorFromRGB(2204671);

        setName("Bowler Hat");
        setArmor(1.0, EquipmentSlot.HEAD);
        setMaxHealth(2.0, EquipmentSlot.HEAD);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.SKELETON, this, 0.005);
    }
}