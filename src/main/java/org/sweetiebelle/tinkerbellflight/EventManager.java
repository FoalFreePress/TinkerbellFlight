package org.sweetiebelle.tinkerbellflight;

import org.sweetiebelle.tinkerbellflight.items.Cage;
import org.sweetiebelle.tinkerbellflight.items.Tinkerbell;
import org.sweetiebelle.tinkerbellflight.items.TinkerbellCage;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = TinkerbellFlight.MODID)
public class EventManager {
    
    public final Cage cage = new Cage();
    public final Tinkerbell tinkerbell = new Tinkerbell();
    public final TinkerbellCage tinkerbellCage = new TinkerbellCage();
    
    @SubscribeEvent
    public void onItemRegister(RegistryEvent.Register<Item> event) {
    	event.getRegistry().registerAll(cage, tinkerbell, tinkerbellCage);
    }
    
    @SubscribeEvent
    public void onModelRegister(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(cage, 0, new ModelResourceLocation(cage.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(tinkerbell, 0, new ModelResourceLocation(tinkerbell.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(tinkerbellCage, 0, new ModelResourceLocation(tinkerbellCage.getRegistryName(), "inventory"));
	}
}