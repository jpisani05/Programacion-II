package tda;

public interface ConjuntoTDA {
    /***/
    public void inicializar();

    /**debe estar inicializada*/
    public void agregar(int valor);

    /**debe estar iniciazliada*/
    public void sacar(int valor);

    /**no debe estar vacia*/
    public int elegir();

    /**debe estar inicializada*/
    public boolean estaVacia();

    /**debe estar inicializada*/
    public boolean pertenece(int valor);
}
