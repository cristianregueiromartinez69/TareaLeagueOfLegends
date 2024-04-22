package com.dam.programacion.lolgestionpartidas;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FormacionEquipo extends JFrame {

    private JPanel centerPanel;
    private JPanel player1Panel;
    private JPanel player2Panel;
    private JPanel teamTrainingPanel1;
    private JPanel teamTrainingPanel2;
    private JPanel confirmPanel;

    private JLabel aliasPLayer1Indicator;
    private JComboBox<String> championsNamePLayer1;
    private String auxNameChampion;
    private JButton championName1Player1Button;
    private JButton championName2Player1Button;
    private JButton championName3Player1Button;
    private JButton championName4Player1Button;
    private JButton championName5Player1Button;

    private JLabel nameFirstTrainingPlayer1;
    private JLabel nameSecondTrainingPlayer1;
    private JLabel nameThirdTrainingPlayer1;
    private JLabel nameFourTrainingPlayer1;
    private JLabel nameFiveTrainingPlayer1;

    private JLabel aliasPLayer2Indicator;
    private JComboBox<String> championsNamePlayer2;
    private JButton championName1Player2Button;
    private JButton championName2Player2Button;
    private JButton championName3Player2Button;
    private JButton championName4Player2Button;
    private JButton championName5Player2Button;

    private JLabel nameFirstTrainingPlayer2;
    private JLabel nameSecondTrainingPlayer2;
    private JLabel nameThirdTrainingPlayer2;
    private JLabel nameFourTrainingPlayer2;
    private JLabel nameFiveTrainingPlayer2;

    private JTextArea confirmAreaPlayer1;
    private JTextArea confirmAreaPlayer2;
    private JButton confirmBothPLayersButton;
    private static HashMap<HashMap<String, ArrayList<String>>, HashMap<String, String>> playersWithAll = new HashMap<>();
    private static HashMap<String, String> championsWithFormationPlayer1 = new HashMap<>();
    private static HashMap<String, String> championsWithFormationPlayer2 = new HashMap<>();

    AsignacionRoles auxObjectAsignation = new AsignacionRoles();

    public FormacionEquipo() {
        setTitle("Formacion del equipo");
        setBounds(600, 600, 600, 600);
        setVisible(true);
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBackground(Color.DARK_GRAY);
        add(centerPanel);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);

        player1Panel = new JPanel();
        player1Panel.setLayout(new GridBagLayout());
        centerPanel.add(player1Panel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;

        player2Panel = new JPanel();
        player2Panel.setLayout(new GridBagLayout());
        centerPanel.add(player2Panel, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;

        teamTrainingPanel1 = new JPanel();
        teamTrainingPanel1.setLayout(new GridBagLayout());
        teamTrainingPanel1.setBorder(setBorderBothPLayers());
        centerPanel.add(teamTrainingPanel1, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;

        teamTrainingPanel2 = new JPanel();
        teamTrainingPanel2.setLayout(new GridBagLayout());
        teamTrainingPanel2.setBorder(setBorderBothPLayers());
        centerPanel.add(teamTrainingPanel2, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;

        confirmPanel = new JPanel();
        confirmPanel.setLayout(new GridBagLayout());
        centerPanel.add(confirmPanel, gbc);


        aliasPLayer1Indicator = new JLabel(SeleccionDePersonajes.getAliasPlayer1Text().getText());
        player1Panel.add(aliasPLayer1Indicator);

        championsNamePLayer1 = new JComboBox<String>(insertChampionsWithRolsPlayer1(AsignacionRoles.getTrainingRolesPlayer1()));
        player1Panel.add(championsNamePLayer1);

        championName1Player1Button = new JButton("Top");
        championName1Player1Button.setBackground(Color.ORANGE);
        championName1Player1Button.setForeground(Color.WHITE);
        player1Panel.add(championName1Player1Button);

        championName2Player1Button = new JButton("Medio");
        championName2Player1Button.setBackground(Color.CYAN);
        championName2Player1Button.setForeground(Color.WHITE);
        player1Panel.add(championName2Player1Button);

        championName3Player1Button = new JButton("Jungla");
        championName3Player1Button.setBackground(Color.PINK);
        championName3Player1Button.setForeground(Color.WHITE);
        player1Panel.add(championName3Player1Button);

        championName4Player1Button = new JButton("Tirador");
        championName4Player1Button.setBackground(Color.BLUE);
        championName4Player1Button.setForeground(Color.WHITE);
        player1Panel.add(championName4Player1Button);

        championName5Player1Button = new JButton("Support");
        championName5Player1Button.setBackground(Color.YELLOW);
        championName5Player1Button.setForeground(Color.WHITE);
        player1Panel.add(championName5Player1Button);

        nameFirstTrainingPlayer1 = new JLabel("TOP: " + auxNameChampion);
        nameFirstTrainingPlayer1.setForeground(Color.CYAN);
        teamTrainingPanel1.add(nameFirstTrainingPlayer1);

        nameSecondTrainingPlayer1 = new JLabel("MEDIO: " + auxNameChampion);
        nameSecondTrainingPlayer1.setForeground(Color.CYAN);
        teamTrainingPanel1.add(nameSecondTrainingPlayer1);

        nameThirdTrainingPlayer1 = new JLabel("JUNGLA: " + auxNameChampion);
        nameThirdTrainingPlayer1.setForeground(Color.CYAN);
        teamTrainingPanel1.add(nameThirdTrainingPlayer1);

        nameFourTrainingPlayer1 = new JLabel("TIRADOR: " + auxNameChampion);
        nameFourTrainingPlayer1.setForeground(Color.CYAN);
        teamTrainingPanel1.add(nameFourTrainingPlayer1);

        nameFiveTrainingPlayer1 = new JLabel("SUPPORT: " + auxNameChampion);
        nameFiveTrainingPlayer1.setForeground(Color.CYAN);
        teamTrainingPanel1.add(nameFiveTrainingPlayer1);
        confirmAreaPlayer1 = new JTextArea();
        confirmAreaPlayer1.setEditable(false);
        confirmAreaPlayer1.setPreferredSize(new Dimension(150, 46));
        confirmPanel.add(confirmAreaPlayer1);


        //-------------------------------------------------------------//

        aliasPLayer2Indicator = new JLabel(SeleccionDePersonajes.getAliasPlayer2Text().getText());
        player2Panel.add(aliasPLayer2Indicator);

        championsNamePlayer2 = new JComboBox<String>(insertChampionsWithRolsPlayer2(AsignacionRoles.getTrainingRolesPlayer2()));
        player2Panel.add(championsNamePlayer2);

        championName1Player2Button = new JButton("Top");
        championName1Player2Button.setBackground(Color.ORANGE);
        championName1Player2Button.setForeground(Color.WHITE);
        player2Panel.add(championName1Player2Button);

        championName2Player2Button = new JButton("Medio");
        championName2Player2Button.setBackground(Color.CYAN);
        championName2Player2Button.setForeground(Color.WHITE);
        player2Panel.add(championName2Player2Button);

        championName3Player2Button = new JButton("Jungla");
        championName3Player2Button.setBackground(Color.PINK);
        championName3Player2Button.setForeground(Color.WHITE);
        player2Panel.add(championName3Player2Button);

        championName4Player2Button = new JButton("Tirador");
        championName4Player2Button.setBackground(Color.BLUE);
        championName4Player2Button.setForeground(Color.WHITE);
        player2Panel.add(championName4Player2Button);

        championName5Player2Button = new JButton("Support");
        championName5Player2Button.setBackground(Color.YELLOW);
        championName5Player2Button.setForeground(Color.WHITE);
        player2Panel.add(championName5Player2Button);

        nameFirstTrainingPlayer2 = new JLabel("TOP: " + auxNameChampion);
        nameFirstTrainingPlayer2.setForeground(Color.CYAN);
        teamTrainingPanel2.add(nameFirstTrainingPlayer2);

        nameSecondTrainingPlayer2 = new JLabel("MEDIO: " + auxNameChampion);
        nameSecondTrainingPlayer2.setForeground(Color.CYAN);
        teamTrainingPanel2.add(nameSecondTrainingPlayer2);

        nameThirdTrainingPlayer2 = new JLabel("JUNGLA: " + auxNameChampion);
        nameThirdTrainingPlayer2.setForeground(Color.CYAN);
        teamTrainingPanel2.add(nameThirdTrainingPlayer2);

        nameFourTrainingPlayer2 = new JLabel("TIRADOR: " + auxNameChampion);
        nameFourTrainingPlayer2.setForeground(Color.CYAN);
        teamTrainingPanel2.add(nameFourTrainingPlayer2);

        nameFiveTrainingPlayer2 = new JLabel("SUPPORT: " + auxNameChampion);
        nameFiveTrainingPlayer2.setForeground(Color.CYAN);
        teamTrainingPanel2.add(nameFiveTrainingPlayer2);
        confirmAreaPlayer2 = new JTextArea();
        confirmAreaPlayer2.setEditable(false);
        confirmAreaPlayer2.setPreferredSize(new Dimension(150, 46));
        confirmPanel.add(confirmAreaPlayer2);
        confirmBothPLayersButton = new JButton("Empezar Partida");
        confirmBothPLayersButton.setBackground(Color.GREEN);
        confirmBothPLayersButton.setForeground(Color.WHITE);
        confirmPanel.add(confirmBothPLayersButton);

        championName1Player1Button.addActionListener(this::establishTeamFormationChampionsPlayer1);
        championName2Player1Button.addActionListener(this::establishTeamFormationChampionsPlayer1);
        championName3Player1Button.addActionListener(this::establishTeamFormationChampionsPlayer1);
        championName4Player1Button.addActionListener(this::establishTeamFormationChampionsPlayer1);
        championName5Player1Button.addActionListener(this::establishTeamFormationChampionsPlayer1);

        championName1Player2Button.addActionListener(this::establishTeamFormationChampionsPlayer2);
        championName2Player2Button.addActionListener(this::establishTeamFormationChampionsPlayer2);
        championName3Player2Button.addActionListener(this::establishTeamFormationChampionsPlayer2);
        championName4Player2Button.addActionListener(this::establishTeamFormationChampionsPlayer2);
        championName5Player2Button.addActionListener(this::establishTeamFormationChampionsPlayer2);
        confirmBothPLayersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                putValuesPlayersWithAll(returnHashMapPlayer1(SeleccionDePersonajes.getPlayersWithChampions()), getChampionsWithFormationPlayer1());
                putValuesPlayersWithAll(returnHashMapPlayer22(SeleccionDePersonajes.getPlayersWithChampions()), getChampionsWithFormationPlayer2());
                new Partida();
                dispose();
            }
        });
    }

    public void establishTeamFormationChampionsPlayer1(ActionEvent e) {
        auxNameChampion = (String) championsNamePLayer1.getSelectedItem();
        if (checkIndexSelectPlayer1()) {
            if (e.getSource() == championName1Player1Button) {
                nameFirstTrainingPlayer1.setText("TOP: " + auxNameChampion);
                confirmAreaPlayer1.setText("Campeon: " + auxNameChampion + "\nAñadido  a Top");
                putValuesChampionsWithFormationPlayer1(auxNameChampion, "Top");

            } else if (e.getSource() == championName2Player1Button) {
                nameSecondTrainingPlayer1.setText("MEDIO: " + auxNameChampion);
                confirmAreaPlayer1.setText("Campeon: " + auxNameChampion + "\nAñadido  a Medio");
                putValuesChampionsWithFormationPlayer1(auxNameChampion, "Medio");
            } else if (e.getSource() == championName3Player1Button) {
                nameThirdTrainingPlayer1.setText("JUNGLA: " + auxNameChampion);
                confirmAreaPlayer1.setText("Campeon: " + auxNameChampion + "\nAñadido  a Jungla");
                putValuesChampionsWithFormationPlayer1(auxNameChampion, "Jungla");
            } else if (e.getSource() == championName4Player1Button) {
                nameFourTrainingPlayer1.setText("TIRADOR : " + auxNameChampion);
                confirmAreaPlayer1.setText("Campeon: " + auxNameChampion + "\nAñadido  a Tirador");
                putValuesChampionsWithFormationPlayer1(auxNameChampion, "Tirador");
            } else if (e.getSource() == championName5Player1Button) {
                nameFiveTrainingPlayer1.setText("SUPPORT: " + auxNameChampion);
                confirmAreaPlayer1.setText("Campeon: " + auxNameChampion + "\nAñadido  a Support");
                putValuesChampionsWithFormationPlayer1(auxNameChampion, "Support");
            }

        }
    }

    public void establishTeamFormationChampionsPlayer2(ActionEvent e) {
        auxNameChampion = (String) championsNamePlayer2.getSelectedItem();
        if (checkIndexSelectPlayer2()) {
            if (e.getSource() == championName1Player2Button) {
                nameFirstTrainingPlayer2.setText("TOP: " + auxNameChampion);
                confirmAreaPlayer2.setText("Campeon: " + auxNameChampion + "\nAñadido  a Top");
                putValuesChampionsWithFormationPlayer2(auxNameChampion, "Top");
            } else if (e.getSource() == championName2Player2Button) {
                nameSecondTrainingPlayer2.setText("MEDIO: " + auxNameChampion);
                confirmAreaPlayer2.setText("Campeon: " + auxNameChampion + "\nAñadido  a Medio");
                putValuesChampionsWithFormationPlayer2(auxNameChampion, "Medio");
            } else if (e.getSource() == championName3Player2Button) {
                nameThirdTrainingPlayer2.setText("JUNGLA: " + auxNameChampion);
                confirmAreaPlayer2.setText("Campeon: " + auxNameChampion + "\nAñadido  a Jungla");
                putValuesChampionsWithFormationPlayer2(auxNameChampion, "Jungla");
            } else if (e.getSource() == championName4Player2Button) {
                nameFourTrainingPlayer2.setText("TIRADOR : " + auxNameChampion);
                confirmAreaPlayer2.setText("Campeon: " + auxNameChampion + "\nAñadido  a Tirador");
                putValuesChampionsWithFormationPlayer2(auxNameChampion, "Tirador");
            } else if (e.getSource() == championName5Player2Button) {
                nameFiveTrainingPlayer2.setText("SUPPORT: " + auxNameChampion);
                confirmAreaPlayer2.setText("Campeon: " + auxNameChampion + "\nAñadido  a Support");
                putValuesChampionsWithFormationPlayer2(auxNameChampion, "Support");
            }
        }
    }


    private DefaultComboBoxModel<String> insertChampionsWithRolsPlayer1(HashMap<String, HashMap<String, String>> auxChampionsRols) {
        String itemForLook = auxObjectAsignation.enterJLabelPlayer1();
        HashMap<String, String> championsRols = auxChampionsRols.get(itemForLook);

        DefaultComboBoxModel<String> championsRolsPlayer1List = new DefaultComboBoxModel<>();


        for (String champion : championsRols.keySet()) {
            championsRolsPlayer1List.addElement(champion);
        }

        return championsRolsPlayer1List;
    }

    private DefaultComboBoxModel<String> insertChampionsWithRolsPlayer2(HashMap<String, HashMap<String, String>> auxChampionsRols) {
        String itemForLook = auxObjectAsignation.enterJLabelPlayer2();
        HashMap<String, String> championsRols = auxChampionsRols.get(itemForLook);


        DefaultComboBoxModel<String> championsRolsPlayer2List = new DefaultComboBoxModel<>();


        for (String champion : championsRols.keySet()) {
            championsRolsPlayer2List.addElement(champion);
        }

        return championsRolsPlayer2List;
    }


    private Border setBorderBothPLayers() {
        Border bordeVacio = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border bordeConColor = BorderFactory.createLineBorder(Color.RED);
        CompoundBorder coumpBorder = new CompoundBorder(bordeVacio, bordeConColor);
        return coumpBorder;
    }

    private Boolean checkIndexSelectPlayer1() {
        int item1 = championsNamePLayer1.getSelectedIndex();


        return item1 != -1;
    }

    private Boolean checkIndexSelectPlayer2() {
        int item1 = championsNamePLayer1.getSelectedIndex();


        return item1 != -1;
    }

    public static HashMap<HashMap<String, ArrayList<String>>, HashMap<String, String>> getPlayersWithAll() {
        return playersWithAll;
    }

    public static void putValuesPlayersWithAll(HashMap<String, ArrayList<String>> keyHashMap, HashMap<String, String> valueHashMap) {
        playersWithAll.put(keyHashMap, valueHashMap);
    }


    public static HashMap<String, String> getChampionsWithFormationPlayer1() {
        return championsWithFormationPlayer1;
    }


    public static void putValuesChampionsWithFormationPlayer1(String key, String value) {
        championsWithFormationPlayer1.put(key, value);
    }

    public static HashMap<String, String> getChampionsWithFormationPlayer2() {
        return championsWithFormationPlayer2;
    }

    public static void putValuesChampionsWithFormationPlayer2(String key, String value) {
        championsWithFormationPlayer2.put(key, value);
    }

    private HashMap<String, ArrayList<String>> returnHashMapPlayer1(HashMap<String, ArrayList<String>> auxMap) {
        String nameForLook = SeleccionDePersonajes.getAliasPlayer1Indictor().getText();

        HashMap<String, ArrayList<String>> resultHashMap = new HashMap<>();
        if(auxMap.containsKey(nameForLook)){
            resultHashMap.putAll((Map<? extends String, ? extends ArrayList<String>>) auxMap.get(nameForLook));
        }



        return resultHashMap;
    }

    private HashMap<String, ArrayList<String>> returnHashMapPlayer22(HashMap<String, ArrayList<String>> auxMap) {
        String nameForLook = SeleccionDePersonajes.getAliasPlayer2Indictor().getText();

        HashMap<String, ArrayList<String>> resultHashMap = new HashMap<>();
        if(auxMap.containsKey(nameForLook)){
            resultHashMap.putAll((Map<? extends String, ? extends ArrayList<String>>) auxMap.get(nameForLook));
        }



        return resultHashMap;
    }



    private HashMap<String, String> returnHashMapPlayer2(HashMap<String, HashMap<String, String>> auxMap) {
        String nameForLook = SeleccionDePersonajes.getAliasPlayer2Indictor().getText();
        HashMap<String, String> mapPlayer2 = auxMap.get(nameForLook);


        HashMap<String, String> resultHashMap = new HashMap<>();


        if (mapPlayer2 != null) {

            resultHashMap.putAll(mapPlayer2);
        }


        return resultHashMap;
    }


}
