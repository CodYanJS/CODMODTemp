package net.codearth.codmod.modules.quest;

import net.minecraft.client.gui.Gui;

public class CQuest{
    CQuest INSTANCE = new CQuest();
    public static void init(){
        registerQuest();
        System.out.println("CQUest Activee");
    }
    public static void registerQuest(){
        registerQuests();
    }
    public static void registerQuests(){

    }
    public static void QuestGui(String questmenu) {
        if(questmenu.equals("coucou")) {
            init();
        }
    }
}
