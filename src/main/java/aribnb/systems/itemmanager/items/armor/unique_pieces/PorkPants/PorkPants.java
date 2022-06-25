package aribnb.systems.itemmanager.items.armor.unique_pieces.PorkPants;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;

public class PorkPants extends Item {

    public PorkPants(String id) {
        super(ItemTypes.LEGGINGS, Rarities.RARE, Material.LEATHER_LEGGINGS);

        setLeatherColorFromRGB(16746375);

        setName("Pork Pants");
        setArmor(3.0, EquipmentSlot.LEGS);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.ZOMBIFIED_PIGLIN, this, 0.005);
    }
}
