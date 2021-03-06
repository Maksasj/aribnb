package aribnb.utils.itemlore_builder;

import org.bukkit.attribute.Attribute;

public enum AttributeType {
    ATTACK_DAMAGE("Attack Damage"),
    ATTACK_SPEED("Attack Speed"),
    MAX_HEALTH("Max Health"),
    ARMOR("Armor"),
    ARMOR_TOUGHNESS("Armor Toughness"),
    KNOCKBACK_RESISTANCE("Knockback Resistance"),
    LUCK("Luck"),
    MOVEMENT_SPEED("Movement Speed"),
    NONE("None");

    private final String text;

    AttributeType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static AttributeType getFromGeneric(Attribute attribute) {
        if(attribute.equals(Attribute.GENERIC_ATTACK_DAMAGE)) {
            return ATTACK_DAMAGE;
        } else if (attribute.equals(Attribute.GENERIC_ATTACK_SPEED)) {
            return ATTACK_SPEED;
        } else if (attribute.equals(Attribute.GENERIC_ARMOR)) {
            return ARMOR;
        } else if (attribute.equals(Attribute.GENERIC_MAX_HEALTH)) {
            return MAX_HEALTH;
        } else if (attribute.equals(Attribute.GENERIC_ARMOR_TOUGHNESS)) {
            return ARMOR_TOUGHNESS;
        } else if (attribute.equals(Attribute.GENERIC_KNOCKBACK_RESISTANCE)) {
            return KNOCKBACK_RESISTANCE;
        } else if (attribute.equals(Attribute.GENERIC_LUCK)) {
            return LUCK;
        } else if (attribute.equals(Attribute.GENERIC_MOVEMENT_SPEED)) {
            return MOVEMENT_SPEED;
        }

        return NONE;
    }
}
