package FacultadPractica;

import java.util.LinkedList;

public class Facultad {

    private String nombre;
    private LinkedList<Carreras>coleccionCarrera;

    public Facultad(String nombre) {
        this.nombre = nombre;
        coleccionCarrera = new LinkedList<>();
    }

    public void agregarCarreras(Carreras carrerasNuevas){
            this.coleccionCarrera.add(carrerasNuevas);
    }

    public void mostrarCarreras(){
        for (Carreras carreras:coleccionCarrera) {
            System.out.println(carreras);
        }
    }

}
