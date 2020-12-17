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
        DebugHelperLite.sendDebugInformation("Beginning Pre-Init", 2, 0);
        SubModManager.registerSubMod(References.MODID, References.NAME, References.VERSION, "https://www.dropbox.com/s/jfnwnir72c2b0ix/newestVersion.txt?dl=1", "https://www.curseforge.com/minecraft/mc-mods/trek-craft-1-16/files");
    }

    /*Thinks in here only run on client side*/
    private void clientRegistries(final FMLClientSetupEvent event) {
        DebugHelperLite.sendDebugInformation("Hello from clientRegistries", 2, 0);
    }

    /*Used to be Post-Init*/
    private void processIMC(final InterModProcessEvent event) {
        DebugHelperLite.sendDebugInformation("Starting postInit",2, 0);

        DebugHelperLite.sendDebugInformation("Trek Craft loading complete:",2, 0);
    }
}
