package com.parzivail.blockaneer;

import net.minecraft.util.ResourceLocation;

public class Resources
{
	public static final String ID = "blockaneer";
	public static final String NAME = "Blockaneer";
	public static final String VERSION = "0.0.1";

	public static ResourceLocation id(String path)
	{
		return new ResourceLocation(ID, path);
	}
}
