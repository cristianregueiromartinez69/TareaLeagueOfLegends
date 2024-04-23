package com.dam.programacion.lolgestionpartidas;

import java.util.ArrayList;
import java.util.HashMap;

public class Campeones {

    private static  String nameChampion;
    private static ArrayList <String> nameChampionsList = new ArrayList<>();
    private static HashMap <String, Integer> championsValues = new HashMap<>();




    public  static ArrayList <String> giveValueListChampions(){

        nameChampion = "Ashe";
        nameChampionsList.add(nameChampion);
        championsValues.put(nameChampion, 200);
        nameChampion = "Ahri";
        nameChampionsList.add(nameChampion);
        championsValues.put(nameChampion, 980);
        nameChampion = "Yashuo";
        nameChampionsList.add(nameChampion);
        championsValues.put(nameChampion, 9888);
        nameChampion = "Zed";
        nameChampionsList.add(nameChampion);
        championsValues.put(nameChampion, 560);
        nameChampion = "Lee Sin";
        nameChampionsList.add(nameChampion);
        championsValues.put(nameChampion, 3400);
        nameChampion = "Jynx";
        nameChampionsList.add(nameChampion);
        championsValues.put(nameChampion, 1300);
        nameChampion = "Thresh";
        nameChampionsList.add(nameChampion);
        championsValues.put(nameChampion, 2350);
        nameChampion = "Darius";
        nameChampionsList.add(nameChampion);
        championsValues.put(nameChampion, 5420);
        nameChampion = "Garen";
        nameChampionsList.add(nameChampion);
        championsValues.put(nameChampion, 10000);
        nameChampion = "Teemo";
        nameChampionsList.add(nameChampion);
        championsValues.put(nameChampion, 120);
        return nameChampionsList;
    }

    public static HashMap<String, Integer> getChampionsValues() {
        return championsValues;
    }



}
