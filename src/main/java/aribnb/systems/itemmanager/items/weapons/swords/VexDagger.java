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

public class VexDagger extends Item {

    public VexDagger(String id) {
        super(ItemTypes.SWORD, Rarities.EPIC, Material.IRON_SWORD);

        setName("Vex Dagger");
        setDamage(9.0, EquipmentSlot.HAND);
        setAttackSpeed(1.0, EquipmentSlot.HAND);
        setMaxHealth(-12.0, EquipmentSlot.HAND);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        LootSystem.addLoot(EntityType.VEX, this, 0.03);
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("Be even nastier than the Vex!");

        return lore;
    };
}
