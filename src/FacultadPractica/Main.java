package FacultadPractica;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        String leg;
        Scanner leer = new Scanner(System.in);

        Facultad facultad1 = new Facultad("Universidad Tecnológica Nacional");

        Carreras carreras1 = new Carreras("TUP");
        Carreras carreras2 = new Carreras("ISI");
        Carreras carreras3 = new Carreras("IQ");

        facultad1.agregarCarreras(carreras1);
        facultad1.agregarCarreras(carreras2);
        facultad1.agregarCarreras(carreras3);

        Profesor profesor1 = new Profesor("Facundo", "Matoff", "17435");
        Profesor profesor2 = new Profesor("Facundo", "Uferer", "19327");
        Profesor profesor3 = new Profesor("Cuevas", "Carlitos", "26548");

        Materias materias1 = new Materias("Programacion II", profesor1);
        Materias materias2 = new Materias("\nLaboratorio II", profesor2);
        Materias materias3 = new Materias("\nArquitectura y Sistema de Linux", profesor3);

        carreras1.agregarMateria(materias1);
        carreras1.agregarMateria(materias2);
        carreras1.agregarMateria(materias3);

        Estudiante estudiante1 = new Estudiante("Matias", "Barboza", "27431");
        Estudiante estudiante2 = new Estudiante("Agustin", "Mansilla", "26931");
        Estudiante estudiante3 = new Estudiante("Alejo", "Campanella", "28746");
        Estudiante estudiante4 = new Estudiante("Jose", "Alegre", "27492");

        materias1.agregarEstudiante(estudiante1);
        materias1.agregarEstudiante(estudiante2);
        materias3.agregarEstudiante(estudiante3);
        materias2.agregarEstudiante(estudiante4);
        materias3.agregarEstudiante(estudiante4);

        facultad1.mostrarCarreras();


        System.out.println("Ingrese un legajo: ");
        leg = leer.nextLine();

        try{
            error(leg);
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("ERROR: Eso no parece ser un número de legajo");
        }
    }

    public static void error(String numero) throws Exception{

        boolean resultado = numero.matches("[+-]?\\d*(\\.\\d+)?");
        if (!resultado){
            throw new Exception();
        }
    }
}
