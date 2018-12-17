package org.sweetiebelle.tinkerbellflight;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = TinkerbellFlight.MODID)
public class EventManager {
	@SubscribeEvent
	public void register(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new Cage());
		TinkerbellFlight.logger.info("registerItem called!");
	}

	@SubscribeEvent
	public void registerRenders(ModelRegistryEvent event) {
		this.registerItem(new Cage(), 0, "inventory");
	}
	
	
	
	public void registerItem(Item item, int meta, String space) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), space));
	}
}
