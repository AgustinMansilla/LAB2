package EjercicioBanco25_08;

public class Cliente {

    private int nrocli;
    private double saldo;
    private String nombre;

    public Cliente(int nrocli, String nombre, double saldo) {
        this.nrocli = nrocli;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getNrocli() {
        return nrocli;
    }

    public void setNrocli(int nrocli) {
        this.nrocli = nrocli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nrocli=" + nrocli +
                " Saldo=" + saldo +
                " Nombre='" + nombre + "'\n";
    }
}
