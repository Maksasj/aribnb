package aribnb.systems.runesystem.runes.VampireRune;

import aribnb.aribnb.Aribnb;
import aribnb.systems.runesystem.Rune;
import aribnb.utils.roman_numerals.RomanNumerals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class VampireRune extends Rune {
    public VampireRune(Integer _lvl, Integer _max_lvl) {
        setLvl(_lvl);
        setMaxLvl(_max_lvl);

        getServer().getPluginManager().registerEvents(new VampireRuneListener(), Aribnb.getPlugin());
    }

    @Override
    public List<String> getDescription() {
        String rom_lvl = new RomanNumerals().intToRoman(getLvl());

        List<String> lore = new ArrayList<>();
        lore.add("§r§9Vampire "+rom_lvl);
        lore.add("§r§7Gain §c+"+getLvl().toString()+"♥ §7health");
        lore.add("§r§7for each killed mob");

        return lore;
    }
}
