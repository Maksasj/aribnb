package aribnb.systems.runesystem.runes.FadingTouchRune;

import aribnb.aribnb.Aribnb;
import aribnb.systems.runesystem.Rune;
import aribnb.systems.runesystem.runes.ThunderRune.ThunderRuneListener;
import aribnb.utils.roman_numerals.RomanNumerals;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class FadingTouchRune extends Rune {
    public FadingTouchRune(Integer _lvl, Integer _max_lvl) {
        super(_lvl, _max_lvl);

        getServer().getPluginManager().registerEvents(new FadingTouchRuneListener(), Aribnb.getPlugin());
    }
    @Override
    public List<String> getDescription(Integer _lvl) {
        String rom_lvl = new RomanNumerals().intToRoman(_lvl);

        List<String> lore = new ArrayList<>();
        lore.add("§r§9Fading touch "+rom_lvl);
        lore.add("§r§7Apply weakness with §e10%§7 change.");
        lore.add("§7Weakness strength relates on rune lvl");
        return lore;
    }
}