package net.dan2026.cobblemonarmours.common.items;

import net.dan2026.cobblemonarmours.common.registry.TierRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Rarity;

import java.util.List;

public class ShinyStoneArmour extends BaseArmour {

    public static final String HELMET_ID = "shiny_stone_helmet";
    public static final String CHESTPLATE_ID = "shiny_stone_chestplate";
    public static final String LEGGINGS_ID = "shiny_stone_leggings";
    public static final String BOOTS_ID = "shiny_stone_boots";

    public ShinyStoneArmour(Type type, Properties properties) {
        super(TierRegistry.SHINY_STONE, type, properties);
    }

    @Override
    protected List<Component> getSetBonusText() {
        return List.of(Component.literal("+ Health Boost I").withStyle(ChatFormatting.BLUE));
    }

    public static ShinyStoneArmour createHelmet() {
        return new ShinyStoneArmour(Type.HELMET, new Properties().rarity(Rarity.COMMON));
    }

    public static ShinyStoneArmour createChestplate() {
        return new ShinyStoneArmour(Type.CHESTPLATE, new Properties().rarity(Rarity.COMMON));
    }

    public static ShinyStoneArmour createLeggings() {
        return new ShinyStoneArmour(Type.LEGGINGS, new Properties().rarity(Rarity.COMMON));
    }

    public static ShinyStoneArmour createBoots() {
        return new ShinyStoneArmour(Type.BOOTS, new Properties().rarity(Rarity.COMMON));
    }
}