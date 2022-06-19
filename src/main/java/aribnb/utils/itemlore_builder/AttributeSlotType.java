package aribnb.utils.itemlore_builder;

import org.bukkit.attribute.Attribute;
import org.bukkit.inventory.EquipmentSlot;

public enum AttributeSlotType {
    MAIN_HAND("§r§7Then in main hand:"),
    OFF_HAND("§r§7hen in off hand:"),
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
        }
        return NONE;
    }
}
