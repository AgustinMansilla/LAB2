package FacultadPractica;

import static java.lang.Integer.parseInt;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private int nroLeg;

    public Persona(String nombre, String apellido, String nroLeg) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroLeg = Integer.parseInt(String.valueOf(parseInt(nroLeg)));
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNroLeg(int nroLeg) {
        this.nroLeg = nroLeg;
    }

    public int getNroLeg() {
        return nroLeg;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Persona\n" + "Nombre: " + nombre + " Apellido: " + apellido + " NºLeg: " + nroLeg;
    }

    public abstract void modificarDatos(String nombre, String apellido, String nroLeg);

}
