package test;

import implementacion.ColaPrioridadEstatica;
import tda.ColaPrioridadTDA;

public class TestColaPrioridad {
    public static void main(String[] args) {
        ColaPrioridadTDA aux = new ColaPrioridadEstatica();
        aux.inicializar();
        aux.acolar(7,8);
        aux.acolar(5,1);
        aux.acolar(2,2);
        aux.acolar(8,3);
        aux.acolar(6,2);

        System.out.println("------------------------------------------------------");

        while(!aux.estaVacia()){
            System.out.println("Valor: " + aux.primero() + " Prioridad: " + aux.prioridad());
            aux.desacolar();
        }


    }
}
