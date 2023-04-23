package ar.edu.ort.as.thp.tp3.ej02;

import java.util.ArrayList;

public class Oficina {
	private int nro;
	private ArrayList<Empleado> empleados;


	public Oficina(int nro) {
		this.nro = nro;
		this.empleados = new ArrayList<Empleado>();

	}


	public void agregarEmpleado(String nombre, String apellido) {
		Empleado empleado;
		empleado = this.buscarEmpleado(nombre, apellido);
		if (empleado == null) {
			empleado = new Empleado(nombre, apellido);
			this.empleados.add(empleado);
		}
	}

	@Override
	public String toString() {
		return "Oficina  " + nro + " " + empleados;
	}

	public void mostrarDatos() {
		System.out.println("Oficina numero: " + this.nro);
		this.recorrerEmpleados();
	}

	private void recorrerEmpleados() {
		// CON FOR EACH
		// for (Empleado empleado : empleados) {
		// mostrarDatos();
		// }

		for (int i = 0; i < this.empleados.size(); i++) {
			empleados.get(i).mostrarDatos();
		}
	}

	private Empleado buscarEmpleado(String nombre, String apellido) {
		Empleado empleado = null;
		boolean encontre = false;
		int i = 0;
		while (i < this.empleados.size() && !encontre) {
			empleado = this.empleados.get(i);
			if (empleado.mismoNombreCompleto(nombre, apellido)) {
				encontre = true;
			} else {
				i++;
			}
		}
		return empleado;

	}

	public boolean existeEmpleado(String nombre, String apellido) {
		boolean resultado = false;

		if (this.buscarEmpleado(nombre, apellido) != null) {
			resultado = true;
		}
		return resultado;
	}


	public int getNro() {
		return nro;
	}



}
