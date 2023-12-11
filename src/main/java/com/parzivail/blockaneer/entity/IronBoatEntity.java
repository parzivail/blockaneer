package com.parzivail.blockaneer.entity;

import com.parzivail.blockaneer.Blockaneer;
import com.parzivail.blockaneer.Resources;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class IronBoatEntity extends BlockaneerBoatEntity
{
	public IronBoatEntity(World worldIn)
	{
		super(worldIn, 1.5f, Resources.id("textures/entity/boat/iron.png"));
	}

	@Override
	public Item getItemBoat()
	{
		return Blockaneer.ironBoat;
	}
}
