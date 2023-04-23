package ar.edu.ort.as.thp.tp3.ej04;

import java.util.ArrayList;

public class Duenio {
	private String nombre;
	private ArrayList<Perro> perros;
	private Perchero perchero;

	public Duenio(String nombre) {
		this.nombre = nombre;
		this.perros = new ArrayList<Perro>();
		this.perchero = null;
	}

	public Duenio(String nombre, Perchero perchero) {
		super();
		this.nombre = nombre;
		this.perros = new ArrayList<Perro>();
		this.perchero = perchero;
	}

	public void setPerchero(Perchero perchero) {
		this.perchero = perchero;
	}

	private Perro buscarPerro(String nomPerro) {
		Perro perro;
		Perro perroEncontrado = null;
		int i = 0;
		while (i < this.perros.size() && perroEncontrado == null) {
			perro = this.perros.get(i);
			if (perro.getNombre().equals(nomPerro)) {
				perroEncontrado = perro;
			} else {
				i++;
			}
		}
		return perroEncontrado;
	}

	public ResultadoPreparar prepararPaseo(String nomPerro) {
		ResultadoPreparar resultado = ResultadoPreparar.OK;
		Perro perro;
		Collar collar;

		perro = this.buscarPerro(nomPerro);
		if (perro != null) {
			collar = this.perchero.obtenerCollar(nomPerro);
			if (collar == null) {
				perro.ponerCollar(collar);
			} else {
				resultado = ResultadoPreparar.COLLAR_INEXISTENTE;
			}
		} else {
			resultado = ResultadoPreparar.PERRO_INEXISTENTE;
		}
		return resultado;

	}

	private boolean existePerro(Perro perro) {
		int i = 0;
		boolean encontre = false;
		Perro perroActual;

		while (i < this.perros.size() && !encontre) {
			perroActual = this.perros.get(i);
			if (perroActual == perro) {
				encontre = true;
			} else {
				i++;
			}
		}
		return encontre;
	}

	public boolean agregarPerro(Perro perro) {
		boolean resultado = false;

		if (!this.existePerro(perro)) {
			resultado = this.perros.add(perro);
		}
		return resultado;
	}

	@Override
	public String toString() {
		return "Duenio [nombre=" + nombre + ", perros=" + perros + ", perchero=" + perchero + "]";
	}

}
