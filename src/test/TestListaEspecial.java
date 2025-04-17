package test;

import implementacion.ListaEspecialEstatica;
import tda.ListaEspecialTDA;

public class TestListaEspecial {

    public static void main(String[] args) {
        ListaEspecialTDA aux = new ListaEspecialEstatica();
        aux.inicializar();
        aux.alistar(1);
        aux.alistar(7);
        aux.alistar(2);
        aux.alistar(9);
        aux.alistar(17);

        while (!aux.estaVacia()){
            System.out.println("Primero: " + aux.primero());
            aux.desalistar();
        }
        System.out.println("Lista vacía " + aux.estaVacia());
    }
}
