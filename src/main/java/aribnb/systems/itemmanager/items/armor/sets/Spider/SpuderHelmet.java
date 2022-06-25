package aribnb.systems.itemmanager.items.armor.sets.Spider;

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

public class SpuderHelmet extends Item {

    public SpuderHelmet(String id) {
        super(ItemTypes.HELMET, Rarities.UNCOMMON, Material.PLAYER_HEAD);

        SkullMeta skullmeta = (SkullMeta) getMeta();
        setSkinViaBase64(skullmeta, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWE4MTRjZmE0MTgwMTJiMmJmN2FkNDY1YjM0ODc0NjdjZDNkNzgwOGIxODE3MThkZDkyNDVmNjVhNGFlYmI5YiJ9fX0=");

        setName("Spuder Helmet");
        addScalarMovementSpeed(0.05, EquipmentSlot.LEGS);
        setArmor(3.0, EquipmentSlot.LEGS);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.SPIDER, this, 0.01);
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();
        lore.add("Oh no, take that spider outside !!");

        return lore;
    }
}