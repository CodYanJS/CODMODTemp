package net.codearth.codmod.blocks;

import net.codearth.codmod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CodBlocks extends Block {
    public CodBlocks(String name, Material material) {
        super(material);
        setRegistryName(name).setUnlocalizedName(name);
        ModBlocks.INSTANCE.getBlocks().add(this);
    }
    public CodBlocks(String name, Material material, float hardness, float resistance){
        super(material);
        setRegistryName(name).setUnlocalizedName(name);
        setHardness(hardness);
        setResistance(resistance);
        ModBlocks.INSTANCE.getBlocks().add(this);
    }
    public CodBlocks(String name, Material material, float hardness, float resistance, int harvestLevel, String harvestType){
        super(material);
        setRegistryName(name).setUnlocalizedName(name);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(harvestType, harvestLevel);
        ModBlocks.INSTANCE.getBlocks().add(this);
    }
}
