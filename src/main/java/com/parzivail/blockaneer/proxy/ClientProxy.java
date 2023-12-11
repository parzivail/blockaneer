package com.parzivail.blockaneer.proxy;

import com.parzivail.blockaneer.Blockaneer;
import com.parzivail.blockaneer.client.BoatRenderer;
import com.parzivail.blockaneer.entity.BlockaneerBoatEntity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit()
	{
		super.preInit();

		RenderingRegistry.registerEntityRenderingHandler(BlockaneerBoatEntity.class, BoatRenderer::new);
	}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		ModelLoader.setCustomModelResourceLocation(Blockaneer.ironBoat, 0, new ModelResourceLocation(Blockaneer.ironBoat.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Blockaneer.goldBoat, 0, new ModelResourceLocation(Blockaneer.goldBoat.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Blockaneer.diamondBoat, 0, new ModelResourceLocation(Blockaneer.diamondBoat.getRegistryName(), "inventory"));
	}
}
