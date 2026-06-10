package net.dan2026.cobblemonarmours.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.dan2026.cobblemonarmours.common.CobblemonArmours;
import net.dan2026.cobblemonarmours.common.items.ArmourTiers;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ArmorMaterial;

public class TierRegistry {

    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(CobblemonArmours.MOD_ID, Registries.ARMOR_MATERIAL);

    public static final RegistrySupplier<ArmorMaterial> FIRE_STONE = ARMOR_MATERIALS.register("fire_stone", () -> ArmourTiers.FIRE_STONE);
    public static final RegistrySupplier<ArmorMaterial> WATER_STONE = ARMOR_MATERIALS.register("water_stone", () -> ArmourTiers.WATER_STONE);
    public static final RegistrySupplier<ArmorMaterial> LEAF_STONE = ARMOR_MATERIALS.register("leaf_stone", () -> ArmourTiers.LEAF_STONE);
    public static final RegistrySupplier<ArmorMaterial> ICE_STONE = ARMOR_MATERIALS.register("ice_stone", () -> ArmourTiers.ICE_STONE);
    public static final RegistrySupplier<ArmorMaterial> THUNDER_STONE = ARMOR_MATERIALS.register("thunder_stone", () -> ArmourTiers.THUNDER_STONE);
    public static final RegistrySupplier<ArmorMaterial> MOON_STONE = ARMOR_MATERIALS.register("moon_stone", () -> ArmourTiers.MOON_STONE);
    public static final RegistrySupplier<ArmorMaterial> SUN_STONE = ARMOR_MATERIALS.register("sun_stone", () -> ArmourTiers.SUN_STONE);
    public static final RegistrySupplier<ArmorMaterial> SHINY_STONE = ARMOR_MATERIALS.register("shiny_stone", () -> ArmourTiers.SHINY_STONE);
    public static final RegistrySupplier<ArmorMaterial> DUSK_STONE = ARMOR_MATERIALS.register("dusk_stone", () -> ArmourTiers.DUSK_STONE);
    public static final RegistrySupplier<ArmorMaterial> DAWN_STONE = ARMOR_MATERIALS.register("dawn_stone", () -> ArmourTiers.DAWN_STONE);

    public static void register() {
        ARMOR_MATERIALS.register();
    }
}