package net.dan2026.cobblemonarmours.common.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import net.dan2026.cobblemonarmours.common.CobblemonArmours;
import net.dan2026.cobblemonarmours.common.items.*;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;


public class ItemRegistry {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(CobblemonArmours.MOD_ID, Registries.ITEM);

    //region Fire Stone

    public static final RegistrySupplier<FireStoneArmour> FIRE_STONE_HELMET = ITEMS.register(FireStoneArmour.HELMET_ID, FireStoneArmour::createHelmet);
    public static final RegistrySupplier<FireStoneArmour> FIRE_STONE_CHESTPLATE = ITEMS.register(FireStoneArmour.CHESTPLATE_ID, FireStoneArmour::createChestplate);
    public static final RegistrySupplier<FireStoneArmour> FIRE_STONE_LEGGINGS = ITEMS.register(FireStoneArmour.LEGGINGS_ID, FireStoneArmour::createLeggings);
    public static final RegistrySupplier<FireStoneArmour> FIRE_STONE_BOOTS = ITEMS.register(FireStoneArmour.BOOTS_ID, FireStoneArmour::createBoots);

    //endregion

    //region Water Stone

    public static final RegistrySupplier<WaterStoneArmour> WATER_STONE_HELMET = ITEMS.register(WaterStoneArmour.HELMET_ID, WaterStoneArmour::createHelmet);
    public static final RegistrySupplier<WaterStoneArmour> WATER_STONE_CHESTPLATE = ITEMS.register(WaterStoneArmour.CHESTPLATE_ID, WaterStoneArmour::createChestplate);
    public static final RegistrySupplier<WaterStoneArmour> WATER_STONE_LEGGINGS = ITEMS.register(WaterStoneArmour.LEGGINGS_ID, WaterStoneArmour::createLeggings);
    public static final RegistrySupplier<WaterStoneArmour> WATER_STONE_BOOTS = ITEMS.register(WaterStoneArmour.BOOTS_ID, WaterStoneArmour::createBoots);

    //endregion

    //region Leaf Stone

    public static final RegistrySupplier<LeafStoneArmour> LEAF_STONE_HELMET = ITEMS.register(LeafStoneArmour.HELMET_ID, LeafStoneArmour::createHelmet);
    public static final RegistrySupplier<LeafStoneArmour> LEAF_STONE_CHESTPLATE = ITEMS.register(LeafStoneArmour.CHESTPLATE_ID, LeafStoneArmour::createChestplate);
    public static final RegistrySupplier<LeafStoneArmour> LEAF_STONE_LEGGINGS = ITEMS.register(LeafStoneArmour.LEGGINGS_ID, LeafStoneArmour::createLeggings);
    public static final RegistrySupplier<LeafStoneArmour> LEAF_STONE_BOOTS = ITEMS.register(LeafStoneArmour.BOOTS_ID, LeafStoneArmour::createBoots);

    //endregion

    //region Ice Stone

    public static final RegistrySupplier<IceStoneArmour> ICE_STONE_HELMET = ITEMS.register(IceStoneArmour.HELMET_ID, IceStoneArmour::createHelmet);
    public static final RegistrySupplier<IceStoneArmour> ICE_STONE_CHESTPLATE = ITEMS.register(IceStoneArmour.CHESTPLATE_ID, IceStoneArmour::createChestplate);
    public static final RegistrySupplier<IceStoneArmour> ICE_STONE_LEGGINGS = ITEMS.register(IceStoneArmour.LEGGINGS_ID, IceStoneArmour::createLeggings);
    public static final RegistrySupplier<IceStoneArmour> ICE_STONE_BOOTS = ITEMS.register(IceStoneArmour.BOOTS_ID, IceStoneArmour::createBoots);

    //endregion

    //region Thunder Stone

    public static final RegistrySupplier<ThunderStoneArmour> THUNDER_STONE_HELMET = ITEMS.register(ThunderStoneArmour.HELMET_ID, ThunderStoneArmour::createHelmet);
    public static final RegistrySupplier<ThunderStoneArmour> THUNDER_STONE_CHESTPLATE = ITEMS.register(ThunderStoneArmour.CHESTPLATE_ID, ThunderStoneArmour::createChestplate);
    public static final RegistrySupplier<ThunderStoneArmour> THUNDER_STONE_LEGGINGS = ITEMS.register(ThunderStoneArmour.LEGGINGS_ID, ThunderStoneArmour::createLeggings);
    public static final RegistrySupplier<ThunderStoneArmour> THUNDER_STONE_BOOTS = ITEMS.register(ThunderStoneArmour.BOOTS_ID, ThunderStoneArmour::createBoots);

