package net.codearth.codmod.items;

import net.codearth.codmod.CMMain;
import net.codearth.codmod.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import java.util.Objects;

public class CodBurger extends Item {
    public CodBurger(String name) {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setMaxStackSize(1);
        this.setMaxDamage(0);
        this.setCreativeTab(CMMain.modTab);
        ModItems.INSTANCE.getItems().add(this);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.addPotionEffect(new PotionEffect(Objects.requireNonNull(Potion.getPotionById(1)), 2500, 5, true, false));
        playerIn.addPotionEffect(new PotionEffect(Objects.requireNonNull(Potion.getPotionById(5)), 2500, 5, true, false));
        playerIn.addPotionEffect(new PotionEffect(Objects.requireNonNull(Potion.getPotionById(6)), 2500, 5, true, false));
        playerIn.addPotionEffect(new PotionEffect(Objects.requireNonNull(Potion.getPotionById(8)), 2500, 5, true, false));
        playerIn.addPotionEffect(new PotionEffect(Objects.requireNonNull(Potion.getPotionById(10)), 2500, 5, true, false));
        playerIn.addPotionEffect(new PotionEffect(Objects.requireNonNull(Potion.getPotionById(11)), 2500, 5, true, false));
        playerIn.addPotionEffect(new PotionEffect(Objects.requireNonNull(Potion.getPotionById(14)), 2500, 5, true, false));
        playerIn.addPotionEffect(new PotionEffect(Objects.requireNonNull(Potion.getPotionById(21)), 2500, 5, true, false));
        playerIn.addPotionEffect(new PotionEffect(Objects.requireNonNull(Potion.getPotionById(22)), 2500, 5, true, false));
        playerIn.addPotionEffect(new PotionEffect(Objects.requireNonNull(Potion.getPotionById(23)), 2500, 5, true, false));
        playerIn.addPotionEffect(new PotionEffect(Objects.requireNonNull(Potion.getPotionById(24)), 2500, 5, true, false));
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        itemstack.damageItem(1, playerIn);

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
