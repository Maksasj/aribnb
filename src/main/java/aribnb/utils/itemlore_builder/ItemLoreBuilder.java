package aribnb.utils.itemlore_builder;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class ItemLoreBuilder {
    private static List<String> lore = new ArrayList<>();
    private static List<ItemAbilitiesLore> abilitie_lore = new ArrayList<>();
    private static Rarities rarity;

    private static String itemtype;

    public ItemLoreBuilder() {};

    public void setRarity(Rarities value) {
        rarity = value;
    }

    public void addLore(String text) {
        lore.add(text);
    }

    public void setItemType(String value) {
        itemtype = value;
    }

    public void addItemAbilitieLore(ItemAbilitiesLore value) {
        abilitie_lore.add(value);
    }

    public List<String> buildLore() {
        List<String> tmp = new ArrayList<>();

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
