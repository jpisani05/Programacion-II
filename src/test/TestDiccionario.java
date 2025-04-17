package test;

import algoritmo.AlgoritmoDiccionario;
import implementacion.DiccionarioSimpleEstatico;
import tda.DiccionarioSimpleTDA;

public class TestDiccionario {
    public static void main(String[] args) {
        DiccionarioSimpleTDA aux = new DiccionarioSimpleEstatico();
        aux.inicializar();
        aux.agregar(10,22133575);
        aux.agregar(20,24234234);
        aux.agregar(30,24262543);
        aux.agregar(40,26565415);
        aux.agregar(50,24344356);
        aux.agregar(60,26435324);
        aux.agregar(70,25213586);
        aux.agregar(80,23246265);
        aux.agregar(90,27413475);
        AlgoritmoDiccionario a = new AlgoritmoDiccionario();
        a.muestroDiccionario(aux);

    }
}
