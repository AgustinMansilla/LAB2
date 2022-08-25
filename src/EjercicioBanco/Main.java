package EjercicioBanco;

public class Main {

    public static void main(String[] args) {

        //EjercicioBanco.Cliente cliente = new EjercicioBanco.Cliente(93287,"Agustin",7600);
        //EjercicioBanco.Cliente cliente2 = new EjercicioBanco.Cliente(23987,"Gasu", 8800);
        Caja caja1 = new Caja();

        //System.out.println(cliente1.getNombre());

        //COLECCI�N DE OBJETOS
        Cliente clie [] = {
                new Cliente(32876, "Gasu", 200),
                new Cliente(43872, "Agus", 400),
                new Cliente(29817,"Mansi", 500)
        };



        //RECORRIDO DE UNA COLECCI�N DE OBJETOS Y LISTARLOS

        for (Cliente cliente:clie) {

            caja1.extraer(cliente, 150 );
            caja1.soli_saldo(cliente);
            System.out.println(cliente);
        }

        Banco bank = new Banco(clie);

        System.out.println("\n\n"+bank);

    }
}
