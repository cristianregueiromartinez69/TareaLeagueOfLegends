package com.dam.programacion.lolgestionpartidas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaCargaPartida extends JFrame{

    private JPanel centerPanel;
    private Image minecratImage;
    private ImageIcon minecraftIcon;


    public PantallaCargaPartida() {
        JFrame frame = new JFrame("Batalla");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);


        JPanel centerPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                ImageIcon backgroundImage = new ImageIcon("batalla.jpg");
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };


        centerPanel.setLayout(new OverlayLayout(centerPanel));


        frame.add(centerPanel);
        frame.setVisible(true);


        Timer timer = new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
            }
        });
        timer.setRepeats(false);


        timer.start();

        setVisible(true);
    }

    }
