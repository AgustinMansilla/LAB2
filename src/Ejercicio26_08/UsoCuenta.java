package Ejercicio26_08;

public class UsoCuenta {
    public static void main(String[] args){
        CuentaCorriente cuenta1 = new CuentaCorriente("Mansilla Agustin", 5000);
        CuentaCorriente cuenta2 = new CuentaCorriente("Vallejos Rodrigo", 700000);

        cuenta1.transferencia(cuenta1, cuenta2, 2500);
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
    }
}
