package aribnb.utils.itemlore_builder;

import org.bukkit.attribute.Attribute;
import org.bukkit.inventory.EquipmentSlot;

public enum AttributeSlotType {
    MAIN_HAND("§r§7Then in Main Hand:"),
    OFF_HAND("§r§7hen in Off Hand:"),
    HEAD("§r§7Then on Head:"),
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
        }
        return NONE;
    }
}
