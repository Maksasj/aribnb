package aribnb.aribnb;

import aribnb.systems.enchantmentsystem.EnchantmentSystem;
import aribnb.systems.itemmanager.ItemManager;
import aribnb.systems.lootsystem.LootSystem;
import aribnb.systems.runesystem.RuneManager;
import aribnb.systems.soulsystem.SoulSystem;

import org.bukkit.plugin.java.JavaPlugin;

public final class Aribnb extends JavaPlugin {
    public SoulSystem soulsystem;

    public ItemManager itemmanager;

    public RuneManager runemanager;

    public EnchantmentSystem enchantmentsystem;

    public LootSystem lootsystem;

    private static Aribnb plugin;

    @Override // Plugin startup logic
    public void onEnable() {
        plugin = this;

        soulsystem = new SoulSystem(this);
        soulsystem.setScheduler();

        runemanager = new RuneManager();
        enchantmentsystem = new EnchantmentSystem();
        lootsystem = new LootSystem();

        itemmanager = new ItemManager();
    }

    @Override // Plugin shutdown logic
    public void onDisable() {

    }

    public static Aribnb getPlugin() {
        return plugin;
    }
}
