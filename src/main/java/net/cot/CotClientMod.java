package net.cot;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;

@Mod(modid = CotClientMod.MODID, name = CotClientMod.NAME, version = CotClientMod.VERSION)
public class CotClientMod {
    public static final String MODID = "cotclientmod";
    public static final String NAME = "Cot Client Mod";
    public static final String VERSION = "1.0.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Initialization code here
    }

    @EventHandler
    public void init(FMLPostInitializationEvent event) {
        // Post-initialization code here
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        // Logic for server loading here
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (event.getKey() == 57) { // Right Shift key
            // Open GUI logic here
        }
    }
}