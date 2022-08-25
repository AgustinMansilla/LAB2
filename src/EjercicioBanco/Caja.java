package EjercicioBanco;

public class Caja {

    public void extraer(Cliente titular, double monto){
        titular.setSaldo(titular.getSaldo() - monto);
    }

    public void ingresar(Cliente titular, double monto){
        titular.setSaldo(titular.getSaldo() + monto);
    }

    public void soli_saldo(Cliente titular){
        System.out.println("El saldo de este cuenta es: "+titular.getSaldo());
    }

}
