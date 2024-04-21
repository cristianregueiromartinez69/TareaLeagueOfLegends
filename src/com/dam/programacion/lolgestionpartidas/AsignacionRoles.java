package com.dam.programacion.lolgestionpartidas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class AsignacionRoles extends JFrame {

    private JPanel centerPanel;
    private JPanel player1Panel;
    private JPanel player2Panel;
    private JPanel confirmPanel;
    private JLabel aliasPlayer1Indicator;
    private JComboBox <String> championsBoxPlayer1;
    private DefaultComboBoxModel <String> rolBoxListPLayer1;
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



    public  AsignacionRoles(){
        setTitle("Asignacion de roles");
        setBounds(600,600,600,600);
        setVisible(true);
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBackground(Color.PINK);
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
        aliasPlayer1Indicator = new JLabel(enterJLabelPlayer1());
        player1Panel.add(aliasPlayer1Indicator);


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

}
