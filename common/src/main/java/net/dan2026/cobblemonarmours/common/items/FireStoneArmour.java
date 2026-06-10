package net.dan2026.cobblemonarmours.common.items;

import net.dan2026.cobblemonarmours.common.registry.TierRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Rarity;

import java.util.List;

public class FireStoneArmour extends BaseArmour {

    public static final String HELMET_ID = "fire_stone_helmet";
    public static final String CHESTPLATE_ID = "fire_stone_chestplate";
    public static final String LEGGINGS_ID = "fire_stone_leggings";
    public static final String BOOTS_ID = "fire_stone_boots";

    public FireStoneArmour(Type type, Properties properties) {
        super(TierRegistry.FIRE_STONE, type, properties);
    }

    @Override
    protected List<Component> getSetBonusText() {
        return List.of(Component.literal("+ Fire Resistance I").withStyle(ChatFormatting.BLUE));
    }

    public static FireStoneArmour createHelmet() {
        return new FireStoneArmour(Type.HELMET, new Properties().rarity(Rarity.COMMON));
    }

    public static FireStoneArmour createChestplate() {
        return new FireStoneArmour(Type.CHESTPLATE, new Properties().rarity(Rarity.COMMON));
    }

    public static FireStoneArmour createLeggings() {
        return new FireStoneArmour(Type.LEGGINGS, new Properties().rarity(Rarity.COMMON));
    }

    public static FireStoneArmour createBoots() {
        return new FireStoneArmour(Type.BOOTS, new Properties().rarity(Rarity.COMMON));
    }
}
