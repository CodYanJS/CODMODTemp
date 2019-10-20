package net.codearth.codmod.items;

import net.codearth.codmod.CMMain;
import net.codearth.codmod.init.ModItems;
import net.minecraft.item.ItemFood;

public class CodFrites extends ItemFood {
    public CodFrites(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CMMain.modTab);
        ModItems.INSTANCE.getItems().add(this);
    }
}
