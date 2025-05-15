package algoritmo;

import implementacion.ConjuntoDinamico;
import implementacion.ConjuntoEstatico;
import tda.ConjuntoTDA;

public class AlgoritmoConjunto {

    public static ConjuntoTDA interseccionConjunto(ConjuntoTDA c1, ConjuntoTDA c2) {
        ConjuntoTDA aux = new ConjuntoEstatico();
        ConjuntoTDA interseccion = new ConjuntoEstatico();
        aux.inicializar();
        interseccion.inicializar();

        while (!c1.estaVacia()){
            int valor = c1.elegir();
            if (c2.pertenece(valor)){
                interseccion.agregar(valor);
            }
            aux.agregar(valor);
            c1.sacar(valor);
        }
        while (!aux.estaVacia()){
            int valor =aux.elegir();
            c1.agregar(valor);
            aux.sacar(valor);
        }


        return interseccion;

    }

    public static ConjuntoTDA unionConjunto(ConjuntoTDA c1, ConjuntoTDA c2) {

        while (c1.estaVacia()){
            int k = c1.elegir();
            c1.sacar(k);
            c2.agregar(k);
        }


        return c2;
    }


}
