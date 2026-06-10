package net.dan2026.cobblemonarmours.common.items;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public abstract class BaseArmour extends ArmorItem {

    public BaseArmour(Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(material, type, properties
                .stacksTo(1)
                .durability(1000)
        );
    }

    /**
     * Returns the set bonus descriptions for this armour set.
     * Displayed in the item tooltip when hovering over any piece of this armour.
     *
     * @return a {@link List} of {@link Component} describing the full set bonus effects
     */
    protected abstract List<Component> getSetBonusText();

    @Override
    public final void appendHoverText(
            @NotNull ItemStack stack,
            @NotNull TooltipContext context,
            @NotNull List<Component> tooltipComponents,
            TooltipFlag tooltipFlag) {

        if (tooltipFlag.isAdvanced() || Screen.hasShiftDown()) {
            tooltipComponents.add(Component.literal(""));
            tooltipComponents.add(Component.literal("Set Bonus:").withStyle(ChatFormatting.GRAY));
            tooltipComponents.addAll(getSetBonusText());
            tooltipComponents.add(Component.literal(""));
        } else {
            tooltipComponents.add(Component.literal(""));
            tooltipComponents.add(Component.literal("Hold Shift for details").withStyle(ChatFormatting.DARK_GRAY).withStyle(style -> style.withItalic(true)));
            tooltipComponents.add(Component.literal(""));
        }
    }
}