package aribnb.utils.itemlore_builder;

public enum AbilitieLoreType {
    RIGHT_CLICK("§6RIGHT CLICK"),
    LEFT_CLICK("§6LEFT CLICK"),
    CLICK("§6CLICK");

    private final String text;

    AbilitieLoreType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
