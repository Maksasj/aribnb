package aribnb.systems.itemmanager.items.artifacts.SoulBottle;

import aribnb.aribnb.Aribnb;
import aribnb.systems.soulsystem.SoulSystem;
import aribnb.utils.itemlore_builder.AbilitieLoreType;
import aribnb.utils.itemlore_builder.ItemAbilitiesLore;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import aribnb.utils.nbt_formater.AribnbNbtFormater;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.*;

public class OpenSoulBottleGuiListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if(event.getInventory() == null) {
            return;
        }

        if(event.getClickedInventory().getHolder() instanceof SoulBottleGui) {
            event.setCancelled(true);

            Player player = (Player) event.getWhoClicked();
            if(event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getType() == Material.BUCKET) {
                event.setCancelled(true);

                Double player_souls = SoulSystem.getPlayerSouls(player);

                if (player.getInventory().getItemInMainHand().getType() == Material.POTION) {
                    AribnbNbtFormater nbt = new AribnbNbtFormater(player.getInventory().getItemInMainHand());

                    Double bottle_max_souls = nbt.getDoubleField("aribnb_soulbottle_max_capacity");
                    Double bottle_souls = nbt.getDoubleField("aribnb_soulbottle_capacity");
                    Double updated_bottle_souls = 0.0;

                    if(bottle_souls + player_souls < bottle_max_souls) {
                        updated_bottle_souls = bottle_souls + player_souls;
                        player_souls = 0.0;
                    } else {
                        updated_bottle_souls = bottle_max_souls;
                        player_souls = (bottle_max_souls - bottle_souls);
                    }

                    if(nbt.hasStringField("aribnb_artifact")) {
                        if(nbt.getStringField("aribnb_artifact").equals("aribnb_soulbottle")) {
                            ItemStack item = player.getInventory().getItemInMainHand();
                            ItemMeta meta = item.getItemMeta();

                            ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
                            List<String> ab_lore = new ArrayList<>();;
                            ab_lore.add("Store and accumulate");
                            ab_lore.add("gained souls");

                            lorebuilder.setItemType("ARTIFACT");
                            lorebuilder.addCustomInfo("§bSouls stored: "+updated_bottle_souls+"/"+bottle_max_souls);
                            lorebuilder.setRarity(Rarities.EPIC);

                            lorebuilder.addItemAbilitieLore(new ItemAbilitiesLore(ab_lore, AbilitieLoreType.CLICK));
                            meta.setLore(lorebuilder.buildLore());

                            PersistentDataContainer data = meta.getPersistentDataContainer();
                            data.set(new NamespacedKey(Aribnb.getPlugin(), "aribnb_soulbottle_capacity"), PersistentDataType.DOUBLE, updated_bottle_souls);

                            item.setItemMeta(meta);

                            player.getInventory().setItemInMainHand(item);
                        }
                    }
                }

                SoulSystem.setSoulToPlayer(player, player_souls);
                player.closeInventory();
            } else if(event.getCurrentItem().getType() == Material.WATER_BUCKET) {
                event.setCancelled(true);

                Double player_souls = SoulSystem.getPlayerSouls(player);

                if (player.getInventory().getItemInMainHand().getType() == Material.POTION) {
                    AribnbNbtFormater nbt = new AribnbNbtFormater(player.getInventory().getItemInMainHand());

                    Double player_max_souls = SoulSystem.getPlayerMaxSouls(player);
                    Double bottle_max_souls = nbt.getDoubleField("aribnb_soulbottle_max_capacity");
                    Double bottle_souls = nbt.getDoubleField("aribnb_soulbottle_capacity");

                    if(bottle_souls + player_souls < player_max_souls) {
                        player_souls += bottle_souls;
                    } else {
                        bottle_souls -= (player_max_souls - player_souls);
                        player_souls = player_max_souls;
                    }

                    if(nbt.hasStringField("aribnb_artifact")) {
                        if(nbt.getStringField("aribnb_artifact").equals("aribnb_soulbottle")) {
                            ItemStack item = player.getInventory().getItemInMainHand();
                            ItemMeta meta = item.getItemMeta();

                            ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
                            List<String> ab_lore = new ArrayList<>();;
                            ab_lore.add("Store and accumulate");
                            ab_lore.add("gained souls");

                            lorebuilder.setItemType("ARTIFACT");
                            lorebuilder.addCustomInfo("§bSouls stored: "+bottle_souls+"/"+bottle_max_souls);
                            lorebuilder.setRarity(Rarities.EPIC);

                            lorebuilder.addItemAbilitieLore(new ItemAbilitiesLore(ab_lore, AbilitieLoreType.CLICK));
                            meta.setLore(lorebuilder.buildLore());

                            PersistentDataContainer data = meta.getPersistentDataContainer();
                            data.set(new NamespacedKey(Aribnb.getPlugin(), "aribnb_soulbottle_capacity"), PersistentDataType.DOUBLE, bottle_souls);

                            item.setItemMeta(meta);

                            player.getInventory().setItemInMainHand(item);
                        }
                    }
                }

                SoulSystem.setSoulToPlayer(player, player_souls);
                player.closeInventory();
            }
        }
    }
}
