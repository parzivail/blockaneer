package com.parzivail.blockaneer.entity;

import com.parzivail.blockaneer.Blockaneer;
import com.parzivail.blockaneer.Resources;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class GoldBoatEntity extends BlockaneerBoatEntity
{
	public GoldBoatEntity(World worldIn)
	{
		super(worldIn, 2, Resources.id("textures/entity/boat/gold.png"));
	}

	@Override
	public Item getItemBoat()
	{
		return Blockaneer.goldBoat;
	}
}
