package algoritmo;

import tda.ConjuntoTDA;
import tda.DiccionarioSimpleTDA;

public class AlgoritmoDiccionario {
    public void muestroDiccionario(DiccionarioSimpleTDA d1){

        ConjuntoTDA claves = d1.obtenerClaves();
        while (!claves.estaVacia()){
            int k =claves.elegir();
            claves.sacar(k);
            System.out.println("Clave: " + k + " Valor: " + d1.recuperar(k));
        }
    }
}
