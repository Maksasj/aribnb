package aribnb.utils.itemlore_builder;

public enum RaritieColors {
    COMMON("§f"),
    UNCOMMON("§a"),
    RARE("§9"),
    EPIC("§5"),
    LEGENDARY("§6"),
    MYTHIC("§d"),
    DIVINE("§b"),
    SUPREME("§c");

    private final String text;

    RaritieColors(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
