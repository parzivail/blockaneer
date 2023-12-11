package com.parzivail.blockaneer.proxy;

import com.parzivail.blockaneer.Blockaneer;
import com.parzivail.blockaneer.Resources;
import com.parzivail.blockaneer.entity.BlockaneerBoatEntity;
import com.parzivail.blockaneer.entity.DiamondBoatEntity;
import com.parzivail.blockaneer.entity.GoldBoatEntity;
import com.parzivail.blockaneer.entity.IronBoatEntity;
import com.parzivail.blockaneer.item.BlockaneerBoatItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@Mod.EventBusSubscriber
public abstract class CommonProxy
{
	public void preInit()
	{
		int id = 1;
		EntityRegistry.registerModEntity(Resources.id("iron_boat"), IronBoatEntity.class, "iron_boat", id++, Blockaneer.instance, 64, 3, true);
		EntityRegistry.registerModEntity(Resources.id("gold_boat"), GoldBoatEntity.class, "gold_boat", id++, Blockaneer.instance, 64, 3, true);
		EntityRegistry.registerModEntity(Resources.id("diamond_boat"), DiamondBoatEntity.class, "diamond_boat", id++, Blockaneer.instance, 64, 3, true);
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new BlockaneerBoatItem(BlockaneerBoatEntity.Type.IRON));
		event.getRegistry().register(new BlockaneerBoatItem(BlockaneerBoatEntity.Type.GOLD));
		event.getRegistry().register(new BlockaneerBoatItem(BlockaneerBoatEntity.Type.DIAMOND));
	}
}
