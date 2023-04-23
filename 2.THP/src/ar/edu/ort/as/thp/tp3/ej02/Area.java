package ar.edu.ort.as.thp.tp3.ej02;

import java.util.ArrayList;

public class Area {
	private String nombre;
	private ArrayList<Oficina> oficinas;

	public Area(String nombre) {
		this.nombre = nombre;
		this.oficinas = new ArrayList<Oficina>();

	}

	@Override
	public String toString() {
		return "Area " + this.nombre;
	}

	public void mostrarDatos() {
		System.out.println("Area: " + this.nombre);
		this.recorrerOficinas();

	}

	private void recorrerOficinas() {
		int i = 0;
		Oficina oficina;
		while (i < this.oficinas.size()) {
			oficina = this.oficinas.get(i);
			oficina.mostrarDatos();
			i++;
		}
	}

	public void agregarEmpleado(int ofiNro, String nombre, String apellido) {
		Oficina oficina;
		oficina = this.buscarOficina(ofiNro);
		if (oficina.getNro() == ofiNro) {
			oficina.agregarEmpleado(nombre, apellido);
		}

	}

	public void agregarOficina(int ofiNro) {
		Oficina oficina;
		oficina = this.buscarOficina(ofiNro);
		if (oficina == null) {
			this.oficinas.add(oficina);
		}
	}

	private Oficina buscarOficina(int ofiNro) {
		Oficina oficina;
		Oficina oficinaEncontrada = null;
		boolean encontre = false;
		int i = 0;
		while (i < this.oficinas.size() && !encontre) {
			oficina = this.oficinas.get(i);
			if (oficina.getNro() == ofiNro) {
				oficinaEncontrada = oficina;
				encontre = true;
			}
			i++;
		}
		return oficinaEncontrada;
	}

	public boolean existeEmpleado(String nombre, String apellido) {
		boolean resultado = false;
		for (Oficina oficina : oficinas) {
			if (oficina.existeEmpleado(nombre, apellido)) {
				resultado = true;
			}
		}
		return resultado;
	}

	public String getNombre() {
		return nombre;
	}

}
