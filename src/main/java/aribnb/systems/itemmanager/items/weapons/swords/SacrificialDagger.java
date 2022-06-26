package aribnb.systems.itemmanager.items.weapons.swords;

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

public class SacrificialDagger extends Item {

    public SacrificialDagger(String id) {
        super(ItemTypes.SWORD, Rarities.UNCOMMON, Material.STONE_SWORD);

        setName("Sacrificial Dagger");
        setDamage(9.0, EquipmentSlot.HAND);
        setAttackSpeed(-3.0, EquipmentSlot.HAND);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        LootSystem.addLoot(EntityType.HUSK, this, 0.005);
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("An ancient blade with incredible power");

        return lore;
    };
}
