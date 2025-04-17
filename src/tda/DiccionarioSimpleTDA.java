package tda;

public interface DiccionarioSimpleTDA {

    public void inicializar();

    public void agregar(int clave, int valor);
    /* tiene que estar inicializada**/

    public void  eliminar(int clave);
    /* tiene que estar inicializada**/

    public int recuperar(int clave);
    /*no tiene que estar vacia y tiene que existir la clave**/

    public ConjuntoTDA obtenerClaves();
    /* tiene que estar inicializada**/

}