    //endregion

    //region Moon Stone
    public static final RegistrySupplier<MoonStoneArmour> MOON_STONE_HELMET = ITEMS.register(MoonStoneArmour.HELMET_ID, MoonStoneArmour::createHelmet);
    public static final RegistrySupplier<MoonStoneArmour> MOON_STONE_CHESTPLATE = ITEMS.register(MoonStoneArmour.CHESTPLATE_ID, MoonStoneArmour::createChestplate);
    public static final RegistrySupplier<MoonStoneArmour> MOON_STONE_LEGGINGS = ITEMS.register(MoonStoneArmour.LEGGINGS_ID, MoonStoneArmour::createLeggings);
    public static final RegistrySupplier<MoonStoneArmour> MOON_STONE_BOOTS = ITEMS.register(MoonStoneArmour.BOOTS_ID, MoonStoneArmour::createBoots);

    //endregion

    //region Sun Stone

    public static final RegistrySupplier<SunStoneArmour> SUN_STONE_HELMET = ITEMS.register(SunStoneArmour.HELMET_ID, SunStoneArmour::createHelmet);
    public static final RegistrySupplier<SunStoneArmour> SUN_STONE_CHESTPLATE = ITEMS.register(SunStoneArmour.CHESTPLATE_ID, SunStoneArmour::createChestplate);
    public static final RegistrySupplier<SunStoneArmour> SUN_STONE_LEGGINGS = ITEMS.register(SunStoneArmour.LEGGINGS_ID, SunStoneArmour::createLeggings);
    public static final RegistrySupplier<SunStoneArmour> SUN_STONE_BOOTS = ITEMS.register(SunStoneArmour.BOOTS_ID, SunStoneArmour::createBoots);

    //endregion

    //region Shiny Stone

    public static final RegistrySupplier<ShinyStoneArmour> SHINY_STONE_HELMET = ITEMS.register(ShinyStoneArmour.HELMET_ID, ShinyStoneArmour::createHelmet);
    public static final RegistrySupplier<ShinyStoneArmour> SHINY_STONE_CHESTPLATE = ITEMS.register(ShinyStoneArmour.CHESTPLATE_ID, ShinyStoneArmour::createChestplate);
    public static final RegistrySupplier<ShinyStoneArmour> SHINY_STONE_LEGGINGS = ITEMS.register(ShinyStoneArmour.LEGGINGS_ID, ShinyStoneArmour::createLeggings);
    public static final RegistrySupplier<ShinyStoneArmour> SHINY_STONE_BOOTS = ITEMS.register(ShinyStoneArmour.BOOTS_ID, ShinyStoneArmour::createBoots);

    //endregion

    //region Dusk Stone

    public static final RegistrySupplier<DuskStoneArmour> DUSK_STONE_HELMET = ITEMS.register(DuskStoneArmour.HELMET_ID, DuskStoneArmour::createHelmet);
    public static final RegistrySupplier<DuskStoneArmour> DUSK_STONE_CHESTPLATE = ITEMS.register(DuskStoneArmour.CHESTPLATE_ID, DuskStoneArmour::createChestplate);
    public static final RegistrySupplier<DuskStoneArmour> DUSK_STONE_LEGGINGS = ITEMS.register(DuskStoneArmour.LEGGINGS_ID, DuskStoneArmour::createLeggings);
    public static final RegistrySupplier<DuskStoneArmour> DUSK_STONE_BOOTS = ITEMS.register(DuskStoneArmour.BOOTS_ID, DuskStoneArmour::createBoots);

    //endregion

    //region Dawn Stone

    public static final RegistrySupplier<DawnStoneArmour> DAWN_STONE_HELMET = ITEMS.register(DawnStoneArmour.HELMET_ID, DawnStoneArmour::createHelmet);
    public static final RegistrySupplier<DawnStoneArmour> DAWN_STONE_CHESTPLATE = ITEMS.register(DawnStoneArmour.CHESTPLATE_ID, DawnStoneArmour::createChestplate);
    public static final RegistrySupplier<DawnStoneArmour> DAWN_STONE_LEGGINGS = ITEMS.register(DawnStoneArmour.LEGGINGS_ID, DawnStoneArmour::createLeggings);
    public static final RegistrySupplier<DawnStoneArmour> DAWN_STONE_BOOTS = ITEMS.register(DawnStoneArmour.BOOTS_ID, DawnStoneArmour::createBoots);

    //endregion

    public static void register() {
        ITEMS.register();
    }
}