package net.dan2026.cobblemonarmours.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.dan2026.cobblemonarmours.common.CobblemonArmours;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.Registries;


public class TabRegistry {

    private static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(CobblemonArmours.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> COBBLE_ARMOUR_TAB =
            TABS.register(new ResourceLocation(CobblemonArmours.MOD_ID, "cobblemon_armours_tab"), () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("itemGroup.cobblemonarmours.cobble_armour_tab"))
                    .icon(() -> new ItemStack(ItemRegistry.DUSK_STONE_CHESTPLATE.get()))
                    .displayItems((params, output) -> {
                        output.accept(ItemRegistry.FIRE_STONE_HELMET.get());
                        output.accept(ItemRegistry.FIRE_STONE_CHESTPLATE.get());
                        output.accept(ItemRegistry.FIRE_STONE_LEGGINGS.get());
                        output.accept(ItemRegistry.FIRE_STONE_BOOTS.get());
                        output.accept(ItemRegistry.WATER_STONE_HELMET.get());
                        output.accept(ItemRegistry.WATER_STONE_CHESTPLATE.get());
                        output.accept(ItemRegistry.WATER_STONE_LEGGINGS.get());
                        output.accept(ItemRegistry.WATER_STONE_BOOTS.get());
                        output.accept(ItemRegistry.LEAF_STONE_HELMET.get());
                        output.accept(ItemRegistry.LEAF_STONE_CHESTPLATE.get());
                        output.accept(ItemRegistry.LEAF_STONE_LEGGINGS.get());
                        output.accept(ItemRegistry.LEAF_STONE_BOOTS.get());
                        output.accept(ItemRegistry.ICE_STONE_HELMET.get());
                        output.accept(ItemRegistry.ICE_STONE_CHESTPLATE.get());
                        output.accept(ItemRegistry.ICE_STONE_LEGGINGS.get());
                        output.accept(ItemRegistry.ICE_STONE_BOOTS.get());
                        output.accept(ItemRegistry.THUNDER_STONE_HELMET.get());
                        output.accept(ItemRegistry.THUNDER_STONE_CHESTPLATE.get());
                        output.accept(ItemRegistry.THUNDER_STONE_LEGGINGS.get());
                        output.accept(ItemRegistry.THUNDER_STONE_BOOTS.get());
                        output.accept(ItemRegistry.MOON_STONE_HELMET.get());
                        output.accept(ItemRegistry.MOON_STONE_CHESTPLATE.get());
                        output.accept(ItemRegistry.MOON_STONE_LEGGINGS.get());
                        output.accept(ItemRegistry.MOON_STONE_BOOTS.get());
                        output.accept(ItemRegistry.SUN_STONE_HELMET.get());
                        output.accept(ItemRegistry.SUN_STONE_CHESTPLATE.get());
                        output.accept(ItemRegistry.SUN_STONE_LEGGINGS.get());
                        output.accept(ItemRegistry.SUN_STONE_BOOTS.get());
                        output.accept(ItemRegistry.SHINY_STONE_HELMET.get());
                        output.accept(ItemRegistry.SHINY_STONE_CHESTPLATE.get());
                        output.accept(ItemRegistry.SHINY_STONE_LEGGINGS.get());
                        output.accept(ItemRegistry.SHINY_STONE_BOOTS.get());
                        output.accept(ItemRegistry.DUSK_STONE_HELMET.get());
                        output.accept(ItemRegistry.DUSK_STONE_CHESTPLATE.get());
                        output.accept(ItemRegistry.DUSK_STONE_LEGGINGS.get());
                        output.accept(ItemRegistry.DUSK_STONE_BOOTS.get());
                        output.accept(ItemRegistry.DAWN_STONE_HELMET.get());
                        output.accept(ItemRegistry.DAWN_STONE_CHESTPLATE.get());
                        output.accept(ItemRegistry.DAWN_STONE_LEGGINGS.get());
                        output.accept(ItemRegistry.DAWN_STONE_BOOTS.get());
                    })
                    .build()
            );

    public static void register() {
        TABS.register();
    }
}
