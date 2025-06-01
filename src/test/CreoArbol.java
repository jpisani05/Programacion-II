package test;

import algoritmo.AlgoritmosABB;
import implementacion.ABB;
import implementacion.AVL;
import implementacion.ConjuntoDinamico;
import implementacion.ConjuntoEstatico;
import tda.ABBTDA;
import tda.ConjuntoTDA;

public class CreoArbol {

    public static void main(String[] args) {
        ABBTDA arbol = new AVL();
        arbol.inicializar();
        arbol.agregar(20);
        arbol.agregar(30);
        arbol.agregar(10);
        arbol.agregar(5);
        arbol.agregar(15);
        arbol.agregar(25);
        arbol.agregar(35);

        ABBTDA arbol2 = new AVL();
        arbol2.inicializar();
        arbol2.agregar(5);
        arbol2.agregar(25);
        arbol2.agregar(10);
        arbol2.agregar(20);
        arbol2.agregar(35);
        arbol2.agregar(30);
        arbol2.agregar(15);

        System.out.println("Arbol creado y Cargado");
        System.out.println("Raiz: " + arbol.raiz());
        System.out.println("Hijo Izquierdo: " + arbol.hijoIzquierdo().raiz());
        System.out.println("Hijo Derecho: " + arbol.hijoDerecho().raiz());
        System.out.println("NIeto Izquierdo: " + arbol.hijoIzquierdo().hijoIzquierdo().raiz());
        System.out.println("Nieto Izquierdo: " + arbol.hijoIzquierdo().hijoDerecho().raiz());
        System.out.println("Nieto D " + arbol.hijoDerecho().hijoIzquierdo().raiz());
        System.out.println("Nieto D " + arbol.hijoDerecho().hijoDerecho().raiz());

        AlgoritmosABB aux = new AlgoritmosABB();
        System.out.println("Cantidad de elementos: " + aux.contar(arbol));


        ConjuntoTDA conj = aux.hojas(arbol);

        while (!conj.estaVacia()){
            int k = conj.elegir();
            conj.sacar(k);
            System.out.println("Elemento 1: " + k);
        }

    }

}
