package net.codearth.codmod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CodTab extends CreativeTabs {

    public CodTab(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.blue_crystal);
    }
}
