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
    
    public static final Cage cage = new Cage();
    
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(cage);
    }
    
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(cage, 0, new ModelResourceLocation(cage.getRegistryName(), "inventory"));
	}
}