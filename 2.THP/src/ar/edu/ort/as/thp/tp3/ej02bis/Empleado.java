package ar.edu.ort.as.thp.tp3.ej02bis;

public class Empleado {
	private String nombre;

	public Empleado(String nomEmpleado) {
		this.nombre = nomEmpleado;

	}

	public void mostrarEmpleado() {
		System.out.println(this.getNombre());

	}

	public String getNombre() {
		return this.nombre;
	}

}
