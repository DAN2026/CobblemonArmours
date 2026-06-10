package net.dan2026.cobblemonarmours.common.items;

import net.dan2026.cobblemonarmours.common.registry.TierRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Rarity;

import java.util.List;

public class DawnStoneArmour extends BaseArmour {

    public static final String HELMET_ID = "dawn_stone_helmet";
    public static final String CHESTPLATE_ID = "dawn_stone_chestplate";
    public static final String LEGGINGS_ID = "dawn_stone_leggings";
    public static final String BOOTS_ID = "dawn_stone_boots";

    public DawnStoneArmour(Type type, Properties properties) {
        super(TierRegistry.DAWN_STONE, type, properties);
    }


    @Override
    protected List<Component> getSetBonusText() {
        return List.of(Component.literal("+ Haste I").withStyle(ChatFormatting.BLUE));
    }

    public static DawnStoneArmour createHelmet() {
        return new DawnStoneArmour(Type.HELMET, new Properties().rarity(Rarity.COMMON));
    }

    public static DawnStoneArmour createChestplate() {
        return new DawnStoneArmour(Type.CHESTPLATE, new Properties().rarity(Rarity.COMMON));
    }

    public static DawnStoneArmour createLeggings() {
        return new DawnStoneArmour(Type.LEGGINGS, new Properties().rarity(Rarity.COMMON));
    }

    public static DawnStoneArmour createBoots() {
        return new DawnStoneArmour(Type.BOOTS, new Properties().rarity(Rarity.COMMON));
    }
}