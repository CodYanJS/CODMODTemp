package net.codearth.codmod.init;

import java.util.List;

import com.google.common.collect.Lists;

import net.codearth.codmod.items.*;
import net.codearth.codmod.utils.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
@SuppressWarnings("static-access")
public class ModItems {
public static final ModItems INSTANCE = new ModItems();
	public static Item ruby;
	public static Item blue_crystal;
	public static Item fire_crystal;
	public static Item ruby_ingot;
	//public static Item cod_gm;
	public static Item frites;
	public static Item speed_stick;
	public static Item big_burger;
	public static Item effect_clearer;
	private List<Item> items; 
	public void init() {
		items = Lists.newArrayList();
		this.ruby = new ItemDefault("ruby");
		this.blue_crystal = new ItemDefault("blue_crystal");
		this.fire_crystal = new ItemDefault("fire_crystal");
		this.ruby_ingot = new ItemDefault("ruby_ingot");
		//this.cod_gm = new GMItem("cod_gm");
		this.speed_stick = new ItemStickSpeeder("speed_stick");
        this.frites = new CodFrites("frites", 10, 6,true);
        this.big_burger = new CodBurger("big_burger").setNoRepair();
        this.effect_clearer = new ItemEffectClearer("effect_clearer");
	}
	@SubscribeEvent
	public void registerModels(ModelRegistryEvent e) {
		for(Item item : items) {
			registerModel(item);
		}
	}
	private void registerModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
	public List<Item> getItems() {
		return items;
	}
}
