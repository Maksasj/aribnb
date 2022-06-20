package aribnb.systems.runesystem.runes.ThunderRune;

import aribnb.aribnb.Aribnb;
import aribnb.systems.runesystem.Rune;
import aribnb.systems.runesystem.runes.VampireRune.VampireRuneListener;
import aribnb.utils.roman_numerals.RomanNumerals;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class ThunderRune extends Rune {
    public ThunderRune(Integer _lvl, Integer _max_lvl) {
        super(_lvl, _max_lvl);

        getServer().getPluginManager().registerEvents(new ThunderRuneListener(), Aribnb.getPlugin());
    }
    @Override
    public List<String> getDescription(Integer _lvl) {
        String rom_lvl = new RomanNumerals().intToRoman(_lvl);

        List<String> lore = new ArrayList<>();
        lore.add("§r§9Thunder "+rom_lvl);
        lore.add("§r§7Have a §e"+_lvl.toString()+"%§7 chance");
        lore.add("§r§7to strike attacked");
        lore.add("§r§7entity with lightning");
        return lore;
    }
}
