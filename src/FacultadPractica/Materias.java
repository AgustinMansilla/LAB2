package FacultadPractica;

import java.util.LinkedList;

public class Materias {

    private String nombremateria;
    private Profesor titular;
    private LinkedList<Estudiante> coleccionEstudiante;

    public Materias(String nombremateria, Profesor titular){
        this.nombremateria = nombremateria;
        this.titular = titular;
        coleccionEstudiante = new LinkedList<>();
    }

    public void agregarEstudiante(Estudiante estudianteNuevo){
        this.coleccionEstudiante.add(estudianteNuevo);
    }

    @Override
    public String toString() {
        return nombremateria + " Titular: " + titular + "\nEstudiante: " + coleccionEstudiante;
    }

    public void listarEstudiantes(){
        for (Estudiante estudiante: coleccionEstudiante) {
            System.out.println(estudiante);
        }
    }
}
