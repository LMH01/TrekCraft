package com.github.lmh01.trekcraft.commands;

import com.github.lmh01.lmh01_lib.helpers.CommandHelper;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.util.text.TextFormatting;

public class TrekCraftCommand {
    public static void register(CommandDispatcher<CommandSource> dispatcher){
        dispatcher.register(Commands.literal("trekcraft").executes(source -> castTrekCraftCommand(source.getSource())));
    }
    private static int castTrekCraftCommand(CommandSource source){
        CommandHelper.sendTranslatedCommandFeedback("commands.trekcraft.trekcraft.test", TextFormatting.GREEN, source,true);
        return 1;
    }
}
