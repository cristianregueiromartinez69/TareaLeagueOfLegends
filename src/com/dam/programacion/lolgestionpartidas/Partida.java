package com.dam.programacion.lolgestionpartidas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dam.programacion.lol.metodosimagenespartida.*;

public class Partida extends JFrame {

    private JPanel centerPanel;
    private static JPanel globalPanelPlayer1;
    private JPanel versusPanel;
    private static JPanel globalPanelPlayer2;
    private JPanel confirmPanel;

    //estos paneles van dentro del globalpanelplayer1
    private JPanel champion1Player1;
    private JPanel champion2Player1;
    private JPanel champion3Player1;
    private JPanel champion4Player1;
    private JPanel champion5Player1;

    //estos paneles van dentro del globalpanelplayer2
    private JPanel champion1Player2;
    private JPanel champion2Player2;
    private JPanel champion3Player2;
    private JPanel champion4Player2;
    private JPanel champion5Player2;

    //esto va en el globalPanelPlayer1
    private JLabel playerNameIndicator1;

    //esto va dentro de champion1Player1
    private JLabel championName1PLayer1;
    private JLabel player1Champion1Role;
    private JLabel player1Champion1Formation;
    private Image imagePlayer1ChampionName1;
    private ImageIcon imageIconPLayer1ChampionName1;

    //esto va dentro de champion2Player1
    private JLabel championName2PLayer1;
    private JLabel player1Champion2Role;
    private JLabel player1Champion2Formation;
    private Image imagePlayer1ChampionName2;
    private ImageIcon imageIconPLayer1ChampionName2;

    //esto va dentro de champion3Player1
    private JLabel championName3PLayer1;
    private JLabel player1Champion3Role;
    private JLabel player1Champion3Formation;
    private Image imagePlayer1ChampionName3;
    private ImageIcon imageIconPLayer1ChampionName3;

    //esto va dentro de champion4Player1
    private JLabel championName4PLayer1;
    private JLabel player1Champion4Role;
    private JLabel player1Champion4Formation;
    private Image imagePlayer1ChampionName4;
    private ImageIcon imageIconPLayer1ChampionName4;

    //esto va dentro de champion5Player1
    private JLabel championName5PLayer1;
    private JLabel player1Champion5Role;
    private JLabel player1Champion5Formation;
    private Image imagePlayer1ChampionName5;
    private ImageIcon imageIconPLayer1ChampionName5;

    //--------------------------------------------------------
    //esto va en el globalPanelPlayer2
    private JLabel playerNameIndicator2;

    //esto va dentro de champion1Player2
    private JLabel championName1PLayer2;
    private JLabel player2Champion1Role;
    private JLabel player2Champion1Formation;
    private Image imagePlayer2ChampionName1;
    private ImageIcon imageIconPLayer2ChampionName1;

    //esto va dentro de champion2Player2
    private JLabel championName2PLayer2;
    private JLabel player2Champion2Role;
    private JLabel player2Champion2Formation;
    private Image imagePlayer2ChampionName2;
    private ImageIcon imageIconPLayer2ChampionName2;

    //esto va dentro de champion3Player2
    private JLabel championName3PLayer2;
    private JLabel player2Champion3Role;
    private JLabel player2Champion3Formation;
    private Image imagePlayer2ChampionName3;
    private ImageIcon imageIconPLayer2ChampionName3;

    //esto va dentro de champion4Player2
    private JLabel championName4PLayer2;
    private JLabel player2Champion4Role;
    private JLabel player2Champion4Formation;
    private Image imagePlayer2ChampionName4;
    private ImageIcon imageIconPLayer2ChampionName4;

    //esto va dentro de champion5Player2
    private JLabel championName5PLayer2;
    private JLabel player2Champion5Role;
    private JLabel player2Champion5Formation;
    private Image imagePlayer2ChampionName5;
    private ImageIcon imageIconPLayer2ChampionName5;

