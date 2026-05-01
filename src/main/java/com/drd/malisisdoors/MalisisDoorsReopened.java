package com.drd.malisisdoors;

import com.drd.malisisdoors.compat.mcwdoors.MacawsDoorsCreativeTabs;
import com.drd.malisisdoors.init.ModCreativeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(MalisisDoorsReopened.MOD_ID)
public class MalisisDoorsReopened {
    public static final String MOD_ID = "malisisdoors";

    public MalisisDoorsReopened(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        ModCreativeTabs.register(modEventBus);
        if (ModList.get().isLoaded("mcwdoors")) {
            MacawsDoorsCreativeTabs.register(modEventBus);
        }
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
