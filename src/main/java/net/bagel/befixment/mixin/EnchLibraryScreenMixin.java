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

//yes this is cursed im sorry you have to look at my terrible programming
@Redirect(method = "keyPressed", at = @At(value = "INVOKE", target = "safro/zenith/ench/library/EnchLibraryScreen.isActiveAndMatches (Lnet/minecraft/client/option/KeyBinding;Lnet/minecraft/client/util/InputUtil$Key;)Z", remap = true))
private boolean isActiveAndMatches(KeyBinding key, InputUtil.Key keyCode){
    int keyCodeInt = keyCode.getCode();
    InputUtil.Key invkeycode = key.getDefaultKey();
    int code = invkeycode.getCode();
    return MinecraftClient.getInstance().options.inventoryKey.matchesKey(keyCodeInt, code);
    }
}
