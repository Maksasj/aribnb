package aribnb.utils.itemlore_builder;

import aribnb.utils.roman_numerals.RomanNumerals;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class EnchantLore {

    private static String enchantmentName(Enchantment enchantment) {
        String key = enchantment.getName();

        if ("ARROW_DAMAGE".equals(key)) {
            return "Power";
        } else if ("ARROW_FIRE".equals(key)) {
            return "Flame";
        } else if ("ARROW_INFINITE".equals(key)) {
            return "Infinity";
        } else if ("ARROW_KNOCKBACK".equals(key)) {
            return "Punch";
        } else if ("BINDING_CURSE".equals(key)) {
            return "Curse of Binding";
        } else if ("DAMAGE_ALL".equals(key)) {
            return "Sharpness";
        } else if ("DAMAGE_ARTHROPODS".equals(key)) {
            return "Bane of Arthropods";
        } else if ("DAMAGE_UNDEAD".equals(key)) {
            return "Smite";
        } else if ("DEPTH_STRIDER".equals(key)) {
            return "Depth Strider";
        } else if ("DIG_SPEED".equals(key)) {
            return "Efficiency";
        } else if ("DURABILITY".equals(key)) {
            return "Unbreaking";
        } else if ("FIRE_ASPECT".equals(key)) {
            return "Fire Aspect";
        } else if ("FROST_WALKER".equals(key)) {
            return "Frost Walker";
        } else if ("KNOCKBACK".equals(key)) {
            return "Knockback";
        } else if ("LOOT_BONUS_BLOCKS".equals(key)) {
            return "Fortune";
        } else if ("LOOT_BONUS_MOBS".equals(key)) {
            return "Looting";
        } else if ("LUCK".equals(key)) {
            return "Luck of the Sea";
        } else if ("LURE".equals(key)) {
            return "Lure";
        } else if ("MENDING".equals(key)) {
            return "Mending";
        } else if ("OXYGEN".equals(key)) {
            return "Respiration";
        } else if ("PROTECTION_ENVIRONMENTAL    ".equals(key)) {
            return "Protection";
        } else if ("PROTECTION_EXPLOSIONS".equals(key)) {
            return "Blast Protection";
        } else if ("PROTECTION_FALL".equals(key)) {
            return "Feather Falling";
        } else if ("PROTECTION_FIRE".equals(key)) {
            return "Fire Protection";
        } else if ("PROTECTION_PROJECTILE".equals(key)) {
            return "Projectile Protection";
        } else if ("SILK_TOUCH".equals(key)) {
            return "Silk Touch";
        } else if ("SWEEPING_EDGE".equals(key)) {
            return "Sweeping Edge";
        } else if ("THORNS".equals(key)) {
            return "Thorns";
        } else if ("VANISHING_CURSE".equals(key)) {
            return "Cure of Vanishing";
        } else if ("WATER_WORKER".equals(key)) {
            return "Aqua Affinity";
        }
        return "Unknown";
    }

    public static String toString(Enchantment enchantment, Integer _lvl) {
        String lvl = new RomanNumerals().intToRoman(_lvl);
        return (enchantmentName(enchantment).toString()+" "+lvl);
    }
}
