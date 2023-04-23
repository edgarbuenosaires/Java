package ar.edu.ort.as.thp.tp3.ej02;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Area> areas;

	public Empresa(String nombre) {
		this.nombre = nombre;
		this.areas = new ArrayList<Area>();
	}

	public void listarEmpleados() {
		this.mostrarDatos();
		this.recorrerAreas();
	}

	private void mostrarDatos() {
		System.out.println("Compania: " + this.nombre);
	}

	private void recorrerAreas() {
		Area area;
		int i = 0;
		while (i < this.areas.size()) {
			area = this.areas.get(i);
			area.mostrarDatos();
			i++;
		}
	}

	public void agregarArea(String nombre) {
		Area area = null;
		;
		area = this.buscarArea(nombre);
		if (area == null) {
			this.areas.add(area);
		}
	}

	public void agregarEmpleado(String areaNom, int oficinaNum, String nombre, String apellido) {
		Area area;
		area = this.buscarArea(areaNom);
		if (area == null) {
			this.agregarArea(areaNom);
		}
		;

	}

	public void agregarOficina(String areaNom, int oficinaNum) {
		Area area;
		area = this.buscarArea(areaNom);
		area.agregarOficina(oficinaNum);
	}

	private Area buscarArea(String areaNom) {
		int i = 0;
		Area area;
		Area areaEncontrada = null;
		boolean encontre = false;

		while (i < this.areas.size() && !encontre) {
			area = this.areas.get(i);
			if (area.getNombre().equals(areaNom)) {
				encontre = true;
				areaEncontrada = area;
			} else {
				i++;
			}
		}
		return areaEncontrada;
	}

	public boolean existeEmpleado(String nombre, String apellido) {
		boolean existe = false;
		for (Area area : areas) {
			area.existeEmpleado(nombre, apellido);
			if (area != null) {
				existe = true;
			}
		}
		return existe;
	}
}
