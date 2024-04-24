package com.dam.programacion.lolgestionInformacionPartidas;

import com.dam.programacion.lolgestionpartidas.AsignacionRoles;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class InformacionJugador2 {

    public static String saveInformationPlayer2(HashMap<String, ArrayList<String>> player2AndChampions,
                                                HashMap<String, String> player2ChampionsRoles, HashMap<String, String> player2ChampionsFormation) {

        String nameBattle = AsignacionRoles.enterJLabelPlayer2() + ".txt";
        HashMap<String, ArrayList<String>> auxplayer1AndChampions = findChampionsPlayer2(player2AndChampions);


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nameBattle))) {
            writer.write(auxplayer1AndChampions.toString());
            writer.write(player2ChampionsRoles.toString());
            writer.write(player2ChampionsFormation.toString());
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido escribir los datos del jugador 1");
        }


        return nameBattle;
    }

    protected static HashMap <String, ArrayList<String>> findChampionsPlayer2(HashMap<String, ArrayList<String>> player1AndChampions){

        HashMap<String, ArrayList<String>> auxPlayer1AndChampions = new HashMap<>();
        String player2 = AsignacionRoles.enterJLabelPlayer2();
        if(player1AndChampions.containsKey(player2)){
            ArrayList <String> champions = player1AndChampions.get(player2);
            auxPlayer1AndChampions.put(player2, champions);
        }
        return auxPlayer1AndChampions;
    }
}
