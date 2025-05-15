package tda;

public interface ABBTDA {

    public void inicializar();

    /**inicializado y no vacio*/
    public int raiz();

    public ABBTDA hijoIzquierdo();

    public ABBTDA hijoDerecho();

    public void agregar(int valor);

    public void eliminar (int valor);

    public boolean arbolVacio();

}
