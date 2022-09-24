package Cinnne;

public abstract class Persona implements Informaciones{
    protected String nombre;
    protected int DNI;

    public Persona(String nombre){
        this.nombre=nombre;
        generardni();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    private void generardni(){
        this.DNI = (int) (Math.random()*99999999);
    }

    @Override
    public String toString(){
        return "Nombre : "+this.nombre+", DNI: "+this.DNI+'\n';
    }

}
