package net.codearth.codmod.modules.CodFac;

import net.codearth.codmod.Dependencies.Factions.Factions;

public class MainCF {
    public void facServer(){
        Factions.INSTANCE.func_fac_0001();
    }
    public void saveDB(String user, long date, String members, String facname, String uuid, String membersnumber){
        //TODO: Ajouter un ping request et add dans la db [USERNAME, DATE, MEMBERS, NAME OF FACTION, EMAIL, NUMBER OF MEMBERS].
    }
}
