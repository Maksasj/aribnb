package aribnb.systems.itemmanager;

import aribnb.aribnb.Aribnb;
import aribnb.systems.enchantmentsystem.GlitteringEffect.GlitteringEffect;
import aribnb.utils.itemlore_builder.Rarities;
import aribnb.utils.nbt_formater.AribnbNbtFormater;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import jdk.internal.logger.BootstrapLogger;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;

public class Item {
    public ItemStack item;

    private ItemMeta meta;

    private Rarities rarity;
    private ItemTypes type;

    public Item(ItemTypes _type, Rarities _rarity, Material mat) {
        this.item = new ItemStack(mat, 1);
        this.meta = this.item.getItemMeta();
        this.rarity = _rarity;
        this.type = _type;

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    }

    public Rarities getRarity() {
        return this.rarity;
    }
    public void setRarity(Rarities value) {
        this.rarity = value;
    }

    public ItemTypes getType() {
        return type;
    }

    public void setType(ItemTypes type) {
        this.type = type;
    }

    public ItemMeta getMeta() {
        return meta;
    }

    public void setName(String name) {
        getMeta().setDisplayName("§r"+rarity.toColor()+name);
    }

    public static void setDamage(ItemMeta meta, Double value, EquipmentSlot slot) {
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "Attack damage",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public void setDamage(Double value, EquipmentSlot slot) {
        this.getMeta().addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "Attack damage",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public void addScalarDamage(Double value, EquipmentSlot slot) {
        this.getMeta().addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "Attack damage",value, AttributeModifier.Operation.ADD_SCALAR, slot));
    }

    public static void setMaxHealth(ItemMeta meta, Double value, EquipmentSlot slot) {
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "Max health",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public void setMaxHealth(Double value, EquipmentSlot slot) {
        this.getMeta().addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "Max health",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public static void setFollowRange(ItemMeta meta, Double value, EquipmentSlot slot) {
        meta.addAttributeModifier(Attribute.GENERIC_FOLLOW_RANGE, new AttributeModifier(UUID.randomUUID(), "Follow range",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public void setFollowRange(Double value, EquipmentSlot slot) {
        this.getMeta().addAttributeModifier(Attribute.GENERIC_FOLLOW_RANGE, new AttributeModifier(UUID.randomUUID(), "Follow range",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public static void setKnockbackResistance(ItemMeta meta, Double value, EquipmentSlot slot) {
        meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "Knockback resistance",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public void setKnockbackResistance(Double value, EquipmentSlot slot) {
        this.getMeta().addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier(UUID.randomUUID(), "Knockback resistance",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public static void setMovementSpeed(ItemMeta meta, Double value, EquipmentSlot slot) {
        meta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "Movement speed",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public void setMovementSpeed(Double value, EquipmentSlot slot) {
        this.getMeta().addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "Movement speed",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public void addScalarMovementSpeed(Double value, EquipmentSlot slot) {
        this.getMeta().addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "Movement speed",value, AttributeModifier.Operation.ADD_SCALAR, slot));
    }

    public static void setAttackKnockback(ItemMeta meta, Double value, EquipmentSlot slot) {
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_KNOCKBACK, new AttributeModifier(UUID.randomUUID(), "Attack knockback",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }
    public void setAttackKnockback(Double value, EquipmentSlot slot) {
        this.getMeta().addAttributeModifier(Attribute.GENERIC_ATTACK_KNOCKBACK, new AttributeModifier(UUID.randomUUID(), "Attack knockback",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public static void setArmor(ItemMeta meta, Double value, EquipmentSlot slot) {
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "Armor",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public void setArmor(Double value, EquipmentSlot slot) {
        this.getMeta().addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "Armor",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public static void setArmorToughness(ItemMeta meta, Double value, EquipmentSlot slot) {
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "Armor toughness",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public void setArmorToughness(Double value, EquipmentSlot slot) {
        this.getMeta().addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "Armor toughness",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }


    public static void setLuck(ItemMeta meta, Double value, EquipmentSlot slot) {
        meta.addAttributeModifier(Attribute.GENERIC_LUCK, new AttributeModifier(UUID.randomUUID(), "Luck",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public void setLuck(Double value, EquipmentSlot slot) {
        this.getMeta().addAttributeModifier(Attribute.GENERIC_LUCK, new AttributeModifier(UUID.randomUUID(), "Luck",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public static void setAttackSpeed(ItemMeta meta, Double value, EquipmentSlot slot) {
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "Attack speed",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public void setAttackSpeed(Double value, EquipmentSlot slot) {
        this.getMeta().addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "Attack speed",value, AttributeModifier.Operation.ADD_NUMBER, slot));
    }

    public void addScalarAttackSpeed(Double value, EquipmentSlot slot) {
        this.getMeta().addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "Attack speed",value, AttributeModifier.Operation.ADD_SCALAR, slot));
    }

    public void bindTags(String id) {
        AribnbNbtFormater nbtFormater = new AribnbNbtFormater(getMeta());
        nbtFormater.setStrField("aribnb_type", type.toString());
        nbtFormater.setStrField("aribnb_rarity", rarity.toId());
        nbtFormater.setStrField(type.toString(), id);
    }

    public void addGlittering() {
        NamespacedKey key = new NamespacedKey(Aribnb.getPlugin(), "aribnb_glitteringeffect");
        GlitteringEffect glow = new GlitteringEffect(key);

        this.getMeta().addEnchant(glow, 1, true);
    }

    public void setSkinViaBase64(SkullMeta meta, String base64) {
        try {
            Method setProfile = meta.getClass().getDeclaredMethod("setProfile", GameProfile.class);
            setProfile.setAccessible(true);

            GameProfile profile = new GameProfile(UUID.randomUUID(), "skull-texture");
            profile.getProperties().put("textures", new Property("textures", base64));

            setProfile.invoke(meta, profile);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("There was a severe internal reflection error when attempting to set the skin of a player skull via base64!");
        }
    }

    public void setLeatherColor(Color color) {
        LeatherArmorMeta meta = (LeatherArmorMeta) getMeta();
        meta.setColor(color);
    }

    public void setLeatherColorFromRGB(int r, int g, int b) {
        LeatherArmorMeta meta = (LeatherArmorMeta) getMeta();
        meta.setColor(Color.fromRGB(r, g, b));
    }

    public void setLeatherColorFromRGB(int color) {
        LeatherArmorMeta meta = (LeatherArmorMeta) getMeta();
        meta.setColor(Color.fromRGB(color));
    }

    public List<String> getDescription() {
        return null;
    };

    public List<String> getAbility() {
        return null;
    };

    public List<String> getCustomInfo() {
        return null;
    };

    private void bindCraft() {};
}
