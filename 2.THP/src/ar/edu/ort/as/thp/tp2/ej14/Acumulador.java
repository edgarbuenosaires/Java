package ar.edu.ort.as.thp.tp2.ej14;

public class Acumulador {
	private double valor;

	public void incrementar(double incrementar) {
		this.valor += incrementar;
	}

	public double obtenerValor() {
		return this.valor;
	}
}
