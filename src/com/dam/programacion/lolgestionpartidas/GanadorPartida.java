package com.dam.programacion.lolgestionpartidas;

import com.dam.programacion.lol.metodosimagenespartida.GestionVictoriaPartidas;
import com.dam.programacion.lolmenus.MenuPrincipal;

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
        centerPanel.add(GestionVictoriaPartidas.returnWinPlayerPanel());
        JButton comeBackMenu = new JButton("Volver al menu");
        comeBackMenu.setBackground(Color.ORANGE);
        comeBackMenu.setForeground(Color.WHITE);
        centerPanel.add(comeBackMenu, BorderLayout.SOUTH);

        frame.add(centerPanel);
        frame.setVisible(true);

        comeBackMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuPrincipal();
                dispose();
            }
        });

    }



}
