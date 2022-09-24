package FacultadPractica;

import static java.lang.Integer.parseInt;

public class Estudiante extends Persona{

    public Estudiante(String nombre, String apellido, String nroLeg) {
        super(nombre, apellido, nroLeg);
    }

    public void modificarDatos(String nombre, String apellido, String nroLeg) {
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setNroLeg(Integer.parseInt(String.valueOf(parseInt(nroLeg))));
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + ", Apellido: " + super.getApellido() + ", Nº Leg: " + super.getNroLeg();
    }

}
