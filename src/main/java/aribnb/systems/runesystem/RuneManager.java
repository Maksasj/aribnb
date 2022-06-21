package aribnb.systems.runesystem;

import aribnb.systems.runesystem.runes.CarlsonRune.CarlsonRune;
import aribnb.systems.runesystem.runes.FadingTouchRune.FadingTouchRune;
import aribnb.systems.runesystem.runes.SecondChanceRune.SecondChanceRune;
import aribnb.systems.runesystem.runes.SpeedsterRune.SpeedsterRune;
import aribnb.systems.runesystem.runes.ThunderRune.ThunderRune;
import aribnb.systems.runesystem.runes.VampireRune.VampireRune;

import java.util.HashMap;

public class RuneManager {
    private static HashMap<String, Rune> runes;
    public RuneManager() {
        runes = new HashMap<String, Rune>();
        runes.put("aribnb_runevampire", new VampireRune(1, 3));
        runes.put("aribnb_runethunder", new ThunderRune(1, 3));
        runes.put("aribnb_runefadingtouch", new FadingTouchRune(1, 3));
        runes.put("aribnb_runecarlson", new CarlsonRune(1, 3));
        runes.put("aribnb_runesecondchance", new SecondChanceRune(1, 3));
        runes.put("aribnb_runespeedster", new SpeedsterRune(1, 3));
    }

    public static Rune getRune(String id) {
        return runes.get(id);
    }

    public static HashMap<String, Rune> getRunes() {
        return runes;
    }

}
