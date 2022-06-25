package aribnb.systems.itemmanager.items.armor.unique_pieces.SerialKillerMask;

import aribnb.aribnb.Aribnb;
import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.systems.itemmanager.items.armor.unique_pieces.BlazeSkull.BlazeSkullListener;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class SerialKillerMask extends Item {

    public SerialKillerMask(String id) {
        super(ItemTypes.HELMET, Rarities.EPIC, Material.PLAYER_HEAD);

        SkullMeta skullmeta = (SkullMeta) getMeta();
        setSkinViaBase64(skullmeta, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTQwN2RhYTg3YzQyZjg2YzA3ODk1ZmQ0NTUwMTkwZDEwOGFlNzJiYThiNzllYzMzNTEzNmEyYmQ0MDczY2Y5ZCJ9fX0=");

        setName("Serial Killer Mask");
        setAttackSpeed(0.3, EquipmentSlot.HEAD);
        setDamage(1.0, EquipmentSlot.HEAD);
        setArmor(4.0, EquipmentSlot.HEAD);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.VINDICATOR, this, 0.007);
        getServer().getPluginManager().registerEvents(new BlazeSkullListener(), Aribnb.getPlugin());
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("Mask even splattered with blood");

        return lore;
    };
}

