package net.dan2026.cobblemonarmours.common.events;

import dev.architectury.event.events.common.TickEvent;
import net.dan2026.cobblemonarmours.common.items.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;

public class ArmourEvents {

    public static void onPlayerTick(Player player) {

//        if(player.level().isClientSide) return;

        if (isWearingFullSet(player, FireStoneArmour.class)) {
            player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200, 0, true, false));
        }
        if (isWearingFullSet(player, WaterStoneArmour.class)) {
            player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 0, true, false));
            player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 200, 0, true, false));
            player.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 200, 0, true, false));
        }
        if (isWearingFullSet(player, LeafStoneArmour.class)) {
            player.addEffect(new MobEffectInstance(MobEffects.LUCK, 200, 0, true, false));
            player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 0, true, false));
        }
        if (isWearingFullSet(player, ThunderStoneArmour.class)) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0, true, false));
        }
        if (isWearingFullSet(player, SunStoneArmour.class)) {
            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 200, 0, true, false));
        }
        if (isWearingFullSet(player, MoonStoneArmour.class)) {
            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 200, 0, true, false));
        }
        if (isWearingFullSet(player, DawnStoneArmour.class)) {
            player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 200, 0, true, false));
        }
        if (isWearingFullSet(player, DuskStoneArmour.class)) {
            player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 200, 0, true, true));
        }
        if (isWearingFullSet(player, ShinyStoneArmour.class)) {
            player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 200, 0, true, false));
        }
        if (isWearingFullSet(player, IceStoneArmour.class)) {
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0, true, false));
        }
    }

    private static boolean isWearingFullSet(Player player, Class<?> armourClass) {
        return player.getItemBySlot(EquipmentSlot.HEAD).getItem().getClass() == armourClass &&
                player.getItemBySlot(EquipmentSlot.CHEST).getItem().getClass() == armourClass &&
                player.getItemBySlot(EquipmentSlot.LEGS).getItem().getClass() == armourClass &&
                player.getItemBySlot(EquipmentSlot.FEET).getItem().getClass() == armourClass;
    }

    public static void register() {
        TickEvent.PLAYER_POST.register(ArmourEvents::onPlayerTick);
    }
}