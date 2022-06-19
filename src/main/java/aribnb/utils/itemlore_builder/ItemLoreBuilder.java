package aribnb.utils.itemlore_builder;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemLoreBuilder {
    private static List<String> lore;
    private static List<String> custom_info;
    private static List<ItemAbilitiesLore> abilitie_lore;

    private static HashMap<AttributeSlotType, List<AttributeLoreType>> attributeloretype;
    private static Rarities rarity;
    private static String itemtype;
    private static String reforge;

    public ItemLoreBuilder() {
        lore = new ArrayList<>();
        custom_info = new ArrayList<>();
        abilitie_lore = new ArrayList<>();
        attributeloretype= new HashMap<AttributeSlotType, List<AttributeLoreType>>();
    };

    public void setRarity(Rarities value) {
        rarity = value;
    }

    public void setReforge(String value) {
        reforge = value;
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

    public void addAttributeLore(AttributeSlotType slot, AttributeLoreType lore) {
        if(attributeloretype.containsKey(slot)) {
            attributeloretype.get(slot).add(lore);
        } else {
            List<AttributeLoreType> attribute_list = new ArrayList<>();
            attribute_list.add(lore);
            attributeloretype.put(slot, attribute_list);
        }
    }

    public List<String> buildLore() {
        List<String> tmp = new ArrayList<>();

        //Rarity
        tmp.add("§r§7Rarity: "+rarity.toString());

        //Reforge
        if(reforge == null) {
            tmp.add("§r§7Reforge: §fNone");
        } else {
            tmp.add("§r§7Reforge: "+reforge);
        }

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

        //Attribute lore
        if(attributeloretype.size() > 0) {
            tmp.add("");

            for (Map.Entry<AttributeSlotType, List<AttributeLoreType>> entry : attributeloretype.entrySet()) {
                AttributeSlotType key = entry.getKey();

                tmp.add(key.toString());
                List<AttributeLoreType> value = entry.getValue();

                for (AttributeLoreType attribute : value) {
                    if(attribute.value < 0) {
                        tmp.add("§r§c"+attribute.value+" "+attribute.attribute.toString());
                    } else {
                        tmp.add("§r§9+"+attribute.value+" "+attribute.attribute.toString());
                    }
                }
            }
        }

        return tmp;
    }
}
