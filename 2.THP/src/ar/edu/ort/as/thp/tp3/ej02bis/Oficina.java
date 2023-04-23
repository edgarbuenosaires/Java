package ar.edu.ort.as.thp.tp3.ej02bis;

import java.util.ArrayList;

public class Oficina {

	private String nombre;
	private ArrayList<Empleado> empleados;

	public Oficina(String nomOficina) {
		this.nombre = nomOficina;
		this.empleados = new ArrayList<Empleado>();
	}

	public void mostrarOficina() {
		System.out.println("[[[[[[[[[["+this.getNombre().toUpperCase()+"]]]]]]]]]]");
		for (Empleado empleado : empleados) {
			empleado.mostrarEmpleado();
		}

	}

	public boolean agregarEmpleado(String nomEmpleado) {
		Empleado empleado;
		empleado = new Empleado(nomEmpleado);
		this.empleados.add(empleado);
		return true;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
}
