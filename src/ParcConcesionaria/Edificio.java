package ParcConcesionaria;

class Edificio {
    protected String nombre;
    protected String calle;
    protected int numero;
    protected String localidad;
    protected String provincia;

    Edificio() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Edificio [calle=" + this.calle + ", numero=" + this.numero + ", localidad=" + this.localidad + ", provincia=" + this.provincia + "]";
    }
}
