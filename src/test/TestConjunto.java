package test;

import algoritmo.AlgoritmoConjunto;
import implementacion.ConjuntoEstatico;
import tda.ConjuntoTDA;

public class TestConjunto {
    public static void main(String[] args) {
        ConjuntoTDA aux = new ConjuntoEstatico();
        ConjuntoTDA aux2 = new ConjuntoEstatico();
        aux.inicializar();
        aux.agregar(5);
        aux.agregar(28);
        aux.agregar(13);
        aux.agregar(59);
        aux.agregar(43);
        aux.agregar(2);

        aux2.inicializar();
        aux2.agregar(8);
        aux2.agregar(28);
        aux2.agregar(13);
        aux2.agregar(6);
        aux2.agregar(7);
        aux2.agregar(2);

        AlgoritmoConjunto resultado = new AlgoritmoConjunto();
        ConjuntoTDA r = resultado.interseccionConjunto(aux,aux2);

        while (!r.estaVacia()){
            int valor =r.elegir();
            System.out.println(valor);
            r.sacar(valor);
            }
        /*while (!aux.estaVacia()){
            int valor = aux.elegir();
            System.out.println(valor);
            aux.sacar(valor);
        }*/
    }
}
