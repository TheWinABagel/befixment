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
		LOGGER.info("Befixment is befixing issues!");
		//This mod will most likely have more to it in the future


		  if (FabricLoader.getInstance().isModLoaded("zenith")) {
		//Is this the ideal way to do this? no. do i care rn? no. i want my damn tooltips
		ItemTooltipCallback.EVENT.register((itemstack, context, lines) -> {
			if (itemstack.getItem() == Items.BOOKSHELF) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.eterna", "+1.00 (Max 15.00)").formatted(Formatting.GREEN));
			}
			if (itemstack.getItem() == EnchModule.SEASHELF_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.eterna", "+1.50 (Max 22.50)").formatted(Formatting.GREEN));
				lines.add(Text.translatable("info.zenith.arcana", "+1.50").formatted(Formatting.DARK_PURPLE));
			}
			if (itemstack.getItem() == EnchModule.INFUSED_SEASHELF_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.eterna", "+1.75 (Max 27.00)").formatted(Formatting.GREEN));
				lines.add(Text.translatable("info.zenith.arcana", "+1.75").formatted(Formatting.DARK_PURPLE));
			}
			if (itemstack.getItem() == EnchModule.CRYSTAL_SEASHELF_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.eterna", "+2.00 (Max 30.00)").formatted(Formatting.GREEN));
				lines.add(Text.translatable("info.zenith.quanta", "+4.00").formatted(Formatting.RED));
				lines.add(Text.translatable("info.zenith.arcana", "+2.00").formatted(Formatting.DARK_PURPLE));
			}
			if (itemstack.getItem() == EnchModule.HEART_SEASHELF_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.eterna", "+1.50 (Max 30.00)").formatted(Formatting.GREEN));
				lines.add(Text.translatable("info.zenith.arcana", "+10.00").formatted(Formatting.DARK_PURPLE));
				lines.add(Text.translatable("info.zenith.rectification", "-5.00").formatted(Formatting.YELLOW));
			}
			if (itemstack.getItem() == EnchModule.HELLSHELF_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.eterna", "+1.50 (Max 22.50)").formatted(Formatting.GREEN));
				lines.add(Text.translatable("info.zenith.quanta", "+1.50").formatted(Formatting.RED));
			}
			if (itemstack.getItem() == EnchModule.INFUSED_HELLSHELF_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.eterna", "+1.75 (Max 27.00)").formatted(Formatting.GREEN));
				lines.add(Text.translatable("info.zenith.quanta", "+1.75").formatted(Formatting.RED));
			}
			if (itemstack.getItem() == EnchModule.BLAZING_HELLSHELF_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.eterna", "+4.00 (Max 30.00)").formatted(Formatting.GREEN));
				lines.add(Text.translatable("info.zenith.quanta", "+5.00").formatted(Formatting.RED));
				lines.add(Text.translatable("info.zenith.clues", "-1").formatted(Formatting.DARK_AQUA));
			}
			if (itemstack.getItem() == EnchModule.GLOWING_HELLSHELF_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.eterna", "+2.00 (Max 30.00)").formatted(Formatting.GREEN));
				lines.add(Text.translatable("info.zenith.quanta", "+2.00").formatted(Formatting.RED));
				lines.add(Text.translatable("info.zenith.arcana", "+4.00").formatted(Formatting.DARK_PURPLE));
			}
			if (itemstack.getItem() == EnchModule.ENDSHELF_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.eterna", "+3.00 (Max 40.00)").formatted(Formatting.GREEN));
				lines.add(Text.translatable("info.zenith.quanta", "+3.50").formatted(Formatting.RED));
				lines.add(Text.translatable("info.zenith.arcana", "+3.50").formatted(Formatting.DARK_PURPLE));
			}
			if (itemstack.getItem() == EnchModule.DRACONIC_ENDSHELF_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.eterna", "+5.00 (Max 50.00)").formatted(Formatting.GREEN));
			}
			if (itemstack.getItem() == EnchModule.PEARL_ENDSHELF_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.eterna", "+3.00 (Max 40.00)").formatted(Formatting.GREEN));
				lines.add(Text.translatable("info.zenith.quanta", "+5.00").formatted(Formatting.RED));
				lines.add(Text.translatable("info.zenith.arcana", "+7.50").formatted(Formatting.DARK_PURPLE));
			}
			if (itemstack.getItem() == EnchModule.RECTIFIER_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.rectification", "+5.00").formatted(Formatting.YELLOW));
			}
			if (itemstack.getItem() == EnchModule.RECTIFIER_T2_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.rectification", "+10.00").formatted(Formatting.YELLOW));
			}
			if (itemstack.getItem() == EnchModule.RECTIFIER_T3_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.rectification", "+20.00").formatted(Formatting.YELLOW));
			}
			if (itemstack.getItem() == EnchModule.SIGHTSHELF_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.clues", "+1").formatted(Formatting.DARK_AQUA));
			}
			if (itemstack.getItem() == EnchModule.SIGHTSHELF_T2_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.clues", "+2").formatted(Formatting.DARK_AQUA));
			}
			if (itemstack.getItem() == EnchModule.BEESHELF_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.eterna", "-15.00").formatted(Formatting.GREEN));
				lines.add(Text.translatable("info.zenith.quanta", "+100.00").formatted(Formatting.RED));
			}
			if (itemstack.getItem() == EnchModule.MELONSHELF_ITEM) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.eterna", "-1.00").formatted(Formatting.GREEN));
				lines.add(Text.translatable("info.zenith.quanta", "+10.00").formatted(Formatting.RED));
			}
			if (itemstack.getItem() == Items.WITHER_SKELETON_SKULL) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.quanta", "+10.00").formatted(Formatting.RED));
			}
			if (itemstack.getItem() == Items.AMETHYST_CLUSTER) {
				lines.add(Text.translatable("info.zenith.ench_stats").formatted(Formatting.GOLD));
				lines.add(Text.translatable("info.zenith.rectification", "+1.50").formatted(Formatting.YELLOW));
			}

		});
		 }
	}
}