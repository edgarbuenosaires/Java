package ar.edu.ort.as.thp.tp3.ej02bis;

import java.util.ArrayList;

public class Area {
	private String nombre;
	private ArrayList<Oficina> oficinas;

	public Area(String nomArea) {
		this.nombre = nomArea;
		this.oficinas = new ArrayList<Oficina>();
	}

	public void mostrarArea() {
		System.out.println("----------"+this.getNombre().toUpperCase()+"----------");
		for (Oficina oficina : oficinas) {
			oficina.mostrarOficina();
		}

	}

	public Oficina buscarOficina(String nomOficina) {
		int i = 0;
		Oficina oficinaBuscada;
		Oficina oficinaEncontrada = null;
		while (i < this.oficinas.size() && oficinaEncontrada == null) {
			oficinaBuscada = this.oficinas.get(i);
			if (oficinaBuscada.getNombre().equals(nomOficina)) {
				oficinaEncontrada = oficinaBuscada;
			} else {
				i++;
			}
		}
		return oficinaEncontrada;
	}

	public boolean agregarEmpleado(String nomEmpleado, Oficina oficinaBuscada) {
		boolean encontrada = false;
		Oficina oficina;

		oficina = this.buscarOficina(oficinaBuscada.getNombre());
		if (oficina != null) {
			encontrada = oficina.agregarEmpleado(nomEmpleado);
		}
		return encontrada;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void agregarOficina(Oficina oficina) {
		this.oficinas.add(oficina);
	}
}
