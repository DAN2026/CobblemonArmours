package net.dan2026.cobblemonarmours.common;

import net.dan2026.cobblemonarmours.common.events.ArmourEvents;
import net.dan2026.cobblemonarmours.common.registry.ItemRegistry;
import net.dan2026.cobblemonarmours.common.registry.TabRegistry;
import net.dan2026.cobblemonarmours.common.registry.TierRegistry;


public final class CobblemonArmours {

    public static final String MOD_ID = "cobblemonarmours";

    public static void register() {

        ItemRegistry.register();
        TabRegistry.register();
        TierRegistry.register();
        ArmourEvents.register();

    }


}
