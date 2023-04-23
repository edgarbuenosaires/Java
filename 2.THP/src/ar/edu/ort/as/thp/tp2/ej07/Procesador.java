package ar.edu.ort.as.thp.tp2.ej07;

public class Procesador {
	private String marca;
	private String modelo;
	private double nivelActualTemperatura;

	public Procesador() {
		this.marca = "";
		this.modelo = "";
		this.nivelActualTemperatura = 0;
	}

	public Procesador(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.nivelActualTemperatura = 0;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", nivelActualTemperatura="
				+ nivelActualTemperatura + "]";
	}

}
