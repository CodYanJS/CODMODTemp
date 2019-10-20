package net.codearth.codmod.client;

import net.codearth.codmod.init.ModBlocks;
import net.codearth.codmod.init.ModItems;
import net.codearth.codmod.common.CCommonProxy;
import net.codearth.codmod.modules.quest.CQuest;
import net.codearth.codmod.utils.References;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.*;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CClientProxy extends CCommonProxy {
	public static String questmenu = "coucou";
	public CClientProxy() {
		MinecraftForge.EVENT_BUS.register(this);
	}
	@Override
	public void preInit() {
		super.preInit();
		MinecraftForge.EVENT_BUS.register(ModItems.INSTANCE);
		MinecraftForge.EVENT_BUS.register(ModBlocks.INSTANCE);
	}
	@Override
	public void init() {
		super.init();
	}
	@Override
	public void postInit() {
		super.postInit();
	}
	/*@SubscribeEvent
	public void onInitGuiEvent(GuiScreenEvent.InitGuiEvent.Post event) {
		if(event.getGui() instanceof GuiMainMenu) {
			for (Object b : event.getButtonList()) {
				if (((GuiButton) b).id == 1) {
					((GuiButton) b).visible = false;
				} else if (((GuiButton) b).id == 2) {
					((GuiButton) b).visible = false;
				} else if (((GuiButton) b).id == 14) {
					((GuiButton) b).visible = false;
				} else if (((GuiButton) b).id == 6) {
					((GuiButton) b).visible = false;
				}
			}
			int i =
					event.getGui().height / 4 + 48;
			event.getButtonList().add(new GuiButton(41, event.getGui().width / 2 - 100, i + 24 * 1, "Se connecter A CodCraft") {
				@Override
				public void mouseReleased(int x, int y) {
					FMLClientHandler.instance().connectToServerAtStartup("vps707035.ovh.net", 25565);
				}
			});
		}
	}*/
	public void CQUESTGUIMENU(){
		CQuest.QuestGui(questmenu);
	}
}