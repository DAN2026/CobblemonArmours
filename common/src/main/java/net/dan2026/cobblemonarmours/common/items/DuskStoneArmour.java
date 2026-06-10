package net.dan2026.cobblemonarmours.common.items;

import net.dan2026.cobblemonarmours.common.registry.TierRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

import java.util.List;

public class DuskStoneArmour extends BaseArmour {

    public static final String HELMET_ID = "dusk_stone_helmet";
    public static final String CHESTPLATE_ID = "dusk_stone_chestplate";
    public static final String LEGGINGS_ID = "dusk_stone_leggings";
    public static final String BOOTS_ID = "dusk_stone_boots";

    public DuskStoneArmour(Type type, Properties properties) {
        super(TierRegistry.DUSK_STONE, type, properties);
    }

    @Override
    protected List<Component> getSetBonusText() {
        return List.of(Component.literal("+ Invisibility I").withStyle(ChatFormatting.BLUE));
    }

    public static DuskStoneArmour createHelmet() {
        return new DuskStoneArmour(Type.HELMET, new Properties());
    }

    public static DuskStoneArmour createChestplate() {
        return new DuskStoneArmour(Type.CHESTPLATE, new Properties());
    }

    public static DuskStoneArmour createLeggings() {
        return new DuskStoneArmour(Type.LEGGINGS, new Properties());
    }

    public static DuskStoneArmour createBoots() {
        return new DuskStoneArmour(Type.BOOTS, new Properties());
    }
}