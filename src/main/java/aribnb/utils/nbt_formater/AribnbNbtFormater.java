package aribnb.utils.nbt_formater;

import aribnb.aribnb.Aribnb;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class AribnbNbtFormater {
    private static PersistentDataContainer data;

    public AribnbNbtFormater(ItemStack item) {
        ItemMeta meta = item.getItemMeta();
        data = meta.getPersistentDataContainer();
    }

    public static PersistentDataContainer getData() {
        return data;
    }

    public boolean hasStringField(String id) {
        return data.has(new NamespacedKey(Aribnb.getPlugin(), id), PersistentDataType.STRING);
    }

    public boolean hasIntField(String id) {
        return data.has(new NamespacedKey(Aribnb.getPlugin(), id), PersistentDataType.INTEGER);
    }

    public boolean hasFloatField(String id) {
        return data.has(new NamespacedKey(Aribnb.getPlugin(), id), PersistentDataType.FLOAT);
    }

    public String getStringField(String id) {
        return data.get(new NamespacedKey(Aribnb.getPlugin(), id), PersistentDataType.STRING);
    }

    public Integer getIntField(String id) {
        return data.get(new NamespacedKey(Aribnb.getPlugin(), id), PersistentDataType.INTEGER);
    }

    public Float getFloatField(String id) {
        return data.get(new NamespacedKey(Aribnb.getPlugin(), id), PersistentDataType.FLOAT);
    }

    public void setStrField(String id, String value) {
        data.set(new NamespacedKey(Aribnb.getPlugin(), id), PersistentDataType.STRING, value);
    }

    public void setIntField(String id, Integer value) {
        data.set(new NamespacedKey(Aribnb.getPlugin(), id), PersistentDataType.INTEGER, value);
    }

    public void setFloatField(String id, Float value) {
        data.set(new NamespacedKey(Aribnb.getPlugin(), id), PersistentDataType.FLOAT, value);
    }
}
