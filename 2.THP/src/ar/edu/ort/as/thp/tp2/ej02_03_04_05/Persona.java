package ar.edu.ort.as.thp.tp2.ej02_03_04_05;

public class Persona {
	private String nombre;
	private String apellido;
	private Domicilio domicilio;

	public Persona() {
		// Constructor sin parametros:
		this.nombre = "";
		this.apellido = "";
	}

	public Persona(String nombre, String apellido) {
		// Constructor con parametros:
		// Seteo con doble encapsulamiento, queda en UperCase
		this.ponerNombre(nombre);
		this.ponerApellido(apellido);
	}

	public String obtenerNombre() {
		return nombre;
	}

	public void ponerNombre(String nombre) {
		this.nombre = nombre.toUpperCase();
	}

	public String obtenerApellido() {
		return apellido;
	}

	public void ponerApellido(String apellido) {
		this.apellido = apellido.toUpperCase();
	}

	public String obtenerNombreCompleto() {
		return this.obtenerNombre() + " " + this.obtenerApellido();
	}

	public void mostrarNombreCompleto() {
		System.out.println(this.obtenerNombreCompleto());
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public void mostrarDomicilio() {
		if (this.domicilio != null) {
			domicilio.mostrar();
		} else {
			System.out.println("Vivo en la calle!");
		}

	}
}
