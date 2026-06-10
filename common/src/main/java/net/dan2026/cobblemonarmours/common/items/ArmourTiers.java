package net.dan2026.cobblemonarmours.common.items;

import net.minecraft.Util;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ArmourTiers {

    private static Supplier<Ingredient> cobblemon(String stone) {
        return () -> Ingredient.of(BuiltInRegistries.ITEM.get(
                ResourceLocation.fromNamespaceAndPath("cobblemon", stone)
        ));
    }

    private static EnumMap<ArmorItem.Type, Integer> armorValue() {
        return Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.HELMET, 3);
            map.put(ArmorItem.Type.CHESTPLATE, 7);
            map.put(ArmorItem.Type.LEGGINGS, 6);
            map.put(ArmorItem.Type.BOOTS, 3);
        });
    }

    private static List<ArmorMaterial.Layer> layer(String stone) {
        return List.of(new ArmorMaterial.Layer(
                ResourceLocation.fromNamespaceAndPath("cobblemonarmours", stone)
        ));
    }

    public static final ArmorMaterial FIRE_STONE = new ArmorMaterial(
            armorValue(), 10, SoundEvents.ARMOR_EQUIP_IRON,
            cobblemon("fire_stone"), layer("fire_stone"), 1.0f, 0.0f
    );

    public static final ArmorMaterial WATER_STONE = new ArmorMaterial(
            armorValue(), 10, SoundEvents.ARMOR_EQUIP_IRON,
            cobblemon("water_stone"), layer("water_stone"), 1.0f, 0.0f
    );

    public static final ArmorMaterial LEAF_STONE = new ArmorMaterial(
            armorValue(), 10, SoundEvents.ARMOR_EQUIP_IRON,
            cobblemon("leaf_stone"), layer("leaf_stone"), 1.0f, 0.0f
    );

    public static final ArmorMaterial ICE_STONE = new ArmorMaterial(
            armorValue(), 10, SoundEvents.ARMOR_EQUIP_IRON,
            cobblemon("ice_stone"), layer("ice_stone"), 1.0f, 0.0f
    );

    public static final ArmorMaterial THUNDER_STONE = new ArmorMaterial(
            armorValue(), 10, SoundEvents.ARMOR_EQUIP_IRON,
            cobblemon("thunder_stone"), layer("thunder_stone"), 1.0f, 0.0f
    );

    public static final ArmorMaterial MOON_STONE = new ArmorMaterial(
            armorValue(), 10, SoundEvents.ARMOR_EQUIP_IRON,
            cobblemon("moon_stone"), layer("moon_stone"), 1.0f, 0.0f
    );

    public static final ArmorMaterial SUN_STONE = new ArmorMaterial(
            armorValue(), 10, SoundEvents.ARMOR_EQUIP_IRON,
            cobblemon("sun_stone"), layer("sun_stone"), 1.0f, 0.0f
    );

    public static final ArmorMaterial SHINY_STONE = new ArmorMaterial(
            armorValue(), 10, SoundEvents.ARMOR_EQUIP_IRON,
            cobblemon("shiny_stone"), layer("shiny_stone"), 1.0f, 0.0f
    );

    public static final ArmorMaterial DUSK_STONE = new ArmorMaterial(
            armorValue(), 10, SoundEvents.ARMOR_EQUIP_IRON,
            cobblemon("dusk_stone"), layer("dusk_stone"), 1.0f, 0.0f
    );

    public static final ArmorMaterial DAWN_STONE = new ArmorMaterial(
            armorValue(), 10, SoundEvents.ARMOR_EQUIP_IRON,
            cobblemon("dawn_stone"), layer("dawn_stone"), 1.0f, 0.0f
    );
}