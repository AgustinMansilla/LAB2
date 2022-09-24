package Cinnne;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SaladeCine implements Informaciones {

    private int capacidad;
    private String nombreSala;
    private String nombrePeli;
    private Espectador[] espectadores;

    public SaladeCine(String nombreSala, String nombrePeli,int capacidad){
        this.nombreSala = nombreSala;
        this.nombrePeli = nombrePeli;
        this.capacidad = capacidad;
    }

    public void asignacionEspectadores(Espectador[] espectadores){
        if (espectadores.length <= capacidad){
            this.espectadores = espectadores;
        }else{
            System.out.println("Los Espectadores superan la capacidad de la sala, disculpen las molestias");
        }
    }

    public void listarEspectadores(){
        if (this.espectadores == null){
            System.out.println("SIN ESPECTADORES CARGADOS");
        }else{
            for (Espectador espectador: espectadores) {
                System.out.println(espectador.toString());

            }
        }
    }

    @Override
    public String toString(){
        return "Nombre de la Sala: "+this.nombreSala+", Pelicula: "+this.nombrePeli+", Capacidad: "+this.capacidad+'\n'
                +"Espectadores: \n"+ Arrays.toString(this.espectadores);
    }

    @Override
    public String getNombre() {
        return null;
    }
}
