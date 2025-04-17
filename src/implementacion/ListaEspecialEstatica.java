package implementacion;

import tda.ListaEspecialTDA;

public class ListaEspecialEstatica implements ListaEspecialTDA {

    private int cantidad;
    private int valores[];

    @Override
    public void inicializar() {
        valores = new int[100];
        cantidad = 0;
    }

    @Override
    public void alistar(int valor) {
        int acum = 0;
        int promedio = 0;
        if (cantidad == 0){
            valores[cantidad] = valor;
        }
        else {
            for (int i=0; i<cantidad; i++){
             acum += valores[i];
            }
            promedio = acum/(cantidad);
            if (valor >=promedio){
                valores[cantidad] = valor;
            }
            else{
                for (int actual = cantidad; actual>0 ; actual--) {
                    valores[actual] = valores[actual - 1];
                }
                valores[0]=valor;
            }
        }
        cantidad++;
    }

    @Override
    public void desalistar() {
        for (int actual = 0; actual<cantidad ; actual++) {
            valores[actual] = valores[actual + 1];
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
}
