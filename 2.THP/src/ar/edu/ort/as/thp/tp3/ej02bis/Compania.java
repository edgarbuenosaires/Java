package ar.edu.ort.as.thp.tp3.ej02bis;

import java.util.ArrayList;

public class Compania {
	private String nombre;
	private ArrayList<Area> areas;

	public Compania(String nomCompania) {
		this.nombre = nomCompania;
		this.areas = new ArrayList<Area>();
	}

	public void mostrarCompania() {
		System.out.println("<<<<<<<<<"+this.nombre.toUpperCase()+">>>>>>>>>>");
		for (Area area : areas) {
			area.mostrarArea();
		}
	}

	public Area buscarArea(String nomArea) {
		int i = 0;
		Area areaEncontrada = null;
		Area areaBuscada;
		while (i <= this.areas.size() && areaEncontrada == null) {
			areaBuscada = this.areas.get(i);
			if (areaBuscada.getNombre().equals(nomArea)) {
				areaEncontrada = areaBuscada;
			} else {
				i++;
			}
		}
		return areaEncontrada;
	}

	public boolean agregarEmpleado(String nomEmpleado, Area areaBuscada, Oficina oficinaBuscada) {
		Area area = null;
		boolean encontrada = false;

		area = this.buscarArea((String) areaBuscada.getNombre());
		if (area != null) {
			encontrada = area.agregarEmpleado(nomEmpleado, oficinaBuscada);

		}
		return encontrada;

	}

	public void agregarArea(Area area) {
		this.areas.add(area);
	}
}
