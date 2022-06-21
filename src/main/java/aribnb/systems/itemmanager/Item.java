package aribnb.systems.itemmanager;

import aribnb.utils.itemlore_builder.Rarities;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;

public class Item {
    public ItemStack item;
    private Rarities rarity;

    public Item(Rarities _rarity) {
        rarity = _rarity;
    }
    public void setDamage(ItemMeta meta, Double value, EquipmentSlot slot) {
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "Melee attack damage",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public void setAttackSpeed(ItemMeta meta, Double value, EquipmentSlot slot) {
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "Melee attack speed",value, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
    }

    public Rarities getRarity() {
        return rarity;
    }
}
