package aribnb.aribnb;

import aribnb.systems.soulsystem.SoulSystem;

import org.bukkit.plugin.java.JavaPlugin;

public final class Aribnb extends JavaPlugin {
    SoulSystem soulsystem;

    @Override // Plugin startup logic
    public void onEnable() {
        soulsystem = new SoulSystem(this);
        soulsystem.setScheduler();
    }

    @Override // Plugin shutdown logic
    public void onDisable() {

    }
}
