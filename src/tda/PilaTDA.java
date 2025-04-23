package tda;

public interface PilaTDA {

    /**Este metodo inicizaliza la estructura*/
    public void inicializar();

    /**debe estar inicializada*/
    public void apilar (int valor);

    /**no tiene que estar vacia*/
    public void desapilar();

    /**no tiene que estar vacia*/
    public int tope();

    /**debe estar inicializada*/
    public boolean estaVacia();

}