    //esto va dentro del versusPanel
    private Image versusImage;
    private ImageIcon versusImageIcon;

    //esto va dentro del confirmPanel
    private JButton confirmButton;
    AsignacionRoles myAsignation = new AsignacionRoles();

    public Partida() {

        setTitle("Partida");
        setVisible(true);
        setBounds(600, 600, 600, 600);
        //añadiendo el panel central
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBackground(Color.BLUE.darker().darker());
        add(centerPanel);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);

        //añadiendo el globalPanelPlayer 1
        globalPanelPlayer1 = new JPanel();
        globalPanelPlayer1.setLayout(new BoxLayout(globalPanelPlayer1, BoxLayout.Y_AXIS));
        globalPanelPlayer1.setBackground(Color.ORANGE.darker());
        centerPanel.add(globalPanelPlayer1, gbc);

        //añadiendo el champion1PLayer1 al globalPanelplayer1
        champion1Player1 = new JPanel();
        champion1Player1.setLayout(new BoxLayout(champion1Player1, BoxLayout.Y_AXIS));
        champion1Player1.setBackground(null);
        globalPanelPlayer1.add(champion1Player1);

        //añadiendo el champion2PLayer1 al globalPanelplayer1
        champion2Player1 = new JPanel();
        champion2Player1.setLayout(new BoxLayout(champion2Player1, BoxLayout.Y_AXIS));
        champion2Player1.setBackground(null);
        globalPanelPlayer1.add(champion2Player1);

        //añadiendo el champion3PLayer1 al globalPanelplayer1
        champion3Player1 = new JPanel();
        champion3Player1.setLayout(new BoxLayout(champion3Player1, BoxLayout.Y_AXIS));
        champion3Player1.setBackground(null);
        globalPanelPlayer1.add(champion3Player1);

        //añadiendo el champion4PLayer1 al globalPanelplayer1
        champion4Player1 = new JPanel();
        champion4Player1.setLayout(new BoxLayout(champion4Player1, BoxLayout.Y_AXIS));
        champion4Player1.setBackground(null);
        globalPanelPlayer1.add(champion4Player1);

        //añadiendo el champion5PLayer1 al globalPanelplayer1
        champion5Player1 = new JPanel();
        champion5Player1.setLayout(new BoxLayout(champion5Player1, BoxLayout.Y_AXIS));
        champion5Player1.setBackground(null);
        globalPanelPlayer1.add(champion5Player1);

        //--------------------------------------------------------------
        gbc.gridx = 4;
        gbc.gridy = 0;
        //añadiendo el globalPanelPlayer2
        globalPanelPlayer2 = new JPanel();
        globalPanelPlayer2.setLayout(new BoxLayout(globalPanelPlayer2, BoxLayout.Y_AXIS));
        globalPanelPlayer2.setBackground(Color.ORANGE.darker());
        centerPanel.add(globalPanelPlayer2, gbc);

        //añadiendo el champion1PLayer2 al globalPanelplayer2
        champion1Player2 = new JPanel();
        champion1Player2.setLayout(new BoxLayout(champion1Player2, BoxLayout.Y_AXIS));
        champion1Player2.setBackground(null);
        globalPanelPlayer2.add(champion1Player2);

        //añadiendo el champion2PLayer2 al globalPanelplayer2
        champion2Player2 = new JPanel();
        champion2Player2.setLayout(new BoxLayout(champion2Player2, BoxLayout.Y_AXIS));
        champion2Player2.setBackground(null);
        globalPanelPlayer2.add(champion2Player2);

        //añadiendo el champion3PLayer2 al globalPanelplayer2
        champion3Player2 = new JPanel();
        champion3Player2.setLayout(new BoxLayout(champion3Player2, BoxLayout.Y_AXIS));
        champion3Player2.setBackground(null);
        globalPanelPlayer2.add(champion3Player2);

        //añadiendo el champion4PLayer2 al globalPanelplayer2
        champion4Player2 = new JPanel();
        champion4Player2.setLayout(new BoxLayout(champion4Player2, BoxLayout.Y_AXIS));
        champion4Player2.setBackground(null);
        globalPanelPlayer2.add(champion4Player2);

