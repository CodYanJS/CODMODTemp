package net.codearth.codmod.init;

import com.google.common.collect.Lists;
import net.codearth.codmod.CMMain;
import net.codearth.codmod.blocks.CodBlocks;
import net.codearth.codmod.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.List;
@SuppressWarnings("static-access")
public class ModBlocks{
    public static final ModBlocks INSTANCE = new ModBlocks();
    public static Block mega_craft;
    public static Block ruby_block;
    private List<Block> blocks;
    public void init(){
        blocks = Lists.newArrayList();
        this.mega_craft = new CodBlocks("mega_craft", Material.ROCK, 5.0f, 30.0f, 1, "pickaxe").setCreativeTab(CMMain.modTab);
        this.ruby_block = new CodBlocks("ruby_block", Material.ROCK, 6.0f, 35.0f, 3, "pickaxe").setCreativeTab(CMMain.modTab);
        for(Block block : blocks){
            ItemBlock ib = new ItemBlock(block);
            ib.setRegistryName(block.getRegistryName());
            GameRegistry.findRegistry(Item.class).register(ib);
        }
    }
    @SubscribeEvent
    public void registerModels(ModelRegistryEvent e){
        for(Block b : blocks){
            registerModel(b);
        }
    }
    public void registerModel(Block block){
      /*  ItemBlock ib = new ItemBlock(block);
        ib.setRegistryName(block.getRegistryName());
        GameRegistry.findRegistry(Item.class).register(ib);*/
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(References.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
    }

    public List<Block> getBlocks() {
        return blocks;
    }
}
