package test;

import algoritmo.AlgoritmoCola;
import algoritmo.AlgoritmosPila;
import implementacion.PilaEstatica;
import tda.PilaTDA;

public class TestAlgoritmoPilaCola {

    public static void main(String[] args) {
        PilaTDA origen = new PilaEstatica();
        origen.iniciarlizar();
        origen.apilar(1);
        origen.apilar(9);
        origen.apilar(2);
        origen.apilar(8);
        origen.apilar(4);
        origen.apilar(6);

        AlgoritmoCola aux = new AlgoritmoCola();
        aux.ordenoPila(origen);
        AlgoritmosPila aux2 = new AlgoritmosPila();
        aux2.mostrarPila(origen);


    }

}
