package aribnb.systems.itemmanager.items.armor.unique_pieces.TurtlePants;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;

public class TurtlePants extends Item {

    public TurtlePants(String id) {
        super(ItemTypes.LEGGINGS, Rarities.RARE, Material.LEATHER_LEGGINGS);

        setLeatherColorFromRGB(4390763);

        setName("Turtle Pants");
        addScalarMovementSpeed(-0.1, EquipmentSlot.HEAD);
        setArmor(3.0, EquipmentSlot.HEAD);
        setMaxHealth(4.0, EquipmentSlot.HEAD);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.TURTLE, this, 0.02);
    }
}
