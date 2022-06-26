package aribnb.systems.itemmanager.items.weapons.axes;

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

public class TrueAxeOfTrueBrute extends Item {

    public TrueAxeOfTrueBrute(String id) {
        super(ItemTypes.BATTLE_AXE, Rarities.LEGENDARY, Material.DIAMOND_AXE);

        addGlittering();

        setName("True Axe Of True Brute");
        setDamage(14.0, EquipmentSlot.HAND);
        setAttackSpeed(-2.5, EquipmentSlot.HAND);
        setAttackKnockback(2.5, EquipmentSlot.HAND);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        LootSystem.addLoot(EntityType.PIGLIN_BRUTE, this, 0.005);
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("You have become truly brutal, but already for sure");

        return lore;
    };
}
