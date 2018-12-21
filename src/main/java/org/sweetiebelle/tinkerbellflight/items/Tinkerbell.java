package org.sweetiebelle.tinkerbellflight.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tinkerbell extends Item {
	public static final String NAME = "tinkerbell";
	public Tinkerbell() {
		setUnlocalizedName(NAME);
		setRegistryName(NAME);
		setMaxStackSize(1);
		setHasSubtypes(false);
		setCreativeTab(CreativeTabs.TOOLS);
		setMaxDamage(0);
		setNoRepair();
	}

}
