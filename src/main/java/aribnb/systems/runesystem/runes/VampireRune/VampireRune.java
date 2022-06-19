package aribnb.systems.runesystem.runes.VampireRune;

import aribnb.aribnb.Aribnb;

import java.util.Collections;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class VampireRune {
    public VampireRune() {
        getServer().getPluginManager().registerEvents(new VampireRuneListener(), Aribnb.getPlugin());
    }

    public List<String> getDescription() {
        return Collections.singletonList("TODO");
    }
}
