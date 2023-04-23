package ar.edu.ort.as.thp.tp3.ej04;

import java.util.ArrayList;

public class Perchero {
	private ArrayList<Collar> collares;

	public Perchero() {
		this.collares = new ArrayList<Collar>();
	}

	public Collar obtenerCollar(String nomPerro) {
		Collar collar = null;
		Collar collarEncontrado = null;
		int i = 0;
		while (i < this.collares.size() && collarEncontrado == null) {
			collar = this.collares.get(i);
			if (collar.getChapita().equals(nomPerro)) {
				collarEncontrado = this.collares.remove(i);
			} else {
				i++;
			}
		}
		return collarEncontrado;
	}

	private boolean existeCollar(Collar collar) {
		int i = 0;
		boolean encontre = false;
		Collar collarActual;

		while (i < this.collares.size() && !encontre) {
			collarActual = this.collares.get(i);
			if (collarActual == collar) {
				encontre = true;
			} else {
				i++;
			}
		}
		return encontre;
	}

	public boolean agregarCollar(Collar collar) {
		boolean resultado = false;

		if (!this.existeCollar(collar)) {
			resultado = this.collares.add(collar);
		}
		return resultado;
	}

	@Override
	public String toString() {
		return "Perchero [collares=" + collares + "]";
	}

}
