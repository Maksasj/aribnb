package aribnb.systems.runesystem.runes.SecondChance;

import aribnb.aribnb.Aribnb;
import aribnb.systems.runesystem.Rune;
import aribnb.utils.roman_numerals.RomanNumerals;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class SecondChanceRune extends Rune {

    public SecondChanceRune(Integer _lvl, Integer _max_lvl) {
        super(_lvl, _max_lvl);

        getServer().getPluginManager().registerEvents(new SecondChanceRuneListener(), Aribnb.getPlugin());
    }

    @Override
    public List<String> getDescription(Integer _lvl) {
        String rom_lvl = new RomanNumerals().intToRoman(_lvl);

        List<String> lore = new ArrayList<>();
        lore.add("§r§9Second chance "+rom_lvl);
        lore.add("§r§7Works like soulbound");
        lore.add("§r§7but for items");
        return lore;
    }
}
