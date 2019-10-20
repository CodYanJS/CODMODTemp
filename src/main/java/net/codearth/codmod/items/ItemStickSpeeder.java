package net.codearth.codmod.items;

import net.codearth.codmod.CMMain;
import net.codearth.codmod.init.ModItems;
import net.minecraft.command.CommandEffect;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemStickSpeeder extends Item {
    public ItemStickSpeeder(String name){
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CMMain.modTab);
        this.setMaxDamage(0);
        ModItems.INSTANCE.getItems().add(this);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 10000, 2, true, false));
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        itemstack.damageItem(1, playerIn);

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
