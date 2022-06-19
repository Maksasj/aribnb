package aribnb.utils.itemlore_builder;

public enum AttributeSlotType {
    MAIN_HAND("§r§7Then in main hand:"),
    OFF_HAND("§r§7hen in off hand:");

    private final String text;

    AttributeSlotType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
