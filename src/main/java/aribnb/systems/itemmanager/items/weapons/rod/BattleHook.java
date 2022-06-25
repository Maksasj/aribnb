package aribnb.systems.itemmanager.items.weapons.rod;

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

public class BattleHook extends Item {

    public BattleHook(String id) {
        super(ItemTypes.ROD, Rarities.EPIC, Material.FISHING_ROD);

        setName("Battle Hook");
        setDamage(9.0, EquipmentSlot.HAND);
        setAttackKnockback(1.0, EquipmentSlot.HAND);
        setAttackSpeed(-2.5, EquipmentSlot.HAND);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        LootSystem.addLoot(EntityType.PUFFERFISH, this, 0.5);
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("Just like Pudge from Doka 2");

        return lore;
    };
}
