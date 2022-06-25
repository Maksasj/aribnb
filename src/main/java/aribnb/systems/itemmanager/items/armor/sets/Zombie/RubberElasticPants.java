package aribnb.systems.itemmanager.items.armor.sets.Zombie;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;

public class RubberElasticPants extends Item {

    public RubberElasticPants(String id) {
        super(ItemTypes.LEGGINGS, Rarities.COMMON, Material.LEATHER_LEGGINGS);

        setLeatherColorFromRGB(65335);

        setName("Rubber-Elastic Pants");
        setKnockbackResistance(0.3, EquipmentSlot.LEGS);
        setArmor(2.0, EquipmentSlot.LEGS);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.ZOMBIE, this, 0.005);
    }
}
