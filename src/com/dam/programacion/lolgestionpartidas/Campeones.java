package com.dam.programacion.lolgestionpartidas;

import java.util.ArrayList;

public class Campeones {

    private static  String nameChampion;
    private static ArrayList <String> nameChampionsList = new ArrayList<>();



    public  static ArrayList <String> giveValueListChampions(){

        nameChampion = "Ashe";
        nameChampionsList.add(nameChampion);
        nameChampion = "Ahri";
        nameChampionsList.add(nameChampion);
        nameChampion = "Yashuo";
        nameChampionsList.add(nameChampion);
        nameChampion = "Zed";
        nameChampionsList.add(nameChampion);
        nameChampion = "Lee Sin";
        nameChampionsList.add(nameChampion);
        nameChampion = "Jynx";
        nameChampionsList.add(nameChampion);
        nameChampion = "Thresh";
        nameChampionsList.add(nameChampion);
        nameChampion = "Darius";
        nameChampionsList.add(nameChampion);
        nameChampion = "Garen";
        nameChampionsList.add(nameChampion);
        nameChampion = "Teemo";
        nameChampionsList.add(nameChampion);
        return nameChampionsList;
    }


}
