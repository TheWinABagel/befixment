package net.bagel.befixment.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import safro.zenith.ench.library.EnchLibraryScreen;

@Mixin(EnchLibraryScreen.class)
public class EnchLibraryScreenMixin {
    //no this doesnt show up properly in ide. it works though so idgaf
@Redirect(method = "method_25404", at = @At(value = "INVOKE", target = "safro/zenith/ench/library/EnchLibraryScreen.isActiveAndMatches (Lnet/minecraft/class_304;Lnet/minecraft/class_3675$class_306;)Z"))
private boolean isActiveAndMatches(KeyBinding key, InputUtil.Key keyCode){
    int keyCodeInt = keyCode.getCode();
    InputUtil.Key invkeycode = key.getDefaultKey();
    int code = invkeycode.getCode();
    return MinecraftClient.getInstance().options.inventoryKey.matchesKey(keyCodeInt, code);
    }
}
