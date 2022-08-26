package EjercicioRaiz;

import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);
        int numero;

        System.out.print("Introduzca un numero: ");
        numero = leer.nextInt();
        System.out.println("La raiz de '"+numero+"' es: "+Math.sqrt(numero));

    }
}
