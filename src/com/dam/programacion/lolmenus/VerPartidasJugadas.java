package com.dam.programacion.lolmenus;

import com.dam.programacion.lolgestionInformacionPartidas.InformacionJugador1;
import com.dam.programacion.lolgestionInformacionPartidas.InformacionJugador2;
import com.dam.programacion.lolgestionpartidas.AsignacionRoles;
import com.dam.programacion.lolgestionpartidas.FormacionEquipo;
import com.dam.programacion.lolgestionpartidas.Partida;
import com.dam.programacion.lolgestionpartidas.SeleccionDePersonajes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerPartidasJugadas extends JFrame {
    private JPanel centerPanel;
    private JPanel comboPanel;
    private JPanel battlePanel;
    private JPanel textPanel;
    private JComboBox<String> battlesBox;
    private JTextArea informationBattles;
    private JButton comebackMenu;
    private static final String nameBattle = AsignacionRoles.enterJLabelPlayer1() + " vs " + AsignacionRoles.enterJLabelPlayer2();

    public VerPartidasJugadas(){
        setTitle("Equipos usados");
        setVisible(true);
        setBounds(600, 600, 600, 600);
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        add(centerPanel);
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        comboPanel = new JPanel();
        comboPanel.setLayout(new BorderLayout());
        centerPanel.add(comboPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        battlePanel = new JPanel();
        battlePanel.setLayout(new BorderLayout());
        centerPanel.add(battlePanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());
        centerPanel.add(textPanel, gbc);

        battlesBox = new JComboBox<>(battlesList());
        battlesBox.setBackground(Color.MAGENTA);
        battlesBox.setForeground(Color.WHITE);
        comboPanel.add(battlesBox);

        informationBattles = new JTextArea();
        informationBattles.setEditable(false);
        informationBattles.setPreferredSize(new Dimension(1200, 100));
        textPanel.add(new JScrollPane(informationBattles), BorderLayout.NORTH);
        comebackMenu = new JButton("Volver al menu");
        comebackMenu.setBackground(Color.BLUE);
        comebackMenu.setForeground(Color.WHITE);
        textPanel.add(comebackMenu, BorderLayout.SOUTH);
        battlesBox.addActionListener(this::putBattle);
        comebackMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuPrincipal();
                dispose();
            }
        });

    }

    protected DefaultComboBoxModel<String> battlesList() {

        DefaultComboBoxModel<String> battlesList = new DefaultComboBoxModel<>();
        battlesList.addElement(nameBattle);

        return battlesList;
    }

    protected void putBattle(ActionEvent e) {
        String battle = (String) battlesBox.getSelectedItem();


            informationBattles.setText(FormacionEquipo.getPlayersWithAll().toString());
            battlePanel.removeAll();
            battlePanel.add(Partida.getCenterPanel());
            battlePanel.revalidate();
            battlePanel.repaint();


    }

}



