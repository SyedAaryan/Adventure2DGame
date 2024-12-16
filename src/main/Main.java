package main;

import javax.swing.*;

public class Main {

    public static void main (String[] args){

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure Game Boiii");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();

        // The window will be displayed at the center of the screen
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

}
