package com.dam.programacion.lolgestionpartidas;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class AsignacionRoles extends JFrame {

    private JPanel centerPanel;
    private JPanel player1Panel;
    private JPanel player2Panel;
    private JPanel confirmPanel;
    private JLabel aliasPlayer1Indicator;
    private JComboBox <String> championsBoxPlayer1;
    private JLabel rolIndicatorPLayer1;
    private JComboBox <String> rolBoxPLayer1;
    private JTable roleAssignmentTablePlayer1;
    private DefaultTableModel modelTablePlayer1;
    private JTextArea confirmAreaPlayer1;
    private JLabel aliasPlayer2Indicator;
    private JComboBox <String> championsBoxPlayer2;
    private DefaultComboBoxModel <String> rolBoxListPLayer2;
    private JLabel rolIndicatorPLayer2;
    private JComboBox <String> rolBoxPLayer2;
    private JTable roleAssignmentTablePLayer2;
    private DefaultTableModel modelTablePlayer2;
    private JTextArea confirmAreaPlayer2;
    private JButton confirmBothPlayers;
    private static HashMap <String, String> rolsChampionsPLayer1 = new HashMap<>();
    private static HashMap <String, String> rolsChampionsPLayer2 = new HashMap<>();
    private static HashMap <String, HashMap<String, String>> trainingRolesPlayer1 = new HashMap<>();
    private static HashMap <String, HashMap<String, String>> trainingRolesPlayer2 = new HashMap<>();





    public  AsignacionRoles(){
        setTitle("Asignacion de roles");
        setBounds(600,600,600,600);
        setVisible(true);
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBackground(Color.lightGray);
        add(centerPanel);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridy = 1;
        gbc.gridx = 0;
        player1Panel = new JPanel();
        player1Panel.setBackground(Color.CYAN);
        player1Panel.setLayout(new GridBagLayout());
        centerPanel.add(player1Panel, gbc);
        gbc.gridy = 6;
        gbc.gridx = 0;
        player2Panel = new JPanel();
        player2Panel.setBackground(Color.YELLOW);
        player2Panel.setLayout(new GridBagLayout());
        centerPanel.add(player2Panel);
        gbc.gridy = 7;
        gbc.gridx = 3;
        confirmPanel = new JPanel();
        confirmPanel.setBackground(Color.red);
        confirmPanel.setLayout(new GridBagLayout());
        centerPanel.add(confirmPanel);
        confirmAreaPlayer1 = new JTextArea();
        confirmAreaPlayer1.setEditable(false);
        confirmAreaPlayer1.setPreferredSize(new Dimension(150, 20));
        player1Panel.add(new JScrollPane(confirmAreaPlayer1));
        aliasPlayer1Indicator = new JLabel(enterJLabelPlayer1());
        player1Panel.add(aliasPlayer1Indicator);
        championsBoxPlayer1 = new JComboBox<>(addElementsComboBoxPlayer1(SeleccionDePersonajes.getPlayersWithChampions()));
        player1Panel.add(championsBoxPlayer1);
        rolIndicatorPLayer1 = new JLabel("Roles");
        player1Panel.add(rolIndicatorPLayer1);
        rolBoxPLayer1 = new JComboBox<>(addRolsChampions());
        player1Panel.add(rolBoxPLayer1);
        modelTablePlayer1 = new DefaultTableModel(
                new Object[][]{
                        {""},

                },
                new Object[]{"Campeones con roles"}
        );
        roleAssignmentTablePlayer1 = new JTable(modelTablePlayer1);
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setBackground(Color.LIGHT_GRAY);

        for (int i = 0; i < roleAssignmentTablePlayer1.getColumnCount(); i++) {
            roleAssignmentTablePlayer1.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        JScrollPane scrollPane = new JScrollPane(roleAssignmentTablePlayer1);
        scrollPane.setBackground(Color.CYAN);
        player1Panel.add(scrollPane);

        //---------------------------------------------------------//

        aliasPlayer2Indicator = new JLabel(enterJLabelPlayer2());
        player2Panel.add(aliasPlayer2Indicator);
        confirmAreaPlayer2 = new JTextArea();
        confirmAreaPlayer2.setEditable(false);
        confirmAreaPlayer2.setPreferredSize(new Dimension(150, 20));
        player2Panel.add(new JScrollPane(confirmAreaPlayer2));
        championsBoxPlayer2 = new JComboBox<>(addElementsComboBoxPlayer2(SeleccionDePersonajes.getPlayersWithChampions()));
        player2Panel.add(championsBoxPlayer2);
        rolIndicatorPLayer2 = new JLabel("Roles");
        player2Panel.add(rolIndicatorPLayer2);
        rolBoxPLayer2 = new JComboBox<>(addRolsChampions());
        player2Panel.add(rolBoxPLayer2);
        modelTablePlayer2 = new DefaultTableModel(
                new Object[][]{
                        {""},

                },
                new Object[]{"Campeones con roles"}
        );
        roleAssignmentTablePLayer2 = new JTable(modelTablePlayer2);
        DefaultTableCellRenderer cellRenderer2 = new DefaultTableCellRenderer();
        cellRenderer2.setBackground(Color.PINK);

        for (int i = 0; i < roleAssignmentTablePLayer2.getColumnCount(); i++) {
            roleAssignmentTablePLayer2.getColumnModel().getColumn(i).setCellRenderer(cellRenderer2);
        }
        JScrollPane scrollPane2 = new JScrollPane(roleAssignmentTablePLayer2);
        scrollPane2.setBackground(Color.lightGray);
        player2Panel.add(scrollPane2);
        confirmBothPlayers = new JButton("Confirmar");
        confirmBothPlayers.setBackground(Color.GREEN);
        confirmBothPlayers.setForeground(Color.WHITE);
        confirmPanel.add(confirmBothPlayers);
        championsBoxPlayer1.addActionListener(this::assignRolesToChampionsPlayer1);
        championsBoxPlayer2.addActionListener(this::assignRolesToChampionsPlayer2);
        confirmBothPlayers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FormacionEquipo();
                dispose();
            }
        });


    }
    public void assignRolesToChampionsPlayer1(ActionEvent e){

        String championSelected = (String) championsBoxPlayer1.getSelectedItem();
        String rolSelected = (String) championsBoxPlayer2.getSelectedItem();
        switch (rolSelected) {
            case "Tank":
                Object[] row1 = {championSelected + ": " + rolSelected};
                modelTablePlayer1.addRow(row1);
                confirmAreaPlayer1.setText("rol añadido");
                addElementRolsChampionPlayer1(championSelected, rolSelected);
                break;
            case "Healer":
                Object[] row2 = {championSelected + ": " + rolSelected};
                modelTablePlayer1.addRow(row2);
                confirmAreaPlayer1.setText("rol añadido");
                addElementRolsChampionPlayer1(championSelected, rolSelected);
                break;
            case "Assasin":
                Object[] row3 = {championSelected + ": " + rolSelected};
                modelTablePlayer1.addRow(row3);
                confirmAreaPlayer1.setText("rol añadido");
                addElementRolsChampionPlayer1(championSelected, rolSelected);
                break;
            case "Fighter":
                Object[] row4 = {championSelected + ": " + rolSelected};
                modelTablePlayer1.addRow(row4);
                confirmAreaPlayer1.setText("rol añadido");
                addElementRolsChampionPlayer1(championSelected, rolSelected);
                break;
            case "Shotter":
                Object[] row5 = {championSelected + ": " + rolSelected};
                modelTablePlayer1.addRow(row5);
                confirmAreaPlayer1.setText("rol añadido");
                addElementRolsChampionPlayer1(championSelected, rolSelected);
                break;
            case "Wizards":
                Object[] row6 = {championSelected + ": " + rolSelected};
                modelTablePlayer1.addRow(row6);
                confirmAreaPlayer1.setText("rol añadido");
                addElementRolsChampionPlayer1(championSelected, rolSelected);
                break;


        }
        addElementtrainingRolesPlayer1(enterJLabelPlayer1(), rolsChampionsPLayer1);
    }
    public void assignRolesToChampionsPlayer2(ActionEvent e){

        String championSelected = (String) championsBoxPlayer2.getSelectedItem();
        String rolSelected = (String) championsBoxPlayer2.getSelectedItem();
        switch (rolSelected) {
            case "Tank":
                Object[] row1 = {championSelected + ": " + rolSelected};
                modelTablePlayer2.addRow(row1);
                confirmAreaPlayer2.setText("rol añadido");
                addElementRolsChampionPlayer2(championSelected, rolSelected);
                break;
            case "Healer":
                Object[] row2 = {championSelected + ": " + rolSelected};
                modelTablePlayer2.addRow(row2);
                confirmAreaPlayer2.setText("rol añadido");
                addElementRolsChampionPlayer2(championSelected, rolSelected);
                break;
            case "Assasin":
                Object[] row3 = {championSelected + ": " + rolSelected};
                modelTablePlayer2.addRow(row3);
                confirmAreaPlayer2.setText("rol añadido");
                addElementRolsChampionPlayer2(championSelected, rolSelected);
                break;
            case "Fighter":
                Object[] row4 = {championSelected + ": " + rolSelected};
                modelTablePlayer2.addRow(row4);
                confirmAreaPlayer2.setText("rol añadido");
                addElementRolsChampionPlayer2(championSelected, rolSelected);
                break;
            case "Shotter":
                Object[] row5 = {championSelected + ": " + rolSelected};
                modelTablePlayer2.addRow(row5);
                confirmAreaPlayer2.setText("rol añadido");
                addElementRolsChampionPlayer2(championSelected, rolSelected);
                break;
            case "Wizards":
                Object[] row6 = {championSelected + ": " + rolSelected};
                modelTablePlayer2.addRow(row6);
                confirmAreaPlayer2.setText("rol añadido");
                addElementRolsChampionPlayer1(championSelected, rolSelected);
                break;


        }
        addElementtrainingRolesPlayer2(enterJLabelPlayer2(), rolsChampionsPLayer2);

    }

    private String enterJLabelPlayer1(){

        return SeleccionDePersonajes.getAliasPlayer1Text().getText();
    }
    private String enterJLabelPlayer2(){

        return SeleccionDePersonajes.getAliasPlayer2Text().getText();
    }

    private DefaultComboBoxModel addElementsComboBoxPlayer1(HashMap <String, ArrayList<String>> playersChampionMap) {
        DefaultComboBoxModel<String> championsBoxListPlayer1 = new DefaultComboBoxModel<>();
        for (String jugador : SeleccionDePersonajes.getPlayersWithChampions().keySet()) {
          if(jugador.equalsIgnoreCase(aliasPlayer1Indicator.getText())){
              ArrayList<String> campeones = SeleccionDePersonajes.getPlayersWithChampions().get(jugador);


              for (String champion : campeones) {
                  championsBoxListPlayer1.addElement(champion);
              }
          }
          else{
              confirmAreaPlayer1.setText("Sin campeones seleccionados");

          }


          }

        return championsBoxListPlayer1;
    }

    private DefaultComboBoxModel addElementsComboBoxPlayer2(HashMap <String, ArrayList<String>> playersChampionMap) {
        DefaultComboBoxModel<String> championsBoxListPlayer2 = new DefaultComboBoxModel<>();
        for (String jugador : SeleccionDePersonajes.getPlayersWithChampions().keySet()) {
            if(jugador.equalsIgnoreCase(aliasPlayer2Indicator.getText())){
                ArrayList<String> campeones = SeleccionDePersonajes.getPlayersWithChampions().get(jugador);


                for (String champion : campeones) {
                    championsBoxListPlayer2.addElement(champion);
                }
            }
            else{
                confirmAreaPlayer2.setText("Sin campeones seleccionados");

            }


        }

        return championsBoxListPlayer2;
    }



    private DefaultComboBoxModel addRolsChampions(){
        DefaultComboBoxModel <String> rolCharacterList = new DefaultComboBoxModel<>();
        rolCharacterList.addElement("Tank");
        rolCharacterList.addElement("Healer");
        rolCharacterList.addElement("Assasin");
        rolCharacterList.addElement("Fighter");
        rolCharacterList.addElement("Shotter");
        rolCharacterList.addElement("Wizards");
        return rolCharacterList;
    }

    public static void addElementRolsChampionPlayer1(String key, String value){

        rolsChampionsPLayer1.put(key, value);
    }
    public static void addElementRolsChampionPlayer2(String key, String value){

        rolsChampionsPLayer1.put(key, value);
    }

    public static HashMap<String, String> getRolsChampionsPLayer1() {
        return rolsChampionsPLayer1;
    }

    public static HashMap<String, String> getRolsChampionsPLayer2() {
        return rolsChampionsPLayer2;
    }

    public static void addElementtrainingRolesPlayer1(String key, HashMap<String, String> elementtrainingRolesPlayer1){

        trainingRolesPlayer1.put(key, elementtrainingRolesPlayer1);

    }
    public static void addElementtrainingRolesPlayer2(String key, HashMap<String, String> elementtrainingRolesPlayer2){

        trainingRolesPlayer1.put(key, elementtrainingRolesPlayer2);

    }

    public static HashMap<String, HashMap<String, String>> getTrainingRolesPlayer1() {
        return trainingRolesPlayer1;
    }



    public static HashMap<String, HashMap<String, String>> getTrainingRolesPlayer2() {
        return trainingRolesPlayer2;
    }


}