        //añadiendo el champion5PLayer2 al globalPanelplayer2
        champion5Player2 = new JPanel();
        champion5Player2.setLayout(new BoxLayout(champion5Player2, BoxLayout.Y_AXIS));
        champion5Player2.setBackground(null);
        globalPanelPlayer2.add(champion5Player2);

        //añadiendo el versusPanel
        gbc.gridx = 2;
        gbc.gridy = 0;
        versusPanel = new JPanel();
        versusPanel.setLayout(new BoxLayout(versusPanel, BoxLayout.X_AXIS));
        centerPanel.add(versusPanel, gbc);

        //añadiendo el confirmPanel
        gbc.gridx = 2;
        gbc.gridy = 1;
        confirmPanel = new JPanel();
        confirmPanel.setLayout(new GridBagLayout());
        centerPanel.add(confirmPanel, gbc);

        //añadiendo cosas al globalPanelPlayer1
        playerNameIndicator1 = new JLabel("Player: " + myAsignation.enterJLabelPlayer1());
        playerNameIndicator1.setForeground(Color.WHITE);
        globalPanelPlayer1.add(playerNameIndicator1);

        //añadiendo cosas al champion1Player1
        championName1PLayer1 = new JLabel();
        championName1PLayer1.setText("Campeon: " + ExtraccionMetodosPartidaJugador1.championsName1Player1(AsignacionRoles.getRolsChampionsPLayer1()));
        champion1Player1.add(championName1PLayer1);
        player1Champion1Role = new JLabel();
        player1Champion1Role.setText("Rol: " + ExtraccionMetodosPartidaJugador1.championsName1RolePlayer1(AsignacionRoles.getRolsChampionsPLayer1()));
        champion1Player1.add(player1Champion1Role);
        player1Champion1Formation = new JLabel();
        player1Champion1Formation.setText("Formacion: " + ExtraccionMetodosPartidaJugador1.championsName1FormationPlayer1(FormacionEquipo.getChampionsWithFormationPlayer1()));
        champion1Player1.add(player1Champion1Formation);
        JLabel putImageChampion1Player1 = new JLabel();
        putImageChampion1Player1 = ExtraccionImagenesPartidaJugador1.createImageLabelChampion1Player1(ExtraccionMetodosPartidaJugador1.championsName1Player1(AsignacionRoles.getRolsChampionsPLayer1()) + ".png");
        champion1Player1.add(putImageChampion1Player1);

        //añadiendo cosas al champion2Player1

        championName2PLayer1 = new JLabel();
        championName2PLayer1.setText("Campeon: " + ExtraccionMetodosPartidaJugador1.championsName2Player1(AsignacionRoles.getRolsChampionsPLayer1()));
        champion2Player1.add(championName2PLayer1);
        player1Champion2Role = new JLabel();
        player1Champion2Role.setText("Rol: " + ExtraccionMetodosPartidaJugador1.championsName2RolPlayer1(AsignacionRoles.getRolsChampionsPLayer1()));
        champion2Player1.add(player1Champion2Role);
        player1Champion2Formation = new JLabel();
        player1Champion2Formation.setText("Formacion: " + ExtraccionMetodosPartidaJugador1.championsName2FormationPlayer1(FormacionEquipo.getChampionsWithFormationPlayer1()));
        champion2Player1.add(player1Champion2Formation);
        JLabel putImageChampion2Player1 = new JLabel();
        putImageChampion2Player1 = ExtraccionImagenesPartidaJugador1.createImageLabelChampion2Player1(ExtraccionMetodosPartidaJugador1.championsName2Player1(AsignacionRoles.getRolsChampionsPLayer1()) + ".png");
        champion2Player1.add(putImageChampion2Player1);

        //añadiendo cosas al champion3Player1

