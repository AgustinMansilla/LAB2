package Cinnne;

import java.util.Scanner;

public class Cine {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int cantEspectadores;

        SaladeCine salaCine1 = new SaladeCine("Sala Nº 1", "Harry Potter y La Piedra Filosofal", 20);
        SaladeCine salaCine2 = new SaladeCine("Sala Nº 2", "Harry Potter y La Camara Secreta", 20);
        SaladeCine salaCine3 = new SaladeCine("Sala Nº 3", "Harry Potter y El Prisionero de Askaban", 20);

        System.out.println("Ingrese la cantidad de espectadores: ");
        cantEspectadores = leer.nextInt();
        leer.nextLine();
        Espectador[] espectadores1 = new Espectador[cantEspectadores];
        Espectador[] espectadores2 = new Espectador[cantEspectadores];
        Espectador[] espectadores3 = new Espectador[cantEspectadores];

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                for (int j = 0; j < espectadores1.length; j++) {
                    System.out.println("Ingrese el nombre del espectador para la 1er Pelicula " + (j + 1) + ": ");
                    String nombre = leer.nextLine();
                    System.out.println("Ingrese la butaca " + (j + 1) + ": ");
                    String butaca = leer.nextLine();
                    espectadores1[j] = new Espectador(nombre, butaca);
                }
            }else if (i == 1) {
                for (int j = 0; j < espectadores2.length; j++) {
                    System.out.println("Ingrese el nombre del espectador para la 2da Pelicula" + (j + 1) + ": ");
                    String nombre = leer.nextLine();
                    System.out.println("Ingrese la butaca " + (j + 1) + ": ");
                    String butaca = leer.nextLine();
                    espectadores2[j] = new Espectador(nombre, butaca);
                }
            }else{
                for (int j = 0; j < espectadores3.length; j++) {
                    System.out.println("Ingrese el nombre del espectador para la 3er Pelicula" + (j + 1) + ": ");
                    String nombre = leer.nextLine();
                    System.out.println("Ingrese la butaca " + (j + 1) + ": ");
                    String butaca = leer.nextLine();
                    espectadores3[j] = new Espectador(nombre, butaca);
                }
            }
        }

        salaCine1.asignacionEspectadores(espectadores1);
        System.out.println(salaCine1.toString());

        salaCine2.asignacionEspectadores(espectadores2);
        System.out.println(salaCine2.toString());

        salaCine3.asignacionEspectadores(espectadores3);
        System.out.println(salaCine3.toString());

    }
}
