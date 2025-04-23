package implementacion;

import tda.PilaTDA;

public class PilaDinamica implements PilaTDA {

	class nodo{
		int valor;
		nodo siguiente;
	}
	
	private nodo primero;
	
	public void inicializar() {
		primero = null;
	}
	
	public void apilar(int valor) {
		nodo aux = new nodo();
		aux.valor = valor;
		aux.siguiente = primero;
		primero = aux;
	}
	
	public void desapilar() {
		primero = primero.siguiente;
	}

	public int tope() {
		return primero.valor;
	}

	public boolean estaVacia() {
		return primero == null;
	}

}
