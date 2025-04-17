package tda;

public interface ColaTDA {

    /***/
    public void inicializar();

    /**debe estar inicializada*/
    public void acolar(int valor);

    /**no debe estar vacia*/
    public void desacolar();

    /**no debe estar vacia*/
    public int primero();

    /**debe estar inicializada*/
    public boolean estaVacia();
}
