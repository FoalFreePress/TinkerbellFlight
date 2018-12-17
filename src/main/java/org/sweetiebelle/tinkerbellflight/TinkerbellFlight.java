package org.sweetiebelle.tinkerbellflight;

import org.apache.logging.log4j.Logger;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TinkerbellFlight.MODID, name = TinkerbellFlight.NAME, version = TinkerbellFlight.VERSION)
public class TinkerbellFlight {
	public static final String MODID = "tinkerbellflight";
	public static final String NAME = "Tinkerbell Flight";
	public static final String VERSION = "1";

	public static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		MinecraftForge.EVENT_BUS.register(new EventManager());
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
	}

}