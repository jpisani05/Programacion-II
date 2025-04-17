package tda;

public interface ColaPrioridadTDA {

    /***/
    public void inicializar();

    /**debe estar inicializada*/
    public void acolar(int valor, int prioridad);

    /**no debe estar vacia*/
    public void desacolar();

    /**no debe estar vacia*/
    public int primero();

    /**debe estar inicializada*/
    public boolean estaVacia();

    /**no debe estar vacia*/
    public int prioridad();

}
