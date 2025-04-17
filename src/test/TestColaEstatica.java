package test;

import implementacion.ColaEstatica;
import tda.ColaTDA;

public class TestColaEstatica {

    public static void main(String[] args) {
        ColaTDA aux = new ColaEstatica();
        aux.inicializar();
        aux.acolar(1);
        aux.acolar(7);
        aux.acolar(2);
        aux.acolar(9);
        aux.acolar(17);

        while (!aux.estaVacia()){
            System.out.println("Primero: " + aux.primero());
            aux.desacolar();
        }
        System.out.println("Cola vacía " + aux.estaVacia());
    }
}
