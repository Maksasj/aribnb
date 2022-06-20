package aribnb.systems.runesystem;

import aribnb.systems.runesystem.runes.VampireRune.VampireRune;
import aribnb.utils.itemlore_builder.AttributeLoreType;
import aribnb.utils.itemlore_builder.AttributeSlotType;

import java.util.HashMap;
import java.util.List;

public class RuneManager {
    private static HashMap<String, Rune> runes;
    public RuneManager() {
        runes = new HashMap<String, Rune>();
        runes.put("aribnb_runevampire", new VampireRune(1, 3));
    }

    public static Rune getRune(String id) {
        return runes.get(id);
    }

}
