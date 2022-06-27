package aribnb.systems.itemmanager.items.armor.sets.Tarantula;

import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;

public class TarantulaHelmet extends Item {

    public TarantulaHelmet(String id) {
        super(ItemTypes.HELMET, Rarities.UNCOMMON, Material.PLAYER_HEAD);

        SkullMeta skullmeta = (SkullMeta) getMeta();
        setSkinViaBase64(skullmeta, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODMwMDk4NmVkMGEwNGVhNzk5MDRmNmFlNTNmNDllZDNhMGZmNWIxZGY2MmJiYTYyMmVjYmQzNzc3ZjE1NmRmOCJ9fX0=");

        setName("Tarantula Helmet");
        addScalarMovementSpeed(0.05, EquipmentSlot.CHEST);
        setArmor(3.0, EquipmentSlot.CHEST);
        setMaxHealth(2.0, EquipmentSlot.CHEST);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.CAVE_SPIDER, this, 0.002);
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("Not with a slipper!");

        return lore;
    };
}
