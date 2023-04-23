package ar.edu.ort.as.thp.tp3.ej02;

public class Empleado {
	private String nombre;
	private String apellido;

	public Empleado(String nombre, String apellido) {

		this.nombre = nombre;
		this.apellido = apellido;
	}

	public void mostrarDatos() {
		System.out.println(this.nombre + " " + this.apellido);

	}

	public boolean mismoNombreCompleto(String nombre, String apellido) {
		boolean resultado = false;
		if (this.nombre.equals(nombre) && this.apellido.equals(apellido)) {
			resultado = true;
		}
		return resultado;
	}
	
	@Override
	public String toString() {
		return this.nombre + " " + this.apellido;
	}
}
