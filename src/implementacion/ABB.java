package implementacion;

import tda.ABBTDA;

public class ABB implements ABBTDA{

    class nodo{
        int valor;
        ABBTDA hijoIzquierdo;
        ABBTDA hijoDerecho;
    }

    private nodo raiz;


    @Override
    public void inicializar() {
        raiz = null;
    }

    @Override
    public int raiz() {
        return raiz.valor;
    }

    @Override
    public ABBTDA hijoIzquierdo() {
        return raiz.hijoIzquierdo;
    }

    @Override
    public ABBTDA hijoDerecho() {
        return raiz.hijoDerecho;
    }

    @Override
    public void agregar(int valor) {
        if(raiz == null){
            raiz = new nodo();
            raiz.valor = valor;
            raiz.hijoIzquierdo = new ABB();
            raiz.hijoIzquierdo.inicializar();
            raiz.hijoDerecho = new ABB();
            raiz.hijoDerecho.inicializar();
        }
        else {
            if(raiz.valor < valor){
                raiz.hijoDerecho.agregar(valor);
            }
            else {
                if(raiz.valor > valor){
                    raiz.hijoIzquierdo.agregar(valor);
                }
            }
        }
    }

    @Override
    public void eliminar(int valor) {
        if(raiz != null){
            if(raiz.valor == valor && raiz.hijoIzquierdo.arbolVacio() && raiz.hijoDerecho.arbolVacio()){
                raiz = null;
            }
            else {
                if (raiz.valor == valor && !raiz.hijoIzquierdo.arbolVacio()){
                    raiz.valor = this.mayor(raiz.hijoIzquierdo);
                    raiz.hijoIzquierdo.eliminar(raiz.valor);
                }
                else {
                    if (raiz.valor == valor && !raiz.hijoDerecho.arbolVacio()){
                        raiz.valor = this.menor(raiz.hijoDerecho);
                        raiz.hijoDerecho.eliminar(raiz.valor);
                    }
                }
            }
        }
        else {
            if (raiz.valor < valor){
                raiz.hijoDerecho.eliminar(valor);
            }
            else {
                raiz.hijoIzquierdo.eliminar(valor);
            }
        }
    }

    private int menor(ABBTDA arbol){
        if (arbol.hijoIzquierdo().arbolVacio()){
            return arbol.raiz();
        }
        else {
            return menor(arbol.hijoIzquierdo());
        }
    }

    private int mayor(ABBTDA arbol){
        if (arbol.hijoDerecho().arbolVacio()){
            return arbol.raiz();
        }
        else {
            return mayor(arbol.hijoIzquierdo());
        }
    }

    @Override
    public boolean arbolVacio() {
        return raiz==null;
    }
}
