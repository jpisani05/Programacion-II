package test;

import algoritmo.AlgoritmoDiccionario;
import implementacion.DiccionarioSimpleEstatico;
import tda.ConjuntoTDA;
import tda.DiccionarioSimpleTDA;

public class TareaDiccionario {
    public static void main(String[] args) {
        DiccionarioSimpleTDA d1 = new DiccionarioSimpleEstatico();

        d1.inicializar();
        d1.agregar(1,23);
        d1.agregar(3,56);
        d1.agregar(4,4656);
        d1.agregar(7,334230556);
        d1.agregar(5,9);
        d1.agregar(8,12);
        d1.agregar(12,87);
        d1.agregar(35,47412);
        d1.agregar(16,3214);
        d1.agregar(65,43763214);
        d1.agregar(99,9);

        DiccionarioSimpleTDA r = diccionarioContenido(d1);
        AlgoritmoDiccionario a = new AlgoritmoDiccionario();
        a.muestroDiccionario(r);

    }

    public static DiccionarioSimpleTDA diccionarioContenido(DiccionarioSimpleTDA d1){

        int contador=0;
        DiccionarioSimpleTDA resultado = new DiccionarioSimpleEstatico();
        resultado.inicializar();
        ConjuntoTDA claves = d1.obtenerClaves();

        while(!claves.estaVacia()){
            ConjuntoTDA claves2 = d1.obtenerClaves();
            int k =claves.elegir();
            claves.sacar(k);

            while(!claves2.estaVacia()){
                claves2.sacar(k);
                int j =claves2.elegir();
                int valor=d1.recuperar(j);
                int valorprimario=d1.recuperar(k);
                int division= 10;
                int resto;
                int noresto = valor;

                while (noresto>0){
                    noresto = valor/division;
                    resto = valor%division;
                    division = division*10;
                    if (valorprimario==noresto){
                        resultado.agregar(k,valorprimario);
                        resultado.agregar(j,d1.recuperar(j));
                        noresto=0;
                        resto=0;
                    }
                    if (valorprimario==resto){
                        resultado.agregar(k,valorprimario);
                        resultado.agregar(j,d1.recuperar(j));
                        noresto=0;
                        resto=0;
                    }

                    while (resto >0){
                        resto = resto/10;
                        if (valorprimario==resto){
                            resultado.agregar(k,valorprimario);
                            resultado.agregar(j,d1.recuperar(j));
                            noresto=0;
                            resto=0;
                        }
                    }
                }

                claves2.sacar(j);

            }


            contador++;
        }


        return resultado;
    }
}
