package aribnb.utils.itemlore_builder;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class ItemLoreBuilder {
    private static List<String> lore;
    private static List<String> custom_info;
    private static List<ItemAbilitiesLore> abilitie_lore;
    private static Rarities rarity;
    private static String itemtype;

    public ItemLoreBuilder() {
        lore = new ArrayList<>();
        custom_info = new ArrayList<>();
        abilitie_lore = new ArrayList<>();
    };

    public void setRarity(Rarities value) {
        rarity = value;
    }

    public void addLore(String text) {
        lore.add(text);
    }

    public void setItemType(String value) {
        itemtype = value;
    }

    public void addCustomInfo(String value) {
        custom_info.add(value);
    }

    public void addItemAbilitieLore(ItemAbilitiesLore value) {
        abilitie_lore.add(value);
    }

    public void clear() {
        itemtype = null;
        rarity = null;
        abilitie_lore.clear();
        custom_info.clear();
        lore.clear();
    }

    public List<String> buildLore() {
        List<String> tmp = new ArrayList<>();

        //Custom info
        if(custom_info.size() > 0) {
            tmp.add("");
            for (String var : custom_info) {
                tmp.add("§r"+var);
            }
        }

        //Items lore
        if(lore.size() > 0) {
            tmp.add("");
            for (String var : lore) {
                tmp.add("§r"+var);
            }
        }

        //Items abilitie lore
        if(abilitie_lore.size() > 0) {
            tmp.add("");
            for (ItemAbilitiesLore var : abilitie_lore) {
                tmp.add("§r§eAbilitie: "+var.getAbilityType());
                for(String text : var.getAbilityDescription()) {
                    tmp.add("§r§e"+text);
                }
            }
        }

        //Items rarity
        if(rarity != null) {
            tmp.add("");
            tmp.add("§r"+rarity.toString()+" "+itemtype);
        }

        return tmp;
    }
}
