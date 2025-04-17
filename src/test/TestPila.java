package test;

import implementacion.PilaEstatica;
import tda.PilaTDA;

public class TestPila {

    public static void main(String[] args) {

        PilaTDA aux = new PilaEstatica();
        aux.iniciarlizar();
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

        while (! aux.estaVacia()){
            System.out.println(aux.tope());
            aux.desapilar();
        }

        System.out.println("Pila vacia " + aux.estaVacia());
    }
}
