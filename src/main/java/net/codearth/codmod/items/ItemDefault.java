package net.codearth.codmod.items;


import net.codearth.codmod.CMMain;
import net.codearth.codmod.init.CodTab;
import net.codearth.codmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemDefault extends Item{
	public ItemDefault(String name) {
		setRegistryName(name).setUnlocalizedName(name).setCreativeTab(CMMain.modTab);
		ModItems.INSTANCE.getItems().add(this);
	}
}
