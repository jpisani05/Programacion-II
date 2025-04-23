package implementacion;

import tda.ConjuntoTDA;

import java.util.Random;

public class ConjuntoDinamico implements ConjuntoTDA {

    class nodo{
        int valor;
        nodo siguiente;
    }

    private nodo primero;
    private Random r;
    private int cantidad;

    @Override
    public void inicializar() {
        primero=null;
        cantidad=0;
    }

    @Override
    public void agregar(int valor) {
        if (!pertenece(valor)) {
            nodo aux = new nodo();
            aux.valor = valor;
            aux.siguiente = primero;
            primero = aux;
            cantidad++;
        }
    }

    @Override
    public void sacar(int valor) {
        nodo actual = primero;
        nodo anterior = null;
        boolean encontrado = false;
        while(actual != null && !encontrado){
            if (actual.valor == valor){
                if (anterior == null){
                    primero = actual.siguiente;
                }
                else{
                    anterior.siguiente = actual.siguiente;
                }
                encontrado = true;
                cantidad--;
            }
                anterior = actual;
                actual = actual.siguiente;
        }
    }

    @Override
    public int elegir() {
        r = new Random();
        int pos = r.nextInt(cantidad);
        nodo actual = primero;
        while (pos > 0){
            actual = actual.siguiente;
            pos--;
        }
        return actual.valor;
    }

    @Override
    public boolean estaVacia() {
        return primero == null;
    }

    @Override
    public boolean pertenece(int valor) {
        nodo actual = primero;
        boolean encontrado = false;
        while(actual != null && !encontrado){
            if (actual.valor == valor){
                encontrado = true;
            }
            actual = actual.siguiente;
        }

        return encontrado;
    }
}
