package aribnb.systems.runesystem.runes.SpeedsterRune;

import aribnb.aribnb.Aribnb;
import aribnb.systems.runesystem.Rune;
import aribnb.utils.roman_numerals.RomanNumerals;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class SpeedsterRune extends Rune {

    public SpeedsterRune(Integer _lvl, Integer _max_lvl) {
        super(_lvl, _max_lvl);

        getServer().getPluginManager().registerEvents(new SpeedsterRuneListener(), Aribnb.getPlugin());
    }

    @Override
    public List<String> getDescription(Integer _lvl) {
        String rom_lvl = new RomanNumerals().intToRoman(_lvl);

        List<String> lore = new ArrayList<>();
        lore.add("§r§9Speedster "+rom_lvl);
        lore.add("§r§7After killing mob, you gain");
        lore.add("§r§7Speed I effect ");
        lore.add("§r§7for §e"+(_lvl*4)+"§7 seconds");
        return lore;
    }
}