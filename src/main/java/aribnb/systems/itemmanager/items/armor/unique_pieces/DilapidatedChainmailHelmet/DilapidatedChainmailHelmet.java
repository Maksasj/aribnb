package aribnb.systems.itemmanager.items.armor.unique_pieces.DilapidatedChainmailHelmet;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;

public class DilapidatedChainmailHelmet extends Item {

    public DilapidatedChainmailHelmet(String id) {
        super(ItemTypes.HELMET, Rarities.COMMON, Material.CHAINMAIL_HELMET);

        setName("Dilapidated Chainmail Helmet");

        setArmor(1.0, EquipmentSlot.CHEST);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.ZOMBIE, this, 0.5);
    }
}
