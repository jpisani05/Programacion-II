package algoritmo;

import implementacion.DiccionarioMultipleEstatico;
import tda.ConjuntoTDA;
import tda.DiccionarioMultipleTDA;
import tda.DiccionarioSimpleTDA;

public class AlgoritmoDiccionarioMultiple {

    public DiccionarioMultipleTDA interseccionDiccionarios(DiccionarioMultipleTDA d1, DiccionarioMultipleTDA d2){
        DiccionarioMultipleTDA resultado = new DiccionarioMultipleEstatico();
        resultado.inicializar();

        //Obtengo las claves de ambos dicciconarios
        ConjuntoTDA clavesd1 = d1.obtenerClaves();
        ConjuntoTDA clavesd2 = d2.obtenerClaves();

        while (!clavesd1.estaVacia()){
            int k = clavesd1.elegir();
            clavesd1.sacar(k);
            if (clavesd2.pertenece(k)){
                ConjuntoTDA valoresd1 = d1.recuperar(k);
                ConjuntoTDA valoresd2 = d2.recuperar(k);
                while (!valoresd1.estaVacia()){
                    int v = valoresd1.elegir();
                    valoresd1.sacar(v);
                    if (valoresd2.pertenece(v)){
                        resultado.agregar(k,v);
                    }
                }
            }

        }


        return resultado;
    }

}
