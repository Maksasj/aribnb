package aribnb.utils.itemlore_builder;

public enum Rarities {
    COMMON("§fCOMMON"),
    UNCOMMON("§aUNCOMMON"),
    RARE("§9RARE"),
    EPIC("§5EPIC"),
    LEGENDARY("§6LEGENDARY"),
    MYTHIC("§dMYTHIC"),
    DIVINE("§bDIVINE"),
    SUPREME("§cSUPREME");

    private final String text;

    Rarities(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
