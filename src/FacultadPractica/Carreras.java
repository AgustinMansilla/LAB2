package FacultadPractica;

import java.util.LinkedList;

public class Carreras {

    private String nombre;
    private LinkedList<Materias> coleccionMaterias;

    public Carreras(String nombre) {
        this.nombre = nombre;
        this.coleccionMaterias = new LinkedList<>();
    }

    public void agregarMateria(Materias materias){
        this.coleccionMaterias.add(materias);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Carreras: \n" + "Nombre: " + nombre +"\nMaterias:\n" + coleccionMaterias;
    }
}
