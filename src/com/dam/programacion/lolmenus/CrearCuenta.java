package com.dam.programacion.lolmenus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class CrearCuenta extends JFrame {

    private JPanel centerPanel;
    private JPanel registrationPanel;
    private JPanel confirmPanel;
    private JLabel aliasIndicator;
    private JTextField aliasText;
    private JTextArea confirmArea;
    private JButton confirmButton;
    private static ArrayList <String> aliasList = new ArrayList<>();

    public CrearCuenta(){
        setTitle("Creacion de cuenta");
        setVisible(true);
        setBounds(600,600,600,600);
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBackground(Color.DARK_GRAY);
        add(centerPanel);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(10,10,10,10);
        registrationPanel = new JPanel();
        registrationPanel.setLayout(new GridBagLayout());
        registrationPanel.setBackground(Color.BLUE);
        centerPanel.add(registrationPanel, gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        confirmPanel = new JPanel();
        confirmPanel.setLayout(new GridBagLayout());
        confirmPanel.setBackground(Color.CYAN);
        centerPanel.add(confirmPanel, gbc);
        aliasIndicator = new JLabel("Introduce el alias");
        aliasIndicator.setForeground(Color.WHITE);
        registrationPanel.add(aliasIndicator);
        aliasText = new JTextField(10);
        registrationPanel.add(aliasText);
        confirmArea = new JTextArea();
        confirmArea.setPreferredSize(new Dimension(100,60));
        confirmArea.setEditable(false);
        confirmPanel.add(new JScrollPane(confirmArea));
        confirmButton = new JButton("Confirmar");
        confirmButton.setBackground(Color.GREEN);
        confirmButton.setForeground(Color.WHITE);
        confirmPanel.add(confirmButton);
        confirmButton.addActionListener(this::createAlias);


    }

    public void createAlias(ActionEvent e){

        if(checkEmptyContet()){
            String auxAliasText = aliasText.getText();
            confirmArea.setText("Cuenta de alias " + auxAliasText + "\ncreada " + "\ncorrectamente");
            aliasList.add(auxAliasText);

        }
        else{
            confirmArea.setText("Rellene su alias, por favor");
        }
    }

    private boolean checkEmptyContet(){

        return !aliasText.getText().isEmpty();
    }

    public static ArrayList<String> getAliasList() {
        return aliasList;
    }

    public static void setAliasList(ArrayList<String> aliasList) {
        CrearCuenta.aliasList = aliasList;
    }
}
