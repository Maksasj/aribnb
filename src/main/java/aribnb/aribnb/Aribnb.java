package aribnb.aribnb;

import aribnb.systems.enchantmentsystem.EnchantmentSystem;
import aribnb.systems.itemmanager.ItemManager;
import aribnb.systems.runesystem.RuneManager;
import aribnb.systems.soulsystem.SoulSystem;

import org.bukkit.plugin.java.JavaPlugin;

public final class Aribnb extends JavaPlugin {
    public SoulSystem soulsystem;
    public ItemManager itemmanager;
    public RuneManager runemanager;
    public EnchantmentSystem enchantmentsystem;
    private static Aribnb plugin;

    @Override // Plugin startup logic
    public void onEnable() {
        plugin = this;

        soulsystem = new SoulSystem(this);
        soulsystem.setScheduler();

        runemanager = new RuneManager();
        itemmanager = new ItemManager();
        enchantmentsystem = new EnchantmentSystem();
    }

    @Override // Plugin shutdown logic
    public void onDisable() {

    }

    public static Aribnb getPlugin() {
        return plugin;
    }
}
