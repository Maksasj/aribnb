package aribnb.aribnb;

import aribnb.systems.itemmanager.ItemManager;
import aribnb.systems.runesystem.RuneManager;
import aribnb.systems.soulsystem.SoulSystem;

import org.bukkit.plugin.java.JavaPlugin;

public final class Aribnb extends JavaPlugin {
    public SoulSystem soulsystem;
    public ItemManager itemmanager;
    public RuneManager runemanager;
    private static Aribnb plugin;

    @Override // Plugin startup logic
    public void onEnable() {
        plugin = this;

        soulsystem = new SoulSystem(this);
        soulsystem.setScheduler();

        itemmanager = new ItemManager();
        runemanager = new RuneManager();
    }

    @Override // Plugin shutdown logic
    public void onDisable() {

    }

    public static Aribnb getPlugin() {
        return plugin;
    }
}
