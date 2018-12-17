package org.sweetiebelle.tinkerbellflight;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Cage extends Item {
	public static final String NAME = "cage";
	public Cage() {
		setUnlocalizedName(NAME);
		setRegistryName(NAME);
		setMaxStackSize(1);
		setHasSubtypes(false);
		setCreativeTab(CreativeTabs.TOOLS);
		setMaxDamage(0);
		setNoRepair();
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}
