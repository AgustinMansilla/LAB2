package ParcConcesionaria;

class Vendedor implements ParaPersona {
    private String nombre;
    private int cantidadDeVentas;
    private int dni;

    Vendedor(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String verNombre() {
        return this.nombre;
    }

    public void cambiarNombre(String nombreNuevo) {
        this.nombre = nombreNuevo;
    }

    public void modificarDNI(int dniNuevo) {
        this.dni = dniNuevo;
    }

    public int verCantidadDeVentas() {
        return this.cantidadDeVentas;
    }

    public void incrementarVentas(int cantidad) {
        this.cantidadDeVentas += cantidad;
    }

    public String toString() {
        return "Vendedor [nombre=" + this.nombre + ", cantidadDeVentas=" + this.cantidadDeVentas + ", dni=" + this.dni + "]";
    }
}
