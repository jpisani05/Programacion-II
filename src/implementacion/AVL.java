package implementacion;

import tda.ABBTDA;

public class AVL implements ABBTDA {

    NodoAVL nodo;

    public AVL() {
    }

    public void agregar(int valor) {
        if (nodo == null) {
            nodo = new NodoAVL();
            nodo.raiz = valor;
            nodo.hijoIzquierdo = new AVL();
            nodo.hijoIzquierdo.inicializar();
            nodo.hijoDerecho = new AVL();
            nodo.hijoDerecho.inicializar();
            System.out.println("Agrego:" + valor);
        } else if (nodo.raiz > valor) {
            nodo.hijoIzquierdo.agregar(valor);
            balancear(this);
        } else if (nodo.raiz < valor) {
            nodo.hijoDerecho.agregar(valor);
            balancear(this);
        }

    }

    public boolean arbolVacio() {
        return nodo == null;
    }

    public void eliminar(int valor) {
        if (nodo != null) {
            if (nodo.raiz == valor) {
                if (nodo.hijoIzquierdo.arbolVacio() && nodo.hijoDerecho.arbolVacio()) {
                    nodo = null;
                    System.out.println("Elimino:" + valor);
                } else if (!nodo.hijoIzquierdo.arbolVacio()) {
                    nodo.raiz = mayor(nodo.hijoIzquierdo);
                    nodo.hijoIzquierdo.eliminar(nodo.raiz);
                    balancear(this);
                } else {
                    nodo.raiz = menor(nodo.hijoDerecho);
                    nodo.hijoDerecho.eliminar(nodo.raiz);
                    balancear(this);
                }
            } else if (nodo.raiz > valor) {
                nodo.hijoIzquierdo.eliminar(valor);
                balancear(this);
            } else {
                nodo.hijoDerecho.eliminar(valor);
                balancear(this);
            }
        }

    }

    public AVL hijoDerecho() {
        return nodo.hijoDerecho;
    }

    public AVL hijoIzquierdo() {
        return nodo.hijoIzquierdo;
    }

    public void inicializar() {
        nodo = null;
    }

    public int raiz() {
        return nodo.raiz;
    }

    private int mayor(ABBTDA arbol) {
        int res;
        if (arbol.hijoDerecho().arbolVacio()) {
            res = arbol.raiz();
        } else {
            res = mayor(arbol.hijoDerecho());
        }

        return res;
    }

    private int menor(ABBTDA arbol) {
        int res;
        if (arbol.hijoIzquierdo().arbolVacio()) {
            res = arbol.raiz();
        } else {
            res = menor(arbol.hijoIzquierdo());
        }

        return res;
    }

    private int obtenerDA() {
        int alturaIzq = altura(hijoIzquierdo());
        int alturaDer = altura(hijoDerecho());
        return alturaDer - alturaIzq;
    }

    private int altura(ABBTDA arbol) {
        int altura = -1;
        if (!arbol.arbolVacio()) {
            if (arbol.hijoIzquierdo().arbolVacio() && arbol.hijoDerecho().arbolVacio()) {
                altura = 0;
            } else {
                int ai = altura(arbol.hijoIzquierdo());
                int ad = altura(arbol.hijoDerecho());
                if (ai > ad) {
                    altura = 1+ ai;
                }
                else {
                    altura = 1 + ad;
                }
            }
        }

        return altura;
    }

    private void balancear(AVL arbol) {
        if (arbol.obtenerDA() >= 2) {
            System.out.print("Rotacion ");
            if (arbol.hijoDerecho().obtenerDA() >= 0) {
                System.out.println("Simple a izquierda ");
                rotarIzquierda(arbol);
            } else {
                System.out.println("Doble derecha-izquierda");
                rotarDerecha(arbol.hijoDerecho());
                rotarIzquierda(arbol);
            }
        } else if (arbol.obtenerDA() <= -2) {
            System.out.print("Rotacion ");
            if (arbol.hijoIzquierdo().obtenerDA() <= 0) {
                System.out.println("Simple a derecha ");
                rotarDerecha(arbol);
            } else {
                System.out.println("Doble izquierda-derecha");
                rotarIzquierda(arbol.hijoIzquierdo());
                rotarDerecha(arbol);
            }
        }

    }

    private void rotarIzquierda(AVL arbol) {
        NodoAVL nuevoPadre = arbol.hijoDerecho().nodo;
        arbol.hijoDerecho().nodo = nuevoPadre.hijoIzquierdo.nodo;
        nuevoPadre.hijoIzquierdo.nodo = arbol.nodo;
        arbol.nodo = nuevoPadre;
    }

    private void rotarDerecha(AVL a) {
        NodoAVL nuevoPadre = a.hijoIzquierdo().nodo;
        a.hijoIzquierdo().nodo = nuevoPadre.hijoDerecho.nodo;
        nuevoPadre.hijoDerecho.nodo = a.nodo;
        a.nodo = nuevoPadre;
    }

    class NodoAVL {
        int raiz;
        AVL hijoIzquierdo;
        AVL hijoDerecho;

        NodoAVL() {
        }
    }
}
