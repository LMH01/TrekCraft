package com.github.lmh01.trekcraft.event;

import com.github.lmh01.trekcraft.commands.TrekCraftCommand;
import com.github.lmh01.trekcraft.helpers.DebugHelperLite;
import com.github.lmh01.trekcraft.util.References;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = References.MODID)
public class TrekCraftEvents {
    /*Mod commands registry*/
    @SubscribeEvent
    public static void registerCommandsEvent(final RegisterCommandsEvent event){
        DebugHelperLite.sendDebugInformation("Registering commands..", 5);
        TrekCraftCommand.register(event.getDispatcher());
    }
}