        championName3PLayer1 = new JLabel();
        championName3PLayer1.setText("Campeon: " + ExtraccionMetodosPartidaJugador1.championsName3Player1(AsignacionRoles.getRolsChampionsPLayer1()));
        champion3Player1.add(championName3PLayer1);
        player1Champion3Role = new JLabel();
        player1Champion3Role.setText("Rol: " + ExtraccionMetodosPartidaJugador1.championsName3RolPlayer1(AsignacionRoles.getRolsChampionsPLayer1()));
        champion3Player1.add(player1Champion3Role);
        player1Champion3Formation = new JLabel();
        player1Champion3Formation.setText("Formacion: " + ExtraccionMetodosPartidaJugador1.championsName3FormationPlayer1(FormacionEquipo.getChampionsWithFormationPlayer1()));
        champion3Player1.add(player1Champion3Formation);
        JLabel putImageChampion3Player1 = new JLabel();
        putImageChampion3Player1 = ExtraccionImagenesPartidaJugador1.createImageLabelChampion3Player1(ExtraccionMetodosPartidaJugador1.championsName3Player1(AsignacionRoles.getRolsChampionsPLayer1()) + ".png");
        champion3Player1.add(putImageChampion3Player1);

        //añadiendo cosas al champion4Player1

        championName4PLayer1 = new JLabel();
        championName4PLayer1.setText("Campeon: " + ExtraccionMetodosPartidaJugador1.championsName4Player1(AsignacionRoles.getRolsChampionsPLayer1()));
        champion4Player1.add(championName4PLayer1);
        player1Champion4Role = new JLabel();
        player1Champion4Role.setText("Rol: " + ExtraccionMetodosPartidaJugador1.championsName4RolPlayer1(AsignacionRoles.getRolsChampionsPLayer1()));
        champion4Player1.add(player1Champion4Role);
        player1Champion4Formation = new JLabel();
        player1Champion4Formation.setText("Formacion: " + ExtraccionMetodosPartidaJugador1.championsName4FormationPlayer1(FormacionEquipo.getChampionsWithFormationPlayer1()));
        champion4Player1.add(player1Champion4Formation);
        JLabel putImageChampion4Player1 = new JLabel();
        putImageChampion4Player1 = ExtraccionImagenesPartidaJugador1.createImageLabelChampion4Player1(ExtraccionMetodosPartidaJugador1.championsName4Player1(AsignacionRoles.getRolsChampionsPLayer1()) + ".png");
        champion4Player1.add(putImageChampion4Player1);

        //añadiendo cosas al champion5Player1

        championName5PLayer1 = new JLabel();
        championName5PLayer1.setText("Campeon: " + ExtraccionMetodosPartidaJugador1.championsName5Player1(AsignacionRoles.getRolsChampionsPLayer1()));
        champion5Player1.add(championName5PLayer1);
        player1Champion5Role = new JLabel();
        player1Champion5Role.setText("Rol: " + ExtraccionMetodosPartidaJugador1.championsName5RolPlayer1(AsignacionRoles.getRolsChampionsPLayer1()));
        champion5Player1.add(player1Champion5Role);
        player1Champion5Formation = new JLabel();
        player1Champion5Formation.setText("Formacion: " + ExtraccionMetodosPartidaJugador1.championsName5FormationPlayer1(FormacionEquipo.getChampionsWithFormationPlayer1()));
        champion5Player1.add(player1Champion5Formation);
        JLabel putImageChampion5Player1 = new JLabel();
        putImageChampion5Player1 = ExtraccionImagenesPartidaJugador1.createImageLabelChampion5Player1(ExtraccionMetodosPartidaJugador1.championsName5Player1(AsignacionRoles.getRolsChampionsPLayer1()) + ".png");
        champion5Player1.add(putImageChampion5Player1);

        //------------------------------------------------//

        //añadiendo cosas al globalPanelPlayer2
        playerNameIndicator2 = new JLabel("Player: " + myAsignation.enterJLabelPlayer2());
        playerNameIndicator2.setForeground(Color.WHITE);
        globalPanelPlayer2.add(playerNameIndicator2);

