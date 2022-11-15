package ParcConcesionaria;

import java.util.Iterator;
import java.util.Set;

class Concesionario extends Edificio {
    private Set<Vendedor> vendedores;
    private Set<Auto> autos;
    private int cantAutosVendidos;

    public Concesionario(String nombre, String calle, int numero, Set<Vendedor> vendedores, Set<Auto> autos) {
        super.nombre = nombre;
        super.calle = calle;
        super.numero = numero;
        this.vendedores = vendedores;
        this.autos = autos;
        this.cantAutosVendidos = 0;
    }

    public String listarVendedores() {
        String listaDeVendedores = "LISTA DE VENDEDORES \n";

        Vendedor vendedor;
        for(Iterator var2 = this.vendedores.iterator(); var2.hasNext(); listaDeVendedores = listaDeVendedores + vendedor.toString() + "\n") {
            vendedor = (Vendedor)var2.next();
        }

        return listaDeVendedores;
    }

    public String listarAutos() {
        String listaDeAutos = "LISTA DE AUTOS \n";

        Auto auto;
        for(Iterator var2 = this.autos.iterator(); var2.hasNext(); listaDeAutos = listaDeAutos + auto.toString() + "\n") {
            auto = (Auto)var2.next();
        }

        return listaDeAutos;
    }

    public boolean eliminarVendedor(String nombre) {
        Iterator var2 = this.vendedores.iterator();

        Vendedor vendedor;
        do {
            if (!var2.hasNext()) {
                return false;
            }

            vendedor = (Vendedor)var2.next();
        } while(!vendedor.verNombre().equals(nombre));

        this.vendedores.remove(vendedor);
        return true;
    }

    public boolean vender(Vendedor vendedorBuscado, Auto auto) {
        this.autos.remove(auto);
        ++this.cantAutosVendidos;
        Iterator var3 = this.vendedores.iterator();

        Vendedor vendedor;
        do {
            if (!var3.hasNext()) {
                return false;
            }

            vendedor = (Vendedor)var3.next();
        } while(!vendedor.equals(vendedorBuscado));

        vendedor.incrementarVentas(1);
        return true;
    }

    public void incorporarVendedor(Vendedor vendedorNuevo) {
        this.vendedores.add(vendedorNuevo);
    }

    public void comprarAuto(Auto autoNuevo) {
        this.autos.add(autoNuevo);
    }

    public int cantidadAutosVendidos() {
        return this.cantAutosVendidos;
    }
}
