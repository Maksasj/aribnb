package aribnb.systems.itemmanager.items.artifacts.SoulBottle;

import aribnb.aribnb.Aribnb;
import aribnb.systems.itemmanager.Item;
import aribnb.systems.itemmanager.ItemTypes;

import aribnb.utils.itemlore_builder.AbilitieLoreType;
import aribnb.utils.itemlore_builder.ItemAbilitiesLore;
import aribnb.utils.itemlore_builder.ItemLoreBuilder;
import aribnb.utils.itemlore_builder.Rarities;
import aribnb.utils.nbt_formater.AribnbNbtFormater;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class SoulBottle extends Item {

    public SoulBottle(String id) {
        super(ItemTypes.ARTIFACT, Rarities.EPIC, Material.POTION);

        setName("Soul Bottle");
        addGlittering(); //Todo

        ItemLoreBuilder lorebuilder = new ItemLoreBuilder();
        lorebuilder.addCustomInfo(getCustomInfo());

        lorebuilder.addItemAbilitieLore(new ItemAbilitiesLore(getAbility(), AbilitieLoreType.CLICK));
        lorebuilder.autoBuild(getRarity(), getMeta(), getType());
        getMeta().setLore(lorebuilder.buildLore());

        ((PotionMeta) getMeta()).setBasePotionData(new PotionData(PotionType.WATER));
        getMeta().setLore(lorebuilder.buildLore());

        AribnbNbtFormater nbtFormater = new AribnbNbtFormater(getMeta());
        nbtFormater.setDoubleField("aribnb_soulbottle_capacity", 0.0);
        nbtFormater.setDoubleField("aribnb_soulbottle_max_capacity", 100.0);

        bindTags(id);
        item.setItemMeta(getMeta());
        bindCraft();

        getServer().getPluginManager().registerEvents(new OpenSoulBottleListener(), Aribnb.getPlugin());
        getServer().getPluginManager().registerEvents(new OpenSoulBottleGuiListener(), Aribnb.getPlugin());
    }

    public List<String> getAbility() {
        List<String> ab_lore = new ArrayList<>();;
        ab_lore.add("Store and accumulate");
        ab_lore.add("gained souls");

        return ab_lore;
    };

    public List<String> getCustomInfo() {
        return Collections.singletonList("§bSouls stored: 0.0/100.0");
    };

    private void bindCraft() {
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aribnb_soulbottle_craft"), item);
        sr.shape(   " B ",
                    "XNX",
                    "XXX");
        sr.setIngredient('X', Material.EXPERIENCE_BOTTLE);
        sr.setIngredient('N', Material.NETHER_STAR);
        sr.setIngredient('B', Material.CRYING_OBSIDIAN);

        Bukkit.getServer().addRecipe(sr);
    }
}
