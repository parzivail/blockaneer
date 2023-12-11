package com.parzivail.blockaneer.entity;

import com.parzivail.blockaneer.Blockaneer;
import com.parzivail.blockaneer.Resources;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class DiamondBoatEntity extends BlockaneerBoatEntity
{
	public DiamondBoatEntity(World worldIn)
	{
		super(worldIn, 3, Resources.id("textures/entity/boat/diamond.png"));
	}

	@Override
	public Item getItemBoat()
	{
		return Blockaneer.diamondBoat;
	}
}
