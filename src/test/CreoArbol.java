package test;

import algoritmo.AlgoritmosABB;
import implementacion.*;
import tda.ABBTDA;
import tda.ConjuntoTDA;
import tda.DiccionarioMultipleTDA;
import tda.DiccionarioSimpleTDA;

public class CreoArbol {

    public static void main(String[] args) {
        ABBTDA arbol = new ABB();
        arbol.inicializar();
        arbol.agregar(20);
        arbol.agregar(30);
        arbol.agregar(10);
        arbol.agregar(5);
        arbol.agregar(15);
        arbol.agregar(25);
        arbol.agregar(35);

        System.out.println(arbol.hijoDerecho().raiz());




        System.out.println("-----------------------------");
        ABBTDA arbol2 = new AVL();
        arbol2.inicializar();
        arbol2.agregar(5);
        arbol2.agregar(25);

        System.out.println(arbol2.raiz());

        arbol2.agregar(10);

        System.out.println(arbol2.raiz());

        arbol2.agregar(20);
        arbol2.agregar(35);
        arbol2.agregar(30);

        System.out.println(arbol2.raiz());
        //System.out.println(arbol2.hijoDerecho().hijoDerecho().raiz());
        System.out.println(arbol2.hijoDerecho().hijoIzquierdo().raiz());

        arbol2.agregar(15);
        arbol2.agregar(12);
        arbol2.agregar(37);
        arbol2.agregar(4);
        arbol2.agregar(6);
        arbol2.agregar(29);
        arbol2.agregar(31);
        arbol2.agregar(36);
        arbol2.agregar(39);

        System.out.println("--------------------");

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

        ConjuntoTDA Descendientes = aux.obtenerDescendientes(arbol);

        System.out.println("--------------------------------");

        System.out.println("Descendientes arbol 1: ");

        while (!Descendientes.estaVacia()){
            int k = Descendientes.elegir();
            Descendientes.sacar(k);
            System.out.println(k);
        }

        System.out.println("---------------------------------");

        DiccionarioMultipleTDA dic = aux.multiNodo(arbol);
        ConjuntoTDA c1 = dic.obtenerClaves();

        while (!c1.estaVacia()){
            int k = c1.elegir();
            c1.sacar(k);
            ConjuntoTDA c2 = dic.recuperar(k);
            System.out.println(k+"VALORES:");
            while (!c2.estaVacia()){
                int k2 = c2.elegir();
                c2.sacar(k2);
                System.out.println(k2 + "-");
            }
        }
        System.out.println("");
        System.out.println("-----------------------");


        ConjuntoTDA conj = aux.hojas(arbol);

        while (!conj.estaVacia()){
            int k = conj.elegir();
            conj.sacar(k);
            System.out.println("Elemento 1: " + k);
        }


        System.out.println(aux.altura(arbol2));

        DiccionarioMultipleTDA dicm = new DiccionarioMultipleEstatico();
        dicm.inicializar();
        dicm.agregar(20,6);
        dicm.agregar(30,2);
        dicm.agregar(10,4);
        dicm.agregar(5,5);
        dicm.agregar(15,6);
        dicm.agregar(25,1);
        dicm.agregar(35,0);
        dicm.agregar(20,3);
        dicm.agregar(30,7);
        dicm.agregar(10,1);
        dicm.agregar(5,9);
        dicm.agregar(15,2);
        dicm.agregar(25,8);
        dicm.agregar(35,4);

        dicm.agregar(20,5);
        dicm.agregar(30,0);
        dicm.agregar(10,6);
        dicm.agregar(5,2);
        dicm.agregar(15,9);
        dicm.agregar(25,3);
        dicm.agregar(35,7);

        dicm.agregar(20,1);
        dicm.agregar(30,6);
        dicm.agregar(10,0);
        dicm.agregar(5,8);
        dicm.agregar(15,4);
        dicm.agregar(25,5);
        dicm.agregar(35,2);

        dicm.agregar(20,7);
        dicm.agregar(30,3);
        dicm.agregar(10,5);
        dicm.agregar(5,6);
        dicm.agregar(15,0);
        dicm.agregar(25,2);
        dicm.agregar(35,1);

        dicm.agregar(20,9);
        dicm.agregar(30,5);
        dicm.agregar(10,3);
        dicm.agregar(5,0);
        dicm.agregar(15,8);
        dicm.agregar(25,6);
        dicm.agregar(35,4);

        dicm.agregar(20,2);
        dicm.agregar(30,8);
        dicm.agregar(10,7);
        dicm.agregar(5,1);
        dicm.agregar(15,3);
        dicm.agregar(25,0);
        dicm.agregar(35,6);

        dicm.agregar(20,4);
        dicm.agregar(30,1);
        dicm.agregar(10,9);
        dicm.agregar(5,3);
        dicm.agregar(15,5);
        dicm.agregar(25,7);
        dicm.agregar(35,8);

        DiccionarioSimpleTDA dics = aux.dicArbol(arbol,dicm);

        ConjuntoTDA claves = dics.obtenerClaves();

        System.out.println("--------------------------------------------");

        while(!claves.estaVacia()){
            int k = claves.elegir();
            claves.sacar(k);
            System.out.println("Clave: "+ k + " Valor: " + dics.recuperar(k));
        }




    }

}
