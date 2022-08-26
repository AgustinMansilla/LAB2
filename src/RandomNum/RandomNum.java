package RandomNum;

import java.util.Scanner;

public class RandomNum {
    public static void main(String[]args){
        double numaleatorio = 1 + (Math.random()*100);// "n + (Math.random * N)"
                                                      // genera un numero random entre 1 y 100
        int elverdaderonumeroaleatorio = (int)numaleatorio;
        int cont = 0;
        double numuser = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola vamos a jugar a ver si adivinas que numero estoy pensando!");
        numuser = leer.nextDouble();

        while (numuser != elverdaderonumeroaleatorio){
            if(numuser < elverdaderonumeroaleatorio){
                System.out.println("El numero es mayor jiji");
            }else {
                System.out.println("El numero es menor jiji");
            }
            cont++;
            numuser = leer.nextDouble();

        }
        System.out.println("Acertaste! Correcto, solo te tomó "+cont+" intentos!");
    }
}
