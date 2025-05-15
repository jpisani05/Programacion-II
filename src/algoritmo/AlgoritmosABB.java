package algoritmo;

import implementacion.ConjuntoDinamico;
import implementacion.ConjuntoEstatico;
import tda.ABBTDA;
import tda.ConjuntoTDA;

public class AlgoritmosABB {

    public int contar(ABBTDA arbol){
        if (arbol.arbolVacio()){
            return 0;
        }
        else {
            return 1 + contar(arbol.hijoIzquierdo())+ contar(arbol.hijoDerecho());
        }
    }

    public ConjuntoTDA hojas (ABBTDA arbol){
        ConjuntoTDA conjuntoHojas = new ConjuntoDinamico();
        AlgoritmoConjunto aux = new AlgoritmoConjunto();


        conjuntoHojas.inicializar();

        if (arbol.hijoIzquierdo().arbolVacio() && arbol.hijoDerecho().arbolVacio()){
            conjuntoHojas.agregar(arbol.raiz());
        }
        else {
            if (!arbol.hijoDerecho().arbolVacio()){
                ConjuntoTDA conjuntoHojas2 = hojas(arbol.hijoDerecho());
                //aux.unionConjunto(conjuntoHojas2,conjuntoHojas);

                while (!conjuntoHojas2.estaVacia()){
                    int k = conjuntoHojas2.elegir();
                    conjuntoHojas2.sacar(k);
                    conjuntoHojas.agregar(k);
                }

            }
            if (!arbol.hijoIzquierdo().arbolVacio()){
                ConjuntoTDA conjuntoHojas3 = hojas(arbol.hijoIzquierdo());
                //aux.unionConjunto(conjuntoHojas3,conjuntoHojas);
                while (!conjuntoHojas3.estaVacia()){
                    int k = conjuntoHojas3.elegir();
                    conjuntoHojas3.sacar(k);
                    conjuntoHojas.agregar(k);
                }
            }
        }

        return conjuntoHojas;
    }


}
