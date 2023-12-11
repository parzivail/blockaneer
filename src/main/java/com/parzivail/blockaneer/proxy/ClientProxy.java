package com.parzivail.blockaneer.proxy;

import com.parzivail.blockaneer.client.BoatRenderer;
import com.parzivail.blockaneer.entity.BlockaneerBoatEntity;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit()
	{
		super.preInit();

		RenderingRegistry.registerEntityRenderingHandler(BlockaneerBoatEntity.class, BoatRenderer::new);
	}
}
