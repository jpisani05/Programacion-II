package test;

import implementacion.DiccionarioMultipleEstatico;
import tda.ConjuntoTDA;
import tda.DiccionarioMultipleTDA;

public class TareaDiccionarioMultiple {

    public static void main(String[] args) {

        DiccionarioMultipleTDA d1 = new DiccionarioMultipleEstatico();

        d1.inicializar();

        d1.agregar(2,3);
        d1.agregar(2,5);
        d1.agregar(2,7);
        d1.agregar(2,9);
        d1.agregar(2,10);
        d1.agregar(3,2);
        d1.agregar(3,5);
        d1.agregar(3,6);
        d1.agregar(3,19);
        d1.agregar(3,1);
        d1.agregar(4,19);
        d1.agregar(4,5);
        d1.agregar(4,4);
        d1.agregar(4,9);
        d1.agregar(4,11);


        DiccionarioMultipleTDA r = valoresContenidosEnClave(d1);
        ConjuntoTDA claves = r.obtenerClaves();
        while(!claves.estaVacia()){
            int k = claves.elegir();
            claves.sacar(k);
            ConjuntoTDA valores = r.recuperar(k);
            System.out.println("Clave: " + k);
            while(!valores.estaVacia()){
                int v = valores.elegir();
                valores.sacar(v);
                System.out.println("Valor: " + v);
            }
            System.out.println("");
        }

    }

    public static DiccionarioMultipleTDA valoresContenidosEnClave(DiccionarioMultipleTDA d1){

        DiccionarioMultipleTDA resultado = new DiccionarioMultipleEstatico();
        resultado.inicializar();

        ConjuntoTDA claves = d1.obtenerClaves();
        while(!claves.estaVacia()){
            ConjuntoTDA claves2 = d1.obtenerClaves();
            int k = claves.elegir();
            ConjuntoTDA valores = d1.recuperar(k);
            claves.sacar(k);
            claves2.sacar(k);
            while(!claves2.estaVacia()){
                int j = claves2.elegir();
                claves2.sacar(j);
                while (!valores.estaVacia()){
                    int valor1 = valores.elegir();
                    ConjuntoTDA valores2 =d1.recuperar(j);
                    while(!valores2.estaVacia()){
                        int valor2 = valores2.elegir();
                        if (valor1 == valor2){
                            resultado.agregar(valor1,k);
                            resultado.agregar(valor1,j);
                        }
                        valores2.sacar(valor2);

                    }
                    valores.sacar(valor1);
                }

            }
        }


        return resultado;
    }
}
