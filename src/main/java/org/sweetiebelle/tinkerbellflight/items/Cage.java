package org.sweetiebelle.tinkerbellflight.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Cage extends Item {
	public static final String NAME = "cage";
	public Cage() {
		setUnlocalizedName(NAME);
		setRegistryName(NAME);
		setMaxStackSize(8);
		setHasSubtypes(false);
		setCreativeTab(CreativeTabs.TOOLS);
		setMaxDamage(0);
		setNoRepair();
	}
	
}
