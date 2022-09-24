package Cinnne;

public class Empleado extends Persona{

    public double sueldo;

    public Empleado(String nombre) {
        super(nombre);
        this.sueldo = sueldo;
    }

    public double getSueldo(){
        return sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        return super.toString() +", Sueldo: "+this.sueldo;//Es mejor siempre poner "this.sueldo" que llamar al metodo "getSueldo" ya que el this hace referencia a esta clase, es para mejor lectura de codigo
    }

}
