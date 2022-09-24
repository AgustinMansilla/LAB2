package Clase_01_09_22;

import java.util.Scanner;

public abstract class Geometria {

        public abstract double area();
        public abstract double perimetro();
        int base, altura;
        Scanner leer = new Scanner(System.in);

        public void Rectangulo(double base, double altura){
            this.base= (int) base;
            this.altura= (int) altura;
        }

}
