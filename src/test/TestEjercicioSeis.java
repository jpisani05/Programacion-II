package test;

import algoritmo.AlgoritmoCola;
import implementacion.ColaPrioridadEstatica;
import tda.ColaPrioridadTDA;

public class TestEjercicioSeis {

    public static void main(String[] args) {
        ColaPrioridadTDA aux = new ColaPrioridadEstatica();
        ColaPrioridadTDA aux2 = new ColaPrioridadEstatica();
        ColaPrioridadTDA aux3 = new ColaPrioridadEstatica();


        aux.inicializar();
        aux2.inicializar();
        aux3.inicializar();

        aux.acolar(1,1);
        aux.acolar(1,2);
        aux.acolar(1,3);
        aux.acolar(1,4);
        aux.acolar(1,5);

        aux2.acolar(2,1);
        aux2.acolar(2,2);
        aux2.acolar(2,3);
        aux2.acolar(2,4);
        aux2.acolar(2,5);

        aux3.acolar(2,1);
        aux3.acolar(2,2);
        aux3.acolar(2,3);
        aux3.acolar(2,4);
        aux3.acolar(2,5);

        AlgoritmoCola resultado = new AlgoritmoCola();

        AlgoritmoCola resultado2 = new AlgoritmoCola();

        resultado.combinarColas(aux, aux2);

        aux.acolar(1,1);
        aux.acolar(1,2);
        aux.acolar(1,3);
        aux.acolar(1,4);
        aux.acolar(1,5);

        aux2.acolar(2,1);
        aux2.acolar(2,2);
        aux2.acolar(2,3);
        aux2.acolar(2,4);
        aux2.acolar(2,5);

        resultado2.compararColas(aux, aux3);
        resultado2.compararColas(aux2, aux3);



    }

}
