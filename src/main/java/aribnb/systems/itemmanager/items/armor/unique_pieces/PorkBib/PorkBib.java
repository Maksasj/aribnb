package aribnb.systems.itemmanager.items.armor.unique_pieces.PorkBib;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;

public class PorkBib extends Item {

    public PorkBib(String id) {
        super(ItemTypes.CHESTPLATE, Rarities.RARE, Material.LEATHER_CHESTPLATE);

        setLeatherColorFromRGB(16746375);

        setName("Pork Bib");

        setArmor(5.0, EquipmentSlot.CHEST);
        setLuck(1.0, EquipmentSlot.CHEST);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.ZOMBIFIED_PIGLIN, this, 0.005);
    }
}
