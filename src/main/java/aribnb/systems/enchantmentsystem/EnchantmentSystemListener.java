package aribnb.systems.enchantmentsystem;

import aribnb.systems.itemmanager.ItemManager;
import aribnb.systems.itemmanager.ItemTypes;
import aribnb.utils.itemlore_builder.AbilitieLoreType;
import aribnb.utils.itemlore_builder.ItemAbilitiesLore;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import aribnb.utils.nbt_formater.AribnbNbtFormater;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class EnchantmentSystemListener implements Listener {

    public EnchantmentSystemListener() {};

    @EventHandler
    public void onEnchant(EnchantItemEvent event) {
        ItemStack item = event.getItem();

        if(!(EnchantmentSystem.isEnchantable(item))) {
            return;
        }

        item.addUnsafeEnchantments(event.getEnchantsToAdd());
        event.setCancelled(true);

        AribnbNbtFormater nbtformater = new AribnbNbtFormater(item);

        ItemMeta meta = item.getItemMeta();
        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();

        if(nbtformater.hasStringField("aribnb_type")) {
            Rarities rarity = Rarities.fromId(nbtformater.getStringField("aribnb_rarity"));

            String item_type = nbtformater.getStringField("aribnb_type");
            String item_id = nbtformater.getStringField(item_type);

            List<String> ab_lore = ItemManager.getItem(item_id).getAbility();
            List<String> lore = ItemManager.getItem(item_id).getDescription();
            List<String> customInfo = ItemManager.getItem(item_id).getCustomInfo();

            if(ab_lore != null) {
                lorebuilder.addItemAbilitieLore(new ItemAbilitiesLore(ab_lore, AbilitieLoreType.PASSIVE));
            }

            if(lore != null) {
                lorebuilder.setLore(lore);
            }

            if(customInfo != null) {
                lorebuilder.addCustomInfo(customInfo);
            }

            lorebuilder.autoBuild(rarity, meta, ItemTypes.getFromString(nbtformater.getStringField("aribnb_type")));
        } else {
            meta = EnchantmentSystem.setAttributesToVanillaItems(item);

            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            lorebuilder.autoBuild(Rarities.COMMON, meta, ItemTypes.NONE);
        }

        meta.setLore(lorebuilder.buildLore());
        event.getItem().setItemMeta(meta);
    }

    @EventHandler
    public void onAnvilUse(InventoryClickEvent event) {
        if(event.getCurrentItem() == null) {
            return;
        }

        Inventory inv = event.getInventory();

        if (inv instanceof AnvilInventory) {
            if(event.getSlot() == 2) {
                ItemStack item = event.getInventory().getItem(2);

                if(item == null) {
                    return;
                }

                if(!(EnchantmentSystem.isEnchantable(item))) {
                    return;
                }

                AribnbNbtFormater nbtformater = new AribnbNbtFormater(item);

                ItemMeta meta = item.getItemMeta();
                ItemLoreBuilder lorebuilder = new ItemLoreBuilder();

                if(nbtformater.hasStringField("aribnb_type")) {
                    Rarities rarity = Rarities.fromId(nbtformater.getStringField("aribnb_rarity"));

                    String item_type = nbtformater.getStringField("aribnb_type");
                    String item_id = nbtformater.getStringField(item_type);

                    List<String> ab_lore = ItemManager.getItem(item_id).getAbility();
                    List<String> lore = ItemManager.getItem(item_id).getDescription();
                    List<String> customInfo = ItemManager.getItem(item_id).getCustomInfo();

                    if(ab_lore != null) {
                        lorebuilder.addItemAbilitieLore(new ItemAbilitiesLore(ab_lore, AbilitieLoreType.PASSIVE));
                    }

                    if(lore != null) {
                        lorebuilder.setLore(lore);
                    }

                    if(customInfo != null) {
                        lorebuilder.addCustomInfo(customInfo);
                    }

                    lorebuilder.autoBuild(rarity, meta, ItemTypes.getFromString(nbtformater.getStringField("aribnb_type")));
                } else {
                    meta = EnchantmentSystem.setAttributesToVanillaItems(item);

                    meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

                    lorebuilder.autoBuild(Rarities.COMMON, meta, ItemTypes.NONE);
                }

                meta.setLore(lorebuilder.buildLore());
                item.setItemMeta(meta);
                event.getInventory().setItem(2, item);
            }
        }
    }
}
