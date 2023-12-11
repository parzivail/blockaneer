package com.parzivail.blockaneer.client;

import com.parzivail.blockaneer.entity.BlockaneerBoatEntity;
import net.minecraft.client.renderer.entity.RenderBoat;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class BoatRenderer extends RenderBoat
{
	public BoatRenderer(RenderManager renderManagerIn)
	{
		super(renderManagerIn);
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityBoat entity)
	{
		if (entity instanceof BlockaneerBoatEntity)
			return ((BlockaneerBoatEntity)entity).getTexture();

		return super.getEntityTexture(entity);
	}
}
