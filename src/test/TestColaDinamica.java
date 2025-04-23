package test;

import tda.ColaTDA;
import implementacion.ColaDinamica;
import algoritmo.AlgoritmoCola;
public class TestColaDinamica {

	public static void main(String[] args) {
		ColaTDA origen = new ColaDinamica();
		origen.inicializar();
		origen.acolar(17);
		origen.acolar(19);
		origen.acolar(23);
		origen.acolar(29);
		AlgoritmoCola a = new AlgoritmoCola();
		a.mostrarCola(origen);
	}

}
