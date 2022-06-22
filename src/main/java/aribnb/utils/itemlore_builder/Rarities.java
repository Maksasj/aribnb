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

    public String toId() {
        if(text == COMMON.toString()) {
            return "aribnb_common";
        } else if (text == UNCOMMON.toString()){
            return "aribnb_uncommon";
        } else if (text == RARE.toString()){
            return "aribnb_rare";
        } else if (text == EPIC.toString()){
            return "aribnb_epic";
        } else if (text == LEGENDARY.toString()){
            return "aribnb_legendary";
        } else if (text == MYTHIC.toString()){
            return "aribnb_mythic";
        } else if (text == DIVINE.toString()){
            return "aribnb_divine";
        } else if (text == SUPREME.toString()) {
            return "aribnb_supreme";
        }

        return "aribnb_common";
    }

    public static Rarities fromId(String id) {
        if(id.equals("aribnb_common")) {
            return Rarities.COMMON;
        } else if (id.equals("aribnb_uncommon")){
            return Rarities.UNCOMMON;
        } else if (id.equals("aribnb_rare")){
            return Rarities.RARE;
        } else if (id.equals("aribnb_epic")){
            return Rarities.EPIC;
        } else if (id.equals("aribnb_legendary")){
            return Rarities.LEGENDARY;
        } else if (id.equals("aribnb_mythic")){
            return Rarities.MYTHIC;
        } else if (id.equals("aribnb_divine")){
            return Rarities.DIVINE;
        } else if (id.equals("aribnb_supreme")) {
            return Rarities.SUPREME;
        }

        return Rarities.COMMON;
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
