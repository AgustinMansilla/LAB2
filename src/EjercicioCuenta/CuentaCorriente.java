package EjercicioCuenta;

public class CuentaCorriente {

    private double saldo;

    private String nombreTitular ;

    private long numeroCuenta;

    double numerogen = 10000000000000000000.0 + (Math.random()*99999999999999999999.0);

    long numerorandom = (long)numerogen;

    public CuentaCorriente(String nombreTitular,double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numeroCuenta = numerorandom;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void transferencia(CuentaCorriente transfer, CuentaCorriente recibe, double monto){
        if(transfer.saldo >= monto){
            transfer.saldo -= monto;
            recibe.saldo += monto;
        }
    }

    @Override
    public String toString() {
        return "Cuenta Corriente \n" +
                "Nombre del Titular='" + nombreTitular +
                ", Saldo=" + saldo +
                ", Numero de Cuenta=" + numeroCuenta +
                '}';
    }
}
