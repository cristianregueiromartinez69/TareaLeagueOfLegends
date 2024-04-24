package com.dam.programacion.lol.metodosimagenespartida;

import com.dam.programacion.lolgestionpartidas.AsignacionRoles;
import com.dam.programacion.lolgestionpartidas.Campeones;
import com.dam.programacion.lolgestionpartidas.Partida;
import com.dam.programacion.lolgestionpartidas.SeleccionDePersonajes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public static JPanel returnWinPlayerPanel(){
        JPanel winPanel = new JPanel();
        int valuePoinstPlayer1 = 0;
        int valuePointsPlayer2 = 0;
        HashMap<String, Integer> player1 = GestionVictoriaPartidas.winBattlePlayer1(Campeones.getChampionsValues(), SeleccionDePersonajes.getPlayersWithChampions());
        for (Map.Entry<String, Integer> entry : player1.entrySet()) {

            Integer value = entry.getValue();
            valuePoinstPlayer1+=value;

        }

        HashMap<String, Integer> player2 = GestionVictoriaPartidas.winBattlePlayer2(Campeones.getChampionsValues(), SeleccionDePersonajes.getPlayersWithChampions());

        for (Map.Entry<String, Integer> entry : player2.entrySet()) {

            Integer value = entry.getValue();
            valuePointsPlayer2+=value;

        }

        if(valuePoinstPlayer1 > valuePointsPlayer2){
            winPanel = Partida.getGlobalPanelPlayer1();
        }
        else{
            winPanel = Partida.getGlobalPanelPlayer2();
        }

        return winPanel;
    }

}
