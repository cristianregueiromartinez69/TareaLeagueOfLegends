package com.dam.programacion.lolgestionpartidas;

import com.dam.programacion.lolmenus.CrearCuenta;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class SeleccionDePersonajes extends JFrame {

    private JPanel centerPanel;
    private JPanel player1Panel;
    private JPanel player2Panel;
    private JPanel confirmPanelPlayer1;
    private static JLabel aliasPlayer1Indictor;
    private static JTextField aliasPlayer1Text;
    private JComboBox<String> championsBoxPlayer1;
    private JTable informationSelectedChampionsPlayer1Table;
    private DefaultTableModel modelTablePLayer1;
    private JButton confirmChampionsPLayer1Button;
    private JTextArea confirmAreaPlayer1;
    private static JLabel aliasPlayer2Indictor;
    private static JTextField aliasPlayer2Text;
    private JComboBox<String> championsBoxPlayer2;
    private JTable informationSelectedChampionsPlayer2Table;
    private DefaultTableModel modelTablePLayer2;
    private JButton confirmChampionsPLayer2Button;
    private JTextArea confirmAreaPlayer2;
    private JButton confirmBothPlayersButtom;
    private JTextArea confirmBothPlayersArea;
    private static HashMap<String, ArrayList<String>> playersWithChampions = new HashMap<>();

    public SeleccionDePersonajes() {
        setTitle("Seleecion de personajes");
        setVisible(true);
        setBounds(600, 600, 600, 600);
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBackground(Color.BLUE);
        add(centerPanel);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridy = 1;
        gbc.gridx = 0;
        player1Panel = new JPanel();
        player1Panel.setBackground(Color.ORANGE);
        player1Panel.setLayout(new GridBagLayout());
        centerPanel.add(player1Panel, gbc);
        gbc.gridy = 6;
        gbc.gridx = 0;
        player2Panel = new JPanel();
        player2Panel.setBackground(Color.ORANGE);
        player2Panel.setLayout(new GridBagLayout());
        centerPanel.add(player2Panel);
        gbc.gridy = 7;
        gbc.gridx = 3;
        confirmPanelPlayer1 = new JPanel();
        confirmPanelPlayer1.setBackground(Color.LIGHT_GRAY);
        confirmPanelPlayer1.setLayout(new GridBagLayout());
        centerPanel.add(confirmPanelPlayer1);
        aliasPlayer1Indictor = new JLabel("Alias Jugador 1");
        player1Panel.add(aliasPlayer1Indictor);
        aliasPlayer1Text = new JTextField(10);
        player1Panel.add(aliasPlayer1Text);
        modelTablePLayer1 = new DefaultTableModel();
        championsBoxPlayer1 = new JComboBox<>(addElementsComboBoxPlayer1(Campeones.giveValueListChampions()));
        player1Panel.add(championsBoxPlayer1);
        modelTablePLayer1 = new DefaultTableModel(new Object[][]{{""}}, new Object[]{"Campeones"});
        informationSelectedChampionsPlayer1Table = new JTable(modelTablePLayer1);
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setBackground(Color.PINK);

        for (int i = 0; i < informationSelectedChampionsPlayer1Table.getColumnCount(); i++) {
            informationSelectedChampionsPlayer1Table.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        JScrollPane scrollPane = new JScrollPane(informationSelectedChampionsPlayer1Table);
        scrollPane.setBackground(Color.BLACK);
        player1Panel.add(scrollPane);
        confirmBothPlayersButtom = new JButton("Confirmar");
        confirmBothPlayersButtom.setBackground(Color.GREEN);
        confirmBothPlayersButtom.setForeground(Color.WHITE);
        confirmPanelPlayer1.add(confirmBothPlayersButtom);
        confirmAreaPlayer1 = new JTextArea();
        confirmAreaPlayer1.setEditable(false);
        confirmAreaPlayer1.setText("Area del jugador 1");
        confirmAreaPlayer1.setPreferredSize(new Dimension(150, 46));
        confirmPanelPlayer1.add(new JScrollPane(confirmAreaPlayer1));
        //---------------------------------------------------//
        aliasPlayer2Indictor = new JLabel("Alias Jugador 2");
        player2Panel.add(aliasPlayer2Indictor);
        aliasPlayer2Text = new JTextField(10);
        player2Panel.add(aliasPlayer2Text);
        modelTablePLayer2 = new DefaultTableModel();
        informationSelectedChampionsPlayer2Table = new JTable();
        championsBoxPlayer2 = new JComboBox<>(addElementsComboBoxPlayer2(Campeones.giveValueListChampions()));
        player2Panel.add(championsBoxPlayer2);
        modelTablePLayer2 = new DefaultTableModel(new Object[][]{{""}}, new Object[]{"Campeones"});
        informationSelectedChampionsPlayer2Table = new JTable(modelTablePLayer2);
        DefaultTableCellRenderer cellRenderer2 = new DefaultTableCellRenderer();
        cellRenderer.setBackground(Color.PINK);

        for (int i = 0; i < informationSelectedChampionsPlayer2Table.getColumnCount(); i++) {
            informationSelectedChampionsPlayer2Table.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        JScrollPane scrollPane2 = new JScrollPane(informationSelectedChampionsPlayer2Table);
        scrollPane.setBackground(Color.BLACK);
        player2Panel.add(scrollPane2);
        confirmAreaPlayer2 = new JTextArea();
        confirmAreaPlayer2.setText("Area del jugador 2");
        confirmAreaPlayer2.setEditable(false);
        confirmAreaPlayer2.setPreferredSize(new Dimension(150, 46));
        confirmPanelPlayer1.add(new JScrollPane(confirmAreaPlayer2));
        championsBoxPlayer1.addActionListener(this::selectChampionsPlayer1);
        championsBoxPlayer2.addActionListener(this::selectChampionsPlayer2);
        confirmBothPlayersButtom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AsignacionRoles();
                dispose();
            }
        });



    }


    public void selectChampionsPlayer1(ActionEvent e) {
       String alias = aliasPlayer1Text.getText();
        if (checkAliasPlayer1()) {


            String championName = (String) championsBoxPlayer1.getSelectedItem();
            switch (championName) {
                case "Ashe":
                    Object[] row1 = {"Nombre: " + championName};
                    modelTablePLayer1.addRow(row1);
                    break;
                case "Ahri":
                    Object[] row2 = {"Nombre: " + championName};
                    modelTablePLayer1.addRow(row2);
                    break;
                case "Yashuo":
                    Object[] row3 = {"Nombre: " + championName};
                    modelTablePLayer1.addRow(row3);
                    break;
                case "Zed":
                    Object[] row4 = {"Nombre: " + championName};
                    modelTablePLayer1.addRow(row4);
                    break;
                case "Lee Sin":
                    Object[] row5 = {"Nombre: " + championName};
                    modelTablePLayer1.addRow(row5);
                    break;
                case "Jynx":
                    Object[] row6 = {"Nombre: " + championName};
                    modelTablePLayer1.addRow(row6);
                    break;
                case "Thresh":
                    Object[] row7 = {"Nombre: " + championName};
                    modelTablePLayer1.addRow(row7);
                    break;
                case "Darius":
                    Object[] row8 = {"Nombre: " + championName};
                    modelTablePLayer1.addRow(row8);
                    break;
                case "Garen":
                    Object[] row9 = {"Nombre: " + championName};
                    modelTablePLayer1.addRow(row9);
                    break;
                case "Teemo":
                    Object[] row10 = {"Nombre: " + championName};
                    modelTablePLayer1.addRow(row10);
                    break;


            }
            confirmAreaPlayer1.setText("Campeon: " + championName + "\nañadido");
            addChampion(alias, championName);


        }
        else {
            confirmAreaPlayer1.setText("alias incorrecto");
        }
    }

    public void selectChampionsPlayer2(ActionEvent e) {
        String alias = aliasPlayer2Text.getText();
        if (checkAliasPlayer2()) {

            String championName = (String) championsBoxPlayer2.getSelectedItem();
            switch (championName) {
                case "Ashe":
                    Object[] row1 = {"Nombre: " + championName};
                    modelTablePLayer2.addRow(row1);
                    break;
                case "Ahri":
                    Object[] row2 = {"Nombre: " + championName};
                    modelTablePLayer2.addRow(row2);
                    break;
                case "Yashuo":
                    Object[] row3 = {"Nombre: " + championName};
                    modelTablePLayer2.addRow(row3);
                    break;
                case "Zed":
                    Object[] row4 = {"Nombre: " + championName};
                    modelTablePLayer2.addRow(row4);
                    break;
                case "Lee Sin":
                    Object[] row5 = {"Nombre: " + championName};
                    modelTablePLayer2.addRow(row5);
                    break;
                case "Jynx":
                    Object[] row6 = {"Nombre: " + championName};
                    modelTablePLayer2.addRow(row6);
                    break;
                case "Thresh":
                    Object[] row7 = {"Nombre: " + championName};
                    modelTablePLayer2.addRow(row7);
                    break;
                case "Darius":
                    Object[] row8 = {"Nombre: " + championName};
                    modelTablePLayer2.addRow(row8);
                    break;
                case "Garen":
                    Object[] row9 = {"Nombre: " + championName};
                    modelTablePLayer2.addRow(row9);
                    break;
                case "Teemo":
                    Object[] row10 = {"Nombre: " + championName};
                    modelTablePLayer2.addRow(row10);
                    break;


            }
            confirmAreaPlayer2.setText("Campeon: " + championName + "\nañadido");
            addChampion(alias, championName);

        } else {
            confirmAreaPlayer2.setText("alias incorrecto");
        }
    }

    private DefaultComboBoxModel addElementsComboBoxPlayer1(ArrayList<String> championsList) {
        DefaultComboBoxModel<String> championsBoxListPlayer1 = new DefaultComboBoxModel<>();
        for (String name : championsList) {
            championsBoxListPlayer1.addElement(name);
        }
        return championsBoxListPlayer1;
    }



    private DefaultComboBoxModel addElementsComboBoxPlayer2(ArrayList<String> championsList) {
        DefaultComboBoxModel<String> championsBoxListPlayer2 = new DefaultComboBoxModel<>();
        int count = 0;
        int maxChampions = 10;
        for (String name : championsList) {
            if (count < maxChampions){
                championsBoxListPlayer2.addElement(name);
            }
            count++;
        }
        return championsBoxListPlayer2;
    }



    private boolean checkAliasPlayer1() {
        String auxAlias = aliasPlayer1Text.getText().trim().toLowerCase(); // Convierte a minúsculas y elimina espacios en blanco al inicio y al final
        for (String element : CrearCuenta.getAliasList()) {
            if (element.trim().toLowerCase().equals(auxAlias)) {
                return true;
            }
        }
        return false;
    }


    private boolean checkAliasPlayer2() {
        String auxAlias = aliasPlayer2Text.getText().trim().toLowerCase(); // Convierte a minúsculas y elimina espacios en blanco al inicio y al final
        for (String element : CrearCuenta.getAliasList()) {
            if (element.trim().toLowerCase().equals(auxAlias)) {
                return true;
            }
        }
        return false;
    }

    public void addChampion(String jugador, String campeon) {

        if (playersWithChampions.containsKey(jugador)) {

            playersWithChampions.get(jugador).add(campeon);
        } else {

            ArrayList<String> listaCampeones = new ArrayList<>();
            listaCampeones.add(campeon);
            playersWithChampions.put(jugador, listaCampeones);
        }
    }

    public ArrayList<String> getChampions(String jugador) {
        return playersWithChampions.get(jugador);
    }

    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public void setCenterPanel(JPanel centerPanel) {
        this.centerPanel = centerPanel;
    }

    public static JLabel getAliasPlayer1Indictor() {
        return aliasPlayer1Indictor;
    }

    public static void setAliasPlayer1Indictor(JLabel aliasPlayer1Indictor) {
        SeleccionDePersonajes.aliasPlayer1Indictor = aliasPlayer1Indictor;
    }

    public static JLabel getAliasPlayer2Indictor() {
        return aliasPlayer2Indictor;
    }

    public static void setAliasPlayer2Indictor(JLabel aliasPlayer2Indictor) {
        SeleccionDePersonajes.aliasPlayer2Indictor = aliasPlayer2Indictor;
    }

    public JPanel getPlayer1Panel() {
        return player1Panel;
    }

    public void setPlayer1Panel(JPanel player1Panel) {
        this.player1Panel = player1Panel;
    }

    public static JTextField getAliasPlayer1Text() {
        return aliasPlayer1Text;
    }

    public static void setAliasPlayer1Text(JTextField aliasPlayer1Text) {
        SeleccionDePersonajes.aliasPlayer1Text = aliasPlayer1Text;
    }

    public static JTextField getAliasPlayer2Text() {
        return aliasPlayer2Text;
    }

    public static void setAliasPlayer2Text(JTextField aliasPlayer2Text) {
        SeleccionDePersonajes.aliasPlayer2Text = aliasPlayer2Text;
    }

    public static HashMap<String, ArrayList<String>> getPlayersWithChampions() {
        return playersWithChampions;
    }

    public static void setPlayersWithChampions(HashMap<String, ArrayList<String>> playersWithChampions) {
        SeleccionDePersonajes.playersWithChampions = playersWithChampions;
    }
}
