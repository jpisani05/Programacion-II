package test;

import implementacion.ConjuntoEstatico;
import tda.ConjuntoTDA;

public class TareaConjuntos {
    public static void main(String[] args) {
        ConjuntoTDA C1 = new ConjuntoEstatico();

        C1.inicializar();

        C1.agregar(13);
        C1.agregar(4);
        C1.agregar(6);
        C1.agregar(17);
        C1.agregar(25);

        ConjuntoTDA r = sumaConjuntosMayores(C1);


        System.out.println("Los valores del nuevo conjunto son:");
        while(!r.estaVacia()){
            int valor=r.elegir();
            System.out.println(valor);
            r.sacar(valor);
        }



    }

    public static ConjuntoTDA sumaConjuntosMayores(ConjuntoTDA c1){

        ConjuntoTDA resultado= new ConjuntoEstatico();
        ConjuntoTDA aux = new ConjuntoEstatico();
        int contador=0;

        resultado.inicializar();
        aux.inicializar();

        while (!c1.estaVacia()){
            int valor = c1.elegir();
            aux.agregar(valor);
            c1.sacar(valor);
            contador++;
        }

        for (int i =0; i<contador; i++ ){
            int valor = aux.elegir();
            int suma = valor;
            int valor2 = aux.elegir();
            while (valor < valor2){
                suma += valor2;
                valor= valor2;
                valor2 = aux.elegir();
            }
            resultado.agregar(suma);
        }

        while (!aux.estaVacia()){
            int valor = aux.elegir();
            c1.agregar(valor);
            aux.sacar(valor);
        }

        return resultado;
    }



}
