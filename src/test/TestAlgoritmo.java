package test;

import algoritmo.AlgoritmosPila;
import implementacion.PilaEstatica;
import tda.PilaTDA;

public class TestAlgoritmo {
    public static void main(String[] args) {
        PilaTDA aux = new PilaEstatica();
        aux.inicializar();
        System.out.println("Pila inicializada");
        aux.apilar(3);
        System.out.println("Valor 3 cargado");
        aux.apilar(7);
        System.out.println("Valor 7 cargado");
        aux.apilar(1);
        System.out.println("Valor 1 cargado");
        aux.apilar(9);
        System.out.println("Valor 9 cargado");
        aux.apilar(18);
        System.out.println("Valor 18 cargado");

        System.out.println("Ultimo valor: " + aux.tope());

        AlgoritmosPila algoritmos = new AlgoritmosPila();
        algoritmos.mostrarPila(aux);
        System.out.println("Pila vacía "+ aux.estaVacia());
    }
}
