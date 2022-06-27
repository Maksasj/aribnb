package aribnb.systems.itemmanager.items.armor.sets.Cat;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;

import java.util.ArrayList;
import java.util.List;

public class CatChestplate extends Item {

    public CatChestplate(String id) {
        super(ItemTypes.CHESTPLATE, Rarities.RARE, Material.LEATHER_CHESTPLATE);

        setLeatherColorFromRGB(0);

        setName("Cat Chestplate");
        setLuck(1.0, EquipmentSlot.CHEST);
        setArmor(2.0, EquipmentSlot.CHEST);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.CAT, this, 0.01);
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("Meow?");

        return lore;
    };
}
