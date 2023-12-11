package com.parzivail.blockaneer;

import com.parzivail.blockaneer.item.BlockaneerBoatItem;
import com.parzivail.blockaneer.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
		modid = Resources.ID,
		name = Resources.NAME,
		version = Resources.VERSION,
		acceptedMinecraftVersions = "*"
)
public class Blockaneer
{
	public static final Logger LOG = LogManager.getLogger(Resources.ID);

	@Instance(Resources.ID)
	public static Blockaneer instance;

	@SidedProxy(
			serverSide = "com.parzivail.blockaneer.proxy.ServerProxy",
			clientSide = "com.parzivail.blockaneer.proxy.ClientProxy"
	)
	public static CommonProxy proxy;

	@GameRegistry.ObjectHolder("blockaneer:iron_boat")
	public static BlockaneerBoatItem ironBoat;

	@GameRegistry.ObjectHolder("blockaneer:gold_boat")
	public static BlockaneerBoatItem goldBoat;

	@GameRegistry.ObjectHolder("blockaneer:diamond_boat")
	public static BlockaneerBoatItem diamondBoat;

	@EventHandler
	public void onPreInit(final FMLPreInitializationEvent event)
	{
		proxy.preInit();
	}

	@EventHandler
	public void onInit(final FMLInitializationEvent event)
	{
	}

	@EventHandler
	public void onPostInit(final FMLPostInitializationEvent event)
	{
	}
}
