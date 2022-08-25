package EjercicioBanco;

import java.util.Arrays;

public class Banco {

    private Cliente clientis[];

    public Banco(Cliente clientis []){
        this.clientis = clientis;
    }

    public String toString(){
        return "Clientes del Nuevo EjercicioBanco.Banco del Chaco: \n"+ Arrays.toString(clientis);
    }


}
