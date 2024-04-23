package com.dam.programacion.lolgestionpartidas;

import com.dam.programacion.lol.metodosimagenespartida.GestionVictoriaPartidas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GanadorPartida extends JFrame {
    private JPanel centerPanel;
    private Image minecratImage;
    private ImageIcon minecraftIcon;


    public GanadorPartida() {
        JFrame frame = new JFrame("Ganador");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);


        JPanel centerPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                ImageIcon backgroundImage = new ImageIcon("victoria.jpg");
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };


        centerPanel.setLayout(new OverlayLayout(centerPanel));


        frame.add(centerPanel);
        frame.setVisible(true);


        Timer timer = new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GanadorPartida();
                frame.dispose();
            }
        });
        timer.setRepeats(false);


        timer.start();

        setVisible(true);
    }

    public void winsBattle(){
        JPanel winPanel = new JPanel();
        HashMap<String, Integer> player1 = GestionVictoriaPartidas.winBattlePlayer1(Campeones.getChampionsValues(), SeleccionDePersonajes.getPlayersWithChampions());
        System.out.println(player1.toString());
        HashMap<String, Integer> player2 = GestionVictoriaPartidas.winBattlePlayer2(Campeones.getChampionsValues(), SeleccionDePersonajes.getPlayersWithChampions());
        System.out.println(player2.toString());

    }

}
