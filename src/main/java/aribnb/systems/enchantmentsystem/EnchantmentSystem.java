package aribnb.systems.enchantmentsystem;

import aribnb.aribnb.Aribnb;

import static org.bukkit.Bukkit.getServer;

public class EnchantmentSystem {

    public EnchantmentSystem() {
        getServer().getPluginManager().registerEvents(new EnchantmentSystemListener(), Aribnb.getPlugin());
    };
}
