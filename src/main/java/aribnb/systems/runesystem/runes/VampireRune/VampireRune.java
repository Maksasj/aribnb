package aribnb.systems.runesystem.runes.VampireRune;

import aribnb.aribnb.Aribnb;

import java.util.Collections;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class VampireRune {
    private static Integer lvl;
    public VampireRune() {
        getServer().getPluginManager().registerEvents(new VampireRuneListener(), Aribnb.getPlugin());
    }

    public Integer getLvl() {
        return lvl;
    }

    public void setLvl(Integer value) {
        lvl = value;
    }

    public List<String> getDescription() {
        return Collections.singletonList("TODO");
    }
}
