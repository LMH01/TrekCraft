package com.github.lmh01.trekcraft;

import com.github.lmh01.lmh01_lib.util.SubModManager;
import com.github.lmh01.trekcraft.helpers.DebugHelperLite;
import com.github.lmh01.trekcraft.util.References;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(References.MODID)
public class TrekCraft {
    public TrekCraft() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
    }

    /*Used to be Pre Init*/
    private void setup(final FMLCommonSetupEvent event) {
        DebugHelperLite.sendDebugInformation("Beginning Pre-Init", 4);
        SubModManager.registerSubMod(References.MODID, References.NAME, References.VERSION, References.UPDATE_URL, References.DOWNLOAD_URL);

    }

    /*Thinks in here only run on client side*/
    private void clientRegistries(final FMLClientSetupEvent event) {
        DebugHelperLite.sendDebugInformation("Hello from clientRegistries", 4);
    }

    /*Used to be Post-Init*/
    private void processIMC(final InterModProcessEvent event) {
        DebugHelperLite.sendDebugInformation("Starting postInit",4);

        DebugHelperLite.sendDebugInformation("Trek Craft loading complete:",4);
    }
}
