package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora implements ActionListener{

    JFrame cuadro;
    JTextField texto;
    JButton[] numerosButtons = new JButton[10];
    JButton[] funcionesButtons = new JButton[9];
    JButton sumButton, resButton, mulButton, divButton;
    JButton decButton, igualButton, atrButton, borrButton, negButton;
    JPanel panel;

    Font fuente = new Font("Thin",Font.BOLD,25);

    double num1 = 0, num2 = 0, resul = 0;
    char operator;

    Calculadora(){

        cuadro = new JFrame("Calculadora");
        cuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadro.setSize(420, 550);
        cuadro.setLayout(null);

        texto = new JTextField();
        texto.setBounds(50,20,300,50);
        texto.setFont(fuente);
        texto.setEditable(false);

        sumButton = new JButton("+");
        resButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        igualButton = new JButton("=");
        atrButton = new JButton("Atras");
        borrButton = new JButton("Del");
        negButton = new JButton("(-)");

        funcionesButtons[0] = sumButton;
        funcionesButtons[1] = resButton;
        funcionesButtons[2] = mulButton;
        funcionesButtons[3] = divButton;
        funcionesButtons[4] = decButton;
        funcionesButtons[5] = igualButton;
        funcionesButtons[6] = atrButton;
        funcionesButtons[7] = borrButton;
        funcionesButtons[8] = negButton;

        for(int i = 0; i < 9 ; i++){
            funcionesButtons[i].addActionListener(this);
            funcionesButtons[i].setFont(fuente);
            funcionesButtons[i].setFocusable(false);
        }

        for(int i = 0; i < 10 ; i++){
            numerosButtons[i] = new JButton(String.valueOf(i));
            numerosButtons[i].addActionListener(this);
            numerosButtons[i].setFont(fuente);
            numerosButtons[i].setFocusable(false);
        }

        negButton.setBounds(50,430,100,50);
        atrButton.setBounds(150,430,100,50);
        borrButton.setBounds(250,430,100,50);

        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        //panel.setBackground(Color.DARK_GRAY);

        panel.add(numerosButtons[1]);
        panel.add(numerosButtons[2]);
        panel.add(numerosButtons[3]);
        panel.add(sumButton);
        panel.add(numerosButtons[4]);
        panel.add(numerosButtons[5]);
        panel.add(numerosButtons[6]);
        panel.add(resButton);
        panel.add(numerosButtons[7]);
        panel.add(numerosButtons[8]);
        panel.add(numerosButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numerosButtons[0]);
        panel.add(igualButton);
        panel.add(divButton);


        cuadro.add(panel);
        cuadro.add(negButton);
        cuadro.add(atrButton);
        cuadro.add(borrButton);
        cuadro.add(texto);
        cuadro.setVisible(true);

    }
    public static void main(String[] args){

        Calculadora calc = new Calculadora();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i = 0; i < 10; i++){
            if(e.getSource() == numerosButtons[i]){
                texto.setText(texto.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource() == decButton){
            texto.setText(texto.getText().concat("."));
        }
        if(e.getSource() == sumButton){
            num1 = Double.parseDouble(texto.getText());
            operator = '+';
            texto.setText("");
        }
        if(e.getSource() == resButton){
            num1 = Double.parseDouble(texto.getText());
            operator = '-';
            texto.setText("");
        }
        if(e.getSource() == mulButton){
            num1 = Double.parseDouble(texto.getText());
            operator = '*';
            texto.setText("");
        }
        if(e.getSource() == divButton){
            num1 = Double.parseDouble(texto.getText());
            operator = '/';
            texto.setText("");
        }
        if(e.getSource() == igualButton){
            num2 = Double.parseDouble(texto.getText());

            switch (operator){
                case '+':
                    resul = num1 + num2;
                    break;
                case '-':
                    resul = num1 - num2;
                    break;
                case '*':
                    resul = num1 * num2;
                    break;
                case '/':
                    resul = num1 / num2;
                    break;
            }
            texto.setText(String.valueOf(resul));
            num1 = resul;
        }
        if(e.getSource() == borrButton){
            texto.setText("");
        }
        if(e.getSource() == atrButton){
            String string = texto.getText();
            texto.setText("");
            for(int i = 0; i < string.length()-1; i++){
                texto.setText(texto.getText()+string.charAt(i));
            }
        }
        if(e.getSource() == negButton){
            texto.setText("-");
            double temp = Double.parseDouble(texto.getText());
            temp*= - 1;
            texto.setText(String.valueOf(temp));
            }
        }

}

