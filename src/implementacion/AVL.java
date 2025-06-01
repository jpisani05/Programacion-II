package implementacion;

import tda.ABBTDA;

public class AVL implements ABBTDA {

    class NodoAVL {
        int valor;
        AVL hijoIzquierdo;
        AVL hijoDerecho;
    }

    private NodoAVL raiz;

    public void agregar(int valor) {
        if (raiz == null) {
            raiz = new NodoAVL();
            raiz.valor = valor;
            raiz.hijoIzquierdo = new AVL();
            raiz.hijoIzquierdo.inicializar();
            raiz.hijoDerecho = new AVL();
            raiz.hijoDerecho.inicializar();
        } else if (raiz.valor > valor) {
            raiz.hijoIzquierdo.agregar(valor);
            balancear(this);
        } else if (raiz.valor < valor) {
            raiz.hijoDerecho.agregar(valor);
            balancear(this);
        }

    }

    //O(1)
    public boolean arbolVacio() {
        return raiz == null;
    }

    public void eliminar(int valor) {
        if (raiz != null) {
            if (raiz.valor == valor) {
                if (raiz.hijoIzquierdo.arbolVacio() && raiz.hijoDerecho.arbolVacio()) {
                    raiz = null;
                } else if (!raiz.hijoIzquierdo.arbolVacio()) {
                    raiz.valor = mayor(raiz.hijoIzquierdo);
                    raiz.hijoIzquierdo.eliminar(raiz.valor);
                    balancear(this);
                } else {
                    raiz.valor = menor(raiz.hijoDerecho);
                    raiz.hijoDerecho.eliminar(raiz.valor);
                    balancear(this);
                }
            } else if (raiz.valor > valor) {
                raiz.hijoIzquierdo.eliminar(valor);
                balancear(this);
            } else {
                raiz.hijoDerecho.eliminar(valor);
                balancear(this);
            }
        }

    }


    //O(1)
    public AVL hijoDerecho() {
        return raiz.hijoDerecho;
    }

    //O(1)
    public AVL hijoIzquierdo() {
        return raiz.hijoIzquierdo;
    }

    //O(1)
    public void inicializar() {
        raiz = null;
    }

    //O(1)
    public int raiz() {
        return raiz.valor;
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

    //O(1)
    private void rotarIzquierda(AVL arbol) {
        NodoAVL nuevoPadre = arbol.hijoDerecho().raiz;
        arbol.hijoDerecho().raiz = nuevoPadre.hijoIzquierdo.raiz;
        nuevoPadre.hijoIzquierdo.raiz = arbol.raiz;
        arbol.raiz = nuevoPadre;
    }

    //O(1)
    private void rotarDerecha(AVL arbol) {
        NodoAVL nuevoPadre = arbol.hijoIzquierdo().raiz;
        arbol.hijoIzquierdo().raiz = nuevoPadre.hijoDerecho.raiz;
        nuevoPadre.hijoDerecho.raiz = arbol.raiz;
        arbol.raiz = nuevoPadre;
    }


}
