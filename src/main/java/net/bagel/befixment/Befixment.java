package net.bagel.befixment;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import safro.zenith.ench.EnchModule;

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