package tp1.tp3.ej13softwareTest;

import java.util.ArrayList;

public class Programa {
	private int orden;
	private String id;
	private String nombre;
	private String responsable;
	private boolean pasaPruebaUnitaria;
	private ArrayList<Fuente> fuentes;

	public Programa(int orden, String id, String nombre, String responsable, boolean pasaPruebaUnitaria) {
		super();
		this.orden = orden;
		this.id = id;
		this.nombre = nombre;
		this.responsable = responsable;
		this.pasaPruebaUnitaria = pasaPruebaUnitaria;
		this.fuentes = new ArrayList<>();
	}

	public double indicaDeCalidad() {
		double indice = 0;
		if (pasaPruebaUnitaria) {
			indice = this.promedioDeFuentes();
		}
		return indice;
	}

	private double promedioDeFuentes() {
		double acum = 0;
		for (Fuente f : fuentes) {
			acum = f.indiceDeCalidad();
		}
		return (acum / (fuentes.size() + 1));
	}

	public void mostrarDetalleDeMetodo(String nomMet) {
		// hacer
	}

	public ArrayList<Fuente> listadoFuentesMayoresAlPromedio() {
		// hacer
		return null;
	}

}
