package implementacion;

import tda.PilaTDA;

public class PilaEstatica implements PilaTDA {

    private int[] valores;
    private int cantidad;

    @Override
    public void iniciarlizar() {
        valores = new int[100];
        cantidad =0;
    
    }

    @Override
    public void apilar(int valor) {
        valores[cantidad] = valor;
        //cantidad = cantidad +1;
        cantidad++;

    }

    @Override
    public void desapilar() {
        cantidad--;
    }

    @Override
    public int tope() {
        return valores[cantidad-1];
    }

    @Override
    public boolean estaVacia() {
        return cantidad == 0;

    }
}
