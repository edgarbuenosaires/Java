package ar.edu.ort.as.thp.tp2.ej14;

public class Promedio {

	// LOS ATRIBUTOS SON PROPIOS DE LA CLASE PROMEDIO
	private Contador contador;
	private Acumulador acumulador;

	// CONSTRUCTOR, SE INSTANCIAN LOS ATRIBUTOS PROPIOS
	public Promedio() {
		this.contador = new Contador();
		this.acumulador = new Acumulador();
	}

	public void incrementar(double nro) {
		this.contador.incrementar();
		this.acumulador.incrementar(nro);

	}

	public double obtenerValor() {
		double promedio = 0;
		if (this.contador.obtenerValor() != 0) {
			promedio = this.acumulador.obtenerValor() / this.contador.obtenerValor();
		}
		return promedio;
	}
}
