package test;

import algoritmo.AlgoritmoDiccionario;
import algoritmo.AlgoritmoDiccionarioMultiple;
import implementacion.DiccionarioMultipleEstatico;
import tda.ConjuntoTDA;
import tda.DiccionarioMultipleTDA;

public class TestDiccionarioMultiple {
    public static void main(String[] args) {

        DiccionarioMultipleTDA dic = new DiccionarioMultipleEstatico();
        dic.inicializar();
        dic.agregar(1,15);
        dic.agregar(2,10);
        dic.agregar(3,30);
        dic.agregar(1,3);


        ConjuntoTDA claves = dic.obtenerClaves();
        while(!claves.estaVacia()){
            int k = claves.elegir();
            claves.sacar(k);
            ConjuntoTDA valores = dic.recuperar(k);
            System.out.println("Clave: " + k);
            while(!valores.estaVacia()){
                int v = valores.elegir();
                valores.sacar(v);
                System.out.println("Valor: " + v);
            }
            System.out.println("");
        }

        DiccionarioMultipleTDA dic2 = new DiccionarioMultipleEstatico();
        DiccionarioMultipleTDA dic3 = new DiccionarioMultipleEstatico();
        dic2.inicializar();
        dic3.inicializar();

        dic2.agregar(1,15);
        dic2.agregar(2,10);
        dic3.agregar(2,30);
        dic3.agregar(1,15);

        DiccionarioMultipleTDA aux = new DiccionarioMultipleEstatico();
        AlgoritmoDiccionarioMultiple resultado = new AlgoritmoDiccionarioMultiple();
        aux.inicializar();
        aux = resultado.interseccionDiccionarios(dic2,dic3);


        ConjuntoTDA claves2 = aux.obtenerClaves();
        while(!claves2.estaVacia()){
            int k = claves2.elegir();
            claves2.sacar(k);
            ConjuntoTDA valores2 = aux.recuperar(k);
            System.out.println("Clave: " + k);
            while(!valores2.estaVacia()){
                int v = valores2.elegir();
                valores2.sacar(v);
                System.out.println("Valor: " + v);
            }
            System.out.println("");
        }


    }
}
