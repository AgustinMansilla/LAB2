package EjercicioBanco25_08;

import java.util.Arrays;

public class Banco {

    private Cliente clientis[];

    public Banco(Cliente clientis []){
        this.clientis = clientis;
    }

    public String toString(){
        return "Clientes del Nuevo Banco del Chaco: \n\n"+ Arrays.toString(clientis);
    }


}
