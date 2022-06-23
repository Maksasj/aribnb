package aribnb.utils.itemlore_builder;

import org.bukkit.attribute.Attribute;
import org.bukkit.inventory.EquipmentSlot;

public enum AttributeSlotType {
    MAIN_HAND("§r§7When in Main Hand:"),
    OFF_HAND("§r§7When in Off Hand:"),
    HEAD("§r§7When on Head:"),
    BODY("§r§7When on Body:"),
    LEGS("§r§7When on Legs:"),
    FEET("§r§7When on Feet:"),
    NONE("");

    private final String text;

    AttributeSlotType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static AttributeSlotType getFromGeneric(EquipmentSlot slot) {
        if(slot.equals(EquipmentSlot.HAND)) {
            return MAIN_HAND;
        } else if(slot.equals(EquipmentSlot.OFF_HAND)) {
            return OFF_HAND;
        } else if(slot.equals(EquipmentSlot.HEAD)) {
            return HEAD;
        } else if(slot.equals(EquipmentSlot.CHEST)) {
            return BODY;
        } else if(slot.equals(EquipmentSlot.LEGS)) {
            return LEGS;
        } else if(slot.equals(EquipmentSlot.FEET)) {
            return FEET;
        }

        return NONE;
    }
}
