package net.bagel.befixment.zenith.compat;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import safro.zenith.Zenith;
import safro.zenith.ench.compat.CommonTooltipUtil;
import snownee.jade.api.*;
import snownee.jade.api.config.IPluginConfig;

public class JadePlugin implements IBlockComponentProvider, IWailaPlugin {

    public static final Identifier ZENITH_ENCHANTMENT_POWER = new Identifier(Zenith.MODID, "enchantment_power");

    ;

    @Override
    public void appendTooltip(ITooltip iTooltip, BlockAccessor blockAccessor, IPluginConfig iPluginConfig) {
        // if (!Zenith.enableEnch) return;
        CommonTooltipUtil.appendBlockStats(blockAccessor.getLevel(), blockAccessor.getBlockState(), iTooltip::add);
        if (blockAccessor.getBlock() == Blocks.ENCHANTING_TABLE)
            CommonTooltipUtil.appendTableStats(blockAccessor.getLevel(), blockAccessor.getPosition(), iTooltip::add);


    }


    @Override
    public void registerClient(IWailaClientRegistration registration) {

        registration.registerBlockComponent(this, Block.class);
        registration.addConfig(ZENITH_ENCHANTMENT_POWER, true);
    }

    @Override
    public Identifier getUid() {
        return ZENITH_ENCHANTMENT_POWER;
    }
}
