package net.bagel.befixment.mixin;

import moriyashiine.bewitchment.api.BewitchmentAPI;
import moriyashiine.bewitchment.common.network.packet.TogglePressingForwardPacket;
import moriyashiine.bewitchment.common.registry.BWComponents;
import moriyashiine.bewitchment.common.registry.BWEntityTypes;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(TogglePressingForwardPacket.class)
public class TogglePressingForwardPacketMixin {



    /**
     * @author TheWinABagel
     * @reason This class normally disconnects the client when performed with no ME
     */
    @Overwrite
    public static void handle(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler network, PacketByteBuf buf, PacketSender sender) {
        try {
            boolean pressingForward = buf.readBoolean();
            server.execute(() -> {
                if (pressingForward && BewitchmentAPI.getFamiliar(player) != BWEntityTypes.OWL) {
                    if (!BewitchmentAPI.drainMagic(player, 1, true)) {
                        if (player.age % 10 == 0){
                        player.sendMessage(Text.translatable("befixment.actionbar.no_me"), true);
                        } // only works if client also has mod installed
                        return;
                    }
                    if (player.age % 60 == 0) {
                        BewitchmentAPI.drainMagic(player, 1, false);
                    }
                }
                BWComponents.BROOM_USER_COMPONENT.get(player).setPressingForward(pressingForward);
            });
        } catch
        (IndexOutOfBoundsException ignore) {}
    }
}

