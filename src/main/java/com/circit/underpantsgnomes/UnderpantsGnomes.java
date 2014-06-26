package com.circit.underpantsgnomes;

import com.circit.underpantsgnomes.proxy.IProxy;
import com.circit.underpantsgnomes.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by circit on 27/06/2014.
 */

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class UnderpantsGnomes {

    @Mod.Instance("UnderpantsGnomes")
    public static UnderpantsGnomes instance;

    @SidedProxy(clientSide=Reference.CLIENTPROXY, serverSide=Reference.SERVERPROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
