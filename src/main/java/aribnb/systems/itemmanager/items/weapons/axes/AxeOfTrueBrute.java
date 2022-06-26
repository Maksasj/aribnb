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

public class AxeOfTrueBrute extends Item {

    public AxeOfTrueBrute(String id) {
        super(ItemTypes.BATTLE_AXE, Rarities.EPIC, Material.GOLDEN_AXE);

        addGlittering();

        setName("Axe Of True Brute");
        setDamage(11.0, EquipmentSlot.HAND);
        setAttackSpeed(-3.2, EquipmentSlot.HAND);
        setAttackKnockback(1.5, EquipmentSlot.HAND);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());
        LootSystem.addLoot(EntityType.PIGLIN_BRUTE, this, 0.02);
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("You have become truly brutal");

        return lore;
    };
}
