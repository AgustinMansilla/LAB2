package Cuestionario_12;

public class Clase1 {
    public void metodo1(){
        System.out.println(datos);
    }
    String nombre;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Clase1(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    String datos="datos";
}
