package aribnb.systems.enchantmentsystem;

import aribnb.aribnb.Aribnb;
import aribnb.systems.itemmanager.Item;
import org.bukkit.Material;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static org.bukkit.Bukkit.getServer;

public class EnchantmentSystem {

    public EnchantmentSystem() {
        getServer().getPluginManager().registerEvents(new EnchantmentSystemListener(), Aribnb.getPlugin());
    };

    public static ItemMeta setAttributesToVanillaItems(ItemStack item) {
        Material mat = item.getType();
        ItemMeta meta = item.getItemMeta();

            // Wooden Item
        if(mat == Material.WOODEN_SWORD) {
            Item.setDamage(meta, 4.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.5, EquipmentSlot.HAND);
        } else if(mat == Material.WOODEN_SHOVEL) {
            Item.setDamage(meta, 2.5, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.7, EquipmentSlot.HAND);
        } else if(mat == Material.WOODEN_PICKAXE) {
            Item.setDamage(meta, 2.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.6, EquipmentSlot.HAND);
        } else if(mat == Material.WOODEN_AXE) {
            Item.setDamage(meta, 7.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -3.0, EquipmentSlot.HAND);
        } else if(mat == Material.WOODEN_HOE) {
            Item.setDamage(meta, 1.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.7, EquipmentSlot.HAND);

            //Stone Items
        } else if(mat == Material.STONE_SWORD) {
            Item.setDamage(meta, 5.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.5, EquipmentSlot.HAND);
        } else if(mat == Material.STONE_SHOVEL) {
            Item.setDamage(meta, 3.5, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.7, EquipmentSlot.HAND);
        } else if(mat == Material.STONE_PICKAXE) {
            Item.setDamage(meta, 3.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.6, EquipmentSlot.HAND);
        } else if(mat == Material.STONE_AXE) {
            Item.setDamage(meta, 9.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -3.0, EquipmentSlot.HAND);
        } else if(mat == Material.STONE_HOE) {
            Item.setDamage(meta, 1.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.1, EquipmentSlot.HAND);

            // Golden Items
        } else if(mat == Material.GOLDEN_SWORD) {
            Item.setDamage(meta, 4.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.5, EquipmentSlot.HAND);
        } else if(mat == Material.GOLDEN_SHOVEL) {
            Item.setDamage(meta, 2.5, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.7, EquipmentSlot.HAND);
        } else if(mat == Material.GOLDEN_PICKAXE) {
            Item.setDamage(meta, 2.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.6, EquipmentSlot.HAND);
        } else if(mat == Material.GOLDEN_AXE) {
            Item.setDamage(meta, 7.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -3.0, EquipmentSlot.HAND);
        } else if(mat == Material.GOLDEN_HOE) {
            Item.setDamage(meta, 1.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.1, EquipmentSlot.HAND);

            // Iron Items
        } else if(mat == Material.IRON_SWORD) {
            Item.setDamage(meta, 6.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.5, EquipmentSlot.HAND);
        } else if(mat == Material.IRON_SHOVEL) {
            Item.setDamage(meta, 4.5, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.7, EquipmentSlot.HAND);
        } else if(mat == Material.IRON_PICKAXE) {
            Item.setDamage(meta, 4.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.6, EquipmentSlot.HAND);
        } else if(mat == Material.IRON_AXE) {
            Item.setDamage(meta, 9.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -3.0, EquipmentSlot.HAND);
        } else if(mat == Material.IRON_HOE) {
            Item.setDamage(meta, 1.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -1.9, EquipmentSlot.HAND);

            // Diamond Items
        } else if(mat == Material.DIAMOND_SWORD) {
            Item.setDamage(meta, 7.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.5, EquipmentSlot.HAND);
        } else if(mat == Material.DIAMOND_SHOVEL) {
            Item.setDamage(meta, 5.5, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.7, EquipmentSlot.HAND);
        } else if(mat == Material.DIAMOND_PICKAXE) {
            Item.setDamage(meta, 5.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.6, EquipmentSlot.HAND);
        } else if(mat == Material.DIAMOND_AXE) {
            Item.setDamage(meta, 9.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -3.0, EquipmentSlot.HAND);
        } else if(mat == Material.DIAMOND_HOE) {
            Item.setDamage(meta, 1.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -1.7, EquipmentSlot.HAND);

            // Netherite Items
        } else if(mat == Material.NETHERITE_SWORD) {
            Item.setDamage(meta, 8.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.5, EquipmentSlot.HAND);
        } else if(mat == Material.NETHERITE_SHOVEL) {
            Item.setDamage(meta, 6.5, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.7, EquipmentSlot.HAND);
        } else if(mat == Material.NETHERITE_PICKAXE) {
            Item.setDamage(meta, 6.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.6, EquipmentSlot.HAND);
        } else if(mat == Material.NETHERITE_AXE) {
            Item.setDamage(meta, 10.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -3.0, EquipmentSlot.HAND);
        } else if(mat == Material.NETHERITE_HOE) {
            Item.setDamage(meta, 1.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -1.6, EquipmentSlot.HAND);

            // Leather Armor
        } else if(mat == Material.LEATHER_HELMET) {
            Item.setArmor(meta, 1.0, EquipmentSlot.HEAD);
        } else if(mat == Material.LEATHER_CHESTPLATE) {
            Item.setArmor(meta, 3.0, EquipmentSlot.CHEST);
        } else if(mat == Material.LEATHER_LEGGINGS) {
            Item.setArmor(meta, 2.0, EquipmentSlot.LEGS);
        } else if(mat == Material.LEATHER_BOOTS) {
            Item.setArmor(meta, 1.0, EquipmentSlot.FEET);

            //Chainmainl Armor
        } else if(mat == Material.CHAINMAIL_HELMET) {
            Item.setArmor(meta, 2.0, EquipmentSlot.HEAD);
        } else if(mat == Material.CHAINMAIL_CHESTPLATE) {
            Item.setArmor(meta, 5.0, EquipmentSlot.CHEST);
        } else if(mat == Material.CHAINMAIL_LEGGINGS) {
            Item.setArmor(meta, 4.0, EquipmentSlot.LEGS);
        } else if(mat == Material.CHAINMAIL_BOOTS) {
            Item.setArmor(meta, 1.0, EquipmentSlot.FEET);

            //Iron Armor
        } else if(mat == Material.IRON_HELMET) {
            Item.setArmor(meta, 2.0, EquipmentSlot.HEAD);
        } else if(mat == Material.IRON_CHESTPLATE) {
            Item.setArmor(meta, 6.0, EquipmentSlot.CHEST);
        } else if(mat == Material.IRON_LEGGINGS) {
            Item.setArmor(meta, 5.0, EquipmentSlot.LEGS);
        } else if(mat == Material.IRON_BOOTS) {
            Item.setArmor(meta, 2.0, EquipmentSlot.FEET);

            //Golden Armor
        } else if(mat == Material.GOLDEN_HELMET) {
            Item.setArmor(meta, 2.0, EquipmentSlot.HEAD);
        } else if(mat == Material.GOLDEN_CHESTPLATE) {
            Item.setArmor(meta, 5.0, EquipmentSlot.CHEST);
        } else if(mat == Material.GOLDEN_LEGGINGS) {
            Item.setArmor(meta, 3.0, EquipmentSlot.LEGS);
        } else if(mat == Material.GOLDEN_BOOTS) {
            Item.setArmor(meta, 1.0, EquipmentSlot.FEET);

            //Diamond Armor
        } else if(mat == Material.DIAMOND_HELMET) {
            Item.setArmor(meta, 3.0, EquipmentSlot.HEAD);
            Item.setArmorToughness(meta, 2.0, EquipmentSlot.HEAD);
        } else if(mat == Material.DIAMOND_CHESTPLATE) {
            Item.setArmor(meta, 8.0, EquipmentSlot.CHEST);
            Item.setArmorToughness(meta, 2.0, EquipmentSlot.CHEST);
        } else if(mat == Material.DIAMOND_LEGGINGS) {
            Item.setArmor(meta, 6.0, EquipmentSlot.LEGS);
            Item.setArmorToughness(meta, 2.0, EquipmentSlot.LEGS);
        } else if(mat == Material.DIAMOND_BOOTS) {
            Item.setArmor(meta, 3.0, EquipmentSlot.FEET);
            Item.setArmorToughness(meta, 2.0, EquipmentSlot.FEET);

            //Netherite Armor
        } else if(mat == Material.NETHERITE_HELMET) {
            Item.setArmor(meta, 3.0, EquipmentSlot.HEAD);
            Item.setArmorToughness(meta, 3.0, EquipmentSlot.HEAD);
            Item.setKnockbackResistance(meta, 1.0, EquipmentSlot.HEAD);
        } else if(mat == Material.NETHERITE_CHESTPLATE) {
            Item.setArmor(meta, 8.0, EquipmentSlot.CHEST);
            Item.setArmorToughness(meta, 3.0, EquipmentSlot.CHEST);
            Item.setKnockbackResistance(meta, 1.0, EquipmentSlot.CHEST);
        } else if(mat == Material.NETHERITE_LEGGINGS) {
            Item.setArmor(meta, 6.0, EquipmentSlot.LEGS);
            Item.setArmorToughness(meta, 3.0, EquipmentSlot.LEGS);
            Item.setKnockbackResistance(meta, 1.0, EquipmentSlot.LEGS);
        } else if(mat == Material.NETHERITE_BOOTS) {
            Item.setArmor(meta, 3.0, EquipmentSlot.FEET);
            Item.setArmorToughness(meta, 3.0, EquipmentSlot.FEET);
            Item.setKnockbackResistance(meta, 1.0, EquipmentSlot.FEET);

            // Other Items
        } else if(mat == Material.TURTLE_HELMET) {
            Item.setArmor(meta, 1.0, EquipmentSlot.HEAD);
        } else if(mat == Material.TRIDENT) {
            Item.setDamage(meta, 9.0, EquipmentSlot.HAND);
            Item.setAttackSpeed(meta, -2.9, EquipmentSlot.HAND);
        }

        return meta;
    }
}
