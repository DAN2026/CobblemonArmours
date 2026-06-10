package net.dan2026.cobblemonarmours.forge.mixins;

import com.mojang.blaze3d.vertex.PoseStack;
import net.dan2026.cobblemonarmours.common.items.DuskStoneArmour;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HumanoidArmorLayer.class)
public class RendererMixin {

    @Inject(
            method = "render(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/world/entity/LivingEntity;FFFFFF)V",
            at = @At("HEAD"),
            cancellable = true
    )
    public void stopArmorRender(
            PoseStack poseStack,
            MultiBufferSource multiBufferSource,
            int i,
            LivingEntity livingEntity,
            float f,
            float g,
            float h,
            float j,
            float k,
            float l,
            CallbackInfo ci
    ) {
        if (livingEntity instanceof Player player && cobblemonArmours$isWearingFullDuskSet(player)) {
            ci.cancel();
        }
    }

    @Unique
    private static boolean cobblemonArmours$isWearingFullDuskSet(Player player) {
        return player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof DuskStoneArmour &&
                player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof DuskStoneArmour &&
                player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof DuskStoneArmour &&
                player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof DuskStoneArmour;
    }
}
