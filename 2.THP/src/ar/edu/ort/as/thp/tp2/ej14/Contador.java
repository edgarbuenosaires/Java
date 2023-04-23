package ar.edu.ort.as.thp.tp2.ej14;

public class Contador {
	private int valor;

	// CONSTRUCTORS
	public Contador() {
		this.valor = 0;
	}

	
	public void incrementar() {
		valor += 1;
	}

	public int obtenerValor() {
		return this.valor;
	}

}
