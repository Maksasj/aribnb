package aribnb.systems.itemmanager.items.armor.unique_pieces.PiglinWarriorChestplate;

import aribnb.aribnb.Aribnb;
import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.itemmanager.items.armor.unique_pieces.BlazeSkull.BlazeSkullListener;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.AbilitieLoreType;
import aribnb.utils.itemlore_builder.ItemAbilitiesLore;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class PiglinWarriorChestplate extends Item {

    public PiglinWarriorChestplate(String id) {
        super(ItemTypes.CHESTPLATE, Rarities.EPIC, Material.GOLDEN_CHESTPLATE);

        setName("Piglin Warrior Chestplate");
        setDamage(4.0, EquipmentSlot.CHEST);
        setAttackSpeed(-0.3, EquipmentSlot.CHEST);
        setArmor(3.0, EquipmentSlot.CHEST);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.PIGLIN_BRUTE, this, 0.01);
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("This chestplate has been in countless battles...");

        return lore;
    };
}
