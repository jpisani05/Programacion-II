package algoritmo;

import implementacion.PilaEstatica;
import tda.PilaTDA;
import implementacion.PilaDinamica;

public class AlgoritmosPila {

    /**Origen debe estar inicializada y no vacía para ejecutar*/
    public void mostrarPila(PilaTDA origen) {
        //PilaTDA aux = new PilaEstatica();
        PilaTDA aux = new PilaDinamica();
        aux.inicializar();

        while (! origen.estaVacia()){
            System.out.println(origen.tope());
            aux.apilar(origen.tope());
            origen.desapilar();
        }

        while (! aux.estaVacia()){
            origen.apilar(aux.tope());
            aux.desapilar();
        }

    }

}
