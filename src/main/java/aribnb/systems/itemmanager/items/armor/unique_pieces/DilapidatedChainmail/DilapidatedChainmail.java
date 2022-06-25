package aribnb.systems.itemmanager.items.armor.unique_pieces.DilapidatedChainmail;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;

public class DilapidatedChainmail extends Item {

    public DilapidatedChainmail(String id) {
        super(ItemTypes.CHESTPLATE, Rarities.COMMON, Material.CHAINMAIL_CHESTPLATE);

        setName("Dilapidated Chainmail");

        setArmor(2.0, EquipmentSlot.CHEST);
        setMaxHealth(0.2, EquipmentSlot.CHEST);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.ZOMBIE, this, 0.5);
    }
}