package net.codearth.codmod.items;

import net.codearth.codmod.CMMain;
import net.codearth.codmod.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Objects;

public class ItemEffectClearer extends Item {
    public ItemEffectClearer(String name){
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CMMain.modTab);
        this.setMaxDamage(3);
        ModItems.INSTANCE.getItems().add(this);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(1)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(2)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(3)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(4)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(5)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(6)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(7)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(8)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(9)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(10)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(11)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(12)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(13)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(14)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(15)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(16)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(17)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(18)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(19)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(20)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(21)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(22)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(23)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(24)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(25)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(26)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(27)));
        player.removePotionEffect(Objects.requireNonNull(Potion.getPotionById(28)));
        ItemStack itemstack = player.getHeldItem(hand);
        itemstack.damageItem(1, player);
        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }
}
