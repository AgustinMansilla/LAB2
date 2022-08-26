package EjercicioPeso;

import java.util.Scanner;

public class CalculoPeso {
    public static void main(String[] args){
        String genero;
        int altura;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su genero(Hombre o Mujer): ");
        genero = leer.next();
        System.out.print("Ingrese su altura: ");
        altura = leer.nextInt();

        while (!genero.equals("Hombre") && !genero.equals("Mujer")){
            System.out.println("Error en su genero, ingrese de nuevo");
            System.out.print("Ingrese su genero(Hombre o Mujer): ");
            genero = leer.next();
        }

        if(genero == "Hombre"){
            System.out.println("Su peso ideal es de: "+(altura-110));
        }else{
            System.out.println("Su peso ideal es de: "+(altura-120));
        }
    }
}
