public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(93287,"Agustin",7600);
        Cliente cliente2 = new Cliente(23987,"Gasu", 8800);
        Caja caja1 = new Caja();

        System.out.println(cliente1.getNombre());
        caja1.extraer(cliente1, 4000 );

        caja1.soli_saldo(cliente1);



    }
}
