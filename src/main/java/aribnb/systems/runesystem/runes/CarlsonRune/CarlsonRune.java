package aribnb.systems.runesystem.runes.CarlsonRune;

import aribnb.aribnb.Aribnb;
import aribnb.systems.runesystem.Rune;
import aribnb.utils.roman_numerals.RomanNumerals;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class CarlsonRune extends Rune {
    public CarlsonRune(Integer _lvl, Integer _max_lvl) {
        super(_lvl, _max_lvl);

        getServer().getPluginManager().registerEvents(new CarlsonRuneListener(), Aribnb.getPlugin());
    }
    @Override
    public List<String> getDescription(Integer _lvl) {
        String rom_lvl = new RomanNumerals().intToRoman(_lvl);

        List<String> lore = new ArrayList<>();
        lore.add("§r§9Carlson "+rom_lvl);
        lore.add("§r§7While hitting mob you");
        lore.add("§r§7have §e5%§7 chance to apply");
        lore.add("§r§7levitaion for §e"+_lvl*2+"§7 seconds");
        return lore;
    }
}