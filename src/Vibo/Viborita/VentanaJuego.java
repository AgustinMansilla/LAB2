package Viborita;

import javax.swing.*;

public class VentanaJuego extends JFrame {


    VentanaJuego(){

        this.add(new PanelJuego());
        this.setTitle("Viborita");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

}
