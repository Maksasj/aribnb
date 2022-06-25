package aribnb.systems.itemmanager.items.armor.unique_pieces.FakeCrown;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;

public class FakeCrown extends Item {

    public FakeCrown(String id) {
        super(ItemTypes.HELMET, Rarities.RARE, Material.GOLDEN_HELMET);

        setName("Fake Crown");

        setArmor(1.0, EquipmentSlot.HEAD);
        setLuck(0.2, EquipmentSlot.HEAD);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.ZOMBIFIED_PIGLIN, this, 0.005);
    }
}
