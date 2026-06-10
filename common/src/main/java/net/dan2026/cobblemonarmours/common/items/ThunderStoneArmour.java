package net.dan2026.cobblemonarmours.common.items;

import net.dan2026.cobblemonarmours.common.registry.TierRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Rarity;

import java.util.List;

public class ThunderStoneArmour extends BaseArmour {

    public static final String HELMET_ID = "thunder_stone_helmet";
    public static final String CHESTPLATE_ID = "thunder_stone_chestplate";
    public static final String LEGGINGS_ID = "thunder_stone_leggings";
    public static final String BOOTS_ID = "thunder_stone_boots";

    public ThunderStoneArmour(Type type, Properties properties) {
        super(TierRegistry.THUNDER_STONE, type, properties);
    }

    @Override
    protected List<Component> getSetBonusText() {
        return List.of(Component.literal("+ Speed I").withStyle(ChatFormatting.BLUE));
    }

    public static ThunderStoneArmour createHelmet() {
        return new ThunderStoneArmour(Type.HELMET, new Properties().rarity(Rarity.COMMON));
    }

    public static ThunderStoneArmour createChestplate() {
        return new ThunderStoneArmour(Type.CHESTPLATE, new Properties().rarity(Rarity.COMMON));
    }

    public static ThunderStoneArmour createLeggings() {
        return new ThunderStoneArmour(Type.LEGGINGS, new Properties().rarity(Rarity.COMMON));
    }

    public static ThunderStoneArmour createBoots() {
        return new ThunderStoneArmour(Type.BOOTS, new Properties().rarity(Rarity.COMMON));
    }
}