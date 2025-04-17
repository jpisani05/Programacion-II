package tda;

public interface ListaEspecialTDA {

    /***/
    public void inicializar();

    /**debe estar inicializada*/
    public void alistar(int valor);

    /**no debe estar vacia*/
    public void desalistar();

    /**no debe estar vacia*/
    public int primero();

    /**debe estar inicializada*/
    public boolean estaVacia();

}
