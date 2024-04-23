package com.dam.programacion.lol.metodosimagenespartida;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExtraccionMetodosPartidaJugador2 {
    //metodos para obtener el nombre, rol y formacion del campeon 1 del jugador 2

    public static String championsName1Player2(HashMap<String, String> auxPlayersWithAll) {
        String primerElemento = null;
        for (Map.Entry<String, String> entry : auxPlayersWithAll.entrySet()) {
            primerElemento = entry.getKey();
            break;
        }
        return primerElemento;
    }

    public static String championsName1RolePlayer2(HashMap<String, String> auxPlayersWithAll) {
        String primerElemento = null;
        for (Map.Entry<String, String> entry : auxPlayersWithAll.entrySet()) {
            primerElemento = entry.getValue();
            break;
        }
        return primerElemento;
    }

    public static String championsName1FormationPlayer2(HashMap<String, String> auxPlayersWithAll) {
        String primerElemento = null;
        for (Map.Entry<String, String> entry : auxPlayersWithAll.entrySet()) {
            primerElemento = entry.getValue();
            break;
        }
        return primerElemento;
    }

    //metodos para obtener el nombre, rol y formacion del campeon 2 del jugador 2

    public static String championsName2Player2(HashMap<String, String> auxPlayersWithAll) {
        Iterator<Map.Entry<String, String>> iterator = auxPlayersWithAll.entrySet().iterator();
        String segundoElemento = null;
        for (int i = 0; i < 2; i++) {
            if (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                segundoElemento = entry.getKey();
            } else {

                return null;
            }
        }
        return segundoElemento;
    }


    public static String championsName2RolPlayer2(HashMap<String, String> auxPlayersWithAll) {
        Iterator<Map.Entry<String, String>> iterator = auxPlayersWithAll.entrySet().iterator();
        String segundoElemento = null;
        for (int i = 0; i < 2; i++) {
            if (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                segundoElemento = entry.getKey();
            } else {

                return null;
            }
        }
        return segundoElemento;
    }

    public static String championsName2FormationPlayer2(HashMap<String, String> auxPlayersWithAll) {
        Iterator<Map.Entry<String, String>> iterator = auxPlayersWithAll.entrySet().iterator();
        String segundoElemento = null;
        for (int i = 0; i < 2; i++) {
            if (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                segundoElemento = entry.getKey();
            } else {

                return null;
            }
        }
        return segundoElemento;
    }

    //metodos para obtener el nombre, rol y formacion del campeon 3 del jugador 2

    public static String championsName3Player2(HashMap<String, String> auxPlayersWithAll) {
        Iterator<Map.Entry<String, String>> iterator = auxPlayersWithAll.entrySet().iterator();
        String tercerElemento = null;
        for (int i = 0; i < 3; i++) {
            if (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                tercerElemento = entry.getKey();
            } else {

                return null;
            }
        }
        return tercerElemento;
    }


    public static String championsName3RolPlayer2(HashMap<String, String> auxPlayersWithAll) {
        Iterator<Map.Entry<String, String>> iterator = auxPlayersWithAll.entrySet().iterator();
        String tercerElemento = null;
        for (int i = 0; i < 3; i++) {
            if (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                tercerElemento = entry.getKey();
            } else {

                return null;
            }
        }
        return tercerElemento;
    }

    public static String championsName3FormationPlayer2(HashMap<String, String> auxPlayersWithAll) {
        Iterator<Map.Entry<String, String>> iterator = auxPlayersWithAll.entrySet().iterator();
        String tercerElemento = null;
        for (int i = 0; i < 3; i++) {
            if (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                tercerElemento = entry.getKey();
            } else {

                return null;
            }
        }
        return tercerElemento;
    }

    //metodos para obtener el nombre, rol y formacion del campeon 4 del jugador 2

    public static String championsName4Player2(HashMap<String, String> auxPlayersWithAll) {
        Iterator<Map.Entry<String, String>> iterator = auxPlayersWithAll.entrySet().iterator();
        String cuartoElemento = null;
        for (int i = 0; i < 4; i++) {
            if (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                cuartoElemento = entry.getKey();
            } else {

                return null;
            }
        }
        return cuartoElemento;
    }


    public static String championsName4RolPlayer2(HashMap<String, String> auxPlayersWithAll) {
        Iterator<Map.Entry<String, String>> iterator = auxPlayersWithAll.entrySet().iterator();
        String cuartoElemento = null;
        for (int i = 0; i < 4; i++) {
            if (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                cuartoElemento = entry.getKey();
            } else {

                return null;
            }
        }
        return cuartoElemento;
    }

    public static String championsName4FormationPlayer2(HashMap<String, String> auxPlayersWithAll) {
        Iterator<Map.Entry<String, String>> iterator = auxPlayersWithAll.entrySet().iterator();
        String cuartoElemento = null;
        for (int i = 0; i < 4; i++) {
            if (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                cuartoElemento = entry.getKey();
            } else {

                return null;
            }
        }
        return cuartoElemento;
    }

    //metodos para obtener el nombre, rol y formacion del campeon 5 del jugador 2

    public static String championsName5Player2(HashMap<String, String> auxPlayersWithAll) {
        Iterator<Map.Entry<String, String>> iterator = auxPlayersWithAll.entrySet().iterator();
        String quintoElemento = null;
        for (int i = 0; i < 5; i++) {
            if (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                quintoElemento = entry.getKey();
            } else {

                return null;
            }
        }
        return quintoElemento;
    }


    public static String championsName5RolPlayer2(HashMap<String, String> auxPlayersWithAll) {
        Iterator<Map.Entry<String, String>> iterator = auxPlayersWithAll.entrySet().iterator();
        String quintoElemento = null;
        for (int i = 0; i < 5; i++) {
            if (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                quintoElemento = entry.getKey();
            } else {

                return null;
            }
        }
        return quintoElemento;
    }

    public static String championsName5FormationPlayer2(HashMap<String, String> auxPlayersWithAll) {
        Iterator<Map.Entry<String, String>> iterator = auxPlayersWithAll.entrySet().iterator();
        String quintoElemento = null;
        for (int i = 0; i < 5; i++) {
            if (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                quintoElemento = entry.getKey();
            } else {

                return null;
            }
        }
        return quintoElemento;
    }



}
