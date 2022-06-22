package aribnb.systems.itemmanager;

public enum ItemTypes {
    ARTIFACT("aribnb_artifact"),
    RESOURCE("aribnb_resource"),
    SWORD("aribnb_sword");

    private final String text;

    ItemTypes(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
