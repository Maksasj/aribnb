package aribnb.systems.enchantmentsystem.GlitteringEffect;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;

public class GlitteringEffect extends Enchantment {

    public GlitteringEffect(NamespacedKey i) {
        super(i);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean canEnchantItem(ItemStack arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean conflictsWith(Enchantment arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public EnchantmentTarget getItemTarget() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getMaxLevel() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "aribnb_glitteringeffect";
    }

    @Override
    public int getStartLevel() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isCursed() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isTreasure() {
        // TODO Auto-generated method stub
        return false;
    }

}
