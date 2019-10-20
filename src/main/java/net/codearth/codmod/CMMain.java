package net.codearth.codmod;

import net.codearth.codmod.events.RegisteringEvent;
		import net.codearth.codmod.common.CCommonProxy;
		import net.codearth.codmod.init.CodTab;
import net.codearth.codmod.modules.quest.CQuest;
import net.codearth.codmod.utils.References;
		import net.minecraft.creativetab.CreativeTabs;
		import net.minecraftforge.common.MinecraftForge;
		import net.minecraftforge.fml.common.Mod;
		import net.minecraftforge.fml.common.Mod.EventHandler;
		import net.minecraftforge.fml.common.SidedProxy;
		import net.minecraftforge.fml.common.event.FMLInitializationEvent;
		import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
		import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class CMMain {
	@Mod.Instance(References.MODID)
	public static CMMain instance;
	@SidedProxy(clientSide = References.CP, serverSide = References.SP)
	public static CCommonProxy proxy;
	public static final CreativeTabs modTab = new CodTab("CodTab");
	public CMMain() {
		MinecraftForge.EVENT_BUS.register(new RegisteringEvent());
	}
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit();
	}
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init();
		CQuest.init();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit();
	}
	public void initCQuest(){
	}
}
