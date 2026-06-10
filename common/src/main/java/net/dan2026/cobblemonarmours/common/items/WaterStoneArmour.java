package net.dan2026.cobblemonarmours.common.items;

import net.dan2026.cobblemonarmours.common.registry.TierRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Rarity;

import java.util.List;

public class WaterStoneArmour extends BaseArmour {

    public static final String HELMET_ID = "water_stone_helmet";
    public static final String CHESTPLATE_ID = "water_stone_chestplate";
    public static final String LEGGINGS_ID = "water_stone_leggings";
    public static final String BOOTS_ID = "water_stone_boots";

    public WaterStoneArmour(Type type, Properties properties) {
        super(TierRegistry.WATER_STONE, type, properties);
    }

    @Override
    protected List<Component> getSetBonusText() {
        return
                List.of(
                        Component.literal("+ Water Breathing I").withStyle(ChatFormatting.BLUE),
                        Component.literal("+ Dolphins Grace I").withStyle(ChatFormatting.BLUE),
                        Component.literal("+ Conduit Power I").withStyle(ChatFormatting.BLUE)
                );
    }

    public static WaterStoneArmour createHelmet() {
        return new WaterStoneArmour(Type.HELMET, new Properties().rarity(Rarity.COMMON));
    }

    public static WaterStoneArmour createChestplate() {

        return new WaterStoneArmour(Type.CHESTPLATE, new Properties().rarity(Rarity.COMMON));
    }

    public static WaterStoneArmour createLeggings() {
        return new WaterStoneArmour(Type.LEGGINGS, new Properties().rarity(Rarity.COMMON));
    }

    public static WaterStoneArmour createBoots() {
        return new WaterStoneArmour(Type.BOOTS, new Properties().rarity(Rarity.COMMON));
    }
}