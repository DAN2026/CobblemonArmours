package net.dan2026.cobblemonarmours.common.items;

import net.dan2026.cobblemonarmours.common.registry.TierRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Rarity;

import java.util.List;

public class LeafStoneArmour extends BaseArmour {

    public static final String HELMET_ID = "leaf_stone_helmet";
    public static final String CHESTPLATE_ID = "leaf_stone_chestplate";
    public static final String LEGGINGS_ID = "leaf_stone_leggings";
    public static final String BOOTS_ID = "leaf_stone_boots";

    public LeafStoneArmour(Type type, Properties properties) {
        super(TierRegistry.LEAF_STONE, type, properties);
    }

    @Override
    protected List<Component> getSetBonusText() {
        return
            List.of(
                    Component.literal("+ Luck I").withStyle(ChatFormatting.BLUE),
                    Component.literal("+ Slow Falling I").withStyle(ChatFormatting.BLUE)
            );
    }

    public static LeafStoneArmour createHelmet() {
        return new LeafStoneArmour(Type.HELMET, new Properties().rarity(Rarity.COMMON));
    }

    public static LeafStoneArmour createChestplate() {
        return new LeafStoneArmour(Type.CHESTPLATE, new Properties().rarity(Rarity.COMMON));
    }

    public static LeafStoneArmour createLeggings() {
        return new LeafStoneArmour(Type.LEGGINGS, new Properties().rarity(Rarity.COMMON));
    }

    public static LeafStoneArmour createBoots() {
        return new LeafStoneArmour(Type.BOOTS, new Properties().rarity(Rarity.COMMON));
    }
}