package EjercicioCuenta;

public class UsoCuenta {
    public static void main(String[] args){
        CuentaCorriente cuenta1 = new CuentaCorriente("Mansilla Agustin", 5000);
        CuentaCorriente cuenta2 = new CuentaCorriente("Vallejos Rodrigo", 7000);
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString()+"\n");
        cuenta1.transferencia(cuenta1, cuenta2, 2500);
        System.out.print("-------------------------------------------");
        System.out.println("\nA continuación procesamos la transferencia");
        System.out.print("-------------------------------------------\n\n");
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
    }
}
