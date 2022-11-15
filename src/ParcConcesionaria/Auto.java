package ParcConcesionaria;

class Auto {
    private int cantidadPuertas;
    private String marcas;
    private int modelo;
    private double precio;
    private int kilometros;

    Auto(int cantidadPuertas, String marca, int modelo, double precio) {
        this.cantidadPuertas = cantidadPuertas;
        this.marcas = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.kilometros = 0;
    }

    public void mover(int km) {
        this.kilometros = km;
    }

    public String toString() {
        return "Auto [cantidadPuertas=" + this.cantidadPuertas + ", marcas=" + this.marcas + ", modelo=" + this.modelo + ", precio=" + this.precio + ", kilometros=" + this.kilometros + "]";
    }
}
