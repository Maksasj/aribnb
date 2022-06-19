package aribnb.utils.itemlore_builder;

import org.bukkit.attribute.Attribute;

public enum AttributeType {
    ATTACK_DAMAGE("Attack Damage"),
    ATTACK_SPEED("Attack Speed"),
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
        }
        return NONE;
    }
}
