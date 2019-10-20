package net.codearth.codmod.modules.CodFac;

import net.codearth.codmod.utils.ProfileHelper;
import net.minecraft.client.Minecraft;

public class Faction{
    public static final Faction INSTANCE = new Faction();
    public static final MainCF faction = new MainCF();
    public static String user;
    public static long date;
    public static String members;
    public static String facname;
    public static String uuid;
    public static String membersnumber;
    public void init(){
        faction.facServer();
    }
    public void createFac(){
        faction.saveDB(user, date, members, facname, uuid, membersnumber);
    }
    public void infos(){
        user = ProfileHelper.user;
        date = Minecraft.getSystemTime();
        members = "members";
        facname = "facname";
        uuid = "uuid";
        membersnumber = "membersnumber";
    }
}
