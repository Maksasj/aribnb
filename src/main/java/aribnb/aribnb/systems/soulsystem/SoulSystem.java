package aribnb.aribnb.systems.soulsystem;

import aribnb.aribnb.systems.soulsystem.SoulKillRegen;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;

import static org.bukkit.Bukkit.getServer;

public class SoulSystem {
    static Plugin parent_plugin; //Get access to main Aribnb class
    private static HashMap<Player, Double> SOUL_POOL = new HashMap<Player, Double>();
    private static HashMap<Player, Double> MAX_SOUL_POOL = new HashMap<Player, Double>();

    public SoulSystem(Plugin plugin) {
        parent_plugin = plugin;
        getServer().getPluginManager().registerEvents(new SoulKillRegen(), parent_plugin);
    }

    public static void setScheduler() {
        getServer().getScheduler().scheduleSyncRepeatingTask(parent_plugin, new Runnable() {
            @Override
            public void run() {
                showSoulsForAllPlayers();
            }
        }, 0, 30);
    }
    private static void setupPlayerSouls(Player player) {
        SOUL_POOL.put(player, 0.0);
        MAX_SOUL_POOL.put(player, 10.0);
    }

    public static Double getPlayerSouls(Player player) {
        if(SOUL_POOL.containsKey(player) && MAX_SOUL_POOL.containsKey(player)) {
            return SOUL_POOL.get(player);
        }
        setupPlayerSouls(player);
        return 0.0;
    }

    public static Double getPlayerMaxSouls(Player player) {
        if(SOUL_POOL.containsKey(player) && MAX_SOUL_POOL.containsKey(player)) {
            return MAX_SOUL_POOL.get(player);
        }
        setupPlayerSouls(player);
        return 0.0;
    }

    public static void showSoulsInTitle(Player player) {
        if(SOUL_POOL.containsKey(player) && MAX_SOUL_POOL.containsKey(player)) {
            String message = "§bMana: §f"+SOUL_POOL.get(player).toString()+"/"+MAX_SOUL_POOL.get(player).toString();
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(message));
        } else {
            setupPlayerSouls(player);
        }
    }

    public static void showSoulsForAllPlayers() {
        for(Player player : Bukkit.getOnlinePlayers()){
            showSoulsInTitle(player);
        }
    }

    public static void addSoulToPlayer(Player player, Double value) {
        if(!(SOUL_POOL.containsKey(player) && MAX_SOUL_POOL.containsKey(player))) {
            setupPlayerSouls(player);
        }

        if(getPlayerSouls(player) + value < getPlayerMaxSouls(player)) {
            Double new_value = value + SOUL_POOL.get(player);

            SOUL_POOL.put(player, new_value);
        } else {
            SOUL_POOL.put(player, MAX_SOUL_POOL.get(player));
        }
    }
}