        //añadiendo cosas al champion1Player1
        championName1PLayer2 = new JLabel();
        championName1PLayer2.setText("Campeon: " + ExtraccionMetodosPartidaJugador2.championsName1Player2(AsignacionRoles.getRolsChampionsPLayer2()));
        champion1Player2.add(championName1PLayer2);
        player2Champion1Role = new JLabel();
        player2Champion1Role.setText("Rol: " + ExtraccionMetodosPartidaJugador2.championsName1RolePlayer2(AsignacionRoles.getRolsChampionsPLayer2()));
        champion1Player2.add(player2Champion1Role);
        player2Champion1Formation = new JLabel();
        player2Champion1Formation.setText("Formacion: " + ExtraccionMetodosPartidaJugador2.championsName1FormationPlayer2(FormacionEquipo.getChampionsWithFormationPlayer2()));
        champion1Player2.add(player2Champion1Formation);
        JLabel putImageChampion1Player2 = new JLabel();
        putImageChampion1Player2 = ExtraccionImagenesPartidaJugador2.createImageLabelChampion1Player2(ExtraccionMetodosPartidaJugador2.championsName1Player2(AsignacionRoles.getRolsChampionsPLayer2()) + ".png");
        champion1Player2.add(putImageChampion1Player2);

        //añadiendo cosas al champion2Player1

        championName2PLayer2 = new JLabel();
        championName2PLayer2.setText("Campeon: " + ExtraccionMetodosPartidaJugador2.championsName2Player2(AsignacionRoles.getRolsChampionsPLayer2()));
        champion2Player2.add(championName2PLayer2);
        player2Champion2Role = new JLabel();
        player2Champion2Role.setText("Rol: " + ExtraccionMetodosPartidaJugador2.championsName2RolPlayer2(AsignacionRoles.getRolsChampionsPLayer2()));
        champion2Player2.add(player2Champion2Role);
        player2Champion2Formation = new JLabel();
        player2Champion2Formation.setText("Formacion: " + ExtraccionMetodosPartidaJugador2.championsName2FormationPlayer2(FormacionEquipo.getChampionsWithFormationPlayer2()));
        champion2Player2.add(player2Champion2Formation);
        JLabel putImageChampion2Player2 = new JLabel();
        putImageChampion2Player2 = ExtraccionImagenesPartidaJugador2.createImageLabelChampion2Player2(ExtraccionMetodosPartidaJugador2.championsName2Player2(AsignacionRoles.getRolsChampionsPLayer2()) + ".png");
        champion2Player2.add(putImageChampion2Player2);

        //añadiendo cosas al champion3Player1

        championName3PLayer2 = new JLabel();
        championName3PLayer2.setText("Campeon: " + ExtraccionMetodosPartidaJugador2.championsName3Player2(AsignacionRoles.getRolsChampionsPLayer2()));
        champion3Player2.add(championName3PLayer2);
        player2Champion3Role = new JLabel();
        player2Champion3Role.setText("Rol: " + ExtraccionMetodosPartidaJugador2.championsName3RolPlayer2(AsignacionRoles.getRolsChampionsPLayer2()));
        champion3Player2.add(player2Champion3Role);
        player2Champion3Formation = new JLabel();
        player2Champion3Formation.setText("Formacion: " + ExtraccionMetodosPartidaJugador2.championsName3FormationPlayer2(FormacionEquipo.getChampionsWithFormationPlayer2()));
        champion3Player2.add(player2Champion3Formation);
        JLabel putImageChampion3Player2 = new JLabel();
        putImageChampion3Player2 = ExtraccionImagenesPartidaJugador2.createImageLabelChampion3Player2(ExtraccionMetodosPartidaJugador2.championsName3Player2(AsignacionRoles.getRolsChampionsPLayer2()) + ".png");
        champion3Player2.add(putImageChampion3Player2);

