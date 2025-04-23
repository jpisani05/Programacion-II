package algoritmo;

import implementacion.ColaEstatica;
import implementacion.ColaPrioridadEstatica;
import implementacion.PilaEstatica;
import tda.ColaTDA;
import tda.PilaTDA;
import tda.ColaPrioridadTDA;

public class AlgoritmoCola {

    /**Origen debe estar inicializada y no vacía para ejecutar*/
    public void mostrarPila(ColaTDA origen) {
        ColaTDA aux = new ColaEstatica();
        aux.inicializar();

        while (! origen.estaVacia()){
            System.out.println(origen.primero());
            aux.acolar( origen.primero());
            origen.desacolar();
        }

        while (! aux.estaVacia()){
            origen.acolar(aux.primero());
            aux.desacolar();
        }

    }

    public void ordenoPila(PilaTDA origen) {
        ColaPrioridadTDA aux = new ColaPrioridadEstatica();
        aux.inicializar();

        while (! origen.estaVacia()){
            aux.acolar(origen.tope(), origen.tope());
            origen.desapilar();
        }

        while (! aux.estaVacia()){
            origen.apilar(aux.primero());
            aux.desacolar();
        }
    }

    public void combinarColas(ColaPrioridadTDA CP1, ColaPrioridadTDA CP2) {
        ColaPrioridadTDA resultado = new ColaPrioridadEstatica();

        resultado.inicializar();
        while(!CP1.estaVacia()){
            resultado.acolar(CP1.primero(), CP1.prioridad());
            CP1.desacolar();
        }
        while(!CP2.estaVacia()){
            resultado.acolar(CP2.primero(), CP2.prioridad());
            CP2.desacolar();
        }

        while(!resultado.estaVacia()){
            System.out.println("Valor: " + resultado.primero() + " Prioridad: " + resultado.prioridad());
            resultado.desacolar();
        }

    }

    public void compararColas(ColaPrioridadTDA CP1, ColaPrioridadTDA CP2) {
        boolean bandera = true;
        System.out.println(CP1.estaVacia());
        System.out.println(CP2.estaVacia());
        while (!CP1.estaVacia() && !CP2.estaVacia()){
            if (CP1.primero() != CP2.primero() || CP1.prioridad() != CP2.prioridad()){
                bandera = false;
                break;
            }
            CP1.desacolar();
            CP2.desacolar();
        }

        if (bandera){
            System.out.println("Las colas son idénticas");
        }
        else {
            System.out.println("Las colas son distintas");
        }
    }

    public void mostrarCola(ColaTDA origen) {
        while(!origen.estaVacia()) {
            System.out.println("Elemento desacolado "+ origen.primero());
            origen.desacolar();
        }
    }
}
