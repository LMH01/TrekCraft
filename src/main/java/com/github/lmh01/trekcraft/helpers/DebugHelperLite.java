package com.github.lmh01.trekcraft.helpers;

import com.github.lmh01.trekcraft.util.References;
import com.github.lmh01.lmh01_lib.helpers.DebugHelper;

public class DebugHelperLite {
    /**
     * Using this function you dont need provide a modid. The modid used will default to lmh01_lib.
     * @param debugInformation - The Information you want to send
     * @param level - The Severity of the Information 1-5;
     *              1 = Info
     *              2 = Debug
     *              3 = Warn
     *              4 = Error
     *              5 = Fatal
     */
    public static void sendDebugInformation(String debugInformation, int level){
        DebugHelper.sendDebugInformation(debugInformation, level, References.MODID);
    }
}
