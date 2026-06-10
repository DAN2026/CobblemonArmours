package net.dan2026.cobblemonarmours.common.items;

import net.dan2026.cobblemonarmours.common.registry.TierRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Rarity;

import java.util.List;

public class SunStoneArmour extends BaseArmour {

    public static final String HELMET_ID = "sun_stone_helmet";
    public static final String CHESTPLATE_ID = "sun_stone_chestplate";
    public static final String LEGGINGS_ID = "sun_stone_leggings";
    public static final String BOOTS_ID = "sun_stone_boots";

    public SunStoneArmour(Type type, Properties properties) {
        super(TierRegistry.SUN_STONE, type, properties);
    }

    @Override
    protected List<Component> getSetBonusText() {
        return List.of(Component.literal("+ Jump Boost I").withStyle(ChatFormatting.BLUE));
    }

    public static SunStoneArmour createHelmet() {
        return new SunStoneArmour(Type.HELMET, new Properties().rarity(Rarity.COMMON));
    }

    public static SunStoneArmour createChestplate() {
        return new SunStoneArmour(Type.CHESTPLATE, new Properties().rarity(Rarity.COMMON));
    }

    public static SunStoneArmour createLeggings() {
        return new SunStoneArmour(Type.LEGGINGS, new Properties().rarity(Rarity.COMMON));
    }

    public static SunStoneArmour createBoots() {
        return new SunStoneArmour(Type.BOOTS, new Properties().rarity(Rarity.COMMON));
    }
}