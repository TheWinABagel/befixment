package net.bagel.befixment;

import net.bagel.befixment.zenith.AppendZenithTooltips;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Befixment implements ModInitializer {
	static public final String modid = "befixment";
	public static final Logger LOGGER = LoggerFactory.getLogger(modid);

	@Override
	public void onInitialize() {
		LOGGER.info("Befixment be fixing issues!");
		//This mod will most likely have more to it in the future
		  if (FabricLoader.getInstance().isModLoaded("zenith")) {
			  AppendZenithTooltips.init();
		 }
	}
}