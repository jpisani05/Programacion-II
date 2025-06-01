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

    public int menor(ABBTDA arbol){
        if (arbol.hijoIzquierdo().arbolVacio()){
            return arbol.raiz();
        }
        else {
            return menor(arbol.hijoDerecho());
        }
    }

    public int suma(ABBTDA arbol){
        if (arbol.hijoIzquierdo().arbolVacio() && arbol.hijoDerecho().arbolVacio()){
            return arbol.raiz();
        }
        else {
            return arbol.raiz() + suma(arbol.hijoDerecho()) + suma(arbol.hijoIzquierdo());
        }
    }


    public int sumaHojas(ABBTDA arbol){
        if (arbol.hijoIzquierdo().arbolVacio() && arbol.hijoDerecho().arbolVacio()){
            return 1;
        }

        else {
            return sumaHojas(arbol.hijoIzquierdo()) + sumaHojas(arbol.hijoDerecho());
        }
    }

    private int profundidad(int valor, ABBTDA arbol){
        if (valor == arbol.raiz()){
            return 0;
        }

        else {
            if (valor > arbol.raiz()){
                return 1 + profundidad(valor, arbol.hijoDerecho());
            }

            else {
                return 1 + profundidad(valor, arbol.hijoIzquierdo());
            }
        }

    }


    public int altura(ABBTDA arbol){
        ConjuntoTDA hojas = hojas(arbol);
        int mayor = 0;
        while (!hojas.estaVacia()){
            int k = hojas.elegir();
            hojas.sacar(k);

            int profundo = profundidad(k, arbol);
            if (mayor < profundo){
                mayor = profundo;
            }
        }

        return mayor;
    }


    public boolean igualdad(ABBTDA arbol, ABBTDA arbol2){
        ConjuntoTDA aux = aconjuntar(arbol);
        ConjuntoTDA aux2 = aconjuntar(arbol2);

        while (!aux2.estaVacia()){
            int k = aux2.elegir();
            aux2.sacar(k);

            if (!aux.pertenece(k)){
                return false;
            }
        }
        return true;
    }


    public ConjuntoTDA aconjuntar(ABBTDA arbol){
        ConjuntoTDA conjuntoArbol = new ConjuntoDinamico();
        conjuntoArbol.inicializar();

        conjuntoArbol.agregar(arbol.raiz());

        if (!arbol.hijoIzquierdo().arbolVacio()){
            ConjuntoTDA conjuntoAux = aconjuntar(arbol.hijoIzquierdo());
            while (!conjuntoAux.estaVacia()){
                int k = conjuntoAux.elegir();
                conjuntoAux.sacar(k);
                conjuntoArbol.agregar(k);
            }
        }

        if (!arbol.hijoDerecho().arbolVacio()){
            ConjuntoTDA conjuntoAux = aconjuntar(arbol.hijoDerecho());
            while (!conjuntoAux.estaVacia()){
                int k = conjuntoAux.elegir();
                conjuntoAux.sacar(k);
                conjuntoArbol.agregar(k);
            }
        }

        return conjuntoArbol;
    }




}
