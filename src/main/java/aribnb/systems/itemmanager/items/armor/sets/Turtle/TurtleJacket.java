package aribnb.systems.itemmanager.items.armor.sets.Turtle;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;

public class TurtleJacket extends Item {

    public TurtleJacket(String id) {
        super(ItemTypes.CHESTPLATE, Rarities.RARE, Material.LEATHER_CHESTPLATE);

        setLeatherColorFromRGB(4390763);

        setName("Turtle Jacket");
        addScalarMovementSpeed(-0.1, EquipmentSlot.CHEST);
        setArmor(3.0, EquipmentSlot.CHEST);
        setMaxHealth(5.0, EquipmentSlot.CHEST);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.TURTLE, this, 0.02);
    }
}
