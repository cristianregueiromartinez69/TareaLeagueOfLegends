package com.dam.programacion.lol.metodosimagenespartida;

import javax.swing.*;

public class MetodoVersusClasePartida {

    public static JLabel createImageLabelVersusBothPlayers(String imagePath) {

        ImageIcon imageIcon = new ImageIcon(imagePath);


        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);


        return imageLabel;
    }

}
