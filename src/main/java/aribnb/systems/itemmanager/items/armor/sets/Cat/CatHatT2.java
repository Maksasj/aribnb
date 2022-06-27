package aribnb.systems.itemmanager.items.armor.sets.Cat;

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

public class CatHatT2 extends Item {

    public CatHatT2(String id) {
        super(ItemTypes.HELMET, Rarities.EPIC, Material.PLAYER_HEAD);

        SkullMeta skullmeta = (SkullMeta) getMeta();
        setSkinViaBase64(skullmeta, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDcyMGY1MjlmYzFiMTU0YjRkZDk4NDEyMzY4NzA3ODk3ZGQ3YzIyMjNmZmVhYTEyNjFlNjk3ZWZjZWRiNDkifX19");

        setName("Cat Hat");
        setLuck(2.5, EquipmentSlot.HEAD);
        setArmor(1.0, EquipmentSlot.HEAD);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.setLore(getDescription());
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.CAT, this, 0.001);
    }

    public List<String> getDescription() {
        List<String> lore = new ArrayList<>();;
        lore.add("Meow?");

        return lore;
    };
}
