package aribnb.systems.itemmanager.items.artifacts.SoulBottle;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.List;

public class SoulBottleGui implements InventoryHolder {
    private Inventory inv;

    public SoulBottleGui() {
        inv = Bukkit.createInventory(this, 9, "Soul bottle"); //54 max size
        init();
    }

    private void init() {
        ItemStack item;

        //This is lime dye
        for(int i = 0; i < 2; i++) {
            item = createItem(" ", Material.GRAY_STAINED_GLASS_PANE, Collections.singletonList(""));
            inv.setItem(i, item);
        }

        item = createItem("§r§aStore gained souls", Material.BUCKET, Collections.singletonList(""));
        inv.setItem(2, item);

        for(int i = 3; i < 6; i++) {
            item = createItem(" ", Material.GRAY_STAINED_GLASS_PANE, Collections.singletonList(""));
            inv.setItem(i, item);
        }

        item = createItem("§r§aUse stored souls", Material.WATER_BUCKET, Collections.singletonList(""));
        inv.setItem(6, item);

        for(int i = 7; i < 9; i++) {
            item = createItem(" ", Material.GRAY_STAINED_GLASS_PANE, Collections.singletonList(""));
            inv.setItem(i, item);
        }

    }

    private ItemStack createItem(String name, Material mat, List<String> lore) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }
}