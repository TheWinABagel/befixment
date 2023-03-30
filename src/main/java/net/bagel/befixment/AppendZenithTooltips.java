package net.bagel.befixment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import safro.zenith.ench.EnchModule;

import java.util.List;

public class AppendZenithTooltips implements ModInitializer {




    @Override
    public void onInitialize() {
      //  if (FabricLoader.getInstance().isModLoaded("zenith")) {
            //Is this the ideal way to do this? no. do i care rn? no. i want my damn tooltips
            ItemTooltipCallback.EVENT.register((itemstack, context, lines) -> {
                if (itemstack.getItem() == Items.BOOKSHELF) {
                    lines.add(Text.translatable("test").formatted(Formatting.GOLD));
                    lines.add(Text.translatable("test2").formatted(Formatting.GREEN));
                    lines.add(Text.translatable("info.zenith.eterna").formatted(Formatting.GREEN));
                }
                if (itemstack.getItem() == EnchModule.BLAZING_HELLSHELF_ITEM) {
                    lines.add(Text.translatable("test").formatted(Formatting.GOLD));
                    lines.add(Text.translatable("test2").formatted(Formatting.GREEN));
                    lines.add(Text.translatable("info.zenith.eterna").formatted(Formatting.GREEN));
                    Befixment.LOGGER.info("Blazing Hellshelf");
                }
                Befixment.LOGGER.info("ThisIsLoaded");
            });
       // }
    }
}