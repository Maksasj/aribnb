package aribnb.systems.itemmanager.items.armor.sets.WhiteSpider;

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

public class WhiteSpiderHelmet extends Item {

    public WhiteSpiderHelmet(String id) {
        super(ItemTypes.HELMET, Rarities.RARE, Material.PLAYER_HEAD);

        SkullMeta skullmeta = (SkullMeta) getMeta();
        setSkinViaBase64(skullmeta, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2Q5N2E2MTgzMjEzZjg4NDZkMzg1MGEzZWVkMTc2OTVhNTI3MTc0MTIxMjA1ZjE0MWI3MTljMTk2YmNmNjBiMiJ9fX0=");

        setName("White Spider Helmet");
        addScalarMovementSpeed(0.1, EquipmentSlot.HEAD);
        setArmor(3.0, EquipmentSlot.HEAD);
        setMaxHealth(2.0, EquipmentSlot.HEAD);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.CAVE_SPIDER, this, 0.0007);
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("Just don't hit it with a slipper, please");

        return lore;
    };
}
