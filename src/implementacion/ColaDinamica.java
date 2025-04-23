package implementacion;

import tda.ColaTDA;

public class ColaDinamica implements ColaTDA {
	
	class nodo{
		int valor;
		nodo siguiente;
	}
	private nodo primero;
	private nodo ultimo;
	
	public void inicializar() {
		primero = null;
		ultimo = null;
	}

	public void acolar(int valor) {
		nodo aux = new nodo();
		aux.valor = valor;
		if(primero == null) {
			primero = aux;
			ultimo = aux;
			aux.siguiente = null;
		} else {
			ultimo.siguiente = aux;
			ultimo = aux;
		}
	}

	public void desacolar() {
		primero = primero.siguiente;
		if(primero == null) {
			ultimo = null;
		}
	}

	public int primero() {
		return primero.valor;
	}

	public boolean estaVacia() {
		return primero == null;
	}

}
