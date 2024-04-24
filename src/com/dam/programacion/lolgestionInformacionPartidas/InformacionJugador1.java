package com.dam.programacion.lolgestionInformacionPartidas;


import com.dam.programacion.lolgestionpartidas.AsignacionRoles;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class InformacionJugador1 {


    public static String saveInformationPlayer1(HashMap<String, ArrayList<String>> player1AndChampions,
                                                HashMap<String, String> player1ChampionsRoles, HashMap<String, String> player1ChampionsFormation) {

        String nameBattle = AsignacionRoles.enterJLabelPlayer1() + ".txt";
        HashMap<String, ArrayList<String>> auxplayer1AndChampions = findChampionsPlayer1(player1AndChampions);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nameBattle))) {
            writer.write(auxplayer1AndChampions.toString());
            writer.write(player1ChampionsRoles.toString());
            writer.write(player1ChampionsFormation.toString());
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido escribir los datos del jugador 1");
        }


        return nameBattle;
    }

    protected static HashMap <String, ArrayList<String>> findChampionsPlayer1(HashMap<String, ArrayList<String>> player1AndChampions){

        HashMap<String, ArrayList<String>> auxPlayer1AndChampions = new HashMap<>();
        String player1 = AsignacionRoles.enterJLabelPlayer1();
        if(player1AndChampions.containsKey(player1)){
            ArrayList <String> champions = player1AndChampions.get(player1);
            auxPlayer1AndChampions.put(player1, champions);
        }
        return auxPlayer1AndChampions;
    }




}



