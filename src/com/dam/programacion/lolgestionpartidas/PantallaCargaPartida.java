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

        JButton buttonFinishBatlle = new JButton("Finish");
        buttonFinishBatlle.setBackground(Color.MAGENTA);
        buttonFinishBatlle.setForeground(Color.WHITE);
        centerPanel.add(buttonFinishBatlle, BorderLayout.SOUTH);

        frame.add(centerPanel);
        frame.setVisible(true);


      buttonFinishBatlle.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              new GanadorPartida();
              dispose();
          }
      });
    }


    }
