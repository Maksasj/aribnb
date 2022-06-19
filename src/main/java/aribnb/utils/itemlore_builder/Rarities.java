package aribnb.utils.itemlore_builder;

public enum Rarities {
    COMMON("§fCommon"),
    UNCOMMON("§aUncommon"),
    RARE("§9Rare"),
    EPIC("§5Epic"),
    LEGENDARY("§6Legendary"),
    MYTHIC("§dMythic"),
    DIVINE("§bDivine"),
    SUPREME("§cSupreme");

    private final String text;

    Rarities(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
