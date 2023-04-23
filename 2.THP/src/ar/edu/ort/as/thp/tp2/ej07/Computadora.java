package ar.edu.ort.as.thp.tp2.ej07;

public class Computadora {
	private String marca;
	private Procesador procesador;
	private Lectora lectora;
	private TipoComputadora tipo;

	public Computadora(String marca, Procesador procesador, TipoComputadora tipo) {
		this.marca = marca;
		this.procesador = procesador;
		this.tipo = tipo;
		this.lectora = null;
	}

	@Override
	public String toString() {
		return "Computadora \n[marca=" + marca + ", \nprocesador=" + procesador + ", \nlectora=" + lectora + ", \ntipo=" + tipo
				+ "]";
	}

}
