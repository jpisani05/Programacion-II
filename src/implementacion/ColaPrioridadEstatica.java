package implementacion;

import tda.ColaPrioridadTDA;

public class ColaPrioridadEstatica implements ColaPrioridadTDA {

    private int[] valores;
    private int[] prioridades;
    private int cantidad;

    @Override
    public void inicializar() {
        valores = new int[100];
        prioridades = new int[100];
        cantidad = 0;
    }

    @Override
    public void acolar(int valor, int prioridad) {
        int nuevoValor = cantidad;
        for(int i=0;i<cantidad;i++) {
            if (prioridad>prioridades[i]) {
                nuevoValor = i;
                i = cantidad;
            }
        }
        System.out.println(nuevoValor);
        System.out.println(prioridad);
        for(int i=cantidad-1;i>=nuevoValor;i--) {
            valores[i+1] = valores[i];
            prioridades[i+1] = prioridades[i];
        }
        valores[nuevoValor] = valor;
        prioridades[nuevoValor]= prioridad;
        cantidad++;
    }

    @Override
    public void desacolar() {
        for (int actual = 0; actual<cantidad ; actual++) {
            valores[actual] = valores[actual + 1];
            prioridades[actual] = prioridades[actual+1];
        }
        cantidad--;
    }

    @Override
    public int primero() {
        return valores[0];
    }

    @Override
    public boolean estaVacia() {
        return cantidad == 0;
    }

    @Override
    public int prioridad() {
        return prioridades[0];
    }
}
