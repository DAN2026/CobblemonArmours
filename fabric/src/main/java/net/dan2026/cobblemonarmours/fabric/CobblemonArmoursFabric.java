package net.dan2026.cobblemonarmours.fabric;

import net.dan2026.cobblemonarmours.common.CobblemonArmours;
import net.fabricmc.api.ModInitializer;

public class CobblemonArmoursFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        CobblemonArmours.register();
    }

}
