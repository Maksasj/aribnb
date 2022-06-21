package aribnb.systems.enchantmentsystem;

import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;

public class EnchantmentSystemListener implements Listener {

    public EnchantmentSystemListener() {};

    @EventHandler
    public void onEnchant(EnchantItemEvent event) {
        event.setCancelled(true);

        ItemStack item = event.getItem();
        item.addUnsafeEnchantments(event.getEnchantsToAdd());

        ItemMeta meta = item.getItemMeta();
        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.autoBuild(Rarities.RARE, meta);
        System.out.println("TODO");
        meta.setLore(lorebuilder.buildLore());

        event.getItem().setItemMeta(meta);
    }
}
