package Parcial2;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JFrame {

    private JPanel panelPrincipal;
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JPanel panelMenu;
    private JPanel panelJuego;
    private JButton button3;

    public Ventana(){
        add(panelPrincipal);

        panelJuego.setVisible(false);
        setSize(600, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                System.out.println("Tu hermana en tanga");
                panelMenu.setVisible(false);
                panelJuego.setVisible(true);
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Loquita");
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                panelMenu.setVisible(true);
                panelJuego.setVisible(false);

            }
        });
    }

}
