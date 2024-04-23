package com.dam.programacion.lol.metodosimagenespartida;

import com.dam.programacion.lolgestionpartidas.AsignacionRoles;
import com.dam.programacion.lolgestionpartidas.SeleccionDePersonajes;

import java.util.ArrayList;
import java.util.HashMap;

public class GestionVictoriaPartidas {

    public static HashMap<String, Integer> winBattlePlayer1(HashMap<String, Integer> auxChampionsPoints, HashMap<String, ArrayList<String>> auxPlayersWithChampions) {

        HashMap<String, Integer> teamPlayer1 = new HashMap<>();

        int valueChampion;
        String aliasPlayer1 = AsignacionRoles.enterJLabelPlayer1();
        ArrayList<String> champions = auxPlayersWithChampions.get(aliasPlayer1);
        for (String champ : champions) {
            if (auxChampionsPoints.containsKey(champ)) {
                valueChampion = auxChampionsPoints.get(champ);
                teamPlayer1.put(champ, valueChampion);
            }
        }

        return teamPlayer1;
    }

    public static HashMap<String, Integer> winBattlePlayer2(HashMap<String, Integer> auxChampionsPoints, HashMap<String, ArrayList<String>> auxPlayersWithChampions) {

        HashMap<String, Integer> teamPlayer2 = new HashMap<>();

        int valueChampion;
        String aliasPlayer2 = AsignacionRoles.enterJLabelPlayer2();
        ArrayList<String> champions = auxPlayersWithChampions.get(aliasPlayer2);
        for (String champ : champions) {
            if (auxChampionsPoints.containsKey(champ)) {
                valueChampion = auxChampionsPoints.get(champ);
                teamPlayer2.put(champ, valueChampion);
            }
        }


        return teamPlayer2;
    }

}
