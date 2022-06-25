package aribnb.systems.itemmanager;

public enum ItemTypes {
    ARTIFACT("aribnb_artifact"),
    RESOURCE("aribnb_resource"),
    HELMET("aribnb_helmet"),
    CHESTPLATE("aribnb_chestplate"),
    LEGGINGS("aribnb_leggings"),
    BOOTS("aribnb_boots"),
    SWORD("aribnb_sword"),
    NONE("aribnb_nonetype");

    private final String text;

    ItemTypes(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static ItemTypes getFromString(String text) {
        if(text == "aribnb_sword") {
            return SWORD;
        } else if(text == "aribnb_resource") {
            return RESOURCE;
        } else if(text == "aribnb_artifact") {
            return ARTIFACT;
        } else if(text == "aribnb_helmet") {
            return HELMET;
        }

        return NONE;
    }
}
