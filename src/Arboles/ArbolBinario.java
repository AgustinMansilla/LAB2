package Arboles;

public class ArbolBinario {

    private NodoABinario raiz;

    public ArbolBinario(){
        this.raiz = null;
    }

    public boolean vacio(){
        return this.raiz == null;
    }

    public void construir(NodoABinario raiz){
        this.raiz = raiz;
    }

    public void agregar(String valor){
        this.raiz = agregarRecursivo(this.raiz, valor);
    }

    private NodoABinario agregarRecursivo(NodoABinario nodo, String valor){
        if(nodo == null){
            nodo = new NodoABinario(valor);
            return nodo;
        }
        if(valor.compareTo(nodo.valor) <= 0){
            nodo.izq = agregarRecursivo(nodo.izq, valor);
        }
        else if(valor.compareTo(nodo.valor) > 0){
            nodo.der = agregarRecursivo(nodo.der, valor);
        }
        return nodo;
    }

    private NodoABinario eliminarRecursivo(NodoABinario nodo, String valor){
        NodoABinario aux = nodo;

        if (aux == null) {
            return aux;
        }

        if(valor.compareTo(aux.valor) < 0) {
            aux.izq = eliminarRecursivo(aux.izq, valor);
        }
        else if(valor.compareTo(aux.valor) > 0){
            aux.der = eliminarRecursivo(aux.der, valor);
        }
        else {
            if(aux.izq == null && aux.der == null){
                aux = null;
            }
            else if(aux.der == null){
                aux = aux.izq;
            }
            else if(aux.izq == null){
                aux = aux.der;
            }
            else {
                NodoABinario auxNodoHojaIzq  = encontrarNodoMasIzquierda(aux.der);
                aux.valor = auxNodoHojaIzq.valor;
                aux.der = eliminarRecursivo(aux.der, auxNodoHojaIzq.valor);
            }
        }

        return aux;
    }

    private NodoABinario encontrarNodoMasIzquierda(NodoABinario nodo) {
        NodoABinario aux = nodo;

        while(aux.izq != null){
            aux = aux.izq;
        }

        return aux;
    }



}

