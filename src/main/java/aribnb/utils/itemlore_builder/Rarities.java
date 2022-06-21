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

    public RaritieColors toColor() {
        if(text == COMMON.toString()) {
            return RaritieColors.COMMON;
        } else if (text == UNCOMMON.toString()){
            return RaritieColors.UNCOMMON;
        } else if (text == RARE.toString()){
            return RaritieColors.RARE;
        } else if (text == EPIC.toString()){
            return RaritieColors.EPIC;
        } else if (text == LEGENDARY.toString()){
            return RaritieColors.LEGENDARY;
        } else if (text == MYTHIC.toString()){
            return RaritieColors.MYTHIC;
        } else if (text == DIVINE.toString()){
            return RaritieColors.DIVINE;
        } else if (text == SUPREME.toString()) {
            return RaritieColors.SUPREME;
        }

        return RaritieColors.COMMON;
    }
}