        //añadiendo cosas al champion4Player1

        championName4PLayer2 = new JLabel();
        championName4PLayer2.setText("Campeon: " + ExtraccionMetodosPartidaJugador2.championsName4Player2(AsignacionRoles.getRolsChampionsPLayer2()));
        champion4Player2.add(championName4PLayer2);
        player2Champion4Role = new JLabel();
        player2Champion4Role.setText("Rol: " + ExtraccionMetodosPartidaJugador2.championsName4RolPlayer2(AsignacionRoles.getRolsChampionsPLayer2()));
        champion4Player2.add(player2Champion4Role);
        player2Champion4Formation = new JLabel();
        player2Champion4Formation.setText("Formacion: " + ExtraccionMetodosPartidaJugador2.championsName4FormationPlayer2(FormacionEquipo.getChampionsWithFormationPlayer2()));
        champion4Player2.add(player2Champion4Formation);
        JLabel putImageChampion4Player2 = new JLabel();
        putImageChampion4Player2 = ExtraccionImagenesPartidaJugador2.createImageLabelChampion4Player2(ExtraccionMetodosPartidaJugador2.championsName4Player2(AsignacionRoles.getRolsChampionsPLayer2()) + ".png");
        champion4Player2.add(putImageChampion4Player2);

        //añadiendo cosas al champion5Player1

        championName5PLayer2 = new JLabel();
        championName5PLayer2.setText("Campeon: " + ExtraccionMetodosPartidaJugador2.championsName5Player2(AsignacionRoles.getRolsChampionsPLayer2()));
        champion5Player2.add(championName5PLayer2);
        player2Champion5Role = new JLabel();
        player2Champion5Role.setText("Rol: " + ExtraccionMetodosPartidaJugador2.championsName5RolPlayer2(AsignacionRoles.getRolsChampionsPLayer2()));
        champion5Player2.add(player2Champion5Role);
        player2Champion5Formation = new JLabel();
        player2Champion5Formation.setText("Formacion: " + ExtraccionMetodosPartidaJugador2.championsName5FormationPlayer2(FormacionEquipo.getChampionsWithFormationPlayer2()));
        champion5Player2.add(player2Champion5Formation);
        JLabel putImageChampion5Player2 = new JLabel();
        putImageChampion5Player2 = ExtraccionImagenesPartidaJugador2.createImageLabelChampion5Player2(ExtraccionMetodosPartidaJugador2.championsName5Player2(AsignacionRoles.getRolsChampionsPLayer2()) + ".png");
        champion5Player2.add(putImageChampion5Player2);

        //Añadiendo versus al versusPanel
        JLabel versusLabel = new JLabel();
        versusLabel = MetodoVersusClasePartida.createImageLabelVersusBothPlayers("versus.png");
        versusPanel.add(versusLabel);
        confirmButton = new JButton("Jugar Batalla");
        confirmButton.setBackground(Color.GREEN);
        confirmButton.setForeground(Color.WHITE);
        confirmPanel.add(confirmButton);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PantallaCargaPartida();
                dispose();
            }
        });


    }

    public JPanel getGlobalPanelPlayer1() {
        return globalPanelPlayer1;
    }

    public void setGlobalPanelPlayer1(JPanel globalPanelPlayer1) {
        Partida.globalPanelPlayer1 = globalPanelPlayer1;
    }

    public JPanel getGlobalPanelPlayer2() {
        return globalPanelPlayer2;
    }

    public void setGlobalPanelPlayer2(JPanel globalPanelPlayer2) {
        Partida.globalPanelPlayer2 = globalPanelPlayer2;
    }
    public static JPanel winPlayer(int poitsChampPlayer1, int poitnsChampPlayer2){

        if (poitsChampPlayer1 >  poitnsChampPlayer2){
            return globalPanelPlayer1;
        }
        else if(poitsChampPlayer1 < poitnsChampPlayer2){
            return globalPanelPlayer2;
        }

       return null;
    }
}
