package net.dan2026.cobblemonarmours.common.items;

import net.dan2026.cobblemonarmours.common.registry.TierRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Rarity;

import java.util.List;

public class IceStoneArmour extends BaseArmour {

    public static final String HELMET_ID = "ice_stone_helmet";
    public static final String CHESTPLATE_ID = "ice_stone_chestplate";
    public static final String LEGGINGS_ID = "ice_stone_leggings";
    public static final String BOOTS_ID = "ice_stone_boots";

    public IceStoneArmour(Type type, Properties properties) {
        super(TierRegistry.ICE_STONE, type, properties);
    }

    @Override
    protected List<Component> getSetBonusText() {
        return List.of(Component.literal("+ Resistance I").withStyle(ChatFormatting.BLUE));
    }

    public static IceStoneArmour createHelmet() {
        return new IceStoneArmour(Type.HELMET, new Properties().rarity(Rarity.COMMON));
    }

    public static IceStoneArmour createChestplate() {
        return new IceStoneArmour(Type.CHESTPLATE, new Properties().rarity(Rarity.COMMON));
    }

    public static IceStoneArmour createLeggings() {
        return new IceStoneArmour(Type.LEGGINGS, new Properties().rarity(Rarity.COMMON));
    }

    public static IceStoneArmour createBoots() {
        return new IceStoneArmour(Type.BOOTS, new Properties().rarity(Rarity.COMMON));
    }
}