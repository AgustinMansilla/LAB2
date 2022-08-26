package Ejercicio26_08;

public class CuentaCorriente {

    private double saldo;

    private String nombreTitular ;

    private long numeroCuenta;

    public CuentaCorriente(String nombreTitular,double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
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

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void transferencia(CuentaCorriente transfer, CuentaCorriente recibe, double monto){
        if(transfer.saldo >= monto){
            transfer.saldo -= monto;
            recibe.saldo += monto;
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "saldo=" + saldo +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                '}';
    }
}
