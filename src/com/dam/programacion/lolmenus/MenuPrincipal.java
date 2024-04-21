package com.dam.programacion.lolmenus;
import  com.dam.programacion.lolgestionpartidas.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal {

    private JPanel centerPanel;
    private JButton createAccounts;
    private JButton viewUsesTeams;
    private JButton viewGamesPlayed;
    private JButton playGame;
    private Image lolImage;
    private ImageIcon lolIcon;


    public MenuPrincipal() {
        JFrame frame = new JFrame("League OF Legends");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);


        JPanel centerPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                ImageIcon backgroundImage = new ImageIcon("lolMenuPrincipal.jpg");
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };


        centerPanel.setLayout(new OverlayLayout(centerPanel));


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        buttonPanel.setBackground(Color.BLUE);
        centerPanel.add(buttonPanel, BorderLayout.CENTER);
        createAccounts = new JButton("crear cuenta");
        createAccounts.setBackground(Color.CYAN);
        createAccounts.setForeground(Color.WHITE);
        playGame = new JButton("Jugar partida");
        playGame.setBackground(Color.ORANGE);
        playGame.setForeground(Color.WHITE);
        viewUsesTeams = new JButton("Ver equipos usados");
        viewUsesTeams.setBackground(Color.DARK_GRAY);
        viewUsesTeams.setForeground(Color.WHITE);
        viewGamesPlayed = new JButton("Ver partidas jugadas");
        viewGamesPlayed.setBackground(Color.PINK);
        viewGamesPlayed.setForeground(Color.WHITE);
        buttonPanel.add(createAccounts);
        buttonPanel.add(playGame);
        buttonPanel.add(viewUsesTeams);
        buttonPanel.add(viewGamesPlayed);


        Dimension buttonSize = playGame.getPreferredSize();
        createAccounts.setBounds(200, 500, buttonSize.width, buttonSize.height);
        playGame.setBounds(150, 100, buttonSize.width, buttonSize.height);
        viewUsesTeams.setBounds(200, 150, buttonSize.width, buttonSize.height);
        frame.add(centerPanel);
        frame.setVisible(true);
        createAccounts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CrearCuenta();
            }
        });
        playGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SeleccionDePersonajes();
            }
        });
        viewUsesTeams.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VerEquiposUsados();
            }
        });
        viewGamesPlayed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VerPartidasJugadas();
            }
        });
    }
}