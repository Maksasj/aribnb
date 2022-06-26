package aribnb.systems.itemmanager.items.armor.unique_pieces.BlazePants;

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

import static org.bukkit.Bukkit.getServer;

public class BlazePants extends Item {

    public BlazePants(String id) {
        super(ItemTypes.LEGGINGS, Rarities.RARE, Material.LEATHER_LEGGINGS);

        setLeatherColorFromRGB(16744002);

        setName("Blaze Pants");
        setArmor(2.0, EquipmentSlot.LEGS);

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        bindTags(id);
        item.setItemMeta(getMeta());

        LootSystem.addLoot(EntityType.BLAZE, this, 0.005);
        getServer().getPluginManager().registerEvents(new BlazePantsListener(), Aribnb.getPlugin());
    }
}
