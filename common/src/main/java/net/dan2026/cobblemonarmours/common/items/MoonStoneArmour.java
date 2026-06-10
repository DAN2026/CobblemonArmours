package net.dan2026.cobblemonarmours.common.items;

import net.dan2026.cobblemonarmours.common.registry.TierRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Rarity;

import java.util.List;

public class MoonStoneArmour extends BaseArmour {

    public static final String HELMET_ID = "moon_stone_helmet";
    public static final String CHESTPLATE_ID = "moon_stone_chestplate";
    public static final String LEGGINGS_ID = "moon_stone_leggings";
    public static final String BOOTS_ID = "moon_stone_boots";

    public MoonStoneArmour(Type type, Properties properties) {
        super(TierRegistry.MOON_STONE, type, properties);
    }

    @Override
    protected List<Component> getSetBonusText() {
        return List.of(Component.literal("+ Night Vision I").withStyle(ChatFormatting.BLUE));
    }

    public static MoonStoneArmour createHelmet() {
        return new MoonStoneArmour(Type.HELMET, new Properties().rarity(Rarity.COMMON));
    }

    public static MoonStoneArmour createChestplate() {
        return new MoonStoneArmour(Type.CHESTPLATE, new Properties().rarity(Rarity.COMMON));
    }

    public static MoonStoneArmour createLeggings() {
        return new MoonStoneArmour(Type.LEGGINGS, new Properties().rarity(Rarity.COMMON));
    }

    public static MoonStoneArmour createBoots() {
        return new MoonStoneArmour(Type.BOOTS, new Properties().rarity(Rarity.COMMON));
    }
}