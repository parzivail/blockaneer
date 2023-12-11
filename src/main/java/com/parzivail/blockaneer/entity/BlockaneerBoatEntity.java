package com.parzivail.blockaneer.entity;

import net.minecraft.entity.MoverType;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class BlockaneerBoatEntity extends EntityBoat
{
	private final float speed;
	private final ResourceLocation texture;

	public BlockaneerBoatEntity(World worldIn, float speed, ResourceLocation texture)
	{
		super(worldIn);
		this.speed = speed;
		this.texture = texture;
	}

	@Override
	public void move(MoverType type, double x, double y, double z)
	{
		if (type == MoverType.SELF)
		{
			super.move(type, x * speed, y, z * speed);
			return;
		}

		super.move(type, x, y, z);
	}

	public ResourceLocation getTexture()
	{
		return texture;
	}

	public static enum Type
	{
		IRON("iron"),
		GOLD("gold"),
		DIAMOND("diamond"),
		;

		private final String name;

		private Type(String nameIn)
		{
			this.name = nameIn;
		}

		public String getName()
		{
			return this.name;
		}

		public String toString()
		{
			return this.name;
		}
	}
}
