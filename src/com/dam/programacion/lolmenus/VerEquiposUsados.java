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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VerEquiposUsados extends JFrame {

    private JPanel centerPanel;
    private JPanel comboPanel;
    private JPanel globalPanel;
    private JPanel textPanel;
    private JComboBox<String> battlesBox;
    private JTextArea informationPlayers;
    private JButton comebackMenu;
    private static String teamPlayer1 = InformacionJugador1.saveInformationPlayer1(SeleccionDePersonajes.getPlayersWithChampions(), AsignacionRoles.getRolsChampionsPLayer1(), FormacionEquipo.getChampionsWithFormationPlayer1());
    private static String teamPlayer2 = InformacionJugador2.saveInformationPlayer2(SeleccionDePersonajes.getPlayersWithChampions(), AsignacionRoles.getRolsChampionsPLayer2(), FormacionEquipo.getChampionsWithFormationPlayer2());

    public VerEquiposUsados() {
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
        globalPanel = new JPanel();
        globalPanel.setLayout(new BorderLayout());
        centerPanel.add(globalPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());
        centerPanel.add(textPanel, gbc);

        battlesBox = new JComboBox<>(battlesList());
        battlesBox.setBackground(Color.MAGENTA);
        battlesBox.setForeground(Color.WHITE);
        comboPanel.add(battlesBox);

        informationPlayers = new JTextArea();
        informationPlayers.setEditable(false);
        informationPlayers.setPreferredSize(new Dimension(1200, 100));
        textPanel.add(new JScrollPane(informationPlayers), BorderLayout.NORTH);
        comebackMenu = new JButton("Volver al menu");
        comebackMenu.setBackground(Color.BLUE);
        comebackMenu.setForeground(Color.WHITE);
        textPanel.add(comebackMenu, BorderLayout.SOUTH);
        battlesBox.addActionListener(this::putInformationPlayer);
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
        battlesList.addElement(InformacionJugador1.saveInformationPlayer1(SeleccionDePersonajes.getPlayersWithChampions(), AsignacionRoles.getRolsChampionsPLayer1(), FormacionEquipo.getChampionsWithFormationPlayer1()));
        battlesList.addElement(InformacionJugador2.saveInformationPlayer2(SeleccionDePersonajes.getPlayersWithChampions(), AsignacionRoles.getRolsChampionsPLayer2(), FormacionEquipo.getChampionsWithFormationPlayer2()));
        return battlesList;
    }

    protected void putInformationPlayer(ActionEvent e) {
        String teamName = (String) battlesBox.getSelectedItem();

        if (teamName.equals(teamPlayer1)) {
            informationPlayers.setText(loadingInformationPlayer1(InformacionJugador1.saveInformationPlayer1(SeleccionDePersonajes.getPlayersWithChampions(), AsignacionRoles.getRolsChampionsPLayer1(), FormacionEquipo.getChampionsWithFormationPlayer1())));
            globalPanel.removeAll();
            globalPanel.add(Partida.getGlobalPanelPlayer1());
            globalPanel.revalidate();
            globalPanel.repaint();

        } else if (teamName.equals(teamPlayer2)) {
            informationPlayers.setText(loadingInformationPlayer2(InformacionJugador2.saveInformationPlayer2(SeleccionDePersonajes.getPlayersWithChampions(), AsignacionRoles.getRolsChampionsPLayer2(), FormacionEquipo.getChampionsWithFormationPlayer2())));
            globalPanel.removeAll();
            globalPanel.add(Partida.getGlobalPanelPlayer2());
            globalPanel.revalidate();
            globalPanel.repaint();

        }
    }


    protected String loadingInformationPlayer1(String fileName) {
        String content = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content = line;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return content;
    }

    protected String loadingInformationPlayer2(String fileName) {
        String content = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content = line;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return content;
    }


}